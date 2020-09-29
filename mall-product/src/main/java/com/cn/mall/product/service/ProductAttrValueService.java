package com.cn.mall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cn.mall.common.utils.PageUtils;
import com.cn.mall.product.entity.ProductAttrValueEntity;

import java.util.Map;

/**
 * spu属性值
 *
 * @author duanzhf
 * @email zfduan0824@163.com
 * @date 2020-09-22 22:52:52
 */
public interface ProductAttrValueService extends IService<ProductAttrValueEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

