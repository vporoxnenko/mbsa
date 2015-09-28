package com.mg.merp.reference.model;
// Generated Sep 28, 2015 11:36:59 PM by Hibernate Tools 3.6.0.Final


import com.mg.merp.core.model.SysClient;
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
 * Country generated by hbm2java
 */
@Entity
@Table(name="REF_COUNTRY"
)
public class Country extends com.mg.merp.core.model.AbstractEntity implements java.io.Serializable {


     private int Id;
     private SysClient SysClient;
     private String CCode;
     private String CName;
     private String UniversalCode;
     private String UniversalAbbr;
     private String UniversalNumber;
     private String Capital;
     private String PhoneCode;
     private String FullName;
     private String AddressRule;
     private String AddressDlm;

    public Country() {
    }

	
    public Country(String CCode, String CName) {
        this.CCode = CCode;
        this.CName = CName;
    }
    public Country(SysClient SysClient, String CCode, String CName, String UniversalCode, String UniversalAbbr, String UniversalNumber, String Capital, String PhoneCode, String FullName, String AddressRule, String AddressDlm) {
       this.SysClient = SysClient;
       this.CCode = CCode;
       this.CName = CName;
       this.UniversalCode = UniversalCode;
       this.UniversalAbbr = UniversalAbbr;
       this.UniversalNumber = UniversalNumber;
       this.Capital = Capital;
       this.PhoneCode = PhoneCode;
       this.FullName = FullName;
       this.AddressRule = AddressRule;
       this.AddressDlm = AddressDlm;
    }
   
     @SequenceGenerator(name="generator", sequenceName="REF_COUNTRY_ID_GEN")@Id @GeneratedValue(strategy=SEQUENCE, generator="generator")

    
    @Column(name="ID", unique=true, nullable=false, columnDefinition="INTEGER")
    public int getId() {
        return this.Id;
    }
    
    public void setId(int Id) {
        this.Id = Id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="CLIENT_ID")
    public SysClient getSysClient() {
        return this.SysClient;
    }
    
    public void setSysClient(SysClient SysClient) {
        this.SysClient = SysClient;
    }

    
    @Column(name="CCODE", unique=true, nullable=false, columnDefinition="CHAR", length=5)
    public String getCCode() {
        return this.CCode;
    }
    
    public void setCCode(String CCode) {
        this.CCode = CCode;
    }

    
    @Column(name="CNAME", nullable=false, columnDefinition="VARCHAR", length=80)
    public String getCName() {
        return this.CName;
    }
    
    public void setCName(String CName) {
        this.CName = CName;
    }

    
    @Column(name="UNIVERSAL_CODE", columnDefinition="CHAR", length=2)
    public String getUniversalCode() {
        return this.UniversalCode;
    }
    
    public void setUniversalCode(String UniversalCode) {
        this.UniversalCode = UniversalCode;
    }

    
    @Column(name="UNIVERSAL_ABBR", columnDefinition="CHAR", length=3)
    public String getUniversalAbbr() {
        return this.UniversalAbbr;
    }
    
    public void setUniversalAbbr(String UniversalAbbr) {
        this.UniversalAbbr = UniversalAbbr;
    }

    
    @Column(name="UNIVERSAL_NUMBER", columnDefinition="CHAR", length=3)
    public String getUniversalNumber() {
        return this.UniversalNumber;
    }
    
    public void setUniversalNumber(String UniversalNumber) {
        this.UniversalNumber = UniversalNumber;
    }

    
    @Column(name="CAPITAL", columnDefinition="VARCHAR", length=80)
    public String getCapital() {
        return this.Capital;
    }
    
    public void setCapital(String Capital) {
        this.Capital = Capital;
    }

    
    @Column(name="PHONE_CODE", columnDefinition="VARCHAR", length=10)
    public String getPhoneCode() {
        return this.PhoneCode;
    }
    
    public void setPhoneCode(String PhoneCode) {
        this.PhoneCode = PhoneCode;
    }

    
    @Column(name="FULL_NAME", columnDefinition="VARCHAR", length=80)
    public String getFullName() {
        return this.FullName;
    }
    
    public void setFullName(String FullName) {
        this.FullName = FullName;
    }

    
    @Column(name="ADDRESS_RULE", columnDefinition="VARCHAR", length=256)
    public String getAddressRule() {
        return this.AddressRule;
    }
    
    public void setAddressRule(String AddressRule) {
        this.AddressRule = AddressRule;
    }

    
    @Column(name="ADDRESS_DLM", columnDefinition="VARCHAR", length=5)
    public String getAddressDlm() {
        return this.AddressDlm;
    }
    
    public void setAddressDlm(String AddressDlm) {
        this.AddressDlm = AddressDlm;
    }




}


