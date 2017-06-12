package com.bmlife.manage.domain;

/**
 * 平台用户实体类 描述：
 * 
 * @author leijun
 * @created 2017年6月10日 下午1:49:20
 * @since
 */
public class PlatUserInfo {

	private String mchId;// 商户ID

	private String mchAppId;// 商户应用ID

	private String loginId;// 登录账号

	private String password;// 登录密码

	private int state;// 账号状态 0:无效，1：有效'

	private int isSystem;// 是否超级管理员 0：否 1：是

	private String lastTime;// 最后登录时间

	private int loginTimes;// 登录次数

	private String createBy;// 创建者账号

	private String createTime;// 创建时间

	private String modifiedBy;// 最后修改者账号

	private String modifiedTime;// 最后修改时间

	private int orderLine;// 排序值

	public String getMchId() {
		return mchId;
	}

	public void setMchId(String mchId) {
		this.mchId = mchId;
	}

	public String getMchAppId() {
		return mchAppId;
	}

	public void setMchAppId(String mchAppId) {
		this.mchAppId = mchAppId;
	}

	public String getLoginId() {
		return loginId;
	}

	public void setLoginId(String loginId) {
		this.loginId = loginId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}

	public int getIsSystem() {
		return isSystem;
	}

	public void setIsSystem(int isSystem) {
		this.isSystem = isSystem;
	}

	public String getLastTime() {
		return lastTime;
	}

	public void setLastTime(String lastTime) {
		this.lastTime = lastTime;
	}

	public int getLoginTimes() {
		return loginTimes;
	}

	public void setLoginTimes(int loginTimes) {
		this.loginTimes = loginTimes;
	}

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public int getOrderLine() {
		return orderLine;
	}

	public void setOrderLine(int orderLine) {
		this.orderLine = orderLine;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getModifiedTime() {
		return modifiedTime;
	}

	public void setModifiedTime(String modifiedTime) {
		this.modifiedTime = modifiedTime;
	}
}
