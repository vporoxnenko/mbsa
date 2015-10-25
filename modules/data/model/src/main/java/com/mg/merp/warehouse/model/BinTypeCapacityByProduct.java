package com.mg.merp.warehouse.model;

import com.mg.merp.core.model.SysClient;
import com.mg.merp.reference.model.Catalog;
import com.mg.merp.reference.model.Measure;
import java.math.BigDecimal;
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
 * BinTypeCapacityByProduct generated by hbm2java
 */
@Entity
@Table(name = "WH_BIN_TYPE_CAP_BY_PROD")
@DataItemName("Warehouse.BinTypeCapacityByProduct")
public class BinTypeCapacityByProduct extends com.mg.merp.core.model.AbstractEntity implements java.io.Serializable {

    private int Id;

    private Measure Measure;

    private Catalog Catalog;

    private SysClient SysClient;

    private BinLocationType Type;

    private BigDecimal MaxQuantity;

    public BinTypeCapacityByProduct() {
    }

    public BinTypeCapacityByProduct(Measure Measure, Catalog Catalog, SysClient SysClient, BinLocationType Type, BigDecimal MaxQuantity) {
        this.Measure = Measure;
        this.Catalog = Catalog;
        this.SysClient = SysClient;
        this.Type = Type;
        this.MaxQuantity = MaxQuantity;
    }

    @SequenceGenerator(name = "generator", sequenceName = "WH_BT_CAP_BY_PRODUCT_ID_GEN")
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
    @JoinColumn(name = "MEASURE_ID")
    public Measure getMeasure() {
        return this.Measure;
    }

    public void setMeasure(Measure Measure) {
        this.Measure = Measure;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CATALOG_ID")
    @DataItemName("Warehouse.BinTypeCapacByProd.Catalog")
    public Catalog getCatalog() {
        return this.Catalog;
    }

    public void setCatalog(Catalog Catalog) {
        this.Catalog = Catalog;
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
    @JoinColumn(name = "TYPE_ID")
    public BinLocationType getType() {
        return this.Type;
    }

    public void setType(BinLocationType Type) {
        this.Type = Type;
    }

    @Column(name = "MAX_QUANTITY", columnDefinition = "NUMERIC", precision = 18, scale = 3)
    @DataItemName("Warehouse.BinTypeCapacByProd.MaxQuantity")
    public BigDecimal getMaxQuantity() {
        return this.MaxQuantity;
    }

    public void setMaxQuantity(BigDecimal MaxQuantity) {
        this.MaxQuantity = MaxQuantity;
    }
}

