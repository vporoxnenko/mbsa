package com.mg.merp.manufacture.model;

import com.mg.merp.core.model.Folder;
import com.mg.merp.core.model.SysClient;
import com.mg.merp.mfreference.model.Cell;
import com.mg.merp.mfreference.model.CostDetail;
import com.mg.merp.mfreference.model.ScheduleDirection;
import com.mg.merp.reference.model.Catalog;
import com.mg.merp.reference.model.Employees;
import com.mg.merp.warehouse.model.Warehouse;
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
import javax.persistence.Enumerated;
import javax.persistence.EnumType;
import com.mg.framework.api.annotations.DataItemName;

/**
 * Job generated by hbm2java
 */
@Entity
@Table(name = "MF_JOB")
@DataItemName("Manufacture.Job")
public class Job extends com.mg.merp.core.model.AbstractEntity implements java.io.Serializable {

    private Integer Id;

    private Catalog Catalog;

    private Employees DefSrcMol;

    private Folder Folder;

    private SysClient SysClient;

    private Job ParentJob;

    private CostDetail StdCostDetail;

    private Employees DefDstMol;

    private Cell Cell;

    private Job RootJob;

    private CostDetail ActWipCostDetail;

    private Warehouse DefDstStock;

    private Warehouse DefSrcStock;

    private String JobNumber;

    private Date JobDate;

    private JobStatus JobStatus;

    private BigDecimal QtyReleased;

    private BigDecimal QtyComplete;

    private BigDecimal QtyScrapped;

    private Date RollUpDateTime;

    private Date StartDate;

    private Date EndDate;

    private long StartTick;

    private long EndTick;

    private long StartJob;

    private long FinishJob;

    private ScheduleDirection SchedDirection;

    private boolean UseMoveTimes;

    private boolean UseQueueTimes;

    private boolean UseFiniteCapacity;

    private BigDecimal Priority;

    private boolean PriorityFreezeFlag;

    private Date MrpEndDate;

    private boolean ChangeJobApproved;

    private String Comment;

    private Set<JobRoute> JobRoutes = new HashSet<JobRoute>(0);

    public Job() {
    }

    public Job(Catalog Catalog, Employees DefSrcMol, Folder Folder, SysClient SysClient, Job ParentJob, CostDetail StdCostDetail, Employees DefDstMol, Cell Cell, Job RootJob, CostDetail ActWipCostDetail, Warehouse DefDstStock, Warehouse DefSrcStock, String JobNumber, Date JobDate, JobStatus JobStatus, BigDecimal QtyReleased, BigDecimal QtyComplete, BigDecimal QtyScrapped, Date RollUpDateTime, Date StartDate, Date EndDate, long StartTick, long EndTick, long StartJob, long FinishJob, ScheduleDirection SchedDirection, boolean UseMoveTimes, boolean UseQueueTimes, boolean UseFiniteCapacity, BigDecimal Priority, boolean PriorityFreezeFlag, Date MrpEndDate, boolean ChangeJobApproved, String Comment, Set<JobRoute> JobRoutes) {
        this.Catalog = Catalog;
        this.DefSrcMol = DefSrcMol;
        this.Folder = Folder;
        this.SysClient = SysClient;
        this.ParentJob = ParentJob;
        this.StdCostDetail = StdCostDetail;
        this.DefDstMol = DefDstMol;
        this.Cell = Cell;
        this.RootJob = RootJob;
        this.ActWipCostDetail = ActWipCostDetail;
        this.DefDstStock = DefDstStock;
        this.DefSrcStock = DefSrcStock;
        this.JobNumber = JobNumber;
        this.JobDate = JobDate;
        this.JobStatus = JobStatus;
        this.QtyReleased = QtyReleased;
        this.QtyComplete = QtyComplete;
        this.QtyScrapped = QtyScrapped;
        this.RollUpDateTime = RollUpDateTime;
        this.StartDate = StartDate;
        this.EndDate = EndDate;
        this.StartTick = StartTick;
        this.EndTick = EndTick;
        this.StartJob = StartJob;
        this.FinishJob = FinishJob;
        this.SchedDirection = SchedDirection;
        this.UseMoveTimes = UseMoveTimes;
        this.UseQueueTimes = UseQueueTimes;
        this.UseFiniteCapacity = UseFiniteCapacity;
        this.Priority = Priority;
        this.PriorityFreezeFlag = PriorityFreezeFlag;
        this.MrpEndDate = MrpEndDate;
        this.ChangeJobApproved = ChangeJobApproved;
        this.Comment = Comment;
        this.JobRoutes = JobRoutes;
    }

    @SequenceGenerator(name = "generator", sequenceName = "MF_JOB_ID_GEN")
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
    @JoinColumn(name = "CATALOG_ID")
    public Catalog getCatalog() {
        return this.Catalog;
    }

    public void setCatalog(Catalog Catalog) {
        this.Catalog = Catalog;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "DEF_SRC_MOL_ID")
    @DataItemName("Manufacture.Job.DefSrcMol")
    public Employees getDefSrcMol() {
        return this.DefSrcMol;
    }

