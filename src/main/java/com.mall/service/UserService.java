package com.mall.service;

import com.mall.pojo.User;
import com.mall.dao.UserMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service("UserService")
public class UserService {
  @Resource
  private UserMapper userMapper;

  public User getUser(Integer id) {
    User user = userMapper.selectUser(id);
    return user;
  }

  public Integer getId(Integer id) {

    if(id == null) {
      return 0;
    }
    return id;
  }
}
