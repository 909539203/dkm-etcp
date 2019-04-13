package com.etcp.pojo;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "tb_parkgroup")
public class TbParkgroup implements Serializable {
    /**
     * 车位组id
     */
    @Id
    @Column(name = "groupId")
    private Long groupid;

    /**
     * 车位组的经度
     */
    private String latitude;

    /**
     * 车位组的纬度
     */
    private String longtitude;

    private static final long serialVersionUID = 1L;

    /**
     * 获取车位组id
     *
     * @return groupId - 车位组id
     */
    public Long getGroupid() {
        return groupid;
    }

    /**
     * 设置车位组id
     *
     * @param groupid 车位组id
     */
    public void setGroupid(Long groupid) {
        this.groupid = groupid;
    }

    /**
     * 获取车位组的经度
     *
     * @return latitude - 车位组的经度
     */
    public String getLatitude() {
        return latitude;
    }

    /**
     * 设置车位组的经度
     *
     * @param latitude 车位组的经度
     */
    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    /**
     * 获取车位组的纬度
     *
     * @return longtitude - 车位组的纬度
     */
    public String getLongtitude() {
        return longtitude;
    }

    /**
     * 设置车位组的纬度
     *
     * @param longtitude 车位组的纬度
     */
    public void setLongtitude(String longtitude) {
        this.longtitude = longtitude;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", groupid=").append(groupid);
        sb.append(", latitude=").append(latitude);
        sb.append(", longtitude=").append(longtitude);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}