package com.mg.merp.personnelref.model;
// Generated Sep 28, 2015 11:47:52 PM by Hibernate Tools 3.6.0.Final


import com.mg.merp.core.model.SysClient;
import com.mg.merp.salary.model.FeeModel;
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
 * PersonalAccount generated by hbm2java
 */
@Entity
@Table(name="SAL_PERSONAL_ACCOUNT"
)
public class PersonalAccount extends com.mg.merp.core.model.AbstractEntity implements java.io.Serializable {


     private Integer Id;
     private Personnel Personnel;
     private SysClient SysClient;
     private String ANumber;
     private Date BeginDate;
     private Date EndDate;
     private Set<FeeModel> SetOfSalFeeModel = new HashSet<FeeModel>(0);
     private Set<PositionFill> SetOfSalPositionFill = new HashSet<PositionFill>(0);

    public PersonalAccount() {
    }

    public PersonalAccount(Personnel Personnel, SysClient SysClient, String ANumber, Date BeginDate, Date EndDate, Set<FeeModel> SetOfSalFeeModel, Set<PositionFill> SetOfSalPositionFill) {
       this.Personnel = Personnel;
       this.SysClient = SysClient;
       this.ANumber = ANumber;
       this.BeginDate = BeginDate;
       this.EndDate = EndDate;
       this.SetOfSalFeeModel = SetOfSalFeeModel;
       this.SetOfSalPositionFill = SetOfSalPositionFill;
    }
   
     @SequenceGenerator(name="generator", sequenceName="SAL_PERSONAL_ACCOUNT_ID_GEN")@Id @GeneratedValue(strategy=SEQUENCE, generator="generator")

    
    @Column(name="ID", unique=true, columnDefinition="INTEGER")
    public Integer getId() {
        return this.Id;
    }
    
    public void setId(Integer Id) {
        this.Id = Id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="PERSONNEL_ID")
    public Personnel getPersonnel() {
        return this.Personnel;
    }
    
    public void setPersonnel(Personnel Personnel) {
        this.Personnel = Personnel;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="CLIENT_ID")
    public SysClient getSysClient() {
        return this.SysClient;
    }
    
    public void setSysClient(SysClient SysClient) {
        this.SysClient = SysClient;
    }

    
    @Column(name="ANUMBER", columnDefinition="CHAR", length=20)
    public String getANumber() {
        return this.ANumber;
    }
    
    public void setANumber(String ANumber) {
        this.ANumber = ANumber;
    }

    
    @Column(name="BEGINDATE", columnDefinition="TIMESTAMP")
    public Date getBeginDate() {
        return this.BeginDate;
    }
    
    public void setBeginDate(Date BeginDate) {
        this.BeginDate = BeginDate;
    }

    
    @Column(name="ENDDATE", columnDefinition="TIMESTAMP")
    public Date getEndDate() {
        return this.EndDate;
    }
    
    public void setEndDate(Date EndDate) {
        this.EndDate = EndDate;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="PersonalAccount")
    public Set<FeeModel> getSetOfSalFeeModel() {
        return this.SetOfSalFeeModel;
    }
    
    public void setSetOfSalFeeModel(Set<FeeModel> SetOfSalFeeModel) {
        this.SetOfSalFeeModel = SetOfSalFeeModel;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="PersonalAccount")
    public Set<PositionFill> getSetOfSalPositionFill() {
        return this.SetOfSalPositionFill;
    }
    
    public void setSetOfSalPositionFill(Set<PositionFill> SetOfSalPositionFill) {
        this.SetOfSalPositionFill = SetOfSalPositionFill;
    }




}

