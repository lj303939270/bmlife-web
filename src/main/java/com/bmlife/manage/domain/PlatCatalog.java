package com.bmlife.manage.domain;

public class PlatCatalog {

	private String catalogId;// 栏目ID

	private String parentId;// 父ID号

	private String name;// 目录名称

	private String description;// 栏目描述信息

	private int orderline;// 排序

	private int childrennum;// 子栏目数量

	private String route;// 路由值

	private String state;// 状态（0:关闭状态，1:打开状态。关闭之后则在前台目录列表中看不到）

	private int isRoot;// 是否为站点的根目录（0:不是，1：是）

	private int isSystem;// 是否是系统目录（NUMBER(1)）

	private String linkUrl;// 后台请求URL

	private String createBy;// 创建者账号

	private String createTime;// 创建时间

	private String modifiedBy;// 最后修改者账号

	private String modifiedTime;// 最后修改时间

	private String logoUrl;// logo地址

	private int isPopup;// 是否为弹出框(0:不是 1:是)

	private String versionId;// 关联版本编号

	public String getCatalogId() {
		return catalogId;
	}

	public void setCatalogId(String catalogId) {
		this.catalogId = catalogId;
	}

	public String getParentId() {
		return parentId;
	}

	public void setParentId(String parentId) {
		this.parentId = parentId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getOrderline() {
		return orderline;
	}

	public void setOrderline(int orderline) {
		this.orderline = orderline;
	}

	public int getChildrennum() {
		return childrennum;
	}

	public void setChildrennum(int childrennum) {
		this.childrennum = childrennum;
	}

	public String getRoute() {
		return route;
	}

	public void setRoute(String route) {
		this.route = route;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getIsRoot() {
		return isRoot;
	}

	public void setIsRoot(int isRoot) {
		this.isRoot = isRoot;
	}

	public int getIsSystem() {
		return isSystem;
	}

	public void setIsSystem(int isSystem) {
		this.isSystem = isSystem;
	}

	public String getLinkUrl() {
		return linkUrl;
	}

	public void setLinkUrl(String linkUrl) {
		this.linkUrl = linkUrl;
	}

	public String getCreateBy() {
		return createBy;
	}

	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}

	public String getModifiedBy() {
		return modifiedBy;
	}

	public void setModifiedBy(String modifiedBy) {
		this.modifiedBy = modifiedBy;
	}

	public String getLogoUrl() {
		return logoUrl;
	}

	public void setLogoUrl(String logoUrl) {
		this.logoUrl = logoUrl;
	}

	public int getIsPopup() {
		return isPopup;
	}

	public void setIsPopup(int isPopup) {
		this.isPopup = isPopup;
	}

	public String getVersionId() {
		return versionId;
	}

	public void setVersionId(String versionId) {
		this.versionId = versionId;
	}

	public String getCreateTime() {
		return createTime;
	}

	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getModifiedTime() {
		return modifiedTime;
	}

	public void setModifiedTime(String modifiedTime) {
		this.modifiedTime = modifiedTime;
	}

}
