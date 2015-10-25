package com.mg.merp.warehouse.model;

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
 * BinLocationType generated by hbm2java
 */
@Entity
@Table(name = "WH_BIN_LOCATION_TYPE")
@DataItemName("Warehouse.BinLocationType")
public class BinLocationType extends com.mg.merp.core.model.AbstractEntity implements java.io.Serializable {

    private int Id;

    private SysClient SysClient;

    private String Code;

    private String Name;

    public BinLocationType() {
    }

    public BinLocationType(String Code, String Name) {
        this.Code = Code;
        this.Name = Name;
    }

    public BinLocationType(SysClient SysClient, String Code, String Name) {
        this.SysClient = SysClient;
        this.Code = Code;
        this.Name = Name;
    }

    @SequenceGenerator(name = "generator", sequenceName = "WH_BIN_LOCATION_TYPE_ID_GEN")
    @Id
    @GeneratedValue(strategy = SEQUENCE, generator = "generator")
    @Column(name = "ID", unique = true, nullable = false, columnDefinition = "INTEGER")
    @DataItemName("ID")
    public int getId() {
        return this.Id;
    }

    public void setId(int Id) {
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

    @Column(name = "CODE", unique = true, nullable = false, columnDefinition = "CHAR", length = 20)
    @DataItemName("Warehouse.BinLocationType.Code")
    public String getCode() {
        return this.Code;
    }

    public void setCode(String Code) {
        this.Code = Code;
    }

    @Column(name = "NAME", nullable = false, columnDefinition = "VARCHAR", length = 80)
    @DataItemName("Warehouse.BinLocationType.Name")
    public String getName() {
        return this.Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }
}

