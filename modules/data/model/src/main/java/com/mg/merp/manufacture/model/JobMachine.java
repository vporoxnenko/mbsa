package com.mg.merp.manufacture.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import com.mg.merp.core.model.SysClient;
import com.mg.merp.mfreference.model.CostCategories;
import com.mg.merp.mfreference.model.CostDetail;
import com.mg.merp.mfreference.model.MachineOverheadAllocationFlag;
import com.mg.merp.mfreference.model.MachineRecoveryFlag;
import com.mg.merp.mfreference.model.ResourceGroup;
import com.mg.merp.mfreference.model.TimeRateFlag;
import com.mg.merp.reference.model.Currency;
import com.mg.merp.reference.model.Measure;
import javax.persistence.Enumerated;
import javax.persistence.EnumType;
import com.mg.framework.api.annotations.DataItemName;

/**
 * JobMachine generated by hbm2java
 */
@Entity
@Table(name = "MF_JOB_MACHINE")
public class JobMachine extends com.mg.merp.manufacture.model.JobRouteResource implements java.io.Serializable {

    private Currency MchOhRateCurrency;

    private Currency MchRateCurrency;

    private CostCategories MchOhCostCategory;

    private Measure RunTimeMchUm;

    private CostCategories MchCostCategory;

    private TimeRateFlag TimeRateFlag;

    private long RunTicksMch;

    private BigDecimal MchNumber;

    private MachineRecoveryFlag MchRecoveryFlag;

    private BigDecimal MchRate;

    private boolean MchBackflushFlag;

    private MachineOverheadAllocationFlag MchOhAllocationFlag;

    private BigDecimal MchOhRate;

    private BigDecimal MchOhRatio;

    private boolean MchOhBackflushFlag;

    public JobMachine() {
    }

