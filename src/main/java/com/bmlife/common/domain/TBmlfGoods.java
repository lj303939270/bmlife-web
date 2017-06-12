package com.bmlife.common.domain;

import java.io.Serializable;
import java.math.BigDecimal;

public class TBmlfGoods implements Serializable {
	private static final long serialVersionUID = 1L;

	private int id;

	private int categoryId;

	private String createTime;

	private String creator;

	private String description;

	private BigDecimal discount;

	private String goodsName;

	private String goodsNo;

	private String mchAppid;

	private String mchId;

	private BigDecimal prize;

	private String state;

	private String modifiedBy;

	private String modifiedTime;

	private int orderline;

	public TBmlfGoods() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getCategoryId() {
		return this.categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getCreator() {
		return this.creator;
	}

	public void setCreator(String creator) {
		this.creator = creator;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getDiscount() {
		return this.discount;
	}

	public void setDiscount(BigDecimal discount) {
		this.discount = discount;
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

	public BigDecimal getPrize() {
		return this.prize;
	}

	public void setPrize(BigDecimal prize) {
		this.prize = prize;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
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

	public int getOrderline() {
		return orderline;
	}

	public void setOrderline(int orderline) {
		this.orderline = orderline;
	}

}