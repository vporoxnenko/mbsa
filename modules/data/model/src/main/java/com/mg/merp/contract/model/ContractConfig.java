package com.mg.merp.contract.model;
// Generated Sep 28, 2015 11:47:52 PM by Hibernate Tools 3.6.0.Final


import com.mg.merp.reference.model.Currency;
import com.mg.merp.reference.model.CurrencyRateAuthority;
import com.mg.merp.reference.model.CurrencyRateType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * ContractConfig generated by hbm2java
 */
@Entity
@Table(name="CT_CONFIG"
)
public class ContractConfig extends com.mg.merp.core.model.AbstractEntity implements java.io.Serializable {


     private int SysClientId;
     private Currency BaseCurrency;
     private Currency NatCurrency;
     private CurrencyRateType RefCurrencyRateType;
     private CurrencyRateAuthority RefCurrencyRateAuthority;
     private Integer CurrencyPrec;

    public ContractConfig() {
    }

	
    public ContractConfig(int SysClientId) {
        this.SysClientId = SysClientId;
    }
    public ContractConfig(int SysClientId, Currency BaseCurrency, Currency NatCurrency, CurrencyRateType RefCurrencyRateType, CurrencyRateAuthority RefCurrencyRateAuthority, Integer CurrencyPrec) {
       this.SysClientId = SysClientId;
       this.BaseCurrency = BaseCurrency;
       this.NatCurrency = NatCurrency;
       this.RefCurrencyRateType = RefCurrencyRateType;
       this.RefCurrencyRateAuthority = RefCurrencyRateAuthority;
       this.CurrencyPrec = CurrencyPrec;
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
    @JoinColumn(name="BASE_CURRENCY")
    public Currency getBaseCurrency() {
        return this.BaseCurrency;
    }
    
    public void setBaseCurrency(Currency BaseCurrency) {
        this.BaseCurrency = BaseCurrency;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="NAT_CURRENCY")
    public Currency getNatCurrency() {
        return this.NatCurrency;
    }
    
    public void setNatCurrency(Currency NatCurrency) {
        this.NatCurrency = NatCurrency;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="CUR_RATE_TYPE_ID")
    public CurrencyRateType getRefCurrencyRateType() {
        return this.RefCurrencyRateType;
    }
    
    public void setRefCurrencyRateType(CurrencyRateType RefCurrencyRateType) {
        this.RefCurrencyRateType = RefCurrencyRateType;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="CUR_RATE_AUTHORITY_ID")
    public CurrencyRateAuthority getRefCurrencyRateAuthority() {
        return this.RefCurrencyRateAuthority;
    }
    
    public void setRefCurrencyRateAuthority(CurrencyRateAuthority RefCurrencyRateAuthority) {
        this.RefCurrencyRateAuthority = RefCurrencyRateAuthority;
    }

    
    @Column(name="CURRENCY_PREC", columnDefinition="INTEGER")
    public Integer getCurrencyPrec() {
        return this.CurrencyPrec;
    }
    
    public void setCurrencyPrec(Integer CurrencyPrec) {
        this.CurrencyPrec = CurrencyPrec;
    }




}

