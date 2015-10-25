package com.mg.merp.planning.model;

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
 * MrpVersionMps generated by hbm2java
 */
@Entity
@Table(name = "PP_MRP_VERSION_MPS")
public class MrpVersionMps extends com.mg.merp.core.model.AbstractEntity implements java.io.Serializable {

    private Integer Id;

    private SysClient SysClient;

    private MrpVersionControl MrpVersionControl;

    private Mps Mps;

    public MrpVersionMps() {
    }

    public MrpVersionMps(SysClient SysClient, MrpVersionControl MrpVersionControl, Mps Mps) {
        this.SysClient = SysClient;
        this.MrpVersionControl = MrpVersionControl;
        this.Mps = Mps;
    }

    @SequenceGenerator(name = "generator", sequenceName = "PP_MRP_VERSION_MPS_ID_GEN")
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
    @JoinColumn(name = "MRP_VERSION_CONTROL_ID")
    public MrpVersionControl getMrpVersionControl() {
        return this.MrpVersionControl;
    }

    public void setMrpVersionControl(MrpVersionControl MrpVersionControl) {
        this.MrpVersionControl = MrpVersionControl;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "MPS_ID", columnDefinition = "INTEGER")
    public Mps getMps() {
        return this.Mps;
    }

    public void setMps(Mps Mps) {
        this.Mps = Mps;
    }
}

