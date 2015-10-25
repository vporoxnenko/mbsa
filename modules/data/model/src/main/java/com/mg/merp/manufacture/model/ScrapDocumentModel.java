package com.mg.merp.manufacture.model;

import com.mg.merp.core.model.Folder;
import com.mg.merp.core.model.SysClient;
import com.mg.merp.core.model.SysCompany;
import com.mg.merp.document.model.DocHead;
import com.mg.merp.document.model.DocSection;
import com.mg.merp.document.model.DocType;
import com.mg.merp.mfreference.model.Crew;
import com.mg.merp.mfreference.model.WorkCenter;
import com.mg.merp.qualitycontrol.model.ScrapReason;
import com.mg.merp.qualitycontrol.model.ScrapType;
import com.mg.merp.reference.model.CalcTaxesKind;
import com.mg.merp.reference.model.Contractor;
import com.mg.merp.reference.model.Currency;
import com.mg.merp.reference.model.CurrencyRateAuthority;
import com.mg.merp.reference.model.CurrencyRateType;
import com.mg.merp.reference.model.PriceListHead;
import com.mg.merp.reference.model.PriceType;
import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import com.mg.framework.api.annotations.DataItemName;

/**
 * ScrapDocumentModel generated by hbm2java
 */
@Entity
@Table(name = "MF_SCRAP_DOC_HEAD_MODEL")
public class ScrapDocumentModel extends com.mg.merp.document.model.DocHeadModel implements java.io.Serializable {

    private Job DetectJob;

    private Contractor CauseContractor;

    private ScrapType ScrapType;

    private ScrapReason ScrapReason;

    private Contractor CauseEmployee;

    private Crew CauseCrew;

    private Job CauseJob;

    private WorkCenter DetectWC;

    private Crew DetectCrew;

    private JobRoute DetectOper;

    private Contractor DetectEmployee;

    private JobRoute CauseOper;

    private Contractor DetectContractor;

    private WorkCenter CauseWC;

    public ScrapDocumentModel() {
    }

    public ScrapDocumentModel(DocSection DocSection, boolean ManualDocNumber) {
        super(DocSection, ManualDocNumber);
    }

    public ScrapDocumentModel(SysCompany SysCompany, Contractor Through, Folder ModelDestFolder, Contractor From, Contractor To, Contractor DstMol, CurrencyRateAuthority CurrencyRateAuthority, Contractor SrcMol, Folder Folder, SysClient SysClient, Contractor DstStock, CurrencyRateType CurrencyRateType, Contractor SrcStock, DocSection DocSection, String ModelName, DocType DocType, String DocNumber, Date DocDate, Currency Currency, BigDecimal CurCource, BigDecimal SumCur, BigDecimal SumNat, DocHead BaseDocument, DocType BaseDocType, String BaseDocNumber, Date BaseDocDate, DocHead Contract, DocType ContractType, String ContractNumber, Date ContractDate, BigDecimal Weight, BigDecimal Volume, PriceListHead PriceList, PriceType PriceType, CalcTaxesKind CalcTaxesKind, Folder DiscountFolder, boolean ManualDocNumber, String Description, Job DetectJob, Contractor CauseContractor, ScrapType ScrapType, ScrapReason ScrapReason, Contractor CauseEmployee, Crew CauseCrew, Job CauseJob, WorkCenter DetectWC, Crew DetectCrew, JobRoute DetectOper, Contractor DetectEmployee, JobRoute CauseOper, Contractor DetectContractor, WorkCenter CauseWC) {
        super(SysCompany, Through, ModelDestFolder, From, To, DstMol, CurrencyRateAuthority, SrcMol, Folder, SysClient, DstStock, CurrencyRateType, SrcStock, DocSection, ModelName, DocType, DocNumber, DocDate, Currency, CurCource, SumCur, SumNat, BaseDocument, BaseDocType, BaseDocNumber, BaseDocDate, Contract, ContractType, ContractNumber, ContractDate, Weight, Volume, PriceList, PriceType, CalcTaxesKind, DiscountFolder, ManualDocNumber, Description);
        this.DetectJob = DetectJob;
        this.CauseContractor = CauseContractor;
        this.ScrapType = ScrapType;
        this.ScrapReason = ScrapReason;
        this.CauseEmployee = CauseEmployee;
        this.CauseCrew = CauseCrew;
        this.CauseJob = CauseJob;
        this.DetectWC = DetectWC;
        this.DetectCrew = DetectCrew;
        this.DetectOper = DetectOper;
        this.DetectEmployee = DetectEmployee;
        this.CauseOper = CauseOper;
        this.DetectContractor = DetectContractor;
        this.CauseWC = CauseWC;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "DETECT_JOB_ID")
    @DataItemName("Manufacture.ScrapDocumentModel.DetectJob")
    public Job getDetectJob() {
        return this.DetectJob;
    }

