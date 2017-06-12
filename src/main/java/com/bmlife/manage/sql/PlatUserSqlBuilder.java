package com.bmlife.manage.sql;

import org.apache.ibatis.jdbc.SQL;

import com.bmlife.manage.domain.PlatUserInfo;

/**
 * 用户SQL构建类 描述：
 * 
 * @author leijun
 * @created 2017年6月10日 下午12:35:42
 * @since
 */
public class PlatUserSqlBuilder {

	public String buildInsertPlatUser(PlatUserInfo platUserInfo) {
		return new SQL(){
			{
				INSERT_INTO("T_BMLF_PLAT_USER");
				INTO_COLUMNS("MCH_ID","MCH_APPID","LOGIN_ID","PASSWORD","STATE","IS_SYSTEM","CREATE_BY","CREATE_TIME","ORDERLINE");
				INTO_VALUES("#{mchId}","#{mchAppId}","#{loginId}","#{password}","#{state}","#{isSystem}","#{createBy}","#{createTime}","#{orderLine}");
			}
		}.toString();
	}
	
	public String buildGetUsersByName(final String name) {
		return new SQL() {
			{
				SELECT("*");
				FROM("users");
				if (name != null) {
					WHERE("name like #{value} || '%'");
				}
				ORDER_BY("id");
			}
		}.toString();
	}
}
