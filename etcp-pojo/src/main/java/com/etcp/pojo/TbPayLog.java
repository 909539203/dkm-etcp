package com.etcp.pojo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Table(name = "tb_pay_log")
public class TbPayLog implements Serializable {
    /**
     * 支付订单号
     */
    @Id
    @Column(name = "pay_id")
    private Long payId;

    /**
     * 创建日期
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 支付时间
     */
    @Column(name = "pay_time")
    private Date payTime;

    /**
     * 支付金额
     */
    @Column(name = "total_fee")
    private BigDecimal totalFee;

    /**
     * 用户id
     */
    @Column(name = "user_id")
    private Long userId;

    /**
     * 交易状态(1成功，2是失败)
     */
    @Column(name = "trade_state")
    private Integer tradeState;

    /**
     * 订单id
     */
    @Column(name = "order_id")
    private Long orderId;

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
     * 获取支付订单号
     *
     * @return pay_id - 支付订单号
     */
    public Long getPayId() {
        return payId;
    }

    /**
     * 设置支付订单号
     *
     * @param payId 支付订单号
     */
    public void setPayId(Long payId) {
        this.payId = payId;
    }

    /**
     * 获取创建日期
     *
     * @return create_time - 创建日期
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建日期
     *
     * @param createTime 创建日期
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取支付时间
     *
     * @return pay_time - 支付时间
     */
    public Date getPayTime() {
        return payTime;
    }

    /**
     * 设置支付时间
     *
     * @param payTime 支付时间
     */
    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    /**
     * 获取支付金额
     *
     * @return total_fee - 支付金额
     */
    public BigDecimal getTotalFee() {
        return totalFee;
    }

    /**
     * 设置支付金额
     *
     * @param totalFee 支付金额
     */
    public void setTotalFee(BigDecimal totalFee) {
        this.totalFee = totalFee;
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
     * 获取交易状态(1成功，2是失败)
     *
     * @return trade_state - 交易状态(1成功，2是失败)
     */
    public Integer getTradeState() {
        return tradeState;
    }

    /**
     * 设置交易状态(1成功，2是失败)
     *
     * @param tradeState 交易状态(1成功，2是失败)
     */
    public void setTradeState(Integer tradeState) {
        this.tradeState = tradeState;
    }

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
        sb.append(", payId=").append(payId);
        sb.append(", createTime=").append(createTime);
        sb.append(", payTime=").append(payTime);
        sb.append(", totalFee=").append(totalFee);
        sb.append(", userId=").append(userId);
        sb.append(", tradeState=").append(tradeState);
        sb.append(", orderId=").append(orderId);
        sb.append(", key1=").append(key1);
        sb.append(", key2=").append(key2);
        sb.append(", key3=").append(key3);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}