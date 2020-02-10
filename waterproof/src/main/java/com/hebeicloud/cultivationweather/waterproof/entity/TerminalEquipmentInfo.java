package com.hebeicloud.cultivationweather.waterproof.entity;

import java.util.Date;
import com.baomidou.mybatisplus.extension.activerecord.Model;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 终端 设备信息(TerminalEquipmentInfo)表实体类
 *
 * @author makejava
 * @since 2020-02-09 21:24:15
 */
@Data
@NoArgsConstructor
@SuppressWarnings("serial")
public class TerminalEquipmentInfo extends Model<TerminalEquipmentInfo> {
    
    //自增Id做主键
    private Long id;
    
    //终端Mac
    private String terminalMac;
    
    //转换格式后的设备号码
    private String terminalMacName;
    
    //终端编号
    private String terminalCode;
    
    //终端名称
    private String terminalName;
    
    //所属单位
    private Long orgId;
    
    //经度
    private Double longitude;
    
    //纬度
    private Double latitude;
    
    //省
    private String provincial;
    
    //市
    private String city;
    
    //区
    private String area;
    
    //行政编码
    private String areaCode;
    
    //地址
    private String address;
    
    //摄像机地址
    private String cameraUrl;
    
    //检测间隔
    private Integer detectionInterval;
    
    //上报间隔
    private Integer reportingInterval;
    
    //设备高度
    private Integer terminalHeight;
    
    //绿灯上限
    private Integer greenUpperLimit;
    
    //黄灯上限
    private Integer yellowUpperLimit;
    
    //红灯上限
    private Integer redUpperLimit;
    
    //标记
    private Integer flag;
    
    //创建时间
    private Date createTime;
    
    //更新时间
    private Date updateTime;
    
    //备注
    private String remark;
    
    //是否打开摄像头
    private Integer cameraOpen;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTerminalMac() {
        return terminalMac;
    }

    public void setTerminalMac(String terminalMac) {
        this.terminalMac = terminalMac;
    }

    public String getTerminalMacName() {
        return terminalMacName;
    }

    public void setTerminalMacName(String terminalMacName) {
        this.terminalMacName = terminalMacName;
    }

    public String getTerminalCode() {
        return terminalCode;
    }

    public void setTerminalCode(String terminalCode) {
        this.terminalCode = terminalCode;
    }

    public String getTerminalName() {
        return terminalName;
    }

    public void setTerminalName(String terminalName) {
        this.terminalName = terminalName;
    }

    public Long getOrgId() {
        return orgId;
    }

    public void setOrgId(Long orgId) {
        this.orgId = orgId;
    }

    public Double getLongitude() {
        return longitude;
    }

    public void setLongitude(Double longitude) {
        this.longitude = longitude;
    }

    public Double getLatitude() {
        return latitude;
    }

    public void setLatitude(Double latitude) {
        this.latitude = latitude;
    }

    public String getProvincial() {
        return provincial;
    }

    public void setProvincial(String provincial) {
        this.provincial = provincial;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getAreaCode() {
        return areaCode;
    }

    public void setAreaCode(String areaCode) {
        this.areaCode = areaCode;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCameraUrl() {
        return cameraUrl;
    }

    public void setCameraUrl(String cameraUrl) {
        this.cameraUrl = cameraUrl;
    }

    public Integer getDetectionInterval() {
        return detectionInterval;
    }

    public void setDetectionInterval(Integer detectionInterval) {
        this.detectionInterval = detectionInterval;
    }

    public Integer getReportingInterval() {
        return reportingInterval;
    }

    public void setReportingInterval(Integer reportingInterval) {
        this.reportingInterval = reportingInterval;
    }

    public Integer getTerminalHeight() {
        return terminalHeight;
    }

    public void setTerminalHeight(Integer terminalHeight) {
        this.terminalHeight = terminalHeight;
    }

    public Integer getGreenUpperLimit() {
        return greenUpperLimit;
    }

    public void setGreenUpperLimit(Integer greenUpperLimit) {
        this.greenUpperLimit = greenUpperLimit;
    }

    public Integer getYellowUpperLimit() {
        return yellowUpperLimit;
    }

    public void setYellowUpperLimit(Integer yellowUpperLimit) {
        this.yellowUpperLimit = yellowUpperLimit;
    }

    public Integer getRedUpperLimit() {
        return redUpperLimit;
    }

    public void setRedUpperLimit(Integer redUpperLimit) {
        this.redUpperLimit = redUpperLimit;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getCameraOpen() {
        return cameraOpen;
    }

    public void setCameraOpen(Integer cameraOpen) {
        this.cameraOpen = cameraOpen;
    }

    /**
     * 获取主键值
     *
     * @return 主键值
     */
    @Override
    protected Serializable pkVal() {
        return this.id;
    }
    }