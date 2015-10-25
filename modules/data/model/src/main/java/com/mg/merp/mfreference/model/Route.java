package com.mg.merp.mfreference.model;

import com.mg.merp.core.model.SysClient;
import com.mg.merp.reference.model.Catalog;
import com.mg.merp.reference.model.Contractor;
import com.mg.merp.warehouse.model.Warehouse;
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
import javax.persistence.Enumerated;
import javax.persistence.EnumType;

/**
 * Route generated by hbm2java
 */
@Entity
@Table(name = "MF_ROUTE")
public class Route extends com.mg.merp.core.model.AbstractEntity implements java.io.Serializable {

    private Integer Id;

    private Contractor Vendor;

    private Catalog Catalog;

    private Contractor Customer;

    private Warehouse SrcWarehouse;

    private SysClient SysClient;

    private Warehouse DestWarehouse;

    private RouteSrcType SrcType;

    private Integer SrcCycle;

    private Short SrcRank;

    private BigDecimal SupplyPercent;

    private RouteDestType DestType;

    private BigDecimal ReorderMinQty;

    private BigDecimal ReorderLotSize;

    private Integer DestCycle;

    private Short QcReceivingDays;

    private Short LeadTime;

    private Short SafetyDays;

    public Route() {
    }

    public Route(RouteSrcType SrcType, RouteDestType DestType) {
        this.SrcType = SrcType;
        this.DestType = DestType;
    }

    public Route(Contractor Vendor, Catalog Catalog, Contractor Customer, Warehouse SrcWarehouse, SysClient SysClient, Warehouse DestWarehouse, RouteSrcType SrcType, Integer SrcCycle, Short SrcRank, BigDecimal SupplyPercent, RouteDestType DestType, BigDecimal ReorderMinQty, BigDecimal ReorderLotSize, Integer DestCycle, Short QcReceivingDays, Short LeadTime, Short SafetyDays) {
        this.Vendor = Vendor;
        this.Catalog = Catalog;
        this.Customer = Customer;
        this.SrcWarehouse = SrcWarehouse;
        this.SysClient = SysClient;
        this.DestWarehouse = DestWarehouse;
        this.SrcType = SrcType;
        this.SrcCycle = SrcCycle;
        this.SrcRank = SrcRank;
        this.SupplyPercent = SupplyPercent;
        this.DestType = DestType;
        this.ReorderMinQty = ReorderMinQty;
        this.ReorderLotSize = ReorderLotSize;
        this.DestCycle = DestCycle;
        this.QcReceivingDays = QcReceivingDays;
        this.LeadTime = LeadTime;
        this.SafetyDays = SafetyDays;
    }

    @SequenceGenerator(name = "generator", sequenceName = "MF_ROUTE_ID_GEN")
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
    @JoinColumn(name = "VENDOR_ID")
    @DataItemName("MfReference.Route.Vendor")
    public Contractor getVendor() {
        return this.Vendor;
    }

