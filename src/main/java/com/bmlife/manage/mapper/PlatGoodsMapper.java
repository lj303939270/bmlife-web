package com.bmlife.manage.mapper;

import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.SelectProvider;

import com.bmlife.common.domain.TBmlfGoods;
import com.bmlife.common.domain.TBmlfGoodsImg;
import com.bmlife.manage.sql.PlatGoodsSqlBuilder;

/**
 * 商品管理DB处理类
 * 描述：
 * @author leijun
 * @created 2017年6月11日 下午4:39:15
 * @since
 */
@Mapper
public interface PlatGoodsMapper {
	
	@InsertProvider(type = PlatGoodsSqlBuilder.class, method = "buildInsertPlatGoods")
	public int insertGoods(TBmlfGoods tBmlfGoods);
	
	@InsertProvider(type = PlatGoodsSqlBuilder.class, method = "buildInsertPlatGoodsImg")
	public int insertGoodsImg(TBmlfGoodsImg  tBmlfGoodsImg);

	@SelectProvider(type = PlatGoodsSqlBuilder.class, method = "buildQueryPlatGoods")
	public TBmlfGoods queryPlatGoods(TBmlfGoods tBmlfGood);
}
