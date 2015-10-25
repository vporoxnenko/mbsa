package com.mg.merp.contract.model;

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
import com.mg.framework.api.annotations.DataItemName;

/**
 * ContractType generated by hbm2java
 */
@Entity
@Table(name = "CONTRACT_KIND")
@DataItemName("Contract.ContractType")
public class ContractType extends com.mg.merp.core.model.AbstractEntity implements java.io.Serializable {

    private Integer Id;

    private SysClient SysClient;

    private String Code;

    private String Name;

    public ContractType() {
    }

    public ContractType(String Code, String Name) {
        this.Code = Code;
        this.Name = Name;
    }

    public ContractType(SysClient SysClient, String Code, String Name) {
        this.SysClient = SysClient;
        this.Code = Code;
        this.Name = Name;
    }

    @SequenceGenerator(name = "generator", sequenceName = "CONTRACT_KIND_ID_GEN")
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

    @Column(name = "CODE", nullable = false, columnDefinition = "CHAR", length = 20)
    @DataItemName("Contract.Code")
    public String getCode() {
        return this.Code;
    }

    public void setCode(String Code) {
        this.Code = Code;
    }

    @Column(name = "NAME", nullable = false, columnDefinition = "VARCHAR", length = 80)
    @DataItemName("Contract.Name")
    public String getName() {
        return this.Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }
}

