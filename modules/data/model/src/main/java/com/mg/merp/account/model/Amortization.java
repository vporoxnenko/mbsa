package com.mg.merp.account.model;

import com.mg.merp.core.model.SysClient;
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
 * Amortization generated by hbm2java
 */
@Entity
@Table(name = "ACC_AMORTIZATION")
@DataItemName("Account.Amortization")
public class Amortization extends com.mg.merp.core.model.AbstractEntity implements java.io.Serializable {

    private int Id;

    private Inventory Inventory;

    private SysClient SysClient;

    private Short NMonths;

    private Integer Batch;

    private BigDecimal BalanceCost;

    private BigDecimal AmRate;

    private BigDecimal SumRate;

    private Float ExplPeriodY;

    private Float ExplPeriodM;

    private BigDecimal SumPeriod;

    private Float ProductEst;

    private Float ProductFact;

    private BigDecimal SumProduct;

    private Float Factor;

    private BigDecimal SumAdd;

    private BigDecimal DeprValue;

    private BigDecimal SumDeprValue;

    private BigDecimal SumTotal;

    private short IMonth;

    private BigDecimal EndCost;

    private Integer AmCodeId;

    public Amortization() {
    }

    public Amortization(short IMonth) {
        this.IMonth = IMonth;
    }

    public Amortization(Inventory Inventory, SysClient SysClient, Short NMonths, Integer Batch, BigDecimal BalanceCost, BigDecimal AmRate, BigDecimal SumRate, Float ExplPeriodY, Float ExplPeriodM, BigDecimal SumPeriod, Float ProductEst, Float ProductFact, BigDecimal SumProduct, Float Factor, BigDecimal SumAdd, BigDecimal DeprValue, BigDecimal SumDeprValue, BigDecimal SumTotal, short IMonth, BigDecimal EndCost, Integer AmCodeId) {
        this.Inventory = Inventory;
        this.SysClient = SysClient;
        this.NMonths = NMonths;
        this.Batch = Batch;
        this.BalanceCost = BalanceCost;
        this.AmRate = AmRate;
        this.SumRate = SumRate;
        this.ExplPeriodY = ExplPeriodY;
        this.ExplPeriodM = ExplPeriodM;
        this.SumPeriod = SumPeriod;
        this.ProductEst = ProductEst;
        this.ProductFact = ProductFact;
        this.SumProduct = SumProduct;
        this.Factor = Factor;
        this.SumAdd = SumAdd;
        this.DeprValue = DeprValue;
        this.SumDeprValue = SumDeprValue;
        this.SumTotal = SumTotal;
        this.IMonth = IMonth;
        this.EndCost = EndCost;
        this.AmCodeId = AmCodeId;
    }

    @SequenceGenerator(name = "generator", sequenceName = "ACC_AMORTIZATION_ID_GEN")
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
    @JoinColumn(name = "INVENTORY_ID")
    public Inventory getInventory() {
        return this.Inventory;
    }

