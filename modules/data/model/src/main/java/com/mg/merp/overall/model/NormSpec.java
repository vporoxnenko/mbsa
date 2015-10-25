package com.mg.merp.overall.model;

import com.mg.merp.core.model.SysClient;
import com.mg.merp.reference.model.TimePeriodKind;
import java.math.BigDecimal;
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
 * NormSpec generated by hbm2java
 */
@Entity
@Table(name = "OVR_NORM_SPEC")
public class NormSpec extends com.mg.merp.core.model.AbstractEntity implements java.io.Serializable {

    private int Id;

    private NormHead OvrNormHead;

    private SysClient SysClient;

    private String OvrNormSpecName;

    private String MeasureUpCode;

    private CatalogGroupsType CatalogGroupsTypeId;

    private BigDecimal ShelfLife;

    private TimePeriodKind ShelfLifeMeas;

    private BasicNormKind IsBasic;

    private PeriodicNormKind IsPeriodic;

    private boolean IsDinch;

    private String DinchFormula;

    private String DocName;

    private BigDecimal Quantity;

    private Set<NormSpecDocSpecLink> NormSpecDocSpecLinks = new HashSet<NormSpecDocSpecLink>(0);

    private Set<NormSpecLink> NormSpecLinks = new HashSet<NormSpecLink>(0);

    public NormSpec() {
    }

    public NormSpec(String OvrNormSpecName) {
        this.OvrNormSpecName = OvrNormSpecName;
    }

    public NormSpec(NormHead OvrNormHead, SysClient SysClient, String OvrNormSpecName, String MeasureUpCode, CatalogGroupsType CatalogGroupsTypeId, BigDecimal ShelfLife, TimePeriodKind ShelfLifeMeas, BasicNormKind IsBasic, PeriodicNormKind IsPeriodic, boolean IsDinch, String DinchFormula, String DocName, BigDecimal Quantity, Set<NormSpecDocSpecLink> NormSpecDocSpecLinks, Set<NormSpecLink> NormSpecLinks) {
        this.OvrNormHead = OvrNormHead;
        this.SysClient = SysClient;
        this.OvrNormSpecName = OvrNormSpecName;
        this.MeasureUpCode = MeasureUpCode;
        this.CatalogGroupsTypeId = CatalogGroupsTypeId;
        this.ShelfLife = ShelfLife;
        this.ShelfLifeMeas = ShelfLifeMeas;
        this.IsBasic = IsBasic;
        this.IsPeriodic = IsPeriodic;
        this.IsDinch = IsDinch;
        this.DinchFormula = DinchFormula;
        this.DocName = DocName;
        this.Quantity = Quantity;
        this.NormSpecDocSpecLinks = NormSpecDocSpecLinks;
        this.NormSpecLinks = NormSpecLinks;
    }

    @SequenceGenerator(name = "generator", sequenceName = "OVR_NORM_SPEC_ID_GEN")
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
    @JoinColumn(name = "OVR_NORM_HEAD_ID")
    public NormHead getOvrNormHead() {
        return this.OvrNormHead;
    }

