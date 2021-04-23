package com.lys.service;

import com.lys.po.User;

public interface UserService {
    User checkUser(String username, String password);
}
