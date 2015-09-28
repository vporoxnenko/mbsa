package com.mg.merp.manufacture.model;
// Generated Sep 28, 2015 11:36:59 PM by Hibernate Tools 3.6.0.Final


import com.mg.framework.support.orm.EnumUserType;
import com.mg.merp.core.model.SysClient;
import com.mg.merp.mfreference.model.CostCategories;
import com.mg.merp.mfreference.model.CostDetail;
import com.mg.merp.mfreference.model.ResourceGroup;
import com.mg.merp.reference.model.Catalog;
import com.mg.merp.reference.model.Currency;
import com.mg.merp.reference.model.Measure;
import com.mg.merp.warehouse.model.WarehouseZone;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * JobMaterial generated by hbm2java
 */
@Entity
@Table(name="MF_JOB_MATERIAL"
)
public class JobMaterial extends com.mg.merp.manufacture.model.JobRouteResource implements java.io.Serializable {


     private CostCategories MtlCostCategory;
     private Measure Measure;
     private Catalog Catalog;
     private WarehouseZone BackflushZone;
     private CostCategories MtlOhCostCategory;
     private Currency Currency;
     private Integer Revision;
     private int ViewSequence;
     private Integer ReportSequence;
     private EnumUserType QuantityRateFlag;
     private BigDecimal MtlQty;
     private BigDecimal ScrapFactor;
     private boolean MtlBackflushFlag;
     private EnumUserType MtlOhAllocationFlag;
     private BigDecimal MtlOhRate;
     private BigDecimal MtlOhRatio;
     private boolean MtlOhBackflushFlag;

