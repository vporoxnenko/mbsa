package com.mg.merp.reference.model;
// Generated Sep 28, 2015 11:47:52 PM by Hibernate Tools 3.6.0.Final


import com.mg.merp.core.model.SysClient;
import java.math.BigDecimal;
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
 * PriceType generated by hbm2java
 */
@Entity
@Table(name="PRICETYPE"
)
public class PriceType extends com.mg.merp.core.model.AbstractEntity implements java.io.Serializable {


     private Integer Id;
     private SysClient SysClient;
     private String Code;
     private String PName;
     private boolean UseRelativePercent;
     private BigDecimal RelativePercent;
     private boolean RoundInGreater;
     private String Formula;

    public PriceType() {
    }

	
    public PriceType(String Code) {
        this.Code = Code;
    }
    public PriceType(SysClient SysClient, String Code, String PName, boolean UseRelativePercent, BigDecimal RelativePercent, boolean RoundInGreater, String Formula) {
       this.SysClient = SysClient;
       this.Code = Code;
       this.PName = PName;
       this.UseRelativePercent = UseRelativePercent;
       this.RelativePercent = RelativePercent;
       this.RoundInGreater = RoundInGreater;
       this.Formula = Formula;
    }
   
     @SequenceGenerator(name="generator", sequenceName="PRICETYPE_ID_GEN")@Id @GeneratedValue(strategy=SEQUENCE, generator="generator")

    
    @Column(name="ID", unique=true, columnDefinition="INTEGER")
    public Integer getId() {
        return this.Id;
    }
    
    public void setId(Integer Id) {
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

    
    @Column(name="CODE", nullable=false, columnDefinition="CHAR", length=20)
    public String getCode() {
        return this.Code;
    }
    
    public void setCode(String Code) {
        this.Code = Code;
    }

    
    @Column(name="PNAME", columnDefinition="VARCHAR", length=80)
    public String getPName() {
        return this.PName;
    }
    
    public void setPName(String PName) {
        this.PName = PName;
    }

    
    @Column(name="USE_RELATIVE_PERCENT", columnDefinition="SMALLINT")
    public boolean isUseRelativePercent() {
        return this.UseRelativePercent;
    }
    
    public void setUseRelativePercent(boolean UseRelativePercent) {
        this.UseRelativePercent = UseRelativePercent;
    }

    
    @Column(name="RELATIVE_PERCENT", columnDefinition="NUMERIC", precision=18, scale=6)
    public BigDecimal getRelativePercent() {
        return this.RelativePercent;
    }
    
    public void setRelativePercent(BigDecimal RelativePercent) {
        this.RelativePercent = RelativePercent;
    }

    
    @Column(name="ROUND_IN_GREATER", columnDefinition="SMALLINT")
    public boolean isRoundInGreater() {
        return this.RoundInGreater;
    }
    
    public void setRoundInGreater(boolean RoundInGreater) {
        this.RoundInGreater = RoundInGreater;
    }

    
    @Column(name="FORMULA", columnDefinition="VARCHAR", length=2048)
    public String getFormula() {
        return this.Formula;
    }
    
    public void setFormula(String Formula) {
        this.Formula = Formula;
    }




}

