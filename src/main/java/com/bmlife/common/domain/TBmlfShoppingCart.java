package com.bmlife.common.domain;

import java.io.Serializable;

public class TBmlfShoppingCart implements Serializable {
	private static final long serialVersionUID = 1L;

	private int id;

	private String bmlfUid;

	private String createTime;

	private String goodsNo;

	private String mchAppid;

	private String merchantNo;

	private int number;

	private String state;

	public TBmlfShoppingCart() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
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

	public String getGoodsNo() {
		return this.goodsNo;
	}

	public void setGoodsNo(String goodsNo) {
		this.goodsNo = goodsNo;
	}

	public String getMchAppid() {
		return this.mchAppid;
	}

	public void setMchAppid(String mchAppid) {
		this.mchAppid = mchAppid;
	}

	public String getMerchantNo() {
		return this.merchantNo;
	}

	public void setMerchantNo(String merchantNo) {
		this.merchantNo = merchantNo;
	}

	public int getNumber() {
		return this.number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

}