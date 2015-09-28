package com.mg.merp.warehouse.model;
// Generated Sep 28, 2015 11:36:59 PM by Hibernate Tools 3.6.0.Final


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
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * InventoryActHead generated by hbm2java
 */
@Entity
@Table(name="INVENTORYACTHEAD"
)
public class InventoryActHead extends com.mg.merp.document.model.DocHead implements java.io.Serializable {


     private Contractor Contractor;
     private BigDecimal RealSummaNat;
     private BigDecimal RealSummaCur;
     private Date EndDate;

    public InventoryActHead() {
    }

	
    public InventoryActHead(SysCompany SysCompany, DocSection DocSection, Short Requester, boolean ManualDocNumber) {
        super(SysCompany, DocSection, Requester, ManualDocNumber);        
    }
    public InventoryActHead(SysCompany SysCompany, Contractor Through, Contractor From, CurrencyRateAuthority CurrencyRateAuthority, Contractor SrcMol, PriceType PriceType, Folder DiscountFolder, Folder Folder, DocType DocType, DocHead Contract, Currency Currency, Contractor SrcStock, DocType ContractType, Contractor To, Contractor DstMol, DocHead BaseDocument, SysClient SysClient, Contractor DstStock, CalcTaxesKind CalcTaxesKind, DocType BaseDocType, CurrencyRateType CurrencyRateType, PriceListHead PriceList, DocSection DocSection, OmittedWhitespaceStringType DocNumber, Date DocDate, BigDecimal CurCource, BigDecimal SumCur, BigDecimal SumNat, OmittedWhitespaceStringType BaseDocNumber, Date BaseDocDate, OmittedWhitespaceStringType ContractNumber, Date ContractDate, BigDecimal Weight, BigDecimal Volume, Short Requester, byte[] Original, String UNID, boolean ManualDocNumber, String Description, Contractor Contractor, BigDecimal RealSummaNat, BigDecimal RealSummaCur, Date EndDate) {
        super(SysCompany, Through, From, CurrencyRateAuthority, SrcMol, PriceType, DiscountFolder, Folder, DocType, Contract, Currency, SrcStock, ContractType, To, DstMol, BaseDocument, SysClient, DstStock, CalcTaxesKind, BaseDocType, CurrencyRateType, PriceList, DocSection, DocNumber, DocDate, CurCource, SumCur, SumNat, BaseDocNumber, BaseDocDate, ContractNumber, ContractDate, Weight, Volume, Requester, Original, UNID, ManualDocNumber, Description);        
       this.Contractor = Contractor;
       this.RealSummaNat = RealSummaNat;
       this.RealSummaCur = RealSummaCur;
       this.EndDate = EndDate;
    }
   

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="CHAIRMAN")
    public Contractor getContractor() {
        return this.Contractor;
    }
    
    public void setContractor(Contractor Contractor) {
        this.Contractor = Contractor;
    }

    
    @Column(name="REALSUMMANAT", columnDefinition="NUMERIC", precision=15, scale=4)
    public BigDecimal getRealSummaNat() {
        return this.RealSummaNat;
    }
    
    public void setRealSummaNat(BigDecimal RealSummaNat) {
        this.RealSummaNat = RealSummaNat;
    }

    
    @Column(name="REALSUMMACUR", columnDefinition="NUMERIC", precision=15, scale=4)
    public BigDecimal getRealSummaCur() {
        return this.RealSummaCur;
    }
    
    public void setRealSummaCur(BigDecimal RealSummaCur) {
        this.RealSummaCur = RealSummaCur;
    }

    
    @Column(name="ENDDATE", columnDefinition="TIMESTAMP")
    public Date getEndDate() {
        return this.EndDate;
    }
    
    public void setEndDate(Date EndDate) {
        this.EndDate = EndDate;
    }




}


