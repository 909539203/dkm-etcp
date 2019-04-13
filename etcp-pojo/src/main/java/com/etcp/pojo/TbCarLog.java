package com.etcp.pojo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_car_log")
public class TbCarLog implements Serializable {
    /**
     * 车辆日志id
     */
    @Id
    private Long id;

    /**
     * 车辆id
     */
    @Column(name = "car_id")
    private Long carId;

    /**
     * 入杆扫描时间
     */
    @Column(name = "indoorTime")
    private Date indoortime;

    /**
     * 出杆扫描时间
     */
    @Column(name = "outdoorTime")
    private Date outdoortime;

    /**
     * 停车时间
     */
    private Integer time;

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
     * 获取车辆日志id
     *
     * @return id - 车辆日志id
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置车辆日志id
     *
     * @param id 车辆日志id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取车辆id
     *
     * @return car_id - 车辆id
     */
    public Long getCarId() {
        return carId;
    }

    /**
     * 设置车辆id
     *
     * @param carId 车辆id
     */
    public void setCarId(Long carId) {
        this.carId = carId;
    }

    /**
     * 获取入杆扫描时间
     *
     * @return indoorTime - 入杆扫描时间
     */
    public Date getIndoortime() {
        return indoortime;
    }

    /**
     * 设置入杆扫描时间
     *
     * @param indoortime 入杆扫描时间
     */
    public void setIndoortime(Date indoortime) {
        this.indoortime = indoortime;
    }

    /**
     * 获取出杆扫描时间
     *
     * @return outdoorTime - 出杆扫描时间
     */
    public Date getOutdoortime() {
        return outdoortime;
    }

    /**
     * 设置出杆扫描时间
     *
     * @param outdoortime 出杆扫描时间
     */
    public void setOutdoortime(Date outdoortime) {
        this.outdoortime = outdoortime;
    }

    /**
     * 获取停车时间
     *
     * @return time - 停车时间
     */
    public Integer getTime() {
        return time;
    }

    /**
     * 设置停车时间
     *
     * @param time 停车时间
     */
    public void setTime(Integer time) {
        this.time = time;
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
        sb.append(", id=").append(id);
        sb.append(", carId=").append(carId);
        sb.append(", indoortime=").append(indoortime);
        sb.append(", outdoortime=").append(outdoortime);
        sb.append(", time=").append(time);
        sb.append(", key1=").append(key1);
        sb.append(", key2=").append(key2);
        sb.append(", key3=").append(key3);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}