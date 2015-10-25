package com.mg.merp.salary.model;

import com.mg.merp.core.model.SysClient;
import com.mg.merp.personnelref.model.PositionFill;
import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.SEQUENCE;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import com.mg.framework.api.annotations.DataItemName;

/**
 * CalcList generated by hbm2java
 */
@Entity
@Table(name = "SAL_CALC_LIST")
public class CalcList extends com.mg.merp.core.model.AbstractEntity implements java.io.Serializable {

    private Integer Id;

    private SysClient SysClient;

    private PayRoll PayRoll;

    private PositionFill PositionFill;

    private boolean NeedParams;

    private boolean IsCalculated;

    private BigDecimal TotalSumma;

    private BigDecimal PositiveSumma;

    private BigDecimal NegativeSumma;

    private BigDecimal NeutralSumma;

    private boolean IsClosed;

    private Set<CalcListSection> CalcListSections = new HashSet<CalcListSection>(0);

    public CalcList() {
    }

    public CalcList(SysClient SysClient, PayRoll PayRoll, PositionFill PositionFill, boolean NeedParams, boolean IsCalculated, BigDecimal TotalSumma, BigDecimal PositiveSumma, BigDecimal NegativeSumma, BigDecimal NeutralSumma, boolean IsClosed, Set<CalcListSection> CalcListSections) {
        this.SysClient = SysClient;
        this.PayRoll = PayRoll;
        this.PositionFill = PositionFill;
        this.NeedParams = NeedParams;
        this.IsCalculated = IsCalculated;
        this.TotalSumma = TotalSumma;
        this.PositiveSumma = PositiveSumma;
        this.NegativeSumma = NegativeSumma;
        this.NeutralSumma = NeutralSumma;
        this.IsClosed = IsClosed;
        this.CalcListSections = CalcListSections;
    }

    @SequenceGenerator(name = "generator", sequenceName = "SAL_CALC_LIST_ID_GEN")
    @Id
    @GeneratedValue(strategy = SEQUENCE, generator = "generator")
    @Column(name = "ID", unique = true, columnDefinition = "INTEGER")
    //$NON-NLS-1$
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
    @JoinColumn(name = "PAY_ROLL_ID")
    public PayRoll getPayRoll() {
        return this.PayRoll;
    }

    public void setPayRoll(PayRoll PayRoll) {
        this.PayRoll = PayRoll;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "POSITION_FILL_ID")
    //$NON-NLS-1$
    @DataItemName("Salary.CalcListFee.PositionFill")
    public PositionFill getPositionFill() {
        return this.PositionFill;
    }

    public void setPositionFill(PositionFill PositionFill) {
        this.PositionFill = PositionFill;
    }

    @Column(name = "NEED_PARAMS", columnDefinition = "SMALLINT")
    //$NON-NLS-1$
    @DataItemName("Salary.CalcListFee.NeedParams")
    public boolean isNeedParams() {
        return this.NeedParams;
    }

    public void setNeedParams(boolean NeedParams) {
        this.NeedParams = NeedParams;
    }

    @Column(name = "IS_CALCULATED", columnDefinition = "SMALLINT")
    //$NON-NLS-1$
    @DataItemName("Salary.CalcListFee.IsCalculated")
    public boolean isCalculated() {
        return this.IsCalculated;
    }

    public void setCalculated(boolean IsCalculated) {
        this.IsCalculated = IsCalculated;
    }

    @Column(name = "TOTAL_SUMMA", columnDefinition = "NUMERIC", precision = 15, scale = 4)
    //$NON-NLS-1$
    @DataItemName("Salary.CalcListFee.TotalSumma")
    public BigDecimal getTotalSumma() {
        return this.TotalSumma;
    }

    public void setTotalSumma(BigDecimal TotalSumma) {
        this.TotalSumma = TotalSumma;
    }

    @Column(name = "POSITIVE_SUMMA", columnDefinition = "NUMERIC", precision = 15, scale = 4)
    //$NON-NLS-1$
    @DataItemName("Salary.CalcListFee.PositiveSumma")
    public BigDecimal getPositiveSumma() {
        return this.PositiveSumma;
    }

    public void setPositiveSumma(BigDecimal PositiveSumma) {
        this.PositiveSumma = PositiveSumma;
    }

    @Column(name = "NEGATIVE_SUMMA", columnDefinition = "NUMERIC", precision = 15, scale = 4)
    //$NON-NLS-1$
    @DataItemName("Salary.CalcListFee.NegativeSumma")
    public BigDecimal getNegativeSumma() {
        return this.NegativeSumma;
    }

    public void setNegativeSumma(BigDecimal NegativeSumma) {
        this.NegativeSumma = NegativeSumma;
    }

    @Column(name = "NEUTRAL_SUMMA", columnDefinition = "NUMERIC", precision = 15, scale = 4)
    //$NON-NLS-1$
    @DataItemName("Salary.CalcListFee.NeutralSumma")
    public BigDecimal getNeutralSumma() {
        return this.NeutralSumma;
    }

    public void setNeutralSumma(BigDecimal NeutralSumma) {
        this.NeutralSumma = NeutralSumma;
    }

    @Column(name = "IS_CLOSED", columnDefinition = "SMALLINT")
    //$NON-NLS-1$
    @DataItemName("Salary.CalcListFee.IsClosed")
    public boolean isClosed() {
        return this.IsClosed;
    }

    public void setClosed(boolean IsClosed) {
        this.IsClosed = IsClosed;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "CalcList")
    public Set<CalcListSection> getCalcListSections() {
        return this.CalcListSections;
    }

    public void setCalcListSections(Set<CalcListSection> CalcListSections) {
        this.CalcListSections = CalcListSections;
    }
}

