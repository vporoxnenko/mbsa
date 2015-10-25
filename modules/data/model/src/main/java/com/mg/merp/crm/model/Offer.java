package com.mg.merp.crm.model;

import com.mg.merp.core.model.SysClient;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.SEQUENCE;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import com.mg.framework.api.annotations.DataItemName;

/**
 * Offer generated by hbm2java
 */
@Entity
@Table(name = "CRM_OFFER")
public class Offer extends com.mg.merp.core.model.AbstractEntity implements java.io.Serializable {

    private int Id;

    private OfferStatus Status;

    private OfferReason FailReason;

    private OfferReason SuccessReason;

    private User Responsible;

    private Operation Operation;

    private SysClient SysClient;

    private OfferForecast Forecast;

    private Contact Contact;

    private Relation Relation;

    private OfferKind Kind;

    private String Code;

    private String Name;

    private Date OfferDate;

    private Date ValidUntil;

    private String SwotS;

    private String SwotW;

    private String SwotO;

    private String SwotT;

    private Set<LinkedDocument> LinkedDocs = new HashSet<LinkedDocument>(0);

    public Offer() {
    }

    public Offer(OfferStatus Status, OfferReason FailReason, OfferReason SuccessReason, User Responsible, Operation Operation, SysClient SysClient, OfferForecast Forecast, Contact Contact, Relation Relation, OfferKind Kind, String Code, String Name, Date OfferDate, Date ValidUntil, String SwotS, String SwotW, String SwotO, String SwotT, Set<LinkedDocument> LinkedDocs) {
        this.Status = Status;
        this.FailReason = FailReason;
        this.SuccessReason = SuccessReason;
        this.Responsible = Responsible;
        this.Operation = Operation;
        this.SysClient = SysClient;
        this.Forecast = Forecast;
        this.Contact = Contact;
        this.Relation = Relation;
        this.Kind = Kind;
        this.Code = Code;
        this.Name = Name;
        this.OfferDate = OfferDate;
        this.ValidUntil = ValidUntil;
        this.SwotS = SwotS;
        this.SwotW = SwotW;
        this.SwotO = SwotO;
        this.SwotT = SwotT;
        this.LinkedDocs = LinkedDocs;
    }

    @SequenceGenerator(name = "generator", sequenceName = "CRM_OFFER_ID_GEN")
    @Id
    @GeneratedValue(strategy = SEQUENCE, generator = "generator")
    @Column(name = "ID", unique = true, nullable = false, columnDefinition = "INTEGER")
    @DataItemName("ID")
    public int getId() {
        return this.Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "STATUS_ID")
    public OfferStatus getStatus() {
        return this.Status;
    }

    public void setStatus(OfferStatus Status) {
        this.Status = Status;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "FAIL_REASON_ID")
    @DataItemName("CRM.Offer.FailReason")
    public OfferReason getFailReason() {
        return this.FailReason;
    }

    public void setFailReason(OfferReason FailReason) {
        this.FailReason = FailReason;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "SUCCESS_REASON_ID")
    @DataItemName("CRM.Offer.SuccessReason")
    public OfferReason getSuccessReason() {
        return this.SuccessReason;
    }

    public void setSuccessReason(OfferReason SuccessReason) {
        this.SuccessReason = SuccessReason;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "RESPONSIBLE_ID")
    @DataItemName("CRM.Offer.Responsible")
    public User getResponsible() {
        return this.Responsible;
    }

    public void setResponsible(User Responsible) {
        this.Responsible = Responsible;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "OPERATION_ID")
    public Operation getOperation() {
        return this.Operation;
    }

    public void setOperation(Operation Operation) {
        this.Operation = Operation;
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
    @JoinColumn(name = "FORECAST_ID")
    public OfferForecast getForecast() {
        return this.Forecast;
    }

    public void setForecast(OfferForecast Forecast) {
        this.Forecast = Forecast;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CONTACT_ID")
    public Contact getContact() {
        return this.Contact;
    }

    public void setContact(Contact Contact) {
        this.Contact = Contact;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "RELATION_ID")
    public Relation getRelation() {
        return this.Relation;
    }

    public void setRelation(Relation Relation) {
        this.Relation = Relation;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "KIND_ID")
    public OfferKind getKind() {
        return this.Kind;
    }

    public void setKind(OfferKind Kind) {
        this.Kind = Kind;
    }

    @Column(name = "CODE", columnDefinition = "CHAR", length = 20)
    @DataItemName("CRM.Code")
    public String getCode() {
        return this.Code;
    }

    public void setCode(String Code) {
        this.Code = Code;
    }

    @Column(name = "NAME", columnDefinition = "VARCHAR", length = 256)
    @DataItemName("CRM.Name")
    public String getName() {
        return this.Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    @Column(name = "OFFER_DATE", columnDefinition = "TIMESTAMP")
    @DataItemName("CRM.Offer.OfferDate")
    public Date getOfferDate() {
        return this.OfferDate;
    }

    public void setOfferDate(Date OfferDate) {
        this.OfferDate = OfferDate;
    }

    @Column(name = "VALID_UNTIL", columnDefinition = "TIMESTAMP")
    @DataItemName("CRM.Offer.ValidUntil")
    public Date getValidUntil() {
        return this.ValidUntil;
    }

    public void setValidUntil(Date ValidUntil) {
        this.ValidUntil = ValidUntil;
    }

    @Column(name = "SWOT_S", columnDefinition = "VARCHAR", length = 1024)
    @DataItemName("CRM.Offer.SwotS")
    public String getSwotS() {
        return this.SwotS;
    }

    public void setSwotS(String SwotS) {
        this.SwotS = SwotS;
    }

    @Column(name = "SWOT_W", columnDefinition = "VARCHAR", length = 1024)
    @DataItemName("CRM.Offer.SwotW")
    public String getSwotW() {
        return this.SwotW;
    }

    public void setSwotW(String SwotW) {
        this.SwotW = SwotW;
    }

    @Column(name = "SWOT_O", columnDefinition = "VARCHAR", length = 1024)
    @DataItemName("CRM.Offer.SwotO")
    public String getSwotO() {
        return this.SwotO;
    }

    public void setSwotO(String SwotO) {
        this.SwotO = SwotO;
    }

    @Column(name = "SWOT_T", columnDefinition = "VARCHAR", length = 1024)
    @DataItemName("CRM.Offer.SwotT")
    public String getSwotT() {
        return this.SwotT;
    }

    public void setSwotT(String SwotT) {
        this.SwotT = SwotT;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "Offer")
    public Set<LinkedDocument> getLinkedDocs() {
        return this.LinkedDocs;
    }

    public void setLinkedDocs(Set<LinkedDocument> LinkedDocs) {
        this.LinkedDocs = LinkedDocs;
    }
}

