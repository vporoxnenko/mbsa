package com.mg.merp.personnelref.model;
// Generated Sep 28, 2015 11:36:59 PM by Hibernate Tools 3.6.0.Final


import com.mg.merp.core.model.Folder;
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
 * PfCodeKindInServiceKind generated by hbm2java
 */
@Entity
@Table(name="PREF_PFCODEKIND_IN_SERVICEKIND"
)
public class PfCodeKindInServiceKind extends com.mg.merp.core.model.AbstractEntity implements java.io.Serializable {


     private int Id;
     private SysClient SysClient;
     private Folder PfCodeKind;
     private ServiceKind ServiceKind;
     private BigDecimal Ratio;

    public PfCodeKindInServiceKind() {
    }

    public PfCodeKindInServiceKind(SysClient SysClient, Folder PfCodeKind, ServiceKind ServiceKind, BigDecimal Ratio) {
       this.SysClient = SysClient;
       this.PfCodeKind = PfCodeKind;
       this.ServiceKind = ServiceKind;
       this.Ratio = Ratio;
    }
   
     @SequenceGenerator(name="generator", sequenceName="PREF_PCK_IN_SERVICEKIND_ID_GEN")@Id @GeneratedValue(strategy=SEQUENCE, generator="generator")

    
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

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="PFCODEKIND_ID")
    public Folder getPfCodeKind() {
        return this.PfCodeKind;
    }
    
    public void setPfCodeKind(Folder PfCodeKind) {
        this.PfCodeKind = PfCodeKind;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="SERVICEKIND_ID")
    public ServiceKind getServiceKind() {
        return this.ServiceKind;
    }
    
    public void setServiceKind(ServiceKind ServiceKind) {
        this.ServiceKind = ServiceKind;
    }

    
    @Column(name="RATIO", columnDefinition="NUMERIC", precision=18, scale=6)
    public BigDecimal getRatio() {
        return this.Ratio;
    }
    
    public void setRatio(BigDecimal Ratio) {
        this.Ratio = Ratio;
    }




}


