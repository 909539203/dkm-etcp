package com.etcp.pojo;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.math.BigDecimal;

@Table(name = "tb_park")
public class TbPark implements Serializable {
    /**
     * 车位id
     */
    @Id
    @Column(name = "park_id")
    private Long parkId;

    /**
     * 小区id
     */
    @Column(name = "village_id")
    private Long villageId;

    /**
     * 车位组id
     */
    @Column(name = "parkGroup_id")
    private Integer parkgroupId;

    /**
     * 车位价格
     */
    private BigDecimal price;

    /**
     * 是否正在使用(-1暂停服务，0未使用，1 使用中)
     */
    private Integer status;

    /**
     * 电池状态（-1异常，0正常）
     */
    @Column(name = "batteryState")
    private Integer batterystate;

    /**
     * 异常状态吗
     */
    @Column(name = "errorCode")
    private Integer errorcode;

    /**
     * 距离多远
     */
    private Integer distance;

    /**
     * 正在使用者
     */
    @Column(name = "user_id")
    private Long userId;

    /**
     * 车位拥有者
     */
    @Column(name = "ower_id")
    private Long owerId;

    /**
     * 是否是公共车位(0表示公共车位，1表示私人车位，default为0)
     */
    @Column(name = "rentStatus")
    private Integer rentstatus;

    /**
     * 车位图片地址（fastDfs）
     */
    @Column(name = "picUrl")
    private String picurl;

    /**
     * 经度
     */
    private String jidu;

    /**
     * 纬度
     */
    private String weidu;

    /**
     * 备用字段1
     */
    private String key1;

    /**
     * 备用字段2
     */
    private String key2;

    /**
     * 备用字段3
     */
    private String key3;

    private static final long serialVersionUID = 1L;

    /**
     * 获取车位id
     *
     * @return park_id - 车位id
     */
    public Long getParkId() {
        return parkId;
    }

    /**
     * 设置车位id
     *
     * @param parkId 车位id
     */
    public void setParkId(Long parkId) {
        this.parkId = parkId;
    }

    /**
     * 获取小区id
     *
     * @return village_id - 小区id
     */
    public Long getVillageId() {
        return villageId;
    }

    /**
     * 设置小区id
     *
     * @param villageId 小区id
     */
    public void setVillageId(Long villageId) {
        this.villageId = villageId;
    }

    /**
     * 获取车位组id
     *
     * @return parkGroup_id - 车位组id
     */
    public Integer getParkgroupId() {
        return parkgroupId;
    }

    /**
     * 设置车位组id
     *
     * @param parkgroupId 车位组id
     */
    public void setParkgroupId(Integer parkgroupId) {
        this.parkgroupId = parkgroupId;
    }

    /**
     * 获取车位价格
     *
     * @return price - 车位价格
     */
    public BigDecimal getPrice() {
        return price;
    }

    /**
     * 设置车位价格
     *
     * @param price 车位价格
     */
    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    /**
     * 获取是否正在使用(-1暂停服务，0未使用，1 使用中)
     *
     * @return status - 是否正在使用(-1暂停服务，0未使用，1 使用中)
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置是否正在使用(-1暂停服务，0未使用，1 使用中)
     *
     * @param status 是否正在使用(-1暂停服务，0未使用，1 使用中)
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取电池状态（-1异常，0正常）
     *
     * @return batteryState - 电池状态（-1异常，0正常）
     */
    public Integer getBatterystate() {
        return batterystate;
    }

    /**
     * 设置电池状态（-1异常，0正常）
     *
     * @param batterystate 电池状态（-1异常，0正常）
     */
    public void setBatterystate(Integer batterystate) {
        this.batterystate = batterystate;
    }

    /**
     * 获取异常状态吗
     *
     * @return errorCode - 异常状态吗
     */
    public Integer getErrorcode() {
        return errorcode;
    }

    /**
     * 设置异常状态吗
     *
     * @param errorcode 异常状态吗
     */
    public void setErrorcode(Integer errorcode) {
        this.errorcode = errorcode;
    }

