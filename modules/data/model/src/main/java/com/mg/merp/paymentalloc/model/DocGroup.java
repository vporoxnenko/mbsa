package com.mg.merp.paymentalloc.model;
// Generated Sep 28, 2015 11:36:59 PM by Hibernate Tools 3.6.0.Final


import com.mg.merp.account.model.AccConfig;
import com.mg.merp.core.model.SysClient;
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
 * DocGroup generated by hbm2java
 */
@Entity
@Table(name="PMA_DOCGROUP"
)
public class DocGroup extends com.mg.merp.core.model.AbstractEntity implements java.io.Serializable {


     private Integer Id;
     private SysClient SysClient;
     private String Name;
     private Set<AccConfig> SetOfAccConfig = new HashSet<AccConfig>(0);
     private Set<AccConfig> SetOfAccConfig_1 = new HashSet<AccConfig>(0);
     private Set<AccConfig> SetOfAccConfig_2 = new HashSet<AccConfig>(0);
     private Set<AccConfig> SetOfAccConfig_3 = new HashSet<AccConfig>(0);
     private Set<AccConfig> SetOfAccConfig_4 = new HashSet<AccConfig>(0);
     private Set<DocGroupLink> DocGroupLinks = new HashSet<DocGroupLink>(0);

    public DocGroup() {
    }

    public DocGroup(SysClient SysClient, String Name, Set<AccConfig> SetOfAccConfig, Set<AccConfig> SetOfAccConfig_1, Set<AccConfig> SetOfAccConfig_2, Set<AccConfig> SetOfAccConfig_3, Set<AccConfig> SetOfAccConfig_4, Set<DocGroupLink> DocGroupLinks) {
       this.SysClient = SysClient;
       this.Name = Name;
       this.SetOfAccConfig = SetOfAccConfig;
       this.SetOfAccConfig_1 = SetOfAccConfig_1;
       this.SetOfAccConfig_2 = SetOfAccConfig_2;
       this.SetOfAccConfig_3 = SetOfAccConfig_3;
       this.SetOfAccConfig_4 = SetOfAccConfig_4;
       this.DocGroupLinks = DocGroupLinks;
    }
   
     @SequenceGenerator(name="generator", sequenceName="PMA_DOCGROUP_ID_GEN")@Id @GeneratedValue(strategy=SEQUENCE, generator="generator")

    
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

    
    @Column(name="NAME", columnDefinition="VARCHAR", length=80)
    public String getName() {
        return this.Name;
    }
    
    public void setName(String Name) {
        this.Name = Name;
    }

@OneToMany(fetch=FetchType.LAZY)
    @JoinColumn(name="SALEBOOK_INVOICE_DOCGROUP_ID", updatable=false)
    public Set<AccConfig> getSetOfAccConfig() {
        return this.SetOfAccConfig;
    }
    
    public void setSetOfAccConfig(Set<AccConfig> SetOfAccConfig) {
        this.SetOfAccConfig = SetOfAccConfig;
    }

@OneToMany(fetch=FetchType.LAZY)
    @JoinColumn(name="SALEBOOK_AVANINV_DOCGROUP_ID", updatable=false)
    public Set<AccConfig> getSetOfAccConfig_1() {
        return this.SetOfAccConfig_1;
    }
    
    public void setSetOfAccConfig_1(Set<AccConfig> SetOfAccConfig_1) {
        this.SetOfAccConfig_1 = SetOfAccConfig_1;
    }

@OneToMany(fetch=FetchType.LAZY)
    @JoinColumn(name="BUYBOOK_INVOICE_DOCGROUP_ID", updatable=false)
    public Set<AccConfig> getSetOfAccConfig_2() {
        return this.SetOfAccConfig_2;
    }
    
    public void setSetOfAccConfig_2(Set<AccConfig> SetOfAccConfig_2) {
        this.SetOfAccConfig_2 = SetOfAccConfig_2;
    }

@OneToMany(fetch=FetchType.LAZY)
    @JoinColumn(name="SALEBOOK_DELIV_DOCGROUP_ID", updatable=false)
    public Set<AccConfig> getSetOfAccConfig_3() {
        return this.SetOfAccConfig_3;
    }
    
    public void setSetOfAccConfig_3(Set<AccConfig> SetOfAccConfig_3) {
        this.SetOfAccConfig_3 = SetOfAccConfig_3;
    }

@OneToMany(fetch=FetchType.LAZY)
    @JoinColumn(name="BUYBOOK_DELIV_DOCGROUP_ID", updatable=false)
    public Set<AccConfig> getSetOfAccConfig_4() {
        return this.SetOfAccConfig_4;
    }
    
    public void setSetOfAccConfig_4(Set<AccConfig> SetOfAccConfig_4) {
        this.SetOfAccConfig_4 = SetOfAccConfig_4;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="DocGroup")
    public Set<DocGroupLink> getDocGroupLinks() {
        return this.DocGroupLinks;
    }
    
    public void setDocGroupLinks(Set<DocGroupLink> DocGroupLinks) {
        this.DocGroupLinks = DocGroupLinks;
    }




}


