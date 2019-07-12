package com.qfedu.controller;

import com.qfedu.pojo.Course;
import com.qfedu.pojo.Speaker;
import com.qfedu.service.ClassService;
import com.qfedu.service.TeacherService;
import com.qfedu.utils.Page;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class TeacherController {

    @Autowired
    TeacherService teacherService;
    @Autowired
    ClassService classService;

    /**
     * 展示主讲人信息
     *
     * @param model
     * @return
     */
    @RequestMapping("/personManager")
    public String personManager(Model model, Speaker speaker) {
        speaker.setBegin((speaker.getPage() - 1) * speaker.getRows() );
        List<Speaker> speakers1 = teacherService.selectAllSpeaker(speaker);
        List<Speaker> speakers = teacherService.selectAllTeacher();

        Page<Speaker> page = new Page<Speaker>();
        page.setPage(speaker.getPage());
        page.setSize(speaker.getRows());
        page.setTotal(teacherService.getCount(speaker));
        page.setRows(speakers1);
        model.addAttribute("page", page);

        System.out.println("我进入到了主讲人管理界面了");
        return "personManager";
    }

    /**
     * 删除主讲人信息
     *
     * @param id
     * @return
     */
    @RequestMapping("/deleteTeacher")
    public String deleteTeacher(int id) {
        teacherService.deleteTeacher(id);
        return "redirect:personManager";
    }

    /**
     * 添加主讲人信息
     *
     * @return
     */
    @RequestMapping("/addTeacher")
    public String addTeacher() {
        System.out.println("我进到addTeacher里面了");
        return "addTeacher";
    }

    @RequestMapping("/saveOrUpdateTeacher")
    public String saveOrUpdateTeacher(Speaker speaker){
        teacherService.saveOrUpdate(speaker);
        return "redirect:personManager";
    }

    @RequestMapping("/editTeacher")
    public String editTeacher(int id, Model model) {
        Speaker speaker = teacherService.getSpeakerById(id);
        System.out.println(speaker);
        model.addAttribute("speaker", speaker);

        List<Course> courses = classService.selectAllClass();
        model.addAttribute("courseList", courses);

        return "addTeacher";
    }
}
