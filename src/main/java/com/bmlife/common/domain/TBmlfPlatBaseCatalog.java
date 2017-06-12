package com.bmlife.common.domain;

import java.io.Serializable;
import java.math.BigDecimal;

public class TBmlfPlatBaseCatalog implements Serializable {
	private static final long serialVersionUID = 1L;

	private String catalogId;

	private BigDecimal childrennum;

	private String createBy;

	private String createTime;

	private String description;

	private String isPopup;

	private BigDecimal isRoot;

	private BigDecimal isSystem;

	private String linkUrl;

	private String logoUrl;

	private String modifiedBy;

	private String modifiedTime;

	private String name;

	private BigDecimal orderline;

	private String parentId;

	private String route;

	private BigDecimal state;

	private String versionId;

	public TBmlfPlatBaseCatalog() {
	}

	public String getCatalogId() {
		return this.catalogId;
	}

	public void setCatalogId(String catalogId) {
		this.catalogId = catalogId;
	}

	public BigDecimal getChildrennum() {
		return this.childrennum;
	}

	public void setChildrennum(BigDecimal childrennum) {
		this.childrennum = childrennum;
	}

	public String getCreateBy() {
		return this.createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public String getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getIsPopup() {
		return this.isPopup;
	}

	public void setIsPopup(String isPopup) {
		this.isPopup = isPopup;
	}

	public BigDecimal getIsRoot() {
		return this.isRoot;
	}

	public void setIsRoot(BigDecimal isRoot) {
		this.isRoot = isRoot;
	}

	public BigDecimal getIsSystem() {
		return this.isSystem;
	}

	public void setIsSystem(BigDecimal isSystem) {
		this.isSystem = isSystem;
	}

	public String getLinkUrl() {
		return this.linkUrl;
	}

	public void setLinkUrl(String linkUrl) {
		this.linkUrl = linkUrl;
	}

	public String getLogoUrl() {
		return this.logoUrl;
	}

	public void setLogoUrl(String logoUrl) {
		this.logoUrl = logoUrl;
	}

	public String getModifiedBy() {
		return this.modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public String getModifiedTime() {
		return this.modifiedTime;
	}

	public void setModifiedTime(String modifiedTime) {
		this.modifiedTime = modifiedTime;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigDecimal getOrderline() {
		return this.orderline;
	}

	public void setOrderline(BigDecimal orderline) {
		this.orderline = orderline;
	}

	public String getParentId() {
		return this.parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	public String getRoute() {
		return this.route;
	}

	public void setRoute(String route) {
		this.route = route;
	}

	public BigDecimal getState() {
		return this.state;
	}

	public void setState(BigDecimal state) {
		this.state = state;
	}

	public String getVersionId() {
		return this.versionId;
	}

	public void setVersionId(String versionId) {
		this.versionId = versionId;
	}

}