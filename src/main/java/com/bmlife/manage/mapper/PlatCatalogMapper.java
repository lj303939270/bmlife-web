package com.bmlife.manage.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import com.bmlife.common.domain.TBmlfPlatBaseCatalog;

/**
 * 分类DB操作类 描述：
 * 
 * @author leijun
 * @created 2017年6月10日 下午1:40:45
 * @since
 */
@Mapper
public interface PlatCatalogMapper {

	@Select("SELECT * FROM T_BMLF_PLAT_BASE_CATALOG ")
	public TBmlfPlatBaseCatalog queryAllCatalog();
}
