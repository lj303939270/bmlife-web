package com.bmlife.front.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.bmlife.front.domain.UserInfo;
import com.bmlife.front.service.UserService;

@Service
public class UserServiceImpl implements UserService{

	@Autowired
	private JdbcTemplate jdbcTemplate;

	public void registUser(UserInfo userInfo) {
		// TODO Auto-generated method stub
		String sql = "insert into USER(open_id, PASSWORD, NAME) values(?, ?, ?)";
		jdbcTemplate.update(sql,userInfo.getOpenId());
	}

	public UserInfo queryUserInfo(String username, String password) {
		// TODO Auto-generated method stub
		return null;
	}

}
