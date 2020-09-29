package com.cn.mall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.cn.mall.common.utils.PageUtils;
import com.cn.mall.member.entity.MemberStatisticsInfoEntity;

import java.util.Map;

/**
 * 会员统计信息
 *
 * @author duanzhf
 * @email zfduan0824@163.com
 * @date 2020-09-22 23:32:22
 */
public interface MemberStatisticsInfoService extends IService<MemberStatisticsInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

