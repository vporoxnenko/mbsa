package com.mg.merp.manufacture.model;
// Generated Sep 28, 2015 11:36:59 PM by Hibernate Tools 3.6.0.Final


import com.mg.merp.core.model.SysClient;
import com.mg.merp.mfreference.model.CostDetail;
import com.mg.merp.mfreference.model.WorkCenter;
import com.mg.merp.reference.model.Measure;
import java.math.BigDecimal;
import java.util.Date;
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
 * JobRoute generated by hbm2java
 */
@Entity
@Table(name="MF_JOB_ROUTE"
)
public class JobRoute extends com.mg.merp.core.model.AbstractEntity implements java.io.Serializable {


     private Integer Id;
     private CostDetail ActCostDetail;
     private Measure SchedOffSetTimeUM;
     private Measure SetupTimeUM;
     private Measure MoveTimeUM;
     private SysClient SysClient;
     private CostDetail StdCostDetail;
     private Measure SchedTimeUM;
     private WorkCenter WorkCenter;
     private Measure RunTimeUM;
     private Job Job;
     private Measure QueueTimeUM;
     private Integer OperNum;
     private String Description;
     private Date EffOnDate;
     private Date EffOffDate;
     private boolean CompleteFlag;
     private BigDecimal EfficiencyFactor;
     private Date StartDate;
     private Date EndDate;
     private Long StartTick;
     private Long EndTick;
     private Long MoveTicks;
     private Long SetupTicks;
     private Long RunTicks;
     private Long SchedTicks;
     private Long SchedOffsetTicks;
     private Long QueueTicks;
     private boolean FreezeScheduleFlag;
     private BigDecimal QtyReceived;
     private BigDecimal QtyComplete;
     private BigDecimal QtyScrapped;
     private BigDecimal QtyMoved;
     private boolean ControlPointFlag;
     private String Comment;

    public JobRoute() {
    }

    public JobRoute(CostDetail ActCostDetail, Measure SchedOffSetTimeUM, Measure SetupTimeUM, Measure MoveTimeUM, SysClient SysClient, CostDetail StdCostDetail, Measure SchedTimeUM, WorkCenter WorkCenter, Measure RunTimeUM, Job Job, Measure QueueTimeUM, Integer OperNum, String Description, Date EffOnDate, Date EffOffDate, boolean CompleteFlag, BigDecimal EfficiencyFactor, Date StartDate, Date EndDate, Long StartTick, Long EndTick, Long MoveTicks, Long SetupTicks, Long RunTicks, Long SchedTicks, Long SchedOffsetTicks, Long QueueTicks, boolean FreezeScheduleFlag, BigDecimal QtyReceived, BigDecimal QtyComplete, BigDecimal QtyScrapped, BigDecimal QtyMoved, boolean ControlPointFlag, String Comment) {
       this.ActCostDetail = ActCostDetail;
       this.SchedOffSetTimeUM = SchedOffSetTimeUM;
       this.SetupTimeUM = SetupTimeUM;
       this.MoveTimeUM = MoveTimeUM;
       this.SysClient = SysClient;
       this.StdCostDetail = StdCostDetail;
       this.SchedTimeUM = SchedTimeUM;
       this.WorkCenter = WorkCenter;
       this.RunTimeUM = RunTimeUM;
       this.Job = Job;
       this.QueueTimeUM = QueueTimeUM;
       this.OperNum = OperNum;
       this.Description = Description;
       this.EffOnDate = EffOnDate;
       this.EffOffDate = EffOffDate;
       this.CompleteFlag = CompleteFlag;
       this.EfficiencyFactor = EfficiencyFactor;
       this.StartDate = StartDate;
       this.EndDate = EndDate;
       this.StartTick = StartTick;
       this.EndTick = EndTick;
       this.MoveTicks = MoveTicks;
       this.SetupTicks = SetupTicks;
       this.RunTicks = RunTicks;
       this.SchedTicks = SchedTicks;
       this.SchedOffsetTicks = SchedOffsetTicks;
       this.QueueTicks = QueueTicks;
       this.FreezeScheduleFlag = FreezeScheduleFlag;
       this.QtyReceived = QtyReceived;
       this.QtyComplete = QtyComplete;
       this.QtyScrapped = QtyScrapped;
       this.QtyMoved = QtyMoved;
       this.ControlPointFlag = ControlPointFlag;
       this.Comment = Comment;
    }
   
     @SequenceGenerator(name="generator", sequenceName="MF_JOB_ROUTE_ID_GEN")@Id @GeneratedValue(strategy=SEQUENCE, generator="generator")

    
    @Column(name="ID", unique=true, columnDefinition="INTEGER")
    public Integer getId() {
        return this.Id;
    }
    
