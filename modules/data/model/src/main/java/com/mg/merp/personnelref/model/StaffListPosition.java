package com.mg.merp.personnelref.model;

import com.mg.merp.core.model.SysClient;
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
 * StaffListPosition generated by hbm2java
 */
@Entity
@Table(name = "PREF_STAFF_LIST_POSITION")
//$NON-NLS-1$
@DataItemName("PersonnelRef.StaffListPosition")
public class StaffListPosition extends com.mg.merp.core.model.AbstractEntity implements java.io.Serializable {

    private Integer Id;

    private CostsAnl CostsAnl1;

    private WorkCondition WorkCondition;

    private CostsAnl CostsAnl3;

    private CostsAnl CostsAnl2;

    private StaffCategory StaffCategory;

    private CostsAnl CostsAnl4;

    private SysClient SysClient;

    private TaxCalcKind TaxCalcKind;

    private PrefPosition Position;

    private CostsAnl CostsAnl5;

    private WorkSchedule WorkSchedule;

    private StaffListUnit StaffListUnit;

    private String SlPositionUniqueId;

    private Date BeginDate;

    private Date EndDate;

    private BigDecimal RateNumber;

    private Integer HolidayNumber;

    public StaffListPosition() {
    }

    public StaffListPosition(String SlPositionUniqueId) {
        this.SlPositionUniqueId = SlPositionUniqueId;
    }

    public StaffListPosition(CostsAnl CostsAnl1, WorkCondition WorkCondition, CostsAnl CostsAnl3, CostsAnl CostsAnl2, StaffCategory StaffCategory, CostsAnl CostsAnl4, SysClient SysClient, TaxCalcKind TaxCalcKind, PrefPosition Position, CostsAnl CostsAnl5, WorkSchedule WorkSchedule, StaffListUnit StaffListUnit, String SlPositionUniqueId, Date BeginDate, Date EndDate, BigDecimal RateNumber, Integer HolidayNumber) {
        this.CostsAnl1 = CostsAnl1;
        this.WorkCondition = WorkCondition;
        this.CostsAnl3 = CostsAnl3;
        this.CostsAnl2 = CostsAnl2;
        this.StaffCategory = StaffCategory;
        this.CostsAnl4 = CostsAnl4;
        this.SysClient = SysClient;
        this.TaxCalcKind = TaxCalcKind;
        this.Position = Position;
        this.CostsAnl5 = CostsAnl5;
        this.WorkSchedule = WorkSchedule;
        this.StaffListUnit = StaffListUnit;
        this.SlPositionUniqueId = SlPositionUniqueId;
        this.BeginDate = BeginDate;
        this.EndDate = EndDate;
        this.RateNumber = RateNumber;
        this.HolidayNumber = HolidayNumber;
    }

    @SequenceGenerator(name = "generator", sequenceName = "PREF_STAFF_LIST_POSITION_ID_GEN")
    @Id
    @GeneratedValue(strategy = SEQUENCE, generator = "generator")
    @Column(name = "ID", unique = true, columnDefinition = "INTEGER")
    //$NON-NLS-1$
    @DataItemName("ID")
    public Integer getId() {
        return this.Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "COSTS_ANL1_ID")
    //$NON-NLS-1$
    @DataItemName("Personnelref.CostsAnl1")
    public CostsAnl getCostsAnl1() {
        return this.CostsAnl1;
    }

    public void setCostsAnl1(CostsAnl CostsAnl1) {
        this.CostsAnl1 = CostsAnl1;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "WORKCONDITION_ID")
    public WorkCondition getWorkCondition() {
        return this.WorkCondition;
    }

    public void setWorkCondition(WorkCondition WorkCondition) {
        this.WorkCondition = WorkCondition;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "COSTS_ANL3_ID")
    //$NON-NLS-1$
    @DataItemName("Personnelref.CostsAnl3")
    public CostsAnl getCostsAnl3() {
        return this.CostsAnl3;
    }

    public void setCostsAnl3(CostsAnl CostsAnl3) {
        this.CostsAnl3 = CostsAnl3;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "COSTS_ANL2_ID")
    //$NON-NLS-1$
    @DataItemName("Personnelref.CostsAnl2")
    public CostsAnl getCostsAnl2() {
        return this.CostsAnl2;
    }

