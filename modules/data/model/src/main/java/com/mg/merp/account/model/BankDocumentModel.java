package com.mg.merp.account.model;
// Generated Sep 28, 2015 11:36:59 PM by Hibernate Tools 3.6.0.Final


import com.mg.framework.support.orm.EnumUserType;
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
import com.mg.merp.reference.model.Kbk;
import com.mg.merp.reference.model.Okato;
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

/**
 * BankDocumentModel generated by hbm2java
 */
@Entity
@Table(name="BANKDOCUMENTMODEL"
)
public class BankDocumentModel extends com.mg.merp.document.model.DocHeadModel implements java.io.Serializable {


     private BankAccount PayerBankReq;
     private BankAccount RecipientBankReq;
     private Contractor PaymentFor;
     private Contractor Responsible;
     private BigDecimal Nds1Rate;
     private BigDecimal Nds2Rate;
     private BigDecimal Nds1Summa;
     private BigDecimal Nds2Summa;
     private BigDecimal ClearSumma;
     private BigDecimal SummaWithNds1;
     private BigDecimal SummaWithNds2;
     private EnumUserType PayWay;
     private String Comment;
     private Date PayTime;
     private Short PayTurn;
     private String PayTarget;
     private String PayType;
     private String PayCode;
     private Kbk Kbk;
     private Okato Okato;
     private String PaymentBaseIdx;
     private String TaxPeriodIdx1;
     private String TaxPeriodIdx2;
     private String TaxPeriodIdx3;
     private String DocNumberIdx;
     private String DocDateIdx;
     private String PaymentTypeIdx;
     private String PayerStatus;

