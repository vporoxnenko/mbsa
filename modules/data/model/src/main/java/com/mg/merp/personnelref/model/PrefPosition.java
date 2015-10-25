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

/**
 * PrefPosition generated by hbm2java
 */
@Entity
@Table(name = "PREF_POSITION")
@DataItemName("PersonnelRef.PrefPosition")
public class PrefPosition extends com.mg.merp.core.model.AbstractEntity implements java.io.Serializable {

    private Integer Id;

    private SysClient SysClient;

    private String Name;

    public PrefPosition() {
    }

    public PrefPosition(String Name) {
        this.Name = Name;
    }

    public PrefPosition(SysClient SysClient, String Name) {
        this.SysClient = SysClient;
        this.Name = Name;
    }

    @SequenceGenerator(name = "generator", sequenceName = "PREF_POSITION_ID_GEN")
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

    @Column(name = "NAME", nullable = false, columnDefinition = "VARCHAR", length = 80)
    @DataItemName("PersonnelRef.PrefPosition.Name")
    public String getName() {
        return this.Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }
}

