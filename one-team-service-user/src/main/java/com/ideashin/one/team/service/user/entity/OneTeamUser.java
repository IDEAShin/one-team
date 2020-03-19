package com.ideashin.one.team.service.user.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Table(name = "one_team_user")
public class OneTeamUser {
    /**
     * 系统前台用户表
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 用户登陆账号
     */
    private String account;

    /**
     * 登陆密码，32位加密串
     */
    private String password;

    /**
     * 用户昵称
     */
    private String name;

    /**
     * 手机
     */
    private String mobile;

    /**
     * 真实姓名
     */
    private String realname;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private String createTime;

    /**
     * 状态
     */
    private Boolean status;

    /**
     * 上次登录时间
     */
    @Column(name = "last_login_time")
    private String lastLoginTime;

    /**
     * 性别
     */
    private String sex;

    /**
     * 头像
     */
    private String avatar;

    /**
     * 身份证
     */
    private String idcard;

    /**
     * 省
     */
    private Integer province;

    /**
     * 市
     */
    private Integer city;

    /**
     * 区
     */
    private Integer area;

    /**
     * 所在地址
     */
    private String address;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 编号
     */
    private String code;

    /**
     * 钉钉openid
     */
    @Column(name = "dingtalk_openid")
    private String dingtalkOpenid;

    /**
     * 钉钉unionid
     */
    @Column(name = "dingtalk_unionid")
    private String dingtalkUnionid;

    /**
     * 钉钉用户id
     */
    @Column(name = "dingtalk_userid")
    private String dingtalkUserid;

    /**
     * 备注
     */
    private String description;

    /**
     * 获取系统前台用户表
     *
     * @return id - 系统前台用户表
     */
    public Integer getId() {
        return id;
    }

    /**
     * 设置系统前台用户表
     *
     * @param id 系统前台用户表
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * 获取用户登陆账号
     *
     * @return account - 用户登陆账号
     */
    public String getAccount() {
        return account;
    }

    /**
     * 设置用户登陆账号
     *
     * @param account 用户登陆账号
     */
    public void setAccount(String account) {
        this.account = account;
    }

    /**
     * 获取登陆密码，32位加密串
     *
     * @return password - 登陆密码，32位加密串
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置登陆密码，32位加密串
     *
     * @param password 登陆密码，32位加密串
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取用户昵称
     *
     * @return name - 用户昵称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置用户昵称
     *
     * @param name 用户昵称
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取手机
     *
     * @return mobile - 手机
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * 设置手机
     *
     * @param mobile 手机
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * 获取真实姓名
     *
     * @return realname - 真实姓名
     */
    public String getRealname() {
        return realname;
    }

    /**
     * 设置真实姓名
     *
     * @param realname 真实姓名
     */
    public void setRealname(String realname) {
        this.realname = realname;
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public String getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取状态
     *
     * @return status - 状态
     */
    public Boolean getStatus() {
        return status;
    }

    /**
     * 设置状态
     *
     * @param status 状态
     */
    public void setStatus(Boolean status) {
        this.status = status;
    }

    /**
     * 获取上次登录时间
     *
     * @return last_login_time - 上次登录时间
     */
    public String getLastLoginTime() {
        return lastLoginTime;
    }

    /**
     * 设置上次登录时间
     *
     * @param lastLoginTime 上次登录时间
     */
    public void setLastLoginTime(String lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    /**
     * 获取性别
     *
     * @return sex - 性别
     */
    public String getSex() {
        return sex;
    }

    /**
     * 设置性别
     *
     * @param sex 性别
     */
    public void setSex(String sex) {
        this.sex = sex;
    }

    /**
     * 获取头像
     *
     * @return avatar - 头像
     */
    public String getAvatar() {
        return avatar;
    }

    /**
     * 设置头像
     *
     * @param avatar 头像
     */
    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    /**
     * 获取身份证
     *
     * @return idcard - 身份证
     */
    public String getIdcard() {
        return idcard;
    }

    /**
     * 设置身份证
     *
     * @param idcard 身份证
     */
    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    /**
     * 获取省
     *
     * @return province - 省
     */
    public Integer getProvince() {
        return province;
    }

    /**
     * 设置省
     *
     * @param province 省
     */
    public void setProvince(Integer province) {
        this.province = province;
    }

    /**
     * 获取市
     *
     * @return city - 市
     */
    public Integer getCity() {
        return city;
    }

    /**
     * 设置市
     *
     * @param city 市
     */
    public void setCity(Integer city) {
        this.city = city;
    }

    /**
     * 获取区
     *
     * @return area - 区
     */
    public Integer getArea() {
        return area;
    }

    /**
     * 设置区
     *
     * @param area 区
     */
    public void setArea(Integer area) {
        this.area = area;
    }

    /**
     * 获取所在地址
     *
     * @return address - 所在地址
     */
    public String getAddress() {
        return address;
    }

    /**
     * 设置所在地址
     *
     * @param address 所在地址
     */
    public void setAddress(String address) {
        this.address = address;
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
     * 获取编号
     *
     * @return code - 编号
     */
    public String getCode() {
        return code;
    }

    /**
     * 设置编号
     *
     * @param code 编号
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * 获取钉钉openid
     *
     * @return dingtalk_openid - 钉钉openid
     */
    public String getDingtalkOpenid() {
        return dingtalkOpenid;
    }

    /**
     * 设置钉钉openid
     *
     * @param dingtalkOpenid 钉钉openid
     */
    public void setDingtalkOpenid(String dingtalkOpenid) {
        this.dingtalkOpenid = dingtalkOpenid;
    }

    /**
     * 获取钉钉unionid
     *
     * @return dingtalk_unionid - 钉钉unionid
     */
    public String getDingtalkUnionid() {
        return dingtalkUnionid;
    }

    /**
     * 设置钉钉unionid
     *
     * @param dingtalkUnionid 钉钉unionid
     */
    public void setDingtalkUnionid(String dingtalkUnionid) {
        this.dingtalkUnionid = dingtalkUnionid;
    }

    /**
     * 获取钉钉用户id
     *
     * @return dingtalk_userid - 钉钉用户id
     */
    public String getDingtalkUserid() {
        return dingtalkUserid;
    }

    /**
     * 设置钉钉用户id
     *
     * @param dingtalkUserid 钉钉用户id
     */
    public void setDingtalkUserid(String dingtalkUserid) {
        this.dingtalkUserid = dingtalkUserid;
    }

    /**
     * 获取备注
     *
     * @return description - 备注
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置备注
     *
     * @param description 备注
     */
    public void setDescription(String description) {
        this.description = description;
    }
}