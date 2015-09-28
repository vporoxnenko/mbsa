package com.mg.merp.crm.model;
// Generated Sep 28, 2015 11:36:59 PM by Hibernate Tools 3.6.0.Final


import com.mg.merp.core.model.Folder;
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
 * Symptom generated by hbm2java
 */
@Entity
@Table(name="CRM_SYMPTOM"
)
public class Symptom extends com.mg.merp.core.model.AbstractEntity implements java.io.Serializable {


     private Integer Id;
     private Folder Folder;
     private SysClient SysClient;
     private User Creator;
     private String Name;
     private String Info;
     private Set<LinkSymptomProblem> LinkSymptomProblems = new HashSet<LinkSymptomProblem>(0);

    public Symptom() {
    }

    public Symptom(Folder Folder, SysClient SysClient, User Creator, String Name, String Info, Set<LinkSymptomProblem> LinkSymptomProblems) {
       this.Folder = Folder;
       this.SysClient = SysClient;
       this.Creator = Creator;
       this.Name = Name;
       this.Info = Info;
       this.LinkSymptomProblems = LinkSymptomProblems;
    }
   
     @SequenceGenerator(name="generator", sequenceName="CRM_SYMPTOM_ID_GEN")@Id @GeneratedValue(strategy=SEQUENCE, generator="generator")

    
    @Column(name="ID", unique=true, columnDefinition="INTEGER")
    public Integer getId() {
        return this.Id;
    }
    
    public void setId(Integer Id) {
        this.Id = Id;
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
    @JoinColumn(name="CLIENT_ID")
    public SysClient getSysClient() {
        return this.SysClient;
    }
    
    public void setSysClient(SysClient SysClient) {
        this.SysClient = SysClient;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="CREATOR_ID")
    public User getCreator() {
        return this.Creator;
    }
    
    public void setCreator(User Creator) {
        this.Creator = Creator;
    }

    
    @Column(name="NAME", columnDefinition="VARCHAR", length=256)
    public String getName() {
        return this.Name;
    }
    
    public void setName(String Name) {
        this.Name = Name;
    }

    
    @Column(name="INFO", columnDefinition="VARCHAR", length=2048)
    public String getInfo() {
        return this.Info;
    }
    
    public void setInfo(String Info) {
        this.Info = Info;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="unresolved")
    public Set<LinkSymptomProblem> getLinkSymptomProblems() {
        return this.LinkSymptomProblems;
    }
    
    public void setLinkSymptomProblems(Set<LinkSymptomProblem> LinkSymptomProblems) {
        this.LinkSymptomProblems = LinkSymptomProblems;
    }




}


