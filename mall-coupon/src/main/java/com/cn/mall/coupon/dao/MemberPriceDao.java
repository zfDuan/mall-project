package com.cn.mall.coupon.dao;

import com.cn.mall.coupon.entity.MemberPriceEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品会员价格
 * 
 * @author duanzhf
 * @email zfduan0824@163.com
 * @date 2020-09-22 23:34:33
 */
@Mapper
public interface MemberPriceDao extends BaseMapper<MemberPriceEntity> {
	
}
