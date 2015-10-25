package com.mg.merp.crm.model;

import com.mg.merp.core.model.Folder;
import com.mg.merp.core.model.SysClient;
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
 * Problem generated by hbm2java
 */
@Entity
@Table(name = "CRM_PROBLEM")
@DataItemName("CRM.Problem")
public class Problem extends com.mg.merp.core.model.AbstractEntity implements java.io.Serializable {

    private Integer Id;

    private Folder Folder;

    private SysClient SysClient;

    private ProblemType ProblemType;

    private User Creator;

    private String Name;

    private String Info;

    private String Keywords;

    private Integer Priority;

    private Date ValidFrom;

    private Date ValidTo;

    private Set<LinkSymptomProblem> LinkSymptomProblems = new HashSet<LinkSymptomProblem>(0);

    private Set<LinkProblemSolution> LinkProblemSolutions = new HashSet<LinkProblemSolution>(0);

    private Set<LinkedDocument> LinkedDocs = new HashSet<LinkedDocument>(0);

    public Problem() {
    }

    public Problem(Folder Folder, SysClient SysClient, ProblemType ProblemType, User Creator, String Name, String Info, String Keywords, Integer Priority, Date ValidFrom, Date ValidTo, Set<LinkSymptomProblem> LinkSymptomProblems, Set<LinkProblemSolution> LinkProblemSolutions, Set<LinkedDocument> LinkedDocs) {
        this.Folder = Folder;
        this.SysClient = SysClient;
        this.ProblemType = ProblemType;
        this.Creator = Creator;
        this.Name = Name;
        this.Info = Info;
        this.Keywords = Keywords;
        this.Priority = Priority;
        this.ValidFrom = ValidFrom;
        this.ValidTo = ValidTo;
        this.LinkSymptomProblems = LinkSymptomProblems;
        this.LinkProblemSolutions = LinkProblemSolutions;
        this.LinkedDocs = LinkedDocs;
    }

    @SequenceGenerator(name = "generator", sequenceName = "CRM_PROBLEM_ID_GEN")
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
    @JoinColumn(name = "FOLDER_ID")
    public Folder getFolder() {
        return this.Folder;
    }

    public void setFolder(Folder Folder) {
        this.Folder = Folder;
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
    @JoinColumn(name = "PROBLEM_TYPE_ID")
    public ProblemType getProblemType() {
        return this.ProblemType;
    }

    public void setProblemType(ProblemType ProblemType) {
        this.ProblemType = ProblemType;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CREATOR_ID")
    @DataItemName("CRM.Problem.Creator")
    public User getCreator() {
        return this.Creator;
    }

    public void setCreator(User Creator) {
        this.Creator = Creator;
    }

    @Column(name = "NAME", columnDefinition = "VARCHAR", length = 256)
    @DataItemName("CRM.BigName")
    public String getName() {
        return this.Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    @Column(name = "INFO", columnDefinition = "VARCHAR", length = 2048)
    @DataItemName("CRM.Problem.Info")
    public String getInfo() {
        return this.Info;
    }

    public void setInfo(String Info) {
        this.Info = Info;
    }

    @Column(name = "KEYWORDS", columnDefinition = "VARCHAR", length = 256)
    @DataItemName("CRM.Problem.Keywords")
    public String getKeywords() {
        return this.Keywords;
    }

    public void setKeywords(String Keywords) {
        this.Keywords = Keywords;
    }

    @Column(name = "PRIORITY", columnDefinition = "INTEGER")
    @DataItemName("CRM.Problem.Priority")
    public Integer getPriority() {
        return this.Priority;
    }

    public void setPriority(Integer Priority) {
        this.Priority = Priority;
    }

    @Column(name = "VALID_FROM", columnDefinition = "TIMESTAMP")
    @DataItemName("CRM.Solution.ValidFrom")
    public Date getValidFrom() {
        return this.ValidFrom;
    }

    public void setValidFrom(Date ValidFrom) {
        this.ValidFrom = ValidFrom;
    }

    @Column(name = "VALID_TO", columnDefinition = "TIMESTAMP")
    @DataItemName("CRM.Solution.ValidTo")
    public Date getValidTo() {
        return this.ValidTo;
    }

    public void setValidTo(Date ValidTo) {
        this.ValidTo = ValidTo;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "unresolved")
    public Set<LinkSymptomProblem> getLinkSymptomProblems() {
        return this.LinkSymptomProblems;
    }

    public void setLinkSymptomProblems(Set<LinkSymptomProblem> LinkSymptomProblems) {
        this.LinkSymptomProblems = LinkSymptomProblems;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "unresolved")
    public Set<LinkProblemSolution> getLinkProblemSolutions() {
        return this.LinkProblemSolutions;
    }

    public void setLinkProblemSolutions(Set<LinkProblemSolution> LinkProblemSolutions) {
        this.LinkProblemSolutions = LinkProblemSolutions;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "Problem")
    public Set<LinkedDocument> getLinkedDocs() {
        return this.LinkedDocs;
    }

    public void setLinkedDocs(Set<LinkedDocument> LinkedDocs) {
        this.LinkedDocs = LinkedDocs;
    }
}

