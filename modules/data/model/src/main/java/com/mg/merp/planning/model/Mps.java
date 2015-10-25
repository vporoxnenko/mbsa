package com.mg.merp.planning.model;

import com.mg.merp.core.model.SysClient;
import com.mg.merp.mfreference.model.PlanningLevel;
import com.mg.merp.mfreference.model.WeekCalendar;
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
 * Mps generated by hbm2java
 */
@Entity
@Table(name = "PP_MPS")
@DataItemName("Planning.MPS")
public class Mps extends com.mg.merp.core.model.AbstractEntity implements java.io.Serializable {

    private Integer Id;

    private InventoryForecast InventoryForecast;

    private PlanningLevel PlanningLevel;

    private ForecastVersion ForecastVersion;

    private WeekCalendar WeekCal;

    private SysClient SysClient;

    private String Code;

    private Date DemandFenceDate;

    private String Description;

    private Date PlanningDate;

    private Short LevelProcessedTo;

    private boolean Production;

    private boolean ProfileApplied;

    private boolean PurchasesForecasts;

    private boolean PurchasesLive;

    private boolean QtyOnHand;

    private boolean SalesForecasts;

    private boolean SalesLive;

    private boolean WarehouseTransfers;

    private Integer MpsVersion;

    private Date LastRunDateTime;

    public Mps() {
    }

    public Mps(InventoryForecast InventoryForecast, PlanningLevel PlanningLevel, ForecastVersion ForecastVersion, WeekCalendar WeekCal, SysClient SysClient, String Code, Date DemandFenceDate, String Description, Date PlanningDate, Short LevelProcessedTo, boolean Production, boolean ProfileApplied, boolean PurchasesForecasts, boolean PurchasesLive, boolean QtyOnHand, boolean SalesForecasts, boolean SalesLive, boolean WarehouseTransfers, Integer MpsVersion, Date LastRunDateTime) {
        this.InventoryForecast = InventoryForecast;
        this.PlanningLevel = PlanningLevel;
        this.ForecastVersion = ForecastVersion;
        this.WeekCal = WeekCal;
        this.SysClient = SysClient;
        this.Code = Code;
        this.DemandFenceDate = DemandFenceDate;
        this.Description = Description;
        this.PlanningDate = PlanningDate;
        this.LevelProcessedTo = LevelProcessedTo;
        this.Production = Production;
        this.ProfileApplied = ProfileApplied;
        this.PurchasesForecasts = PurchasesForecasts;
        this.PurchasesLive = PurchasesLive;
        this.QtyOnHand = QtyOnHand;
        this.SalesForecasts = SalesForecasts;
        this.SalesLive = SalesLive;
        this.WarehouseTransfers = WarehouseTransfers;
        this.MpsVersion = MpsVersion;
        this.LastRunDateTime = LastRunDateTime;
    }

    @SequenceGenerator(name = "generator", sequenceName = "PP_MPS_ID_GEN")
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
    @JoinColumn(name = "INVENTORY_FORECAST_ID")
    @DataItemName("Planning.MPS.InventoryForecast")
    public InventoryForecast getInventoryForecast() {
        return this.InventoryForecast;
    }

