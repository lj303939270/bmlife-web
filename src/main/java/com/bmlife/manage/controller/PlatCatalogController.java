package com.bmlife.manage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.bmlife.base.domain.ReMessage;
import com.bmlife.common.domain.TBmlfPlatBaseCatalog;
import com.bmlife.manage.domain.PlatCatalog;
import com.bmlife.manage.mapper.PlatCatalogMapper;

@RequestMapping("/manage")
@RestController
public class PlatCatalogController {

	@Autowired
	private PlatCatalogMapper platCatalogMapper;
	
	@RequestMapping(value = "/queryAllCatalog", method = RequestMethod.GET)
	public String loginManage() {
		TBmlfPlatBaseCatalog tBmlfPlatBaseCatalog = new TBmlfPlatBaseCatalog();
		tBmlfPlatBaseCatalog = platCatalogMapper.queryAllCatalog();
		
		ReMessage reMessage = new ReMessage();
		reMessage.setError_no(0);
		reMessage.setError_msg("查询分类信息成功");
		reMessage.setResult("tBmlfPlatBaseCatalog",tBmlfPlatBaseCatalog);
		return JSON.toJSONString(reMessage);
	}

}