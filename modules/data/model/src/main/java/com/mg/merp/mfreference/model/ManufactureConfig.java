package com.mg.merp.mfreference.model;
// Generated Sep 28, 2015 11:47:52 PM by Hibernate Tools 3.6.0.Final


import com.mg.merp.document.model.DocHeadModel;
import com.mg.merp.reference.model.Catalog;
import com.mg.merp.reference.model.Currency;
import com.mg.merp.reference.model.CurrencyRateAuthority;
import com.mg.merp.reference.model.CurrencyRateType;
import com.mg.merp.reference.model.Measure;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * ManufactureConfig generated by hbm2java
 */
@Entity
@Table(name="MF_CONFIG"
)
public class ManufactureConfig extends com.mg.merp.core.model.AbstractEntity implements java.io.Serializable {


     private int SysClientId;
     private Measure TickUM;
     private Measure MainTimeUM;
     private Currency BaseCurrency;
     private Currency NatCurrency;
     private CurrencyRateAuthority CurrencyRateAuthority;
     private CurrencyRateType CurrencyRateType;
     private Integer CurrencyPrec;
     private DocHeadModel InputMaterialModelBf;
     private DocHeadModel InputLaborModelBf;
     private DocHeadModel InputMachineModelBf;
     private Catalog LaborTime;
     private Catalog MachineTime;
     private Catalog MaterialOverhead;
     private Catalog LaborOverhead;
     private Catalog MachineOverhead;
     private DocHeadModel PurchaseOrderModelMrpRec;
     private DocHeadModel ScrapMaterialModel;
     private DocHeadModel ScrapLaborModel;
     private DocHeadModel ScrapMachineModel;
     private DocHeadModel VarianceDocumentModel;

    public ManufactureConfig() {
    }

	
    public ManufactureConfig(int SysClientId) {
        this.SysClientId = SysClientId;
    }
    public ManufactureConfig(int SysClientId, Measure TickUM, Measure MainTimeUM, Currency BaseCurrency, Currency NatCurrency, CurrencyRateAuthority CurrencyRateAuthority, CurrencyRateType CurrencyRateType, Integer CurrencyPrec, DocHeadModel InputMaterialModelBf, DocHeadModel InputLaborModelBf, DocHeadModel InputMachineModelBf, Catalog LaborTime, Catalog MachineTime, Catalog MaterialOverhead, Catalog LaborOverhead, Catalog MachineOverhead, DocHeadModel PurchaseOrderModelMrpRec, DocHeadModel ScrapMaterialModel, DocHeadModel ScrapLaborModel, DocHeadModel ScrapMachineModel, DocHeadModel VarianceDocumentModel) {
       this.SysClientId = SysClientId;
       this.TickUM = TickUM;
       this.MainTimeUM = MainTimeUM;
       this.BaseCurrency = BaseCurrency;
       this.NatCurrency = NatCurrency;
       this.CurrencyRateAuthority = CurrencyRateAuthority;
       this.CurrencyRateType = CurrencyRateType;
       this.CurrencyPrec = CurrencyPrec;
       this.InputMaterialModelBf = InputMaterialModelBf;
       this.InputLaborModelBf = InputLaborModelBf;
       this.InputMachineModelBf = InputMachineModelBf;
       this.LaborTime = LaborTime;
       this.MachineTime = MachineTime;
       this.MaterialOverhead = MaterialOverhead;
       this.LaborOverhead = LaborOverhead;
       this.MachineOverhead = MachineOverhead;
       this.PurchaseOrderModelMrpRec = PurchaseOrderModelMrpRec;
       this.ScrapMaterialModel = ScrapMaterialModel;
       this.ScrapLaborModel = ScrapLaborModel;
       this.ScrapMachineModel = ScrapMachineModel;
       this.VarianceDocumentModel = VarianceDocumentModel;
    }
   
     @Id 

    
    @Column(name="CLIENT_ID", unique=true, columnDefinition="INTEGER")
    public int getSysClientId() {
        return this.SysClientId;
    }
    
    public void setSysClientId(int SysClientId) {
        this.SysClientId = SysClientId;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="TICK_UM")
    public Measure getTickUM() {
        return this.TickUM;
    }
    
    public void setTickUM(Measure TickUM) {
        this.TickUM = TickUM;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="MAIN_TIME_UM")
    public Measure getMainTimeUM() {
        return this.MainTimeUM;
    }
    
    public void setMainTimeUM(Measure MainTimeUM) {
        this.MainTimeUM = MainTimeUM;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="BASE_CURRENCY", columnDefinition="CHAR")
    public Currency getBaseCurrency() {
        return this.BaseCurrency;
    }
    
    public void setBaseCurrency(Currency BaseCurrency) {
        this.BaseCurrency = BaseCurrency;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="NAT_CURRENCY", columnDefinition="CHAR")
    public Currency getNatCurrency() {
        return this.NatCurrency;
    }
    
    public void setNatCurrency(Currency NatCurrency) {
        this.NatCurrency = NatCurrency;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="CURRENCY_RATE_AUTHORITY", columnDefinition="INTEGER")
    public CurrencyRateAuthority getCurrencyRateAuthority() {
        return this.CurrencyRateAuthority;
    }
    
