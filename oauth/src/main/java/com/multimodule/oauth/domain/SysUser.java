package com.multimodule.oauth.domain;

import java.math.BigDecimal;

/**
 * @ClassName: User
 * @Description: 用户类
 * @Author: FangKun
 * @Date: Created in 2018/12/26 10:46
 * @Version: 1.0
 */
public class SysUser {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS_USER.ID
     *
     * @mbggenerated
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS_USER.USERCODE
     *
     * @mbggenerated
     */
    private String usercode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS_USER.NAME
     *
     * @mbggenerated
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS_USER.PASSWORD
     *
     * @mbggenerated
     */
    private String password;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS_USER.PERSONID
     *
     * @mbggenerated
     */
    private String personid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS_USER.AVAILABLEDATE
     *
     * @mbggenerated
     */
    private BigDecimal availabledate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS_USER.DISABLEDATE
     *
     * @mbggenerated
     */
    private BigDecimal disabledate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS_USER.SORT
     *
     * @mbggenerated
     */
    private BigDecimal sort;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS_USER.STOPFLAG
     *
     * @mbggenerated
     */
    private String stopflag;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS_USER.REMARK
     *
     * @mbggenerated
     */
    private String remark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS_USER.COMPANYCODE
     *
     * @mbggenerated
     */
    private String companycode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS_USER.DEPTCODE
     *
     * @mbggenerated
     */
    private String deptcode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS_USER.SYSMANAGER
     *
     * @mbggenerated
     */
    private String sysmanager;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS_USER
     *
     * @mbggenerated
     */
    public SysUser(String id, String usercode, String name, String password, String personid, BigDecimal availabledate, BigDecimal disabledate, BigDecimal sort, String stopflag, String remark, String companycode, String deptcode, String sysmanager) {
        this.id = id;
        this.usercode = usercode;
        this.name = name;
        this.password = password;
        this.personid = personid;
        this.availabledate = availabledate;
        this.disabledate = disabledate;
        this.sort = sort;
        this.stopflag = stopflag;
        this.remark = remark;
        this.companycode = companycode;
        this.deptcode = deptcode;
        this.sysmanager = sysmanager;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS_USER
     *
     * @mbggenerated
     */
    public SysUser() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_USER.ID
     *
     * @return the value of SYS_USER.ID
     *
     * @mbggenerated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_USER.ID
     *
     * @param id the value for SYS_USER.ID
     *
     * @mbggenerated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_USER.USERCODE
     *
     * @return the value of SYS_USER.USERCODE
     *
     * @mbggenerated
     */
    public String getUsercode() {
        return usercode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_USER.USERCODE
     *
     * @param usercode the value for SYS_USER.USERCODE
     *
     * @mbggenerated
     */
    public void setUsercode(String usercode) {
        this.usercode = usercode == null ? null : usercode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_USER.NAME
     *
     * @return the value of SYS_USER.NAME
     *
     * @mbggenerated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_USER.NAME
     *
     * @param name the value for SYS_USER.NAME
     *
     * @mbggenerated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_USER.PASSWORD
     *
     * @return the value of SYS_USER.PASSWORD
     *
     * @mbggenerated
     */
    public String getPassword() {
        return password;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_USER.PASSWORD
     *
     * @param password the value for SYS_USER.PASSWORD
     *
     * @mbggenerated
     */
    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_USER.PERSONID
     *
     * @return the value of SYS_USER.PERSONID
     *
     * @mbggenerated
     */
    public String getPersonid() {
        return personid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_USER.PERSONID
     *
     * @param personid the value for SYS_USER.PERSONID
     *
     * @mbggenerated
     */
    public void setPersonid(String personid) {
        this.personid = personid == null ? null : personid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_USER.AVAILABLEDATE
     *
     * @return the value of SYS_USER.AVAILABLEDATE
     *
     * @mbggenerated
     */
    public BigDecimal getAvailabledate() {
        return availabledate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_USER.AVAILABLEDATE
     *
     * @param availabledate the value for SYS_USER.AVAILABLEDATE
     *
     * @mbggenerated
     */
    public void setAvailabledate(BigDecimal availabledate) {
        this.availabledate = availabledate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_USER.DISABLEDATE
     *
     * @return the value of SYS_USER.DISABLEDATE
     *
     * @mbggenerated
     */
    public BigDecimal getDisabledate() {
        return disabledate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_USER.DISABLEDATE
     *
     * @param disabledate the value for SYS_USER.DISABLEDATE
     *
     * @mbggenerated
     */
    public void setDisabledate(BigDecimal disabledate) {
        this.disabledate = disabledate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_USER.SORT
     *
     * @return the value of SYS_USER.SORT
     *
     * @mbggenerated
     */
    public BigDecimal getSort() {
        return sort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_USER.SORT
     *
     * @param sort the value for SYS_USER.SORT
     *
     * @mbggenerated
     */
    public void setSort(BigDecimal sort) {
        this.sort = sort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_USER.STOPFLAG
     *
     * @return the value of SYS_USER.STOPFLAG
     *
     * @mbggenerated
     */
    public String getStopflag() {
        return stopflag;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_USER.STOPFLAG
     *
     * @param stopflag the value for SYS_USER.STOPFLAG
     *
     * @mbggenerated
     */
    public void setStopflag(String stopflag) {
        this.stopflag = stopflag == null ? null : stopflag.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_USER.REMARK
     *
     * @return the value of SYS_USER.REMARK
     *
     * @mbggenerated
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_USER.REMARK
     *
     * @param remark the value for SYS_USER.REMARK
     *
     * @mbggenerated
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_USER.COMPANYCODE
     *
     * @return the value of SYS_USER.COMPANYCODE
     *
     * @mbggenerated
     */
    public String getCompanycode() {
        return companycode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_USER.COMPANYCODE
     *
     * @param companycode the value for SYS_USER.COMPANYCODE
     *
     * @mbggenerated
     */
    public void setCompanycode(String companycode) {
        this.companycode = companycode == null ? null : companycode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_USER.DEPTCODE
     *
     * @return the value of SYS_USER.DEPTCODE
     *
     * @mbggenerated
     */
    public String getDeptcode() {
        return deptcode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_USER.DEPTCODE
     *
     * @param deptcode the value for SYS_USER.DEPTCODE
     *
     * @mbggenerated
     */
    public void setDeptcode(String deptcode) {
        this.deptcode = deptcode == null ? null : deptcode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_USER.SYSMANAGER
     *
     * @return the value of SYS_USER.SYSMANAGER
     *
     * @mbggenerated
     */
    public String getSysmanager() {
        return sysmanager;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_USER.SYSMANAGER
     *
     * @param sysmanager the value for SYS_USER.SYSMANAGER
     *
     * @mbggenerated
     */
    public void setSysmanager(String sysmanager) {
        this.sysmanager = sysmanager == null ? null : sysmanager.trim();
    }
}
