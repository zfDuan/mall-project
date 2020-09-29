package com.cn.mall.coupon.dao;

import com.cn.mall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 * 
 * @author duanzhf
 * @email zfduan0824@163.com
 * @date 2020-09-22 23:34:33
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {
	
}
