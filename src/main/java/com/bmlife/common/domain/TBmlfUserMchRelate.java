package com.bmlife.common.domain;

import java.io.Serializable;

public class TBmlfUserMchRelate implements Serializable {
	private static final long serialVersionUID = 1L;

	private int id;

	private String bmlfUid;

	private String createTime;

	private String lastTime;

	private String mchAppid;

	private String mchId;

	public TBmlfUserMchRelate() {
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

	public String getLastTime() {
		return this.lastTime;
	}

	public void setLastTime(String lastTime) {
		this.lastTime = lastTime;
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

}