    public void setCostsAnl2(CostsAnl CostsAnl2) {
        this.CostsAnl2 = CostsAnl2;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "STAFFCATEGORY_ID")
    public StaffCategory getStaffCategory() {
        return this.StaffCategory;
    }

    public void setStaffCategory(StaffCategory StaffCategory) {
        this.StaffCategory = StaffCategory;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "COSTS_ANL4_ID")
    //$NON-NLS-1$
    @DataItemName("Personnelref.CostsAnl4")
    public CostsAnl getCostsAnl4() {
        return this.CostsAnl4;
    }

    public void setCostsAnl4(CostsAnl CostsAnl4) {
        this.CostsAnl4 = CostsAnl4;
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
    @JoinColumn(name = "TAX_CALC_KIND_ID")
    public TaxCalcKind getTaxCalcKind() {
        return this.TaxCalcKind;
    }

    public void setTaxCalcKind(TaxCalcKind TaxCalcKind) {
        this.TaxCalcKind = TaxCalcKind;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "POSITION_ID")
    public PrefPosition getPosition() {
        return this.Position;
    }

    public void setPosition(PrefPosition Position) {
        this.Position = Position;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "COSTS_ANL5_ID")
    //$NON-NLS-1$
    @DataItemName("Personnelref.CostsAnl5")
    public CostsAnl getCostsAnl5() {
        return this.CostsAnl5;
    }

    public void setCostsAnl5(CostsAnl CostsAnl5) {
        this.CostsAnl5 = CostsAnl5;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "WORK_SCHEDULE_ID")
    public WorkSchedule getWorkSchedule() {
        return this.WorkSchedule;
    }

    public void setWorkSchedule(WorkSchedule WorkSchedule) {
        this.WorkSchedule = WorkSchedule;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "STAFFLISTUNIT_ID")
    public StaffListUnit getStaffListUnit() {
        return this.StaffListUnit;
    }

    public void setStaffListUnit(StaffListUnit StaffListUnit) {
        this.StaffListUnit = StaffListUnit;
    }

    @Column(name = "SL_POSITION_UNIQUE_ID", nullable = false, columnDefinition = "CHAR", length = 20)
    //$NON-NLS-1$
    @DataItemName("PersonnelRef.Position.SlPositionUniqueId")
    public String getSlPositionUniqueId() {
        return this.SlPositionUniqueId;
    }

    public void setSlPositionUniqueId(String SlPositionUniqueId) {
        this.SlPositionUniqueId = SlPositionUniqueId;
    }

    @Column(name = "BEGINDATE", columnDefinition = "TIMESTAMP")
    //$NON-NLS-1$
    @DataItemName("PersonnelRef.Position.BeginDate")
    public Date getBeginDate() {
        return this.BeginDate;
    }

    public void setBeginDate(Date BeginDate) {
        this.BeginDate = BeginDate;
    }

    @Column(name = "ENDDATE", columnDefinition = "TIMESTAMP")
    //$NON-NLS-1$
    @DataItemName("PersonnelRef.Position.EndDate")
    public Date getEndDate() {
        return this.EndDate;
    }

    public void setEndDate(Date EndDate) {
        this.EndDate = EndDate;
    }

    @Column(name = "RATE_NUMBER", columnDefinition = "NUMERIC", precision = 18, scale = 6)
    //$NON-NLS-1$
    @DataItemName("PersonnelRef.Position.RateNumber")
    public BigDecimal getRateNumber() {
        return this.RateNumber;
    }

    public void setRateNumber(BigDecimal RateNumber) {
        this.RateNumber = RateNumber;
    }

    @Column(name = "HOLIDAY_NUMBER", columnDefinition = "INTEGER")
    //$NON-NLS-1$
    @DataItemName("PersonnelRef.Position.HolidayNumber")
    public Integer getHolidayNumber() {
        return this.HolidayNumber;
    }

    public void setHolidayNumber(Integer HolidayNumber) {
        this.HolidayNumber = HolidayNumber;
    }
}

