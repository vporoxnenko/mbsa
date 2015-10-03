package com.mg.merp.core.model;
// Generated Sep 28, 2015 11:47:52 PM by Hibernate Tools 3.6.0.Final


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * SystemConfigId generated by hbm2java
 */
@Embeddable
public class SystemConfigId extends com.mg.merp.core.model.AbstractEntity implements java.io.Serializable {


     private short MajorVersion;
     private short MinorVersion;
     private short Release;
     private Short UseAnaliticLink;
     private Short RecurseFolder;
     private Short RecurseCatfolder;
     private Short RecurseOrgunit;
     private Short DelaysOn;
     private Short CurrencyPrec;
     private short DeferRemnacc;
     private short LogV1DocDel;
     private short LogV1Rollback;
     private Short LogV1Partner;
     private Short LogV1Catalog;

    public SystemConfigId() {
    }

	
    public SystemConfigId(short MajorVersion, short MinorVersion, short Release, short DeferRemnacc, short LogV1DocDel, short LogV1Rollback) {
        this.MajorVersion = MajorVersion;
        this.MinorVersion = MinorVersion;
        this.Release = Release;
        this.DeferRemnacc = DeferRemnacc;
        this.LogV1DocDel = LogV1DocDel;
        this.LogV1Rollback = LogV1Rollback;
    }
    public SystemConfigId(short MajorVersion, short MinorVersion, short Release, Short UseAnaliticLink, Short RecurseFolder, Short RecurseCatfolder, Short RecurseOrgunit, Short DelaysOn, Short CurrencyPrec, short DeferRemnacc, short LogV1DocDel, short LogV1Rollback, Short LogV1Partner, Short LogV1Catalog) {
       this.MajorVersion = MajorVersion;
       this.MinorVersion = MinorVersion;
       this.Release = Release;
       this.UseAnaliticLink = UseAnaliticLink;
       this.RecurseFolder = RecurseFolder;
       this.RecurseCatfolder = RecurseCatfolder;
       this.RecurseOrgunit = RecurseOrgunit;
       this.DelaysOn = DelaysOn;
       this.CurrencyPrec = CurrencyPrec;
       this.DeferRemnacc = DeferRemnacc;
       this.LogV1DocDel = LogV1DocDel;
       this.LogV1Rollback = LogV1Rollback;
       this.LogV1Partner = LogV1Partner;
       this.LogV1Catalog = LogV1Catalog;
    }
   


    @Column(name="MAJOR_VERSION", nullable=false, columnDefinition="SMALLINT")
    public short getMajorVersion() {
        return this.MajorVersion;
    }
    
    public void setMajorVersion(short MajorVersion) {
        this.MajorVersion = MajorVersion;
    }


    @Column(name="MINOR_VERSION", nullable=false, columnDefinition="SMALLINT")
    public short getMinorVersion() {
        return this.MinorVersion;
    }
    
    public void setMinorVersion(short MinorVersion) {
        this.MinorVersion = MinorVersion;
    }


    @Column(name="RELEASE", nullable=false, columnDefinition="SMALLINT")
    public short getRelease() {
        return this.Release;
    }
    
    public void setRelease(short Release) {
        this.Release = Release;
    }


    @Column(name="USE_ANALITIC_LINK", columnDefinition="SMALLINT")
    public Short getUseAnaliticLink() {
        return this.UseAnaliticLink;
    }
    
    public void setUseAnaliticLink(Short UseAnaliticLink) {
        this.UseAnaliticLink = UseAnaliticLink;
    }


    @Column(name="RECURSE_FOLDER", columnDefinition="SMALLINT")
    public Short getRecurseFolder() {
        return this.RecurseFolder;
    }
    
    public void setRecurseFolder(Short RecurseFolder) {
        this.RecurseFolder = RecurseFolder;
    }


    @Column(name="RECURSE_CATFOLDER", columnDefinition="SMALLINT")
    public Short getRecurseCatfolder() {
        return this.RecurseCatfolder;
    }
    
    public void setRecurseCatfolder(Short RecurseCatfolder) {
        this.RecurseCatfolder = RecurseCatfolder;
    }


    @Column(name="RECURSE_ORGUNIT", columnDefinition="SMALLINT")
    public Short getRecurseOrgunit() {
        return this.RecurseOrgunit;
    }
    
    public void setRecurseOrgunit(Short RecurseOrgunit) {
        this.RecurseOrgunit = RecurseOrgunit;
    }


    @Column(name="DELAYS_ON", columnDefinition="SMALLINT")
    public Short getDelaysOn() {
        return this.DelaysOn;
    }
    
    public void setDelaysOn(Short DelaysOn) {
        this.DelaysOn = DelaysOn;
    }


    @Column(name="CURRENCY_PREC", columnDefinition="SMALLINT")
    public Short getCurrencyPrec() {
        return this.CurrencyPrec;
    }
    
    public void setCurrencyPrec(Short CurrencyPrec) {
        this.CurrencyPrec = CurrencyPrec;
    }


    @Column(name="DEFER_REMNACC", nullable=false, columnDefinition="SMALLINT")
    public short getDeferRemnacc() {
        return this.DeferRemnacc;
    }
    
    public void setDeferRemnacc(short DeferRemnacc) {
        this.DeferRemnacc = DeferRemnacc;
    }


    @Column(name="LOG_V1_DOC_DEL", nullable=false, columnDefinition="SMALLINT")
    public short getLogV1DocDel() {
        return this.LogV1DocDel;
    }
    
    public void setLogV1DocDel(short LogV1DocDel) {
        this.LogV1DocDel = LogV1DocDel;
    }


    @Column(name="LOG_V1_ROLLBACK", nullable=false, columnDefinition="SMALLINT")
    public short getLogV1Rollback() {
        return this.LogV1Rollback;
    }
    
    public void setLogV1Rollback(short LogV1Rollback) {
        this.LogV1Rollback = LogV1Rollback;
    }


    @Column(name="LOG_V1_PARTNER", columnDefinition="SMALLINT")
    public Short getLogV1Partner() {
        return this.LogV1Partner;
    }
    
    public void setLogV1Partner(Short LogV1Partner) {
        this.LogV1Partner = LogV1Partner;
    }


    @Column(name="LOG_V1_CATALOG", columnDefinition="SMALLINT")
    public Short getLogV1Catalog() {
        return this.LogV1Catalog;
    }
    
    public void setLogV1Catalog(Short LogV1Catalog) {
        this.LogV1Catalog = LogV1Catalog;
    }




}