    public void setCurrencyRateAuthority(CurrencyRateAuthority CurrencyRateAuthority) {
        this.CurrencyRateAuthority = CurrencyRateAuthority;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="CURRENCY_RATE_TYPE", columnDefinition="INTEGER")
    public CurrencyRateType getCurrencyRateType() {
        return this.CurrencyRateType;
    }
    
    public void setCurrencyRateType(CurrencyRateType CurrencyRateType) {
        this.CurrencyRateType = CurrencyRateType;
    }

    
    @Column(name="CURRENCY_PREC", columnDefinition="INTEGER")
    public Integer getCurrencyPrec() {
        return this.CurrencyPrec;
    }
    
    public void setCurrencyPrec(Integer CurrencyPrec) {
        this.CurrencyPrec = CurrencyPrec;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="INPUT_MATERIAL_MODEL_BF", columnDefinition="INTEGER")
    public DocHeadModel getInputMaterialModelBf() {
        return this.InputMaterialModelBf;
    }
    
    public void setInputMaterialModelBf(DocHeadModel InputMaterialModelBf) {
        this.InputMaterialModelBf = InputMaterialModelBf;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="INPUT_LABOR_MODEL_BF", columnDefinition="INTEGER")
    public DocHeadModel getInputLaborModelBf() {
        return this.InputLaborModelBf;
    }
    
    public void setInputLaborModelBf(DocHeadModel InputLaborModelBf) {
        this.InputLaborModelBf = InputLaborModelBf;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="INPUT_MACHINE_MODEL_BF", columnDefinition="INTEGER")
    public DocHeadModel getInputMachineModelBf() {
        return this.InputMachineModelBf;
    }
    
    public void setInputMachineModelBf(DocHeadModel InputMachineModelBf) {
        this.InputMachineModelBf = InputMachineModelBf;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="LABOR_TIME", columnDefinition="INTEGER")
    public Catalog getLaborTime() {
        return this.LaborTime;
    }
    
    public void setLaborTime(Catalog LaborTime) {
        this.LaborTime = LaborTime;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="MACHINE_TIME", columnDefinition="INTEGER")
    public Catalog getMachineTime() {
        return this.MachineTime;
    }
    
    public void setMachineTime(Catalog MachineTime) {
        this.MachineTime = MachineTime;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="MATERIAL_OVERHEAD", columnDefinition="INTEGER")
    public Catalog getMaterialOverhead() {
        return this.MaterialOverhead;
    }
    
    public void setMaterialOverhead(Catalog MaterialOverhead) {
        this.MaterialOverhead = MaterialOverhead;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="LABOR_OVERHEAD", columnDefinition="INTEGER")
    public Catalog getLaborOverhead() {
        return this.LaborOverhead;
    }
    
    public void setLaborOverhead(Catalog LaborOverhead) {
        this.LaborOverhead = LaborOverhead;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="MACHINE_OVERHEAD", columnDefinition="INTEGER")
    public Catalog getMachineOverhead() {
        return this.MachineOverhead;
    }
    
    public void setMachineOverhead(Catalog MachineOverhead) {
        this.MachineOverhead = MachineOverhead;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="PURCHASE_ORDER_MODEL_MRP_REC", columnDefinition="INTEGER")
    public DocHeadModel getPurchaseOrderModelMrpRec() {
        return this.PurchaseOrderModelMrpRec;
    }
    
    public void setPurchaseOrderModelMrpRec(DocHeadModel PurchaseOrderModelMrpRec) {
        this.PurchaseOrderModelMrpRec = PurchaseOrderModelMrpRec;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="SCRAP_MATERIAL_MODEL", columnDefinition="INTEGER")
    public DocHeadModel getScrapMaterialModel() {
        return this.ScrapMaterialModel;
    }
    
    public void setScrapMaterialModel(DocHeadModel ScrapMaterialModel) {
        this.ScrapMaterialModel = ScrapMaterialModel;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="SCRAP_LABOR_MODEL", columnDefinition="INTEGER")
    public DocHeadModel getScrapLaborModel() {
        return this.ScrapLaborModel;
    }
    
    public void setScrapLaborModel(DocHeadModel ScrapLaborModel) {
        this.ScrapLaborModel = ScrapLaborModel;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="SCRAP_MACHINE_MODEL", columnDefinition="INTEGER")
    public DocHeadModel getScrapMachineModel() {
        return this.ScrapMachineModel;
    }
    
    public void setScrapMachineModel(DocHeadModel ScrapMachineModel) {
        this.ScrapMachineModel = ScrapMachineModel;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="VARIANCE_DOCUMENT_MODEL", columnDefinition="INTEGER")
    public DocHeadModel getVarianceDocumentModel() {
        return this.VarianceDocumentModel;
    }
    
    public void setVarianceDocumentModel(DocHeadModel VarianceDocumentModel) {
        this.VarianceDocumentModel = VarianceDocumentModel;
    }




}