    public JobMachine(ResourceGroup ResourceGroup, CostDetail ActCostDetail, SysClient SysClient, CostDetail StdCostDetail, JobRoute Oper, Short ResourceType, Integer TimeSequence, Date EffOnDate, Date EffOffDate, String Comment, Currency MchOhRateCurrency, Currency MchRateCurrency, CostCategories MchOhCostCategory, Measure RunTimeMchUm, CostCategories MchCostCategory, TimeRateFlag TimeRateFlag, long RunTicksMch, BigDecimal MchNumber, MachineRecoveryFlag MchRecoveryFlag, BigDecimal MchRate, boolean MchBackflushFlag, MachineOverheadAllocationFlag MchOhAllocationFlag, BigDecimal MchOhRate, BigDecimal MchOhRatio, boolean MchOhBackflushFlag) {
        super(ResourceGroup, ActCostDetail, SysClient, StdCostDetail, Oper, ResourceType, TimeSequence, EffOnDate, EffOffDate, Comment);
        this.MchOhRateCurrency = MchOhRateCurrency;
        this.MchRateCurrency = MchRateCurrency;
        this.MchOhCostCategory = MchOhCostCategory;
        this.RunTimeMchUm = RunTimeMchUm;
        this.MchCostCategory = MchCostCategory;
        this.TimeRateFlag = TimeRateFlag;
        this.RunTicksMch = RunTicksMch;
        this.MchNumber = MchNumber;
        this.MchRecoveryFlag = MchRecoveryFlag;
        this.MchRate = MchRate;
        this.MchBackflushFlag = MchBackflushFlag;
        this.MchOhAllocationFlag = MchOhAllocationFlag;
        this.MchOhRate = MchOhRate;
        this.MchOhRatio = MchOhRatio;
        this.MchOhBackflushFlag = MchOhBackflushFlag;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MCH_OH_RATE_CUR_CODE")
    @DataItemName("Manufacture.JobMachine.MchOhRateCurCode")
    public Currency getMchOhRateCurrency() {
        return this.MchOhRateCurrency;
    }

    public void setMchOhRateCurrency(Currency MchOhRateCurrency) {
        this.MchOhRateCurrency = MchOhRateCurrency;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MCH_RATE_CUR_CODE")
    @DataItemName("Manufacture.JobMachine.MchRateCurCode")
    public Currency getMchRateCurrency() {
        return this.MchRateCurrency;
    }

    public void setMchRateCurrency(Currency MchRateCurrency) {
        this.MchRateCurrency = MchRateCurrency;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MCH_OH_COST_CATEGORY_ID")
    @DataItemName("Manufacture.JobMachine.MchOhCostCategory")
    public CostCategories getMchOhCostCategory() {
        return this.MchOhCostCategory;
    }

    public void setMchOhCostCategory(CostCategories MchOhCostCategory) {
        this.MchOhCostCategory = MchOhCostCategory;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "RUN_TIME_MCH_UM")
    @DataItemName("Manufacture.JobMachine.RunTimeMchUm")
    public Measure getRunTimeMchUm() {
        return this.RunTimeMchUm;
    }

    public void setRunTimeMchUm(Measure RunTimeMchUm) {
        this.RunTimeMchUm = RunTimeMchUm;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MCH_COST_CATEGORY_ID")
    @DataItemName("Manufacture.JobMachine.MchCostCategory")
    public CostCategories getMchCostCategory() {
        return this.MchCostCategory;
    }

    public void setMchCostCategory(CostCategories MchCostCategory) {
        this.MchCostCategory = MchCostCategory;
    }

    @Column(name = "TIME_RATE_FLAG")
    @Enumerated(EnumType.ORDINAL)
    public TimeRateFlag getTimeRateFlag() {
        return this.TimeRateFlag;
    }

    public void setTimeRateFlag(TimeRateFlag TimeRateFlag) {
        this.TimeRateFlag = TimeRateFlag;
    }

    @Column(name = "RUN_TICKS_MCH", columnDefinition = "NUMERIC", precision = 18, scale = 0)
    @DataItemName("Manufacture.JobMachine.RunTicksMch")
    public long getRunTicksMch() {
        return this.RunTicksMch;
    }

    public void setRunTicksMch(long RunTicksMch) {
        this.RunTicksMch = RunTicksMch;
    }

    @Column(name = "MCH_NUMBER", columnDefinition = "NUMERIC", precision = 18, scale = 6)
    @DataItemName("Manufacture.JobMachine.MchNumber")
    public BigDecimal getMchNumber() {
        return this.MchNumber;
    }

    public void setMchNumber(BigDecimal MchNumber) {
        this.MchNumber = MchNumber;
    }

    @Column(name = "MCH_RECOVERY_FLAG")
    @Enumerated(EnumType.ORDINAL)
    public MachineRecoveryFlag getMchRecoveryFlag() {
        return this.MchRecoveryFlag;
    }

    public void setMchRecoveryFlag(MachineRecoveryFlag MchRecoveryFlag) {
        this.MchRecoveryFlag = MchRecoveryFlag;
    }

    @Column(name = "MCH_RATE", columnDefinition = "NUMERIC", precision = 18, scale = 6)
    @DataItemName("Manufacture.JobMachine.MchRate")
    public BigDecimal getMchRate() {
        return this.MchRate;
    }

    public void setMchRate(BigDecimal MchRate) {
        this.MchRate = MchRate;
    }

    @Column(name = "MCH_BACKFLUSH_FLAG", columnDefinition = "SMALLINT")
    @DataItemName("Manufacture.JobMachine.MchBackflushFlag")
    public boolean isMchBackflushFlag() {
        return this.MchBackflushFlag;
    }

    public void setMchBackflushFlag(boolean MchBackflushFlag) {
        this.MchBackflushFlag = MchBackflushFlag;
    }

    @Column(name = "MCH_OH_ALLOCATION_FLAG")
    @Enumerated(EnumType.ORDINAL)
    public MachineOverheadAllocationFlag getMchOhAllocationFlag() {
        return this.MchOhAllocationFlag;
    }

    public void setMchOhAllocationFlag(MachineOverheadAllocationFlag MchOhAllocationFlag) {
        this.MchOhAllocationFlag = MchOhAllocationFlag;
    }

    @Column(name = "MCH_OH_RATE", columnDefinition = "NUMERIC", precision = 18, scale = 6)
    @DataItemName("Manufacture.JobMachine.MchOhRate")
    public BigDecimal getMchOhRate() {
        return this.MchOhRate;
    }

    public void setMchOhRate(BigDecimal MchOhRate) {
        this.MchOhRate = MchOhRate;
    }

    @Column(name = "MCH_OH_RATIO", columnDefinition = "NUMERIC", precision = 18, scale = 6)
    @DataItemName("Manufacture.JobMachine.MchOhRatio")
    public BigDecimal getMchOhRatio() {
        return this.MchOhRatio;
    }

    public void setMchOhRatio(BigDecimal MchOhRatio) {
        this.MchOhRatio = MchOhRatio;
    }

    @Column(name = "MCH_OH_BACKFLUSH_FLAG", columnDefinition = "SMALLINT")
    @DataItemName("Manufacture.JobMachine.MchOhBackflushFlag")
    public boolean isMchOhBackflushFlag() {
        return this.MchOhBackflushFlag;
    }

    public void setMchOhBackflushFlag(boolean MchOhBackflushFlag) {
        this.MchOhBackflushFlag = MchOhBackflushFlag;
    }
}

