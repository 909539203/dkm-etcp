package com.etcp.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_rent_log")
public class TbRentLog implements Serializable {
    @Id
    private Long id;

    @Column(name = "ower_id")
    private Long owerId;

    @Column(name = "park_id")
    private Long parkId;

    @Column(name = "put_time")
    private Date putTime;

    private Integer status;

    @Column(name = "in_time")
    private Date inTime;

    @Column(name = "out_time")
    private Date outTime;

    private Integer time;

    private BigDecimal money;

    private String key1;

    private String key2;

    private String key3;

    private static final long serialVersionUID = 1L;

    /**
     * @return id
     */
    public Long getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * @return ower_id
     */
    public Long getOwerId() {
        return owerId;
    }

    /**
     * @param owerId
     */
    public void setOwerId(Long owerId) {
        this.owerId = owerId;
    }

    /**
     * @return park_id
     */
    public Long getParkId() {
        return parkId;
    }

    /**
     * @param parkId
     */
    public void setParkId(Long parkId) {
        this.parkId = parkId;
    }

    /**
     * @return put_time
     */
    public Date getPutTime() {
        return putTime;
    }

    /**
     * @param putTime
     */
    public void setPutTime(Date putTime) {
        this.putTime = putTime;
    }

    /**
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * @param status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * @return in_time
     */
    public Date getInTime() {
        return inTime;
    }

    /**
     * @param inTime
     */
    public void setInTime(Date inTime) {
        this.inTime = inTime;
    }

    /**
     * @return out_time
     */
    public Date getOutTime() {
        return outTime;
    }

    /**
     * @param outTime
     */
    public void setOutTime(Date outTime) {
        this.outTime = outTime;
    }

    /**
     * @return time
     */
    public Integer getTime() {
        return time;
    }

    /**
     * @param time
     */
    public void setTime(Integer time) {
        this.time = time;
    }

    /**
     * @return money
     */
    public BigDecimal getMoney() {
        return money;
    }

    /**
     * @param money
     */
    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    /**
     * @return key1
     */
    public String getKey1() {
        return key1;
    }

    /**
     * @param key1
     */
    public void setKey1(String key1) {
        this.key1 = key1;
    }

    /**
     * @return key2
     */
    public String getKey2() {
        return key2;
    }

    /**
     * @param key2
     */
    public void setKey2(String key2) {
        this.key2 = key2;
    }

    /**
     * @return key3
     */
    public String getKey3() {
        return key3;
    }

    /**
     * @param key3
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
        sb.append(", owerId=").append(owerId);
        sb.append(", parkId=").append(parkId);
        sb.append(", putTime=").append(putTime);
        sb.append(", status=").append(status);
        sb.append(", inTime=").append(inTime);
        sb.append(", outTime=").append(outTime);
        sb.append(", time=").append(time);
        sb.append(", money=").append(money);
        sb.append(", key1=").append(key1);
        sb.append(", key2=").append(key2);
        sb.append(", key3=").append(key3);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}