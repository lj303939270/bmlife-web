package com.bmlife.common.domain;

import java.io.Serializable;

public class TBmlfMchCategory implements Serializable {
	private static final long serialVersionUID = 1L;

	private int id;

	private String categoryName;

	private String createTime;

	private String creator;

	private String description;

	private String mchAppid;

	private String mchId;

	private int orderline;

	private String parentId;

	private String state;

	public TBmlfMchCategory() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCategoryName() {
		return this.categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
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

	public int getOrderline() {
		return this.orderline;
	}

	public void setOrderline(int orderline) {
		this.orderline = orderline;
	}

	public String getParentId() {
		return this.parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	public String getState() {
		return this.state;
	}

	public void setState(String state) {
		this.state = state;
	}

}