package com.mg.merp.core.model;

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
 * SysClass generated by hbm2java
 */
@Entity
@Table(name = "SYS_CLASS")
@DataItemName("Core.SysClass")
public class SysClass extends com.mg.merp.core.model.AbstractEntity implements java.io.Serializable {

    private Integer Id;

    private SysModule SysModule;

    private String BeanName;

    private String Description;

    private Set<SysMethod> Methods = new HashSet<SysMethod>(0);

    public SysClass() {
    }

    public SysClass(SysModule SysModule, String BeanName, String Description, Set<SysMethod> Methods) {
        this.SysModule = SysModule;
        this.BeanName = BeanName;
        this.Description = Description;
        this.Methods = Methods;
    }

    @SequenceGenerator(name = "generator", sequenceName = "SYS_CLASS_ID_GEN")
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
    @JoinColumn(name = "MODULE_ID")
    public SysModule getSysModule() {
        return this.SysModule;
    }

    public void setSysModule(SysModule SysModule) {
        this.SysModule = SysModule;
    }

    @Column(name = "BEAN_NAME", unique = true, columnDefinition = "VARCHAR", length = 128)
    @DataItemName("Core.BeanName")
    public String getBeanName() {
        return this.BeanName;
    }

    public void setBeanName(String BeanName) {
        this.BeanName = BeanName;
    }

    @Column(name = "DESCRIPTION", columnDefinition = "VARCHAR", length = 256)
    @DataItemName("Core.Description")
    public String getDescription() {
        return this.Description;
    }

    public void setDescription(String Description) {
        this.Description = Description;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "SysClass")
    public Set<SysMethod> getMethods() {
        return this.Methods;
    }

    public void setMethods(Set<SysMethod> Methods) {
        this.Methods = Methods;
    }
}

