package com.cn.mall.ware.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cn.mall.common.utils.PageUtils;
import com.cn.mall.ware.entity.WareOrderTaskEntity;

import java.util.Map;

/**
 * 库存工作单
 *
 * @author duanzhf
 * @email zfduan0824@163.com
 * @date 2020-09-22 22:57:47
 */
public interface WareOrderTaskService extends IService<WareOrderTaskEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

