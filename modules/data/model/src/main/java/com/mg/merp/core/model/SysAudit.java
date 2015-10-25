package com.mg.merp.core.model;

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
 * SysAudit generated by hbm2java
 */
@Entity
@Table(name = "SYS_AUDIT")
@DataItemName("Core.SystemAudit")
public class SysAudit extends com.mg.merp.core.model.AbstractEntity implements java.io.Serializable {

    private Long Id;

    private SysClient SysClient;

    private String UserName;

    private Date EventDateTime;

    private String AuditBean;

    private String Operation;

    private String Details;

    public SysAudit() {
    }

    public SysAudit(String UserName, Date EventDateTime, String AuditBean) {
        this.UserName = UserName;
        this.EventDateTime = EventDateTime;
        this.AuditBean = AuditBean;
    }

    public SysAudit(SysClient SysClient, String UserName, Date EventDateTime, String AuditBean, String Operation, String Details) {
        this.SysClient = SysClient;
        this.UserName = UserName;
        this.EventDateTime = EventDateTime;
        this.AuditBean = AuditBean;
        this.Operation = Operation;
        this.Details = Details;
    }

    @SequenceGenerator(name = "generator", sequenceName = "SYS_AUDIT_ID_GEN")
    @Id
    @GeneratedValue(strategy = SEQUENCE, generator = "generator")
    @Column(name = "ID", unique = true, nullable = false, columnDefinition = "NUMERIC", precision = 18, scale = 0)
    @DataItemName("ID")
    public Long getId() {
        return this.Id;
    }

    public void setId(Long Id) {
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

    @Column(name = "USER_NAME", nullable = false)
    @DataItemName("Security.User.Name")
    public String getUserName() {
        return this.UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    @Column(name = "EVENT_DATETIME", nullable = false, columnDefinition = "TIMESTAMP")
    @DataItemName("Core.DatabaseAudit.EventDateTime")
    public Date getEventDateTime() {
        return this.EventDateTime;
    }

    public void setEventDateTime(Date EventDateTime) {
        this.EventDateTime = EventDateTime;
    }

    @Column(name = "AUDIT_BEAN", nullable = false, columnDefinition = "VARCHAR", length = 256)
    @DataItemName("Core.SecurityAudit.AuditBean")
    public String getAuditBean() {
        return this.AuditBean;
    }

    public void setAuditBean(String AuditBean) {
        this.AuditBean = AuditBean;
    }

    @Column(name = "OPERATION", columnDefinition = "VARCHAR", length = 256)
    @DataItemName("Core.SystemAudit.Operation")
    public String getOperation() {
        return this.Operation;
    }

    public void setOperation(String Operation) {
        this.Operation = Operation;
    }

    @Column(name = "DETAILS", columnDefinition = "VARCHAR", length = 1024)
    @DataItemName("Core.Audit.Details")
    public String getDetails() {
        return this.Details;
    }

    public void setDetails(String Details) {
        this.Details = Details;
    }
}