    public void setInventoryForecast(InventoryForecast InventoryForecast) {
        this.InventoryForecast = InventoryForecast;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PLANNING_LEVEL_ID")
    @DataItemName("Planning.MPS.PlanningLevel")
    public PlanningLevel getPlanningLevel() {
        return this.PlanningLevel;
    }

    public void setPlanningLevel(PlanningLevel PlanningLevel) {
        this.PlanningLevel = PlanningLevel;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "FORECAST_VERSION_ID")
    @DataItemName("Planning.MPS.ForecastVersion")
    public ForecastVersion getForecastVersion() {
        return this.ForecastVersion;
    }

    public void setForecastVersion(ForecastVersion ForecastVersion) {
        this.ForecastVersion = ForecastVersion;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "WEEK_CAL_ID")
    @DataItemName("Planning.MPS.WeekCal")
    public WeekCalendar getWeekCal() {
        return this.WeekCal;
    }

    public void setWeekCal(WeekCalendar WeekCal) {
        this.WeekCal = WeekCal;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CLIENT_ID")
    public SysClient getSysClient() {
        return this.SysClient;
    }

    public void setSysClient(SysClient SysClient) {
        this.SysClient = SysClient;
    }

    @Column(name = "CODE", columnDefinition = "CHAR", length = 20)
    @DataItemName("Planning.Code")
    public String getCode() {
        return this.Code;
    }

    public void setCode(String Code) {
        this.Code = Code;
    }

    @Column(name = "DEMAND_FENCE_DATE", columnDefinition = "TIMESTAMP")
    @DataItemName("Planning.MPS.DemandFenceDate")
    public Date getDemandFenceDate() {
        return this.DemandFenceDate;
    }

    public void setDemandFenceDate(Date DemandFenceDate) {
        this.DemandFenceDate = DemandFenceDate;
    }

    @Column(name = "DESCRIPTION", columnDefinition = "VARCHAR", length = 80)
    @DataItemName("Planning.Description")
    public String getDescription() {
        return this.Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    @Column(name = "PLANNING_DATE", columnDefinition = "TIMESTAMP")
    @DataItemName("Planning.MPS.PlanningDate")
    public Date getPlanningDate() {
        return this.PlanningDate;
    }

    public void setPlanningDate(Date PlanningDate) {
        this.PlanningDate = PlanningDate;
    }

    @Column(name = "PP_LEVEL_PROCESSED_TO", columnDefinition = "SMALLINT")
    @DataItemName("Planning.MPS.PpLevelProcessedTo")
    public Short getLevelProcessedTo() {
        return this.LevelProcessedTo;
    }

    public void setLevelProcessedTo(Short LevelProcessedTo) {
        this.LevelProcessedTo = LevelProcessedTo;
    }

    @Column(name = "PRODUCTION", columnDefinition = "SMALLINT")
    @DataItemName("Planning.MPS.Production")
    public boolean isProduction() {
        return this.Production;
    }

    public void setProduction(boolean Production) {
        this.Production = Production;
    }

    @Column(name = "PROFILE_APPLIED", columnDefinition = "SMALLINT")
    @DataItemName("Planning.MPS.ProfileApplied")
    public boolean isProfileApplied() {
        return this.ProfileApplied;
    }

    public void setProfileApplied(boolean ProfileApplied) {
        this.ProfileApplied = ProfileApplied;
    }

    @Column(name = "PURCHASES_FORECASTS", columnDefinition = "SMALLINT")
    @DataItemName("Planning.MPS.PurchasesForecasts")
    public boolean isPurchasesForecasts() {
        return this.PurchasesForecasts;
    }

    public void setPurchasesForecasts(boolean PurchasesForecasts) {
        this.PurchasesForecasts = PurchasesForecasts;
    }

    @Column(name = "PURCHASES_LIVE", columnDefinition = "SMALLINT")
    @DataItemName("Planning.MPS.PurchasesLive")
    public boolean isPurchasesLive() {
        return this.PurchasesLive;
    }

    public void setPurchasesLive(boolean PurchasesLive) {
        this.PurchasesLive = PurchasesLive;
    }

    @Column(name = "QTY_ON_HAND", columnDefinition = "SMALLINT")
    @DataItemName("Planning.MPS.QtyOnHand")
    public boolean isQtyOnHand() {
        return this.QtyOnHand;
    }

    public void setQtyOnHand(boolean QtyOnHand) {
        this.QtyOnHand = QtyOnHand;
    }

    @Column(name = "SALES_FORECASTS", columnDefinition = "SMALLINT")
    @DataItemName("Planning.MPS.SalesForecasts")
    public boolean isSalesForecasts() {
        return this.SalesForecasts;
    }

    public void setSalesForecasts(boolean SalesForecasts) {
        this.SalesForecasts = SalesForecasts;
    }

    @Column(name = "SALES_LIVE", columnDefinition = "SMALLINT")
    @DataItemName("Planning.MPS.SalesLive")
    public boolean isSalesLive() {
        return this.SalesLive;
    }

    public void setSalesLive(boolean SalesLive) {
        this.SalesLive = SalesLive;
    }

    @Column(name = "WAREHOUSE_TRANSFERS", columnDefinition = "SMALLINT")
    @DataItemName("Planning.MPS.WarehouseTransfers")
    public boolean isWarehouseTransfers() {
        return this.WarehouseTransfers;
    }

    public void setWarehouseTransfers(boolean WarehouseTransfers) {
        this.WarehouseTransfers = WarehouseTransfers;
    }

    @Column(name = "MPS_VERSION", columnDefinition = "INTEGER")
    @DataItemName("Planning.MPSVersion")
    public Integer getMpsVersion() {
        return this.MpsVersion;
    }

    public void setMpsVersion(Integer MpsVersion) {
        this.MpsVersion = MpsVersion;
    }

    @Column(name = "LAST_RUN_DATETIME", columnDefinition = "TIMESTAMP")
    @DataItemName("Planning.MPS.LastRunDateTime")
    public Date getLastRunDateTime() {
        return this.LastRunDateTime;
    }

    public void setLastRunDateTime(Date LastRunDateTime) {
        this.LastRunDateTime = LastRunDateTime;
    }
}

