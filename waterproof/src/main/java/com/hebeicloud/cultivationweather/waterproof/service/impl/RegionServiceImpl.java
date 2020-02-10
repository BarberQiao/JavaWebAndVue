package com.hebeicloud.cultivationweather.waterproof.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hebeicloud.cultivationweather.waterproof.dao.RegionDao;
import com.hebeicloud.cultivationweather.waterproof.entity.Region;
import com.hebeicloud.cultivationweather.waterproof.service.RegionService;
import org.springframework.stereotype.Service;

/**
 * 行政区域(Region)表服务实现类
 *
 * @author makejava
 * @since 2020-02-09 20:39:30
 */
@Service("regionService")
public class RegionServiceImpl extends ServiceImpl<RegionDao, Region> implements RegionService {

}