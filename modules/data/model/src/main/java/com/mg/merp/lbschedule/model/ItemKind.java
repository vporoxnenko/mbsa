package com.mg.merp.lbschedule.model;

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
 * ItemKind generated by hbm2java
 */
@Entity
@Table(name = "LS_ITEMKIND")
@DataItemName("LbSchedule.ItemKind")
public class ItemKind extends com.mg.merp.core.model.AbstractEntity implements java.io.Serializable {

    private Integer Id;

    private SysClient SysClient;

    private String Name;

    private String Code;

    private Set<Item> SetOfLsItem = new HashSet<Item>(0);

    public ItemKind() {
    }

    public ItemKind(String Code) {
        this.Code = Code;
    }

    public ItemKind(SysClient SysClient, String Name, String Code, Set<Item> SetOfLsItem) {
        this.SysClient = SysClient;
        this.Name = Name;
        this.Code = Code;
        this.SetOfLsItem = SetOfLsItem;
    }

    @SequenceGenerator(name = "generator", sequenceName = "LS_ITEMKIND_ID_GEN")
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

    @Column(name = "NAME", columnDefinition = "VARCHAR", length = 80)
    @DataItemName("LbSchedule.Schedule.Name")
    public String getName() {
        return this.Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    @Column(name = "CODE", unique = true, nullable = false, columnDefinition = "CHAR", length = 20)
    @DataItemName("LbSchedule.Code")
    public String getCode() {
        return this.Code;
    }

    public void setCode(String Code) {
        this.Code = Code;
    }

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "ITEMKIND_ID", updatable = false)
    public Set<Item> getSetOfLsItem() {
        return this.SetOfLsItem;
    }

    public void setSetOfLsItem(Set<Item> SetOfLsItem) {
        this.SetOfLsItem = SetOfLsItem;
    }
}

