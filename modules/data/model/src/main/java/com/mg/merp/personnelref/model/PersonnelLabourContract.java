package com.mg.merp.personnelref.model;

import com.mg.merp.core.model.SysClient;
import com.mg.merp.reference.model.OriginalDocument;
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
 * PersonnelLabourContract generated by hbm2java
 */
@Entity
@Table(name = "PREF_PERSONNEL_LABOUR_CONTRACT")
public class PersonnelLabourContract extends com.mg.merp.core.model.AbstractEntity implements java.io.Serializable {

    private Integer Id;

    private Personnel Personnel;

    private SysClient SysClient;

    private OriginalDocument OriginalDocument;

    private String Name;

    public PersonnelLabourContract() {
    }

    public PersonnelLabourContract(String Name) {
        this.Name = Name;
    }

    public PersonnelLabourContract(Personnel Personnel, SysClient SysClient, OriginalDocument OriginalDocument, String Name) {
        this.Personnel = Personnel;
        this.SysClient = SysClient;
        this.OriginalDocument = OriginalDocument;
        this.Name = Name;
    }

    @SequenceGenerator(name = "generator", sequenceName = "PREF_PERS_LAB_CONTRACT_ID_GEN")
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
    @JoinColumn(name = "PERSONNEL_ID")
    public Personnel getPersonnel() {
        return this.Personnel;
    }

    public void setPersonnel(Personnel Personnel) {
        this.Personnel = Personnel;
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
    @JoinColumn(name = "ORIGINAL_DOCUMENT_ID")
    @DataItemName("PersonnelRef.Personnel.OrigDoc")
    public OriginalDocument getOriginalDocument() {
        return this.OriginalDocument;
    }

    public void setOriginalDocument(OriginalDocument OriginalDocument) {
        this.OriginalDocument = OriginalDocument;
    }

    @Column(name = "NAME", nullable = false, columnDefinition = "VARCHAR", length = 80)
    @DataItemName("PersonnelRef.Personnel.ContrName")
    public String getName() {
        return this.Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }
}

