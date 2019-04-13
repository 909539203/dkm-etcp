package com.etcp.pojo;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.io.Serializable;
import java.util.Date;

@Table(name = "tb_customer")
public class TbCustomer implements Serializable {
    /**
     * 主键
     */
    @Id
    @Column(name = "customer_id")
    private String customerId;

    /**
     * 登录名
     */
    @Column(name = "login_name")
    private String loginName;

    /**
     * 登录密码
     */
    private String password;

    /**
     * 组织名
     */
    @Column(name = "org_name")
    private String orgName;

    /**
     * 状态（ 0：未审核   1：审核通过   2：审核未通过   3：关闭）
     */
    private Integer status;

    /**
     * 公司详细地址
     */
    @Column(name = "address_detail")
    private String addressDetail;

    /**
     * 公司电话
     */
    private String telephone;

    /**
     * 联系人姓名
     */
    @Column(name = "linkman_name")
    private String linkmanName;

    /**
     * 联系人电话
     */
    @Column(name = "linkman_mobile")
    private Long linkmanMobile;

    /**
     * 联系人EMAIL
     */
    @Column(name = "linkman_email")
    private String linkmanEmail;

    /**
     * 营业执照号
     */
    @Column(name = "license_number")
    private String licenseNumber;

    /**
     * 税务登记证号
     */
    @Column(name = "tax_number")
    private String taxNumber;

    /**
     * 组织机构代码
     */
    @Column(name = "org_number")
    private String orgNumber;

    /**
     * 公司LOGO图
     */
    @Column(name = "logo_pic")
    private String logoPic;

    /**
     * 创建日期
     */
    private Date created;

    /**
     * 法定代表人
     */
    @Column(name = "legal_person")
    private String legalPerson;

    /**
     * 法定代表人身份证
     */
    @Column(name = "legal_person_card_id")
    private String legalPersonCardId;

    /**
     * 开户行账号账号
     */
    @Column(name = "bank_user")
    private String bankUser;

    /**
     * 开户行
     */
    @Column(name = "bank_name")
    private String bankName;

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
     * @return customer_id - 主键
     */
    public String getCustomerId() {
        return customerId;
    }

    /**
     * 设置主键
     *
     * @param customerId 主键
     */
    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    /**
     * 获取登录名
     *
     * @return login_name - 登录名
     */
    public String getLoginName() {
        return loginName;
    }

