package com.mg.merp.finance.model;
// Generated Sep 28, 2015 11:47:52 PM by Hibernate Tools 3.6.0.Final


import com.mg.merp.core.model.SysClient;
import com.mg.merp.reference.model.Currency;
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
 * TurnAccount generated by hbm2java
 */
@Entity
@Table(name="FINTURNACC"
)
public class TurnAccount extends com.mg.merp.core.model.AbstractEntity implements java.io.Serializable {


     private Integer Id;
     private Account Account;
     private SysClient SysClient;
     private Currency CurCode;
     private FinPeriod Period;
     private Integer Analytics1;
     private Integer Analytics2;
     private Integer Analytics3;
     private Integer Analytics4;
     private Integer Analytics5;
     private BigDecimal RemnBegCur;
     private BigDecimal RemnBegNat;
     private BigDecimal RemnBegCurPlan;
     private BigDecimal RemnBegNatPlan;
     private BigDecimal IncomeNat;
     private BigDecimal IncomeCur;
     private BigDecimal OutcomeNat;
     private BigDecimal OutcomeCur;
     private BigDecimal RemnEndNat;
     private BigDecimal RemnEndCur;
     private BigDecimal IncomeNatPlan;
     private BigDecimal IncomeCurPlan;
     private BigDecimal OutcomeNatPlan;
     private BigDecimal OutcomeCurPlan;
     private BigDecimal RemnEndNatPlan;
     private BigDecimal RemnEndCurPlan;

    public TurnAccount() {
    }

    public TurnAccount(Account Account, SysClient SysClient, Currency CurCode, FinPeriod Period, Integer Analytics1, Integer Analytics2, Integer Analytics3, Integer Analytics4, Integer Analytics5, BigDecimal RemnBegCur, BigDecimal RemnBegNat, BigDecimal RemnBegCurPlan, BigDecimal RemnBegNatPlan, BigDecimal IncomeNat, BigDecimal IncomeCur, BigDecimal OutcomeNat, BigDecimal OutcomeCur, BigDecimal RemnEndNat, BigDecimal RemnEndCur, BigDecimal IncomeNatPlan, BigDecimal IncomeCurPlan, BigDecimal OutcomeNatPlan, BigDecimal OutcomeCurPlan, BigDecimal RemnEndNatPlan, BigDecimal RemnEndCurPlan) {
       this.Account = Account;
       this.SysClient = SysClient;
       this.CurCode = CurCode;
       this.Period = Period;
       this.Analytics1 = Analytics1;
       this.Analytics2 = Analytics2;
       this.Analytics3 = Analytics3;
       this.Analytics4 = Analytics4;
       this.Analytics5 = Analytics5;
       this.RemnBegCur = RemnBegCur;
       this.RemnBegNat = RemnBegNat;
       this.RemnBegCurPlan = RemnBegCurPlan;
       this.RemnBegNatPlan = RemnBegNatPlan;
       this.IncomeNat = IncomeNat;
       this.IncomeCur = IncomeCur;
       this.OutcomeNat = OutcomeNat;
       this.OutcomeCur = OutcomeCur;
       this.RemnEndNat = RemnEndNat;
       this.RemnEndCur = RemnEndCur;
       this.IncomeNatPlan = IncomeNatPlan;
       this.IncomeCurPlan = IncomeCurPlan;
       this.OutcomeNatPlan = OutcomeNatPlan;
       this.OutcomeCurPlan = OutcomeCurPlan;
       this.RemnEndNatPlan = RemnEndNatPlan;
       this.RemnEndCurPlan = RemnEndCurPlan;
    }
   
     @SequenceGenerator(name="generator", sequenceName="FINTURNACC_ID_GEN")@Id @GeneratedValue(strategy=SEQUENCE, generator="generator")

    
    @Column(name="ID", unique=true, columnDefinition="INTEGER")
    public Integer getId() {
        return this.Id;
    }
    
    public void setId(Integer Id) {
        this.Id = Id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="ACC_ID")
    public Account getAccount() {
        return this.Account;
    }
    
