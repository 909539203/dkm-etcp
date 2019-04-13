package com.etcp.pojo;

import java.io.Serializable;
import javax.persistence.*;

@Table(name = "tb_village")
public class TbVillage implements Serializable {
    /**
     * 区域id
     */
    @Id
    private Long villageid;

    /**
     * 区域名称
     */
    @Column(name = "villageName")
    private String villagename;

    /**
     * 车位数量
     */
    private Integer num;

    /**
     * 区划id
     */
    private Long cityid;

    private static final long serialVersionUID = 1L;

    /**
     * 获取区域id
     *
     * @return villageid - 区域id
     */
    public Long getVillageid() {
        return villageid;
    }

    /**
     * 设置区域id
     *
     * @param villageid 区域id
     */
    public void setVillageid(Long villageid) {
        this.villageid = villageid;
    }

    /**
     * 获取区域名称
     *
     * @return villageName - 区域名称
     */
    public String getVillagename() {
        return villagename;
    }

    /**
     * 设置区域名称
     *
     * @param villagename 区域名称
     */
    public void setVillagename(String villagename) {
        this.villagename = villagename;
    }

    /**
     * 获取车位数量
     *
     * @return num - 车位数量
     */
    public Integer getNum() {
        return num;
    }

    /**
     * 设置车位数量
     *
     * @param num 车位数量
     */
    public void setNum(Integer num) {
        this.num = num;
    }

    /**
     * 获取区划id
     *
     * @return cityid - 区划id
     */
    public Long getCityid() {
        return cityid;
    }

    /**
     * 设置区划id
     *
     * @param cityid 区划id
     */
    public void setCityid(Long cityid) {
        this.cityid = cityid;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", villageid=").append(villageid);
        sb.append(", villagename=").append(villagename);
        sb.append(", num=").append(num);
        sb.append(", cityid=").append(cityid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}