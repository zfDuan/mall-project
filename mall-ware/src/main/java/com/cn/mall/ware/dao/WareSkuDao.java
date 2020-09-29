package com.cn.mall.ware.dao;

import com.cn.mall.ware.entity.WareSkuEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品库存
 * 
 * @author duanzhf
 * @email zfduan0824@163.com
 * @date 2020-09-22 22:57:47
 */
@Mapper
public interface WareSkuDao extends BaseMapper<WareSkuEntity> {
	
}
