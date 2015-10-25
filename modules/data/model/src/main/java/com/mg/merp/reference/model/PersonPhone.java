package com.mg.merp.reference.model;

import com.mg.merp.core.model.SysClient;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.SEQUENCE;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import com.mg.framework.api.annotations.DataItemName;

/**
 * PersonPhone generated by hbm2java
 */
@Entity
@Table(name = "REF_PERSON_PHONE")
@DataItemName("Reference.PersonPhone")
public class PersonPhone extends com.mg.merp.core.model.AbstractEntity implements java.io.Serializable {

    private Integer Id;

    private NaturalPerson NaturalPerson;

    private SysClient SysClient;

    private PhoneKind PhoneKind;

    private String Phone;

    private String AreaCode;

    public PersonPhone() {
    }

    public PersonPhone(NaturalPerson NaturalPerson, SysClient SysClient, PhoneKind PhoneKind, String Phone, String AreaCode) {
        this.NaturalPerson = NaturalPerson;
        this.SysClient = SysClient;
        this.PhoneKind = PhoneKind;
        this.Phone = Phone;
        this.AreaCode = AreaCode;
    }

    @SequenceGenerator(name = "generator", sequenceName = "REF_PERSON_PHONE_ID_GEN")
    @Id
    @GeneratedValue(strategy = SEQUENCE, generator = "generator")
    @Column(name = "ID", unique = true, columnDefinition = "INTEGER")
    @DataItemName("ID")
    public Integer getId() {
        return this.Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PERSON_ID")
    public NaturalPerson getNaturalPerson() {
        return this.NaturalPerson;
    }

    public void setNaturalPerson(NaturalPerson NaturalPerson) {
        this.NaturalPerson = NaturalPerson;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CLIENT_ID")
    public SysClient getSysClient() {
        return this.SysClient;
    }

    public void setSysClient(SysClient SysClient) {
        this.SysClient = SysClient;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PHONE_KIND_ID")
    public PhoneKind getPhoneKind() {
        return this.PhoneKind;
    }

    public void setPhoneKind(PhoneKind PhoneKind) {
        this.PhoneKind = PhoneKind;
    }

    @Column(name = "PHONE", columnDefinition = "VARCHAR", length = 80)
    @DataItemName("Reference.Person.Phone.Phone")
    public String getPhone() {
        return this.Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    @Column(name = "AREA_CODE", columnDefinition = "VARCHAR", length = 80)
    @DataItemName("Reference.Person.Phone.AreaCode")
    public String getAreaCode() {
        return this.AreaCode;
    }

    public void setAreaCode(String AreaCode) {
        this.AreaCode = AreaCode;
    }
}