    public void setId(Integer Id) {
        this.Id = Id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="ACT_COST_DETAIL_ID")
    public CostDetail getActCostDetail() {
        return this.ActCostDetail;
    }
    
    public void setActCostDetail(CostDetail ActCostDetail) {
        this.ActCostDetail = ActCostDetail;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="SCHED_OFFSET_TIME_UM")
    public Measure getSchedOffSetTimeUM() {
        return this.SchedOffSetTimeUM;
    }
    
    public void setSchedOffSetTimeUM(Measure SchedOffSetTimeUM) {
        this.SchedOffSetTimeUM = SchedOffSetTimeUM;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="SETUP_TIME_UM")
    public Measure getSetupTimeUM() {
        return this.SetupTimeUM;
    }
    
    public void setSetupTimeUM(Measure SetupTimeUM) {
        this.SetupTimeUM = SetupTimeUM;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="MOVE_TIME_UM")
    public Measure getMoveTimeUM() {
        return this.MoveTimeUM;
    }
    
    public void setMoveTimeUM(Measure MoveTimeUM) {
        this.MoveTimeUM = MoveTimeUM;
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
    @JoinColumn(name="STD_COST_DETAIL_ID")
    public CostDetail getStdCostDetail() {
        return this.StdCostDetail;
    }
    
    public void setStdCostDetail(CostDetail StdCostDetail) {
        this.StdCostDetail = StdCostDetail;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="SCHED_TIME_UM")
    public Measure getSchedTimeUM() {
        return this.SchedTimeUM;
    }
    
    public void setSchedTimeUM(Measure SchedTimeUM) {
        this.SchedTimeUM = SchedTimeUM;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="WC_ID")
    public WorkCenter getWorkCenter() {
        return this.WorkCenter;
    }
    
    public void setWorkCenter(WorkCenter WorkCenter) {
        this.WorkCenter = WorkCenter;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="RUN_TIME_UM")
    public Measure getRunTimeUM() {
        return this.RunTimeUM;
    }
    
    public void setRunTimeUM(Measure RunTimeUM) {
        this.RunTimeUM = RunTimeUM;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="JOB_ID")
    public Job getJob() {
        return this.Job;
    }
    
    public void setJob(Job Job) {
        this.Job = Job;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="QUEUE_TIME_UM")
    public Measure getQueueTimeUM() {
        return this.QueueTimeUM;
    }
    
    public void setQueueTimeUM(Measure QueueTimeUM) {
        this.QueueTimeUM = QueueTimeUM;
    }

    
    @Column(name="OPER_NUM", columnDefinition="INTEGER")
    public Integer getOperNum() {
        return this.OperNum;
    }
    
    public void setOperNum(Integer OperNum) {
        this.OperNum = OperNum;
    }

    
    @Column(name="DESCRIPTION", columnDefinition="VARCHAR", length=256)
    public String getDescription() {
        return this.Description;
    }
    
    public void setDescription(String Description) {
        this.Description = Description;
    }

    
    @Column(name="EFF_ON_DATE", columnDefinition="TIMESTAMP")
    public Date getEffOnDate() {
        return this.EffOnDate;
    }
    
    public void setEffOnDate(Date EffOnDate) {
        this.EffOnDate = EffOnDate;
    }

    
    @Column(name="EFF_OFF_DATE", columnDefinition="TIMESTAMP")
    public Date getEffOffDate() {
        return this.EffOffDate;
    }
    
    public void setEffOffDate(Date EffOffDate) {
        this.EffOffDate = EffOffDate;
    }

    
    @Column(name="COMPLETE_FLAG", columnDefinition="SMALLINT")
    public boolean isCompleteFlag() {
        return this.CompleteFlag;
    }
    
    public void setCompleteFlag(boolean CompleteFlag) {
        this.CompleteFlag = CompleteFlag;
    }

    
    @Column(name="EFFICIENCY_FACTOR", columnDefinition="NUMERIC", precision=18, scale=6)
    public BigDecimal getEfficiencyFactor() {
        return this.EfficiencyFactor;
    }
    
    public void setEfficiencyFactor(BigDecimal EfficiencyFactor) {
        this.EfficiencyFactor = EfficiencyFactor;
    }

    
    @Column(name="START_DATE", columnDefinition="TIMESTAMP")
    public Date getStartDate() {
        return this.StartDate;
    }
    
    public void setStartDate(Date StartDate) {
        this.StartDate = StartDate;
    }

    
    @Column(name="END_DATE", columnDefinition="TIMESTAMP")
    public Date getEndDate() {
        return this.EndDate;
    }
    
    public void setEndDate(Date EndDate) {
        this.EndDate = EndDate;
    }

    
    @Column(name="START_TICK", columnDefinition="NUMERIC", precision=18, scale=0)
    public Long getStartTick() {
        return this.StartTick;
    }
    
    public void setStartTick(Long StartTick) {
        this.StartTick = StartTick;
    }

    
    @Column(name="END_TICK", columnDefinition="NUMERIC", precision=18, scale=0)
    public Long getEndTick() {
        return this.EndTick;
    }
    
    public void setEndTick(Long EndTick) {
        this.EndTick = EndTick;
    }

    
    @Column(name="MOVE_TICKS", columnDefinition="NUMERIC", precision=18, scale=0)
    public Long getMoveTicks() {
        return this.MoveTicks;
    }
    
    public void setMoveTicks(Long MoveTicks) {
        this.MoveTicks = MoveTicks;
    }

    
    @Column(name="SETUP_TICKS", columnDefinition="NUMERIC", precision=18, scale=0)
    public Long getSetupTicks() {
        return this.SetupTicks;
    }
    
    public void setSetupTicks(Long SetupTicks) {
        this.SetupTicks = SetupTicks;
    }

    
    @Column(name="RUN_TICKS", columnDefinition="NUMERIC", precision=18, scale=0)
    public Long getRunTicks() {
        return this.RunTicks;
    }
    
    public void setRunTicks(Long RunTicks) {
        this.RunTicks = RunTicks;
    }

    
    @Column(name="SCHED_TICKS", columnDefinition="NUMERIC", precision=18, scale=0)
    public Long getSchedTicks() {
        return this.SchedTicks;
    }
    
    public void setSchedTicks(Long SchedTicks) {
        this.SchedTicks = SchedTicks;
    }

    
    @Column(name="SCHED_OFFSET_TICKS", columnDefinition="NUMERIC", precision=18, scale=0)
    public Long getSchedOffsetTicks() {
        return this.SchedOffsetTicks;
    }
    
    public void setSchedOffsetTicks(Long SchedOffsetTicks) {
        this.SchedOffsetTicks = SchedOffsetTicks;
    }

    
    @Column(name="QUEUE_TICKS", columnDefinition="NUMERIC", precision=18, scale=0)
    public Long getQueueTicks() {
        return this.QueueTicks;
    }
    
    public void setQueueTicks(Long QueueTicks) {
        this.QueueTicks = QueueTicks;
    }

    
    @Column(name="FREEZE_SCHEDULE_FLAG", columnDefinition="SMALLINT")
    public boolean isFreezeScheduleFlag() {
        return this.FreezeScheduleFlag;
    }
    
    public void setFreezeScheduleFlag(boolean FreezeScheduleFlag) {
        this.FreezeScheduleFlag = FreezeScheduleFlag;
    }

    
    @Column(name="QTY_RECEIVED", columnDefinition="NUMERIC", precision=18, scale=3)
    public BigDecimal getQtyReceived() {
        return this.QtyReceived;
    }
    
    public void setQtyReceived(BigDecimal QtyReceived) {
        this.QtyReceived = QtyReceived;
    }

    
    @Column(name="QTY_COMPLETE", columnDefinition="NUMERIC", precision=18, scale=3)
    public BigDecimal getQtyComplete() {
        return this.QtyComplete;
    }
    
    public void setQtyComplete(BigDecimal QtyComplete) {
        this.QtyComplete = QtyComplete;
    }

    
    @Column(name="QTY_SCRAPPED", columnDefinition="NUMERIC", precision=18, scale=3)
    public BigDecimal getQtyScrapped() {
        return this.QtyScrapped;
    }
    
    public void setQtyScrapped(BigDecimal QtyScrapped) {
        this.QtyScrapped = QtyScrapped;
    }

    
    @Column(name="QTY_MOVED", columnDefinition="NUMERIC", precision=18, scale=3)
    public BigDecimal getQtyMoved() {
        return this.QtyMoved;
    }
    
    public void setQtyMoved(BigDecimal QtyMoved) {
        this.QtyMoved = QtyMoved;
    }

    
    @Column(name="CONTROL_POINT_FLAG", columnDefinition="SMALLINT")
    public boolean isControlPointFlag() {
        return this.ControlPointFlag;
    }
    
    public void setControlPointFlag(boolean ControlPointFlag) {
        this.ControlPointFlag = ControlPointFlag;
    }

    
    @Column(name="COMMENT", columnDefinition="VARCHAR", length=256)
    public String getComment() {
        return this.Comment;
    }
    
    public void setComment(String Comment) {
        this.Comment = Comment;
    }




}


