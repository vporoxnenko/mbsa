package com.mg.merp.salary.model;

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
 * ReplacedFee generated by hbm2java
 */
@Entity
@Table(name = "SAL_REPLACED_FEE")
public class ReplacedFee extends com.mg.merp.core.model.AbstractEntity implements java.io.Serializable {

    private Integer Id;

    private FeeRef FeeRef;

    private SysClient SysClient;

    private FeeRef ReplacedFee;

    public ReplacedFee() {
    }

    public ReplacedFee(FeeRef FeeRef, SysClient SysClient, FeeRef ReplacedFee) {
        this.FeeRef = FeeRef;
        this.SysClient = SysClient;
        this.ReplacedFee = ReplacedFee;
    }

    @SequenceGenerator(name = "generator", sequenceName = "SAL_REPLACED_FEE_ID_GEN")
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
    @JoinColumn(name = "FEE_REF_ID")
    @DataItemName("Salary.FeeIncluded.FeeRef")
    public FeeRef getFeeRef() {
        return this.FeeRef;
    }

    public void setFeeRef(FeeRef FeeRef) {
        this.FeeRef = FeeRef;
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
    @JoinColumn(name = "REPLACED_FEE_ID")
    public FeeRef getReplacedFee() {
        return this.ReplacedFee;
    }

    public void setReplacedFee(FeeRef ReplacedFee) {
        this.ReplacedFee = ReplacedFee;
    }
}

