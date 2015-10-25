package com.mg.merp.personnelref.model;

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
 * PositionFillKind generated by hbm2java
 */
@Entity
@Table(name = "PREF_POSITION_FILL_KIND")
@DataItemName("PersonnelRef.PositionFillKind")
public class PositionFillKind extends com.mg.merp.core.model.AbstractEntity implements java.io.Serializable {

    private Integer Id;

    private SysClient SysClient;

    private String KCode;

    private Integer Priority;

    public PositionFillKind() {
    }

    public PositionFillKind(String KCode) {
        this.KCode = KCode;
    }

    public PositionFillKind(SysClient SysClient, String KCode, Integer Priority) {
        this.SysClient = SysClient;
        this.KCode = KCode;
        this.Priority = Priority;
    }

    @SequenceGenerator(name = "generator", sequenceName = "PREF_POSITION_FILL_KIND_ID_GEN")
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

    @Column(name = "KCODE", unique = true, nullable = false, columnDefinition = "CHAR", length = 20)
    @DataItemName("PersonnelRef.PosFillKind.KCode")
    public String getKCode() {
        return this.KCode;
    }

    public void setKCode(String KCode) {
        this.KCode = KCode;
    }

    @Column(name = "PRIORITY", columnDefinition = "INTEGER")
    @DataItemName("PersonnelRef.PosFillKind.Prior")
    public Integer getPriority() {
        return this.Priority;
    }

    public void setPriority(Integer Priority) {
        this.Priority = Priority;
    }
}

