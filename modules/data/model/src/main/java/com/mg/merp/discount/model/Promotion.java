package com.mg.merp.discount.model;
// Generated Sep 28, 2015 11:47:52 PM by Hibernate Tools 3.6.0.Final


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

/**
 * Promotion generated by hbm2java
 */
@Entity
@Table(name="DIS_PROMOTION"
)
public class Promotion extends com.mg.merp.core.model.AbstractEntity implements java.io.Serializable {


     private Integer Id;
     private String Name;
     private String Code;
     private Date DateFrom;
     private Date DateTill;
     private Integer Priority;
     private PromotionType PromotionType;
     private Date DateApprove;
     private String Number;
     private boolean IsActive;
     private boolean IsApplyDiscountGroup;
     private boolean IsApplyDiscountOnDoc;
     private String Comment;
     private SysClient SysClient;
     private Set<PromotionLine> PromotionLines = new HashSet<PromotionLine>(0);

    public Promotion() {
    }

    public Promotion(String Name, String Code, Date DateFrom, Date DateTill, Integer Priority, PromotionType PromotionType, Date DateApprove, String Number, boolean IsActive, boolean IsApplyDiscountGroup, boolean IsApplyDiscountOnDoc, String Comment, SysClient SysClient, Set<PromotionLine> PromotionLines) {
       this.Name = Name;
       this.Code = Code;
       this.DateFrom = DateFrom;
       this.DateTill = DateTill;
       this.Priority = Priority;
       this.PromotionType = PromotionType;
       this.DateApprove = DateApprove;
       this.Number = Number;
       this.IsActive = IsActive;
       this.IsApplyDiscountGroup = IsApplyDiscountGroup;
       this.IsApplyDiscountOnDoc = IsApplyDiscountOnDoc;
       this.Comment = Comment;
       this.SysClient = SysClient;
       this.PromotionLines = PromotionLines;
    }
   
     @SequenceGenerator(name="generator", sequenceName="DIS_PROMOTION_ID_GEN")@Id @GeneratedValue(strategy=SEQUENCE, generator="generator")

    
    @Column(name="ID", unique=true, columnDefinition="INTEGER")
    public Integer getId() {
        return this.Id;
    }
    
    public void setId(Integer Id) {
        this.Id = Id;
    }

    
    @Column(name="NAME", columnDefinition="VARCHAR", length=80)
    public String getName() {
        return this.Name;
    }
    
    public void setName(String Name) {
        this.Name = Name;
    }

    
    @Column(name="CODE", columnDefinition="CHAR", length=20)
    public String getCode() {
        return this.Code;
    }
    
    public void setCode(String Code) {
        this.Code = Code;
    }

    
    @Column(name="DATE_FROM", columnDefinition="TIMESTAMP")
    public Date getDateFrom() {
        return this.DateFrom;
    }
    
    public void setDateFrom(Date DateFrom) {
        this.DateFrom = DateFrom;
    }

    
    @Column(name="DATE_TILL", columnDefinition="TIMESTAMP")
    public Date getDateTill() {
        return this.DateTill;
    }
    
    public void setDateTill(Date DateTill) {
        this.DateTill = DateTill;
    }

    
    @Column(name="PRIORITY", columnDefinition="INTEGER")
    public Integer getPriority() {
        return this.Priority;
    }
    
    public void setPriority(Integer Priority) {
        this.Priority = Priority;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="TYPE_ID")
    public PromotionType getPromotionType() {
        return this.PromotionType;
    }
    
    public void setPromotionType(PromotionType PromotionType) {
        this.PromotionType = PromotionType;
    }

    
    @Column(name="DATE_APPROVE", columnDefinition="TIMESTAMP")
    public Date getDateApprove() {
        return this.DateApprove;
    }
    
    public void setDateApprove(Date DateApprove) {
        this.DateApprove = DateApprove;
    }

    
    @Column(name="NUMBER", columnDefinition="CHAR", length=20)
    public String getNumber() {
        return this.Number;
    }
    
    public void setNumber(String Number) {
        this.Number = Number;
    }

    
    @Column(name="IS_ACTIVE", columnDefinition="SMALLINT")
    public boolean isIsActive() {
        return this.IsActive;
    }
    
    public void setIsActive(boolean IsActive) {
        this.IsActive = IsActive;
    }

    
    @Column(name="IS_APPLY_DISCOUNT_GROUP", columnDefinition="SMALLINT")
    public boolean isIsApplyDiscountGroup() {
        return this.IsApplyDiscountGroup;
    }
    
    public void setIsApplyDiscountGroup(boolean IsApplyDiscountGroup) {
        this.IsApplyDiscountGroup = IsApplyDiscountGroup;
    }

    
    @Column(name="IS_APPLY_DISCOUNT_ON_DOC", columnDefinition="SMALLINT")
    public boolean isIsApplyDiscountOnDoc() {
        return this.IsApplyDiscountOnDoc;
    }
    
    public void setIsApplyDiscountOnDoc(boolean IsApplyDiscountOnDoc) {
        this.IsApplyDiscountOnDoc = IsApplyDiscountOnDoc;
    }

    
    @Column(name="COMMENT", columnDefinition="VARCHAR", length=256)
    public String getComment() {
        return this.Comment;
    }
    
    public void setComment(String Comment) {
        this.Comment = Comment;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="CLIENT_ID")
    public SysClient getSysClient() {
        return this.SysClient;
    }
    
    public void setSysClient(SysClient SysClient) {
        this.SysClient = SysClient;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="unresolved")
    public Set<PromotionLine> getPromotionLines() {
        return this.PromotionLines;
    }
    
    public void setPromotionLines(Set<PromotionLine> PromotionLines) {
        this.PromotionLines = PromotionLines;
    }




}