    public void setDetectJob(Job DetectJob) {
        this.DetectJob = DetectJob;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CAUSE_CONTRACTOR_ID")
    @DataItemName("Manufacture.ScrapDocumentModel.CauseContractor")
    public Contractor getCauseContractor() {
        return this.CauseContractor;
    }

    public void setCauseContractor(Contractor CauseContractor) {
        this.CauseContractor = CauseContractor;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "SCRAP_TYPE_ID")
    @DataItemName("Manufacture.ScrapDocumentModel.ScrapType")
    public ScrapType getScrapType() {
        return this.ScrapType;
    }

    public void setScrapType(ScrapType ScrapType) {
        this.ScrapType = ScrapType;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "SCRAP_REASON_ID")
    @DataItemName("Manufacture.ScrapDocumentModel.ScrapReason")
    public ScrapReason getScrapReason() {
        return this.ScrapReason;
    }

    public void setScrapReason(ScrapReason ScrapReason) {
        this.ScrapReason = ScrapReason;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CAUSE_EMPLOYEE_ID")
    @DataItemName("Manufacture.ScrapDocumentModel.CauseEmployee")
    public Contractor getCauseEmployee() {
        return this.CauseEmployee;
    }

    public void setCauseEmployee(Contractor CauseEmployee) {
        this.CauseEmployee = CauseEmployee;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CAUSE_CREW_ID")
    @DataItemName("Manufacture.ScrapDocumentModel.CauseCrew")
    public Crew getCauseCrew() {
        return this.CauseCrew;
    }

    public void setCauseCrew(Crew CauseCrew) {
        this.CauseCrew = CauseCrew;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CAUSE_JOB_ID")
    @DataItemName("Manufacture.ScrapDocumentModel.CauseJob")
    public Job getCauseJob() {
        return this.CauseJob;
    }

    public void setCauseJob(Job CauseJob) {
        this.CauseJob = CauseJob;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "DETECT_WC_ID")
    @DataItemName("Manufacture.ScrapDocumentModel.DetectWC")
    public WorkCenter getDetectWC() {
        return this.DetectWC;
    }

    public void setDetectWC(WorkCenter DetectWC) {
        this.DetectWC = DetectWC;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "DETECT_CREW_ID")
    @DataItemName("Manufacture.ScrapDocumentModel.DetectCrew")
    public Crew getDetectCrew() {
        return this.DetectCrew;
    }

    public void setDetectCrew(Crew DetectCrew) {
        this.DetectCrew = DetectCrew;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "DETECT_OPER_ID")
    @DataItemName("Manufacture.ScrapDocumentModel.DetectOper")
    public JobRoute getDetectOper() {
        return this.DetectOper;
    }

    public void setDetectOper(JobRoute DetectOper) {
        this.DetectOper = DetectOper;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "DETECT_EMPLOYEE_ID")
    @DataItemName("Manufacture.ScrapDocumentModel.DetectEmployee")
    public Contractor getDetectEmployee() {
        return this.DetectEmployee;
    }

    public void setDetectEmployee(Contractor DetectEmployee) {
        this.DetectEmployee = DetectEmployee;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CAUSE_OPER_ID")
    @DataItemName("Manufacture.ScrapDocumentModel.CauseOper")
    public JobRoute getCauseOper() {
        return this.CauseOper;
    }

    public void setCauseOper(JobRoute CauseOper) {
        this.CauseOper = CauseOper;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "DETECT_CONTRACTOR_ID")
    @DataItemName("Manufacture.ScrapDocumentModel.DetectContractor")
    public Contractor getDetectContractor() {
        return this.DetectContractor;
    }

    public void setDetectContractor(Contractor DetectContractor) {
        this.DetectContractor = DetectContractor;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CAUSE_WC_ID")
    @DataItemName("Manufacture.ScrapDocumentModel.CauseWC")
    public WorkCenter getCauseWC() {
        return this.CauseWC;
    }

    public void setCauseWC(WorkCenter CauseWC) {
        this.CauseWC = CauseWC;
    }
}

