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
 * TaxLink generated by hbm2java
 */
@Entity
@Table(name = "TAXLINK")
public class TaxLink extends com.mg.merp.core.model.AbstractEntity implements java.io.Serializable {

    private int Id;

    private TaxGroup TaxGroup;

    private Tax Tax;

    private SysClient SysClient;

    private short FeeOrder;

    public TaxLink() {
    }

    public TaxLink(short FeeOrder) {
        this.FeeOrder = FeeOrder;
    }

    public TaxLink(TaxGroup TaxGroup, Tax Tax, SysClient SysClient, short FeeOrder) {
        this.TaxGroup = TaxGroup;
        this.Tax = Tax;
        this.SysClient = SysClient;
        this.FeeOrder = FeeOrder;
    }

    @SequenceGenerator(name = "generator", sequenceName = "TAXLINK_ID_GEN")
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

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "TAXGROUP_ID")
    public TaxGroup getTaxGroup() {
        return this.TaxGroup;
    }

    public void setTaxGroup(TaxGroup TaxGroup) {
        this.TaxGroup = TaxGroup;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "TAX_ID")
    public Tax getTax() {
        return this.Tax;
    }

    public void setTax(Tax Tax) {
        this.Tax = Tax;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CLIENT_ID")
    public SysClient getSysClient() {
        return this.SysClient;
    }

    public void setSysClient(SysClient SysClient) {
        this.SysClient = SysClient;
    }

    @Column(name = "FEEORDER", nullable = false, columnDefinition = "SMALLINT")
    @DataItemName("Reference.TaxLink.FeeOrder")
    public short getFeeOrder() {
        return this.FeeOrder;
    }

    public void setFeeOrder(short FeeOrder) {
        this.FeeOrder = FeeOrder;
    }
}

