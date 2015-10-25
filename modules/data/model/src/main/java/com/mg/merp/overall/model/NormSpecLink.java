package com.mg.merp.overall.model;

import com.mg.merp.core.model.SysClient;
import com.mg.merp.reference.model.Catalog;
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
 * NormSpecLink generated by hbm2java
 */
@Entity
@Table(name = "OVR_NORM_SPEC_LINK")
public class NormSpecLink extends com.mg.merp.core.model.AbstractEntity implements java.io.Serializable {

    private Integer Id;

    private Catalog Catalog;

    private NormSpec OvrNormSpec;

    private SysClient SysClient;

    public NormSpecLink() {
    }

    public NormSpecLink(Catalog Catalog, NormSpec OvrNormSpec, SysClient SysClient) {
        this.Catalog = Catalog;
        this.OvrNormSpec = OvrNormSpec;
        this.SysClient = SysClient;
    }

    @SequenceGenerator(name = "generator", sequenceName = "OVR_NORM_SPEC_LINK_ID_GEN")
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
    @JoinColumn(name = "OVR_NORM_SPEC_ID")
    public NormSpec getOvrNormSpec() {
        return this.OvrNormSpec;
    }

    public void setOvrNormSpec(NormSpec OvrNormSpec) {
        this.OvrNormSpec = OvrNormSpec;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CLIENT_ID")
    public SysClient getSysClient() {
        return this.SysClient;
    }

    public void setSysClient(SysClient SysClient) {
        this.SysClient = SysClient;
    }
}

