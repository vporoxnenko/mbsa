package com.mg.merp.reference.model;

import com.mg.merp.baiengine.model.Repository;
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
 * MeasureConversion generated by hbm2java
 */
@Entity
@Table(name = "REF_MEASURE_CONV")
@DataItemName("Reference.MeasureConversion")
public class MeasureConversion extends com.mg.merp.core.model.AbstractEntity implements java.io.Serializable {

    private int Id;

    private Catalog Catalog;

    private Measure MeasureFrom;

    private SysClient SysClient;

    private Measure MeasureTo;

    private Repository AlgRepository;

    public MeasureConversion() {
    }

    public MeasureConversion(Catalog Catalog, Measure MeasureFrom, SysClient SysClient, Measure MeasureTo, Repository AlgRepository) {
        this.Catalog = Catalog;
        this.MeasureFrom = MeasureFrom;
        this.SysClient = SysClient;
        this.MeasureTo = MeasureTo;
        this.AlgRepository = AlgRepository;
    }

    @SequenceGenerator(name = "generator", sequenceName = "REF_MEASURE_CONV_ID_GEN")
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
    @JoinColumn(name = "CATALOG_ID")
    public Catalog getCatalog() {
        return this.Catalog;
    }

    public void setCatalog(Catalog Catalog) {
        this.Catalog = Catalog;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MEASURE_FROM_ID")
    @DataItemName("Reference.MConvert.MeasureFrom")
    public Measure getMeasureFrom() {
        return this.MeasureFrom;
    }

    public void setMeasureFrom(Measure MeasureFrom) {
        this.MeasureFrom = MeasureFrom;
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
    @JoinColumn(name = "MEASURE_TO_ID")
    @DataItemName("Reference.MConvert.MeasureTo")
    public Measure getMeasureTo() {
        return this.MeasureTo;
    }

    public void setMeasureTo(Measure MeasureTo) {
        this.MeasureTo = MeasureTo;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CONV_ALGORITHM_ID")
    @DataItemName("Reference.MConvert.AlgRepository")
    public Repository getAlgRepository() {
        return this.AlgRepository;
    }

    public void setAlgRepository(Repository AlgRepository) {
        this.AlgRepository = AlgRepository;
    }
}

