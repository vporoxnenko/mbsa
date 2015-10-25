package com.mg.merp.warehouse.model;

import com.mg.merp.core.model.SysClient;
import com.mg.merp.document.model.DocHead;
import com.mg.merp.reference.model.Contractor;
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
 * InventoryActCommission generated by hbm2java
 */
@Entity
@Table(name = "WH_INVACT_COMMISSION")
public class InventoryActCommission extends com.mg.merp.core.model.AbstractEntity implements java.io.Serializable {

    private Integer Id;

    private SysClient SysClient;

    private Contractor Contractor;

    private DocHead InventoryAct;

    public InventoryActCommission() {
    }

    public InventoryActCommission(SysClient SysClient, Contractor Contractor, DocHead InventoryAct) {
        this.SysClient = SysClient;
        this.Contractor = Contractor;
        this.InventoryAct = InventoryAct;
    }

    @SequenceGenerator(name = "generator", sequenceName = "WH_INVACT_COMMISSION_ID_GEN")
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

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CONTRACTOR_ID")
    public Contractor getContractor() {
        return this.Contractor;
    }

    public void setContractor(Contractor Contractor) {
        this.Contractor = Contractor;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "INVENTORYACT_ID")
    public DocHead getInventoryAct() {
        return this.InventoryAct;
    }

    public void setInventoryAct(DocHead InventoryAct) {
        this.InventoryAct = InventoryAct;
    }
}

