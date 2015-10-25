package com.mg.merp.document.model;

import com.mg.merp.core.model.Folder;
import com.mg.merp.core.model.SysClient;
import com.mg.merp.core.model.SysCompany;
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
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.SEQUENCE;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import com.mg.framework.api.annotations.DataItemName;

/**
 * DocHeadModel generated by hbm2java
 */
@Entity
@Table(name = "DOCHEADMODEL")
@DataItemName("Document.DocHeadModel")
public class DocHeadModel extends com.mg.merp.core.model.AbstractEntity implements java.io.Serializable {

    private Integer Id;

    private SysCompany SysCompany;

    private Contractor Through;

    private Folder ModelDestFolder;

    private Contractor From;

    private Contractor To;

    private Contractor DstMol;

    private CurrencyRateAuthority CurrencyRateAuthority;

    private Contractor SrcMol;

    private Folder Folder;

    private SysClient SysClient;

    private Contractor DstStock;

    private CurrencyRateType CurrencyRateType;

    private Contractor SrcStock;

    private DocSection DocSection;

    private String ModelName;

    private DocType DocType;

    private String DocNumber;

    private Date DocDate;

    private Currency Currency;

    private BigDecimal CurCource;

    private BigDecimal SumCur;

    private BigDecimal SumNat;

    private DocHead BaseDocument;

    private DocType BaseDocType;

    private String BaseDocNumber;

    private Date BaseDocDate;

    private DocHead Contract;

    private DocType ContractType;

    private String ContractNumber;

    private Date ContractDate;

    private BigDecimal Weight;

    private BigDecimal Volume;

    private PriceListHead PriceList;

    private PriceType PriceType;

    private CalcTaxesKind CalcTaxesKind;

    private Folder DiscountFolder;

    private boolean ManualDocNumber;

    private String Description;

    public DocHeadModel() {
    }

    public DocHeadModel(DocSection DocSection, boolean ManualDocNumber) {
        this.DocSection = DocSection;
        this.ManualDocNumber = ManualDocNumber;
    }

    public DocHeadModel(SysCompany SysCompany, Contractor Through, Folder ModelDestFolder, Contractor From, Contractor To, Contractor DstMol, CurrencyRateAuthority CurrencyRateAuthority, Contractor SrcMol, Folder Folder, SysClient SysClient, Contractor DstStock, CurrencyRateType CurrencyRateType, Contractor SrcStock, DocSection DocSection, String ModelName, DocType DocType, String DocNumber, Date DocDate, Currency Currency, BigDecimal CurCource, BigDecimal SumCur, BigDecimal SumNat, DocHead BaseDocument, DocType BaseDocType, String BaseDocNumber, Date BaseDocDate, DocHead Contract, DocType ContractType, String ContractNumber, Date ContractDate, BigDecimal Weight, BigDecimal Volume, PriceListHead PriceList, PriceType PriceType, CalcTaxesKind CalcTaxesKind, Folder DiscountFolder, boolean ManualDocNumber, String Description) {
        this.SysCompany = SysCompany;
        this.Through = Through;
        this.ModelDestFolder = ModelDestFolder;
        this.From = From;
        this.To = To;
        this.DstMol = DstMol;
        this.CurrencyRateAuthority = CurrencyRateAuthority;
        this.SrcMol = SrcMol;
        this.Folder = Folder;
        this.SysClient = SysClient;
        this.DstStock = DstStock;
        this.CurrencyRateType = CurrencyRateType;
        this.SrcStock = SrcStock;
        this.DocSection = DocSection;
        this.ModelName = ModelName;
        this.DocType = DocType;
        this.DocNumber = DocNumber;
        this.DocDate = DocDate;
        this.Currency = Currency;
        this.CurCource = CurCource;
        this.SumCur = SumCur;
        this.SumNat = SumNat;
        this.BaseDocument = BaseDocument;
        this.BaseDocType = BaseDocType;
        this.BaseDocNumber = BaseDocNumber;
        this.BaseDocDate = BaseDocDate;
        this.Contract = Contract;
        this.ContractType = ContractType;
        this.ContractNumber = ContractNumber;
        this.ContractDate = ContractDate;
        this.Weight = Weight;
        this.Volume = Volume;
        this.PriceList = PriceList;
        this.PriceType = PriceType;
        this.CalcTaxesKind = CalcTaxesKind;
        this.DiscountFolder = DiscountFolder;
        this.ManualDocNumber = ManualDocNumber;
        this.Description = Description;
    }

    @SequenceGenerator(name = "generator", sequenceName = "DOCHEADMODEL_ID_GEN")
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
    @JoinColumn(name = "SYS_COMPANY_ID")
    public SysCompany getSysCompany() {
        return this.SysCompany;
    }

