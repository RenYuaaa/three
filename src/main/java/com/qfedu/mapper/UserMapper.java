package com.qfedu.mapper;

import com.qfedu.pojo.User;

import javax.servlet.http.HttpSession;
import java.util.List;

public interface UserMapper {

    int isLogin(User user);

    void saveUser(User user);

    int getEmail(User user);

    User selectUserByEmail(String userAccount);

    void updateProfile(User user);

    User selectByEmail(String userAccount);

    void updatePassword(User user);

    int validatePassword(User user);

    void updateUserImageByEmail(User user);

    void updateUserValidateCodeByEmail(User user);

    int validateEmailCode(User user);

    void resetPassword(User user);

}
