package com.lys.service;

import com.lys.dao.UserRepository;
import com.lys.po.User;
import com.lys.util.MD5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRespository;

    @Override
    public User checkUser(String username, String password) {
        User user = userRespository.findByUsernameAndPassword(username, MD5Utils.code(password));
        return user;
    }
}
