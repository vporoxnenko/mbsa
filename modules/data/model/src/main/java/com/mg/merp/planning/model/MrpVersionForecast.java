package com.mg.merp.planning.model;

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
import javax.persistence.Enumerated;
import javax.persistence.EnumType;
import com.mg.framework.api.annotations.DataItemName;

/**
 * MrpVersionForecast generated by hbm2java
 */
@Entity
@Table(name = "PP_MRP_VERSION_FORECAST")
public class MrpVersionForecast extends com.mg.merp.core.model.AbstractEntity implements java.io.Serializable {

    private Integer Id;

    private ForecastVersion ForecastVersion;

    private SysClient SysClient;

    private MrpVersionControl MrpVersionControl;

    private ForecastType ForecastType;

    public MrpVersionForecast() {
    }

    public MrpVersionForecast(ForecastVersion ForecastVersion, SysClient SysClient, MrpVersionControl MrpVersionControl, ForecastType ForecastType) {
        this.ForecastVersion = ForecastVersion;
        this.SysClient = SysClient;
        this.MrpVersionControl = MrpVersionControl;
        this.ForecastType = ForecastType;
    }

    @SequenceGenerator(name = "generator", sequenceName = "PP_MRP_VERSION_FORECAST_ID_GEN")
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
    @JoinColumn(name = "FORECAST_VERSION_ID")
    public ForecastVersion getForecastVersion() {
        return this.ForecastVersion;
    }

    public void setForecastVersion(ForecastVersion ForecastVersion) {
        this.ForecastVersion = ForecastVersion;
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
    @JoinColumn(name = "MRP_VERSION_CONTROL_ID")
    public MrpVersionControl getMrpVersionControl() {
        return this.MrpVersionControl;
    }

    public void setMrpVersionControl(MrpVersionControl MrpVersionControl) {
        this.MrpVersionControl = MrpVersionControl;
    }

    @Column(name = "FORECAST_TYPE")
    @Enumerated(EnumType.ORDINAL)
    public ForecastType getForecastType() {
        return this.ForecastType;
    }

    public void setForecastType(ForecastType ForecastType) {
        this.ForecastType = ForecastType;
    }
}

