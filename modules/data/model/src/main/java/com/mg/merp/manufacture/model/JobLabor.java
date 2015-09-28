package com.mg.merp.manufacture.model;
// Generated Sep 28, 2015 11:36:59 PM by Hibernate Tools 3.6.0.Final


import com.mg.framework.support.orm.EnumUserType;
import com.mg.merp.core.model.SysClient;
import com.mg.merp.mfreference.model.CostCategories;
import com.mg.merp.mfreference.model.CostDetail;
import com.mg.merp.mfreference.model.ResourceGroup;
import com.mg.merp.reference.model.Currency;
import com.mg.merp.reference.model.Measure;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * JobLabor generated by hbm2java
 */
@Entity
@Table(name="MF_JOB_LABOR"
)
public class JobLabor extends com.mg.merp.manufacture.model.JobRouteResource implements java.io.Serializable {


     private Measure RunTimeLbrUm;
     private Currency LbrOhRateCurrency;
     private CostCategories LbrCostCategory;
     private CostCategories LbrOhCostCategory;
     private Currency LbrRateCurrency;
     private EnumUserType TimeRateFlag;
     private long RunTicksLbr;
     private BigDecimal LbrNumber;
     private BigDecimal LbrRate;
     private boolean LbrBackflushFlag;
     private EnumUserType LbrOhAllocationFlag;
     private BigDecimal LbrOhRate;
     private BigDecimal LbrOhRatio;
     private boolean LbrOhBackflushFlag;

    public JobLabor() {
    }

