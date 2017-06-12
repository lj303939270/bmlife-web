package com.bmlife.manage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.bmlife.base.domain.ReMessage;
import com.bmlife.base.utils.security.MD5;
import com.bmlife.common.domain.TBmlfPlatUser;
import com.bmlife.manage.domain.PlatUserInfo;
import com.bmlife.manage.mapper.PlatUserMapper;

@RequestMapping("/manage")
@RestController
public class PlatUserController {

	@Autowired
	private PlatUserMapper userMapper;
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String loginManage(@RequestParam(value = "username") String username,
			@RequestParam(value = "password") String password) {
		TBmlfPlatUser tBmlfPlatUser = new TBmlfPlatUser();
		tBmlfPlatUser = userMapper.queryUserInfo(username, new MD5().getMD5ofStr(password));
		
		ReMessage reMessage = new ReMessage();
		reMessage.setError_no(0);
		reMessage.setError_msg("查询用户信息成功");
		reMessage.setResult("tBmlfPlatUser",tBmlfPlatUser);
		return JSON.toJSONString(reMessage);
	}

	@RequestMapping(value = "/addUser", method = RequestMethod.POST)
	public String addUserInfo(@ModelAttribute PlatUserInfo platUserInfo) {
		userMapper.registUser(platUserInfo);//写入用户信息
		return "Hello World";
	}
}