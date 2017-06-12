package com.bmlife.manage.domain;
/**
 * 商户实体类
 * 描述：
 * @author leijun
 * @created 2017年6月11日 下午3:55:52
 * @since
 */
public class PlatMerchantInfo {
	
	private int id;
	
	private String mchId;//商户ID
	
	private String mchAppId;//商户应用ID
	
	private String shopkpper;//商户法人
	
	private String contract;//合作协议
	
	private String state;//商户状态(0.正常 1.关闭.2冻结)
	
	private String phone;//手机号
	
	private String email;//邮箱
	
	private String createBy;// 创建者账号

	private String createTime;// 创建时间

	private String modifiedBy;// 最后修改者账号

	private String modifiedTime;// 最后修改时间

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

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

	public String getShopkpper() {
		return shopkpper;
	}

	public void setShopkpper(String shopkpper) {
		this.shopkpper = shopkpper;
	}

	public String getContract() {
		return contract;
	}

	public void setContract(String contract) {
		this.contract = contract;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
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

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public String getModifiedTime() {
		return modifiedTime;
	}

	public void setModifiedTime(String modifiedTime) {
		this.modifiedTime = modifiedTime;
	}
}
