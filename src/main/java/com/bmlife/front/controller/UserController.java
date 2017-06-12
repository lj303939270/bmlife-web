package com.bmlife.front.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bmlife.front.domain.UserInfo;
import com.bmlife.front.service.UserService;

@RequestMapping("/manage")
@RestController
public class UserController {

	Logger logger = Logger.getLogger(this.getClass());
	
    @RequestMapping("/user/regist")
    public String userRegist(@ModelAttribute UserInfo userInfo) {
        return "Hello World";
    }

}