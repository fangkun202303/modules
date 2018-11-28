package com.multimodule.userserver.domain;

import java.math.BigDecimal;

public class SysApp {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS_APP.ID
     *
     * @mbggenerated
     */
    private String id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS_APP.APPID
     *
     * @mbggenerated
     */
    private String appid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS_APP.APPNAME
     *
     * @mbggenerated
     */
    private String appname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS_APP.ENABLE
     *
     * @mbggenerated
     */
    private String enable;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS_APP.APPURL
     *
     * @mbggenerated
     */
    private String appurl;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS_APP.APPMODEL
     *
     * @mbggenerated
     */
    private String appmodel;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS_APP.APPTYPE
     *
     * @mbggenerated
     */
    private String apptype;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS_APP.DATASOURCE
     *
     * @mbggenerated
     */
    private String datasource;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS_APP.SOURCETYPE
     *
     * @mbggenerated
     */
    private String sourcetype;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS_APP.MAINTABLE
     *
     * @mbggenerated
     */
    private String maintable;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS_APP.TABLETYPE
     *
     * @mbggenerated
     */
    private String tabletype;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS_APP.APPFILTER
     *
     * @mbggenerated
     */
    private String appfilter;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS_APP.PAGESIZE
     *
     * @mbggenerated
     */
    private BigDecimal pagesize;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS_APP.LISTPAGE
     *
     * @mbggenerated
     */
    private String listpage;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS_APP.CARDPAGE
     *
     * @mbggenerated
     */
    private String cardpage;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS_APP.CARDCOLS
     *
     * @mbggenerated
     */
    private BigDecimal cardcols;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS_APP.SORTBY
     *
     * @mbggenerated
     */
    private String sortby;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS_APP.ENABLELOG
     *
     * @mbggenerated
     */
    private String enablelog;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS_APP.SERVICECLASS
     *
     * @mbggenerated
     */
    private String serviceclass;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS_APP.ENABLECACHE
     *
     * @mbggenerated
     */
    private String enablecache;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS_APP.REMARK
     *
     * @mbggenerated
     */
    private String remark;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS_APP.VIEWSIZE
     *
     * @mbggenerated
     */
    private BigDecimal viewsize;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS_APP.CARDTITLE
     *
     * @mbggenerated
     */
    private String cardtitle;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS_APP.CARDCONTENT
     *
     * @mbggenerated
     */
    private String cardcontent;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS_APP.CARDFOOTER
     *
     * @mbggenerated
     */
    private String cardfooter;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS_APP.IMPLFIELDS
     *
     * @mbggenerated
     */
    private String implfields;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS_APP.PARENTFIELDCODE
     *
     * @mbggenerated
     */
    private String parentfieldcode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS_APP.CHILDFIELDCODE
     *
     * @mbggenerated
     */
    private String childfieldcode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column SYS_APP.HELP
     *
     * @mbggenerated
     */
    private String help;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS_APP
     *
     * @mbggenerated
     */
    public SysApp(String id, String appid, String appname, String enable, String appurl, String appmodel, String apptype, String datasource, String sourcetype, String maintable, String tabletype, String appfilter, BigDecimal pagesize, String listpage, String cardpage, BigDecimal cardcols, String sortby, String enablelog, String serviceclass, String enablecache, String remark, BigDecimal viewsize, String cardtitle, String cardcontent, String cardfooter, String implfields, String parentfieldcode, String childfieldcode, String help) {
        this.id = id;
        this.appid = appid;
        this.appname = appname;
        this.enable = enable;
        this.appurl = appurl;
        this.appmodel = appmodel;
        this.apptype = apptype;
        this.datasource = datasource;
        this.sourcetype = sourcetype;
        this.maintable = maintable;
        this.tabletype = tabletype;
        this.appfilter = appfilter;
        this.pagesize = pagesize;
        this.listpage = listpage;
        this.cardpage = cardpage;
        this.cardcols = cardcols;
        this.sortby = sortby;
        this.enablelog = enablelog;
        this.serviceclass = serviceclass;
        this.enablecache = enablecache;
        this.remark = remark;
        this.viewsize = viewsize;
        this.cardtitle = cardtitle;
        this.cardcontent = cardcontent;
        this.cardfooter = cardfooter;
        this.implfields = implfields;
        this.parentfieldcode = parentfieldcode;
        this.childfieldcode = childfieldcode;
        this.help = help;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SYS_APP
     *
     * @mbggenerated
     */
    public SysApp() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_APP.ID
     *
     * @return the value of SYS_APP.ID
     *
     * @mbggenerated
     */
    public String getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_APP.ID
     *
     * @param id the value for SYS_APP.ID
     *
     * @mbggenerated
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_APP.APPID
     *
     * @return the value of SYS_APP.APPID
     *
     * @mbggenerated
     */
    public String getAppid() {
        return appid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_APP.APPID
     *
     * @param appid the value for SYS_APP.APPID
     *
     * @mbggenerated
     */
    public void setAppid(String appid) {
        this.appid = appid == null ? null : appid.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_APP.APPNAME
     *
     * @return the value of SYS_APP.APPNAME
     *
     * @mbggenerated
     */
    public String getAppname() {
        return appname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_APP.APPNAME
     *
     * @param appname the value for SYS_APP.APPNAME
     *
     * @mbggenerated
     */
    public void setAppname(String appname) {
        this.appname = appname == null ? null : appname.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_APP.ENABLE
     *
     * @return the value of SYS_APP.ENABLE
     *
     * @mbggenerated
     */
    public String getEnable() {
        return enable;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_APP.ENABLE
     *
     * @param enable the value for SYS_APP.ENABLE
     *
     * @mbggenerated
     */
    public void setEnable(String enable) {
        this.enable = enable == null ? null : enable.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_APP.APPURL
     *
     * @return the value of SYS_APP.APPURL
     *
     * @mbggenerated
     */
    public String getAppurl() {
        return appurl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_APP.APPURL
     *
     * @param appurl the value for SYS_APP.APPURL
     *
     * @mbggenerated
     */
    public void setAppurl(String appurl) {
        this.appurl = appurl == null ? null : appurl.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_APP.APPMODEL
     *
     * @return the value of SYS_APP.APPMODEL
     *
     * @mbggenerated
     */
    public String getAppmodel() {
        return appmodel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_APP.APPMODEL
     *
     * @param appmodel the value for SYS_APP.APPMODEL
     *
     * @mbggenerated
     */
    public void setAppmodel(String appmodel) {
        this.appmodel = appmodel == null ? null : appmodel.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_APP.APPTYPE
     *
     * @return the value of SYS_APP.APPTYPE
     *
     * @mbggenerated
     */
    public String getApptype() {
        return apptype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_APP.APPTYPE
     *
     * @param apptype the value for SYS_APP.APPTYPE
     *
     * @mbggenerated
     */
    public void setApptype(String apptype) {
        this.apptype = apptype == null ? null : apptype.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_APP.DATASOURCE
     *
     * @return the value of SYS_APP.DATASOURCE
     *
     * @mbggenerated
     */
    public String getDatasource() {
        return datasource;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_APP.DATASOURCE
     *
     * @param datasource the value for SYS_APP.DATASOURCE
     *
     * @mbggenerated
     */
    public void setDatasource(String datasource) {
        this.datasource = datasource == null ? null : datasource.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_APP.SOURCETYPE
     *
     * @return the value of SYS_APP.SOURCETYPE
     *
     * @mbggenerated
     */
    public String getSourcetype() {
        return sourcetype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_APP.SOURCETYPE
     *
     * @param sourcetype the value for SYS_APP.SOURCETYPE
     *
     * @mbggenerated
     */
    public void setSourcetype(String sourcetype) {
        this.sourcetype = sourcetype == null ? null : sourcetype.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_APP.MAINTABLE
     *
     * @return the value of SYS_APP.MAINTABLE
     *
     * @mbggenerated
     */
    public String getMaintable() {
        return maintable;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_APP.MAINTABLE
     *
     * @param maintable the value for SYS_APP.MAINTABLE
     *
     * @mbggenerated
     */
    public void setMaintable(String maintable) {
        this.maintable = maintable == null ? null : maintable.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_APP.TABLETYPE
     *
     * @return the value of SYS_APP.TABLETYPE
     *
     * @mbggenerated
     */
    public String getTabletype() {
        return tabletype;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_APP.TABLETYPE
     *
     * @param tabletype the value for SYS_APP.TABLETYPE
     *
     * @mbggenerated
     */
    public void setTabletype(String tabletype) {
        this.tabletype = tabletype == null ? null : tabletype.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_APP.APPFILTER
     *
     * @return the value of SYS_APP.APPFILTER
     *
     * @mbggenerated
     */
    public String getAppfilter() {
        return appfilter;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_APP.APPFILTER
     *
     * @param appfilter the value for SYS_APP.APPFILTER
     *
     * @mbggenerated
     */
    public void setAppfilter(String appfilter) {
        this.appfilter = appfilter == null ? null : appfilter.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_APP.PAGESIZE
     *
     * @return the value of SYS_APP.PAGESIZE
     *
     * @mbggenerated
     */
    public BigDecimal getPagesize() {
        return pagesize;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_APP.PAGESIZE
     *
     * @param pagesize the value for SYS_APP.PAGESIZE
     *
     * @mbggenerated
     */
    public void setPagesize(BigDecimal pagesize) {
        this.pagesize = pagesize;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_APP.LISTPAGE
     *
     * @return the value of SYS_APP.LISTPAGE
     *
     * @mbggenerated
     */
    public String getListpage() {
        return listpage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_APP.LISTPAGE
     *
     * @param listpage the value for SYS_APP.LISTPAGE
     *
     * @mbggenerated
     */
    public void setListpage(String listpage) {
        this.listpage = listpage == null ? null : listpage.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_APP.CARDPAGE
     *
     * @return the value of SYS_APP.CARDPAGE
     *
     * @mbggenerated
     */
    public String getCardpage() {
        return cardpage;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_APP.CARDPAGE
     *
     * @param cardpage the value for SYS_APP.CARDPAGE
     *
     * @mbggenerated
     */
    public void setCardpage(String cardpage) {
        this.cardpage = cardpage == null ? null : cardpage.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_APP.CARDCOLS
     *
     * @return the value of SYS_APP.CARDCOLS
     *
     * @mbggenerated
     */
    public BigDecimal getCardcols() {
        return cardcols;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_APP.CARDCOLS
     *
     * @param cardcols the value for SYS_APP.CARDCOLS
     *
     * @mbggenerated
     */
    public void setCardcols(BigDecimal cardcols) {
        this.cardcols = cardcols;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_APP.SORTBY
     *
     * @return the value of SYS_APP.SORTBY
     *
     * @mbggenerated
     */
    public String getSortby() {
        return sortby;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_APP.SORTBY
     *
     * @param sortby the value for SYS_APP.SORTBY
     *
     * @mbggenerated
     */
    public void setSortby(String sortby) {
        this.sortby = sortby == null ? null : sortby.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_APP.ENABLELOG
     *
     * @return the value of SYS_APP.ENABLELOG
     *
     * @mbggenerated
     */
    public String getEnablelog() {
        return enablelog;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_APP.ENABLELOG
     *
     * @param enablelog the value for SYS_APP.ENABLELOG
     *
     * @mbggenerated
     */
    public void setEnablelog(String enablelog) {
        this.enablelog = enablelog == null ? null : enablelog.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_APP.SERVICECLASS
     *
     * @return the value of SYS_APP.SERVICECLASS
     *
     * @mbggenerated
     */
    public String getServiceclass() {
        return serviceclass;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_APP.SERVICECLASS
     *
     * @param serviceclass the value for SYS_APP.SERVICECLASS
     *
     * @mbggenerated
     */
    public void setServiceclass(String serviceclass) {
        this.serviceclass = serviceclass == null ? null : serviceclass.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_APP.ENABLECACHE
     *
     * @return the value of SYS_APP.ENABLECACHE
     *
     * @mbggenerated
     */
    public String getEnablecache() {
        return enablecache;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_APP.ENABLECACHE
     *
     * @param enablecache the value for SYS_APP.ENABLECACHE
     *
     * @mbggenerated
     */
    public void setEnablecache(String enablecache) {
        this.enablecache = enablecache == null ? null : enablecache.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_APP.REMARK
     *
     * @return the value of SYS_APP.REMARK
     *
     * @mbggenerated
     */
    public String getRemark() {
        return remark;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_APP.REMARK
     *
     * @param remark the value for SYS_APP.REMARK
     *
     * @mbggenerated
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_APP.VIEWSIZE
     *
     * @return the value of SYS_APP.VIEWSIZE
     *
     * @mbggenerated
     */
    public BigDecimal getViewsize() {
        return viewsize;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_APP.VIEWSIZE
     *
     * @param viewsize the value for SYS_APP.VIEWSIZE
     *
     * @mbggenerated
     */
    public void setViewsize(BigDecimal viewsize) {
        this.viewsize = viewsize;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_APP.CARDTITLE
     *
     * @return the value of SYS_APP.CARDTITLE
     *
     * @mbggenerated
     */
    public String getCardtitle() {
        return cardtitle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_APP.CARDTITLE
     *
     * @param cardtitle the value for SYS_APP.CARDTITLE
     *
     * @mbggenerated
     */
    public void setCardtitle(String cardtitle) {
        this.cardtitle = cardtitle == null ? null : cardtitle.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_APP.CARDCONTENT
     *
     * @return the value of SYS_APP.CARDCONTENT
     *
     * @mbggenerated
     */
    public String getCardcontent() {
        return cardcontent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_APP.CARDCONTENT
     *
     * @param cardcontent the value for SYS_APP.CARDCONTENT
     *
     * @mbggenerated
     */
    public void setCardcontent(String cardcontent) {
        this.cardcontent = cardcontent == null ? null : cardcontent.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_APP.CARDFOOTER
     *
     * @return the value of SYS_APP.CARDFOOTER
     *
     * @mbggenerated
     */
    public String getCardfooter() {
        return cardfooter;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_APP.CARDFOOTER
     *
     * @param cardfooter the value for SYS_APP.CARDFOOTER
     *
     * @mbggenerated
     */
    public void setCardfooter(String cardfooter) {
        this.cardfooter = cardfooter == null ? null : cardfooter.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_APP.IMPLFIELDS
     *
     * @return the value of SYS_APP.IMPLFIELDS
     *
     * @mbggenerated
     */
    public String getImplfields() {
        return implfields;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_APP.IMPLFIELDS
     *
     * @param implfields the value for SYS_APP.IMPLFIELDS
     *
     * @mbggenerated
     */
    public void setImplfields(String implfields) {
        this.implfields = implfields == null ? null : implfields.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_APP.PARENTFIELDCODE
     *
     * @return the value of SYS_APP.PARENTFIELDCODE
     *
     * @mbggenerated
     */
    public String getParentfieldcode() {
        return parentfieldcode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_APP.PARENTFIELDCODE
     *
     * @param parentfieldcode the value for SYS_APP.PARENTFIELDCODE
     *
     * @mbggenerated
     */
    public void setParentfieldcode(String parentfieldcode) {
        this.parentfieldcode = parentfieldcode == null ? null : parentfieldcode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_APP.CHILDFIELDCODE
     *
     * @return the value of SYS_APP.CHILDFIELDCODE
     *
     * @mbggenerated
     */
    public String getChildfieldcode() {
        return childfieldcode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_APP.CHILDFIELDCODE
     *
     * @param childfieldcode the value for SYS_APP.CHILDFIELDCODE
     *
     * @mbggenerated
     */
    public void setChildfieldcode(String childfieldcode) {
        this.childfieldcode = childfieldcode == null ? null : childfieldcode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column SYS_APP.HELP
     *
     * @return the value of SYS_APP.HELP
     *
     * @mbggenerated
     */
    public String getHelp() {
        return help;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column SYS_APP.HELP
     *
     * @param help the value for SYS_APP.HELP
     *
     * @mbggenerated
     */
    public void setHelp(String help) {
        this.help = help == null ? null : help.trim();
    }
}