    public void setDefSrcMol(Employees DefSrcMol) {
        this.DefSrcMol = DefSrcMol;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "FOLDER_ID")
    public Folder getFolder() {
        return this.Folder;
    }

    public void setFolder(Folder Folder) {
        this.Folder = Folder;
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
    @JoinColumn(name = "PARENT_JOB_ID")
    @DataItemName("Manufacture.Job.ParentJob")
    public Job getParentJob() {
        return this.ParentJob;
    }

    public void setParentJob(Job ParentJob) {
        this.ParentJob = ParentJob;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "STD_COST_DETAIL_ID")
    public CostDetail getStdCostDetail() {
        return this.StdCostDetail;
    }

    public void setStdCostDetail(CostDetail StdCostDetail) {
        this.StdCostDetail = StdCostDetail;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "DEF_DST_MOL_ID")
    @DataItemName("Manufacture.Job.DefDstMol")
    public Employees getDefDstMol() {
        return this.DefDstMol;
    }

    public void setDefDstMol(Employees DefDstMol) {
        this.DefDstMol = DefDstMol;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CELL_ID")
    public Cell getCell() {
        return this.Cell;
    }

    public void setCell(Cell Cell) {
        this.Cell = Cell;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ROOT_JOB_ID")
    @DataItemName("Manufacture.Job.RootJob")
    public Job getRootJob() {
        return this.RootJob;
    }

    public void setRootJob(Job RootJob) {
        this.RootJob = RootJob;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ACT_WIP_COST_DETAIL_ID")
    public CostDetail getActWipCostDetail() {
        return this.ActWipCostDetail;
    }

    public void setActWipCostDetail(CostDetail ActWipCostDetail) {
        this.ActWipCostDetail = ActWipCostDetail;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "DEF_DST_STOCK_ID")
    @DataItemName("Manufacture.Job.DefDstStock")
    public Warehouse getDefDstStock() {
        return this.DefDstStock;
    }

    public void setDefDstStock(Warehouse DefDstStock) {
        this.DefDstStock = DefDstStock;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "DEF_SRC_STOCK_ID")
    @DataItemName("Manufacture.Job.DefSrcStock")
    public Warehouse getDefSrcStock() {
        return this.DefSrcStock;
    }

    public void setDefSrcStock(Warehouse DefSrcStock) {
        this.DefSrcStock = DefSrcStock;
    }

    @Column(name = "JOB_NUMBER", columnDefinition = "CHAR", length = 20)
    @DataItemName("Manufacture.Job.JobNumber")
    public String getJobNumber() {
        return this.JobNumber;
    }

    public void setJobNumber(String JobNumber) {
        this.JobNumber = JobNumber;
    }

    @Column(name = "JOB_DATE", columnDefinition = "TIMESTAMP")
    @DataItemName("Manufacture.Job.JobDate")
    public Date getJobDate() {
        return this.JobDate;
    }

    public void setJobDate(Date JobDate) {
        this.JobDate = JobDate;
    }

    @Column(name = "JOB_STATUS")
    @Enumerated(EnumType.ORDINAL)
    public JobStatus getJobStatus() {
        return this.JobStatus;
    }

    public void setJobStatus(JobStatus JobStatus) {
        this.JobStatus = JobStatus;
    }

    @Column(name = "QTY_RELEASED", columnDefinition = "NUMERIC", precision = 18, scale = 3)
    @DataItemName("Manufacture.Job.QtyReleased")
    public BigDecimal getQtyReleased() {
        return this.QtyReleased;
    }

    public void setQtyReleased(BigDecimal QtyReleased) {
        this.QtyReleased = QtyReleased;
    }

    @Column(name = "QTY_COMPLETE", columnDefinition = "NUMERIC", precision = 18, scale = 3)
    @DataItemName("Manufacture.Job.QtyComplete")
    public BigDecimal getQtyComplete() {
        return this.QtyComplete;
    }

    public void setQtyComplete(BigDecimal QtyComplete) {
        this.QtyComplete = QtyComplete;
    }

    @Column(name = "QTY_SCRAPPED", columnDefinition = "NUMERIC", precision = 18, scale = 3)
    @DataItemName("Manufacture.Job.QtyScrapped")
    public BigDecimal getQtyScrapped() {
        return this.QtyScrapped;
    }

    public void setQtyScrapped(BigDecimal QtyScrapped) {
        this.QtyScrapped = QtyScrapped;
    }

    @Column(name = "ROLLUP_DATETIME", columnDefinition = "TIMESTAMP")
    @DataItemName("Manufacture.Job.RollUpDateTime")
    public Date getRollUpDateTime() {
        return this.RollUpDateTime;
    }

    public void setRollUpDateTime(Date RollUpDateTime) {
        this.RollUpDateTime = RollUpDateTime;
    }

    @Column(name = "START_DATE", columnDefinition = "TIMESTAMP")
    @DataItemName("Manufacture.Job.StartDate")
    public Date getStartDate() {
        return this.StartDate;
    }

    public void setStartDate(Date StartDate) {
        this.StartDate = StartDate;
    }

    @Column(name = "END_DATE", columnDefinition = "TIMESTAMP")
    @DataItemName("Manufacture.Job.EndDate")
    public Date getEndDate() {
        return this.EndDate;
    }

    public void setEndDate(Date EndDate) {
        this.EndDate = EndDate;
    }

    @Column(name = "START_TICK", columnDefinition = "NUMERIC", precision = 18, scale = 0)
    public long getStartTick() {
        return this.StartTick;
    }

    public void setStartTick(long StartTick) {
        this.StartTick = StartTick;
    }

    @Column(name = "END_TICK", columnDefinition = "NUMERIC", precision = 18, scale = 0)
    public long getEndTick() {
        return this.EndTick;
    }

    public void setEndTick(long EndTick) {
        this.EndTick = EndTick;
    }

    @Column(name = "START_JOB", columnDefinition = "NUMERIC", precision = 18, scale = 0)
    @DataItemName("Manufacture.Job.StartJob")
    public long getStartJob() {
        return this.StartJob;
    }

    public void setStartJob(long StartJob) {
        this.StartJob = StartJob;
    }

    @Column(name = "FINISH_JOB", columnDefinition = "NUMERIC", precision = 18, scale = 0)
    @DataItemName("Manufacture.Job.FinishJob")
    public long getFinishJob() {
        return this.FinishJob;
    }

    public void setFinishJob(long FinishJob) {
        this.FinishJob = FinishJob;
    }

    @Column(name = "SCHED_DIRECTION")
    @Enumerated(EnumType.ORDINAL)
    @DataItemName("Manufacture.Job.SchedDirection")
    public ScheduleDirection getSchedDirection() {
        return this.SchedDirection;
    }

    public void setSchedDirection(ScheduleDirection SchedDirection) {
        this.SchedDirection = SchedDirection;
    }

    @Column(name = "USE_MOVE_TIMES", columnDefinition = "SMALLINT")
    @DataItemName("Manufacture.Job.UseMoveTimes")
    public boolean isUseMoveTimes() {
        return this.UseMoveTimes;
    }

    public void setUseMoveTimes(boolean UseMoveTimes) {
        this.UseMoveTimes = UseMoveTimes;
    }

    @Column(name = "USE_QUEUE_TIMES", columnDefinition = "SMALLINT")
    @DataItemName("Manufacture.Job.UseQueueTimes")
    public boolean isUseQueueTimes() {
        return this.UseQueueTimes;
    }

    public void setUseQueueTimes(boolean UseQueueTimes) {
        this.UseQueueTimes = UseQueueTimes;
    }

    @Column(name = "USE_FINITE_CAPACITY", columnDefinition = "SMALLINT")
    @DataItemName("Manufacture.Job.UseFiniteCapacity")
    public boolean isUseFiniteCapacity() {
        return this.UseFiniteCapacity;
    }

    public void setUseFiniteCapacity(boolean UseFiniteCapacity) {
        this.UseFiniteCapacity = UseFiniteCapacity;
    }

    @Column(name = "PRIORITY", columnDefinition = "NUMERIC", precision = 18, scale = 6)
    @DataItemName("Manufacture.Job.Priority")
    public BigDecimal getPriority() {
        return this.Priority;
    }

    public void setPriority(BigDecimal Priority) {
        this.Priority = Priority;
    }

    @Column(name = "PRIORITY_FREEZE_FLAG", columnDefinition = "SMALLINT")
    @DataItemName("Manufacture.Job.PriorityFreezeFlag")
    public boolean isPriorityFreezeFlag() {
        return this.PriorityFreezeFlag;
    }

    public void setPriorityFreezeFlag(boolean PriorityFreezeFlag) {
        this.PriorityFreezeFlag = PriorityFreezeFlag;
    }

    @Column(name = "MRP_END_DATE", columnDefinition = "TIMESTAMP")
    @DataItemName("Manufacture.Job.MrpEndDate")
    public Date getMrpEndDate() {
        return this.MrpEndDate;
    }

    public void setMrpEndDate(Date MrpEndDate) {
        this.MrpEndDate = MrpEndDate;
    }

    @Column(name = "CHANGE_JOB_APPROVED", columnDefinition = "SMALLINT")
    @DataItemName("Manufacture.Job.ChangeJobApproved")
    public boolean isChangeJobApproved() {
        return this.ChangeJobApproved;
    }

    public void setChangeJobApproved(boolean ChangeJobApproved) {
        this.ChangeJobApproved = ChangeJobApproved;
    }

    @Column(name = "COMMENT", columnDefinition = "VARCHAR", length = 256)
    @DataItemName("Manufacture.Job.Comment")
    public String getComment() {
        return this.Comment;
    }

    public void setComment(String Comment) {
        this.Comment = Comment;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "Job")
    public Set<JobRoute> getJobRoutes() {
        return this.JobRoutes;
    }

    public void setJobRoutes(Set<JobRoute> JobRoutes) {
        this.JobRoutes = JobRoutes;
    }
}

