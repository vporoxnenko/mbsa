package com.mg.merp.crm.model;

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
 * ProblemType generated by hbm2java
 */
@Entity
@Table(name = "CRM_PROBLEM_TYPE")
@DataItemName("CRM.ProblemType")
public class ProblemType extends com.mg.merp.core.model.AbstractEntity implements java.io.Serializable {

    private Integer Id;

    private SysClient SysClient;

    private String Code;

    private String Name;

    private Set<Problem> SetOfCrmProblem = new HashSet<Problem>(0);

    public ProblemType() {
    }

    public ProblemType(SysClient SysClient, String Code, String Name, Set<Problem> SetOfCrmProblem) {
        this.SysClient = SysClient;
        this.Code = Code;
        this.Name = Name;
        this.SetOfCrmProblem = SetOfCrmProblem;
    }

    @SequenceGenerator(name = "generator", sequenceName = "CRM_PROBLEM_TYPE_ID_GEN")
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

    @Column(name = "CODE", columnDefinition = "CHAR", length = 20)
    @DataItemName("CRM.Code")
    public String getCode() {
        return this.Code;
    }

    public void setCode(String Code) {
        this.Code = Code;
    }

    @Column(name = "NAME", columnDefinition = "VARCHAR", length = 256)
    @DataItemName("CRM.Name")
    public String getName() {
        return this.Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    @OneToMany(fetch = FetchType.LAZY)
    @JoinColumn(name = "PROBLEM_TYPE_ID", updatable = false)
    public Set<Problem> getSetOfCrmProblem() {
        return this.SetOfCrmProblem;
    }

    public void setSetOfCrmProblem(Set<Problem> SetOfCrmProblem) {
        this.SetOfCrmProblem = SetOfCrmProblem;
    }
}

