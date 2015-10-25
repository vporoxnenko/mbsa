package com.mg.merp.finance.model;

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
 * TurnFeature generated by hbm2java
 */
@Entity
@Table(name = "FINTURNFEAT")
public class TurnFeature extends com.mg.merp.core.model.AbstractEntity implements java.io.Serializable {

    private Integer Id;

    private Account Account;

    private Account Feature;

    private SysClient SysClient;

    private TurnAccount TurnAccount;

    private Currency CurCode;

    private FinPeriod Period;

    private Integer Analytics1;

    private Integer Analytics2;

    private Integer Analytics3;

    private Integer Analytics4;

    private Integer Analytics5;

    private Integer FeatureAnalytics1;

    private Integer FeatureAnalytics2;

    private Integer FeatureAnalytics3;

    private Integer FeatureAnalytics4;

    private Integer FeatureAnalytics5;

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

    public TurnFeature() {
    }

    public TurnFeature(Account Account, Account Feature, SysClient SysClient, TurnAccount TurnAccount, Currency CurCode, FinPeriod Period, Integer Analytics1, Integer Analytics2, Integer Analytics3, Integer Analytics4, Integer Analytics5, Integer FeatureAnalytics1, Integer FeatureAnalytics2, Integer FeatureAnalytics3, Integer FeatureAnalytics4, Integer FeatureAnalytics5, BigDecimal RemnBegCur, BigDecimal RemnBegNat, BigDecimal RemnBegCurPlan, BigDecimal RemnBegNatPlan, BigDecimal IncomeNat, BigDecimal IncomeCur, BigDecimal OutcomeNat, BigDecimal OutcomeCur, BigDecimal RemnEndNat, BigDecimal RemnEndCur, BigDecimal IncomeNatPlan, BigDecimal IncomeCurPlan, BigDecimal OutcomeNatPlan, BigDecimal OutcomeCurPlan, BigDecimal RemnEndNatPlan, BigDecimal RemnEndCurPlan) {
        this.Account = Account;
        this.Feature = Feature;
        this.SysClient = SysClient;
        this.TurnAccount = TurnAccount;
        this.CurCode = CurCode;
        this.Period = Period;
        this.Analytics1 = Analytics1;
        this.Analytics2 = Analytics2;
        this.Analytics3 = Analytics3;
        this.Analytics4 = Analytics4;
        this.Analytics5 = Analytics5;
        this.FeatureAnalytics1 = FeatureAnalytics1;
        this.FeatureAnalytics2 = FeatureAnalytics2;
        this.FeatureAnalytics3 = FeatureAnalytics3;
        this.FeatureAnalytics4 = FeatureAnalytics4;
        this.FeatureAnalytics5 = FeatureAnalytics5;
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

    @SequenceGenerator(name = "generator", sequenceName = "FINTURNFEAT_ID_GEN")
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
    @JoinColumn(name = "Account", insertable = false, updatable = false)
    public Account getAccount() {
        return this.Account;
    }

    public void setAccount(Account Account) {
        this.Account = Account;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "FEAT_ID")
    @DataItemName("Finance.TurnAccount.Feature")
    public Account getFeature() {
        return this.Feature;
    }

    public void setFeature(Account Feature) {
        this.Feature = Feature;
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
    @JoinColumn(name = "FINTURNACC_ID")
    public TurnAccount getTurnAccount() {
        return this.TurnAccount;
    }

    public void setTurnAccount(TurnAccount TurnAccount) {
        this.TurnAccount = TurnAccount;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CURCODE")
    public Currency getCurCode() {
        return this.CurCode;
    }

    public void setCurCode(Currency CurCode) {
        this.CurCode = CurCode;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PERIOD_ID")
    public FinPeriod getPeriod() {
        return this.Period;
    }

    public void setPeriod(FinPeriod Period) {
        this.Period = Period;
    }

    @Column(name = "Analytics1", insertable = false, updatable = false)
    @DataItemName("Finance.Analytics1")
    public Integer getAnalytics1() {
        return this.Analytics1;
    }

    public void setAnalytics1(Integer Analytics1) {
        this.Analytics1 = Analytics1;
    }

    @Column(name = "Analytics2", insertable = false, updatable = false)
    @DataItemName("Finance.Analytics2")
    public Integer getAnalytics2() {
        return this.Analytics2;
    }

    public void setAnalytics2(Integer Analytics2) {
        this.Analytics2 = Analytics2;
    }

    @Column(name = "Analytics3", insertable = false, updatable = false)
    @DataItemName("Finance.Analytics3")
    public Integer getAnalytics3() {
        return this.Analytics3;
    }

    public void setAnalytics3(Integer Analytics3) {
        this.Analytics3 = Analytics3;
    }

    @Column(name = "Analytics4", insertable = false, updatable = false)
    @DataItemName("Finance.Analytics4")
    public Integer getAnalytics4() {
        return this.Analytics4;
    }

    public void setAnalytics4(Integer Analytics4) {
        this.Analytics4 = Analytics4;
    }

    @Column(name = "Analytics5", insertable = false, updatable = false)
    @DataItemName("Finance.Analytics5")
    public Integer getAnalytics5() {
        return this.Analytics5;
    }

    public void setAnalytics5(Integer Analytics5) {
        this.Analytics5 = Analytics5;
    }

    @Column(name = "FANL1_ID", columnDefinition = "INTEGER")
    @DataItemName("Finance.FeatAnalytics1")
    public Integer getFeatureAnalytics1() {
        return this.FeatureAnalytics1;
    }

    public void setFeatureAnalytics1(Integer FeatureAnalytics1) {
        this.FeatureAnalytics1 = FeatureAnalytics1;
    }

    @Column(name = "FANL2_ID", columnDefinition = "INTEGER")
    @DataItemName("Finance.FeatAnalytics2")
    public Integer getFeatureAnalytics2() {
        return this.FeatureAnalytics2;
    }

    public void setFeatureAnalytics2(Integer FeatureAnalytics2) {
        this.FeatureAnalytics2 = FeatureAnalytics2;
    }

    @Column(name = "FANL3_ID", columnDefinition = "INTEGER")
    @DataItemName("Finance.FeatAnalytics3")
    public Integer getFeatureAnalytics3() {
        return this.FeatureAnalytics3;
    }

    public void setFeatureAnalytics3(Integer FeatureAnalytics3) {
        this.FeatureAnalytics3 = FeatureAnalytics3;
    }

    @Column(name = "FANL4_ID", columnDefinition = "INTEGER")
    @DataItemName("Finance.FeatAnalytics4")
    public Integer getFeatureAnalytics4() {
        return this.FeatureAnalytics4;
    }

    public void setFeatureAnalytics4(Integer FeatureAnalytics4) {
        this.FeatureAnalytics4 = FeatureAnalytics4;
    }

    @Column(name = "FANL5_ID", columnDefinition = "INTEGER")
    @DataItemName("Finance.FeatAnalytics5")
    public Integer getFeatureAnalytics5() {
        return this.FeatureAnalytics5;
    }

    public void setFeatureAnalytics5(Integer FeatureAnalytics5) {
        this.FeatureAnalytics5 = FeatureAnalytics5;
    }

    @Column(name = "REMNBEGCUR", columnDefinition = "NUMERIC", precision = 15, scale = 4)
    @DataItemName("Finance.TurnAcc.RemnBegCur")
    public BigDecimal getRemnBegCur() {
        return this.RemnBegCur;
    }

    public void setRemnBegCur(BigDecimal RemnBegCur) {
        this.RemnBegCur = RemnBegCur;
    }

    @Column(name = "REMNBEGNAT", columnDefinition = "NUMERIC", precision = 15, scale = 4)
    @DataItemName("Finance.TurnAcc.RemnBegNat")
    public BigDecimal getRemnBegNat() {
        return this.RemnBegNat;
    }

    public void setRemnBegNat(BigDecimal RemnBegNat) {
        this.RemnBegNat = RemnBegNat;
    }

    @Column(name = "REMNBEGCURPLAN", columnDefinition = "NUMERIC", precision = 15, scale = 4)
    @DataItemName("Finance.TurnAcc.RemnBegCurPlan")
    public BigDecimal getRemnBegCurPlan() {
        return this.RemnBegCurPlan;
    }

    public void setRemnBegCurPlan(BigDecimal RemnBegCurPlan) {
        this.RemnBegCurPlan = RemnBegCurPlan;
    }

    @Column(name = "REMNBEGNATPLAN", columnDefinition = "NUMERIC", precision = 15, scale = 4)
    @DataItemName("Finance.TurnAcc.RemnBegNatPlan")
    public BigDecimal getRemnBegNatPlan() {
        return this.RemnBegNatPlan;
    }

    public void setRemnBegNatPlan(BigDecimal RemnBegNatPlan) {
        this.RemnBegNatPlan = RemnBegNatPlan;
    }

    @Column(name = "IncomeNat", insertable = false, updatable = false)
    @DataItemName("Finance.TurnAcc.IncomeNat")
    public BigDecimal getIncomeNat() {
        return this.IncomeNat;
    }

    public void setIncomeNat(BigDecimal IncomeNat) {
        this.IncomeNat = IncomeNat;
    }

    @Column(name = "IncomeCur", insertable = false, updatable = false)
    @DataItemName("Finance.TurnAcc.IncomeCur")
    public BigDecimal getIncomeCur() {
        return this.IncomeCur;
    }

    public void setIncomeCur(BigDecimal IncomeCur) {
        this.IncomeCur = IncomeCur;
    }

    @Column(name = "OutcomeNat", insertable = false, updatable = false)
    @DataItemName("Finance.TurnAcc.OutcomeNat")
    public BigDecimal getOutcomeNat() {
        return this.OutcomeNat;
    }

    public void setOutcomeNat(BigDecimal OutcomeNat) {
        this.OutcomeNat = OutcomeNat;
    }

    @Column(name = "OutcomeCur", insertable = false, updatable = false)
    @DataItemName("Finance.TurnAcc.OutcomeCur")
    public BigDecimal getOutcomeCur() {
        return this.OutcomeCur;
    }

    public void setOutcomeCur(BigDecimal OutcomeCur) {
        this.OutcomeCur = OutcomeCur;
    }

    @Column(name = "RemnEndNat", insertable = false, updatable = false)
    @DataItemName("Finance.TurnAcc.RemnEndNat")
    public BigDecimal getRemnEndNat() {
        return this.RemnEndNat;
    }

    public void setRemnEndNat(BigDecimal RemnEndNat) {
        this.RemnEndNat = RemnEndNat;
    }

    @Column(name = "RemnEndCur", insertable = false, updatable = false)
    @DataItemName("Finance.TurnAcc.RemnEndCur")
    public BigDecimal getRemnEndCur() {
        return this.RemnEndCur;
    }

    public void setRemnEndCur(BigDecimal RemnEndCur) {
        this.RemnEndCur = RemnEndCur;
    }

    @Column(name = "IncomeNatPlan", insertable = false, updatable = false)
    @DataItemName("Finance.TurnAcc.IncomeNatPlan")
    public BigDecimal getIncomeNatPlan() {
        return this.IncomeNatPlan;
    }

    public void setIncomeNatPlan(BigDecimal IncomeNatPlan) {
        this.IncomeNatPlan = IncomeNatPlan;
    }

    @Column(name = "IncomeCurPlan", insertable = false, updatable = false)
    @DataItemName("Finance.TurnAcc.IncomeCurPlan")
    public BigDecimal getIncomeCurPlan() {
        return this.IncomeCurPlan;
    }

    public void setIncomeCurPlan(BigDecimal IncomeCurPlan) {
        this.IncomeCurPlan = IncomeCurPlan;
    }

    @Column(name = "OutcomeNatPlan", insertable = false, updatable = false)
    @DataItemName("Finance.TurnAcc.OutcomeNatPlan")
    public BigDecimal getOutcomeNatPlan() {
        return this.OutcomeNatPlan;
    }

    public void setOutcomeNatPlan(BigDecimal OutcomeNatPlan) {
        this.OutcomeNatPlan = OutcomeNatPlan;
    }

    @Column(name = "OutcomeCurPlan", insertable = false, updatable = false)
    @DataItemName("Finance.TurnAcc.OutcomeCurPlan")
    public BigDecimal getOutcomeCurPlan() {
        return this.OutcomeCurPlan;
    }

    public void setOutcomeCurPlan(BigDecimal OutcomeCurPlan) {
        this.OutcomeCurPlan = OutcomeCurPlan;
    }

    @Column(name = "RemnEndNatPlan", insertable = false, updatable = false)
    @DataItemName("Finance.TurnAcc.RemnEndNatPlan")
    public BigDecimal getRemnEndNatPlan() {
        return this.RemnEndNatPlan;
    }

    public void setRemnEndNatPlan(BigDecimal RemnEndNatPlan) {
        this.RemnEndNatPlan = RemnEndNatPlan;
    }

    @Column(name = "RemnEndCurPlan", insertable = false, updatable = false)
    @DataItemName("Finance.TurnAcc.RemnEndCurPlan")
    public BigDecimal getRemnEndCurPlan() {
        return this.RemnEndCurPlan;
    }

    public void setRemnEndCurPlan(BigDecimal RemnEndCurPlan) {
        this.RemnEndCurPlan = RemnEndCurPlan;
    }

    @DataItemName("Finance.TurnAcc.IncomeCurDiff")
    public BigDecimal getIncomeCurDiff() {
        return IncomeCur.subtract(IncomeCurPlan);
    }

    @DataItemName("Finance.TurnAcc.IncomeNatDiff")
    public BigDecimal getIncomeNatDiff() {
        return IncomeNat.subtract(IncomeNatPlan);
    }

    @DataItemName("Finance.TurnAcc.OutcomeCurDiff")
    public BigDecimal getOutcomeCurDiff() {
        return OutcomeCur.subtract(OutcomeCurPlan);
    }

    @DataItemName("Finance.TurnAcc.OutcomeNatDiff")
    public BigDecimal getOutcomeNatDiff() {
        return OutcomeNat.subtract(OutcomeNatPlan);
    }

    @DataItemName("Finance.TurnAcc.RemnBegCurDiff")
    public BigDecimal getRemnBegCurDiff() {
        return RemnBegCur.subtract(RemnBegCurPlan);
    }

    @DataItemName("Finance.TurnAcc.RemnBegNatDiff")
    public BigDecimal getRemnBegNatDiff() {
        return RemnBegNat.subtract(RemnBegNatPlan);
    }

    @DataItemName("Finance.TurnAcc.RemnEndCurDiff")
    public BigDecimal getRemnEndCurDiff() {
        return RemnEndCur.subtract(RemnEndCurPlan);
    }

    @DataItemName("Finance.TurnAcc.RemnEndNatDiff")
    public BigDecimal getRemnEndNatDiff() {
        return RemnEndNat.subtract(RemnEndNatPlan);
    }
}

