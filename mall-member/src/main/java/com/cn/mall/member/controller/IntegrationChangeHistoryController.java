package com.cn.mall.member.controller;

import java.util.Arrays;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cn.mall.member.entity.IntegrationChangeHistoryEntity;
import com.cn.mall.member.service.IntegrationChangeHistoryService;
import com.cn.mall.common.utils.PageUtils;
import com.cn.mall.common.utils.R;



/**
 * 积分变化历史记录
 *
 * @author duanzhf
 * @email zfduan0824@163.com
 * @date 2020-09-22 23:32:22
 */
@RestController
@RequestMapping("member/umsintegrationchangehistory")
public class IntegrationChangeHistoryController {
    @Autowired
    private IntegrationChangeHistoryService integrationChangeHistoryService;

    /**
     * 列表
     */
    @RequestMapping("/list")
    //@RequiresPermissions("member:umsintegrationchangehistory:list")
    public R list(@RequestParam Map<String, Object> params){
        PageUtils page = integrationChangeHistoryService.queryPage(params);

        return R.ok().put("page", page);
    }


    /**
     * 信息
     */
    @RequestMapping("/info/{id}")
    //@RequiresPermissions("member:umsintegrationchangehistory:info")
    public R info(@PathVariable("id") Long id){
		IntegrationChangeHistoryEntity umsIntegrationChangeHistory = integrationChangeHistoryService.getById(id);

        return R.ok().put("umsIntegrationChangeHistory", umsIntegrationChangeHistory);
    }

    /**
     * 保存
     */
    @RequestMapping("/save")
    //@RequiresPermissions("member:umsintegrationchangehistory:save")
    public R save(@RequestBody IntegrationChangeHistoryEntity umsIntegrationChangeHistory){
		integrationChangeHistoryService.save(umsIntegrationChangeHistory);

        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    //@RequiresPermissions("member:umsintegrationchangehistory:update")
    public R update(@RequestBody IntegrationChangeHistoryEntity umsIntegrationChangeHistory){
		integrationChangeHistoryService.updateById(umsIntegrationChangeHistory);

        return R.ok();
    }

    /**
     * 删除
     */
    @RequestMapping("/delete")
    //@RequiresPermissions("member:umsintegrationchangehistory:delete")
    public R delete(@RequestBody Long[] ids){
		integrationChangeHistoryService.removeByIds(Arrays.asList(ids));

        return R.ok();
    }

}
