package com.mg.merp.reference.model;

import com.mg.merp.core.model.SysClient;
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
import javax.persistence.Enumerated;
import javax.persistence.EnumType;

/**
 * PersonAddress generated by hbm2java
 */
@Entity
@Table(name = "REF_PERSON_ADDRESS")
@DataItemName("Reference.PersonAddress")
public class PersonAddress extends com.mg.merp.core.model.AbstractEntity implements java.io.Serializable {

    private int Id;

    private District District;

    private Country Country;

    private NaturalPerson NaturalPerson;

    private SysClient SysClient;

    private Place Place;

    private ZipCode ZipCode;

    private Region Region;

    private PersonAddressKind AddressKind;

    private Date BeginDate;

    private String PostIndex;

    private String RegionName;

    private String City;

    private String Street;

    private String House;

    private String FullAddress;

    private String Building;

    private String Room;

    public PersonAddress() {
    }

    public PersonAddress(District District, Country Country, NaturalPerson NaturalPerson, SysClient SysClient, Place Place, ZipCode ZipCode, Region Region, PersonAddressKind AddressKind, Date BeginDate, String PostIndex, String RegionName, String City, String Street, String House, String FullAddress, String Building, String Room) {
        this.District = District;
        this.Country = Country;
        this.NaturalPerson = NaturalPerson;
        this.SysClient = SysClient;
        this.Place = Place;
        this.ZipCode = ZipCode;
        this.Region = Region;
        this.AddressKind = AddressKind;
        this.BeginDate = BeginDate;
        this.PostIndex = PostIndex;
        this.RegionName = RegionName;
        this.City = City;
        this.Street = Street;
        this.House = House;
        this.FullAddress = FullAddress;
        this.Building = Building;
        this.Room = Room;
    }

    @SequenceGenerator(name = "generator", sequenceName = "REF_PERSON_ADDRESS_ID_GEN")
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
    @JoinColumn(name = "DISTRICT_ID")
    @DataItemName("Reference.District")
    public District getDistrict() {
        return this.District;
    }

    public void setDistrict(District District) {
        this.District = District;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "COUNTRY_ID")
    @DataItemName("Reference.Country")
    public Country getCountry() {
        return this.Country;
    }

    public void setCountry(Country Country) {
        this.Country = Country;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PERSON_ID")
    public NaturalPerson getNaturalPerson() {
        return this.NaturalPerson;
    }

    public void setNaturalPerson(NaturalPerson NaturalPerson) {
        this.NaturalPerson = NaturalPerson;
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
    @JoinColumn(name = "PLACE_ID")
    @DataItemName("Reference.Place")
    public Place getPlace() {
        return this.Place;
    }

    public void setPlace(Place Place) {
        this.Place = Place;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ZIPCODE_ID")
    public ZipCode getZipCode() {
        return this.ZipCode;
    }

    public void setZipCode(ZipCode ZipCode) {
        this.ZipCode = ZipCode;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "REGION_ID")
    @DataItemName("Reference.Region")
    public Region getRegion() {
        return this.Region;
    }

    public void setRegion(Region Region) {
        this.Region = Region;
    }

    @Column(name = "ADDRESS_KIND")
    @Enumerated(EnumType.ORDINAL)
    public PersonAddressKind getAddressKind() {
        return this.AddressKind;
    }

    public void setAddressKind(PersonAddressKind AddressKind) {
        this.AddressKind = AddressKind;
    }

    @Column(name = "BEGINDATE", columnDefinition = "TIMESTAMP")
    @DataItemName("Reference.NPerson.Address.BeginDate")
    public Date getBeginDate() {
        return this.BeginDate;
    }

    public void setBeginDate(Date BeginDate) {
        this.BeginDate = BeginDate;
    }

    @Column(name = "POST_INDEX", columnDefinition = "CHAR", length = 10)
    public String getPostIndex() {
        return this.PostIndex;
    }

    public void setPostIndex(String PostIndex) {
        this.PostIndex = PostIndex;
    }

    @Column(name = "REGION", columnDefinition = "VARCHAR", length = 80)
    public String getRegionName() {
        return this.RegionName;
    }

    public void setRegionName(String RegionName) {
        this.RegionName = RegionName;
    }

    @Column(name = "CITY", columnDefinition = "VARCHAR", length = 80)
    @DataItemName("Reference.City")
    public String getCity() {
        return this.City;
    }

    public void setCity(String City) {
        this.City = City;
    }

    @Column(name = "STREET", columnDefinition = "VARCHAR", length = 128)
    @DataItemName("Reference.Street")
    public String getStreet() {
        return this.Street;
    }

    public void setStreet(String Street) {
        this.Street = Street;
    }

    @Column(name = "HOUSE", columnDefinition = "VARCHAR", length = 20)
    @DataItemName("Reference.House")
    public String getHouse() {
        return this.House;
    }

    public void setHouse(String House) {
        this.House = House;
    }

    @Column(name = "FULL_ADDRESS", columnDefinition = "VARCHAR", length = 256)
    @DataItemName("Reference.NaturalPerson.PersonAddress.FullAddress")
    public String getFullAddress() {
        return this.FullAddress;
    }

    public void setFullAddress(String FullAddress) {
        this.FullAddress = FullAddress;
    }

    @Column(name = "BUILDING", columnDefinition = "VARCHAR", length = 20)
    @DataItemName("Reference.Block")
    public String getBuilding() {
        return this.Building;
    }

    public void setBuilding(String Building) {
        this.Building = Building;
    }

    @Column(name = "ROOM", columnDefinition = "VARCHAR", length = 20)
    @DataItemName("Reference.Flat")
    public String getRoom() {
        return this.Room;
    }

    public void setRoom(String Room) {
        this.Room = Room;
    }
}

