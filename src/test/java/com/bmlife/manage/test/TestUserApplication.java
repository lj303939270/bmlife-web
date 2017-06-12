package com.bmlife.manage.test;

import java.util.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;

import com.bmlife.base.utils.DateHelper;
import com.bmlife.base.utils.security.MD5;
import com.bmlife.common.domain.TBmlfPlatUser;
import com.bmlife.manage.domain.PlatUserInfo;
import com.bmlife.manage.mapper.PlatUserMapper;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class TestUserApplication {

	@Autowired
	private PlatUserMapper userMapper;

	@Test
	@Rollback
	public void insertPlatUserMapper() throws Exception {
		PlatUserInfo platUserInfo = new PlatUserInfo();
		platUserInfo.setLoginId("admin");
		platUserInfo.setPassword(new MD5().getMD5ofStr("888888"));
		platUserInfo.setState(1);
		platUserInfo.setIsSystem(1);
		platUserInfo.setCreateBy("admin");
		platUserInfo.setCreateTime(DateHelper.formatDate(new Date(),"YYYY-mm-dd HH:mm:ss"));
		int result = userMapper.registUser(platUserInfo);
		System.out.println("插入结果：" + result);
	}
	
	@Test
	public void queryPlatUser() throws Exception {
		TBmlfPlatUser platUserInfo = userMapper.queryUserInfo("admin", new MD5().getMD5ofStr("888888"));
	}
}
