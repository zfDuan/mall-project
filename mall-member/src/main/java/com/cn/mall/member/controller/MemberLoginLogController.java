package com.cn.mall.member.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cn.mall.member.entity.MemberLoginLogEntity;
import com.cn.mall.member.service.MemberLoginLogService;
import com.cn.mall.common.utils.PageUtils;
import com.cn.mall.common.utils.R;



/**
 * 会员登录记录
 *
 * @author duanzhf
 * @email zfduan0824@163.com
 * @date 2020-09-22 23:32:22
 */
@RestController
@RequestMapping("member/umsmemberloginlog")
public class MemberLoginLogController {
    @Autowired
    private MemberLoginLogService memberLoginLogService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("member:umsmemberloginlog:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = memberLoginLogService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("member:umsmemberloginlog:info")
    public R info(@PathVariable("id") Long id){
		MemberLoginLogEntity umsMemberLoginLog = memberLoginLogService.getById(id);

        return R.ok().put("umsMemberLoginLog", umsMemberLoginLog);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("member:umsmemberloginlog:save")
    public R save(@RequestBody MemberLoginLogEntity umsMemberLoginLog){
		memberLoginLogService.save(umsMemberLoginLog);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("member:umsmemberloginlog:update")
    public R update(@RequestBody MemberLoginLogEntity umsMemberLoginLog){
		memberLoginLogService.updateById(umsMemberLoginLog);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("member:umsmemberloginlog:delete")
    public R delete(@RequestBody Long[] ids){
		memberLoginLogService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
