package com.mg.merp.personnelref.model;

import com.mg.merp.core.model.SysClient;
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
 * WorkSchedule generated by hbm2java
 */
@Entity
@Table(name = "PREF_WORK_SCHEDULE")
@DataItemName("PersonnelRef.WorkSchedule")
public class WorkSchedule extends com.mg.merp.core.model.AbstractEntity implements java.io.Serializable {

    private Integer Id;

    private SysClient SysClient;

    private WorkSchedule LeaveSchedule;

    private String SCode;

    private String SName;

    private Date BeginDate;

    private Date EndDate;

    private Set<WorkTimeNorm> SetOfPrefWorkTimeNorm = new HashSet<WorkTimeNorm>(0);

    public WorkSchedule() {
    }

    public WorkSchedule(String SCode) {
        this.SCode = SCode;
    }

    public WorkSchedule(SysClient SysClient, WorkSchedule LeaveSchedule, String SCode, String SName, Date BeginDate, Date EndDate, Set<WorkTimeNorm> SetOfPrefWorkTimeNorm) {
        this.SysClient = SysClient;
        this.LeaveSchedule = LeaveSchedule;
        this.SCode = SCode;
        this.SName = SName;
        this.BeginDate = BeginDate;
        this.EndDate = EndDate;
        this.SetOfPrefWorkTimeNorm = SetOfPrefWorkTimeNorm;
    }

    @SequenceGenerator(name = "generator", sequenceName = "PREF_WORK_SCHEDULE_ID_GEN")
    @Id
    @GeneratedValue(strategy = SEQUENCE, generator = "generator")
    @Column(name = "ID", unique = true, columnDefinition = "INTEGER")
    @DataItemName("ID")
    public Integer getId() {
        return this.Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
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
    @JoinColumn(name = "LEAVE_SCHEDULE_ID")
    @DataItemName("PersonnelRef.WorkSchedule.LeaveSchedule")
    public WorkSchedule getLeaveSchedule() {
        return this.LeaveSchedule;
    }

    public void setLeaveSchedule(WorkSchedule LeaveSchedule) {
        this.LeaveSchedule = LeaveSchedule;
    }

    @Column(name = "SCODE", nullable = false, columnDefinition = "CHAR", length = 20)
    @DataItemName("PersonnelRef.WorkSchedule.SCode")
    public String getSCode() {
        return this.SCode;
    }

    public void setSCode(String SCode) {
        this.SCode = SCode;
    }

    @Column(name = "SNAME", columnDefinition = "VARCHAR", length = 80)
    @DataItemName("PersonnelRef.WorkSchedule.SName")
    public String getSName() {
        return this.SName;
    }

    public void setSName(String SName) {
        this.SName = SName;
    }

    @Column(name = "BEGINDATE", columnDefinition = "TIMESTAMP")
    @DataItemName("PersonnelRef.WorkSchedule.BeginDate")
    public Date getBeginDate() {
        return this.BeginDate;
    }

    public void setBeginDate(Date BeginDate) {
        this.BeginDate = BeginDate;
    }

    @Column(name = "ENDDATE", columnDefinition = "TIMESTAMP")
    @DataItemName("PersonnelRef.WorkSchedule.EndDate")
    public Date getEndDate() {
        return this.EndDate;
    }

    public void setEndDate(Date EndDate) {
        this.EndDate = EndDate;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "WorkSchedule")
    public Set<WorkTimeNorm> getSetOfPrefWorkTimeNorm() {
        return this.SetOfPrefWorkTimeNorm;
    }

    public void setSetOfPrefWorkTimeNorm(Set<WorkTimeNorm> SetOfPrefWorkTimeNorm) {
        this.SetOfPrefWorkTimeNorm = SetOfPrefWorkTimeNorm;
    }
}

