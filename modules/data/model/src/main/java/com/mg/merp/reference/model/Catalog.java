package com.mg.merp.reference.model;
// Generated Sep 28, 2015 11:36:59 PM by Hibernate Tools 3.6.0.Final


import com.mg.framework.support.orm.EnumUserType;
import com.mg.merp.core.model.SysClient;
import java.math.BigDecimal;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

/**
 * Catalog generated by hbm2java
 */
@Entity
@Table(name="CATALOG"
)
public class Catalog extends com.mg.merp.core.model.AbstractEntity implements java.io.Serializable {


     private int Id;
     private Date SysVersion;
     private TaxGroup TaxGroup;
     private Measure WeightMeasure;
     private Measure Measure2;
     private CatalogFolder Folder;
     private SysClient SysClient;
     private Okp Okp;
     private Measure Measure1;
     private Okdp Okdp;
     private Measure VolumeMeasure;
     private String UpCode;
     private String Code;
     private String FullName;
     private EnumUserType GoodType;
     private String BarCode;
     private String PluCode;
     private boolean IsHasWeight;
     private BigDecimal Weight;
     private BigDecimal Volume;
     private BigDecimal MarketingMargin;
     private Short Validity;
     private boolean IsNotInUse;
     private BigDecimal ShelfLife;
     private EnumUserType ShelfLifeMeas;
     private EnumUserType ExpDateCalcKind;
     private String Articul;
     private EnumUserType MeasureControl;
     private boolean Packaged;
     private boolean UseSerialNum;
     private CustomsDeclaration CustomsDeclaration;
     private Country CountryOfOrigin;
     private Set<CatalogPrice> SetOfCatalogPrice = new HashSet<CatalogPrice>(0);
     private Set<SetOfGood> SetOfSetOfGood = new HashSet<SetOfGood>(0);
     private Set<Packing> SetOfPacking = new HashSet<Packing>(0);

    public Catalog() {
    }

	
    public Catalog(String UpCode, String Code, String FullName, EnumUserType GoodType, boolean Packaged) {
        this.UpCode = UpCode;
        this.Code = Code;
        this.FullName = FullName;
        this.GoodType = GoodType;
        this.Packaged = Packaged;
    }
    public Catalog(TaxGroup TaxGroup, Measure WeightMeasure, Measure Measure2, CatalogFolder Folder, SysClient SysClient, Okp Okp, Measure Measure1, Okdp Okdp, Measure VolumeMeasure, String UpCode, String Code, String FullName, EnumUserType GoodType, String BarCode, String PluCode, boolean IsHasWeight, BigDecimal Weight, BigDecimal Volume, BigDecimal MarketingMargin, Short Validity, boolean IsNotInUse, BigDecimal ShelfLife, EnumUserType ShelfLifeMeas, EnumUserType ExpDateCalcKind, String Articul, EnumUserType MeasureControl, boolean Packaged, boolean UseSerialNum, CustomsDeclaration CustomsDeclaration, Country CountryOfOrigin, Set<CatalogPrice> SetOfCatalogPrice, Set<SetOfGood> SetOfSetOfGood, Set<Packing> SetOfPacking) {
       this.TaxGroup = TaxGroup;
       this.WeightMeasure = WeightMeasure;
       this.Measure2 = Measure2;
       this.Folder = Folder;
       this.SysClient = SysClient;
       this.Okp = Okp;
       this.Measure1 = Measure1;
       this.Okdp = Okdp;
       this.VolumeMeasure = VolumeMeasure;
       this.UpCode = UpCode;
       this.Code = Code;
       this.FullName = FullName;
       this.GoodType = GoodType;
       this.BarCode = BarCode;
       this.PluCode = PluCode;
       this.IsHasWeight = IsHasWeight;
       this.Weight = Weight;
       this.Volume = Volume;
       this.MarketingMargin = MarketingMargin;
       this.Validity = Validity;
       this.IsNotInUse = IsNotInUse;
       this.ShelfLife = ShelfLife;
       this.ShelfLifeMeas = ShelfLifeMeas;
       this.ExpDateCalcKind = ExpDateCalcKind;
       this.Articul = Articul;
       this.MeasureControl = MeasureControl;
       this.Packaged = Packaged;
       this.UseSerialNum = UseSerialNum;
       this.CustomsDeclaration = CustomsDeclaration;
       this.CountryOfOrigin = CountryOfOrigin;
       this.SetOfCatalogPrice = SetOfCatalogPrice;
       this.SetOfSetOfGood = SetOfSetOfGood;
       this.SetOfPacking = SetOfPacking;
    }
   
