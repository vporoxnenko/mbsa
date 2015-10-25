package com.mg.merp.contract.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import org.hibernate.annotations.Formula;
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
import com.mg.merp.reference.model.PartnerEmpl;
import com.mg.merp.reference.model.PriceListHead;
import com.mg.merp.reference.model.PriceType;
import javax.persistence.Enumerated;
import javax.persistence.EnumType;

/**
 * Contract generated by hbm2java
 */
@Entity
@Table(name = "CONTRACT")
public class Contract extends com.mg.merp.document.model.DocHead implements java.io.Serializable {

    private Contractor Consignee;

    private Contractor Shipper;

    private BankAccount ContractorBankReq;

    private BankAccount BankReq;

    private Contractor Responsible;

    private PartnerEmpl ContractorResponsible;

    private BankAccount ShipperBankReq;

    private BankAccount ConsigneeBankReq;

    private String IncomingNumber;

    private Date RegistrationDate;

    private ContractStatus Status;

    private Date RatificationDate;

    private Date CompletedDate;

    private Date BeginActionDate;

    private Date EndActionDate;

    private String Subject;

    private String Comment;

    private CalcSumKind CalcSumKind;

    private BigDecimal ShippedPayment;

    private BigDecimal ReceivedPayment;

    private BigDecimal ShippedGood;

    private BigDecimal ReceivedGood;

    private BigDecimal FactShippedPayment;

    private BigDecimal FactReceivedPayment;

    private BigDecimal FactShippedGood;

    private BigDecimal FactReceivedGood;

    private BigDecimal PhaseShippedPayment;

    private BigDecimal PhaseReceivedPayment;

    private BigDecimal PhaseShippedGood;

    private BigDecimal PhaseReceivedGood;

    private Short ContractorBankDays;

    private Short BankDays;

    private BigDecimal PennyRate;

    private BigDecimal ContractorPennyRate;

    private ContractType TypeContract;

    private ContractCategory ContractCategory;

    private String ContractorInNameOf;

    private String ContractorActOnBasis;

    private Short ContractorConsignmentTerm;

    private BigDecimal ContractorGoodsCredit;

    private String InNameOf;

    private String ActOnBasis;

    private Short ConsignmentTerm;

    private BigDecimal GoodsCredit;

    public Contract() {
    }

    public Contract(SysCompany SysCompany, DocSection DocSection, Short Requester, boolean ManualDocNumber) {
        super(SysCompany, DocSection, Requester, ManualDocNumber);
    }

