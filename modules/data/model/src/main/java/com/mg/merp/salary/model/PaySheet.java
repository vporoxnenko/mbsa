package com.mg.merp.salary.model;

import com.mg.merp.core.model.SysClient;
import com.mg.merp.document.model.DocHead;
import com.mg.merp.reference.model.Contractor;
import java.math.BigDecimal;
import java.util.Date;
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
 * PaySheet generated by hbm2java
 */
@Entity
@Table(name = "SAL_PAY_SHEET")
public class PaySheet extends com.mg.merp.core.model.AbstractEntity implements java.io.Serializable {

    private Integer Id;

    private Contractor Cashier;

    private Contractor Chief;

    private DocHead DocHead;

    private Contractor Bookkeeper;

    private SysClient SysClient;

    private PayRoll PayRoll;

    private DocHead InDocHead;

    private String SNumber;

    private Date BeginDate;

    private Date EndDate;

    private BigDecimal SummaFull;

    private Set<PaySheetSpec> SetOfSalPaySheetSpec = new HashSet<PaySheetSpec>(0);

    public PaySheet() {
    }

    public PaySheet(Contractor Cashier, Contractor Chief, DocHead DocHead, Contractor Bookkeeper, SysClient SysClient, PayRoll PayRoll, DocHead InDocHead, String SNumber, Date BeginDate, Date EndDate, BigDecimal SummaFull, Set<PaySheetSpec> SetOfSalPaySheetSpec) {
        this.Cashier = Cashier;
        this.Chief = Chief;
        this.DocHead = DocHead;
        this.Bookkeeper = Bookkeeper;
        this.SysClient = SysClient;
        this.PayRoll = PayRoll;
        this.InDocHead = InDocHead;
        this.SNumber = SNumber;
        this.BeginDate = BeginDate;
        this.EndDate = EndDate;
        this.SummaFull = SummaFull;
        this.SetOfSalPaySheetSpec = SetOfSalPaySheetSpec;
    }

    @SequenceGenerator(name = "generator", sequenceName = "SAL_PAY_SHEET_ID_GEN")
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
    @JoinColumn(name = "CASHIER_ID")
    @DataItemName("Salary.PaySheet.Cashier")
    public Contractor getCashier() {
        return this.Cashier;
    }

    public void setCashier(Contractor Cashier) {
        this.Cashier = Cashier;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CHIEF_ID")
    @DataItemName("Salary.PaySheet.Chief")
    public Contractor getChief() {
        return this.Chief;
    }

    public void setChief(Contractor Chief) {
        this.Chief = Chief;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "DOCHEAD_ID")
    public DocHead getDocHead() {
        return this.DocHead;
    }

    public void setDocHead(DocHead DocHead) {
        this.DocHead = DocHead;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "BOOKKEEPER_ID")
    @DataItemName("Salary.PaySheet.Bookkeeper")
    public Contractor getBookkeeper() {
        return this.Bookkeeper;
    }

    public void setBookkeeper(Contractor Bookkeeper) {
        this.Bookkeeper = Bookkeeper;
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
    @DataItemName("Salary.PaySheet.PayRoll")
    public PayRoll getPayRoll() {
        return this.PayRoll;
    }

    public void setPayRoll(PayRoll PayRoll) {
        this.PayRoll = PayRoll;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "INDOCHEAD_ID")
    public DocHead getInDocHead() {
        return this.InDocHead;
    }

    public void setInDocHead(DocHead InDocHead) {
        this.InDocHead = InDocHead;
    }

    @Column(name = "SNUMBER", columnDefinition = "CHAR", length = 20)
    @DataItemName("Salary.PaySheet.SNumber")
    public String getSNumber() {
        return this.SNumber;
    }

    public void setSNumber(String SNumber) {
        this.SNumber = SNumber;
    }

    @Column(name = "BEGINDATE", columnDefinition = "TIMESTAMP")
    @DataItemName("Salary.PaySheet.BeginDate")
    public Date getBeginDate() {
        return this.BeginDate;
    }

    public void setBeginDate(Date BeginDate) {
        this.BeginDate = BeginDate;
    }

    @Column(name = "ENDDATE", columnDefinition = "TIMESTAMP")
    @DataItemName("Salary.PaySheet.EndDate")
    public Date getEndDate() {
        return this.EndDate;
    }

    public void setEndDate(Date EndDate) {
        this.EndDate = EndDate;
    }

    @Column(name = "SUMMA_FULL", columnDefinition = "NUMERIC", precision = 15, scale = 4)
    @DataItemName("Salary.PaySheet.SummaFull")
    public BigDecimal getSummaFull() {
        return this.SummaFull;
    }

    public void setSummaFull(BigDecimal SummaFull) {
        this.SummaFull = SummaFull;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "PaySheet")
    public Set<PaySheetSpec> getSetOfSalPaySheetSpec() {
        return this.SetOfSalPaySheetSpec;
    }

    public void setSetOfSalPaySheetSpec(Set<PaySheetSpec> SetOfSalPaySheetSpec) {
        this.SetOfSalPaySheetSpec = SetOfSalPaySheetSpec;
    }
}

