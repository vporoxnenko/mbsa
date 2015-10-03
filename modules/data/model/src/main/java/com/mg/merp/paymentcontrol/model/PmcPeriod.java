package com.mg.merp.paymentcontrol.model;
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
 * PmcPeriod generated by hbm2java
 */
@Entity
@Table(name="PMC_PERIOD"
)
public class PmcPeriod extends com.mg.merp.core.model.AbstractEntity implements java.io.Serializable {


     private Integer Id;
     private PmcPeriod Parent;
     private SysClient SysClient;
     private String Name;
     private Date DateFrom;
     private Date DateTill;
     private Short Kind;
     private Set<PmcPeriod> PmcPeriods = new HashSet<PmcPeriod>(0);

    public PmcPeriod() {
    }

    public PmcPeriod(PmcPeriod Parent, SysClient SysClient, String Name, Date DateFrom, Date DateTill, Short Kind, Set<PmcPeriod> PmcPeriods) {
       this.Parent = Parent;
       this.SysClient = SysClient;
       this.Name = Name;
       this.DateFrom = DateFrom;
       this.DateTill = DateTill;
       this.Kind = Kind;
       this.PmcPeriods = PmcPeriods;
    }
   
     @SequenceGenerator(name="generator", sequenceName="PMC_PERIOD_ID_GEN")@Id @GeneratedValue(strategy=SEQUENCE, generator="generator")

    
    @Column(name="ID", unique=true, columnDefinition="INTEGER")
    public Integer getId() {
        return this.Id;
    }
    
    public void setId(Integer Id) {
        this.Id = Id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="PARENT_ID")
    public PmcPeriod getParent() {
        return this.Parent;
    }
    
    public void setParent(PmcPeriod Parent) {
        this.Parent = Parent;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="CLIENT_ID")
    public SysClient getSysClient() {
        return this.SysClient;
    }
    
    public void setSysClient(SysClient SysClient) {
        this.SysClient = SysClient;
    }

    
    @Column(name="NAME", columnDefinition="VARCHAR", length=80)
    public String getName() {
        return this.Name;
    }
    
    public void setName(String Name) {
        this.Name = Name;
    }

    
    @Column(name="DATEFROM", columnDefinition="TIMESTAMP")
    public Date getDateFrom() {
        return this.DateFrom;
    }
    
    public void setDateFrom(Date DateFrom) {
        this.DateFrom = DateFrom;
    }

    
    @Column(name="DATETILL", columnDefinition="TIMESTAMP")
    public Date getDateTill() {
        return this.DateTill;
    }
    
    public void setDateTill(Date DateTill) {
        this.DateTill = DateTill;
    }

    
    @Column(name="KIND", columnDefinition="SMALLINT")
    public Short getKind() {
        return this.Kind;
    }
    
    public void setKind(Short Kind) {
        this.Kind = Kind;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="Parent")
    public Set<PmcPeriod> getPmcPeriods() {
        return this.PmcPeriods;
    }
    
    public void setPmcPeriods(Set<PmcPeriod> PmcPeriods) {
        this.PmcPeriods = PmcPeriods;
    }




}

