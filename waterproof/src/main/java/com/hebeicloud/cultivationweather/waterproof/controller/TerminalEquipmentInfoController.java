package com.hebeicloud.cultivationweather.waterproof.controller;



import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.hebeicloud.cultivationweather.waterproof.entity.TerminalEquipmentInfo;
import com.hebeicloud.cultivationweather.waterproof.service.TerminalEquipmentInfoService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * 终端 设备信息(TerminalEquipmentInfo)表控制层
 *
 * @author makejava
 * @since 2020-02-09 21:24:15
 */
@RestController
@RequestMapping("terminalEquipmentInfo")
public class TerminalEquipmentInfoController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private TerminalEquipmentInfoService terminalEquipmentInfoService;

    /**
     * 分页查询所有数据
     *
     * @param page 分页对象
     * @param terminalEquipmentInfo 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<TerminalEquipmentInfo> page, TerminalEquipmentInfo terminalEquipmentInfo) {
        return success(this.terminalEquipmentInfoService.page(page, new QueryWrapper<>(terminalEquipmentInfo)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.terminalEquipmentInfoService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param terminalEquipmentInfo 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody TerminalEquipmentInfo terminalEquipmentInfo) {
        return success(this.terminalEquipmentInfoService.save(terminalEquipmentInfo));
    }

    /**
     * 修改数据
     *
     * @param terminalEquipmentInfo 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody TerminalEquipmentInfo terminalEquipmentInfo) {
        return success(this.terminalEquipmentInfoService.updateById(terminalEquipmentInfo));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.terminalEquipmentInfoService.removeByIds(idList));
    }
}