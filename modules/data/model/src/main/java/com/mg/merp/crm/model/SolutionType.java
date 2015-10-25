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

/**
 * SolutionType generated by hbm2java
 */
@Entity
@Table(name = "CRM_SOLUTION_TYPE")
@DataItemName("CRM.SolutionType")
public class SolutionType extends com.mg.merp.core.model.AbstractEntity implements java.io.Serializable {

    private Integer Id;

    private SysClient SysClient;

    private String Code;

    private String Name;

    private Set<Solution> SetOfCrmSolution = new HashSet<Solution>(0);

    public SolutionType() {
    }

    public SolutionType(SysClient SysClient, String Code, String Name, Set<Solution> SetOfCrmSolution) {
        this.SysClient = SysClient;
        this.Code = Code;
        this.Name = Name;
        this.SetOfCrmSolution = SetOfCrmSolution;
    }

    @SequenceGenerator(name = "generator", sequenceName = "CRM_SOLUTION_TYPE_ID_GEN")
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
    @JoinColumn(name = "SOLUTION_TYPE_ID", updatable = false)
    public Set<Solution> getSetOfCrmSolution() {
        return this.SetOfCrmSolution;
    }

    public void setSetOfCrmSolution(Set<Solution> SetOfCrmSolution) {
        this.SetOfCrmSolution = SetOfCrmSolution;
    }
}

