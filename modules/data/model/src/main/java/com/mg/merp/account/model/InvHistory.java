package com.mg.merp.account.model;
// Generated Sep 28, 2015 11:36:59 PM by Hibernate Tools 3.6.0.Final


import com.mg.framework.support.orm.EnumUserType;
import com.mg.merp.core.model.SysClient;
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
 * InvHistory generated by hbm2java
 */
@Entity
@Table(name="INVHISTORY"
)
public class InvHistory extends com.mg.merp.core.model.AbstractEntity implements java.io.Serializable {


     private int Id;
     private Inventory Inventory;
     private SysClient SysClient;
     private Amortization AccAmortization;
     private EconomicSpec EconomicSpec;
     private EconomicOper EconomicOper;
     private EnumUserType Kind;
     private BigDecimal DeltaBalCost;
     private BigDecimal DeltaDeprVal;
     private BigDecimal RevalFactor;
     private BigDecimal RevalSum;
     private Date ActDate;
     private BigDecimal DeltaBeginLoss;
     private BigDecimal DeltaInitialLoss;
     private String OldInvLocation;
     private Integer OldInvLocationId;
     private String OldInOperDocNum;
     private Date OldInOperDate;

    public InvHistory() {
    }

    public InvHistory(Inventory Inventory, SysClient SysClient, Amortization AccAmortization, EconomicSpec EconomicSpec, EconomicOper EconomicOper, EnumUserType Kind, BigDecimal DeltaBalCost, BigDecimal DeltaDeprVal, BigDecimal RevalFactor, BigDecimal RevalSum, Date ActDate, BigDecimal DeltaBeginLoss, BigDecimal DeltaInitialLoss, String OldInvLocation, Integer OldInvLocationId, String OldInOperDocNum, Date OldInOperDate) {
       this.Inventory = Inventory;
       this.SysClient = SysClient;
       this.AccAmortization = AccAmortization;
       this.EconomicSpec = EconomicSpec;
       this.EconomicOper = EconomicOper;
       this.Kind = Kind;
       this.DeltaBalCost = DeltaBalCost;
       this.DeltaDeprVal = DeltaDeprVal;
       this.RevalFactor = RevalFactor;
       this.RevalSum = RevalSum;
       this.ActDate = ActDate;
       this.DeltaBeginLoss = DeltaBeginLoss;
       this.DeltaInitialLoss = DeltaInitialLoss;
       this.OldInvLocation = OldInvLocation;
       this.OldInvLocationId = OldInvLocationId;
       this.OldInOperDocNum = OldInOperDocNum;
       this.OldInOperDate = OldInOperDate;
    }
   
     @SequenceGenerator(name="generator", sequenceName="INVHISTORY_ID_GEN")@Id @GeneratedValue(strategy=SEQUENCE, generator="generator")

    
    @Column(name="ID", unique=true, nullable=false, columnDefinition="INTEGER")
    public int getId() {
        return this.Id;
    }
    
    public void setId(int Id) {
        this.Id = Id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="INVENTORY_ID")
    public Inventory getInventory() {
        return this.Inventory;
    }
    
    public void setInventory(Inventory Inventory) {
        this.Inventory = Inventory;
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
    @JoinColumn(name="AMORTIZATION_ID")
    public Amortization getAccAmortization() {
        return this.AccAmortization;
    }
    
    public void setAccAmortization(Amortization AccAmortization) {
        this.AccAmortization = AccAmortization;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="ES_ID")
    public EconomicSpec getEconomicSpec() {
        return this.EconomicSpec;
    }
    
    public void setEconomicSpec(EconomicSpec EconomicSpec) {
        this.EconomicSpec = EconomicSpec;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="EO_ID")
    public EconomicOper getEconomicOper() {
        return this.EconomicOper;
    }
    
    public void setEconomicOper(EconomicOper EconomicOper) {
        this.EconomicOper = EconomicOper;
    }

    
    @Column(name="KIND", columnDefinition="SMALLINT")
    public EnumUserType getKind() {
        return this.Kind;
    }
    
    public void setKind(EnumUserType Kind) {
        this.Kind = Kind;
    }

    
    @Column(name="DELTA_BALCOST", columnDefinition="NUMERIC", precision=15, scale=4)
    public BigDecimal getDeltaBalCost() {
        return this.DeltaBalCost;
    }
    
    public void setDeltaBalCost(BigDecimal DeltaBalCost) {
        this.DeltaBalCost = DeltaBalCost;
    }

    
    @Column(name="DELTA_DEPRVAL", columnDefinition="NUMERIC", precision=15, scale=4)
    public BigDecimal getDeltaDeprVal() {
        return this.DeltaDeprVal;
    }
    
    public void setDeltaDeprVal(BigDecimal DeltaDeprVal) {
        this.DeltaDeprVal = DeltaDeprVal;
    }

    
    @Column(name="REVAL_FACTOR", columnDefinition="NUMERIC", precision=18, scale=6)
    public BigDecimal getRevalFactor() {
        return this.RevalFactor;
    }
    
    public void setRevalFactor(BigDecimal RevalFactor) {
        this.RevalFactor = RevalFactor;
    }

    
    @Column(name="REVAL_SUM", columnDefinition="NUMERIC", precision=15, scale=4)
    public BigDecimal getRevalSum() {
        return this.RevalSum;
    }
    
    public void setRevalSum(BigDecimal RevalSum) {
        this.RevalSum = RevalSum;
    }

    
    @Column(name="ACT_DATE", columnDefinition="TIMESTAMP")
    public Date getActDate() {
        return this.ActDate;
    }
    
    public void setActDate(Date ActDate) {
        this.ActDate = ActDate;
    }

    
    @Column(name="DELTA_BEGINLOSS", columnDefinition="NUMERIC", precision=15, scale=4)
    public BigDecimal getDeltaBeginLoss() {
        return this.DeltaBeginLoss;
    }
    
    public void setDeltaBeginLoss(BigDecimal DeltaBeginLoss) {
        this.DeltaBeginLoss = DeltaBeginLoss;
    }

    
    @Column(name="DELTA_INITIALLOSS", columnDefinition="NUMERIC", precision=15, scale=4)
    public BigDecimal getDeltaInitialLoss() {
        return this.DeltaInitialLoss;
    }
    
    public void setDeltaInitialLoss(BigDecimal DeltaInitialLoss) {
        this.DeltaInitialLoss = DeltaInitialLoss;
    }

    
    @Column(name="OLD_INVLOCATION", columnDefinition="CHAR", length=20)
    public String getOldInvLocation() {
        return this.OldInvLocation;
    }
    
    public void setOldInvLocation(String OldInvLocation) {
        this.OldInvLocation = OldInvLocation;
    }

    
    @Column(name="OLD_INVLOCATION_ID", columnDefinition="INTEGER")
    public Integer getOldInvLocationId() {
        return this.OldInvLocationId;
    }
    
    public void setOldInvLocationId(Integer OldInvLocationId) {
        this.OldInvLocationId = OldInvLocationId;
    }

    
    @Column(name="OLD_INOPERDOCNUM", columnDefinition="CHAR", length=20)
    public String getOldInOperDocNum() {
        return this.OldInOperDocNum;
    }
    
    public void setOldInOperDocNum(String OldInOperDocNum) {
        this.OldInOperDocNum = OldInOperDocNum;
    }

    
    @Column(name="OLD_INOPERDATE", columnDefinition="TIMESTAMP")
    public Date getOldInOperDate() {
        return this.OldInOperDate;
    }
    
    public void setOldInOperDate(Date OldInOperDate) {
        this.OldInOperDate = OldInOperDate;
    }




}


