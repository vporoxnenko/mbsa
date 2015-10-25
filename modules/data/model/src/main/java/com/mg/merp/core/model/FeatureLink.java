package com.mg.merp.core.model;

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
 * FeatureLink generated by hbm2java
 */
@Entity
@Table(name = "FEATURELINK")
public class FeatureLink extends com.mg.merp.core.model.AbstractEntity implements java.io.Serializable {

    private int Id;

    private Feature Feature;

    private SysClass SysClass;

    private SysClient SysClient;

    private Integer RecId;

    private String Val;

    private Integer ValFolder;

    private String ValText;

    public FeatureLink() {
    }

    public FeatureLink(Feature Feature, SysClass SysClass) {
        this.Feature = Feature;
        this.SysClass = SysClass;
    }

    public FeatureLink(Feature Feature, SysClass SysClass, SysClient SysClient, Integer RecId, String Val, Integer ValFolder, String ValText) {
        this.Feature = Feature;
        this.SysClass = SysClass;
        this.SysClient = SysClient;
        this.RecId = RecId;
        this.Val = Val;
        this.ValFolder = ValFolder;
        this.ValText = ValText;
    }

    @SequenceGenerator(name = "generator", sequenceName = "FEATURELINK_ID_GEN")
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
    @JoinColumn(name = "FEATURE_ID", nullable = false)
    public Feature getFeature() {
        return this.Feature;
    }

    public void setFeature(Feature Feature) {
        this.Feature = Feature;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CLASS_ID", nullable = false)
    public SysClass getSysClass() {
        return this.SysClass;
    }

    public void setSysClass(SysClass SysClass) {
        this.SysClass = SysClass;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CLIENT_ID")
    public SysClient getSysClient() {
        return this.SysClient;
    }

    public void setSysClient(SysClient SysClient) {
        this.SysClient = SysClient;
    }

    @Column(name = "REC_ID", columnDefinition = "INTEGER")
    public Integer getRecId() {
        return this.RecId;
    }

    public void setRecId(Integer RecId) {
        this.RecId = RecId;
    }

    @Column(name = "VAL", columnDefinition = "VARCHAR", length = 80)
    public String getVal() {
        return this.Val;
    }

    public void setVal(String Val) {
        this.Val = Val;
    }

    @Column(name = "VAL_FOLDER", columnDefinition = "INTEGER")
    public Integer getValFolder() {
        return this.ValFolder;
    }

    public void setValFolder(Integer ValFolder) {
        this.ValFolder = ValFolder;
    }

    @Column(name = "VAL_TEXT", columnDefinition = "VARCHAR", length = 2048)
    public String getValText() {
        return this.ValText;
    }

    public void setValText(String ValText) {
        this.ValText = ValText;
    }
}