    /**
     * 设置登录名
     *
     * @param loginName 登录名
     */
    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }

    /**
     * 获取登录密码
     *
     * @return password - 登录密码
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置登录密码
     *
     * @param password 登录密码
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取组织名
     *
     * @return org_name - 组织名
     */
    public String getOrgName() {
        return orgName;
    }

    /**
     * 设置组织名
     *
     * @param orgName 组织名
     */
    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    /**
     * 获取状态（1合法 0不合法，default为0）
     *
     * @return status - 状态（1合法 0不合法，default为0）
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置状态（1合法 0不合法，default为0）
     *
     * @param status 状态（1合法 0不合法，default为0）
     */
    public void setStatus(Integer status) {
        this.status = status;
    }

    /**
     * 获取公司详细地址
     *
     * @return address_detail - 公司详细地址
     */
    public String getAddressDetail() {
        return addressDetail;
    }

    /**
     * 设置公司详细地址
     *
     * @param addressDetail 公司详细地址
     */
    public void setAddressDetail(String addressDetail) {
        this.addressDetail = addressDetail;
    }

    /**
     * 获取公司电话
     *
     * @return telephone - 公司电话
     */
    public String getTelephone() {
        return telephone;
    }

    /**
     * 设置公司电话
     *
     * @param telephone 公司电话
     */
    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    /**
     * 获取联系人姓名
     *
     * @return linkman_name - 联系人姓名
     */
    public String getLinkmanName() {
        return linkmanName;
    }

    /**
     * 设置联系人姓名
     *
     * @param linkmanName 联系人姓名
     */
    public void setLinkmanName(String linkmanName) {
        this.linkmanName = linkmanName;
    }

    /**
     * 获取联系人电话
     *
     * @return linkman_mobile - 联系人电话
     */
    public Long getLinkmanMobile() {
        return linkmanMobile;
    }

    /**
     * 设置联系人电话
     *
     * @param linkmanMobile 联系人电话
     */
    public void setLinkmanMobile(Long linkmanMobile) {
        this.linkmanMobile = linkmanMobile;
    }

    /**
     * 获取联系人EMAIL
     *
     * @return linkman_email - 联系人EMAIL
     */
    public String getLinkmanEmail() {
        return linkmanEmail;
    }

    /**
     * 设置联系人EMAIL
     *
     * @param linkmanEmail 联系人EMAIL
     */
    public void setLinkmanEmail(String linkmanEmail) {
        this.linkmanEmail = linkmanEmail;
    }

    /**
     * 获取营业执照号
     *
     * @return license_number - 营业执照号
     */
    public String getLicenseNumber() {
        return licenseNumber;
    }

    /**
     * 设置营业执照号
     *
     * @param licenseNumber 营业执照号
     */
    public void setLicenseNumber(String licenseNumber) {
        this.licenseNumber = licenseNumber;
    }

    /**
     * 获取税务登记证号
     *
     * @return tax_number - 税务登记证号
     */
    public String getTaxNumber() {
        return taxNumber;
    }

    /**
     * 设置税务登记证号
     *
     * @param taxNumber 税务登记证号
     */
    public void setTaxNumber(String taxNumber) {
        this.taxNumber = taxNumber;
    }

    /**
     * 获取组织机构代码
     *
     * @return org_number - 组织机构代码
     */
    public String getOrgNumber() {
        return orgNumber;
    }

    /**
     * 设置组织机构代码
     *
     * @param orgNumber 组织机构代码
     */
    public void setOrgNumber(String orgNumber) {
        this.orgNumber = orgNumber;
    }

    /**
     * 获取公司LOGO图
     *
     * @return logo_pic - 公司LOGO图
     */
    public String getLogoPic() {
        return logoPic;
    }

    /**
     * 设置公司LOGO图
     *
     * @param logoPic 公司LOGO图
     */
    public void setLogoPic(String logoPic) {
        this.logoPic = logoPic;
    }

    /**
     * 获取创建日期
     *
     * @return created - 创建日期
     */
    public Date getCreated() {
        return created;
    }

    /**
     * 设置创建日期
     *
     * @param created 创建日期
     */
    public void setCreated(Date created) {
        this.created = created;
    }

    /**
     * 获取法定代表人
     *
     * @return legal_person - 法定代表人
     */
    public String getLegalPerson() {
        return legalPerson;
    }

    /**
     * 设置法定代表人
     *
     * @param legalPerson 法定代表人
     */
    public void setLegalPerson(String legalPerson) {
        this.legalPerson = legalPerson;
    }

    /**
     * 获取法定代表人身份证
     *
     * @return legal_person_card_id - 法定代表人身份证
     */
    public String getLegalPersonCardId() {
        return legalPersonCardId;
    }

    /**
     * 设置法定代表人身份证
     *
     * @param legalPersonCardId 法定代表人身份证
     */
    public void setLegalPersonCardId(String legalPersonCardId) {
        this.legalPersonCardId = legalPersonCardId;
    }

    /**
     * 获取开户行账号账号
     *
     * @return bank_user - 开户行账号账号
     */
    public String getBankUser() {
        return bankUser;
    }

    /**
     * 设置开户行账号账号
     *
     * @param bankUser 开户行账号账号
     */
    public void setBankUser(String bankUser) {
        this.bankUser = bankUser;
    }

    /**
     * 获取开户行
     *
     * @return bank_name - 开户行
     */
    public String getBankName() {
        return bankName;
    }

    /**
     * 设置开户行
     *
     * @param bankName 开户行
     */
    public void setBankName(String bankName) {
        this.bankName = bankName;
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
        sb.append(", customerId=").append(customerId);
        sb.append(", loginName=").append(loginName);
        sb.append(", password=").append(password);
        sb.append(", orgName=").append(orgName);
        sb.append(", status=").append(status);
        sb.append(", addressDetail=").append(addressDetail);
        sb.append(", telephone=").append(telephone);
        sb.append(", linkmanName=").append(linkmanName);
        sb.append(", linkmanMobile=").append(linkmanMobile);
        sb.append(", linkmanEmail=").append(linkmanEmail);
        sb.append(", licenseNumber=").append(licenseNumber);
        sb.append(", taxNumber=").append(taxNumber);
        sb.append(", orgNumber=").append(orgNumber);
        sb.append(", logoPic=").append(logoPic);
        sb.append(", created=").append(created);
        sb.append(", legalPerson=").append(legalPerson);
        sb.append(", legalPersonCardId=").append(legalPersonCardId);
        sb.append(", bankUser=").append(bankUser);
        sb.append(", bankName=").append(bankName);
        sb.append(", key1=").append(key1);
        sb.append(", key2=").append(key2);
        sb.append(", key3=").append(key3);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}