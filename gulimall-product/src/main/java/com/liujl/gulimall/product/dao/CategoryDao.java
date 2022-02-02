package com.liujl.gulimall.product.dao;

import com.liujl.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author liujl
 * @email liujl25@163.com
 * @date 2022-01-10 21:34:39
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
