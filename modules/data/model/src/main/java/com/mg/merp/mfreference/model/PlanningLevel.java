package com.mg.merp.mfreference.model;

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
 * PlanningLevel generated by hbm2java
 */
@Entity
@Table(name = "PP_PLANNING_LEVEL")
@DataItemName("MfReference.PlanningLevel")
public class PlanningLevel extends com.mg.merp.core.model.AbstractEntity implements java.io.Serializable {

    private Integer Id;

    private SysClient SysClient;

    private Short PlanningLevelNum;

    private String Description;

    private Short TimeFence;

    public PlanningLevel() {
    }

    public PlanningLevel(SysClient SysClient, Short PlanningLevelNum, String Description, Short TimeFence) {
        this.SysClient = SysClient;
        this.PlanningLevelNum = PlanningLevelNum;
        this.Description = Description;
        this.TimeFence = TimeFence;
    }

    @SequenceGenerator(name = "generator", sequenceName = "PP_PLANNING_LEVEL_ID_GEN")
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

    @Column(name = "PLANNING_LEVEL_NUM", columnDefinition = "SMALLINT")
    @DataItemName("MfReference.PlanningLevel.PlanningLevelNum")
    public Short getPlanningLevelNum() {
        return this.PlanningLevelNum;
    }

    public void setPlanningLevelNum(Short PlanningLevelNum) {
        this.PlanningLevelNum = PlanningLevelNum;
    }

    @Column(name = "DESCRIPTION", columnDefinition = "VARCHAR", length = 80)
    @DataItemName("MfReference.PlanningLevel.Descr")
    public String getDescription() {
        return this.Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    @Column(name = "TIME_FENCE", columnDefinition = "SMALLINT")
    @DataItemName("MfReference.PlanningLevel.TimeFence")
    public Short getTimeFence() {
        return this.TimeFence;
    }

    public void setTimeFence(Short TimeFence) {
        this.TimeFence = TimeFence;
    }
}

