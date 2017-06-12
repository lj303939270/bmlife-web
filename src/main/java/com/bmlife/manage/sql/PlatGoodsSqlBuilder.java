package com.bmlife.manage.sql;

import org.apache.ibatis.jdbc.SQL;

import com.bmlife.base.utils.StringHelper;
import com.bmlife.common.domain.TBmlfGoods;

/**
 * 用户SQL构建类 描述：
 * 
 * @author leijun
 * @created 2017年6月10日 下午12:35:42
 * @since
 */
public class PlatGoodsSqlBuilder {

	/**
	 * 插入商品信息
	 * 描述：
	 * @author leijun
	 * @created 2017年6月11日 下午4:41:44
	 * @since 
	 * @param tBmlfGood
	 * @return
	 */
	public String buildInsertPlatGoods() {
		return new SQL(){
			{
				INSERT_INTO("T_BMLF_GOODS");
				INTO_COLUMNS("MCH_ID","MCH_APPID","GOODS_NO","GOODS_NAME","DESCRIPTION","CATEGORY_ID","PRIZE","DISCOUNT","STATE","CREATE_BY","CREATE_TIME","ORDERLINE");
				INTO_VALUES("#{mchId}","#{mchAppId}","#{goodsNo}","#{goodsName}","#{description}","#{categoryId}","#{prize}","#{discount}","#{state}","#{createBy}","#{createTime}","#{orderLine}");
			}
		}.toString();
	}
	
	public String buildInsertPlatGoodsImg() {
		return new SQL(){
			{
				INSERT_INTO("T_BMLF_GOODS_IMG");
				INTO_COLUMNS("MCH_ID","MCH_APPID","GOODS_NO","PIC_URL","PIC_TYPE","STATE","CREATE_BY","CREATE_TIME");
				INTO_VALUES("#{mchId}","#{mchAppId}","#{goodsNo}","#{picUrl}","#{picType}","#{state}","#{createBy}","#{createTime}");
			}
		}.toString();
	}
	
	public String buildQueryPlatGoods(final TBmlfGoods tBmlfGood) {
		return new SQL(){
			{
				SELECT("*");
				FROM("T_BMLF_GOODS");
				WHERE("1=1");
				if(StringHelper.isNotBlank(tBmlfGood.getMchId())){
					AND();
					WHERE("MCH_ID=#{mchId}");
				}
				if(StringHelper.isNotBlank(tBmlfGood.getMchAppid())){
					AND();
					WHERE("MCH_APPID=#{mchAppid}");
				}
				if(StringHelper.isNotBlank(tBmlfGood.getGoodsName())){
					AND();
					WHERE("GOODS_NAME like #{goodsName} || '%' ");
				}
				if(tBmlfGood.getCategoryId() > 0 ){
					AND();
					WHERE("CATEGORY_ID=#{categoryId}");
				}
				if(StringHelper.isNotBlank(tBmlfGood.getState())){
					AND();
					WHERE("STATE=#{state}");
				}
				ORDER_BY("CREATE_TIME DESC");
			}
		}.toString();
	}
}
