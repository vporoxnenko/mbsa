package com.mg.merp.warehouse.model;
// Generated Sep 28, 2015 11:36:59 PM by Hibernate Tools 3.6.0.Final


import com.mg.merp.core.model.Folder;
import com.mg.merp.core.model.SysClient;
import com.mg.merp.core.model.SysCompany;
import com.mg.merp.document.model.DocHead;
import com.mg.merp.document.model.DocSection;
import com.mg.merp.document.model.DocType;
import com.mg.merp.reference.model.BankAccount;
import com.mg.merp.reference.model.CalcTaxesKind;
import com.mg.merp.reference.model.Contractor;
import com.mg.merp.reference.model.Currency;
import com.mg.merp.reference.model.CurrencyRateAuthority;
import com.mg.merp.reference.model.CurrencyRateType;
import com.mg.merp.reference.model.PriceListHead;
import com.mg.merp.reference.model.PriceType;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.hibernate.annotations.Formula;

/**
 * BillHeadModel generated by hbm2java
 */
@Entity
@Table(name="BILLHEADMODEL"
)
public class BillHeadModel extends com.mg.merp.document.model.DocHeadModel implements java.io.Serializable {


     private BankAccount PartnerToBankReq;
     private Contractor Consignee;
     private Contractor Shipper;
     private Contractor Responsible;
     private BankAccount PartnerFromBankReq;
     private Contractor Consumer;
     private BigDecimal SummaCurWithDiscount;
     private BigDecimal SummaNatWithDiscount;
     private BigDecimal AddExpenses;
     private BigDecimal DiscountOnDoc;
     private BigDecimal DiscountOnLine;
     private Date RegistDate;
     private Integer AcceptanceTerm;
     private Date AcceptanceDate;
     private BigDecimal AcceptanceSum;
     private Integer PaymentTerm;
     private Date PlanPaymentDateDoc;
     private Date PlanPaymentDate;
     private Date PaymentDate;
     private BigDecimal PaymentSum;
     private BigDecimal AddExpensesSum;
     private String Comment;
     private String ToPayDocNumber;
     private Date ToPayDocDate;
     private String ProviderOKONH;
     private String ProviderINN;
     private String ProviderOKPO;
     private String CustomerOKPO;
     private String CustomerOKONH;
     private String CustomerINN;

