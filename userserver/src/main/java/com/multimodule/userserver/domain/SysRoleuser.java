package com.multimodule.userserver.domain;

public class SysRoleuser {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS_ROLEUSER.ID
     *
     * @mbggenerated
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS_ROLEUSER.PID
     *
     * @mbggenerated
     */
    private String pid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS_ROLEUSER.ROLEID
     *
     * @mbggenerated
     */
    private String roleid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS_ROLEUSER.USERID
     *
     * @mbggenerated
     */
    private String userid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS_ROLEUSER.REMARK
     *
     * @mbggenerated
     */
    private String remark;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS_ROLEUSER
     *
     * @mbggenerated
     */
    public SysRoleuser(String id, String pid, String roleid, String userid, String remark) {
        this.id = id;
        this.pid = pid;
        this.roleid = roleid;
        this.userid = userid;
        this.remark = remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS_ROLEUSER
     *
     * @mbggenerated
     */
    public SysRoleuser() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_ROLEUSER.ID
     *
     * @return the value of SYS_ROLEUSER.ID
     *
     * @mbggenerated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_ROLEUSER.ID
     *
     * @param id the value for SYS_ROLEUSER.ID
     *
     * @mbggenerated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_ROLEUSER.PID
     *
     * @return the value of SYS_ROLEUSER.PID
     *
     * @mbggenerated
     */
    public String getPid() {
        return pid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_ROLEUSER.PID
     *
     * @param pid the value for SYS_ROLEUSER.PID
     *
     * @mbggenerated
     */
    public void setPid(String pid) {
        this.pid = pid == null ? null : pid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_ROLEUSER.ROLEID
     *
     * @return the value of SYS_ROLEUSER.ROLEID
     *
     * @mbggenerated
     */
    public String getRoleid() {
        return roleid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_ROLEUSER.ROLEID
     *
     * @param roleid the value for SYS_ROLEUSER.ROLEID
     *
     * @mbggenerated
     */
    public void setRoleid(String roleid) {
        this.roleid = roleid == null ? null : roleid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_ROLEUSER.USERID
     *
     * @return the value of SYS_ROLEUSER.USERID
     *
     * @mbggenerated
     */
    public String getUserid() {
        return userid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_ROLEUSER.USERID
     *
     * @param userid the value for SYS_ROLEUSER.USERID
     *
     * @mbggenerated
     */
    public void setUserid(String userid) {
        this.userid = userid == null ? null : userid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_ROLEUSER.REMARK
     *
     * @return the value of SYS_ROLEUSER.REMARK
     *
     * @mbggenerated
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_ROLEUSER.REMARK
     *
     * @param remark the value for SYS_ROLEUSER.REMARK
     *
     * @mbggenerated
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }
}