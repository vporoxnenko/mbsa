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
import com.mg.framework.api.annotations.DataItemName;

/**
 * WarehouseZone generated by hbm2java
 */
@Entity
@Table(name = "WH_ZONE")
@DataItemName("Warehouse.WarehouseZone")
public class WarehouseZone extends com.mg.merp.core.model.AbstractEntity implements java.io.Serializable {

    private int Id;

    private Warehouse Warehouse;

    private SysClient SysClient;

    private String Code;

    private String Name;

    public WarehouseZone() {
    }

    public WarehouseZone(String Code, String Name) {
        this.Code = Code;
        this.Name = Name;
    }

    public WarehouseZone(Warehouse Warehouse, SysClient SysClient, String Code, String Name) {
        this.Warehouse = Warehouse;
        this.SysClient = SysClient;
        this.Code = Code;
        this.Name = Name;
    }

    @SequenceGenerator(name = "generator", sequenceName = "WH_ZONE_ID_GEN")
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
    @JoinColumn(name = "WAREHOUSE_ID")
    public Warehouse getWarehouse() {
        return this.Warehouse;
    }

    public void setWarehouse(Warehouse Warehouse) {
        this.Warehouse = Warehouse;
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
    @DataItemName("Warehouse.WarehouseZone.Code")
    public String getCode() {
        return this.Code;
    }

    public void setCode(String Code) {
        this.Code = Code;
    }

    @Column(name = "NAME", nullable = false, columnDefinition = "VARCHAR", length = 80)
    @DataItemName("Warehouse.WarehouseZone.Name")
    public String getName() {
        return this.Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }
}