    public void setSysCompany(SysCompany SysCompany) {
        this.SysCompany = SysCompany;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "THROUGH_ID")
    @DataItemName("Document.Through")
    public Contractor getThrough() {
        return this.Through;
    }

    public void setThrough(Contractor Through) {
        this.Through = Through;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MODELDESTFOLDER_ID")
    @DataItemName("Document.DocModel.ModelDestFolder")
    public Folder getModelDestFolder() {
        return this.ModelDestFolder;
    }

    public void setModelDestFolder(Folder ModelDestFolder) {
        this.ModelDestFolder = ModelDestFolder;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "FROM_ID")
    @DataItemName("Document.From")
    public Contractor getFrom() {
        return this.From;
    }

    public void setFrom(Contractor From) {
        this.From = From;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "TO_ID")
    @DataItemName("Document.To")
    public Contractor getTo() {
        return this.To;
    }

    public void setTo(Contractor To) {
        this.To = To;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MOLDEST")
    @DataItemName("Document.DstMol")
    public Contractor getDstMol() {
        return this.DstMol;
    }

    public void setDstMol(Contractor DstMol) {
        this.DstMol = DstMol;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CURRATEAUTHORITY_ID")
    @DataItemName("Document.CurrencyRateAuthority")
    public CurrencyRateAuthority getCurrencyRateAuthority() {
        return this.CurrencyRateAuthority;
    }

    public void setCurrencyRateAuthority(CurrencyRateAuthority CurrencyRateAuthority) {
        this.CurrencyRateAuthority = CurrencyRateAuthority;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MOLSRC")
    @DataItemName("Document.SrcMol")
    public Contractor getSrcMol() {
        return this.SrcMol;
    }

    public void setSrcMol(Contractor SrcMol) {
        this.SrcMol = SrcMol;
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
    @JoinColumn(name = "STOCKDEST")
    @DataItemName("Document.DstStock")
    public Contractor getDstStock() {
        return this.DstStock;
    }

    public void setDstStock(Contractor DstStock) {
        this.DstStock = DstStock;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CURRATETYPE_ID")
    @DataItemName("Document.CurrencyRateType")
    public CurrencyRateType getCurrencyRateType() {
        return this.CurrencyRateType;
    }

    public void setCurrencyRateType(CurrencyRateType CurrencyRateType) {
        this.CurrencyRateType = CurrencyRateType;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "STOCKSRC")
    @DataItemName("Document.StockSrc")
    public Contractor getSrcStock() {
        return this.SrcStock;
    }

    public void setSrcStock(Contractor SrcStock) {
        this.SrcStock = SrcStock;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "DOCSECTION", nullable = false)
    public DocSection getDocSection() {
        return this.DocSection;
    }

    public void setDocSection(DocSection DocSection) {
        this.DocSection = DocSection;
    }

    @Column(name = "MODELNAME", columnDefinition = "VARCHAR", length = 80)
    @DataItemName("Document.DocModel.Name")
    public String getModelName() {
        return this.ModelName;
    }

    public void setModelName(String ModelName) {
        this.ModelName = ModelName;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "DOCTYPE")
    @DataItemName("Document.DocHeadModel.DocType")
    public DocType getDocType() {
        return this.DocType;
    }

    public void setDocType(DocType DocType) {
        this.DocType = DocType;
    }

    @Column(name = "DOCNUMBER", columnDefinition = "CHAR", length = 20)
    @DataItemName("Document.DocNumber")
    public String getDocNumber() {
        return this.DocNumber;
    }

    public void setDocNumber(String DocNumber) {
        this.DocNumber = DocNumber;
    }

    @Column(name = "DOCDATE", columnDefinition = "TIMESTAMP")
    @DataItemName("Document.DocDate")
    public Date getDocDate() {
        return this.DocDate;
    }

    public void setDocDate(Date DocDate) {
        this.DocDate = DocDate;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CURRENCY_CODE")
    public Currency getCurrency() {
        return this.Currency;
    }

    public void setCurrency(Currency Currency) {
        this.Currency = Currency;
    }

    @Column(name = "CURCOURCE", columnDefinition = "NUMERIC", precision = 15, scale = 5)
    @DataItemName("Document.CurCource")
    public BigDecimal getCurCource() {
        return this.CurCource;
    }

    public void setCurCource(BigDecimal CurCource) {
        this.CurCource = CurCource;
    }

    @Column(name = "SUMMACUR", columnDefinition = "NUMERIC", precision = 15, scale = 4)
    @DataItemName("Document.SumCur")
    public BigDecimal getSumCur() {
        return this.SumCur;
    }

    public void setSumCur(BigDecimal SumCur) {
        this.SumCur = SumCur;
    }

    @Column(name = "SUMMANAT", columnDefinition = "NUMERIC", precision = 15, scale = 4)
    @DataItemName("Document.SumNat")
    public BigDecimal getSumNat() {
        return this.SumNat;
    }

    public void setSumNat(BigDecimal SumNat) {
        this.SumNat = SumNat;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "BASEDOC_ID")
    public DocHead getBaseDocument() {
        return this.BaseDocument;
    }

    public void setBaseDocument(DocHead BaseDocument) {
        this.BaseDocument = BaseDocument;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "BASEDOCTYPE")
    @DataItemName("Document.DocHeadModel.BaseDocType")
    public DocType getBaseDocType() {
        return this.BaseDocType;
    }

    public void setBaseDocType(DocType BaseDocType) {
        this.BaseDocType = BaseDocType;
    }

    @Column(name = "BASEDOCNUMBER", columnDefinition = "CHAR", length = 20)
    @DataItemName("Document.BaseDocNumber")
    public String getBaseDocNumber() {
        return this.BaseDocNumber;
    }

    public void setBaseDocNumber(String BaseDocNumber) {
        this.BaseDocNumber = BaseDocNumber;
    }

    @Column(name = "BASEDOCDATE", columnDefinition = "TIMESTAMP")
    @DataItemName("Document.BaseDocDate")
    public Date getBaseDocDate() {
        return this.BaseDocDate;
    }

    public void setBaseDocDate(Date BaseDocDate) {
        this.BaseDocDate = BaseDocDate;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CONTRACT_ID")
    public DocHead getContract() {
        return this.Contract;
    }

    public void setContract(DocHead Contract) {
        this.Contract = Contract;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CONTRACTTYPE")
    @DataItemName("Document.DocHeadModel.ContractType")
    public DocType getContractType() {
        return this.ContractType;
    }

    public void setContractType(DocType ContractType) {
        this.ContractType = ContractType;
    }

    @Column(name = "CONTRACTNUMBER", columnDefinition = "CHAR", length = 20)
    @DataItemName("Document.ContractNumber")
    public String getContractNumber() {
        return this.ContractNumber;
    }

    public void setContractNumber(String ContractNumber) {
        this.ContractNumber = ContractNumber;
    }

    @Column(name = "CONTRACTDATE", columnDefinition = "TIMESTAMP")
    @DataItemName("Document.ContractDate")
    public Date getContractDate() {
        return this.ContractDate;
    }

    public void setContractDate(Date ContractDate) {
        this.ContractDate = ContractDate;
    }

    @Column(name = "WEIGHT", columnDefinition = "NUMERIC", precision = 15, scale = 3)
    @DataItemName("Document.Weight")
    public BigDecimal getWeight() {
        return this.Weight;
    }

    public void setWeight(BigDecimal Weight) {
        this.Weight = Weight;
    }

    @Column(name = "VOLUME", columnDefinition = "NUMERIC", precision = 15, scale = 3)
    @DataItemName("Document.Volume")
    public BigDecimal getVolume() {
        return this.Volume;
    }

    public void setVolume(BigDecimal Volume) {
        this.Volume = Volume;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PRICELIST_ID")
    public PriceListHead getPriceList() {
        return this.PriceList;
    }

    public void setPriceList(PriceListHead PriceList) {
        this.PriceList = PriceList;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PRICETYPE_ID")
    public PriceType getPriceType() {
        return this.PriceType;
    }

    public void setPriceType(PriceType PriceType) {
        this.PriceType = PriceType;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CALCTAXESKIND_ID")
    public CalcTaxesKind getCalcTaxesKind() {
        return this.CalcTaxesKind;
    }

    public void setCalcTaxesKind(CalcTaxesKind CalcTaxesKind) {
        this.CalcTaxesKind = CalcTaxesKind;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "DISCOUNT_FOLDER_ID")
    @DataItemName("Document.DiscountFolder")
    public Folder getDiscountFolder() {
        return this.DiscountFolder;
    }

    public void setDiscountFolder(Folder DiscountFolder) {
        this.DiscountFolder = DiscountFolder;
    }

    @Column(name = "MANUAL_DOC_NUMBER", nullable = false, columnDefinition = "SMALLINT")
    public boolean isManualDocNumber() {
        return this.ManualDocNumber;
    }

    public void setManualDocNumber(boolean ManualDocNumber) {
        this.ManualDocNumber = ManualDocNumber;
    }

    @Column(name = "DESCRIPTION", columnDefinition = "VARCHAR", length = 1024)
    @DataItemName("Document.Description")
    public String getDescription() {
        return this.Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }
}

