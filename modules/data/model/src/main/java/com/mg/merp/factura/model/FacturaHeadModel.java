package com.mg.merp.factura.model;

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
import com.mg.framework.api.annotations.DataItemName;

/**
 * FacturaHeadModel generated by hbm2java
 */
@Entity
@Table(name = "FACTURAHEADMODEL")
public class FacturaHeadModel extends com.mg.merp.document.model.DocHeadModel implements java.io.Serializable {

    private BankAccount PartnerToBankReq;

    private Contractor Consignee;

    private Contractor Shipper;

    private BankAccount PartnerFromBankReq;

    private Date InDate;

    private Date StockDate;

    private Date PayDate;

    private String ToPayDocNumber;

    private Date ToPayDocDate;

    private String Comment;

    public FacturaHeadModel() {
    }

    public FacturaHeadModel(DocSection DocSection, boolean ManualDocNumber) {
        super(DocSection, ManualDocNumber);
    }

    public FacturaHeadModel(SysCompany SysCompany, Contractor Through, Folder ModelDestFolder, Contractor From, Contractor To, Contractor DstMol, CurrencyRateAuthority CurrencyRateAuthority, Contractor SrcMol, Folder Folder, SysClient SysClient, Contractor DstStock, CurrencyRateType CurrencyRateType, Contractor SrcStock, DocSection DocSection, String ModelName, DocType DocType, String DocNumber, Date DocDate, Currency Currency, BigDecimal CurCource, BigDecimal SumCur, BigDecimal SumNat, DocHead BaseDocument, DocType BaseDocType, String BaseDocNumber, Date BaseDocDate, DocHead Contract, DocType ContractType, String ContractNumber, Date ContractDate, BigDecimal Weight, BigDecimal Volume, PriceListHead PriceList, PriceType PriceType, CalcTaxesKind CalcTaxesKind, Folder DiscountFolder, boolean ManualDocNumber, String Description, BankAccount PartnerToBankReq, Contractor Consignee, Contractor Shipper, BankAccount PartnerFromBankReq, Date InDate, Date StockDate, Date PayDate, String ToPayDocNumber, Date ToPayDocDate, String Comment) {
        super(SysCompany, Through, ModelDestFolder, From, To, DstMol, CurrencyRateAuthority, SrcMol, Folder, SysClient, DstStock, CurrencyRateType, SrcStock, DocSection, ModelName, DocType, DocNumber, DocDate, Currency, CurCource, SumCur, SumNat, BaseDocument, BaseDocType, BaseDocNumber, BaseDocDate, Contract, ContractType, ContractNumber, ContractDate, Weight, Volume, PriceList, PriceType, CalcTaxesKind, DiscountFolder, ManualDocNumber, Description);
        this.PartnerToBankReq = PartnerToBankReq;
        this.Consignee = Consignee;
        this.Shipper = Shipper;
        this.PartnerFromBankReq = PartnerFromBankReq;
        this.InDate = InDate;
        this.StockDate = StockDate;
        this.PayDate = PayDate;
        this.ToPayDocNumber = ToPayDocNumber;
        this.ToPayDocDate = ToPayDocDate;
        this.Comment = Comment;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PARTNERTO_BANKREQ")
    @DataItemName("Factura.FacturaHeadModel.PartnerToBankReq")
    public BankAccount getPartnerToBankReq() {
        return this.PartnerToBankReq;
    }

    public void setPartnerToBankReq(BankAccount PartnerToBankReq) {
        this.PartnerToBankReq = PartnerToBankReq;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CONSIGNEE")
    @DataItemName("Factura.FacturaHeadModel.Consignee")
    public Contractor getConsignee() {
        return this.Consignee;
    }

    public void setConsignee(Contractor Consignee) {
        this.Consignee = Consignee;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "SHIPPER")
    @DataItemName("Factura.FacturaHeadModel.Shipper")
    public Contractor getShipper() {
        return this.Shipper;
    }

    public void setShipper(Contractor Shipper) {
        this.Shipper = Shipper;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PARTNERFROM_BANKREQ")
    @DataItemName("Factura.FacturaHeadModel.PartnerFromBankReq")
    public BankAccount getPartnerFromBankReq() {
        return this.PartnerFromBankReq;
    }

    public void setPartnerFromBankReq(BankAccount PartnerFromBankReq) {
        this.PartnerFromBankReq = PartnerFromBankReq;
    }

    @Column(name = "INDATE", columnDefinition = "TIMESTAMP")
    @DataItemName("Factura.FacturaHeadModel.InDate")
    public Date getInDate() {
        return this.InDate;
    }

    public void setInDate(Date InDate) {
        this.InDate = InDate;
    }

    @Column(name = "STOCKDATE", columnDefinition = "TIMESTAMP")
    @DataItemName("Factura.FacturaHeadModel.StockDate")
    public Date getStockDate() {
        return this.StockDate;
    }

    public void setStockDate(Date StockDate) {
        this.StockDate = StockDate;
    }

    @Column(name = "PAYDATE", columnDefinition = "TIMESTAMP")
    @DataItemName("Factura.FacturaHeadModel.PayDate")
    public Date getPayDate() {
        return this.PayDate;
    }

    public void setPayDate(Date PayDate) {
        this.PayDate = PayDate;
    }

    @Column(name = "TOPAYDOCNUMBER", columnDefinition = "CHAR", length = 20)
    @DataItemName("Factura.FacturaHeadModel.ToPayDocNumber")
    public String getToPayDocNumber() {
        return this.ToPayDocNumber;
    }

    public void setToPayDocNumber(String ToPayDocNumber) {
        this.ToPayDocNumber = ToPayDocNumber;
    }

    @Column(name = "TOPAYDOCDATE", columnDefinition = "TIMESTAMP")
    @DataItemName("Factura.FacturaHeadModel.ToPayDocDate")
    public Date getToPayDocDate() {
        return this.ToPayDocDate;
    }

    public void setToPayDocDate(Date ToPayDocDate) {
        this.ToPayDocDate = ToPayDocDate;
    }

    @Column(name = "COMMENT", columnDefinition = "VARCHAR", length = 1024)
    @DataItemName("Factura.FacturaHeadModel.Comment")
    public String getComment() {
        return this.Comment;
    }

    public void setComment(String Comment) {
        this.Comment = Comment;
    }
}

