package com.mg.merp.reference.model;

import com.mg.merp.core.model.SysClient;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Employees generated by hbm2java
 */
@Entity
@Table(name = "EMPLOYEES")
@DataItemName("Reference.Employees")
public class Employees extends com.mg.merp.reference.model.Contractor implements java.io.Serializable {

    private NaturalPerson NaturalPerson;

    private String Office;

    private String TabNum;

    private boolean IsDefault;

    public Employees() {
    }

    public Employees(String Code, String UpCode, String FullName, short Kind) {
        super(Code, UpCode, FullName, Kind);
    }

    public Employees(SysClient SysClient, String Code, String UpCode, String FullName, Integer FolderId, short Kind, NaturalPerson NaturalPerson, String Office, String TabNum, boolean IsDefault) {
        super(SysClient, Code, UpCode, FullName, FolderId, Kind);
        this.NaturalPerson = NaturalPerson;
        this.Office = Office;
        this.TabNum = TabNum;
        this.IsDefault = IsDefault;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PERSON_ID")
    public NaturalPerson getNaturalPerson() {
        return this.NaturalPerson;
    }

    public void setNaturalPerson(NaturalPerson NaturalPerson) {
        this.NaturalPerson = NaturalPerson;
    }

    @Column(name = "OFFICE", columnDefinition = "VARCHAR", length = 40)
    @DataItemName("Reference.Employee.Office")
    public String getOffice() {
        return this.Office;
    }

    public void setOffice(String Office) {
        this.Office = Office;
    }

    @Column(name = "TABNUM", columnDefinition = "CHAR", length = 10)
    @DataItemName("Reference.Employee.TabNum")
    public String getTabNum() {
        return this.TabNum;
    }

    public void setTabNum(String TabNum) {
        this.TabNum = TabNum;
    }

    @Column(name = "IS_DEFAULT", columnDefinition = "SMALLINT")
    @DataItemName("Reference.Employee.IsDefault")
    public boolean isDefault() {
        return this.IsDefault;
    }

    public void setDefault(boolean IsDefault) {
        this.IsDefault = IsDefault;
    }
}