    public JobMaterial() {
    }

	
    public JobMaterial(int ViewSequence) {
        this.ViewSequence = ViewSequence;
    }
    public JobMaterial(ResourceGroup ResourceGroup, CostDetail ActCostDetail, SysClient SysClient, CostDetail StdCostDetail, JobRoute Oper, Short ResourceType, Integer TimeSequence, Date EffOnDate, Date EffOffDate, String Comment, CostCategories MtlCostCategory, Measure Measure, Catalog Catalog, WarehouseZone BackflushZone, CostCategories MtlOhCostCategory, Currency Currency, Integer Revision, int ViewSequence, Integer ReportSequence, EnumUserType QuantityRateFlag, BigDecimal MtlQty, BigDecimal ScrapFactor, boolean MtlBackflushFlag, EnumUserType MtlOhAllocationFlag, BigDecimal MtlOhRate, BigDecimal MtlOhRatio, boolean MtlOhBackflushFlag) {
        super(ResourceGroup, ActCostDetail, SysClient, StdCostDetail, Oper, ResourceType, TimeSequence, EffOnDate, EffOffDate, Comment);        
       this.MtlCostCategory = MtlCostCategory;
       this.Measure = Measure;
       this.Catalog = Catalog;
       this.BackflushZone = BackflushZone;
       this.MtlOhCostCategory = MtlOhCostCategory;
       this.Currency = Currency;
       this.Revision = Revision;
       this.ViewSequence = ViewSequence;
       this.ReportSequence = ReportSequence;
       this.QuantityRateFlag = QuantityRateFlag;
       this.MtlQty = MtlQty;
       this.ScrapFactor = ScrapFactor;
       this.MtlBackflushFlag = MtlBackflushFlag;
       this.MtlOhAllocationFlag = MtlOhAllocationFlag;
       this.MtlOhRate = MtlOhRate;
       this.MtlOhRatio = MtlOhRatio;
       this.MtlOhBackflushFlag = MtlOhBackflushFlag;
    }
   

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="MTL_COST_CATEGORY_ID")
    public CostCategories getMtlCostCategory() {
        return this.MtlCostCategory;
    }
    
    public void setMtlCostCategory(CostCategories MtlCostCategory) {
        this.MtlCostCategory = MtlCostCategory;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="MEASURE_ID")
    public Measure getMeasure() {
        return this.Measure;
    }
    
    public void setMeasure(Measure Measure) {
        this.Measure = Measure;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="CATALOG_ID")
    public Catalog getCatalog() {
        return this.Catalog;
    }
    
    public void setCatalog(Catalog Catalog) {
        this.Catalog = Catalog;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="BACKFLUSH_ZONE_ID")
    public WarehouseZone getBackflushZone() {
        return this.BackflushZone;
    }
    
    public void setBackflushZone(WarehouseZone BackflushZone) {
        this.BackflushZone = BackflushZone;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="MTL_OH_COST_CATEGORY_ID")
    public CostCategories getMtlOhCostCategory() {
        return this.MtlOhCostCategory;
    }
    
    public void setMtlOhCostCategory(CostCategories MtlOhCostCategory) {
        this.MtlOhCostCategory = MtlOhCostCategory;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="CURRENCY_CODE")
    public Currency getCurrency() {
        return this.Currency;
    }
    
    public void setCurrency(Currency Currency) {
        this.Currency = Currency;
    }

    
    @Column(name="REVISION", columnDefinition="INTEGER")
    public Integer getRevision() {
        return this.Revision;
    }
    
    public void setRevision(Integer Revision) {
        this.Revision = Revision;
    }

    
    @Column(name="VIEW_SEQUENCE", nullable=false, columnDefinition="INTEGER")
    public int getViewSequence() {
        return this.ViewSequence;
    }
    
    public void setViewSequence(int ViewSequence) {
        this.ViewSequence = ViewSequence;
    }

    
    @Column(name="REPORT_SEQUENCE", columnDefinition="INTEGER")
    public Integer getReportSequence() {
        return this.ReportSequence;
    }
    
    public void setReportSequence(Integer ReportSequence) {
        this.ReportSequence = ReportSequence;
    }

    
    @Column(name="QUANTITY_RATE_FLAG", columnDefinition="SMALLINT")
    public EnumUserType getQuantityRateFlag() {
        return this.QuantityRateFlag;
    }
    
    public void setQuantityRateFlag(EnumUserType QuantityRateFlag) {
        this.QuantityRateFlag = QuantityRateFlag;
    }

    
    @Column(name="MTL_QTY", columnDefinition="NUMERIC", precision=18, scale=6)
    public BigDecimal getMtlQty() {
        return this.MtlQty;
    }
    
    public void setMtlQty(BigDecimal MtlQty) {
        this.MtlQty = MtlQty;
    }

    
    @Column(name="SCRAP_FACTOR", columnDefinition="NUMERIC", precision=18, scale=6)
    public BigDecimal getScrapFactor() {
        return this.ScrapFactor;
    }
    
    public void setScrapFactor(BigDecimal ScrapFactor) {
        this.ScrapFactor = ScrapFactor;
    }

    
    @Column(name="MTL_BACKFLUSH_FLAG", columnDefinition="SMALLINT")
    public boolean isMtlBackflushFlag() {
        return this.MtlBackflushFlag;
    }
    
    public void setMtlBackflushFlag(boolean MtlBackflushFlag) {
        this.MtlBackflushFlag = MtlBackflushFlag;
    }

    
    @Column(name="MTL_OH_ALLOCATION_FLAG", columnDefinition="SMALLINT")
    public EnumUserType getMtlOhAllocationFlag() {
        return this.MtlOhAllocationFlag;
    }
    
    public void setMtlOhAllocationFlag(EnumUserType MtlOhAllocationFlag) {
        this.MtlOhAllocationFlag = MtlOhAllocationFlag;
    }

    
    @Column(name="MTL_OH_RATE", columnDefinition="NUMERIC", precision=18, scale=6)
    public BigDecimal getMtlOhRate() {
        return this.MtlOhRate;
    }
    
    public void setMtlOhRate(BigDecimal MtlOhRate) {
        this.MtlOhRate = MtlOhRate;
    }

    
    @Column(name="MTL_OH_RATIO", columnDefinition="NUMERIC", precision=18, scale=6)
    public BigDecimal getMtlOhRatio() {
        return this.MtlOhRatio;
    }
    
    public void setMtlOhRatio(BigDecimal MtlOhRatio) {
        this.MtlOhRatio = MtlOhRatio;
    }

    
    @Column(name="MTL_OH_BACKFLUSH_FLAG", columnDefinition="SMALLINT")
    public boolean isMtlOhBackflushFlag() {
        return this.MtlOhBackflushFlag;
    }
    
    public void setMtlOhBackflushFlag(boolean MtlOhBackflushFlag) {
        this.MtlOhBackflushFlag = MtlOhBackflushFlag;
    }




}


