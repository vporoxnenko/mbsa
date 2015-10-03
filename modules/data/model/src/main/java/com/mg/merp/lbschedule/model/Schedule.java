package com.mg.merp.lbschedule.model;
// Generated Sep 28, 2015 11:47:52 PM by Hibernate Tools 3.6.0.Final


import com.mg.framework.support.orm.EnumUserType;
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
 * Schedule generated by hbm2java
 */
@Entity
@Table(name="LS_SCHEDULE"
)
public class Schedule extends com.mg.merp.core.model.AbstractEntity implements java.io.Serializable {


     private Integer Id;
     private Folder Folder;
     private SysClient SysClient;
     private String Comments;
     private String Name;
     private EnumUserType Status;
     private Set<Item> LsItems = new HashSet<Item>(0);

    public Schedule() {
    }

    public Schedule(Folder Folder, SysClient SysClient, String Comments, String Name, EnumUserType Status, Set<Item> LsItems) {
       this.Folder = Folder;
       this.SysClient = SysClient;
       this.Comments = Comments;
       this.Name = Name;
       this.Status = Status;
       this.LsItems = LsItems;
    }
   
     @SequenceGenerator(name="generator", sequenceName="LS_SCHEDULE_ID_GEN")@Id @GeneratedValue(strategy=SEQUENCE, generator="generator")

    
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

    
    @Column(name="COMMENTS", columnDefinition="VARCHAR", length=256)
    public String getComments() {
        return this.Comments;
    }
    
    public void setComments(String Comments) {
        this.Comments = Comments;
    }

    
    @Column(name="NAME", columnDefinition="VARCHAR", length=80)
    public String getName() {
        return this.Name;
    }
    
    public void setName(String Name) {
        this.Name = Name;
    }

    
    @Column(name="STATUS", columnDefinition="SMALLINT")
    public EnumUserType getStatus() {
        return this.Status;
    }
    
    public void setStatus(EnumUserType Status) {
        this.Status = Status;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="Schedule")
    public Set<Item> getLsItems() {
        return this.LsItems;
    }
    
    public void setLsItems(Set<Item> LsItems) {
        this.LsItems = LsItems;
    }




}