    public void setVendor(Contractor Vendor) {
        this.Vendor = Vendor;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CATALOG_ID")
    @DataItemName("MfReference.Route.Catalog")
    public Catalog getCatalog() {
        return this.Catalog;
    }

    public void setCatalog(Catalog Catalog) {
        this.Catalog = Catalog;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CUSTOMER_ID")
    @DataItemName("MfReference.Route.Customer")
    public Contractor getCustomer() {
        return this.Customer;
    }

    public void setCustomer(Contractor Customer) {
        this.Customer = Customer;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "SRC_WAREHOUSE_ID")
    @DataItemName("MfReference.Route.SrcWarehouse")
    public Warehouse getSrcWarehouse() {
        return this.SrcWarehouse;
    }

    public void setSrcWarehouse(Warehouse SrcWarehouse) {
        this.SrcWarehouse = SrcWarehouse;
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
    @JoinColumn(name = "DEST_WAREHOUSE_ID")
    @DataItemName("MfReference.Route.DestWarehouse")
    public Warehouse getDestWarehouse() {
        return this.DestWarehouse;
    }

    public void setDestWarehouse(Warehouse DestWarehouse) {
        this.DestWarehouse = DestWarehouse;
    }

    @Column(name = "SRC_TYPE", nullable = false)
    @Enumerated(EnumType.ORDINAL)
    public RouteSrcType getSrcType() {
        return this.SrcType;
    }

    public void setSrcType(RouteSrcType SrcType) {
        this.SrcType = SrcType;
    }

    @Column(name = "SRC_CYCLE", columnDefinition = "INTEGER")
    @DataItemName("MfReference.Route.SrcCycle")
    public Integer getSrcCycle() {
        return this.SrcCycle;
    }

    public void setSrcCycle(Integer SrcCycle) {
        this.SrcCycle = SrcCycle;
    }

    @Column(name = "SRC_RANK", columnDefinition = "SMALLINT")
    @DataItemName("MfReference.Route.SrcRank")
    public Short getSrcRank() {
        return this.SrcRank;
    }

    public void setSrcRank(Short SrcRank) {
        this.SrcRank = SrcRank;
    }

    @Column(name = "SUPPLY_PERCENT", columnDefinition = "NUMERIC", precision = 18, scale = 3)
    @DataItemName("MfReference.Route.SupplyPercent")
    public BigDecimal getSupplyPercent() {
        return this.SupplyPercent;
    }

    public void setSupplyPercent(BigDecimal SupplyPercent) {
        this.SupplyPercent = SupplyPercent;
    }

    @Column(name = "DEST_TYPE", nullable = false)
    @Enumerated(EnumType.ORDINAL)
    public RouteDestType getDestType() {
        return this.DestType;
    }

    public void setDestType(RouteDestType DestType) {
        this.DestType = DestType;
    }

    @Column(name = "REORDER_MIN_QTY", columnDefinition = "NUMERIC", precision = 18, scale = 3)
    @DataItemName("MfReference.Route.ReMinQty")
    public BigDecimal getReorderMinQty() {
        return this.ReorderMinQty;
    }

    public void setReorderMinQty(BigDecimal ReorderMinQty) {
        this.ReorderMinQty = ReorderMinQty;
    }

    @Column(name = "REORDER_LOT_SIZE", columnDefinition = "NUMERIC", precision = 18, scale = 3)
    @DataItemName("MfReference.Route.ReorderLotSize")
    public BigDecimal getReorderLotSize() {
        return this.ReorderLotSize;
    }

    public void setReorderLotSize(BigDecimal ReorderLotSize) {
        this.ReorderLotSize = ReorderLotSize;
    }

    @Column(name = "DEST_CYCLE", columnDefinition = "INTEGER")
    @DataItemName("MfReference.Route.DestCycle")
    public Integer getDestCycle() {
        return this.DestCycle;
    }

    public void setDestCycle(Integer DestCycle) {
        this.DestCycle = DestCycle;
    }

    @Column(name = "QC_RECEIVING_DAYS", columnDefinition = "SMALLINT")
    @DataItemName("MfReference.Route.QcReceivingDays")
    public Short getQcReceivingDays() {
        return this.QcReceivingDays;
    }

    public void setQcReceivingDays(Short QcReceivingDays) {
        this.QcReceivingDays = QcReceivingDays;
    }

    @Column(name = "LEAD_TIME", columnDefinition = "SMALLINT")
    @DataItemName("MfReference.Route.LeadTime")
    public Short getLeadTime() {
        return this.LeadTime;
    }

    public void setLeadTime(Short LeadTime) {
        this.LeadTime = LeadTime;
    }

    @Column(name = "SAFETY_DAYS", columnDefinition = "SMALLINT")
    @DataItemName("MfReference.Route.SafetyDays")
    public Short getSafetyDays() {
        return this.SafetyDays;
    }

    public void setSafetyDays(Short SafetyDays) {
        this.SafetyDays = SafetyDays;
    }
}

