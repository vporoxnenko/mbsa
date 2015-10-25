package com.mg.merp.docprocess.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * StageAction generated by hbm2java
 */
@Entity
@Table(name = "DP_STAGE_ACTION")
@DataItemName("DocFlow.StageAction")
public class StageAction extends com.mg.merp.core.model.AbstractEntity implements java.io.Serializable {

    private int Id;

    private String Name;

    private boolean CreateDoc;

    public StageAction() {
    }

    public StageAction(int Id, String Name, boolean CreateDoc) {
        this.Id = Id;
        this.Name = Name;
        this.CreateDoc = CreateDoc;
    }

    @Id
    @Column(name = "ID", unique = true, nullable = false, columnDefinition = "INTEGER")
    @DataItemName("ID")
    public int getId() {
        return this.Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    @Column(name = "NAME", nullable = false, columnDefinition = "VARCHAR", length = 80)
    @DataItemName("DocFlow.StageAction.Name")
    public String getName() {
        return this.Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    @Column(name = "CREATEDOC_FLAG", nullable = false, columnDefinition = "SMALLINT")
    @DataItemName("DocFlow.StageAction.CreateDoc")
    public boolean isCreateDoc() {
        return this.CreateDoc;
    }

    public void setCreateDoc(boolean CreateDoc) {
        this.CreateDoc = CreateDoc;
    }
}

