package com.cn.mall.order.dao;

import com.cn.mall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 * 
 * @author duanzhf
 * @email zfduan0824@163.com
 * @date 2020-09-22 22:54:44
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {
	
}
