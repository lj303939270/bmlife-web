package com.bmlife.manage.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.bmlife.common.domain.TBmlfMchAppInfo;
import com.bmlife.common.domain.TBmlfMchInfo;

/**
 * 商户应用DB操作类 描述：
 * 
 * @author leijun
 * @created 2017年6月10日 下午1:40:45
 * @since
 */
@Mapper
public interface PlatMchMapper {

	/**
	 * 查询商户信息
	 * 描述：
	 * @author leijun
	 * @created 2017年6月11日 下午4:38:21
	 * @since 
	 * @param mchId
	 * @return
	 */
	@Select("SELECT * FROM T_BMLF_MCH_INFO WHERE MCH_ID = #{mchId}")
	public TBmlfMchInfo queryMchInfoById(@Param("mchId") String mchId);
	
	/**
	 * 查询商户应用信息
	 * 描述：
	 * @author leijun
	 * @created 2017年6月11日 下午4:38:28
	 * @since 
	 * @param mchId
	 * @return
	 */
	@Select("SELECT * FROM T_BMLF_MCH_APP_INFO WHERE MCH_ID = #{mchId}")
	public TBmlfMchAppInfo queryMchAppInfoById(@Param("mchId") String mchId);
	
}
