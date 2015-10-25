package com.mg.merp.mfreference.model;

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
import com.mg.framework.api.annotations.DataItemName;

/**
 * WorkCenterRates generated by hbm2java
 */
@Entity
@Table(name = "MF_WC_RATES")
public class WorkCenterRates extends com.mg.merp.core.model.AbstractEntity implements java.io.Serializable {

    private Integer Id;

    private SysClient SysClient;

    private WorkCenter WorkCenter;

    private Date EffOnDate;

    private Date EffOffDate;

    private BigDecimal MchFohRate;

    private BigDecimal MchVohRate;

    private BigDecimal LbrRunRate;

    private BigDecimal LbrSetupRate;

    private BigDecimal LbrFohRate;

    private BigDecimal LbrVohRate;

    public WorkCenterRates() {
    }

    public WorkCenterRates(SysClient SysClient, WorkCenter WorkCenter, Date EffOnDate, Date EffOffDate, BigDecimal MchFohRate, BigDecimal MchVohRate, BigDecimal LbrRunRate, BigDecimal LbrSetupRate, BigDecimal LbrFohRate, BigDecimal LbrVohRate) {
        this.SysClient = SysClient;
        this.WorkCenter = WorkCenter;
        this.EffOnDate = EffOnDate;
        this.EffOffDate = EffOffDate;
        this.MchFohRate = MchFohRate;
        this.MchVohRate = MchVohRate;
        this.LbrRunRate = LbrRunRate;
        this.LbrSetupRate = LbrSetupRate;
        this.LbrFohRate = LbrFohRate;
        this.LbrVohRate = LbrVohRate;
    }

    @SequenceGenerator(name = "generator", sequenceName = "MF_WC_RATES_ID_GEN")
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
    @JoinColumn(name = "WC_ID")
    public WorkCenter getWorkCenter() {
        return this.WorkCenter;
    }

    public void setWorkCenter(WorkCenter WorkCenter) {
        this.WorkCenter = WorkCenter;
    }

    @Column(name = "EFF_ON_DATE", columnDefinition = "TIMESTAMP")
    @DataItemName("MfReference.WorkCenterRates.EffOnDate")
    public Date getEffOnDate() {
        return this.EffOnDate;
    }

    public void setEffOnDate(Date EffOnDate) {
        this.EffOnDate = EffOnDate;
    }

    @Column(name = "EFF_OFF_DATE", columnDefinition = "TIMESTAMP")
    @DataItemName("MfReference.WorkCenterRates.EffOffDate")
    public Date getEffOffDate() {
        return this.EffOffDate;
    }

    public void setEffOffDate(Date EffOffDate) {
        this.EffOffDate = EffOffDate;
    }

    @Column(name = "MCH_FOH_RATE", columnDefinition = "NUMERIC", precision = 15, scale = 4)
    @DataItemName("MfReference.WorkCenterRates.MchFohRate")
    public BigDecimal getMchFohRate() {
        return this.MchFohRate;
    }

    public void setMchFohRate(BigDecimal MchFohRate) {
        this.MchFohRate = MchFohRate;
    }

    @Column(name = "MCH_VOH_RATE", columnDefinition = "NUMERIC", precision = 15, scale = 4)
    @DataItemName("MfReference.WorkCenterRates.MchVohRate")
    public BigDecimal getMchVohRate() {
        return this.MchVohRate;
    }

    public void setMchVohRate(BigDecimal MchVohRate) {
        this.MchVohRate = MchVohRate;
    }

    @Column(name = "LBR_RUN_RATE", columnDefinition = "NUMERIC", precision = 15, scale = 4)
    @DataItemName("MfReference.WorkCenterRates.LbrRunRate")
    public BigDecimal getLbrRunRate() {
        return this.LbrRunRate;
    }

    public void setLbrRunRate(BigDecimal LbrRunRate) {
        this.LbrRunRate = LbrRunRate;
    }

    @Column(name = "LBR_SETUP_RATE", columnDefinition = "NUMERIC", precision = 15, scale = 4)
    @DataItemName("MfReference.WorkCenterRates.LbrSetupRate")
    public BigDecimal getLbrSetupRate() {
        return this.LbrSetupRate;
    }

    public void setLbrSetupRate(BigDecimal LbrSetupRate) {
        this.LbrSetupRate = LbrSetupRate;
    }

    @Column(name = "LBR_FOH_RATE", columnDefinition = "NUMERIC", precision = 15, scale = 4)
    @DataItemName("MfReference.WorkCenterRates.LbrFohRate")
    public BigDecimal getLbrFohRate() {
        return this.LbrFohRate;
    }

    public void setLbrFohRate(BigDecimal LbrFohRate) {
        this.LbrFohRate = LbrFohRate;
    }

    @Column(name = "LBR_VOH_RATE", columnDefinition = "NUMERIC", precision = 15, scale = 4)
    @DataItemName("MfReference.WorkCenterRates.LbrVohRate")
    public BigDecimal getLbrVohRate() {
        return this.LbrVohRate;
    }

    public void setLbrVohRate(BigDecimal LbrVohRate) {
        this.LbrVohRate = LbrVohRate;
    }
}

