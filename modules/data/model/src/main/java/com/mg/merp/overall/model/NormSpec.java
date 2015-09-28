package com.mg.merp.overall.model;
// Generated Sep 28, 2015 11:36:59 PM by Hibernate Tools 3.6.0.Final


import com.mg.framework.support.orm.EnumUserType;
import com.mg.merp.core.model.SysClient;
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

/**
 * NormSpec generated by hbm2java
 */
@Entity
@Table(name="OVR_NORM_SPEC"
)
public class NormSpec extends com.mg.merp.core.model.AbstractEntity implements java.io.Serializable {


     private int Id;
     private NormHead OvrNormHead;
     private SysClient SysClient;
     private String OvrNormSpecName;
     private String MeasureUpCode;
     private EnumUserType CatalogGroupsTypeId;
     private BigDecimal ShelfLife;
     private EnumUserType ShelfLifeMeas;
     private EnumUserType IsBasic;
     private EnumUserType IsPeriodic;
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
    public NormSpec(NormHead OvrNormHead, SysClient SysClient, String OvrNormSpecName, String MeasureUpCode, EnumUserType CatalogGroupsTypeId, BigDecimal ShelfLife, EnumUserType ShelfLifeMeas, EnumUserType IsBasic, EnumUserType IsPeriodic, boolean IsDinch, String DinchFormula, String DocName, BigDecimal Quantity, Set<NormSpecDocSpecLink> NormSpecDocSpecLinks, Set<NormSpecLink> NormSpecLinks) {
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
   
     @SequenceGenerator(name="generator", sequenceName="OVR_NORM_SPEC_ID_GEN")@Id @GeneratedValue(strategy=SEQUENCE, generator="generator")

    
    @Column(name="ID", unique=true, nullable=false, columnDefinition="INTEGER")
    public int getId() {
        return this.Id;
    }
    
    public void setId(int Id) {
        this.Id = Id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="OVR_NORM_HEAD_ID")
    public NormHead getOvrNormHead() {
        return this.OvrNormHead;
    }
    
    public void setOvrNormHead(NormHead OvrNormHead) {
        this.OvrNormHead = OvrNormHead;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="CLIENT_ID")
    public SysClient getSysClient() {
        return this.SysClient;
    }
    
    public void setSysClient(SysClient SysClient) {
        this.SysClient = SysClient;
    }

    
    @Column(name="OVR_NORM_SPEC_NAME", nullable=false, columnDefinition="VARCHAR", length=80)
    public String getOvrNormSpecName() {
        return this.OvrNormSpecName;
    }
    
    public void setOvrNormSpecName(String OvrNormSpecName) {
        this.OvrNormSpecName = OvrNormSpecName;
    }

    
    @Column(name="MEASURE_UPCODE", columnDefinition="CHAR", length=5)
    public String getMeasureUpCode() {
        return this.MeasureUpCode;
    }
    
    public void setMeasureUpCode(String MeasureUpCode) {
        this.MeasureUpCode = MeasureUpCode;
    }

    
    @Column(name="CATALOG_GROUPS_TYPE_ID", columnDefinition="SMALLINT")
    public EnumUserType getCatalogGroupsTypeId() {
        return this.CatalogGroupsTypeId;
    }
    
    public void setCatalogGroupsTypeId(EnumUserType CatalogGroupsTypeId) {
        this.CatalogGroupsTypeId = CatalogGroupsTypeId;
    }

    
    @Column(name="SHELFLIFE", columnDefinition="NUMERIC", precision=18, scale=3)
    public BigDecimal getShelfLife() {
        return this.ShelfLife;
    }
    
    public void setShelfLife(BigDecimal ShelfLife) {
        this.ShelfLife = ShelfLife;
    }

    
    @Column(name="SHELFLIFE_MEAS", columnDefinition="SMALLINT")
    public EnumUserType getShelfLifeMeas() {
        return this.ShelfLifeMeas;
    }
    
    public void setShelfLifeMeas(EnumUserType ShelfLifeMeas) {
        this.ShelfLifeMeas = ShelfLifeMeas;
    }

    
    @Column(name="ISBASIC", columnDefinition="INTEGER")
    public EnumUserType getIsBasic() {
        return this.IsBasic;
    }
    
    public void setIsBasic(EnumUserType IsBasic) {
        this.IsBasic = IsBasic;
    }

    
    @Column(name="ISPERIODIC", columnDefinition="INTEGER")
    public EnumUserType getIsPeriodic() {
        return this.IsPeriodic;
    }
    
    public void setIsPeriodic(EnumUserType IsPeriodic) {
        this.IsPeriodic = IsPeriodic;
    }

    
    @Column(name="ISDINCH", columnDefinition="INTEGER")
    public boolean isIsDinch() {
        return this.IsDinch;
    }
    
    public void setIsDinch(boolean IsDinch) {
        this.IsDinch = IsDinch;
    }

    
    @Column(name="DINCH_FORMULA", columnDefinition="VARCHAR", length=2048)
    public String getDinchFormula() {
        return this.DinchFormula;
    }
    
    public void setDinchFormula(String DinchFormula) {
        this.DinchFormula = DinchFormula;
    }

    
    @Column(name="DOC_NAME", columnDefinition="VARCHAR", length=256)
    public String getDocName() {
        return this.DocName;
    }
    
    public void setDocName(String DocName) {
        this.DocName = DocName;
    }

    
    @Column(name="QUANTITY", columnDefinition="NUMERIC", precision=18, scale=3)
    public BigDecimal getQuantity() {
        return this.Quantity;
    }
    
    public void setQuantity(BigDecimal Quantity) {
        this.Quantity = Quantity;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="OvrNormSpec")
    public Set<NormSpecDocSpecLink> getNormSpecDocSpecLinks() {
        return this.NormSpecDocSpecLinks;
    }
    
    public void setNormSpecDocSpecLinks(Set<NormSpecDocSpecLink> NormSpecDocSpecLinks) {
        this.NormSpecDocSpecLinks = NormSpecDocSpecLinks;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="OvrNormSpec")
    public Set<NormSpecLink> getNormSpecLinks() {
        return this.NormSpecLinks;
    }
    
    public void setNormSpecLinks(Set<NormSpecLink> NormSpecLinks) {
        this.NormSpecLinks = NormSpecLinks;
    }




}


