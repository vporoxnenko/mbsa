package com.mg.merp.reference.model;

import com.mg.merp.core.model.SysClient;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * PartnEmplPhone generated by hbm2java
 */
@Entity
@Table(name = "REF_PARTN_EMPL_PHONE")
public class PartnEmplPhone extends com.mg.merp.core.model.AbstractEntity implements java.io.Serializable {

    private int Id;

    private PhoneKind PhoneKind;

    private PartnerEmpl PartnEmpl;

    private SysClient SysClient;

    private String TownCode;

    private String Phone;

    private boolean IsActive;

    public PartnEmplPhone() {
    }

    public PartnEmplPhone(int Id, String Phone) {
        this.Id = Id;
        this.Phone = Phone;
    }

    public PartnEmplPhone(int Id, PhoneKind PhoneKind, PartnerEmpl PartnEmpl, SysClient SysClient, String TownCode, String Phone, boolean IsActive) {
        this.Id = Id;
        this.PhoneKind = PhoneKind;
        this.PartnEmpl = PartnEmpl;
        this.SysClient = SysClient;
        this.TownCode = TownCode;
        this.Phone = Phone;
        this.IsActive = IsActive;
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
    @JoinColumn(name = "PHONEKIND_ID")
    public PhoneKind getPhoneKind() {
        return this.PhoneKind;
    }

    public void setPhoneKind(PhoneKind PhoneKind) {
        this.PhoneKind = PhoneKind;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PARTNEMPL_ID")
    public PartnerEmpl getPartnEmpl() {
        return this.PartnEmpl;
    }

    public void setPartnEmpl(PartnerEmpl PartnEmpl) {
        this.PartnEmpl = PartnEmpl;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CLIENT_ID")
    public SysClient getSysClient() {
        return this.SysClient;
    }

    public void setSysClient(SysClient SysClient) {
        this.SysClient = SysClient;
    }

    @Column(name = "TOWNCODE", columnDefinition = "VARCHAR", length = 80)
    public String getTownCode() {
        return this.TownCode;
    }

    public void setTownCode(String TownCode) {
        this.TownCode = TownCode;
    }

    @Column(name = "PHONE", nullable = false, columnDefinition = "VARCHAR", length = 40)
    public String getPhone() {
        return this.Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    @Column(name = "IS_ACTIVE", columnDefinition = "SMALLINT")
    public boolean isActive() {
        return this.IsActive;
    }

    public void setActive(boolean IsActive) {
        this.IsActive = IsActive;
    }
}

