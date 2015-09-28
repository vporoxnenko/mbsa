package com.mg.merp.personnelref.model;
// Generated Sep 28, 2015 11:36:59 PM by Hibernate Tools 3.6.0.Final


import com.mg.merp.core.model.Folder;
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
 * StaffList generated by hbm2java
 */
@Entity
@Table(name="PREF_STAFF_LIST"
)
public class StaffList extends com.mg.merp.core.model.AbstractEntity implements java.io.Serializable {


     private Integer Id;
     private Folder Folder;
     private SysClient SysClient;
     private String LName;

    public StaffList() {
    }

    public StaffList(Folder Folder, SysClient SysClient, String LName) {
       this.Folder = Folder;
       this.SysClient = SysClient;
       this.LName = LName;
    }
   
     @SequenceGenerator(name="generator", sequenceName="PREF_STAFF_LIST_ID_GEN")@Id @GeneratedValue(strategy=SEQUENCE, generator="generator")

    
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

    
    @Column(name="LNAME", unique=true, columnDefinition="VARCHAR", length=80)
    public String getLName() {
        return this.LName;
    }
    
    public void setLName(String LName) {
        this.LName = LName;
    }




}


