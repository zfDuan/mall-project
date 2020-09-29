package com.cn.mall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cn.mall.common.utils.PageUtils;
import com.cn.mall.coupon.entity.SpuBoundsEntity;

import java.util.Map;

/**
 * 商品spu积分设置
 *
 * @author duanzhf
 * @email zfduan0824@163.com
 * @date 2020-09-22 23:34:33
 */
public interface SpuBoundsService extends IService<SpuBoundsEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

