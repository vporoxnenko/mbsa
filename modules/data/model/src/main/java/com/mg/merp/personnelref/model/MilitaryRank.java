package com.mg.merp.personnelref.model;

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
 * MilitaryRank generated by hbm2java
 */
@Entity
@Table(name = "PREF_MILITARY_RANK")
@DataItemName("PersonnelRef.MilitaryRank")
public class MilitaryRank extends com.mg.merp.core.model.AbstractEntity implements java.io.Serializable {

    private Integer Id;

    private SysClient SysClient;

    private String Code;

    private String Name;

    private String Okin;

    public MilitaryRank() {
    }

    public MilitaryRank(String Code) {
        this.Code = Code;
    }

    public MilitaryRank(SysClient SysClient, String Code, String Name, String Okin) {
        this.SysClient = SysClient;
        this.Code = Code;
        this.Name = Name;
        this.Okin = Okin;
    }

    @SequenceGenerator(name = "generator", sequenceName = "PREF_MILITARY_RANK_ID_GEN")
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
    @JoinColumn(name = "CLIENT_ID")
    public SysClient getSysClient() {
        return this.SysClient;
    }

    public void setSysClient(SysClient SysClient) {
        this.SysClient = SysClient;
    }

    @Column(name = "CODE", nullable = false, columnDefinition = "CHAR", length = 20)
    @DataItemName("PersonnelRef.MilitaryRank.Code")
    public String getCode() {
        return this.Code;
    }

    public void setCode(String Code) {
        this.Code = Code;
    }

    @Column(name = "NAME", columnDefinition = "VARCHAR", length = 80)
    @DataItemName("PersonnelRef.MilitaryRank.Name")
    public String getName() {
        return this.Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    @Column(name = "OKIN", columnDefinition = "CHAR", length = 5)
    @DataItemName("PersonnelRef.MilitaryRank.Okin")
    public String getOkin() {
        return this.Okin;
    }

    public void setOkin(String Okin) {
        this.Okin = Okin;
    }
}

