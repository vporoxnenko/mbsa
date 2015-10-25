package com.mg.merp.account.model;

import com.mg.merp.core.model.SysClient;
import com.mg.merp.document.model.DocHead;
import com.mg.merp.document.model.DocSpec;
import com.mg.merp.document.model.DocumentSpecSerialNum;
import com.mg.merp.document.model.DocumentSpecTax;
import com.mg.merp.reference.model.Catalog;
import com.mg.merp.reference.model.Contractor;
import com.mg.merp.reference.model.Country;
import com.mg.merp.reference.model.CustomsDeclaration;
import com.mg.merp.reference.model.Measure;
import com.mg.merp.reference.model.PriceListSpec;
import com.mg.merp.reference.model.TaxGroup;
import com.mg.merp.reference.model.TimePeriodKind;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import com.mg.framework.api.annotations.DataItemName;

/**
 * AdvanceRepSpec generated by hbm2java
 */
@Entity
@Table(name = "ACC_ADVANCEREPSPEC")
public class AdvanceRepSpec extends com.mg.merp.document.model.DocSpec implements java.io.Serializable {

    private AnlPlan Anl2;

    private AccPlan AccPlan;

    private AnlPlan Anl4;

    private AnlPlan Anl3;

    private AnlPlan Anl1;

    private AnlPlan Anl5;

    private Integer Num;

    private String ExpenseDocNumber;

    private Date ExpenseDocDate;

    private String ExpenseDocName;

    private BigDecimal ExpenseSum;

    private BigDecimal ConsideredSum;

    public AdvanceRepSpec() {
    }

    public AdvanceRepSpec(TimePeriodKind ShelfLifeMeas) {
        super(ShelfLifeMeas);
    }

    public AdvanceRepSpec(DocSpec OrderSpec, Catalog Catalog, TaxGroup TaxGroup, Contractor DstMol, Contractor SrcMol, PriceListSpec PriceListSpec, DocHead DocHead, Measure Measure2, SysClient SysClient, Contractor DstStock, Measure Measure1, Contractor SrcStock, BigDecimal Quantity, BigDecimal Price, BigDecimal Summa, BigDecimal Price1, BigDecimal Summa1, BigDecimal Weight, BigDecimal Volume, Date BestBefore, BigDecimal ShelfLife, TimePeriodKind ShelfLifeMeas, Date ProductionDate, BigDecimal Quantity2, String Comment, Contractor Contractor, String UNID, CustomsDeclaration CustomsDeclaration, Country CountryOfOrigin, Set<DocumentSpecTax> Taxes, Set<DocumentSpecSerialNum> SerialNumbers, AnlPlan Anl2, AccPlan AccPlan, AnlPlan Anl4, AnlPlan Anl3, AnlPlan Anl1, AnlPlan Anl5, Integer Num, String ExpenseDocNumber, Date ExpenseDocDate, String ExpenseDocName, BigDecimal ExpenseSum, BigDecimal ConsideredSum) {
        super(OrderSpec, Catalog, TaxGroup, DstMol, SrcMol, PriceListSpec, DocHead, Measure2, SysClient, DstStock, Measure1, SrcStock, Quantity, Price, Summa, Price1, Summa1, Weight, Volume, BestBefore, ShelfLife, ShelfLifeMeas, ProductionDate, Quantity2, Comment, Contractor, UNID, CustomsDeclaration, CountryOfOrigin, Taxes, SerialNumbers);
        this.Anl2 = Anl2;
        this.AccPlan = AccPlan;
        this.Anl4 = Anl4;
        this.Anl3 = Anl3;
        this.Anl1 = Anl1;
        this.Anl5 = Anl5;
        this.Num = Num;
        this.ExpenseDocNumber = ExpenseDocNumber;
        this.ExpenseDocDate = ExpenseDocDate;
        this.ExpenseDocName = ExpenseDocName;
        this.ExpenseSum = ExpenseSum;
        this.ConsideredSum = ConsideredSum;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ANL2_ID")
    @DataItemName("Account.Adv.Anl2")
    public AnlPlan getAnl2() {
        return this.Anl2;
    }

    public void setAnl2(AnlPlan Anl2) {
        this.Anl2 = Anl2;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ACC_ID")
    @DataItemName("Account.AdvanceRepSpec.AccPlan")
    public AccPlan getAccPlan() {
        return this.AccPlan;
    }

    public void setAccPlan(AccPlan AccPlan) {
        this.AccPlan = AccPlan;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ANL4_ID")
    @DataItemName("Account.Adv.Anl4")
    public AnlPlan getAnl4() {
        return this.Anl4;
    }

    public void setAnl4(AnlPlan Anl4) {
        this.Anl4 = Anl4;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ANL3_ID")
    @DataItemName("Account.Adv.Anl3")
    public AnlPlan getAnl3() {
        return this.Anl3;
    }

    public void setAnl3(AnlPlan Anl3) {
        this.Anl3 = Anl3;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ANL1_ID")
    @DataItemName("Account.Adv.Anl1")
    public AnlPlan getAnl1() {
        return this.Anl1;
    }

    public void setAnl1(AnlPlan Anl1) {
        this.Anl1 = Anl1;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ANL5_ID")
    @DataItemName("Account.Adv.Anl5")
    public AnlPlan getAnl5() {
        return this.Anl5;
    }

    public void setAnl5(AnlPlan Anl5) {
        this.Anl5 = Anl5;
    }

    @Column(name = "NUM", columnDefinition = "INTEGER")
    @DataItemName("Account.Adv.Num")
    public Integer getNum() {
        return this.Num;
    }

    public void setNum(Integer Num) {
        this.Num = Num;
    }

    @Column(name = "EXPENSEDOCNUMBER", columnDefinition = "CHAR", length = 20)
    @DataItemName("Account.Adv.ExpenseDocNumber")
    public String getExpenseDocNumber() {
        return this.ExpenseDocNumber;
    }

    public void setExpenseDocNumber(String ExpenseDocNumber) {
        this.ExpenseDocNumber = ExpenseDocNumber;
    }

    @Column(name = "EXPENSEDOCDATE", columnDefinition = "TIMESTAMP")
    @DataItemName("Account.Adv.ExpenseDocDate")
    public Date getExpenseDocDate() {
        return this.ExpenseDocDate;
    }

    public void setExpenseDocDate(Date ExpenseDocDate) {
        this.ExpenseDocDate = ExpenseDocDate;
    }

    @Column(name = "EXPENSEDOCNAME", columnDefinition = "VARCHAR", length = 256)
    @DataItemName("Account.Adv.ExpenseDocName")
    public String getExpenseDocName() {
        return this.ExpenseDocName;
    }

    public void setExpenseDocName(String ExpenseDocName) {
        this.ExpenseDocName = ExpenseDocName;
    }

    @Column(name = "EXPENSESUM", columnDefinition = "NUMERIC", precision = 15, scale = 4)
    @DataItemName("Account.Adv.ExpenseSum")
    public BigDecimal getExpenseSum() {
        return this.ExpenseSum;
    }

    public void setExpenseSum(BigDecimal ExpenseSum) {
        this.ExpenseSum = ExpenseSum;
    }

    @Column(name = "CONSIDEREDSUM", columnDefinition = "NUMERIC", precision = 15, scale = 4)
    @DataItemName("Account.Adv.ConsideredSum")
    public BigDecimal getConsideredSum() {
        return this.ConsideredSum;
    }

    public void setConsideredSum(BigDecimal ConsideredSum) {
        this.ConsideredSum = ConsideredSum;
    }
}

