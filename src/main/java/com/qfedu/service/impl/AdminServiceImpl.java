package com.qfedu.service.impl;

import com.qfedu.mapper.AdminMapper;
import com.qfedu.pojo.Admin;
import com.qfedu.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminServiceImpl implements AdminService{

    @Autowired
    AdminMapper adminMapper;

    @Override
    public boolean validateLogin(Admin admin) {

        int result = adminMapper.isLogin(admin);

        return result > 0 ? true : false;

    }
}
