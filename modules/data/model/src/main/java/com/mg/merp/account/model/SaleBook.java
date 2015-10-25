package com.mg.merp.account.model;

import com.mg.merp.core.model.Folder;
import com.mg.merp.core.model.SysClient;
import com.mg.merp.document.model.DocHead;
import com.mg.merp.document.model.DocType;
import com.mg.merp.reference.model.Contractor;
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

/**
 * SaleBook generated by hbm2java
 */
@Entity
@Table(name = "SALEBOOK")
public class SaleBook extends com.mg.merp.core.model.AbstractEntity implements java.io.Serializable {

    private Integer Id;

    private DocHead DocHead;

    private Contractor Customer;

    private Folder Folder;

    private SysClient SysClient;

    private DocType DocType;

    private Contractor OrgUnit;

    private String DocNumber;

    private Date DocDate;

    private Date InsertDate;

    private Date PayDate;

    private BigDecimal TotalSum;

    private BigDecimal SumWithoutNds1;

    private BigDecimal SumWithoutNds2;

    private BigDecimal Nds1Sum;

    private BigDecimal Nds2Sum;

    private BigDecimal NotTaxableSum;

    private BigDecimal NotTaxableExportSum;

    private BigDecimal NspSum;

    private BigDecimal SumWithoutNds3;

    private BigDecimal Nds3Sum;

    public SaleBook() {
    }

    public SaleBook(DocHead DocHead, Contractor Customer, Folder Folder, SysClient SysClient, DocType DocType, Contractor OrgUnit, String DocNumber, Date DocDate, Date InsertDate, Date PayDate, BigDecimal TotalSum, BigDecimal SumWithoutNds1, BigDecimal SumWithoutNds2, BigDecimal Nds1Sum, BigDecimal Nds2Sum, BigDecimal NotTaxableSum, BigDecimal NotTaxableExportSum, BigDecimal NspSum, BigDecimal SumWithoutNds3, BigDecimal Nds3Sum) {
        this.DocHead = DocHead;
        this.Customer = Customer;
        this.Folder = Folder;
        this.SysClient = SysClient;
        this.DocType = DocType;
        this.OrgUnit = OrgUnit;
        this.DocNumber = DocNumber;
        this.DocDate = DocDate;
        this.InsertDate = InsertDate;
        this.PayDate = PayDate;
        this.TotalSum = TotalSum;
        this.SumWithoutNds1 = SumWithoutNds1;
        this.SumWithoutNds2 = SumWithoutNds2;
        this.Nds1Sum = Nds1Sum;
        this.Nds2Sum = Nds2Sum;
        this.NotTaxableSum = NotTaxableSum;
        this.NotTaxableExportSum = NotTaxableExportSum;
        this.NspSum = NspSum;
        this.SumWithoutNds3 = SumWithoutNds3;
        this.Nds3Sum = Nds3Sum;
    }

    @SequenceGenerator(name = "generator", sequenceName = "SALEBOOK_ID_GEN")
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
    @JoinColumn(name = "DOCUMENT_ID")
    public DocHead getDocHead() {
        return this.DocHead;
    }

