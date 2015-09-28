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
 * District generated by hbm2java
 */
@Entity
@Table(name="REF_DISTRICT"
)
public class District extends com.mg.merp.core.model.AbstractEntity implements java.io.Serializable {


     private Integer Id;
     private SysClient SysClient;
     private Region Region;
     private String Prefix;
     private String Name;

    public District() {
    }

    public District(SysClient SysClient, Region Region, String Prefix, String Name) {
       this.SysClient = SysClient;
       this.Region = Region;
       this.Prefix = Prefix;
       this.Name = Name;
    }
   
     @SequenceGenerator(name="generator", sequenceName="REF_DISTRICT_ID_GEN")@Id @GeneratedValue(strategy=SEQUENCE, generator="generator")

    
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

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="REGION_ID")
    public Region getRegion() {
        return this.Region;
    }
    
    public void setRegion(Region Region) {
        this.Region = Region;
    }

    
    @Column(name="PREFIX", columnDefinition="VARCHAR", length=20)
    public String getPrefix() {
        return this.Prefix;
    }
    
    public void setPrefix(String Prefix) {
        this.Prefix = Prefix;
    }

    
    @Column(name="NAME", columnDefinition="VARCHAR", length=80)
    public String getName() {
        return this.Name;
    }
    
    public void setName(String Name) {
        this.Name = Name;
    }




}