    public JobLabor(ResourceGroup ResourceGroup, CostDetail ActCostDetail, SysClient SysClient, CostDetail StdCostDetail, JobRoute Oper, Short ResourceType, Integer TimeSequence, Date EffOnDate, Date EffOffDate, String Comment, Measure RunTimeLbrUm, Currency LbrOhRateCurrency, CostCategories LbrCostCategory, CostCategories LbrOhCostCategory, Currency LbrRateCurrency, EnumUserType TimeRateFlag, long RunTicksLbr, BigDecimal LbrNumber, BigDecimal LbrRate, boolean LbrBackflushFlag, EnumUserType LbrOhAllocationFlag, BigDecimal LbrOhRate, BigDecimal LbrOhRatio, boolean LbrOhBackflushFlag) {
        super(ResourceGroup, ActCostDetail, SysClient, StdCostDetail, Oper, ResourceType, TimeSequence, EffOnDate, EffOffDate, Comment);        
       this.RunTimeLbrUm = RunTimeLbrUm;
       this.LbrOhRateCurrency = LbrOhRateCurrency;
       this.LbrCostCategory = LbrCostCategory;
       this.LbrOhCostCategory = LbrOhCostCategory;
       this.LbrRateCurrency = LbrRateCurrency;
       this.TimeRateFlag = TimeRateFlag;
       this.RunTicksLbr = RunTicksLbr;
       this.LbrNumber = LbrNumber;
       this.LbrRate = LbrRate;
       this.LbrBackflushFlag = LbrBackflushFlag;
       this.LbrOhAllocationFlag = LbrOhAllocationFlag;
       this.LbrOhRate = LbrOhRate;
       this.LbrOhRatio = LbrOhRatio;
       this.LbrOhBackflushFlag = LbrOhBackflushFlag;
    }
   

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="RUN_TIME_LBR_UM")
    public Measure getRunTimeLbrUm() {
        return this.RunTimeLbrUm;
    }
    
    public void setRunTimeLbrUm(Measure RunTimeLbrUm) {
        this.RunTimeLbrUm = RunTimeLbrUm;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="LBR_OH_RATE_CUR_CODE")
    public Currency getLbrOhRateCurrency() {
        return this.LbrOhRateCurrency;
    }
    
    public void setLbrOhRateCurrency(Currency LbrOhRateCurrency) {
        this.LbrOhRateCurrency = LbrOhRateCurrency;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="LBR_COST_CATEGORY_ID")
    public CostCategories getLbrCostCategory() {
        return this.LbrCostCategory;
    }
    
    public void setLbrCostCategory(CostCategories LbrCostCategory) {
        this.LbrCostCategory = LbrCostCategory;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="LBR_OH_COST_CATEGORY_ID")
    public CostCategories getLbrOhCostCategory() {
        return this.LbrOhCostCategory;
    }
    
    public void setLbrOhCostCategory(CostCategories LbrOhCostCategory) {
        this.LbrOhCostCategory = LbrOhCostCategory;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="LBR_RATE_CUR_CODE")
    public Currency getLbrRateCurrency() {
        return this.LbrRateCurrency;
    }
    
    public void setLbrRateCurrency(Currency LbrRateCurrency) {
        this.LbrRateCurrency = LbrRateCurrency;
    }

    
    @Column(name="TIME_RATE_FLAG", columnDefinition="SMALLINT")
    public EnumUserType getTimeRateFlag() {
        return this.TimeRateFlag;
    }
    
    public void setTimeRateFlag(EnumUserType TimeRateFlag) {
        this.TimeRateFlag = TimeRateFlag;
    }

    
    @Column(name="RUN_TICKS_LBR", columnDefinition="NUMERIC", precision=18, scale=0)
    public long getRunTicksLbr() {
        return this.RunTicksLbr;
    }
    
    public void setRunTicksLbr(long RunTicksLbr) {
        this.RunTicksLbr = RunTicksLbr;
    }

    
    @Column(name="LBR_NUMBER", columnDefinition="NUMERIC", precision=18, scale=6)
    public BigDecimal getLbrNumber() {
        return this.LbrNumber;
    }
    
    public void setLbrNumber(BigDecimal LbrNumber) {
        this.LbrNumber = LbrNumber;
    }

    
    @Column(name="LBR_RATE", columnDefinition="NUMERIC", precision=18, scale=6)
    public BigDecimal getLbrRate() {
        return this.LbrRate;
    }
    
    public void setLbrRate(BigDecimal LbrRate) {
        this.LbrRate = LbrRate;
    }

    
    @Column(name="LBR_BACKFLUSH_FLAG", columnDefinition="SMALLINT")
    public boolean isLbrBackflushFlag() {
        return this.LbrBackflushFlag;
    }
    
    public void setLbrBackflushFlag(boolean LbrBackflushFlag) {
        this.LbrBackflushFlag = LbrBackflushFlag;
    }

    
    @Column(name="LBR_OH_ALLOCATION_FLAG", columnDefinition="SMALLINT")
    public EnumUserType getLbrOhAllocationFlag() {
        return this.LbrOhAllocationFlag;
    }
    
    public void setLbrOhAllocationFlag(EnumUserType LbrOhAllocationFlag) {
        this.LbrOhAllocationFlag = LbrOhAllocationFlag;
    }

    
    @Column(name="LBR_OH_RATE", columnDefinition="NUMERIC", precision=18, scale=6)
    public BigDecimal getLbrOhRate() {
        return this.LbrOhRate;
    }
    
    public void setLbrOhRate(BigDecimal LbrOhRate) {
        this.LbrOhRate = LbrOhRate;
    }

    
    @Column(name="LBR_OH_RATIO", columnDefinition="NUMERIC", precision=18, scale=6)
    public BigDecimal getLbrOhRatio() {
        return this.LbrOhRatio;
    }
    
    public void setLbrOhRatio(BigDecimal LbrOhRatio) {
        this.LbrOhRatio = LbrOhRatio;
    }

    
    @Column(name="LBR_OH_BACKFLUSH_FLAG", columnDefinition="SMALLINT")
    public boolean isLbrOhBackflushFlag() {
        return this.LbrOhBackflushFlag;
    }
    
    public void setLbrOhBackflushFlag(boolean LbrOhBackflushFlag) {
        this.LbrOhBackflushFlag = LbrOhBackflushFlag;
    }




}