    public void setInventory(Inventory Inventory) {
        this.Inventory = Inventory;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CLIENT_ID")
    public SysClient getSysClient() {
        return this.SysClient;
    }

    public void setSysClient(SysClient SysClient) {
        this.SysClient = SysClient;
    }

    @Column(name = "N_MONTHS", columnDefinition = "SMALLINT")
    @DataItemName("Account.Amortization.NMonths")
    public Short getNMonths() {
        return this.NMonths;
    }

    public void setNMonths(Short NMonths) {
        this.NMonths = NMonths;
    }

    @Column(name = "BATCH", columnDefinition = "INTEGER")
    public Integer getBatch() {
        return this.Batch;
    }

    public void setBatch(Integer Batch) {
        this.Batch = Batch;
    }

    @Column(name = "BALANCECOST", columnDefinition = "NUMERIC", precision = 15, scale = 4)
    @DataItemName("Account.Amortization.BalanceCost")
    public BigDecimal getBalanceCost() {
        return this.BalanceCost;
    }

    public void setBalanceCost(BigDecimal BalanceCost) {
        this.BalanceCost = BalanceCost;
    }

    @Column(name = "AMRATE", columnDefinition = "NUMERIC", precision = 18, scale = 6)
    @DataItemName("Account.Amortization.AmRate")
    public BigDecimal getAmRate() {
        return this.AmRate;
    }

    public void setAmRate(BigDecimal AmRate) {
        this.AmRate = AmRate;
    }

    @Column(name = "SUM_RATE", columnDefinition = "NUMERIC", precision = 15, scale = 4)
    @DataItemName("Account.Amortization.SumRate")
    public BigDecimal getSumRate() {
        return this.SumRate;
    }

    public void setSumRate(BigDecimal SumRate) {
        this.SumRate = SumRate;
    }

    @Column(name = "EXPLPERIOD_Y", columnDefinition = "FLOAT")
    @DataItemName("Account.Amortization.ExplPeriodY")
    public Float getExplPeriodY() {
        return this.ExplPeriodY;
    }

    public void setExplPeriodY(Float ExplPeriodY) {
        this.ExplPeriodY = ExplPeriodY;
    }

    @Column(name = "EXPLPERIOD_M", columnDefinition = "FLOAT")
    @DataItemName("Account.Amortization.ExplPeriodM")
    public Float getExplPeriodM() {
        return this.ExplPeriodM;
    }

    public void setExplPeriodM(Float ExplPeriodM) {
        this.ExplPeriodM = ExplPeriodM;
    }

    @Column(name = "SUM_PERIOD", columnDefinition = "NUMERIC", precision = 15, scale = 4)
    @DataItemName("Account.Amortization.SumPeriod")
    public BigDecimal getSumPeriod() {
        return this.SumPeriod;
    }

    public void setSumPeriod(BigDecimal SumPeriod) {
        this.SumPeriod = SumPeriod;
    }

    @Column(name = "PRODUCT_EST", columnDefinition = "FLOAT")
    @DataItemName("Account.Amortization.ProductEst")
    public Float getProductEst() {
        return this.ProductEst;
    }

    public void setProductEst(Float ProductEst) {
        this.ProductEst = ProductEst;
    }

    @Column(name = "PRODUCT_FACT", columnDefinition = "FLOAT")
    @DataItemName("Account.Amortization.ProductFact")
    public Float getProductFact() {
        return this.ProductFact;
    }

    public void setProductFact(Float ProductFact) {
        this.ProductFact = ProductFact;
    }

    @Column(name = "SUM_PRODUCT", columnDefinition = "NUMERIC", precision = 15, scale = 4)
    @DataItemName("Account.Amortization.SumProduct")
    public BigDecimal getSumProduct() {
        return this.SumProduct;
    }

    public void setSumProduct(BigDecimal SumProduct) {
        this.SumProduct = SumProduct;
    }

    @Column(name = "FACTOR", columnDefinition = "FLOAT")
    @DataItemName("Account.Amortization.Factor")
    public Float getFactor() {
        return this.Factor;
    }

    public void setFactor(Float Factor) {
        this.Factor = Factor;
    }

    @Column(name = "SUM_ADD", columnDefinition = "NUMERIC", precision = 15, scale = 4)
    @DataItemName("Account.Amortization.SumAdd")
    public BigDecimal getSumAdd() {
        return this.SumAdd;
    }

    public void setSumAdd(BigDecimal SumAdd) {
        this.SumAdd = SumAdd;
    }

    @Column(name = "DEPRVALUE", columnDefinition = "NUMERIC", precision = 15, scale = 4)
    @DataItemName("Account.Amortization.EndCost")
    public BigDecimal getDeprValue() {
        return this.DeprValue;
    }

    public void setDeprValue(BigDecimal DeprValue) {
        this.DeprValue = DeprValue;
    }

    @Column(name = "SUM_DEPRVALUE", columnDefinition = "NUMERIC", precision = 15, scale = 4)
    @DataItemName("Account.Amortization.SumDeprValue")
    public BigDecimal getSumDeprValue() {
        return this.SumDeprValue;
    }

    public void setSumDeprValue(BigDecimal SumDeprValue) {
        this.SumDeprValue = SumDeprValue;
    }

    @Column(name = "SUM_TOTAL", columnDefinition = "NUMERIC", precision = 15, scale = 4)
    @DataItemName("Account.Amortization.SumTotal")
    public BigDecimal getSumTotal() {
        return this.SumTotal;
    }

    public void setSumTotal(BigDecimal SumTotal) {
        this.SumTotal = SumTotal;
    }

    @Column(name = "IMONTH", nullable = false, columnDefinition = "SMALLINT")
    @DataItemName("Account.Amortization.IMonth")
    public short getIMonth() {
        return this.IMonth;
    }

    public void setIMonth(short IMonth) {
        this.IMonth = IMonth;
    }

    @Column(name = "ENDCOST", columnDefinition = "NUMERIC", precision = 15, scale = 4)
    @DataItemName("Account.Inventory.EndCost")
    public BigDecimal getEndCost() {
        return this.EndCost;
    }

    public void setEndCost(BigDecimal EndCost) {
        this.EndCost = EndCost;
    }

    @Column(name = "AMCODE_ID", columnDefinition = "INTEGER")
    public Integer getAmCodeId() {
        return this.AmCodeId;
    }

    public void setAmCodeId(Integer AmCodeId) {
        this.AmCodeId = AmCodeId;
    }
}

