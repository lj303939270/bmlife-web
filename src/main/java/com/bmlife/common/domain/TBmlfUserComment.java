package com.bmlife.common.domain;

import java.io.Serializable;

public class TBmlfUserComment implements Serializable {
	private static final long serialVersionUID = 1L;

	private int id;

	private String bmlfUid;

	private String content;

	private String createTime;

	private int efficScore;

	private String goodsName;

	private String goodsNo;

	private int goodsScore;

	private String isAnonymous;

	private String mchAppid;

	private String mchId;

	private String orderNo;

	private int serviceScore;

	public TBmlfUserComment() {
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

	public String getContent() {
		return this.content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public int getEfficScore() {
		return this.efficScore;
	}

	public void setEfficScore(int efficScore) {
		this.efficScore = efficScore;
	}

	public String getGoodsName() {
		return this.goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public String getGoodsNo() {
		return this.goodsNo;
	}

	public void setGoodsNo(String goodsNo) {
		this.goodsNo = goodsNo;
	}

	public int getGoodsScore() {
		return this.goodsScore;
	}

	public void setGoodsScore(int goodsScore) {
		this.goodsScore = goodsScore;
	}

	public String getIsAnonymous() {
		return this.isAnonymous;
	}

	public void setIsAnonymous(String isAnonymous) {
		this.isAnonymous = isAnonymous;
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

	public String getOrderNo() {
		return this.orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	public int getServiceScore() {
		return this.serviceScore;
	}

	public void setServiceScore(int serviceScore) {
		this.serviceScore = serviceScore;
	}

}