    public BankDocumentModel() {
    }

	
    public BankDocumentModel(DocSection DocSection, boolean ManualDocNumber) {
        super(DocSection, ManualDocNumber);        
    }
    public BankDocumentModel(SysCompany SysCompany, Contractor Through, Folder ModelDestFolder, Contractor From, Contractor To, Contractor DstMol, CurrencyRateAuthority CurrencyRateAuthority, Contractor SrcMol, Folder Folder, SysClient SysClient, Contractor DstStock, CurrencyRateType CurrencyRateType, Contractor SrcStock, DocSection DocSection, String ModelName, DocType DocType, String DocNumber, Date DocDate, Currency Currency, BigDecimal CurCource, BigDecimal SumCur, BigDecimal SumNat, DocHead BaseDocument, DocType BaseDocType, String BaseDocNumber, Date BaseDocDate, DocHead Contract, DocType ContractType, String ContractNumber, Date ContractDate, BigDecimal Weight, BigDecimal Volume, PriceListHead PriceList, PriceType PriceType, CalcTaxesKind CalcTaxesKind, Folder DiscountFolder, boolean ManualDocNumber, String Description, BankAccount PayerBankReq, BankAccount RecipientBankReq, Contractor PaymentFor, Contractor Responsible, BigDecimal Nds1Rate, BigDecimal Nds2Rate, BigDecimal Nds1Summa, BigDecimal Nds2Summa, BigDecimal ClearSumma, BigDecimal SummaWithNds1, BigDecimal SummaWithNds2, EnumUserType PayWay, String Comment, Date PayTime, Short PayTurn, String PayTarget, String PayType, String PayCode, Kbk Kbk, Okato Okato, String PaymentBaseIdx, String TaxPeriodIdx1, String TaxPeriodIdx2, String TaxPeriodIdx3, String DocNumberIdx, String DocDateIdx, String PaymentTypeIdx, String PayerStatus) {
        super(SysCompany, Through, ModelDestFolder, From, To, DstMol, CurrencyRateAuthority, SrcMol, Folder, SysClient, DstStock, CurrencyRateType, SrcStock, DocSection, ModelName, DocType, DocNumber, DocDate, Currency, CurCource, SumCur, SumNat, BaseDocument, BaseDocType, BaseDocNumber, BaseDocDate, Contract, ContractType, ContractNumber, ContractDate, Weight, Volume, PriceList, PriceType, CalcTaxesKind, DiscountFolder, ManualDocNumber, Description);        
       this.PayerBankReq = PayerBankReq;
       this.RecipientBankReq = RecipientBankReq;
       this.PaymentFor = PaymentFor;
       this.Responsible = Responsible;
       this.Nds1Rate = Nds1Rate;
       this.Nds2Rate = Nds2Rate;
       this.Nds1Summa = Nds1Summa;
       this.Nds2Summa = Nds2Summa;
       this.ClearSumma = ClearSumma;
       this.SummaWithNds1 = SummaWithNds1;
       this.SummaWithNds2 = SummaWithNds2;
       this.PayWay = PayWay;
       this.Comment = Comment;
       this.PayTime = PayTime;
       this.PayTurn = PayTurn;
       this.PayTarget = PayTarget;
       this.PayType = PayType;
       this.PayCode = PayCode;
       this.Kbk = Kbk;
       this.Okato = Okato;
       this.PaymentBaseIdx = PaymentBaseIdx;
       this.TaxPeriodIdx1 = TaxPeriodIdx1;
       this.TaxPeriodIdx2 = TaxPeriodIdx2;
       this.TaxPeriodIdx3 = TaxPeriodIdx3;
       this.DocNumberIdx = DocNumberIdx;
       this.DocDateIdx = DocDateIdx;
       this.PaymentTypeIdx = PaymentTypeIdx;
       this.PayerStatus = PayerStatus;
    }
   

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="PAYERBANKREQ_ID")
    public BankAccount getPayerBankReq() {
        return this.PayerBankReq;
    }
    
    public void setPayerBankReq(BankAccount PayerBankReq) {
        this.PayerBankReq = PayerBankReq;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="RECIPIENTBANKREQ_ID")
    public BankAccount getRecipientBankReq() {
        return this.RecipientBankReq;
    }
    
    public void setRecipientBankReq(BankAccount RecipientBankReq) {
        this.RecipientBankReq = RecipientBankReq;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="PAYMENTFOR")
    public Contractor getPaymentFor() {
        return this.PaymentFor;
    }
    
    public void setPaymentFor(Contractor PaymentFor) {
        this.PaymentFor = PaymentFor;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="RESPONSIBLE")
    public Contractor getResponsible() {
        return this.Responsible;
    }
    
    public void setResponsible(Contractor Responsible) {
        this.Responsible = Responsible;
    }

    
    @Column(name="NDS1RATE", columnDefinition="NUMERIC", precision=15, scale=4)
    public BigDecimal getNds1Rate() {
        return this.Nds1Rate;
    }
    
    public void setNds1Rate(BigDecimal Nds1Rate) {
        this.Nds1Rate = Nds1Rate;
    }

    
    @Column(name="NDS2RATE", columnDefinition="NUMERIC", precision=15, scale=4)
    public BigDecimal getNds2Rate() {
        return this.Nds2Rate;
    }
    
    public void setNds2Rate(BigDecimal Nds2Rate) {
        this.Nds2Rate = Nds2Rate;
    }

    
    @Column(name="NDS1SUMMA", columnDefinition="NUMERIC", precision=15, scale=4)
    public BigDecimal getNds1Summa() {
        return this.Nds1Summa;
    }
    
    public void setNds1Summa(BigDecimal Nds1Summa) {
        this.Nds1Summa = Nds1Summa;
    }

    
    @Column(name="NDS2SUMMA", columnDefinition="NUMERIC", precision=15, scale=4)
    public BigDecimal getNds2Summa() {
        return this.Nds2Summa;
    }
    
    public void setNds2Summa(BigDecimal Nds2Summa) {
        this.Nds2Summa = Nds2Summa;
    }

    
    @Column(name="CLEARSUMMA", columnDefinition="NUMERIC", precision=15, scale=4)
    public BigDecimal getClearSumma() {
        return this.ClearSumma;
    }
    
    public void setClearSumma(BigDecimal ClearSumma) {
        this.ClearSumma = ClearSumma;
    }

    
    @Column(name="SUMMAWITHNDS1", columnDefinition="NUMERIC", precision=15, scale=4)
    public BigDecimal getSummaWithNds1() {
        return this.SummaWithNds1;
    }
    
    public void setSummaWithNds1(BigDecimal SummaWithNds1) {
        this.SummaWithNds1 = SummaWithNds1;
    }

    
    @Column(name="SUMMAWITHNDS2", columnDefinition="NUMERIC", precision=15, scale=4)
    public BigDecimal getSummaWithNds2() {
        return this.SummaWithNds2;
    }
    
    public void setSummaWithNds2(BigDecimal SummaWithNds2) {
        this.SummaWithNds2 = SummaWithNds2;
    }

    
    @Column(name="PAYWAY", columnDefinition="SMALLINT")
    public EnumUserType getPayWay() {
        return this.PayWay;
    }
    
    public void setPayWay(EnumUserType PayWay) {
        this.PayWay = PayWay;
    }

    
    @Column(name="COMMENT", columnDefinition="VARCHAR", length=256)
    public String getComment() {
        return this.Comment;
    }
    
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    
    @Column(name="PAYTIME", columnDefinition="TIMESTAMP")
    public Date getPayTime() {
        return this.PayTime;
    }
    
    public void setPayTime(Date PayTime) {
        this.PayTime = PayTime;
    }

    
    @Column(name="PAYTURN", columnDefinition="SMALLINT")
    public Short getPayTurn() {
        return this.PayTurn;
    }
    
    public void setPayTurn(Short PayTurn) {
        this.PayTurn = PayTurn;
    }

    
    @Column(name="PAYTARGET", columnDefinition="CHAR", length=10)
    public String getPayTarget() {
        return this.PayTarget;
    }
    
    public void setPayTarget(String PayTarget) {
        this.PayTarget = PayTarget;
    }

    
    @Column(name="PAYTYPE", columnDefinition="CHAR", length=10)
    public String getPayType() {
        return this.PayType;
    }
    
    public void setPayType(String PayType) {
        this.PayType = PayType;
    }

    
    @Column(name="PAYCODE", columnDefinition="CHAR", length=10)
    public String getPayCode() {
        return this.PayCode;
    }
    
    public void setPayCode(String PayCode) {
        this.PayCode = PayCode;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="KBK")
    public Kbk getKbk() {
        return this.Kbk;
    }
    
    public void setKbk(Kbk Kbk) {
        this.Kbk = Kbk;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="OKATO")
    public Okato getOkato() {
        return this.Okato;
    }
    
    public void setOkato(Okato Okato) {
        this.Okato = Okato;
    }

    
    @Column(name="PAYMENTBASEIDX", columnDefinition="CHAR", length=2)
    public String getPaymentBaseIdx() {
        return this.PaymentBaseIdx;
    }
    
    public void setPaymentBaseIdx(String PaymentBaseIdx) {
        this.PaymentBaseIdx = PaymentBaseIdx;
    }

    
    @Column(name="TAXPERIODIDX1", columnDefinition="CHAR", length=2)
    public String getTaxPeriodIdx1() {
        return this.TaxPeriodIdx1;
    }
    
    public void setTaxPeriodIdx1(String TaxPeriodIdx1) {
        this.TaxPeriodIdx1 = TaxPeriodIdx1;
    }

    
    @Column(name="TAXPERIODIDX2", columnDefinition="CHAR", length=2)
    public String getTaxPeriodIdx2() {
        return this.TaxPeriodIdx2;
    }
    
    public void setTaxPeriodIdx2(String TaxPeriodIdx2) {
        this.TaxPeriodIdx2 = TaxPeriodIdx2;
    }

    
    @Column(name="TAXPERIODIDX3", columnDefinition="CHAR", length=4)
    public String getTaxPeriodIdx3() {
        return this.TaxPeriodIdx3;
    }
    
    public void setTaxPeriodIdx3(String TaxPeriodIdx3) {
        this.TaxPeriodIdx3 = TaxPeriodIdx3;
    }

    
    @Column(name="DOCNUMBERIDX", columnDefinition="CHAR", length=20)
    public String getDocNumberIdx() {
        return this.DocNumberIdx;
    }
    
    public void setDocNumberIdx(String DocNumberIdx) {
        this.DocNumberIdx = DocNumberIdx;
    }

    
    @Column(name="DOCDATEIDX", columnDefinition="CHAR", length=10)
    public String getDocDateIdx() {
        return this.DocDateIdx;
    }
    
    public void setDocDateIdx(String DocDateIdx) {
        this.DocDateIdx = DocDateIdx;
    }

    
    @Column(name="PAYMENTTYPEIDX", columnDefinition="CHAR", length=2)
    public String getPaymentTypeIdx() {
        return this.PaymentTypeIdx;
    }
    
    public void setPaymentTypeIdx(String PaymentTypeIdx) {
        this.PaymentTypeIdx = PaymentTypeIdx;
    }

    
    @Column(name="PAYERSTATUS", columnDefinition="CHAR", length=2)
    public String getPayerStatus() {
        return this.PayerStatus;
    }
    
    public void setPayerStatus(String PayerStatus) {
        this.PayerStatus = PayerStatus;
    }




}


