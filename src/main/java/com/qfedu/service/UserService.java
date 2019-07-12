package com.qfedu.service;

import com.qfedu.pojo.User;

import javax.servlet.http.HttpSession;
import java.util.List;

public interface UserService {

    boolean validateLogin(User user);

    void loginUser(User user);

    boolean validateEmail(User user);

    User selectUserByEmail(String userAccount);

    void updateProfile(User user);

    User selectByEmail(String userAccount);

    void updatePassword(User user);

    boolean validatePassword(User user);

    void updateUserImageByEmail(String fileName, String userAccount);

    void updateUserValidateCodeByEmail(User user);

    boolean validateEmailCode(User user);

    void resetPassword(User user);

}