    public BillHeadModel() {
    }

	
    public BillHeadModel(DocSection DocSection, boolean ManualDocNumber) {
        super(DocSection, ManualDocNumber);        
    }
    public BillHeadModel(SysCompany SysCompany, Contractor Through, Folder ModelDestFolder, Contractor From, Contractor To, Contractor DstMol, CurrencyRateAuthority CurrencyRateAuthority, Contractor SrcMol, Folder Folder, SysClient SysClient, Contractor DstStock, CurrencyRateType CurrencyRateType, Contractor SrcStock, DocSection DocSection, String ModelName, DocType DocType, String DocNumber, Date DocDate, Currency Currency, BigDecimal CurCource, BigDecimal SumCur, BigDecimal SumNat, DocHead BaseDocument, DocType BaseDocType, String BaseDocNumber, Date BaseDocDate, DocHead Contract, DocType ContractType, String ContractNumber, Date ContractDate, BigDecimal Weight, BigDecimal Volume, PriceListHead PriceList, PriceType PriceType, CalcTaxesKind CalcTaxesKind, Folder DiscountFolder, boolean ManualDocNumber, String Description, BankAccount PartnerToBankReq, Contractor Consignee, Contractor Shipper, Contractor Responsible, BankAccount PartnerFromBankReq, Contractor Consumer, BigDecimal SummaCurWithDiscount, BigDecimal SummaNatWithDiscount, BigDecimal AddExpenses, BigDecimal DiscountOnDoc, BigDecimal DiscountOnLine, Date RegistDate, Integer AcceptanceTerm, Date AcceptanceDate, BigDecimal AcceptanceSum, Integer PaymentTerm, Date PlanPaymentDateDoc, Date PlanPaymentDate, Date PaymentDate, BigDecimal PaymentSum, BigDecimal AddExpensesSum, String Comment, String ToPayDocNumber, Date ToPayDocDate) {
        super(SysCompany, Through, ModelDestFolder, From, To, DstMol, CurrencyRateAuthority, SrcMol, Folder, SysClient, DstStock, CurrencyRateType, SrcStock, DocSection, ModelName, DocType, DocNumber, DocDate, Currency, CurCource, SumCur, SumNat, BaseDocument, BaseDocType, BaseDocNumber, BaseDocDate, Contract, ContractType, ContractNumber, ContractDate, Weight, Volume, PriceList, PriceType, CalcTaxesKind, DiscountFolder, ManualDocNumber, Description);        
       this.PartnerToBankReq = PartnerToBankReq;
       this.Consignee = Consignee;
       this.Shipper = Shipper;
       this.Responsible = Responsible;
       this.PartnerFromBankReq = PartnerFromBankReq;
       this.Consumer = Consumer;
       this.SummaCurWithDiscount = SummaCurWithDiscount;
       this.SummaNatWithDiscount = SummaNatWithDiscount;
       this.AddExpenses = AddExpenses;
       this.DiscountOnDoc = DiscountOnDoc;
       this.DiscountOnLine = DiscountOnLine;
       this.RegistDate = RegistDate;
       this.AcceptanceTerm = AcceptanceTerm;
       this.AcceptanceDate = AcceptanceDate;
       this.AcceptanceSum = AcceptanceSum;
       this.PaymentTerm = PaymentTerm;
       this.PlanPaymentDateDoc = PlanPaymentDateDoc;
       this.PlanPaymentDate = PlanPaymentDate;
       this.PaymentDate = PaymentDate;
       this.PaymentSum = PaymentSum;
       this.AddExpensesSum = AddExpensesSum;
       this.Comment = Comment;
       this.ToPayDocNumber = ToPayDocNumber;
       this.ToPayDocDate = ToPayDocDate;
    }
   

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="PARTNERTO_BANKREQ")
    public BankAccount getPartnerToBankReq() {
        return this.PartnerToBankReq;
    }
    
    public void setPartnerToBankReq(BankAccount PartnerToBankReq) {
        this.PartnerToBankReq = PartnerToBankReq;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="CONSIGNEE")
    public Contractor getConsignee() {
        return this.Consignee;
    }
    
    public void setConsignee(Contractor Consignee) {
        this.Consignee = Consignee;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="SHIPPER")
    public Contractor getShipper() {
        return this.Shipper;
    }
    
    public void setShipper(Contractor Shipper) {
        this.Shipper = Shipper;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="RESPONSIBLE")
    public Contractor getResponsible() {
        return this.Responsible;
    }
    
    public void setResponsible(Contractor Responsible) {
        this.Responsible = Responsible;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="PARTNERFROM_BANKREQ")
    public BankAccount getPartnerFromBankReq() {
        return this.PartnerFromBankReq;
    }
    
    public void setPartnerFromBankReq(BankAccount PartnerFromBankReq) {
        this.PartnerFromBankReq = PartnerFromBankReq;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="CONSUMER")
    public Contractor getConsumer() {
        return this.Consumer;
    }
    
    public void setConsumer(Contractor Consumer) {
        this.Consumer = Consumer;
    }

    
    @Column(name="SUMMACUR_WITH_DISCOUNT", columnDefinition="NUMERIC", precision=15, scale=4)
    public BigDecimal getSummaCurWithDiscount() {
        return this.SummaCurWithDiscount;
    }
    
    public void setSummaCurWithDiscount(BigDecimal SummaCurWithDiscount) {
        this.SummaCurWithDiscount = SummaCurWithDiscount;
    }

    
    @Column(name="SUMMANAT_WITH_DISCOUNT", columnDefinition="NUMERIC", precision=15, scale=4)
    public BigDecimal getSummaNatWithDiscount() {
        return this.SummaNatWithDiscount;
    }
    
    public void setSummaNatWithDiscount(BigDecimal SummaNatWithDiscount) {
        this.SummaNatWithDiscount = SummaNatWithDiscount;
    }

    
    @Column(name="ADD_EXPENSES", columnDefinition="NUMERIC", precision=15, scale=4)
    public BigDecimal getAddExpenses() {
        return this.AddExpenses;
    }
    
    public void setAddExpenses(BigDecimal AddExpenses) {
        this.AddExpenses = AddExpenses;
    }

    
    @Column(name="DISCOUNT_ON_DOC", columnDefinition="NUMERIC", precision=18, scale=6)
    public BigDecimal getDiscountOnDoc() {
        return this.DiscountOnDoc;
    }
    
    public void setDiscountOnDoc(BigDecimal DiscountOnDoc) {
        this.DiscountOnDoc = DiscountOnDoc;
    }

    
    @Column(name="DISCOUNT_ON_LINE", columnDefinition="NUMERIC", precision=18, scale=6)
    public BigDecimal getDiscountOnLine() {
        return this.DiscountOnLine;
    }
    
    public void setDiscountOnLine(BigDecimal DiscountOnLine) {
        this.DiscountOnLine = DiscountOnLine;
    }

    
    @Column(name="REGISTDATE", columnDefinition="TIMESTAMP")
    public Date getRegistDate() {
        return this.RegistDate;
    }
    
    public void setRegistDate(Date RegistDate) {
        this.RegistDate = RegistDate;
    }

    
    @Column(name="ACCEPTANCETERM", columnDefinition="INTEGER")
    public Integer getAcceptanceTerm() {
        return this.AcceptanceTerm;
    }
    
    public void setAcceptanceTerm(Integer AcceptanceTerm) {
        this.AcceptanceTerm = AcceptanceTerm;
    }

    
    @Column(name="ACCEPTANCEDATE", columnDefinition="TIMESTAMP")
    public Date getAcceptanceDate() {
        return this.AcceptanceDate;
    }
    
    public void setAcceptanceDate(Date AcceptanceDate) {
        this.AcceptanceDate = AcceptanceDate;
    }

    
    @Column(name="ACCEPTANCESUM", columnDefinition="NUMERIC", precision=15, scale=4)
    public BigDecimal getAcceptanceSum() {
        return this.AcceptanceSum;
    }
    
    public void setAcceptanceSum(BigDecimal AcceptanceSum) {
        this.AcceptanceSum = AcceptanceSum;
    }

    
    @Column(name="PAYMENTTERM", columnDefinition="INTEGER")
    public Integer getPaymentTerm() {
        return this.PaymentTerm;
    }
    
    public void setPaymentTerm(Integer PaymentTerm) {
        this.PaymentTerm = PaymentTerm;
    }

    
    @Column(name="PLANPAYMENTDATEDOC", columnDefinition="TIMESTAMP")
    public Date getPlanPaymentDateDoc() {
        return this.PlanPaymentDateDoc;
    }
    
    public void setPlanPaymentDateDoc(Date PlanPaymentDateDoc) {
        this.PlanPaymentDateDoc = PlanPaymentDateDoc;
    }

    
    @Column(name="PLANPAYMENTDATE", columnDefinition="TIMESTAMP")
    public Date getPlanPaymentDate() {
        return this.PlanPaymentDate;
    }
    
    public void setPlanPaymentDate(Date PlanPaymentDate) {
        this.PlanPaymentDate = PlanPaymentDate;
    }

    
    @Column(name="PAYMENTDATE", columnDefinition="TIMESTAMP")
    public Date getPaymentDate() {
        return this.PaymentDate;
    }
    
    public void setPaymentDate(Date PaymentDate) {
        this.PaymentDate = PaymentDate;
    }

    
    @Column(name="PAYMENTSUM", columnDefinition="NUMERIC", precision=15, scale=4)
    public BigDecimal getPaymentSum() {
        return this.PaymentSum;
    }
    
    public void setPaymentSum(BigDecimal PaymentSum) {
        this.PaymentSum = PaymentSum;
    }

    
    @Column(name="ADDEXPENSESSUM", columnDefinition="NUMERIC", precision=15, scale=4)
    public BigDecimal getAddExpensesSum() {
        return this.AddExpensesSum;
    }
    
    public void setAddExpensesSum(BigDecimal AddExpensesSum) {
        this.AddExpensesSum = AddExpensesSum;
    }

    
    @Column(name="COMMENT", columnDefinition="VARCHAR", length=1024)
    public String getComment() {
        return this.Comment;
    }
    
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    
    @Column(name="TOPAYDOCNUMBER", columnDefinition="CHAR", length=20)
    public String getToPayDocNumber() {
        return this.ToPayDocNumber;
    }
    
    public void setToPayDocNumber(String ToPayDocNumber) {
        this.ToPayDocNumber = ToPayDocNumber;
    }

    
    @Column(name="TOPAYDOCDATE", columnDefinition="TIMESTAMP")
    public Date getToPayDocDate() {
        return this.ToPayDocDate;
    }
    
    public void setToPayDocDate(Date ToPayDocDate) {
        this.ToPayDocDate = ToPayDocDate;
    }

    
    @Formula(value="(select p1.okonh from docheadmodel d1 left join contractor c1 on c1.id = d1.from_id
        left join partner p1 on p1.contractor_id = c1.id where d1.id = DOCHEADMODEL_ID)
      ")
    public String getProviderOKONH() {
        return this.ProviderOKONH;
    }
    
    public void setProviderOKONH(String ProviderOKONH) {
        this.ProviderOKONH = ProviderOKONH;
    }

    
    @Formula(value="(select p2.inn from docheadmodel d2 left join contractor c2 on c2.id = d2.from_id
        left join partner p2 on p2.contractor_id = c2.id where d2.id = DOCHEADMODEL_ID)
      ")
    public String getProviderINN() {
        return this.ProviderINN;
    }
    
    public void setProviderINN(String ProviderINN) {
        this.ProviderINN = ProviderINN;
    }

    
    @Formula(value="(select p3.okpo from docheadmodel d3 left join contractor c3 on c3.id = d3.from_id
        left join partner p3 on p3.contractor_id = c3.id where d3.id = DOCHEADMODEL_ID)
      ")
    public String getProviderOKPO() {
        return this.ProviderOKPO;
    }
    
    public void setProviderOKPO(String ProviderOKPO) {
        this.ProviderOKPO = ProviderOKPO;
    }

    
    @Formula(value="(select p4.okpo from docheadmodel d4 left join contractor c4 on c4.id = d4.to_id left
        join partner p4 on p4.contractor_id = c4.id where d4.id = DOCHEADMODEL_ID)
      ")
    public String getCustomerOKPO() {
        return this.CustomerOKPO;
    }
    
    public void setCustomerOKPO(String CustomerOKPO) {
        this.CustomerOKPO = CustomerOKPO;
    }

    
    @Formula(value="(select p5.okonh from docheadmodel d5 left join contractor c5 on c5.id = d5.to_id
        left join partner p5 on p5.contractor_id = c5.id where d5.id = DOCHEADMODEL_ID)
      ")
    public String getCustomerOKONH() {
        return this.CustomerOKONH;
    }
    
    public void setCustomerOKONH(String CustomerOKONH) {
        this.CustomerOKONH = CustomerOKONH;
    }

    
    @Formula(value="(select p6.inn from docheadmodel d6 left join contractor c6 on c6.id = d6.to_id left
        join partner p6 on p6.contractor_id = c6.id where d6.id = DOCHEADMODEL_ID)
      ")
    public String getCustomerINN() {
        return this.CustomerINN;
    }
    
    public void setCustomerINN(String CustomerINN) {
        this.CustomerINN = CustomerINN;
    }




}


