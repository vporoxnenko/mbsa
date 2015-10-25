package com.mg.merp.contract.model;

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
import javax.persistence.Enumerated;
import javax.persistence.EnumType;
import com.mg.framework.api.annotations.DataItemName;

/**
 * PhasePlanItem generated by hbm2java
 */
@Entity
@Table(name = "PHASEITEMPLAN")
public class PhasePlanItem extends com.mg.merp.core.model.AbstractEntity implements java.io.Serializable {

    private Integer Id;

    private Phase ContractPhase;

    private Contractor From;

    private Contractor To;

    private SysClient SysClient;

    private String ItemNumber;

    private ItemKind Kind;

    private Date BeginActionDate;

    private Date EndActionDate;

    private BigDecimal PlanSum;

    private BigDecimal FactSum;

    private boolean Avoid;

    private DocType DocType;

    private String DocNumber;

    private Date DocDate;

    private DocHead Document;

    public PhasePlanItem() {
    }

    public PhasePlanItem(Phase ContractPhase, Contractor From, Contractor To, SysClient SysClient, String ItemNumber, ItemKind Kind, Date BeginActionDate, Date EndActionDate, BigDecimal PlanSum, BigDecimal FactSum, boolean Avoid, DocType DocType, String DocNumber, Date DocDate, DocHead Document) {
        this.ContractPhase = ContractPhase;
        this.From = From;
        this.To = To;
        this.SysClient = SysClient;
        this.ItemNumber = ItemNumber;
        this.Kind = Kind;
        this.BeginActionDate = BeginActionDate;
        this.EndActionDate = EndActionDate;
        this.PlanSum = PlanSum;
        this.FactSum = FactSum;
        this.Avoid = Avoid;
        this.DocType = DocType;
        this.DocNumber = DocNumber;
        this.DocDate = DocDate;
        this.Document = Document;
    }

    @SequenceGenerator(name = "generator", sequenceName = "PHASEITEMPLAN_ID_GEN")
    @Id
    @GeneratedValue(strategy = SEQUENCE, generator = "generator")
    @Column(name = "ID", unique = true, columnDefinition = "INTEGER")
    //$NON-NLS-1$
    @DataItemName("ID")
    public Integer getId() {
        return this.Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PHASE_ID")
    public Phase getContractPhase() {
        return this.ContractPhase;
    }

    public void setContractPhase(Phase ContractPhase) {
        this.ContractPhase = ContractPhase;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CONTRACTORFROM")
    //$NON-NLS-1$
    @DataItemName("Contract.ItemPan.From")
    public Contractor getFrom() {
        return this.From;
    }

    public void setFrom(Contractor From) {
        this.From = From;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CONTRACTORTO")
    //$NON-NLS-1$
    @DataItemName("Contract.ItemPan.To")
    public Contractor getTo() {
        return this.To;
    }

    public void setTo(Contractor To) {
        this.To = To;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CLIENT_ID")
    public SysClient getSysClient() {
        return this.SysClient;
    }

    public void setSysClient(SysClient SysClient) {
        this.SysClient = SysClient;
    }

    @Column(name = "ITEM_NUMBER", columnDefinition = "CHAR", length = 20)
    //$NON-NLS-1$
    @DataItemName("Contract.ItemnPlan.Number")
    public String getItemNumber() {
        return this.ItemNumber;
    }

    public void setItemNumber(String ItemNumber) {
        this.ItemNumber = ItemNumber;
    }

    @Column(name = "KIND")
    @Enumerated(EnumType.ORDINAL)
    public ItemKind getKind() {
        return this.Kind;
    }

    public void setKind(ItemKind Kind) {
        this.Kind = Kind;
    }

    @Column(name = "BEGINACTION_DATE", columnDefinition = "TIMESTAMP")
    //$NON-NLS-1$
    @DataItemName("Contract.ItemnPlan.BeginActionDate")
    public Date getBeginActionDate() {
        return this.BeginActionDate;
    }

    public void setBeginActionDate(Date BeginActionDate) {
        this.BeginActionDate = BeginActionDate;
    }

    @Column(name = "ENDACTION_DATE", columnDefinition = "TIMESTAMP")
    //$NON-NLS-1$
    @DataItemName("Contract.ItemnPlan.EndActionDate")
    public Date getEndActionDate() {
        return this.EndActionDate;
    }

    public void setEndActionDate(Date EndActionDate) {
        this.EndActionDate = EndActionDate;
    }

    @Column(name = "PLANSUM", columnDefinition = "NUMERIC", precision = 15, scale = 4)
    //$NON-NLS-1$
    @DataItemName("Contract.ItemnPlan.PlanSum")
    public BigDecimal getPlanSum() {
        return this.PlanSum;
    }

    public void setPlanSum(BigDecimal PlanSum) {
        this.PlanSum = PlanSum;
    }

    @Column(name = "FACTSUM", columnDefinition = "NUMERIC", precision = 15, scale = 4)
    //$NON-NLS-1$
    @DataItemName("Contract.ItemnPlan.FactSum")
    public BigDecimal getFactSum() {
        return this.FactSum;
    }

    public void setFactSum(BigDecimal FactSum) {
        this.FactSum = FactSum;
    }

    @Column(name = "AVOID", columnDefinition = "SMALLINT")
    public boolean isAvoid() {
        return this.Avoid;
    }

    public void setAvoid(boolean Avoid) {
        this.Avoid = Avoid;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "DOCTYPE")
    //$NON-NLS-1$
    @DataItemName("Document.DocType")
    public DocType getDocType() {
        return this.DocType;
    }

    public void setDocType(DocType DocType) {
        this.DocType = DocType;
    }

    @Column(name = "DOCNUMBER", columnDefinition = "CHAR", length = 20)
    //$NON-NLS-1$
    @DataItemName("Document.DocNumber")
    public String getDocNumber() {
        return this.DocNumber;
    }

    public void setDocNumber(String DocNumber) {
        this.DocNumber = DocNumber;
    }

    @Column(name = "DOCDATE", columnDefinition = "TIMESTAMP")
    //$NON-NLS-1$
    @DataItemName("Document.DocDate")
    public Date getDocDate() {
        return this.DocDate;
    }

    public void setDocDate(Date DocDate) {
        this.DocDate = DocDate;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "DOC_ID")
    public DocHead getDocument() {
        return this.Document;
    }

    public void setDocument(DocHead Document) {
        this.Document = Document;
    }
}

