package com.mg.merp.warehouse.model;
// Generated Sep 28, 2015 11:47:52 PM by Hibernate Tools 3.6.0.Final


import com.mg.framework.support.orm.OmittedWhitespaceStringType;
import com.mg.merp.core.model.Folder;
import com.mg.merp.core.model.SysClient;
import com.mg.merp.core.model.SysCompany;
import com.mg.merp.document.model.DocHead;
import com.mg.merp.document.model.DocSection;
import com.mg.merp.document.model.DocType;
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
import javax.persistence.Table;

/**
 * StockDocumentHead generated by hbm2java
 */
@Entity
@Table(name="STOCKDOCUMENTHEAD"
)
public class StockDocumentHead extends com.mg.merp.document.model.DocHead implements java.io.Serializable {


     private BigDecimal SummaCurWithDiscount;
     private BigDecimal SummaNatWithDiscount;
     private BigDecimal AddExpenses;
     private BigDecimal DiscountOnDoc;
     private BigDecimal DiscountOnLine;

    public StockDocumentHead() {
    }

	
    public StockDocumentHead(SysCompany SysCompany, DocSection DocSection, Short Requester, boolean ManualDocNumber) {
        super(SysCompany, DocSection, Requester, ManualDocNumber);        
    }
    public StockDocumentHead(SysCompany SysCompany, Contractor Through, Contractor From, CurrencyRateAuthority CurrencyRateAuthority, Contractor SrcMol, PriceType PriceType, Folder DiscountFolder, Folder Folder, DocType DocType, DocHead Contract, Currency Currency, Contractor SrcStock, DocType ContractType, Contractor To, Contractor DstMol, DocHead BaseDocument, SysClient SysClient, Contractor DstStock, CalcTaxesKind CalcTaxesKind, DocType BaseDocType, CurrencyRateType CurrencyRateType, PriceListHead PriceList, DocSection DocSection, OmittedWhitespaceStringType DocNumber, Date DocDate, BigDecimal CurCource, BigDecimal SumCur, BigDecimal SumNat, OmittedWhitespaceStringType BaseDocNumber, Date BaseDocDate, OmittedWhitespaceStringType ContractNumber, Date ContractDate, BigDecimal Weight, BigDecimal Volume, Short Requester, byte[] Original, String UNID, boolean ManualDocNumber, String Description, BigDecimal SummaCurWithDiscount, BigDecimal SummaNatWithDiscount, BigDecimal AddExpenses, BigDecimal DiscountOnDoc, BigDecimal DiscountOnLine) {
        super(SysCompany, Through, From, CurrencyRateAuthority, SrcMol, PriceType, DiscountFolder, Folder, DocType, Contract, Currency, SrcStock, ContractType, To, DstMol, BaseDocument, SysClient, DstStock, CalcTaxesKind, BaseDocType, CurrencyRateType, PriceList, DocSection, DocNumber, DocDate, CurCource, SumCur, SumNat, BaseDocNumber, BaseDocDate, ContractNumber, ContractDate, Weight, Volume, Requester, Original, UNID, ManualDocNumber, Description);        
       this.SummaCurWithDiscount = SummaCurWithDiscount;
       this.SummaNatWithDiscount = SummaNatWithDiscount;
       this.AddExpenses = AddExpenses;
       this.DiscountOnDoc = DiscountOnDoc;
       this.DiscountOnLine = DiscountOnLine;
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




}