    public void setAccount(Account Account) {
        this.Account = Account;
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
    @JoinColumn(name="CURCODE")
    public Currency getCurCode() {
        return this.CurCode;
    }
    
    public void setCurCode(Currency CurCode) {
        this.CurCode = CurCode;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="PERIOD_ID")
    public FinPeriod getPeriod() {
        return this.Period;
    }
    
    public void setPeriod(FinPeriod Period) {
        this.Period = Period;
    }

    
    @Column(name="ANL1_ID", columnDefinition="INTEGER")
    public Integer getAnalytics1() {
        return this.Analytics1;
    }
    
    public void setAnalytics1(Integer Analytics1) {
        this.Analytics1 = Analytics1;
    }

    
    @Column(name="ANL2_ID", columnDefinition="INTEGER")
    public Integer getAnalytics2() {
        return this.Analytics2;
    }
    
    public void setAnalytics2(Integer Analytics2) {
        this.Analytics2 = Analytics2;
    }

    
    @Column(name="ANL3_ID", columnDefinition="INTEGER")
    public Integer getAnalytics3() {
        return this.Analytics3;
    }
    
    public void setAnalytics3(Integer Analytics3) {
        this.Analytics3 = Analytics3;
    }

    
    @Column(name="ANL4_ID", columnDefinition="INTEGER")
    public Integer getAnalytics4() {
        return this.Analytics4;
    }
    
    public void setAnalytics4(Integer Analytics4) {
        this.Analytics4 = Analytics4;
    }

    
    @Column(name="ANL5_ID", columnDefinition="INTEGER")
    public Integer getAnalytics5() {
        return this.Analytics5;
    }
    
    public void setAnalytics5(Integer Analytics5) {
        this.Analytics5 = Analytics5;
    }

    
    @Column(name="REMNBEGCUR", columnDefinition="NUMERIC", precision=15, scale=4)
    public BigDecimal getRemnBegCur() {
        return this.RemnBegCur;
    }
    
    public void setRemnBegCur(BigDecimal RemnBegCur) {
        this.RemnBegCur = RemnBegCur;
    }

    
    @Column(name="REMNBEGNAT", columnDefinition="NUMERIC", precision=15, scale=4)
    public BigDecimal getRemnBegNat() {
        return this.RemnBegNat;
    }
    
    public void setRemnBegNat(BigDecimal RemnBegNat) {
        this.RemnBegNat = RemnBegNat;
    }

    
    @Column(name="REMNBEGCURPLAN", columnDefinition="NUMERIC", precision=15, scale=4)
    public BigDecimal getRemnBegCurPlan() {
        return this.RemnBegCurPlan;
    }
    
    public void setRemnBegCurPlan(BigDecimal RemnBegCurPlan) {
        this.RemnBegCurPlan = RemnBegCurPlan;
    }

    
    @Column(name="REMNBEGNATPLAN", columnDefinition="NUMERIC", precision=15, scale=4)
    public BigDecimal getRemnBegNatPlan() {
        return this.RemnBegNatPlan;
    }
    
    public void setRemnBegNatPlan(BigDecimal RemnBegNatPlan) {
        this.RemnBegNatPlan = RemnBegNatPlan;
    }

    
    @Column(name="IncomeNat", insertable=false, updatable=false)
    public BigDecimal getIncomeNat() {
        return this.IncomeNat;
    }
    
    public void setIncomeNat(BigDecimal IncomeNat) {
        this.IncomeNat = IncomeNat;
    }

    
    @Column(name="IncomeCur", insertable=false, updatable=false)
    public BigDecimal getIncomeCur() {
        return this.IncomeCur;
    }
    
    public void setIncomeCur(BigDecimal IncomeCur) {
        this.IncomeCur = IncomeCur;
    }

    
    @Column(name="OutcomeNat", insertable=false, updatable=false)
    public BigDecimal getOutcomeNat() {
        return this.OutcomeNat;
    }
    
    public void setOutcomeNat(BigDecimal OutcomeNat) {
        this.OutcomeNat = OutcomeNat;
    }

    
    @Column(name="OutcomeCur", insertable=false, updatable=false)
    public BigDecimal getOutcomeCur() {
        return this.OutcomeCur;
    }
    
    public void setOutcomeCur(BigDecimal OutcomeCur) {
        this.OutcomeCur = OutcomeCur;
    }

    
    @Column(name="RemnEndNat", insertable=false, updatable=false)
    public BigDecimal getRemnEndNat() {
        return this.RemnEndNat;
    }
    
    public void setRemnEndNat(BigDecimal RemnEndNat) {
        this.RemnEndNat = RemnEndNat;
    }

    
    @Column(name="RemnEndCur", insertable=false, updatable=false)
    public BigDecimal getRemnEndCur() {
        return this.RemnEndCur;
    }
    
    public void setRemnEndCur(BigDecimal RemnEndCur) {
        this.RemnEndCur = RemnEndCur;
    }

    
    @Column(name="IncomeNatPlan", insertable=false, updatable=false)
    public BigDecimal getIncomeNatPlan() {
        return this.IncomeNatPlan;
    }
    
    public void setIncomeNatPlan(BigDecimal IncomeNatPlan) {
        this.IncomeNatPlan = IncomeNatPlan;
    }

    
    @Column(name="IncomeCurPlan", insertable=false, updatable=false)
    public BigDecimal getIncomeCurPlan() {
        return this.IncomeCurPlan;
    }
    
    public void setIncomeCurPlan(BigDecimal IncomeCurPlan) {
        this.IncomeCurPlan = IncomeCurPlan;
    }

    
    @Column(name="OutcomeNatPlan", insertable=false, updatable=false)
    public BigDecimal getOutcomeNatPlan() {
        return this.OutcomeNatPlan;
    }
    
    public void setOutcomeNatPlan(BigDecimal OutcomeNatPlan) {
        this.OutcomeNatPlan = OutcomeNatPlan;
    }

    
    @Column(name="OutcomeCurPlan", insertable=false, updatable=false)
    public BigDecimal getOutcomeCurPlan() {
        return this.OutcomeCurPlan;
    }
    
    public void setOutcomeCurPlan(BigDecimal OutcomeCurPlan) {
        this.OutcomeCurPlan = OutcomeCurPlan;
    }

    
    @Column(name="RemnEndNatPlan", insertable=false, updatable=false)
    public BigDecimal getRemnEndNatPlan() {
        return this.RemnEndNatPlan;
    }
    
    public void setRemnEndNatPlan(BigDecimal RemnEndNatPlan) {
        this.RemnEndNatPlan = RemnEndNatPlan;
    }

    
    @Column(name="RemnEndCurPlan", insertable=false, updatable=false)
    public BigDecimal getRemnEndCurPlan() {
        return this.RemnEndCurPlan;
    }
    
    public void setRemnEndCurPlan(BigDecimal RemnEndCurPlan) {
        this.RemnEndCurPlan = RemnEndCurPlan;
    }




}

