package com.qfedu.service.impl;

import com.qfedu.mapper.UserMapper;
import com.qfedu.pojo.User;
import com.qfedu.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserMapper userMapper;

    @Override
    public boolean validateLogin(User user) {

        int result = userMapper.isLogin(user);

        return result > 0 ? true : false;
    }

    @Override
    public void loginUser(User user) {

        userMapper.saveUser(user);
    }

    @Override
    public boolean validateEmail(User user) {

        int result = userMapper.getEmail(user);
        return result > 0 ? false : true;
    }

    @Override
    public User selectUserByEmail(String userAccount) {
        User user = userMapper.selectUserByEmail(userAccount);
        return user;
    }

    @Override
    public void updateProfile(User user) {
        userMapper.updateProfile(user);
    }

    @Override
    public User selectByEmail(String userAccount) {
        User user = userMapper.selectByEmail(userAccount);
        return user;
    }

    @Override
    public void updatePassword(User user) {
        userMapper.updatePassword(user);
    }

    @Override
    public boolean validatePassword(User user) {
        int result = userMapper.validatePassword(user);
        return result > 0 ? true : false;
    }

    @Override
    public void updateUserImageByEmail(String fileName, String userAccount) {
        User user = new User();
        user.setImgUrl(fileName);
        user.setEmail(userAccount);
        userMapper.updateUserImageByEmail(user);
    }

    @Override
    public void updateUserValidateCodeByEmail(User user) {
        userMapper.updateUserValidateCodeByEmail(user);
    }

    @Override
    public boolean validateEmailCode(User user) {
        int result = userMapper.validateEmailCode(user);
        return result > 0 ? true : false;
    }

    @Override
    public void resetPassword(User user) {
        userMapper.resetPassword(user);
    }

}
