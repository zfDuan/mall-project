package com.cn.mall.product.dao;

import com.cn.mall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 * 
 * @author duanzhf
 * @email zfduan0824@163.com
 * @date 2020-09-22 22:52:52
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {
	
}
