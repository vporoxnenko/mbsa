package com.mg.merp.lbschedule.model;

import com.mg.merp.core.model.Folder;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * ScheduleConfig generated by hbm2java
 */
@Entity
@Table(name = "LS_CONFIG")
public class ScheduleConfig extends com.mg.merp.core.model.AbstractEntity implements java.io.Serializable {

    private int SysClientId;

    private Folder Folder;

    public ScheduleConfig() {
    }

    public ScheduleConfig(int SysClientId) {
        this.SysClientId = SysClientId;
    }

    public ScheduleConfig(int SysClientId, Folder Folder) {
        this.SysClientId = SysClientId;
        this.Folder = Folder;
    }

    @Id
    @Column(name = "CLIENT_ID", unique = true, columnDefinition = "INTEGER")
    public int getSysClientId() {
        return this.SysClientId;
    }

    public void setSysClientId(int SysClientId) {
        this.SysClientId = SysClientId;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "DEFAULT_FOLDER_ID")
    @DataItemName("Lbschedule.FolderModel.Folder")
    public Folder getFolder() {
        return this.Folder;
    }

    public void setFolder(Folder Folder) {
        this.Folder = Folder;
    }
}

