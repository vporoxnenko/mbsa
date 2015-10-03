package com.mg.merp.paymentcontrol.model;
// Generated Sep 28, 2015 11:47:52 PM by Hibernate Tools 3.6.0.Final


import com.mg.framework.support.orm.EnumUserType;
import com.mg.merp.core.model.Folder;
import com.mg.merp.core.model.SysClient;
import com.mg.merp.document.model.DocHead;
import com.mg.merp.document.model.DocType;
import com.mg.merp.reference.model.BankAccount;
import com.mg.merp.reference.model.Contractor;
import com.mg.merp.reference.model.Currency;
import com.mg.merp.reference.model.CurrencyRateAuthority;
import com.mg.merp.reference.model.CurrencyRateType;
import java.math.BigDecimal;
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

/**
 * Liability generated by hbm2java
 */
@Entity
@Table(name="PMC_LIABILITY"
)
public class Liability extends com.mg.merp.core.model.AbstractEntity implements java.io.Serializable {


     private Integer Id;
     private Contractor From;
     private BankAccount FromBankAcc;
     private CurrencyRateAuthority CurRateAuthority;
     private DocHead DocHead;
     private Folder PrefResourceFolder;
     private Folder Folder;
     private DocType DocType;
     private DocHead Contract;
     private Folder DestFolder;
     private DocType ContractType;
     private Contractor To;
     private DocHead BaseDoc;
     private VersionStatus VerStatus;
     private BankAccount ToBankAcc;
     private SysClient SysClient;
     private DocType BaseDocType;
     private CurrencyRateType CurRateType;
     private PmcResource PrefResource;
     private Version Version;
     private boolean IsShared;
     private Integer Priority;
     private boolean Receivable;
     private String Num;
     private Date RegDate;
     private Date DateToExecute;
     private BigDecimal SumCur;
     private Currency CurCode;
     private Integer PaymentDelay;
     private String DocNumber;
     private Date DocDate;
     private String BaseDocNumber;
     private Date BaseDocDate;
     private String ContractNumber;
     private Date ContractDate;
     private boolean PrefOnly;
     private String Comments;
     private Short TransferKind;
     private boolean IsModel;
     private String ModelName;
     private EnumUserType FromSource;
     private EnumUserType ToSource;
     private Set<Execution> Executions = new HashSet<Execution>(0);

    public Liability() {
    }

    public Liability(Contractor From, BankAccount FromBankAcc, CurrencyRateAuthority CurRateAuthority, DocHead DocHead, Folder PrefResourceFolder, Folder Folder, DocType DocType, DocHead Contract, Folder DestFolder, DocType ContractType, Contractor To, DocHead BaseDoc, VersionStatus VerStatus, BankAccount ToBankAcc, SysClient SysClient, DocType BaseDocType, CurrencyRateType CurRateType, PmcResource PrefResource, Version Version, boolean IsShared, Integer Priority, boolean Receivable, String Num, Date RegDate, Date DateToExecute, BigDecimal SumCur, Currency CurCode, Integer PaymentDelay, String DocNumber, Date DocDate, String BaseDocNumber, Date BaseDocDate, String ContractNumber, Date ContractDate, boolean PrefOnly, String Comments, Short TransferKind, boolean IsModel, String ModelName, EnumUserType FromSource, EnumUserType ToSource, Set<Execution> Executions) {
       this.From = From;
       this.FromBankAcc = FromBankAcc;
       this.CurRateAuthority = CurRateAuthority;
       this.DocHead = DocHead;
       this.PrefResourceFolder = PrefResourceFolder;
       this.Folder = Folder;
       this.DocType = DocType;
       this.Contract = Contract;
       this.DestFolder = DestFolder;
       this.ContractType = ContractType;
       this.To = To;
       this.BaseDoc = BaseDoc;
       this.VerStatus = VerStatus;
       this.ToBankAcc = ToBankAcc;
       this.SysClient = SysClient;
       this.BaseDocType = BaseDocType;
       this.CurRateType = CurRateType;
       this.PrefResource = PrefResource;
       this.Version = Version;
       this.IsShared = IsShared;
       this.Priority = Priority;
       this.Receivable = Receivable;
       this.Num = Num;
       this.RegDate = RegDate;
       this.DateToExecute = DateToExecute;
       this.SumCur = SumCur;
       this.CurCode = CurCode;
       this.PaymentDelay = PaymentDelay;
       this.DocNumber = DocNumber;
       this.DocDate = DocDate;
       this.BaseDocNumber = BaseDocNumber;
       this.BaseDocDate = BaseDocDate;
       this.ContractNumber = ContractNumber;
       this.ContractDate = ContractDate;
       this.PrefOnly = PrefOnly;
       this.Comments = Comments;
       this.TransferKind = TransferKind;
       this.IsModel = IsModel;
       this.ModelName = ModelName;
       this.FromSource = FromSource;
       this.ToSource = ToSource;
       this.Executions = Executions;
    }
   
