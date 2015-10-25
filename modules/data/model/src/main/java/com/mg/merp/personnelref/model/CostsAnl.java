package com.mg.merp.personnelref.model;

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

/**
 * CostsAnl generated by hbm2java
 */
@Entity
@Table(name = "PREF_COSTS_ANL")
public class CostsAnl extends com.mg.merp.core.model.AbstractEntity implements java.io.Serializable {

    private Integer Id;

    private CostsAnl Parent;

    private SysClient SysClient;

    private String ACode;

    private String AName;

    private short AnlLevel;

    private Set<CostsAnl> SetOfPrefCostsAnl = new HashSet<CostsAnl>(0);

    public CostsAnl() {
    }

    public CostsAnl(String ACode, short AnlLevel) {
        this.ACode = ACode;
        this.AnlLevel = AnlLevel;
    }

    public CostsAnl(CostsAnl Parent, SysClient SysClient, String ACode, String AName, short AnlLevel, Set<CostsAnl> SetOfPrefCostsAnl) {
        this.Parent = Parent;
        this.SysClient = SysClient;
        this.ACode = ACode;
        this.AName = AName;
        this.AnlLevel = AnlLevel;
        this.SetOfPrefCostsAnl = SetOfPrefCostsAnl;
    }

    @SequenceGenerator(name = "generator", sequenceName = "PREF_COSTS_ANL_ID_GEN")
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
    @JoinColumn(name = "PARENT_ID")
    @DataItemName("PersonnelRef.CostsAnl.Parent")
    public CostsAnl getParent() {
        return this.Parent;
    }

    public void setParent(CostsAnl Parent) {
        this.Parent = Parent;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CLIENT_ID")
    public SysClient getSysClient() {
        return this.SysClient;
    }

    public void setSysClient(SysClient SysClient) {
        this.SysClient = SysClient;
    }

    @Column(name = "ACODE", nullable = false, columnDefinition = "CHAR", length = 20)
    @DataItemName("PersonnelRef.CostsAnl.ACode")
    public String getACode() {
        return this.ACode;
    }

    public void setACode(String ACode) {
        this.ACode = ACode;
    }

    @Column(name = "ANAME", columnDefinition = "VARCHAR", length = 80)
    @DataItemName("PersonnelRef.CostsAnl.AName")
    public String getAName() {
        return this.AName;
    }

    public void setAName(String AName) {
        this.AName = AName;
    }

    @Column(name = "ANLLEVEL", nullable = false, columnDefinition = "SMALLINT")
    @DataItemName("PersonnelRef.CostsAnl.AnlLevel")
    public short getAnlLevel() {
        return this.AnlLevel;
    }

    public void setAnlLevel(short AnlLevel) {
        this.AnlLevel = AnlLevel;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "Parent")
    public Set<CostsAnl> getSetOfPrefCostsAnl() {
        return this.SetOfPrefCostsAnl;
    }

    public void setSetOfPrefCostsAnl(Set<CostsAnl> SetOfPrefCostsAnl) {
        this.SetOfPrefCostsAnl = SetOfPrefCostsAnl;
    }
}

