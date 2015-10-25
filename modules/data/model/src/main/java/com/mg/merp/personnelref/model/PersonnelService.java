package com.mg.merp.personnelref.model;

import com.mg.merp.core.model.SysClient;
import java.math.BigDecimal;
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
 * PersonnelService generated by hbm2java
 */
@Entity
@Table(name = "PREF_PERSONNEL_SERVICE")
public class PersonnelService extends com.mg.merp.core.model.AbstractEntity implements java.io.Serializable {

    private int Id;

    private Personnel Personnel;

    private SysClient SysClient;

    private ServiceKind ServiceKind;

    private Date BeginDate;

    private Date EndDate;

    private BigDecimal LengthService;

    private String Comment;

    private boolean IsGoingOn;

    private BigDecimal Ratio;

    private Set<PfCodeInService> SetOfPrefPfcodeInService = new HashSet<PfCodeInService>(0);

    public PersonnelService() {
    }

    public PersonnelService(ServiceKind ServiceKind) {
        this.ServiceKind = ServiceKind;
    }

    public PersonnelService(Personnel Personnel, SysClient SysClient, ServiceKind ServiceKind, Date BeginDate, Date EndDate, BigDecimal LengthService, String Comment, boolean IsGoingOn, BigDecimal Ratio, Set<PfCodeInService> SetOfPrefPfcodeInService) {
        this.Personnel = Personnel;
        this.SysClient = SysClient;
        this.ServiceKind = ServiceKind;
        this.BeginDate = BeginDate;
        this.EndDate = EndDate;
        this.LengthService = LengthService;
        this.Comment = Comment;
        this.IsGoingOn = IsGoingOn;
        this.Ratio = Ratio;
        this.SetOfPrefPfcodeInService = SetOfPrefPfcodeInService;
    }

    @SequenceGenerator(name = "generator", sequenceName = "PREF_PERSONNEL_SERVICE_ID_GEN")
    @Id
    @GeneratedValue(strategy = SEQUENCE, generator = "generator")
    @Column(name = "ID", unique = true, nullable = false, columnDefinition = "INTEGER")
    @DataItemName("ID")
    public int getId() {
        return this.Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PERSONNEL_ID")
    public Personnel getPersonnel() {
        return this.Personnel;
    }

    public void setPersonnel(Personnel Personnel) {
        this.Personnel = Personnel;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CLIENT_ID")
    public SysClient getSysClient() {
        return this.SysClient;
    }

    public void setSysClient(SysClient SysClient) {
        this.SysClient = SysClient;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "SERVICEKIND_ID", nullable = false)
    public ServiceKind getServiceKind() {
        return this.ServiceKind;
    }

    public void setServiceKind(ServiceKind ServiceKind) {
        this.ServiceKind = ServiceKind;
    }

    @Column(name = "BEGINDATE", columnDefinition = "TIMESTAMP")
    @DataItemName("PersonnelRef.Personnel.BeginDate")
    public Date getBeginDate() {
        return this.BeginDate;
    }

    public void setBeginDate(Date BeginDate) {
        this.BeginDate = BeginDate;
    }

    @Column(name = "ENDDATE", columnDefinition = "TIMESTAMP")
    @DataItemName("PersonnelRef.Personnel.EndDate")
    public Date getEndDate() {
        return this.EndDate;
    }

    public void setEndDate(Date EndDate) {
        this.EndDate = EndDate;
    }

    @Column(name = "LENGTHSERVICE", columnDefinition = "NUMERIC", precision = 18, scale = 3)
    @DataItemName("PersonnelRef.Personnel.LengthService")
    public BigDecimal getLengthService() {
        return this.LengthService;
    }

    public void setLengthService(BigDecimal LengthService) {
        this.LengthService = LengthService;
    }

    @Column(name = "COMMENT", columnDefinition = "VARCHAR", length = 256)
    @DataItemName("PersonnelRef.Personnel.Comment")
    public String getComment() {
        return this.Comment;
    }

    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    @Column(name = "IS_GOINGON", columnDefinition = "SMALLINT")
    @DataItemName("PersonnelRef.Personnel.IsGoingOn")
    public boolean isGoingOn() {
        return this.IsGoingOn;
    }

    public void setGoingOn(boolean IsGoingOn) {
        this.IsGoingOn = IsGoingOn;
    }

    @Column(name = "RATIO", columnDefinition = "NUMERIC", precision = 18, scale = 6)
    @DataItemName("PersonnelRef.Personnel.Ratio")
    public BigDecimal getRatio() {
        return this.Ratio;
    }

    public void setRatio(BigDecimal Ratio) {
        this.Ratio = Ratio;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "PersonnelService")
    public Set<PfCodeInService> getSetOfPrefPfcodeInService() {
        return this.SetOfPrefPfcodeInService;
    }

    public void setSetOfPrefPfcodeInService(Set<PfCodeInService> SetOfPrefPfcodeInService) {
        this.SetOfPrefPfcodeInService = SetOfPrefPfcodeInService;
    }
}

