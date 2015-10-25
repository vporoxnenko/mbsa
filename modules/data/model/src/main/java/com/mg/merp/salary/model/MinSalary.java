package com.mg.merp.salary.model;

import com.mg.merp.core.model.SysClient;
import java.math.BigDecimal;
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
 * MinSalary generated by hbm2java
 */
@Entity
@Table(name = "SAL_MINSALARY")
public class MinSalary extends com.mg.merp.core.model.AbstractEntity implements java.io.Serializable {

    private int Id;

    private SysClient SysClient;

    private Date BeginDate;

    private BigDecimal MinSalary;

    public MinSalary() {
    }

    public MinSalary(Date BeginDate, BigDecimal MinSalary) {
        this.BeginDate = BeginDate;
        this.MinSalary = MinSalary;
    }

    public MinSalary(SysClient SysClient, Date BeginDate, BigDecimal MinSalary) {
        this.SysClient = SysClient;
        this.BeginDate = BeginDate;
        this.MinSalary = MinSalary;
    }

    @SequenceGenerator(name = "generator", sequenceName = "SAL_MINSALARY_ID_GEN")
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

    @Column(name = "BEGINDATE", unique = true, nullable = false, columnDefinition = "TIMESTAMP")
    @DataItemName("Salary.MinSal.BeginDate")
    public Date getBeginDate() {
        return this.BeginDate;
    }

    public void setBeginDate(Date BeginDate) {
        this.BeginDate = BeginDate;
    }

    @Column(name = "MINSALARY", nullable = false, columnDefinition = "NUMERIC", precision = 15, scale = 4)
    @DataItemName("Salary.MinSal.MinSalary")
    public BigDecimal getMinSalary() {
        return this.MinSalary;
    }

    public void setMinSalary(BigDecimal MinSalary) {
        this.MinSalary = MinSalary;
    }
}

