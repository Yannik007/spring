package com.spring.service.impl;

import com.spring.dao.UserDao;
import com.spring.entity.User;
import com.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    public User insertUser(User user) throws Exception {
        return userDao.save(user);
    }

    public List<User> getUser() throws Exception {
        return userDao.findAll();
    }
}