    /**
     * 获取距离多远
     *
     * @return distance - 距离多远
     */
    public Integer getDistance() {
        return distance;
    }

    /**
     * 设置距离多远
     *
     * @param distance 距离多远
     */
    public void setDistance(Integer distance) {
        this.distance = distance;
    }

    /**
     * 获取正在使用者
     *
     * @return user_id - 正在使用者
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置正在使用者
     *
     * @param userId 正在使用者
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取车位拥有者
     *
     * @return ower_id - 车位拥有者
     */
    public Long getOwerId() {
        return owerId;
    }

    /**
     * 设置车位拥有者
     *
     * @param owerId 车位拥有者
     */
    public void setOwerId(Long owerId) {
        this.owerId = owerId;
    }

    /**
     * 获取是否是公共车位(0表示公共车位，1表示私人车位，default为0)
     *
     * @return rentStatus - 是否是公共车位(0表示公共车位，1表示私人车位，default为0)
     */
    public Integer getRentstatus() {
        return rentstatus;
    }

    /**
     * 设置是否是公共车位(0表示公共车位，1表示私人车位，default为0)
     *
     * @param rentstatus 是否是公共车位(0表示公共车位，1表示私人车位，default为0)
     */
    public void setRentstatus(Integer rentstatus) {
        this.rentstatus = rentstatus;
    }

    /**
     * 获取车位图片地址（fastDfs）
     *
     * @return picUrl - 车位图片地址（fastDfs）
     */
    public String getPicurl() {
        return picurl;
    }

    /**
     * 设置车位图片地址（fastDfs）
     *
     * @param picurl 车位图片地址（fastDfs）
     */
    public void setPicurl(String picurl) {
        this.picurl = picurl;
    }

    /**
     * 获取经度
     *
     * @return jidu - 经度
     */
    public String getJidu() {
        return jidu;
    }

    /**
     * 设置经度
     *
     * @param jidu 经度
     */
    public void setJidu(String jidu) {
        this.jidu = jidu;
    }

    /**
     * 获取纬度
     *
     * @return weidu - 纬度
     */
    public String getWeidu() {
        return weidu;
    }

    /**
     * 设置纬度
     *
     * @param weidu 纬度
     */
    public void setWeidu(String weidu) {
        this.weidu = weidu;
    }

    /**
     * 获取备用字段1
     *
     * @return key1 - 备用字段1
     */
    public String getKey1() {
        return key1;
    }

    /**
     * 设置备用字段1
     *
     * @param key1 备用字段1
     */
    public void setKey1(String key1) {
        this.key1 = key1;
    }

    /**
     * 获取备用字段2
     *
     * @return key2 - 备用字段2
     */
    public String getKey2() {
        return key2;
    }

    /**
     * 设置备用字段2
     *
     * @param key2 备用字段2
     */
    public void setKey2(String key2) {
        this.key2 = key2;
    }

    /**
     * 获取备用字段3
     *
     * @return key3 - 备用字段3
     */
    public String getKey3() {
        return key3;
    }

    /**
     * 设置备用字段3
     *
     * @param key3 备用字段3
     */
    public void setKey3(String key3) {
        this.key3 = key3;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", parkId=").append(parkId);
        sb.append(", villageId=").append(villageId);
        sb.append(", parkgroupId=").append(parkgroupId);
        sb.append(", price=").append(price);
        sb.append(", status=").append(status);
        sb.append(", batterystate=").append(batterystate);
        sb.append(", errorcode=").append(errorcode);
        sb.append(", distance=").append(distance);
        sb.append(", userId=").append(userId);
        sb.append(", owerId=").append(owerId);
        sb.append(", rentstatus=").append(rentstatus);
        sb.append(", picurl=").append(picurl);
        sb.append(", jidu=").append(jidu);
        sb.append(", weidu=").append(weidu);
        sb.append(", key1=").append(key1);
        sb.append(", key2=").append(key2);
        sb.append(", key3=").append(key3);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}