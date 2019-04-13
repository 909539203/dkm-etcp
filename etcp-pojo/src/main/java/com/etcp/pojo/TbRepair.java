package com.etcp.pojo;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_repair")
public class TbRepair implements Serializable {
    /**
     * 报修单id
     */
    @Id
    private Long id;

    /**
     * 用户id
     */
    @Column(name = "user_id")
    private Long userId;

    /**
     * 车位id
     */
    @Column(name = "park_id")
    private Long parkId;

    /**
     * 报修提交时间
     */
    @Column(name = "create_time")
    private Date createTime;

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
     * 获取报修单id
     *
     * @return id - 报修单id
     */
    public Long getId() {
        return id;
    }

    /**
     * 设置报修单id
     *
     * @param id 报修单id
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * 获取用户id
     *
     * @return user_id - 用户id
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置用户id
     *
     * @param userId 用户id
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

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
     * 获取报修提交时间
     *
     * @return create_time - 报修提交时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置报修提交时间
     *
     * @param createTime 报修提交时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
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
        sb.append(", userId=").append(userId);
        sb.append(", parkId=").append(parkId);
        sb.append(", createTime=").append(createTime);
        sb.append(", key1=").append(key1);
        sb.append(", key2=").append(key2);
        sb.append(", key3=").append(key3);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}