     @SequenceGenerator(name="generator", sequenceName="CATALOG_ID_GEN")@Id @GeneratedValue(strategy=SEQUENCE, generator="generator")

    
    @Column(name="ID", unique=true, nullable=false, columnDefinition="INTEGER")
    public int getId() {
        return this.Id;
    }
    
    public void setId(int Id) {
        this.Id = Id;
    }

    @Version@Temporal(TemporalType.TIMESTAMP)
    @Column(name="SYS_VERSION", nullable=false)
    public Date getSysVersion() {
        return this.SysVersion;
    }
    
    public void setSysVersion(Date SysVersion) {
        this.SysVersion = SysVersion;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="TAXGROUP_ID")
    public TaxGroup getTaxGroup() {
        return this.TaxGroup;
    }
    
    public void setTaxGroup(TaxGroup TaxGroup) {
        this.TaxGroup = TaxGroup;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="WEIGHTMEASURE_ID")
    public Measure getWeightMeasure() {
        return this.WeightMeasure;
    }
    
    public void setWeightMeasure(Measure WeightMeasure) {
        this.WeightMeasure = WeightMeasure;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="MEASURE2_ID")
    public Measure getMeasure2() {
        return this.Measure2;
    }
    
    public void setMeasure2(Measure Measure2) {
        this.Measure2 = Measure2;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="FOLDER_ID")
    public CatalogFolder getFolder() {
        return this.Folder;
    }
    
    public void setFolder(CatalogFolder Folder) {
        this.Folder = Folder;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="CLIENT_ID")
    public SysClient getSysClient() {
        return this.SysClient;
    }
    
    public void setSysClient(SysClient SysClient) {
        this.SysClient = SysClient;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="OKP_ID")
    public Okp getOkp() {
        return this.Okp;
    }
    
    public void setOkp(Okp Okp) {
        this.Okp = Okp;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="MEASURE1_ID")
    public Measure getMeasure1() {
        return this.Measure1;
    }
    
    public void setMeasure1(Measure Measure1) {
        this.Measure1 = Measure1;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="OKDP_CODE")
    public Okdp getOkdp() {
        return this.Okdp;
    }
    
    public void setOkdp(Okdp Okdp) {
        this.Okdp = Okdp;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="VOLUMEMEASURE_ID")
    public Measure getVolumeMeasure() {
        return this.VolumeMeasure;
    }
    
    public void setVolumeMeasure(Measure VolumeMeasure) {
        this.VolumeMeasure = VolumeMeasure;
    }

    
    @Column(name="UPCODE", unique=true, nullable=false, columnDefinition="CHAR", length=20)
    public String getUpCode() {
        return this.UpCode;
    }
    
    public void setUpCode(String UpCode) {
        this.UpCode = UpCode;
    }

    
    @Column(name="CODE", nullable=false, columnDefinition="CHAR", length=20)
    public String getCode() {
        return this.Code;
    }
    
    public void setCode(String Code) {
        this.Code = Code;
    }

    
    @Column(name="CNAME", nullable=false, columnDefinition="VARCHAR", length=80)
    public String getFullName() {
        return this.FullName;
    }
    
    public void setFullName(String FullName) {
        this.FullName = FullName;
    }

    
    @Column(name="GOODTYPE", nullable=false, columnDefinition="SMALLINT")
    public EnumUserType getGoodType() {
        return this.GoodType;
    }
    
    public void setGoodType(EnumUserType GoodType) {
        this.GoodType = GoodType;
    }

    
    @Column(name="BARCODE", columnDefinition="CHAR", length=20)
    public String getBarCode() {
        return this.BarCode;
    }
    
    public void setBarCode(String BarCode) {
        this.BarCode = BarCode;
    }

    
    @Column(name="PLUCODE", columnDefinition="CHAR", length=20)
    public String getPluCode() {
        return this.PluCode;
    }
    
    public void setPluCode(String PluCode) {
        this.PluCode = PluCode;
    }

    
    @Column(name="ISHASWEIGHT", columnDefinition="SMALLINT")
    public boolean isIsHasWeight() {
        return this.IsHasWeight;
    }
    
