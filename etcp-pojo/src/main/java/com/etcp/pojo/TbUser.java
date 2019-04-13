package com.etcp.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_user")
public class TbUser implements Serializable {
    /**
     * 主键
     */
    @Id
    @Column(name = "user_id")
    private Long userId;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码
     */
    private String password;

    /**
     * 性别
     */
    private Integer gender;

    /**
     * 电话
     */
    private Long mobile;

    /**
     * 创建时间
     */
    private Date created;

    /**
     * 车牌号
     */
    @Column(name = "carNo")
    private Long carno;

    /**
     * 关联车牌号（数组）
     */
    @Column(name = "relatedNo")
    private String relatedno;

    /**
     * 驾驶证
     */
    @Column(name = "driving_id")
    private Long drivingId;

    /**
     * 注册时间
     */
    @Column(name = "regTime")
    private Date regtime;

    /**
     * 登录时间
     */
    @Column(name = "loginTime")
    private Date logintime;

    /**
     * 是否实名认证(1认证，0未认证，default为0)
     */
    @Column(name = "isRealName")
    private Integer isrealname;

    /**
     * 使用状态（1正常 0非正常）
     */
    private Integer status;

    /**
     * 头像地址（默认根据性别选取图片
     */
    @Column(name = "head_pic")
    private String headPic;

    /**
     * 微信是否绑定（0否，1是，default为0）
     */
    @Column(name = "weixinStatus")
    private Integer weixinstatus;

    /**
     * 微信号
     */
    private String weixin;

    /**
     * 邮箱状态
     */
    @Column(name = "emailStatus")
    private Integer emailstatus;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 账户余额（default为0.00）
     */
    private BigDecimal acccount;

    /**
     * 会员等级（default为1级）
     */
    private Integer level;

    /**
     * 积分（default为0分）
     */
    private Integer points;

    /**
     * 上一次登录时间
     */
    @Column(name = "lastTime")
    private Date lasttime;

    /**
     * 是否购买车位（1有车位，0没有车位，default为0）
     */
    @Column(name = "havaPark")
    private Integer havapark;

    /**
     * 拥有车位数量
     */
    private Integer num;

    /**
     * 是否出租车位(0表示未出租，1表示出租)
     */
    @Column(name = "rentPark")
    private Integer rentpark;

    /**
     * 0：未审核   1：已审核   2：审核未通过   3：关闭
     */
    @Column(name = "isCheck")
    private Integer ischeck;

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
     * @return user_id - 主键
     */
    public Long getUserId() {
        return userId;
    }

