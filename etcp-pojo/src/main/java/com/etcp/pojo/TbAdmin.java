package com.etcp.pojo;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Table(name = "tb_admin")
public class TbAdmin implements Serializable {
    /**
     * 主键
     */
    @Id
    @Column(name = "admin_id")
    private Long adminId;

    /**
     * 姓名
     */
    private String name;

    /**
     * 密码
     */
    private String password;

    /**
     * 电话
     */
    private Long mobile;

    /**
     * 性别（1男，0女）
     */
    private Integer gender;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 创建时间
     */
    private Date created;

    /**
     * 上次登录时间
     */
    @Column(name = "lastLogin")
    private Date lastlogin;

    /**
     * 管理员级别（0超级管理员，1普通管理员）
     */
    private Integer rank;

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
     * 获取主键
     *
     * @return admin_id - 主键
     */
    public Long getAdminId() {
        return adminId;
    }

    /**
     * 设置主键
     *
     * @param adminId 主键
     */
    public void setAdminId(Long adminId) {
        this.adminId = adminId;
    }

    /**
     * 获取姓名
     *
     * @return name - 姓名
     */
    public String getName() {
        return name;
    }

    /**
     * 设置姓名
     *
     * @param name 姓名
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取密码
     *
     * @return password - 密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置密码
     *
     * @param password 密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取电话
     *
     * @return mobile - 电话
     */
    public Long getMobile() {
        return mobile;
    }

    /**
     * 设置电话
     *
     * @param mobile 电话
     */
    public void setMobile(Long mobile) {
        this.mobile = mobile;
    }

    /**
     * 获取性别（1男，0女）
     *
     * @return gender - 性别（1男，0女）
     */
    public Integer getGender() {
        return gender;
    }

    /**
     * 设置性别（1男，0女）
     *
     * @param gender 性别（1男，0女）
     */
    public void setGender(Integer gender) {
        this.gender = gender;
    }

    /**
     * 获取邮箱
     *
     * @return email - 邮箱
     */
    public String getEmail() {
        return email;
    }

    /**
     * 设置邮箱
     *
     * @param email 邮箱
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * 获取创建时间
     *
     * @return created - 创建时间
     */
    public Date getCreated() {
        return created;
    }

    /**
     * 设置创建时间
     *
     * @param created 创建时间
     */
    public void setCreated(Date created) {
        this.created = created;
    }

    /**
     * 获取上次登录时间
     *
     * @return lastLogin - 上次登录时间
     */
    public Date getLastlogin() {
        return lastlogin;
    }

    /**
     * 设置上次登录时间
     *
     * @param lastlogin 上次登录时间
     */
    public void setLastlogin(Date lastlogin) {
        this.lastlogin = lastlogin;
    }

    /**
     * 获取管理员级别（0超级管理员，1普通管理员）
     *
     * @return rank - 管理员级别（0超级管理员，1普通管理员）
     */
    public Integer getRank() {
        return rank;
    }

    /**
     * 设置管理员级别（0超级管理员，1普通管理员）
     *
     * @param rank 管理员级别（0超级管理员，1普通管理员）
     */
    public void setRank(Integer rank) {
        this.rank = rank;
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
        sb.append(", adminId=").append(adminId);
        sb.append(", name=").append(name);
        sb.append(", password=").append(password);
        sb.append(", mobile=").append(mobile);
        sb.append(", gender=").append(gender);
        sb.append(", email=").append(email);
        sb.append(", created=").append(created);
        sb.append(", lastlogin=").append(lastlogin);
        sb.append(", rank=").append(rank);
        sb.append(", key1=").append(key1);
        sb.append(", key2=").append(key2);
        sb.append(", key3=").append(key3);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}