    public Contract(SysCompany SysCompany, Contractor Through, Contractor From, CurrencyRateAuthority CurrencyRateAuthority, Contractor SrcMol, PriceType PriceType, Folder DiscountFolder, Folder Folder, DocType DocType, DocHead Contract, Currency Currency, Contractor SrcStock, DocType ContractType, Contractor To, Contractor DstMol, DocHead BaseDocument, SysClient SysClient, Contractor DstStock, CalcTaxesKind CalcTaxesKind, DocType BaseDocType, CurrencyRateType CurrencyRateType, PriceListHead PriceList, DocSection DocSection, String DocNumber, Date DocDate, BigDecimal CurCource, BigDecimal SumCur, BigDecimal SumNat, String BaseDocNumber, Date BaseDocDate, String ContractNumber, Date ContractDate, BigDecimal Weight, BigDecimal Volume, Short Requester, byte[] Original, String UNID, boolean ManualDocNumber, String Description, Contractor Consignee, Contractor Shipper, BankAccount ContractorBankReq, BankAccount BankReq, Contractor Responsible, PartnerEmpl ContractorResponsible, BankAccount ShipperBankReq, BankAccount ConsigneeBankReq, String IncomingNumber, Date RegistrationDate, ContractStatus Status, Date RatificationDate, Date CompletedDate, Date BeginActionDate, Date EndActionDate, String Subject, String Comment, CalcSumKind CalcSumKind, BigDecimal ShippedPayment, BigDecimal ReceivedPayment, BigDecimal ShippedGood, BigDecimal ReceivedGood, Short ContractorBankDays, Short BankDays, BigDecimal PennyRate, BigDecimal ContractorPennyRate, ContractType TypeContract, ContractCategory ContractCategory, String ContractorInNameOf, String ContractorActOnBasis, Short ContractorConsignmentTerm, BigDecimal ContractorGoodsCredit, String InNameOf, String ActOnBasis, Short ConsignmentTerm, BigDecimal GoodsCredit) {
        super(SysCompany, Through, From, CurrencyRateAuthority, SrcMol, PriceType, DiscountFolder, Folder, DocType, Contract, Currency, SrcStock, ContractType, To, DstMol, BaseDocument, SysClient, DstStock, CalcTaxesKind, BaseDocType, CurrencyRateType, PriceList, DocSection, DocNumber, DocDate, CurCource, SumCur, SumNat, BaseDocNumber, BaseDocDate, ContractNumber, ContractDate, Weight, Volume, Requester, Original, UNID, ManualDocNumber, Description);
        this.Consignee = Consignee;
        this.Shipper = Shipper;
        this.ContractorBankReq = ContractorBankReq;
        this.BankReq = BankReq;
        this.Responsible = Responsible;
        this.ContractorResponsible = ContractorResponsible;
        this.ShipperBankReq = ShipperBankReq;
        this.ConsigneeBankReq = ConsigneeBankReq;
        this.IncomingNumber = IncomingNumber;
        this.RegistrationDate = RegistrationDate;
        this.Status = Status;
        this.RatificationDate = RatificationDate;
        this.CompletedDate = CompletedDate;
        this.BeginActionDate = BeginActionDate;
        this.EndActionDate = EndActionDate;
        this.Subject = Subject;
        this.Comment = Comment;
        this.CalcSumKind = CalcSumKind;
        this.ShippedPayment = ShippedPayment;
        this.ReceivedPayment = ReceivedPayment;
        this.ShippedGood = ShippedGood;
        this.ReceivedGood = ReceivedGood;
        this.ContractorBankDays = ContractorBankDays;
        this.BankDays = BankDays;
        this.PennyRate = PennyRate;
        this.ContractorPennyRate = ContractorPennyRate;
        this.TypeContract = TypeContract;
        this.ContractCategory = ContractCategory;
        this.ContractorInNameOf = ContractorInNameOf;
        this.ContractorActOnBasis = ContractorActOnBasis;
        this.ContractorConsignmentTerm = ContractorConsignmentTerm;
        this.ContractorGoodsCredit = ContractorGoodsCredit;
        this.InNameOf = InNameOf;
        this.ActOnBasis = ActOnBasis;
        this.ConsignmentTerm = ConsignmentTerm;
        this.GoodsCredit = GoodsCredit;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CONSIGNEE")
    //$NON-NLS-1$
    @DataItemName("Contract.Consignee")
    public Contractor getConsignee() {
        return this.Consignee;
    }

    public void setConsignee(Contractor Consignee) {
        this.Consignee = Consignee;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "SHIPPER")
    //$NON-NLS-1$
    @DataItemName("Contract.Shipper")
    public Contractor getShipper() {
        return this.Shipper;
    }

    public void setShipper(Contractor Shipper) {
        this.Shipper = Shipper;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CONTRACTORBANKREQ_ID")
    //$NON-NLS-1$
    @DataItemName("Contract.ContractorBankReq")
    public BankAccount getContractorBankReq() {
        return this.ContractorBankReq;
    }

    public void setContractorBankReq(BankAccount ContractorBankReq) {
        this.ContractorBankReq = ContractorBankReq;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "BANKREQ_ID")
    //$NON-NLS-1$
    @DataItemName("Contract.BankReq")
    public BankAccount getBankReq() {
        return this.BankReq;
    }

    public void setBankReq(BankAccount BankReq) {
        this.BankReq = BankReq;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "RESPONSIBLE")
    //$NON-NLS-1$
    @DataItemName("Contract.Responsible")
    public Contractor getResponsible() {
        return this.Responsible;
    }

    public void setResponsible(Contractor Responsible) {
        this.Responsible = Responsible;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CONTRACTOR_RESPONSIBLE")
    //$NON-NLS-1$
    @DataItemName("Contract.ContrResponsible")
    public PartnerEmpl getContractorResponsible() {
        return this.ContractorResponsible;
    }

    public void setContractorResponsible(PartnerEmpl ContractorResponsible) {
        this.ContractorResponsible = ContractorResponsible;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "SHIPPERBANKREQ_ID")
    //$NON-NLS-1$
    @DataItemName("Contract.ShipperBankReq")
    public BankAccount getShipperBankReq() {
        return this.ShipperBankReq;
    }

    public void setShipperBankReq(BankAccount ShipperBankReq) {
        this.ShipperBankReq = ShipperBankReq;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CONSIGNEEBANKREQ_ID")
    //$NON-NLS-1$
    @DataItemName("Contract.ConsigneeBankReq")
    public BankAccount getConsigneeBankReq() {
        return this.ConsigneeBankReq;
    }

    public void setConsigneeBankReq(BankAccount ConsigneeBankReq) {
        this.ConsigneeBankReq = ConsigneeBankReq;
    }

    @Column(name = "INCOMING_NUMBER", columnDefinition = "CHAR", length = 20)
    //$NON-NLS-1$
    @DataItemName("Contract.IncomingNumber")
    public String getIncomingNumber() {
        return this.IncomingNumber;
    }

    public void setIncomingNumber(String IncomingNumber) {
        this.IncomingNumber = IncomingNumber;
    }

    @Column(name = "REGISTRATION_DATE", columnDefinition = "TIMESTAMP")
    //$NON-NLS-1$
    @DataItemName("Contract.RegistrationDate")
    public Date getRegistrationDate() {
        return this.RegistrationDate;
    }

    public void setRegistrationDate(Date RegistrationDate) {
        this.RegistrationDate = RegistrationDate;
    }

    @Column(name = "STATUS")
    @Enumerated(EnumType.ORDINAL)
    public ContractStatus getStatus() {
        return this.Status;
    }

    public void setStatus(ContractStatus Status) {
        this.Status = Status;
    }

    @Column(name = "RATIFICATION_DATE", columnDefinition = "TIMESTAMP")
    //$NON-NLS-1$
    @DataItemName("Contract.RatificationDate")
    public Date getRatificationDate() {
        return this.RatificationDate;
    }

    public void setRatificationDate(Date RatificationDate) {
        this.RatificationDate = RatificationDate;
    }

    @Column(name = "COMPLETED_DATE", columnDefinition = "TIMESTAMP")
    //$NON-NLS-1$
    @DataItemName("Contract.CompletedDate")
    public Date getCompletedDate() {
        return this.CompletedDate;
    }

    public void setCompletedDate(Date CompletedDate) {
        this.CompletedDate = CompletedDate;
    }

    @Column(name = "BEGINACTION_DATE", columnDefinition = "TIMESTAMP")
    //$NON-NLS-1$
    @DataItemName("Contract.BeginActionDate")
    public Date getBeginActionDate() {
        return this.BeginActionDate;
    }

    public void setBeginActionDate(Date BeginActionDate) {
        this.BeginActionDate = BeginActionDate;
    }

    @Column(name = "ENDACTION_DATE", columnDefinition = "TIMESTAMP")
    //$NON-NLS-1$
    @DataItemName("Contract.EndActionDate")
    public Date getEndActionDate() {
        return this.EndActionDate;
    }

    public void setEndActionDate(Date EndActionDate) {
        this.EndActionDate = EndActionDate;
    }

    @Column(name = "SUBJECT", columnDefinition = "VARCHAR", length = 2048)
    //$NON-NLS-1$
    @DataItemName("Contract.Description")
    public String getSubject() {
        return this.Subject;
    }

    public void setSubject(String Subject) {
        this.Subject = Subject;
    }

    @Column(name = "COMMENT", columnDefinition = "VARCHAR", length = 2048)
    //$NON-NLS-1$
    @DataItemName("Contract.Comment")
    public String getComment() {
        return this.Comment;
    }

    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    @Column(name = "CALCSUMKIND")
    @Enumerated(EnumType.ORDINAL)
    public CalcSumKind getCalcSumKind() {
        return this.CalcSumKind;
    }

    public void setCalcSumKind(CalcSumKind CalcSumKind) {
        this.CalcSumKind = CalcSumKind;
    }

    @Column(name = "SHIPPEDPAYMENT", columnDefinition = "NUMERIC", precision = 15, scale = 4)
    //$NON-NLS-1$
    @DataItemName("Contract.ShippedPayment")
    public BigDecimal getShippedPayment() {
        return this.ShippedPayment;
    }

    public void setShippedPayment(BigDecimal ShippedPayment) {
        this.ShippedPayment = ShippedPayment;
    }

    @Column(name = "RECEIVEDPAYMENT", columnDefinition = "NUMERIC", precision = 15, scale = 4)
    //$NON-NLS-1$
    @DataItemName("Contract.ReceivedPayment")
    public BigDecimal getReceivedPayment() {
        return this.ReceivedPayment;
    }

    public void setReceivedPayment(BigDecimal ReceivedPayment) {
        this.ReceivedPayment = ReceivedPayment;
    }

    @Column(name = "SHIPPEDGOOD", columnDefinition = "NUMERIC", precision = 15, scale = 4)
    //$NON-NLS-1$
    @DataItemName("Contract.ShippedGood")
    public BigDecimal getShippedGood() {
        return this.ShippedGood;
    }

    public void setShippedGood(BigDecimal ShippedGood) {
        this.ShippedGood = ShippedGood;
    }

    @Column(name = "RECEIVEDGOOD", columnDefinition = "NUMERIC", precision = 15, scale = 4)
    //$NON-NLS-1$
    @DataItemName("Contract.ReceivedGood")
    public BigDecimal getReceivedGood() {
        return this.ReceivedGood;
    }

    public void setReceivedGood(BigDecimal ReceivedGood) {
        this.ReceivedGood = ReceivedGood;
    }

    @Formula(value = "(SELECT sum(f.factsum) from phaseitemfact f where (f.dochead_id = DOCHEAD_ID) and (f.kind = 0))")
    //$NON-NLS-1$
    @DataItemName("Contract.FactShippedPayment")
    public BigDecimal getFactShippedPayment() {
        return this.FactShippedPayment;
    }

    public void setFactShippedPayment(BigDecimal FactShippedPayment) {
        this.FactShippedPayment = FactShippedPayment;
    }

    @Formula(value = "(SELECT sum(f.factsum) from phaseitemfact f where (f.dochead_id = DOCHEAD_ID) and (f.kind = 1))")
    //$NON-NLS-1$
    @DataItemName("Contract.FactReceivedPayment")
    public BigDecimal getFactReceivedPayment() {
        return this.FactReceivedPayment;
    }

    public void setFactReceivedPayment(BigDecimal FactReceivedPayment) {
        this.FactReceivedPayment = FactReceivedPayment;
    }

    @Formula(value = "(SELECT sum(f.factsum) from phaseitemfact f where (f.dochead_id = DOCHEAD_ID) and (f.kind = 2))")
    //$NON-NLS-1$
    @DataItemName("Contract.FactShippedGood")
    public BigDecimal getFactShippedGood() {
        return this.FactShippedGood;
    }

    public void setFactShippedGood(BigDecimal FactShippedGood) {
        this.FactShippedGood = FactShippedGood;
    }

    @Formula(value = "(SELECT sum(f.factsum) from phaseitemfact f where (f.dochead_id = DOCHEAD_ID) and (f.kind = 3))")
    //$NON-NLS-1$
    @DataItemName("Contract.FactReceivedGood")
    public BigDecimal getFactReceivedGood() {
        return this.FactReceivedGood;
    }

    public void setFactReceivedGood(BigDecimal FactReceivedGood) {
        this.FactReceivedGood = FactReceivedGood;
    }

    @Formula(value = "(SELECT sum(p.plansum) from phaseitemplan p left join contractphase cph on (p.phase_id = cph.id) where (cph.dochead_id = DOCHEAD_ID) and (p.kind = 0))")
    //$NON-NLS-1$
    @DataItemName("Contract.PhaseShippedPayment")
    public BigDecimal getPhaseShippedPayment() {
        return this.PhaseShippedPayment;
    }

    public void setPhaseShippedPayment(BigDecimal PhaseShippedPayment) {
        this.PhaseShippedPayment = PhaseShippedPayment;
    }

    @Formula(value = "(SELECT sum(p.plansum) from phaseitemplan p left join contractphase cph on (p.phase_id = cph.id) where (cph.dochead_id = DOCHEAD_ID) and (p.kind = 1))")
    //$NON-NLS-1$
    @DataItemName("Contract.PhaseReceivedPayment")
    public BigDecimal getPhaseReceivedPayment() {
        return this.PhaseReceivedPayment;
    }

    public void setPhaseReceivedPayment(BigDecimal PhaseReceivedPayment) {
        this.PhaseReceivedPayment = PhaseReceivedPayment;
    }

    @Formula(value = "(SELECT sum(p.plansum) from phaseitemplan p left join contractphase cph on (p.phase_id = cph.id) where (cph.dochead_id = DOCHEAD_ID) and (p.kind = 2))")
    //$NON-NLS-1$
    @DataItemName("Contract.PhaseShippedGood")
    public BigDecimal getPhaseShippedGood() {
        return this.PhaseShippedGood;
    }

    public void setPhaseShippedGood(BigDecimal PhaseShippedGood) {
        this.PhaseShippedGood = PhaseShippedGood;
    }

    @Formula(value = "(SELECT sum(p.plansum) from phaseitemplan p left join contractphase cph on (p.phase_id = cph.id) where (cph.dochead_id = DOCHEAD_ID) and (p.kind = 3))")
    //$NON-NLS-1$
    @DataItemName("Contract.PhaseReceivedGood")
    public BigDecimal getPhaseReceivedGood() {
        return this.PhaseReceivedGood;
    }

    public void setPhaseReceivedGood(BigDecimal PhaseReceivedGood) {
        this.PhaseReceivedGood = PhaseReceivedGood;
    }

    @Column(name = "CONTRACTORBANKDAYS", columnDefinition = "SMALLINT")
    //$NON-NLS-1$
    @DataItemName("Contract.ContrBankDays")
    public Short getContractorBankDays() {
        return this.ContractorBankDays;
    }

    public void setContractorBankDays(Short ContractorBankDays) {
        this.ContractorBankDays = ContractorBankDays;
    }

    @Column(name = "BANKDAYS", columnDefinition = "SMALLINT")
    //$NON-NLS-1$
    @DataItemName("Contract.BankDays")
    public Short getBankDays() {
        return this.BankDays;
    }

    public void setBankDays(Short BankDays) {
        this.BankDays = BankDays;
    }

    @Column(name = "PENNY_RATE", columnDefinition = "NUMERIC", precision = 18, scale = 6)
    //$NON-NLS-1$
    @DataItemName("Contract.PennyRate")
    public BigDecimal getPennyRate() {
        return this.PennyRate;
    }

    public void setPennyRate(BigDecimal PennyRate) {
        this.PennyRate = PennyRate;
    }

    @Column(name = "CONTRACTORPENNY_RATE", columnDefinition = "NUMERIC", precision = 18, scale = 6)
    //$NON-NLS-1$
    @DataItemName("Contract.ContrPennyRate")
    public BigDecimal getContractorPennyRate() {
        return this.ContractorPennyRate;
    }

    public void setContractorPennyRate(BigDecimal ContractorPennyRate) {
        this.ContractorPennyRate = ContractorPennyRate;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CONTRACT_KIND_ID")
    public ContractType getTypeContract() {
        return this.TypeContract;
    }

    public void setTypeContract(ContractType TypeContract) {
        this.TypeContract = TypeContract;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CONTRACT_CATEGORY_ID")
    public ContractCategory getContractCategory() {
        return this.ContractCategory;
    }

    public void setContractCategory(ContractCategory ContractCategory) {
        this.ContractCategory = ContractCategory;
    }

    @Column(name = "CONTRACTOR_IN_NAME_OF", columnDefinition = "VARCHAR", length = 256)
    //$NON-NLS-1$
    @DataItemName("Contract.Contract.ContractorInNameOf")
    public String getContractorInNameOf() {
        return this.ContractorInNameOf;
    }

    public void setContractorInNameOf(String ContractorInNameOf) {
        this.ContractorInNameOf = ContractorInNameOf;
    }

    @Column(name = "CONTRACTOR_ACT_ON_BASIS", columnDefinition = "VARCHAR", length = 256)
    //$NON-NLS-1$
    @DataItemName("Contract.Contract.ContractorActOnBasis")
    public String getContractorActOnBasis() {
        return this.ContractorActOnBasis;
    }

    public void setContractorActOnBasis(String ContractorActOnBasis) {
        this.ContractorActOnBasis = ContractorActOnBasis;
    }

    @Column(name = "CONTRACTOR_CONSIGNMENT_TERM", columnDefinition = "SMALLINT")
    //$NON-NLS-1$
    @DataItemName("Contract.Contract.ContractorConsignmentTerm")
    public Short getContractorConsignmentTerm() {
        return this.ContractorConsignmentTerm;
    }

    public void setContractorConsignmentTerm(Short ContractorConsignmentTerm) {
        this.ContractorConsignmentTerm = ContractorConsignmentTerm;
    }

    @Column(name = "CONTRACTOR_GOODS_CREDIT", columnDefinition = "NUMERIC", precision = 15, scale = 4)
    //$NON-NLS-1$
    @DataItemName("Contract.Contract.ContractorGoodsCredit")
    public BigDecimal getContractorGoodsCredit() {
        return this.ContractorGoodsCredit;
    }

    public void setContractorGoodsCredit(BigDecimal ContractorGoodsCredit) {
        this.ContractorGoodsCredit = ContractorGoodsCredit;
    }

    @Column(name = "IN_NAME_OF", columnDefinition = "VARCHAR", length = 256)
    //$NON-NLS-1$
    @DataItemName("Contract.Contract.InNameOf")
    public String getInNameOf() {
        return this.InNameOf;
    }

    public void setInNameOf(String InNameOf) {
        this.InNameOf = InNameOf;
    }

    @Column(name = "ACT_ON_BASIS", columnDefinition = "VARCHAR", length = 256)
    //$NON-NLS-1$
    @DataItemName("Contract.Contract.ActOnBasis")
    public String getActOnBasis() {
        return this.ActOnBasis;
    }

    public void setActOnBasis(String ActOnBasis) {
        this.ActOnBasis = ActOnBasis;
    }

    @Column(name = "CONSIGNMENT_TERM", columnDefinition = "SMALLINT")
    //$NON-NLS-1$
    @DataItemName("Contract.Contract.ConsignmentTerm")
    public Short getConsignmentTerm() {
        return this.ConsignmentTerm;
    }

    public void setConsignmentTerm(Short ConsignmentTerm) {
        this.ConsignmentTerm = ConsignmentTerm;
    }

    @Column(name = "GOODS_CREDIT", columnDefinition = "NUMERIC", precision = 15, scale = 4)
    //$NON-NLS-1$
    @DataItemName("Contract.Contract.GoodsCredit")
    public BigDecimal getGoodsCredit() {
        return this.GoodsCredit;
    }

    public void setGoodsCredit(BigDecimal GoodsCredit) {
        this.GoodsCredit = GoodsCredit;
    }

    /**
     * Получить "Контрагента"
     */
    //$NON-NLS-1$
    @DataItemName("Contract.Contract.Contractor")
    public Contractor getFrom() {
        return super.getFrom();
    }

    /**
     * Получить "Нашу организацию"
     */
    //$NON-NLS-1$
    @DataItemName("Contract.Contract.Company")
    public Contractor getTo() {
        return super.getTo();
    }
}

