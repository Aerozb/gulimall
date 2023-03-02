package com.atguigu.gulimall.product.dao;

import com.atguigu.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author yhy
 * @date 2023-03-02 14:10:20
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
