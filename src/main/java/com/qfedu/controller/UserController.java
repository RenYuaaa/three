package com.qfedu.controller;

import com.qfedu.pojo.User;
import com.qfedu.service.UserService;
import com.qfedu.utils.ImageCut;
import com.qfedu.utils.MailUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.UUID;

@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;

    @Value("${IMAGE_DIR}")
    String imageDir;
    @Value("${IMAGE_URL}")
    String imageURL;


    /**
     * 登录
     * @param user
     * @param session
     * @return
     */
    @RequestMapping("/loginUser.action")
    @ResponseBody
    public String login(User user, HttpSession session) {
        boolean result = userService.validateLogin(user);
        if (result) {
            session.setAttribute("userAccount", user.getEmail());
            return "success";
        } else {
            return "fail";
        }
    }

    /**
     * 注册成功
     * @param user
     * @return
     */
    @RequestMapping("/insertUser.action")
    @ResponseBody
    public String loginUser(User user) {
        userService.loginUser(user);
        return "success";
    }

    /**
     * 验证邮箱是否存在
     * @param user
     * @return
     */
    @RequestMapping("/validateEmail.action")
    @ResponseBody
    public String validateEmail(User user) {
        boolean result = userService.validateEmail(user);
        if (result) {
            return "success";
        } else {
            return "fail";
        }
    }

    /**
     * 点击邮箱名进入个人中心页面
     * @param session
     * @return
     */
    @RequestMapping("/showMyProfile")
    public String showMyProfile(HttpSession session, Model model) {
        String userAccount = (String) session.getAttribute("userAccount");
        User user = userService.selectUserByEmail(userAccount);
        user.setImgUrl(imageURL + user.getImgUrl());
        model.addAttribute("user", user);
        return "before/my_profile";
    }

    /**
     * 更新资料页面展示数据
     * @param model
     * @param session
     * @return
     */
    @RequestMapping("/changeProfile")
    public String selectProfileByEmail(Model model, HttpSession session) {
        String userAccount = (String) session.getAttribute("userAccount");
        User user1 = userService.selectByEmail(userAccount);
        user1.setImgUrl(imageURL + user1.getImgUrl());
        model.addAttribute("user", user1);
        return "before/change_profile";
    }

    /**
     * 更新资料
     * @param user
     * @return
     */
    @RequestMapping("/updateUser.action")
    public String updateProfile(User user) {
        userService.updateProfile(user);
        return "redirect:showMyProfile";
    }

    /**
     * 修改密码页面
     * @return
     */
    @RequestMapping("/passwordSafe")
    public String passwordSafe(Model model, HttpSession session) {
        String userAccount = (String) session.getAttribute("userAccount");
        User user1 = userService.selectByEmail(userAccount);
        user1.setImgUrl(imageURL + user1.getImgUrl());
        model.addAttribute("user", user1);
        return "before/password_safe";
    }

    /**
     * ajax判断原密码是否正确
     * @param
     * @return
     */
    @RequestMapping("/validatePassword")
    @ResponseBody
    public String validatePassword(HttpSession session, User user) {
        String userAccount = (String) session.getAttribute("userAccount");
        user.setEmail(userAccount);
        boolean result = userService.validatePassword(user);
        if (result) {
            return "success";
        } else {
            return "fail";
        }
    }

    /**
     * 修改密码
     * @param session
     * @param user
     * @return
     */
    @RequestMapping("/updatePassword.action")
    public String updatePassword(HttpSession session, User user) {
        String userAccount = (String) session.getAttribute("userAccount");
        user.setEmail(userAccount);
        userService.updatePassword(user);
        return "redirect:showMyProfile";
    }

    /**
     * 更改头像页面
     * @param session
     * @param model
     * @return
     */
    @RequestMapping("/changeAvatar.action")
    public String changeAvatar(HttpSession session, Model model) {
        String userAccount = (String) session.getAttribute("userAccount");
        User user1 = userService.selectByEmail(userAccount);

        //将已经传入数据库的照片数据传入页面
        user1.setImgUrl(imageURL + user1.getImgUrl());
        System.out.println(user1.getImgUrl());
        model.addAttribute("user", user1);
        return "before/change_avatar";
    }

    /**
     * 上传头像
     * @param image_file
     * @param request
     * @param session
     * @return
     */
    @RequestMapping("/upLoadImage.action")
    public String upLoadImage(MultipartFile image_file, HttpServletRequest request, HttpSession session) {

        //此处是上传的图片选择的大小的坐标值
        String x1 = request.getParameter("x1");
        String x2 = request.getParameter("x2");
        String y1 = request.getParameter("y1");
        String y2 = request.getParameter("y2");

        //给上传的图片取一个不会重复的新名字
        String oldFileName = image_file.getOriginalFilename();
        String suffixName = oldFileName.substring(oldFileName.lastIndexOf("."));
        String newFileName = UUID.randomUUID().toString().replace("-", "") + suffixName;

        //为了将图片归类，以时间的形式创建文件夹
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String dirName = dateFormat.format(date);
        String targetName = imageDir + dirName;
        File file = new File(targetName);
        if (!file.exists()) {
            file.mkdirs();
        }
        try {
            image_file.transferTo(new File(targetName, newFileName));
            System.out.println(targetName);
            System.out.println(newFileName);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //图片切割（选择大小）
        float x1val = 0, x2val = 0, y1val = 0, y2val = 0, width = 0, height = 0;

        if (null != x1 && !x1.equals("")) {
            x1val = Float.parseFloat(x1);
            x2val = Float.parseFloat(x2);
            y1val = Float.parseFloat(y1);
            y2val = Float.parseFloat(y2);
            width = x2val - x1val;
            height = y2val - y1val;
            ImageCut imageCut = new ImageCut();
            imageCut.cutImage(targetName + "\\" + newFileName, (int)x1val, (int)y1val, (int)width, (int)height);
        }

        String userAccount = (String) session.getAttribute("userAccount");
        userService.updateUserImageByEmail(dirName + "/" + newFileName, userAccount);

        return "redirect:showMyProfile";
    }

    /**
     * 跳转到忘记密码页面
     * @return
     */
    @RequestMapping("/forgetPassword.action")
    public String forgetPassword() {
        return "before/forget_password";
    }

    /**
     * 发送邮件
     * @param email
     * @return
     */
    @RequestMapping("/sendEmail.action")
    @ResponseBody
    public String sendEmail(String email) {
        //这里是利用MailUtils工具类，获取6位数的随机验证码


        String validateCode = MailUtils.getValidateCode(6);
        MailUtils.sendMail(email, "您好:<br/>您本次的验证码是" + validateCode + ",请于两小时内输入，否则失效。", "Y先生学习网忘记密码验证码邮件");
        User user = new User();
        user.setEmail(email);
        user.setCode(validateCode);
        userService.updateUserValidateCodeByEmail(user);
        return "success";
    }

    @RequestMapping("/validateEmailCode.action")
    public String validateEmailCode(User user, Model model) {
        boolean result = userService.validateEmailCode(user);
        if (result) {

            model.addAttribute("email",user.getEmail());
            return "before/reset_password";
        } else {
            return "before/forget_password";
        }
    }

    /**
     * 重置密码页面
     * @param user
     * @return
     */
    @RequestMapping("/resetPassword.action")
    public String resetPassword(User user) {
        userService.resetPassword(user);
        return "redirect:../index.jsp";
    }

    /**
     * 退出
     * @param session
     * @return
     */
    @RequestMapping("/loginOut.action")
    public String loginOut(HttpSession session) {
        session.removeAttribute("userAccount");
        return "redirect:../index.jsp";
    }

}
