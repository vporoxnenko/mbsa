package com.mg.merp.salary.model;

import com.mg.merp.core.model.SysClient;
import com.mg.merp.personnelref.model.CalcPeriod;
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
import com.mg.framework.api.annotations.DataItemName;

/**
 * PayRoll generated by hbm2java
 */
@Entity
@Table(name = "SAL_PAY_ROLL")
public class PayRoll extends com.mg.merp.core.model.AbstractEntity implements java.io.Serializable {

    private Integer Id;

    private SysClient SysClient;

    private CalcPeriod CalcPeriod;

    private RollKind RollKind;

    private String Number;

    private String Name;

    private String DocType;

    private String DocNumber;

    private Date DocDate;

    private String Comments;

    private Date CalcBeginDate;

    private Date CalcEndDate;

    private Set<CalcList> SetOfSalCalcList = new HashSet<CalcList>(0);

    public PayRoll() {
    }

    public PayRoll(String Number) {
        this.Number = Number;
    }

    public PayRoll(SysClient SysClient, CalcPeriod CalcPeriod, RollKind RollKind, String Number, String Name, String DocType, String DocNumber, Date DocDate, String Comments, Date CalcBeginDate, Date CalcEndDate, Set<CalcList> SetOfSalCalcList) {
        this.SysClient = SysClient;
        this.CalcPeriod = CalcPeriod;
        this.RollKind = RollKind;
        this.Number = Number;
        this.Name = Name;
        this.DocType = DocType;
        this.DocNumber = DocNumber;
        this.DocDate = DocDate;
        this.Comments = Comments;
        this.CalcBeginDate = CalcBeginDate;
        this.CalcEndDate = CalcEndDate;
        this.SetOfSalCalcList = SetOfSalCalcList;
    }

    @SequenceGenerator(name = "generator", sequenceName = "SAL_PAY_ROLL_ID_GEN")
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

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CALC_PERIOD_ID")
    public CalcPeriod getCalcPeriod() {
        return this.CalcPeriod;
    }

    public void setCalcPeriod(CalcPeriod CalcPeriod) {
        this.CalcPeriod = CalcPeriod;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ROLL_KIND_ID")
    public RollKind getRollKind() {
        return this.RollKind;
    }

    public void setRollKind(RollKind RollKind) {
        this.RollKind = RollKind;
    }

    @Column(name = "RNUMBER", nullable = false, columnDefinition = "CHAR", length = 20)
    @DataItemName("Salary.PayRoll.Number")
    public String getNumber() {
        return this.Number;
    }

    public void setNumber(String Number) {
        this.Number = Number;
    }

    @Column(name = "RNAME", columnDefinition = "VARCHAR", length = 80)
    @DataItemName("Salary.Name")
    public String getName() {
        return this.Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    @Column(name = "DOCTYPE", columnDefinition = "CHAR", length = 15)
    @DataItemName("Salary.PayRoll.DocType")
    public String getDocType() {
        return this.DocType;
    }

    public void setDocType(String DocType) {
        this.DocType = DocType;
    }

    @Column(name = "DOCNUMBER", columnDefinition = "CHAR", length = 20)
    @DataItemName("Salary.PayRoll.DocNumber")
    public String getDocNumber() {
        return this.DocNumber;
    }

    public void setDocNumber(String DocNumber) {
        this.DocNumber = DocNumber;
    }

    @Column(name = "DOCDATE", columnDefinition = "TIMESTAMP")
    @DataItemName("Salary.PayRoll.DocDate")
    public Date getDocDate() {
        return this.DocDate;
    }

    public void setDocDate(Date DocDate) {
        this.DocDate = DocDate;
    }

    @Column(name = "COMMENTS", columnDefinition = "VARCHAR", length = 256)
    @DataItemName("Salary.PayRoll.Comments")
    public String getComments() {
        return this.Comments;
    }

    public void setComments(String Comments) {
        this.Comments = Comments;
    }

    @Column(name = "CALC_BEGINDATE", columnDefinition = "TIMESTAMP")
    @DataItemName("Salary.PayRoll.CalcBeginDate")
    public Date getCalcBeginDate() {
        return this.CalcBeginDate;
    }

    public void setCalcBeginDate(Date CalcBeginDate) {
        this.CalcBeginDate = CalcBeginDate;
    }

    @Column(name = "CALC_ENDDATE", columnDefinition = "TIMESTAMP")
    @DataItemName("Salary.PayRoll.CalcEndDate")
    public Date getCalcEndDate() {
        return this.CalcEndDate;
    }

    public void setCalcEndDate(Date CalcEndDate) {
        this.CalcEndDate = CalcEndDate;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "PayRoll")
    public Set<CalcList> getSetOfSalCalcList() {
        return this.SetOfSalCalcList;
    }

    public void setSetOfSalCalcList(Set<CalcList> SetOfSalCalcList) {
        this.SetOfSalCalcList = SetOfSalCalcList;
    }
}

