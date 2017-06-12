package com.bmlife.front.domain;
/**
 * 用户信息实体类
 * 描述：
 * @author leijun
 * @created 2017年6月1日 下午9:32:06
 * @since
 */
public class UserInfo {
	private String mchId;//商户ID
	
	private String mchAppId;//商户应用ID
	
	private String bmlfUid;//爆米生活用户ID
	
	private String name;//用户昵称
	
	private String headImg;//用户头像
	
	private String openId;//注册账号
	
	private String qq;
	
	private String phone;//手机号
	
	private String email;//邮箱
	
	private String address;//地址
	
	private String idNumber;//身份证
	
	private String sourceType;//接入来源(phone_number:手机用户,wechat_account:微信用户,all_account:平台用户)

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

	public String getBmlfUid() {
		return bmlfUid;
	}

	public void setBmlfUid(String bmlfUid) {
		this.bmlfUid = bmlfUid;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getHeadImg() {
		return headImg;
	}

	public void setHeadImg(String headImg) {
		this.headImg = headImg;
	}

	public String getOpenId() {
		return openId;
	}

	public void setOpenId(String openId) {
		this.openId = openId;
	}

	public String getQq() {
		return qq;
	}

	public void setQq(String qq) {
		this.qq = qq;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(String idNumber) {
		this.idNumber = idNumber;
	}

	public String getSourceType() {
		return sourceType;
	}

	public void setSourceType(String sourceType) {
		this.sourceType = sourceType;
	}
	
	
}
