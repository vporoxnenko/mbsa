package com.mg.merp.planning.model;

import com.mg.merp.core.model.SysClient;
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
import com.mg.framework.api.annotations.DataItemName;

/**
 * ForecastVersion generated by hbm2java
 */
@Entity
@Table(name = "PP_FORECAST_VERSION")
@DataItemName("Planning.ForecastVersion")
public class ForecastVersion extends com.mg.merp.core.model.AbstractEntity implements java.io.Serializable {

    private Integer Id;

    private SysClient SysClient;

    private String Code;

    private String Description;

    private Set<PlanningForecast> PlanningForecasts = new HashSet<PlanningForecast>(0);

    public ForecastVersion() {
    }

    public ForecastVersion(SysClient SysClient, String Code, String Description, Set<PlanningForecast> PlanningForecasts) {
        this.SysClient = SysClient;
        this.Code = Code;
        this.Description = Description;
        this.PlanningForecasts = PlanningForecasts;
    }

    @SequenceGenerator(name = "generator", sequenceName = "PP_FORECAST_VERSION_ID_GEN")
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

    @Column(name = "CODE", columnDefinition = "CHAR", length = 20)
    @DataItemName("Planning.ForecastVersion.Code")
    public String getCode() {
        return this.Code;
    }

    public void setCode(String Code) {
        this.Code = Code;
    }

    @Column(name = "DESCRIPTION", columnDefinition = "VARCHAR", length = 80)
    @DataItemName("Planning.Description")
    public String getDescription() {
        return this.Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "ForecastVersion")
    public Set<PlanningForecast> getPlanningForecasts() {
        return this.PlanningForecasts;
    }

    public void setPlanningForecasts(Set<PlanningForecast> PlanningForecasts) {
        this.PlanningForecasts = PlanningForecasts;
    }
}

