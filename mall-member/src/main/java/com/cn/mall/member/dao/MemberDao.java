package com.cn.mall.member.dao;

import com.cn.mall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 * 
 * @author duanzhf
 * @email zfduan0824@163.com
 * @date 2020-09-22 23:32:22
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {
	
}
