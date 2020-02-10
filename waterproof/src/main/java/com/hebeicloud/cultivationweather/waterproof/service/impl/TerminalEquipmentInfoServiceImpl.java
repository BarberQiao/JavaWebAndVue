package com.hebeicloud.cultivationweather.waterproof.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hebeicloud.cultivationweather.waterproof.dao.TerminalEquipmentInfoDao;
import com.hebeicloud.cultivationweather.waterproof.entity.TerminalEquipmentInfo;
import com.hebeicloud.cultivationweather.waterproof.service.TerminalEquipmentInfoService;
import org.springframework.stereotype.Service;

/**
 * 终端 设备信息(TerminalEquipmentInfo)表服务实现类
 *
 * @author makejava
 * @since 2020-02-09 21:24:15
 */
@Service("terminalEquipmentInfoService")
public class TerminalEquipmentInfoServiceImpl extends ServiceImpl<TerminalEquipmentInfoDao, TerminalEquipmentInfo> implements TerminalEquipmentInfoService {

}