    public void setIsHasWeight(boolean IsHasWeight) {
        this.IsHasWeight = IsHasWeight;
    }

    
    @Column(name="WEIGHT", columnDefinition="NUMERIC", precision=15, scale=3)
    public BigDecimal getWeight() {
        return this.Weight;
    }
    
    public void setWeight(BigDecimal Weight) {
        this.Weight = Weight;
    }

    
    @Column(name="VOLUME", columnDefinition="NUMERIC", precision=15, scale=3)
    public BigDecimal getVolume() {
        return this.Volume;
    }
    
    public void setVolume(BigDecimal Volume) {
        this.Volume = Volume;
    }

    
    @Column(name="MARKETING_MARGIN", columnDefinition="NUMERIC", precision=18, scale=6)
    public BigDecimal getMarketingMargin() {
        return this.MarketingMargin;
    }
    
    public void setMarketingMargin(BigDecimal MarketingMargin) {
        this.MarketingMargin = MarketingMargin;
    }

    
    @Column(name="VALIDITY", columnDefinition="SMALLINT")
    public Short getValidity() {
        return this.Validity;
    }
    
    public void setValidity(Short Validity) {
        this.Validity = Validity;
    }

    
    @Column(name="ISNOTINUSE", columnDefinition="SMALLINT")
    public boolean isIsNotInUse() {
        return this.IsNotInUse;
    }
    
    public void setIsNotInUse(boolean IsNotInUse) {
        this.IsNotInUse = IsNotInUse;
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

    
    @Column(name="EXPDATE_CALC_KIND", columnDefinition="SMALLINT")
    public EnumUserType getExpDateCalcKind() {
        return this.ExpDateCalcKind;
    }
    
    public void setExpDateCalcKind(EnumUserType ExpDateCalcKind) {
        this.ExpDateCalcKind = ExpDateCalcKind;
    }

    
    @Column(name="ARTICUL", columnDefinition="CHAR", length=20)
    public String getArticul() {
        return this.Articul;
    }
    
    public void setArticul(String Articul) {
        this.Articul = Articul;
    }

    
    @Column(name="MEASURE_CONTROL", columnDefinition="SMALLINT")
    public EnumUserType getMeasureControl() {
        return this.MeasureControl;
    }
    
    public void setMeasureControl(EnumUserType MeasureControl) {
        this.MeasureControl = MeasureControl;
    }

    
    @Column(name="PACKAGED", nullable=false, columnDefinition="SMALLINT")
    public boolean isPackaged() {
        return this.Packaged;
    }
    
    public void setPackaged(boolean Packaged) {
        this.Packaged = Packaged;
    }

    
    @Column(name="USE_SERIAL_NUM", columnDefinition="SMALLINT")
    public boolean isUseSerialNum() {
        return this.UseSerialNum;
    }
    
    public void setUseSerialNum(boolean UseSerialNum) {
        this.UseSerialNum = UseSerialNum;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="CUSTOMS_DECLARATION_ID")
    public CustomsDeclaration getCustomsDeclaration() {
        return this.CustomsDeclaration;
    }
    
    public void setCustomsDeclaration(CustomsDeclaration CustomsDeclaration) {
        this.CustomsDeclaration = CustomsDeclaration;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="COUNTRY_OF_ORIGIN_ID")
    public Country getCountryOfOrigin() {
        return this.CountryOfOrigin;
    }
    
    public void setCountryOfOrigin(Country CountryOfOrigin) {
        this.CountryOfOrigin = CountryOfOrigin;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="Catalog")
    public Set<CatalogPrice> getSetOfCatalogPrice() {
        return this.SetOfCatalogPrice;
    }
    
    public void setSetOfCatalogPrice(Set<CatalogPrice> SetOfCatalogPrice) {
        this.SetOfCatalogPrice = SetOfCatalogPrice;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="CatalogGood")
    public Set<SetOfGood> getSetOfSetOfGood() {
        return this.SetOfSetOfGood;
    }
    
    public void setSetOfSetOfGood(Set<SetOfGood> SetOfSetOfGood) {
        this.SetOfSetOfGood = SetOfSetOfGood;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="Catalog")
    public Set<Packing> getSetOfPacking() {
        return this.SetOfPacking;
    }
    
    public void setSetOfPacking(Set<Packing> SetOfPacking) {
        this.SetOfPacking = SetOfPacking;
    }




}