    public void setOvrNormHead(NormHead OvrNormHead) {
        this.OvrNormHead = OvrNormHead;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CLIENT_ID")
    public SysClient getSysClient() {
        return this.SysClient;
    }

    public void setSysClient(SysClient SysClient) {
        this.SysClient = SysClient;
    }

    @Column(name = "OVR_NORM_SPEC_NAME", nullable = false, columnDefinition = "VARCHAR", length = 80)
    @DataItemName("Overall.Spec.Name")
    public String getOvrNormSpecName() {
        return this.OvrNormSpecName;
    }

    public void setOvrNormSpecName(String OvrNormSpecName) {
        this.OvrNormSpecName = OvrNormSpecName;
    }

    @Column(name = "MEASURE_UPCODE", columnDefinition = "CHAR", length = 5)
    @DataItemName("Overall.Spec.MeasureUpCode")
    public String getMeasureUpCode() {
        return this.MeasureUpCode;
    }

    public void setMeasureUpCode(String MeasureUpCode) {
        this.MeasureUpCode = MeasureUpCode;
    }

    @Column(name = "CATALOG_GROUPS_TYPE_ID")
    @Enumerated(EnumType.ORDINAL)
    public CatalogGroupsType getCatalogGroupsTypeId() {
        return this.CatalogGroupsTypeId;
    }

    public void setCatalogGroupsTypeId(CatalogGroupsType CatalogGroupsTypeId) {
        this.CatalogGroupsTypeId = CatalogGroupsTypeId;
    }

    @Column(name = "SHELFLIFE", columnDefinition = "NUMERIC", precision = 18, scale = 3)
    @DataItemName("Overall.Spec.Shelflife")
    public BigDecimal getShelfLife() {
        return this.ShelfLife;
    }

    public void setShelfLife(BigDecimal ShelfLife) {
        this.ShelfLife = ShelfLife;
    }

    @Column(name = "SHELFLIFE_MEAS")
    @Enumerated(EnumType.ORDINAL)
    @DataItemName("Overall.Spec.ShelfLifeMeas")
    public TimePeriodKind getShelfLifeMeas() {
        return this.ShelfLifeMeas;
    }

    public void setShelfLifeMeas(TimePeriodKind ShelfLifeMeas) {
        this.ShelfLifeMeas = ShelfLifeMeas;
    }

    @Column(name = "ISBASIC", columnDefinition = "INTEGER")
    public BasicNormKind isBasic() {
        return this.IsBasic;
    }

    public void setBasic(BasicNormKind IsBasic) {
        this.IsBasic = IsBasic;
    }

    @Column(name = "ISPERIODIC", columnDefinition = "INTEGER")
    public PeriodicNormKind isPeriodic() {
        return this.IsPeriodic;
    }

    public void setPeriodic(PeriodicNormKind IsPeriodic) {
        this.IsPeriodic = IsPeriodic;
    }

    @Column(name = "ISDINCH", columnDefinition = "INTEGER")
    @DataItemName("Overall.Spec.IsDinch")
    public boolean isDinch() {
        return this.IsDinch;
    }

    public void setDinch(boolean IsDinch) {
        this.IsDinch = IsDinch;
    }

    @Column(name = "DINCH_FORMULA", columnDefinition = "VARCHAR", length = 2048)
    @DataItemName("Overall.Spec.DinchFormula")
    public String getDinchFormula() {
        return this.DinchFormula;
    }

    public void setDinchFormula(String DinchFormula) {
        this.DinchFormula = DinchFormula;
    }

    @Column(name = "DOC_NAME", columnDefinition = "VARCHAR", length = 256)
    @DataItemName("Overall.Spec.DocName")
    public String getDocName() {
        return this.DocName;
    }

    public void setDocName(String DocName) {
        this.DocName = DocName;
    }

    @Column(name = "QUANTITY", columnDefinition = "NUMERIC", precision = 18, scale = 3)
    @DataItemName("Overall.Spec.Quantity")
    public BigDecimal getQuantity() {
        return this.Quantity;
    }

    public void setQuantity(BigDecimal Quantity) {
        this.Quantity = Quantity;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "OvrNormSpec")
    public Set<NormSpecDocSpecLink> getNormSpecDocSpecLinks() {
        return this.NormSpecDocSpecLinks;
    }

    public void setNormSpecDocSpecLinks(Set<NormSpecDocSpecLink> NormSpecDocSpecLinks) {
        this.NormSpecDocSpecLinks = NormSpecDocSpecLinks;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "OvrNormSpec")
    public Set<NormSpecLink> getNormSpecLinks() {
        return this.NormSpecLinks;
    }

    public void setNormSpecLinks(Set<NormSpecLink> NormSpecLinks) {
        this.NormSpecLinks = NormSpecLinks;
    }
}

