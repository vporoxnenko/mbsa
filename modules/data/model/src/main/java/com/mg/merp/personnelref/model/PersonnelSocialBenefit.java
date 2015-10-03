package com.mg.merp.personnelref.model;
// Generated Sep 28, 2015 11:47:52 PM by Hibernate Tools 3.6.0.Final


import com.mg.merp.core.model.SysClient;
import com.mg.merp.reference.model.OriginalDocument;
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

/**
 * PersonnelSocialBenefit generated by hbm2java
 */
@Entity
@Table(name="PREF_PERSONNEL_SOCIAL_BENEFIT"
)
public class PersonnelSocialBenefit extends com.mg.merp.core.model.AbstractEntity implements java.io.Serializable {


     private Integer Id;
     private Personnel Personnel;
     private SysClient SysClient;
     private OriginalDocument OriginalDocument;
     private String BenefitName;
     private String BenefitReason;

    public PersonnelSocialBenefit() {
    }

	
    public PersonnelSocialBenefit(Personnel Personnel, String BenefitName) {
        this.Personnel = Personnel;
        this.BenefitName = BenefitName;
    }
    public PersonnelSocialBenefit(Personnel Personnel, SysClient SysClient, OriginalDocument OriginalDocument, String BenefitName, String BenefitReason) {
       this.Personnel = Personnel;
       this.SysClient = SysClient;
       this.OriginalDocument = OriginalDocument;
       this.BenefitName = BenefitName;
       this.BenefitReason = BenefitReason;
    }
   
     @SequenceGenerator(name="generator", sequenceName="PREF_PERS_SOC_BENEFIT_ID_GEN")@Id @GeneratedValue(strategy=SEQUENCE, generator="generator")

    
    @Column(name="ID", unique=true, columnDefinition="INTEGER")
    public Integer getId() {
        return this.Id;
    }
    
    public void setId(Integer Id) {
        this.Id = Id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="PERSONNEL_ID", nullable=false)
    public Personnel getPersonnel() {
        return this.Personnel;
    }
    
    public void setPersonnel(Personnel Personnel) {
        this.Personnel = Personnel;
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
    @JoinColumn(name="ORIGINAL_DOCUMENT_ID")
    public OriginalDocument getOriginalDocument() {
        return this.OriginalDocument;
    }
    
    public void setOriginalDocument(OriginalDocument OriginalDocument) {
        this.OriginalDocument = OriginalDocument;
    }

    
    @Column(name="BENEFIT_NAME", nullable=false, columnDefinition="VARCHAR", length=80)
    public String getBenefitName() {
        return this.BenefitName;
    }
    
    public void setBenefitName(String BenefitName) {
        this.BenefitName = BenefitName;
    }

    
    @Column(name="BENEFIT_REASON", columnDefinition="VARCHAR", length=256)
    public String getBenefitReason() {
        return this.BenefitReason;
    }
    
    public void setBenefitReason(String BenefitReason) {
        this.BenefitReason = BenefitReason;
    }




}

