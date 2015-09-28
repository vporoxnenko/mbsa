package com.mg.merp.salary.model;
// Generated Sep 28, 2015 11:36:59 PM by Hibernate Tools 3.6.0.Final


import com.mg.framework.support.orm.EnumUserType;
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

/**
 * IncludedFee generated by hbm2java
 */
@Entity
@Table(name="SAL_INCLUDED_FEE"
)
public class IncludedFee extends com.mg.merp.core.model.AbstractEntity implements java.io.Serializable {


     private Integer Id;
     private FeeRef IncludedFee;
     private FeeRef FeeRef;
     private SysClient SysClient;
     private EnumUserType SumSign;

    public IncludedFee() {
    }

    public IncludedFee(FeeRef IncludedFee, FeeRef FeeRef, SysClient SysClient, EnumUserType SumSign) {
       this.IncludedFee = IncludedFee;
       this.FeeRef = FeeRef;
       this.SysClient = SysClient;
       this.SumSign = SumSign;
    }
   
     @SequenceGenerator(name="generator", sequenceName="SAL_INCLUDED_FEE_ID_GEN")@Id @GeneratedValue(strategy=SEQUENCE, generator="generator")

    
    @Column(name="ID", unique=true, columnDefinition="INTEGER")
    public Integer getId() {
        return this.Id;
    }
    
    public void setId(Integer Id) {
        this.Id = Id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="INCLUDED_FEE_ID")
    public FeeRef getIncludedFee() {
        return this.IncludedFee;
    }
    
    public void setIncludedFee(FeeRef IncludedFee) {
        this.IncludedFee = IncludedFee;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="FEE_REF_ID")
    public FeeRef getFeeRef() {
        return this.FeeRef;
    }
    
    public void setFeeRef(FeeRef FeeRef) {
        this.FeeRef = FeeRef;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="CLIENT_ID")
    public SysClient getSysClient() {
        return this.SysClient;
    }
    
    public void setSysClient(SysClient SysClient) {
        this.SysClient = SysClient;
    }

    
    @Column(name="SUM_SIGN", columnDefinition="SMALLINT")
    public EnumUserType getSumSign() {
        return this.SumSign;
    }
    
    public void setSumSign(EnumUserType SumSign) {
        this.SumSign = SumSign;
    }




}


