package com.mg.merp.planning.model;
// Generated Sep 28, 2015 11:47:52 PM by Hibernate Tools 3.6.0.Final


import com.mg.merp.core.model.SysClient;
import com.mg.merp.mfreference.model.PlanningLevel;
import java.math.BigDecimal;
import java.util.Date;
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
 * ItemFamily generated by hbm2java
 */
@Entity
@Table(name="PP_ITEM_FAMILY"
)
public class ItemFamily extends com.mg.merp.core.model.AbstractEntity implements java.io.Serializable {


     private Integer Id;
     private PlanningLevel PlanningLevel;
     private GenericItem ChildGenericItem;
     private SysClient SysClient;
     private GenericItem ParentGenericItem;
     private Date EffOnDate;
     private Date EffOffDate;
     private BigDecimal AllocationPercent;

    public ItemFamily() {
    }

	
    public ItemFamily(PlanningLevel PlanningLevel, GenericItem ChildGenericItem, GenericItem ParentGenericItem) {
        this.PlanningLevel = PlanningLevel;
        this.ChildGenericItem = ChildGenericItem;
        this.ParentGenericItem = ParentGenericItem;
    }
    public ItemFamily(PlanningLevel PlanningLevel, GenericItem ChildGenericItem, SysClient SysClient, GenericItem ParentGenericItem, Date EffOnDate, Date EffOffDate, BigDecimal AllocationPercent) {
       this.PlanningLevel = PlanningLevel;
       this.ChildGenericItem = ChildGenericItem;
       this.SysClient = SysClient;
       this.ParentGenericItem = ParentGenericItem;
       this.EffOnDate = EffOnDate;
       this.EffOffDate = EffOffDate;
       this.AllocationPercent = AllocationPercent;
    }
   
     @SequenceGenerator(name="generator", sequenceName="PP_ITEM_FAMILY_ID_GEN")@Id @GeneratedValue(strategy=SEQUENCE, generator="generator")

    
    @Column(name="ID", unique=true, columnDefinition="INTEGER")
    public Integer getId() {
        return this.Id;
    }
    
    public void setId(Integer Id) {
        this.Id = Id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="PLANNING_LEVEL_ID", nullable=false)
    public PlanningLevel getPlanningLevel() {
        return this.PlanningLevel;
    }
    
    public void setPlanningLevel(PlanningLevel PlanningLevel) {
        this.PlanningLevel = PlanningLevel;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="CHILD_GENERIC_ITEM", nullable=false)
    public GenericItem getChildGenericItem() {
        return this.ChildGenericItem;
    }
    
    public void setChildGenericItem(GenericItem ChildGenericItem) {
        this.ChildGenericItem = ChildGenericItem;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="CLIENT_ID")
    public SysClient getSysClient() {
        return this.SysClient;
    }
    
    public void setSysClient(SysClient SysClient) {
        this.SysClient = SysClient;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="PARENT_GENERIC_ITEM", nullable=false)
    public GenericItem getParentGenericItem() {
        return this.ParentGenericItem;
    }
    
    public void setParentGenericItem(GenericItem ParentGenericItem) {
        this.ParentGenericItem = ParentGenericItem;
    }

    
    @Column(name="EFF_ON_DATE", columnDefinition="TIMESTAMP")
    public Date getEffOnDate() {
        return this.EffOnDate;
    }
    
    public void setEffOnDate(Date EffOnDate) {
        this.EffOnDate = EffOnDate;
    }

    
    @Column(name="EFF_OFF_DATE", columnDefinition="TIMESTAMP")
    public Date getEffOffDate() {
        return this.EffOffDate;
    }
    
    public void setEffOffDate(Date EffOffDate) {
        this.EffOffDate = EffOffDate;
    }

    
    @Column(name="ALLOCATION_PERCENT", columnDefinition="NUMERIC", precision=18, scale=6)
    public BigDecimal getAllocationPercent() {
        return this.AllocationPercent;
    }
    
    public void setAllocationPercent(BigDecimal AllocationPercent) {
        this.AllocationPercent = AllocationPercent;
    }




}