    /**
     * 设置主键
     *
     * @param userId 主键
     */
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    /**
     * 获取用户名
     *
     * @return username - 用户名
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置用户名
     *
     * @param username 用户名
     */
    public void setUsername(String username) {
        this.username = username;
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
     * 获取性别
     *
     * @return gender - 性别
     */
    public Integer getGender() {
        return gender;
    }

    /**
     * 设置性别
     *
     * @param gender 性别
     */
    public void setGender(Integer gender) {
        this.gender = gender;
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
     * 获取车牌号
     *
     * @return carNo - 车牌号
     */
    public Long getCarno() {
        return carno;
    }

    /**
     * 设置车牌号
     *
     * @param carno 车牌号
     */
    public void setCarno(Long carno) {
        this.carno = carno;
    }

    /**
     * 获取关联车牌号（数组）
     *
     * @return relatedNo - 关联车牌号（数组）
     */
    public String getRelatedno() {
        return relatedno;
    }

    /**
     * 设置关联车牌号（数组）
     *
     * @param relatedno 关联车牌号（数组）
     */
    public void setRelatedno(String relatedno) {
        this.relatedno = relatedno;
    }

    /**
     * 获取驾驶证
     *
     * @return driving_id - 驾驶证
     */
    public Long getDrivingId() {
        return drivingId;
    }

    /**
     * 设置驾驶证
     *
     * @param drivingId 驾驶证
     */
    public void setDrivingId(Long drivingId) {
        this.drivingId = drivingId;
    }

    /**
     * 获取注册时间
     *
     * @return regTime - 注册时间
     */
    public Date getRegtime() {
        return regtime;
    }

    /**
     * 设置注册时间
     *
     * @param regtime 注册时间
     */
    public void setRegtime(Date regtime) {
        this.regtime = regtime;
    }

    /**
     * 获取登录时间
     *
     * @return loginTime - 登录时间
     */
    public Date getLogintime() {
        return logintime;
    }

    /**
     * 设置登录时间
     *
     * @param logintime 登录时间
     */
    public void setLogintime(Date logintime) {
        this.logintime = logintime;
    }

    /**
     * 获取是否实名认证(1认证，0未认证，default为0)
     *
     * @return isRealName - 是否实名认证(1认证，0未认证，default为0)
     */
    public Integer getIsrealname() {
        return isrealname;
    }

    /**
     * 设置是否实名认证(1认证，0未认证，default为0)
     *
     * @param isrealname 是否实名认证(1认证，0未认证，default为0)
     */
    public void setIsrealname(Integer isrealname) {
        this.isrealname = isrealname;
    }

    /**
     * 获取使用状态（1正常 0非正常）
     *
     * @return status - 使用状态（1正常 0非正常）
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置使用状态（1正常 0非正常）
     *
     * @param status 使用状态（1正常 0非正常）
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取头像地址（默认根据性别选取图片
     *
     * @return head_pic - 头像地址（默认根据性别选取图片
     */
    public String getHeadPic() {
        return headPic;
    }

    /**
     * 设置头像地址（默认根据性别选取图片
     *
     * @param headPic 头像地址（默认根据性别选取图片
     */
    public void setHeadPic(String headPic) {
        this.headPic = headPic;
    }

    /**
     * 获取微信是否绑定（0否，1是，default为0）
     *
     * @return weixinStatus - 微信是否绑定（0否，1是，default为0）
     */
    public Integer getWeixinstatus() {
        return weixinstatus;
    }

    /**
     * 设置微信是否绑定（0否，1是，default为0）
     *
     * @param weixinstatus 微信是否绑定（0否，1是，default为0）
     */
    public void setWeixinstatus(Integer weixinstatus) {
        this.weixinstatus = weixinstatus;
    }

    /**
     * 获取微信号
     *
     * @return weixin - 微信号
     */
    public String getWeixin() {
        return weixin;
    }

    /**
     * 设置微信号
     *
     * @param weixin 微信号
     */
    public void setWeixin(String weixin) {
        this.weixin = weixin;
    }

    /**
     * 获取邮箱状态
     *
     * @return emailStatus - 邮箱状态
     */
    public Integer getEmailstatus() {
        return emailstatus;
    }

    /**
     * 设置邮箱状态
     *
     * @param emailstatus 邮箱状态
     */
    public void setEmailstatus(Integer emailstatus) {
        this.emailstatus = emailstatus;
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
     * 获取账户余额（default为0.00）
     *
     * @return acccount - 账户余额（default为0.00）
     */
    public BigDecimal getAcccount() {
        return acccount;
    }

    /**
     * 设置账户余额（default为0.00）
     *
     * @param acccount 账户余额（default为0.00）
     */
    public void setAcccount(BigDecimal acccount) {
        this.acccount = acccount;
    }

    /**
     * 获取会员等级（default为1级）
     *
     * @return level - 会员等级（default为1级）
     */
    public Integer getLevel() {
        return level;
    }

    /**
     * 设置会员等级（default为1级）
     *
     * @param level 会员等级（default为1级）
     */
    public void setLevel(Integer level) {
        this.level = level;
    }

    /**
     * 获取积分（default为0分）
     *
     * @return points - 积分（default为0分）
     */
    public Integer getPoints() {
        return points;
    }

    /**
     * 设置积分（default为0分）
     *
     * @param points 积分（default为0分）
     */
    public void setPoints(Integer points) {
        this.points = points;
    }

    /**
     * 获取上一次登录时间
     *
     * @return lastTime - 上一次登录时间
     */
    public Date getLasttime() {
        return lasttime;
    }

    /**
     * 设置上一次登录时间
     *
     * @param lasttime 上一次登录时间
     */
    public void setLasttime(Date lasttime) {
        this.lasttime = lasttime;
    }

    /**
     * 获取是否购买车位（1有车位，0没有车位，default为0）
     *
     * @return havaPark - 是否购买车位（1有车位，0没有车位，default为0）
     */
    public Integer getHavapark() {
        return havapark;
    }

    /**
     * 设置是否购买车位（1有车位，0没有车位，default为0）
     *
     * @param havapark 是否购买车位（1有车位，0没有车位，default为0）
     */
    public void setHavapark(Integer havapark) {
        this.havapark = havapark;
    }

    /**
     * 获取拥有车位数量
     *
     * @return num - 拥有车位数量
     */
    public Integer getNum() {
        return num;
    }

    /**
     * 设置拥有车位数量
     *
     * @param num 拥有车位数量
     */
    public void setNum(Integer num) {
        this.num = num;
    }

    /**
     * 获取是否出租车位(0表示未出租，1表示出租)
     *
     * @return rentPark - 是否出租车位(0表示未出租，1表示出租)
     */
    public Integer getRentpark() {
        return rentpark;
    }

    /**
     * 设置是否出租车位(0表示未出租，1表示出租)
     *
     * @param rentpark 是否出租车位(0表示未出租，1表示出租)
     */
    public void setRentpark(Integer rentpark) {
        this.rentpark = rentpark;
    }

    /**
     * 获取0：未审核   1：已审核   2：审核未通过   3：关闭
     *
     * @return isCheck - 0：未审核   1：已审核   2：审核未通过   3：关闭
     */
    public Integer getIscheck() {
        return ischeck;
    }

    /**
     * 设置0：未审核   1：已审核   2：审核未通过   3：关闭
     *
     * @param ischeck 0：未审核   1：已审核   2：审核未通过   3：关闭
     */
    public void setIscheck(Integer ischeck) {
        this.ischeck = ischeck;
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
        sb.append(", userId=").append(userId);
        sb.append(", username=").append(username);
        sb.append(", password=").append(password);
        sb.append(", gender=").append(gender);
        sb.append(", mobile=").append(mobile);
        sb.append(", created=").append(created);
        sb.append(", carno=").append(carno);
        sb.append(", relatedno=").append(relatedno);
        sb.append(", drivingId=").append(drivingId);
        sb.append(", regtime=").append(regtime);
        sb.append(", logintime=").append(logintime);
        sb.append(", isrealname=").append(isrealname);
        sb.append(", status=").append(status);
        sb.append(", headPic=").append(headPic);
        sb.append(", weixinstatus=").append(weixinstatus);
        sb.append(", weixin=").append(weixin);
        sb.append(", emailstatus=").append(emailstatus);
        sb.append(", email=").append(email);
        sb.append(", acccount=").append(acccount);
        sb.append(", level=").append(level);
        sb.append(", points=").append(points);
        sb.append(", lasttime=").append(lasttime);
        sb.append(", havapark=").append(havapark);
        sb.append(", num=").append(num);
        sb.append(", rentpark=").append(rentpark);
        sb.append(", ischeck=").append(ischeck);
        sb.append(", key1=").append(key1);
        sb.append(", key2=").append(key2);
        sb.append(", key3=").append(key3);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}