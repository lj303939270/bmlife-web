package com.bmlife.front.service;

import org.apache.ibatis.annotations.Select;

import com.bmlife.front.domain.UserInfo;

/**
 * 用户相关服务接口
 * 描述：
 * @author leijun
 * @created 2017年6月1日 下午8:54:05
 * @since
 */
public interface UserService {
	/**
	 * 注册用户信息
	 * 描述：
	 * @author leijun
	 * @created 2017年6月1日 下午8:55:38
	 * @since 
	 * @param userInfo
	 */
	public void registUser(UserInfo userInfo);
	
	/**
	 * 查询用户信息
	 * 描述：
	 * @author leijun
	 * @created 2017年6月8日 下午10:55:25
	 * @since 
	 * @param username
	 * @param password
	 */
	
	public UserInfo queryUserInfo(String username,String password);
	
	
}
