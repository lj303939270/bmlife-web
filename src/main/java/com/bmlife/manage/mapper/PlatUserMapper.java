package com.bmlife.manage.mapper;

import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.bmlife.common.domain.TBmlfPlatUser;
import com.bmlife.manage.domain.PlatUserInfo;
import com.bmlife.manage.sql.PlatUserSqlBuilder;

/**
 * 用户DB操作类 描述：
 * 
 * @author leijun
 * @created 2017年6月10日 下午1:40:45
 * @since
 */
@Mapper
public interface PlatUserMapper {
	/**
	 * 注册用户信息 描述：
	 * 
	 * @author leijun
	 * @created 2017年6月1日 下午8:55:38
	 * @since
	 * @param userInfo
	 */
	@InsertProvider(type = PlatUserSqlBuilder.class, method = "buildInsertPlatUser")
	public int registUser(PlatUserInfo platUserInfo);

	/**
	 * 查询用户信息 描述：
	 * 
	 * @author leijun
	 * @created 2017年6月8日 下午10:55:25
	 * @since
	 * @param username
	 * @param password
	 */

	@Select("SELECT * FROM T_BMLF_PLAT_USER WHERE LOGIN_ID = #{loginId} AND PASSWORD = #{password}")
	public TBmlfPlatUser queryUserInfo(@Param("loginId") String loginId,@Param("password") String password);
}
