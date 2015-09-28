package com.mg.merp.security.model;
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
 * SecUserProfile generated by hbm2java
 */
@Entity
@Table(name="SEC_USER_PROFILE"
)
public class SecUserProfile extends com.mg.merp.core.model.AbstractEntity implements java.io.Serializable {


     private Integer Id;
     private SysClient SysClient;
     private SecUser User;
     private short ProfileType;

    public SecUserProfile() {
    }

	
    public SecUserProfile(short ProfileType) {
        this.ProfileType = ProfileType;
    }
    public SecUserProfile(SysClient SysClient, SecUser User, short ProfileType) {
       this.SysClient = SysClient;
       this.User = User;
       this.ProfileType = ProfileType;
    }
   
     @SequenceGenerator(name="generator", sequenceName="SEC_USER_PROFILE_ID_GEN")@Id @GeneratedValue(strategy=SEQUENCE, generator="generator")

    
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
    @JoinColumn(name="USER_ID")
    public SecUser getUser() {
        return this.User;
    }
    
    public void setUser(SecUser User) {
        this.User = User;
    }

    
    @Column(name="PROFILE_TYPE", nullable=false, columnDefinition="SMALLINT")
    public short getProfileType() {
        return this.ProfileType;
    }
    
    public void setProfileType(short ProfileType) {
        this.ProfileType = ProfileType;
    }




}


