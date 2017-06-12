package com.bmlife.common.domain;

import java.io.Serializable;

public class TBmlfMchAppInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	private int id;

	private String address;

	private String businessHours;

	private String createTime;

	private String endTime;

	private String isPay;

	private String latitude;

	private String longitude;

	private String mchAppid;

	private String mchId;

	private String mchIntro;

	private String phone;

	private String shopkpper;

	private String startTime;

	private String telephone;

	public TBmlfMchAppInfo() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getBusinessHours() {
		return this.businessHours;
	}

	public void setBusinessHours(String businessHours) {
		this.businessHours = businessHours;
	}

	public String getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getEndTime() {
		return this.endTime;
	}

	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}

	public String getIsPay() {
		return this.isPay;
	}

	public void setIsPay(String isPay) {
		this.isPay = isPay;
	}

	public String getLatitude() {
		return this.latitude;
	}

	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}

	public String getLongitude() {
		return this.longitude;
	}

	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}

	public String getMchAppid() {
		return this.mchAppid;
	}

	public void setMchAppid(String mchAppid) {
		this.mchAppid = mchAppid;
	}

	public String getMchId() {
		return this.mchId;
	}

	public void setMchId(String mchId) {
		this.mchId = mchId;
	}

	public String getMchIntro() {
		return this.mchIntro;
	}

	public void setMchIntro(String mchIntro) {
		this.mchIntro = mchIntro;
	}

	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getShopkpper() {
		return this.shopkpper;
	}

	public void setShopkpper(String shopkpper) {
		this.shopkpper = shopkpper;
	}

	public String getStartTime() {
		return this.startTime;
	}

	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}

	public String getTelephone() {
		return this.telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

}