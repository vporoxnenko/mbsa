package com.mg.merp.salary.model;

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
import com.mg.framework.api.annotations.DataItemName;

/**
 * IncomeKind generated by hbm2java
 */
@Entity
@Table(name = "SAL_INCOMEKIND")
@DataItemName("Salary.IncomeKind")
public class IncomeKind extends com.mg.merp.core.model.AbstractEntity implements java.io.Serializable {

    private int Id;

    private SysClient SysClient;

    private String ICode;

    private String IName;

    private Date BeginDate;

    public IncomeKind() {
    }

    public IncomeKind(String ICode, String IName, Date BeginDate) {
        this.ICode = ICode;
        this.IName = IName;
        this.BeginDate = BeginDate;
    }

    public IncomeKind(SysClient SysClient, String ICode, String IName, Date BeginDate) {
        this.SysClient = SysClient;
        this.ICode = ICode;
        this.IName = IName;
        this.BeginDate = BeginDate;
    }

    @SequenceGenerator(name = "generator", sequenceName = "SAL_INCOMEKIND_ID_GEN")
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
    @JoinColumn(name = "CLIENT_ID")
    public SysClient getSysClient() {
        return this.SysClient;
    }

    public void setSysClient(SysClient SysClient) {
        this.SysClient = SysClient;
    }

    @Column(name = "ICODE", nullable = false, columnDefinition = "CHAR", length = 20)
    @DataItemName("Salary.BigCode")
    public String getICode() {
        return this.ICode;
    }

    public void setICode(String ICode) {
        this.ICode = ICode;
    }

    @Column(name = "INAME", nullable = false, columnDefinition = "VARCHAR", length = 80)
    @DataItemName("Salary.Name")
    public String getIName() {
        return this.IName;
    }

    public void setIName(String IName) {
        this.IName = IName;
    }

    @Column(name = "BEGINDATE", nullable = false, columnDefinition = "TIMESTAMP")
    @DataItemName("Salary.IncomeKind.BeginDate")
    public Date getBeginDate() {
        return this.BeginDate;
    }

    public void setBeginDate(Date BeginDate) {
        this.BeginDate = BeginDate;
    }
}

