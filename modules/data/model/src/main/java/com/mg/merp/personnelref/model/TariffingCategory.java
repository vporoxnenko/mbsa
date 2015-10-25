package com.mg.merp.personnelref.model;

import com.mg.merp.core.model.SysClient;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Enumerated;
import javax.persistence.EnumType;
import com.mg.framework.api.annotations.DataItemName;

/**
 * TariffingCategory generated by hbm2java
 */
@Entity
@Table(name = "PREF_TARIFFING_CATEGORY")
@DataItemName("PersonnelRef.TariffingCategory")
public class TariffingCategory extends com.mg.merp.core.model.AbstractEntity implements java.io.Serializable {

    private Integer Id;

    private SysClient SysClient;

    private String CCode;

    private String CName;

    private TarifCategType CType;

    private Integer Priority;

    public TariffingCategory() {
    }

    public TariffingCategory(Integer Id, String CCode, TarifCategType CType) {
        this.Id = Id;
        this.CCode = CCode;
        this.CType = CType;
    }

    public TariffingCategory(Integer Id, SysClient SysClient, String CCode, String CName, TarifCategType CType, Integer Priority) {
        this.Id = Id;
        this.SysClient = SysClient;
        this.CCode = CCode;
        this.CName = CName;
        this.CType = CType;
        this.Priority = Priority;
    }

    @Id
    @Column(name = "ID", unique = true, columnDefinition = "INTEGER")
    @DataItemName("ID")
    public Integer getId() {
        return this.Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CLIENT_ID")
    public SysClient getSysClient() {
        return this.SysClient;
    }

    public void setSysClient(SysClient SysClient) {
        this.SysClient = SysClient;
    }

    @Column(name = "CCODE", unique = true, nullable = false, columnDefinition = "CHAR", length = 20)
    @DataItemName("PersonnelRef.TariffingCategory.Code")
    public String getCCode() {
        return this.CCode;
    }

    public void setCCode(String CCode) {
        this.CCode = CCode;
    }

    @Column(name = "CNAME", columnDefinition = "VARCHAR", length = 80)
    @DataItemName("PersonnelRef.TariffingCategory.Name")
    public String getCName() {
        return this.CName;
    }

    public void setCName(String CName) {
        this.CName = CName;
    }

    @Column(name = "CTYPE", nullable = false)
    @Enumerated(EnumType.ORDINAL)
    public TarifCategType getCType() {
        return this.CType;
    }

    public void setCType(TarifCategType CType) {
        this.CType = CType;
    }

    @Column(name = "PRIORITY", columnDefinition = "INTEGER")
    @DataItemName("PersonnelRef.TariffingCategory.Priority")
    public Integer getPriority() {
        return this.Priority;
    }

    public void setPriority(Integer Priority) {
        this.Priority = Priority;
    }
}

