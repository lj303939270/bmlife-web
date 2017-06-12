package com.bmlife.base.domain;

import java.util.HashMap;
import java.util.Map;

/**
 * 返回结果集 描述：
 * 
 * @author leijun
 * @created 2017年6月10日 下午1:44:09
 * @since
 */
public class ReMessage {

	private String error_msg = "";

	private int error_no = 0;

	private Map<String, Object> result = new HashMap<String, Object>();

	public String getError_msg() {
		return error_msg;
	}

	public void setError_msg(String error_msg) {
		this.error_msg = error_msg;
	}

	public int getError_no() {
		return error_no;
	}

	public void setError_no(int error_no) {
		this.error_no = error_no;
	}

	public Map<String, Object> getResult() {
		return result;
	}

	public void setResult(String key,Object object) {
		result.put(key, object);
		this.result = result;
	}
}