     @SequenceGenerator(name="generator", sequenceName="PMC_LIABILITY_ID_GEN")@Id @GeneratedValue(strategy=SEQUENCE, generator="generator")

    
    @Column(name="ID", unique=true, columnDefinition="INTEGER")
    public Integer getId() {
        return this.Id;
    }
    
    public void setId(Integer Id) {
        this.Id = Id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="FROM_ID")
    public Contractor getFrom() {
        return this.From;
    }
    
    public void setFrom(Contractor From) {
        this.From = From;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="FROMBANKACC_ID")
    public BankAccount getFromBankAcc() {
        return this.FromBankAcc;
    }
    
    public void setFromBankAcc(BankAccount FromBankAcc) {
        this.FromBankAcc = FromBankAcc;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="CURRATEAUTHORITY_ID")
    public CurrencyRateAuthority getCurRateAuthority() {
        return this.CurRateAuthority;
    }
    
    public void setCurRateAuthority(CurrencyRateAuthority CurRateAuthority) {
        this.CurRateAuthority = CurRateAuthority;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="DOC_ID")
    public DocHead getDocHead() {
        return this.DocHead;
    }
    
    public void setDocHead(DocHead DocHead) {
        this.DocHead = DocHead;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="PREFRESOURCEFOLDER_ID")
    public Folder getPrefResourceFolder() {
        return this.PrefResourceFolder;
    }
    
    public void setPrefResourceFolder(Folder PrefResourceFolder) {
        this.PrefResourceFolder = PrefResourceFolder;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="FOLDER_ID")
    public Folder getFolder() {
        return this.Folder;
    }
    
    public void setFolder(Folder Folder) {
        this.Folder = Folder;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="DOCTYPE")
    public DocType getDocType() {
        return this.DocType;
    }
    
    public void setDocType(DocType DocType) {
        this.DocType = DocType;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="CONTRACT_ID")
    public DocHead getContract() {
        return this.Contract;
    }
    
    public void setContract(DocHead Contract) {
        this.Contract = Contract;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="DESTFOLDER_ID")
    public Folder getDestFolder() {
        return this.DestFolder;
    }
    
    public void setDestFolder(Folder DestFolder) {
        this.DestFolder = DestFolder;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="CONTRACTTYPE")
    public DocType getContractType() {
        return this.ContractType;
    }
    
    public void setContractType(DocType ContractType) {
        this.ContractType = ContractType;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="TO_ID")
    public Contractor getTo() {
        return this.To;
    }
    
    public void setTo(Contractor To) {
        this.To = To;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="BASEDOC_ID")
    public DocHead getBaseDoc() {
        return this.BaseDoc;
    }
    
    public void setBaseDoc(DocHead BaseDoc) {
        this.BaseDoc = BaseDoc;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="VERSTATUS_ID")
    public VersionStatus getVerStatus() {
        return this.VerStatus;
    }
    
    public void setVerStatus(VersionStatus VerStatus) {
        this.VerStatus = VerStatus;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="TOBANKACC_ID")
    public BankAccount getToBankAcc() {
        return this.ToBankAcc;
    }
    
    public void setToBankAcc(BankAccount ToBankAcc) {
        this.ToBankAcc = ToBankAcc;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="CLIENT_ID")
    public SysClient getSysClient() {
        return this.SysClient;
    }
    
    public void setSysClient(SysClient SysClient) {
        this.SysClient = SysClient;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="BASEDOCTYPE")
    public DocType getBaseDocType() {
        return this.BaseDocType;
    }
    
    public void setBaseDocType(DocType BaseDocType) {
        this.BaseDocType = BaseDocType;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="CURRATETYPE_ID")
    public CurrencyRateType getCurRateType() {
        return this.CurRateType;
    }
    
    public void setCurRateType(CurrencyRateType CurRateType) {
        this.CurRateType = CurRateType;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="PREFRESOURCE_ID")
    public PmcResource getPrefResource() {
        return this.PrefResource;
    }
    
    public void setPrefResource(PmcResource PrefResource) {
        this.PrefResource = PrefResource;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="VERSION_ID")
    public Version getVersion() {
        return this.Version;
    }
    
    public void setVersion(Version Version) {
        this.Version = Version;
    }

    
    @Column(name="IS_SHARED", columnDefinition="SMALLINT")
    public boolean isIsShared() {
        return this.IsShared;
    }
    
    public void setIsShared(boolean IsShared) {
        this.IsShared = IsShared;
    }

    
    @Column(name="PRIORITY", columnDefinition="INTEGER")
    public Integer getPriority() {
        return this.Priority;
    }
    
    public void setPriority(Integer Priority) {
        this.Priority = Priority;
    }

    
    @Column(name="RECEIVABLE", columnDefinition="SMALLINT")
    public boolean isReceivable() {
        return this.Receivable;
    }
    
    public void setReceivable(boolean Receivable) {
        this.Receivable = Receivable;
    }

    
    @Column(name="NUM", columnDefinition="VARCHAR", length=20)
    public String getNum() {
        return this.Num;
    }
    
