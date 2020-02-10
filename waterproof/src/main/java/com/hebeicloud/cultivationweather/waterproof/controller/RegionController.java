package com.hebeicloud.cultivationweather.waterproof.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.api.ApiController;
import com.baomidou.mybatisplus.extension.api.R;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.hebeicloud.cultivationweather.waterproof.entity.Region;
import com.hebeicloud.cultivationweather.waterproof.service.RegionService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.io.Serializable;
import java.util.List;

/**
 * 行政区域(Region)表控制层
 *
 * @author makejava
 * @since 2020-02-09 20:39:30
 */
@RestController
@RequestMapping("region")
public class RegionController extends ApiController {
    /**
     * 服务对象
     */
    @Resource
    private RegionService regionService;

    /**
     * 分页查询所有数据
     *
     * @param page 分页对象
     * @param region 查询实体
     * @return 所有数据
     */
    @GetMapping
    public R selectAll(Page<Region> page, Region region) {
        return success(this.regionService.page(page, new QueryWrapper<>(region)));
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public R selectOne(@PathVariable Serializable id) {
        return success(this.regionService.getById(id));
    }

    /**
     * 新增数据
     *
     * @param region 实体对象
     * @return 新增结果
     */
    @PostMapping
    public R insert(@RequestBody Region region) {
        return success(this.regionService.save(region));
    }

    /**
     * 修改数据
     *
     * @param region 实体对象
     * @return 修改结果
     */
    @PutMapping
    public R update(@RequestBody Region region) {
        return success(this.regionService.updateById(region));
    }

    /**
     * 删除数据
     *
     * @param idList 主键结合
     * @return 删除结果
     */
    @DeleteMapping
    public R delete(@RequestParam("idList") List<Long> idList) {
        return success(this.regionService.removeByIds(idList));
    }
}