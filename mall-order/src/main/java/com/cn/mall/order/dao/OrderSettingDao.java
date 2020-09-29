package com.cn.mall.order.dao;

import com.cn.mall.order.entity.OrderSettingEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单配置信息
 * 
 * @author duanzhf
 * @email zfduan0824@163.com
 * @date 2020-09-22 22:54:43
 */
@Mapper
public interface OrderSettingDao extends BaseMapper<OrderSettingEntity> {
	
}
