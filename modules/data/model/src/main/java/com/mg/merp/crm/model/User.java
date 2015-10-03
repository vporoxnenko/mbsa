package com.mg.merp.crm.model;
// Generated Sep 28, 2015 11:47:52 PM by Hibernate Tools 3.6.0.Final


import com.mg.merp.core.model.SysClient;
import com.mg.merp.reference.model.NaturalPerson;
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
 * User generated by hbm2java
 */
@Entity
@Table(name="CRM_USER"
)
public class User extends com.mg.merp.core.model.AbstractEntity implements java.io.Serializable {


     private Integer Id;
     private NaturalPerson Person;
     private SysClient SysClient;
     private String ThePosition;
     private boolean Busy;
     private boolean IsAdmin;

    public User() {
    }

    public User(NaturalPerson Person, SysClient SysClient, String ThePosition, boolean Busy, boolean IsAdmin) {
       this.Person = Person;
       this.SysClient = SysClient;
       this.ThePosition = ThePosition;
       this.Busy = Busy;
       this.IsAdmin = IsAdmin;
    }
   
     @SequenceGenerator(name="generator", sequenceName="CRM_USER_ID_GEN")@Id @GeneratedValue(strategy=SEQUENCE, generator="generator")

    
    @Column(name="ID", unique=true, columnDefinition="INTEGER")
    public Integer getId() {
        return this.Id;
    }
    
    public void setId(Integer Id) {
        this.Id = Id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="PERSON_ID")
    public NaturalPerson getPerson() {
        return this.Person;
    }
    
    public void setPerson(NaturalPerson Person) {
        this.Person = Person;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="CLIENT_ID")
    public SysClient getSysClient() {
        return this.SysClient;
    }
    
    public void setSysClient(SysClient SysClient) {
        this.SysClient = SysClient;
    }

    
    @Column(name="THE_POSITION", columnDefinition="VARCHAR", length=80)
    public String getThePosition() {
        return this.ThePosition;
    }
    
    public void setThePosition(String ThePosition) {
        this.ThePosition = ThePosition;
    }

    
    @Column(name="BUSY", columnDefinition="SMALLINT")
    public boolean isBusy() {
        return this.Busy;
    }
    
    public void setBusy(boolean Busy) {
        this.Busy = Busy;
    }

    
    @Column(name="IS_ADMIN", columnDefinition="SMALLINT")
    public boolean isIsAdmin() {
        return this.IsAdmin;
    }
    
    public void setIsAdmin(boolean IsAdmin) {
        this.IsAdmin = IsAdmin;
    }




}

