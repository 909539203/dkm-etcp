package com.etcp.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_order")
public class TbOrder implements Serializable {
    /**
     * 订单id
     */
    @Id
    @Column(name = "order_id")
    private Long orderId;

    /**
     * 订单创建时间（预约时间）
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 入场时间（开锁时间）
     */
    @Column(name = "in_time")
    private Date inTime;

    /**
     * 出场时间
     */
    @Column(name = "out_time")
    private Date outTime;

    /**
     * 订单关闭时间(支付完成时间)
     */
    @Column(name = "close_time")
    private Date closeTime;

    /**
     * 订单支付时间
     */
    @Column(name = "payment_time")
    private Date paymentTime;

    /**
     * 订单超时（1 超时，0 未超时）
     */
    @Column(name = "isOvertime")
    private Integer isovertime;

    /**
     * 超时时长
     */
    private Integer overtime;

    /**
     * 时长(payment_time - enter_time )
     */
    @Column(name = "timeLength")
    private String timelength;

    /**
     * 支付金额，精确到分（如:100.07，表示:100元7分）
     */
    private BigDecimal payment;

    /**
     * 支付方式(0银联，1微信，2支付宝)
     */
    @Column(name = "payment_type")
    private Integer paymentType;

    /**
     * 状态（0 表示未支付，1表示已支付）
     */
    private Integer status;

    /**
     * 担保费
     */
    private BigDecimal guarantee;

    /**
     * 用户id
     */
    @Column(name = "user_id")
    private Long userId;

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
     * 获取订单id
     *
     * @return order_id - 订单id
     */
    public Long getOrderId() {
        return orderId;
    }

    /**
     * 设置订单id
     *
     * @param orderId 订单id
     */
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    /**
     * 获取订单创建时间（预约时间）
     *
     * @return create_time - 订单创建时间（预约时间）
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置订单创建时间（预约时间）
     *
     * @param createTime 订单创建时间（预约时间）
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取入场时间（开锁时间）
     *
     * @return in_time - 入场时间（开锁时间）
     */
    public Date getInTime() {
        return inTime;
    }

    /**
     * 设置入场时间（开锁时间）
     *
     * @param inTime 入场时间（开锁时间）
     */
    public void setInTime(Date inTime) {
        this.inTime = inTime;
    }

    /**
     * 获取出场时间
     *
     * @return out_time - 出场时间
     */
    public Date getOutTime() {
        return outTime;
    }

    /**
     * 设置出场时间
     *
     * @param outTime 出场时间
     */
    public void setOutTime(Date outTime) {
        this.outTime = outTime;
    }

    /**
     * 获取订单关闭时间(支付完成时间)
     *
     * @return close_time - 订单关闭时间(支付完成时间)
     */
    public Date getCloseTime() {
        return closeTime;
    }

    /**
     * 设置订单关闭时间(支付完成时间)
     *
     * @param closeTime 订单关闭时间(支付完成时间)
     */
    public void setCloseTime(Date closeTime) {
        this.closeTime = closeTime;
    }

    /**
     * 获取订单支付时间
     *
     * @return payment_time - 订单支付时间
     */
    public Date getPaymentTime() {
        return paymentTime;
    }

    /**
     * 设置订单支付时间
     *
     * @param paymentTime 订单支付时间
     */
    public void setPaymentTime(Date paymentTime) {
        this.paymentTime = paymentTime;
    }

    /**
     * 获取订单超时（1 超时，0 未超时）
     *
     * @return isOvertime - 订单超时（1 超时，0 未超时）
     */
    public Integer getIsovertime() {
        return isovertime;
    }

    /**
     * 设置订单超时（1 超时，0 未超时）
     *
     * @param isovertime 订单超时（1 超时，0 未超时）
     */
    public void setIsovertime(Integer isovertime) {
        this.isovertime = isovertime;
    }

    /**
     * 获取超时时长
     *
     * @return overtime - 超时时长
     */
    public Integer getOvertime() {
        return overtime;
    }

    /**
     * 设置超时时长
     *
     * @param overtime 超时时长
     */
    public void setOvertime(Integer overtime) {
        this.overtime = overtime;
    }

    /**
     * 获取时长(payment_time - enter_time )
     *
     * @return timeLength - 时长(payment_time - enter_time )
     */
    public String getTimelength() {
        return timelength;
    }

    /**
     * 设置时长(payment_time - enter_time )
     *
     * @param timelength 时长(payment_time - enter_time )
     */
    public void setTimelength(String timelength) {
        this.timelength = timelength;
    }

    /**
     * 获取支付金额，精确到分（如:100.07，表示:100元7分）
     *
     * @return payment - 支付金额，精确到分（如:100.07，表示:100元7分）
     */
    public BigDecimal getPayment() {
        return payment;
    }

    /**
     * 设置支付金额，精确到分（如:100.07，表示:100元7分）
     *
     * @param payment 支付金额，精确到分（如:100.07，表示:100元7分）
     */
    public void setPayment(BigDecimal payment) {
        this.payment = payment;
    }

    /**
     * 获取支付方式(0银联，1微信，2支付宝)
     *
     * @return payment_type - 支付方式(0银联，1微信，2支付宝)
     */
    public Integer getPaymentType() {
        return paymentType;
    }

    /**
     * 设置支付方式(0银联，1微信，2支付宝)
     *
     * @param paymentType 支付方式(0银联，1微信，2支付宝)
     */
    public void setPaymentType(Integer paymentType) {
        this.paymentType = paymentType;
    }

    /**
     * 获取状态（0 表示未支付，1表示已支付）
     *
     * @return status - 状态（0 表示未支付，1表示已支付）
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置状态（0 表示未支付，1表示已支付）
     *
     * @param status 状态（0 表示未支付，1表示已支付）
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取担保费
     *
     * @return guarantee - 担保费
     */
    public BigDecimal getGuarantee() {
        return guarantee;
    }

    /**
     * 设置担保费
     *
     * @param guarantee 担保费
     */
    public void setGuarantee(BigDecimal guarantee) {
        this.guarantee = guarantee;
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
        sb.append(", orderId=").append(orderId);
        sb.append(", createTime=").append(createTime);
        sb.append(", inTime=").append(inTime);
        sb.append(", outTime=").append(outTime);
        sb.append(", closeTime=").append(closeTime);
        sb.append(", paymentTime=").append(paymentTime);
        sb.append(", isovertime=").append(isovertime);
        sb.append(", overtime=").append(overtime);
        sb.append(", timelength=").append(timelength);
        sb.append(", payment=").append(payment);
        sb.append(", paymentType=").append(paymentType);
        sb.append(", status=").append(status);
        sb.append(", guarantee=").append(guarantee);
        sb.append(", userId=").append(userId);
        sb.append(", key1=").append(key1);
        sb.append(", key2=").append(key2);
        sb.append(", key3=").append(key3);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}