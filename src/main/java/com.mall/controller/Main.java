package com.mall.controller;

import com.mall.pojo.User;
import com.mall.service.UserService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class Main {
  @Resource
  UserService userService;

  @RequestMapping("/")
  @ResponseBody
  public String index() {
    return "hello world";
  }

  @RequestMapping(value = "/getUser/{id}", method = RequestMethod.GET)
  @ResponseBody
  public User getUser(Integer id) {
    return userService.getUser(id);
  }


}
