package com.mg.merp.baiengine.model;

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

/**
 * ConstantValue generated by hbm2java
 */
@Entity
@Table(name = "ALG_CONST_VAL")
public class ConstantValue extends com.mg.merp.core.model.AbstractEntity implements java.io.Serializable {

    private Integer Id;

    private Constant Const;

    private SysClient SysClient;

    private String Val;

    private Date StartDate;

    public ConstantValue() {
    }

    public ConstantValue(Constant Const, SysClient SysClient, String Val, Date StartDate) {
        this.Const = Const;
        this.SysClient = SysClient;
        this.Val = Val;
        this.StartDate = StartDate;
    }

    @SequenceGenerator(name = "generator", sequenceName = "ALG_CONST_VAL_ID_GEN")
    @Id
    @GeneratedValue(strategy = SEQUENCE, generator = "generator")
    @Column(name = "ID", unique = true, columnDefinition = "INTEGER")
    //$NON-NLS-1$
    @DataItemName("ID")
    public Integer getId() {
        return this.Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CONST_ID")
    public Constant getConst() {
        return this.Const;
    }

    public void setConst(Constant Const) {
        this.Const = Const;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CLIENT_ID")
    public SysClient getSysClient() {
        return this.SysClient;
    }

    public void setSysClient(SysClient SysClient) {
        this.SysClient = SysClient;
    }

    @Column(name = "VAL", columnDefinition = "VARCHAR", length = 80)
    //$NON-NLS-1$
    @DataItemName("BAi.ConstValue.Value")
    public String getVal() {
        return this.Val;
    }

    public void setVal(String Val) {
        this.Val = Val;
    }

    @Column(name = "STARTDATE", columnDefinition = "TIMESTAMP")
    //$NON-NLS-1$
    @DataItemName("BAi.ConstValue.StartDate")
    public Date getStartDate() {
        return this.StartDate;
    }

    public void setStartDate(Date StartDate) {
        this.StartDate = StartDate;
    }
}

