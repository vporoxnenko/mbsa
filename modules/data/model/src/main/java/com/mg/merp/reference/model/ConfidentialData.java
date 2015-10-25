package com.mg.merp.reference.model;

import com.mg.merp.core.model.SysClient;
import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * ConfidentialData generated by hbm2java
 */
@Entity
@Table(name = "REF_CONFIDENTIAL_DATA")
public class ConfidentialData extends com.mg.merp.core.model.AbstractEntity implements java.io.Serializable {

    private int Id;

    private Partner Partner;

    private SysClient SysClient;

    private String DName;

    private Serializable ConfData;

    public ConfidentialData() {
    }

    public ConfidentialData(int Id, String DName) {
        this.Id = Id;
        this.DName = DName;
    }

    public ConfidentialData(int Id, Partner Partner, SysClient SysClient, String DName, Serializable ConfData) {
        this.Id = Id;
        this.Partner = Partner;
        this.SysClient = SysClient;
        this.DName = DName;
        this.ConfData = ConfData;
    }

    @Id
    @Column(name = "ID", unique = true, nullable = false, columnDefinition = "INTEGER")
    public int getId() {
        return this.Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PARTNER_ID")
    public Partner getPartner() {
        return this.Partner;
    }

    public void setPartner(Partner Partner) {
        this.Partner = Partner;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CLIENT_ID")
    public SysClient getSysClient() {
        return this.SysClient;
    }

    public void setSysClient(SysClient SysClient) {
        this.SysClient = SysClient;
    }

    @Column(name = "DNAME", nullable = false, columnDefinition = "VARCHAR", length = 80)
    @DataItemName("Reference.Partner.CofidData.DName")
    public String getDName() {
        return this.DName;
    }

    public void setDName(String DName) {
        this.DName = DName;
    }

    @Column(name = "CONFDATA", columnDefinition = "BLOB SUB_TYPE 0")
    @DataItemName("Reference.Partner.CofidData.ConfData")
    public Serializable getConfData() {
        return this.ConfData;
    }

    public void setConfData(Serializable ConfData) {
        this.ConfData = ConfData;
    }
}