    public void setDocHead(DocHead DocHead) {
        this.DocHead = DocHead;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CUSTOMER_ID")
    @DataItemName("Account.SaleBook.Customer")
    public Contractor getCustomer() {
        return this.Customer;
    }

    public void setCustomer(Contractor Customer) {
        this.Customer = Customer;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "FOLDER_ID")
    public Folder getFolder() {
        return this.Folder;
    }

    public void setFolder(Folder Folder) {
        this.Folder = Folder;
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
    @JoinColumn(name = "DOCTYPE")
    @DataItemName("Account.SaleBook.DocType")
    public DocType getDocType() {
        return this.DocType;
    }

    public void setDocType(DocType DocType) {
        this.DocType = DocType;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ORGUNIT_ID")
    @DataItemName("Account.SaleBook.OrgUnit")
    public Contractor getOrgUnit() {
        return this.OrgUnit;
    }

    public void setOrgUnit(Contractor OrgUnit) {
        this.OrgUnit = OrgUnit;
    }

    @Column(name = "DOCNUMBER", columnDefinition = "CHAR", length = 20)
    @DataItemName("Account.SaleBook.DocNumber")
    public String getDocNumber() {
        return this.DocNumber;
    }

    public void setDocNumber(String DocNumber) {
        this.DocNumber = DocNumber;
    }

    @Column(name = "DOCDATE", columnDefinition = "TIMESTAMP")
    @DataItemName("Account.SaleBook.DocDate")
    public Date getDocDate() {
        return this.DocDate;
    }

    public void setDocDate(Date DocDate) {
        this.DocDate = DocDate;
    }

    @Column(name = "INSERTDATE", columnDefinition = "TIMESTAMP")
    @DataItemName("Account.SaleBook.InsertDate")
    public Date getInsertDate() {
        return this.InsertDate;
    }

    public void setInsertDate(Date InsertDate) {
        this.InsertDate = InsertDate;
    }

    @Column(name = "PAYDATE", columnDefinition = "TIMESTAMP")
    @DataItemName("Account.SaleBook.PayDate")
    public Date getPayDate() {
        return this.PayDate;
    }

    public void setPayDate(Date PayDate) {
        this.PayDate = PayDate;
    }

    @Column(name = "TOTALSUM", columnDefinition = "NUMERIC", precision = 15, scale = 4)
    @DataItemName("Account.SaleBook.TotalSum")
    public BigDecimal getTotalSum() {
        return this.TotalSum;
    }

    public void setTotalSum(BigDecimal TotalSum) {
        this.TotalSum = TotalSum;
    }

    @Column(name = "SUM_WITHOUT_NDS1", columnDefinition = "NUMERIC", precision = 15, scale = 4)
    @DataItemName("Account.SaleBook.SumWithoutNds1")
    public BigDecimal getSumWithoutNds1() {
        return this.SumWithoutNds1;
    }

    public void setSumWithoutNds1(BigDecimal SumWithoutNds1) {
        this.SumWithoutNds1 = SumWithoutNds1;
    }

    @Column(name = "SUM_WITHOUT_NDS2", columnDefinition = "NUMERIC", precision = 15, scale = 4)
    @DataItemName("Account.SaleBook.SumWithoutNds2")
    public BigDecimal getSumWithoutNds2() {
        return this.SumWithoutNds2;
    }

    public void setSumWithoutNds2(BigDecimal SumWithoutNds2) {
        this.SumWithoutNds2 = SumWithoutNds2;
    }

    @Column(name = "NDS1_SUM", columnDefinition = "NUMERIC", precision = 15, scale = 4)
    @DataItemName("Account.SaleBook.Nds1Sum")
    public BigDecimal getNds1Sum() {
        return this.Nds1Sum;
    }

    public void setNds1Sum(BigDecimal Nds1Sum) {
        this.Nds1Sum = Nds1Sum;
    }

    @Column(name = "NDS2_SUM", columnDefinition = "NUMERIC", precision = 15, scale = 4)
    @DataItemName("Account.SaleBook.Nds2Sum")
    public BigDecimal getNds2Sum() {
        return this.Nds2Sum;
    }

    public void setNds2Sum(BigDecimal Nds2Sum) {
        this.Nds2Sum = Nds2Sum;
    }

    @Column(name = "NOT_TAXABLE_SUM", columnDefinition = "NUMERIC", precision = 15, scale = 4)
    @DataItemName("Account.SaleBook.NotTaxableSum")
    public BigDecimal getNotTaxableSum() {
        return this.NotTaxableSum;
    }

    public void setNotTaxableSum(BigDecimal NotTaxableSum) {
        this.NotTaxableSum = NotTaxableSum;
    }

    @Column(name = "NOT_TAXABLE_EXPORT_SUM", columnDefinition = "NUMERIC", precision = 15, scale = 4)
    @DataItemName("Account.SaleBook.NotTaxableExportSum")
    public BigDecimal getNotTaxableExportSum() {
        return this.NotTaxableExportSum;
    }

    public void setNotTaxableExportSum(BigDecimal NotTaxableExportSum) {
        this.NotTaxableExportSum = NotTaxableExportSum;
    }

    @Column(name = "NSP_SUM", columnDefinition = "NUMERIC", precision = 15, scale = 4)
    @DataItemName("Account.SaleBook.NspSum")
    public BigDecimal getNspSum() {
        return this.NspSum;
    }

    public void setNspSum(BigDecimal NspSum) {
        this.NspSum = NspSum;
    }

    @Column(name = "SUM_WITHOUT_NDS3", columnDefinition = "NUMERIC", precision = 15, scale = 4)
    @DataItemName("Account.SaleBook.SumWithoutNds3")
    public BigDecimal getSumWithoutNds3() {
        return this.SumWithoutNds3;
    }

    public void setSumWithoutNds3(BigDecimal SumWithoutNds3) {
        this.SumWithoutNds3 = SumWithoutNds3;
    }

    @Column(name = "NDS3_SUM", columnDefinition = "NUMERIC", precision = 15, scale = 4)
    @DataItemName("Account.SaleBook.Nds3Sum")
    public BigDecimal getNds3Sum() {
        return this.Nds3Sum;
    }

    public void setNds3Sum(BigDecimal Nds3Sum) {
        this.Nds3Sum = Nds3Sum;
    }
}

