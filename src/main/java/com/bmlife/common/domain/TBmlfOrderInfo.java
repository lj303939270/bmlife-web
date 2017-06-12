package com.bmlife.common.domain;

import java.io.Serializable;

public class TBmlfOrderInfo implements Serializable {
	private static final long serialVersionUID = 1L;

	private int id;

	private String address;

	private String bmlfUid;

	private String createTime;

	private String mchAppid;

	private String mchId;

	private String orStatus;

	private String orderNo;

	private String payType;

	private int personNum;

	private int totalAmount;

	private int totalNumber;

	public TBmlfOrderInfo() {
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

	public String getBmlfUid() {
		return this.bmlfUid;
	}

	public void setBmlfUid(String bmlfUid) {
		this.bmlfUid = bmlfUid;
	}

	public String getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
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

	public String getOrStatus() {
		return this.orStatus;
	}

	public void setOrStatus(String orStatus) {
		this.orStatus = orStatus;
	}

	public String getOrderNo() {
		return this.orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public String getPayType() {
		return this.payType;
	}

	public void setPayType(String payType) {
		this.payType = payType;
	}

	public int getPersonNum() {
		return this.personNum;
	}

	public void setPersonNum(int personNum) {
		this.personNum = personNum;
	}

	public int getTotalAmount() {
		return this.totalAmount;
	}

	public void setTotalAmount(int totalAmount) {
		this.totalAmount = totalAmount;
	}

	public int getTotalNumber() {
		return this.totalNumber;
	}

	public void setTotalNumber(int totalNumber) {
		this.totalNumber = totalNumber;
	}

}