    public void setNum(String Num) {
        this.Num = Num;
    }

    
    @Column(name="REGDATE", columnDefinition="TIMESTAMP")
    public Date getRegDate() {
        return this.RegDate;
    }
    
    public void setRegDate(Date RegDate) {
        this.RegDate = RegDate;
    }

    
    @Column(name="DATETOEXECUTE", columnDefinition="TIMESTAMP")
    public Date getDateToExecute() {
        return this.DateToExecute;
    }
    
    public void setDateToExecute(Date DateToExecute) {
        this.DateToExecute = DateToExecute;
    }

    
    @Column(name="SUMCUR", columnDefinition="NUMERIC", precision=15, scale=4)
    public BigDecimal getSumCur() {
        return this.SumCur;
    }
    
    public void setSumCur(BigDecimal SumCur) {
        this.SumCur = SumCur;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="CURCODE")
    public Currency getCurCode() {
        return this.CurCode;
    }
    
    public void setCurCode(Currency CurCode) {
        this.CurCode = CurCode;
    }

    
    @Column(name="PAYMENTDELAY", columnDefinition="INTEGER")
    public Integer getPaymentDelay() {
        return this.PaymentDelay;
    }
    
    public void setPaymentDelay(Integer PaymentDelay) {
        this.PaymentDelay = PaymentDelay;
    }

    
    @Column(name="DOCNUMBER", columnDefinition="CHAR", length=20)
    public String getDocNumber() {
        return this.DocNumber;
    }
    
    public void setDocNumber(String DocNumber) {
        this.DocNumber = DocNumber;
    }

    
    @Column(name="DOCDATE", columnDefinition="TIMESTAMP")
    public Date getDocDate() {
        return this.DocDate;
    }
    
    public void setDocDate(Date DocDate) {
        this.DocDate = DocDate;
    }

    
    @Column(name="BASEDOCNUMBER", columnDefinition="CHAR", length=20)
    public String getBaseDocNumber() {
        return this.BaseDocNumber;
    }
    
    public void setBaseDocNumber(String BaseDocNumber) {
        this.BaseDocNumber = BaseDocNumber;
    }

    
    @Column(name="BASEDOCDATE", columnDefinition="TIMESTAMP")
    public Date getBaseDocDate() {
        return this.BaseDocDate;
    }
    
    public void setBaseDocDate(Date BaseDocDate) {
        this.BaseDocDate = BaseDocDate;
    }

    
    @Column(name="CONTRACTNUMBER", columnDefinition="CHAR", length=20)
    public String getContractNumber() {
        return this.ContractNumber;
    }
    
    public void setContractNumber(String ContractNumber) {
        this.ContractNumber = ContractNumber;
    }

    
    @Column(name="CONTRACTDATE", columnDefinition="TIMESTAMP")
    public Date getContractDate() {
        return this.ContractDate;
    }
    
    public void setContractDate(Date ContractDate) {
        this.ContractDate = ContractDate;
    }

    
    @Column(name="PREFONLY", columnDefinition="SMALLINT")
    public boolean isPrefOnly() {
        return this.PrefOnly;
    }
    
    public void setPrefOnly(boolean PrefOnly) {
        this.PrefOnly = PrefOnly;
    }

    
    @Column(name="COMMENTS", columnDefinition="VARCHAR", length=256)
    public String getComments() {
        return this.Comments;
    }
    
    public void setComments(String Comments) {
        this.Comments = Comments;
    }

    
    @Column(name="TRANSFERKIND", columnDefinition="SMALLINT")
    public Short getTransferKind() {
        return this.TransferKind;
    }
    
    public void setTransferKind(Short TransferKind) {
        this.TransferKind = TransferKind;
    }

    
    @Column(name="IS_MODEL", columnDefinition="SMALLINT")
    public boolean isIsModel() {
        return this.IsModel;
    }
    
    public void setIsModel(boolean IsModel) {
        this.IsModel = IsModel;
    }

    
    @Column(name="MODELNAME", columnDefinition="VARCHAR", length=80)
    public String getModelName() {
        return this.ModelName;
    }
    
    public void setModelName(String ModelName) {
        this.ModelName = ModelName;
    }

    
    @Column(name="FROMSOURCE", columnDefinition="SMALLINT")
    public EnumUserType getFromSource() {
        return this.FromSource;
    }
    
    public void setFromSource(EnumUserType FromSource) {
        this.FromSource = FromSource;
    }

    
    @Column(name="TOSOURCE", columnDefinition="SMALLINT")
    public EnumUserType getToSource() {
        return this.ToSource;
    }
    
    public void setToSource(EnumUserType ToSource) {
        this.ToSource = ToSource;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="Liability")
    public Set<Execution> getExecutions() {
        return this.Executions;
    }
    
    public void setExecutions(Set<Execution> Executions) {
        this.Executions = Executions;
    }




}

