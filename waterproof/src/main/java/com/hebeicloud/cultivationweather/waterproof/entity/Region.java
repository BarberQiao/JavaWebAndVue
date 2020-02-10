package com.hebeicloud.cultivationweather.waterproof.entity;

import com.baomidou.mybatisplus.extension.activerecord.Model;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 行政区域(Region)表实体类
 *
 * @author makejava
 * @since 2020-02-09 20:39:30
 */
@Data
@NoArgsConstructor
@SuppressWarnings("serial")
public class Region extends Model<Region> {
    
    //id
    private String id;
    
    //名称
    private String name;
    
    //父Id
    private String parentId;
    
    //level
    private Integer level;


}