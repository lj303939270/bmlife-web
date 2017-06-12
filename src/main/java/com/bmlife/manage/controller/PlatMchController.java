package com.bmlife.manage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.alibaba.fastjson.JSON;
import com.bmlife.base.domain.ReMessage;
import com.bmlife.common.domain.TBmlfMchInfo;
import com.bmlife.manage.mapper.PlatMchMapper;

@RequestMapping("/manage")
@RestController
public class PlatMchController {

	@Autowired
	private PlatMchMapper platMchMapper;
	
	@RequestMapping(value = "/queryAllCatalog", method = RequestMethod.GET)
	public String loginManage(@RequestParam(value = "mchId") String mchId) {
		TBmlfMchInfo tBmlfMchInfo = new TBmlfMchInfo();
		tBmlfMchInfo = platMchMapper.queryMchInfoById(mchId);
		
		ReMessage reMessage = new ReMessage();
		reMessage.setError_no(0);
		reMessage.setError_msg("查询商户信息成功");
		reMessage.setResult("tBmlfMchInfo",tBmlfMchInfo);
		return JSON.toJSONString(reMessage);
	}

}