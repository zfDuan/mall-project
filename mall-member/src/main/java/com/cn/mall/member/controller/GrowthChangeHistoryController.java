package com.cn.mall.member.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cn.mall.member.entity.GrowthChangeHistoryEntity;
import com.cn.mall.member.service.GrowthChangeHistoryService;
import com.cn.mall.common.utils.PageUtils;
import com.cn.mall.common.utils.R;



/**
 * 成长值变化历史记录
 *
 * @author duanzhf
 * @email zfduan0824@163.com
 * @date 2020-09-22 23:32:22
 */
@RestController
@RequestMapping("member/umsgrowthchangehistory")
public class GrowthChangeHistoryController {
    @Autowired
    private GrowthChangeHistoryService growthChangeHistoryService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("member:umsgrowthchangehistory:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = growthChangeHistoryService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("member:umsgrowthchangehistory:info")
    public R info(@PathVariable("id") Long id){
		GrowthChangeHistoryEntity umsGrowthChangeHistory = growthChangeHistoryService.getById(id);

        return R.ok().put("umsGrowthChangeHistory", umsGrowthChangeHistory);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("member:umsgrowthchangehistory:save")
    public R save(@RequestBody GrowthChangeHistoryEntity umsGrowthChangeHistory){
		growthChangeHistoryService.save(umsGrowthChangeHistory);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("member:umsgrowthchangehistory:update")
    public R update(@RequestBody GrowthChangeHistoryEntity umsGrowthChangeHistory){
		growthChangeHistoryService.updateById(umsGrowthChangeHistory);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("member:umsgrowthchangehistory:delete")
    public R delete(@RequestBody Long[] ids){
		growthChangeHistoryService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
