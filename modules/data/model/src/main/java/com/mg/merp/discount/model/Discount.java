package com.mg.merp.discount.model;
// Generated Sep 28, 2015 11:36:59 PM by Hibernate Tools 3.6.0.Final


import com.mg.merp.baiengine.model.Repository;
import com.mg.merp.core.model.Folder;
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
 * Discount generated by hbm2java
 */
@Entity
@Table(name="DISCOUNT"
)
public class Discount extends com.mg.merp.core.model.AbstractEntity implements java.io.Serializable {


     private Integer Id;
     private Repository Alg;
     private Folder Folder;
     private SysClient SysClient;
     private String DName;
     private String Formula;

    public Discount() {
    }

    public Discount(Repository Alg, Folder Folder, SysClient SysClient, String DName, String Formula) {
       this.Alg = Alg;
       this.Folder = Folder;
       this.SysClient = SysClient;
       this.DName = DName;
       this.Formula = Formula;
    }
   
     @SequenceGenerator(name="generator", sequenceName="DISCOUNT_ID_GEN")@Id @GeneratedValue(strategy=SEQUENCE, generator="generator")

    
    @Column(name="ID", unique=true, columnDefinition="INTEGER")
    public Integer getId() {
        return this.Id;
    }
    
    public void setId(Integer Id) {
        this.Id = Id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="ALG_ID")
    public Repository getAlg() {
        return this.Alg;
    }
    
    public void setAlg(Repository Alg) {
        this.Alg = Alg;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="FOLDER_ID")
    public Folder getFolder() {
        return this.Folder;
    }
    
    public void setFolder(Folder Folder) {
        this.Folder = Folder;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="CLIENT_ID")
    public SysClient getSysClient() {
        return this.SysClient;
    }
    
    public void setSysClient(SysClient SysClient) {
        this.SysClient = SysClient;
    }

    
    @Column(name="DNAME", columnDefinition="VARCHAR", length=80)
    public String getDName() {
        return this.DName;
    }
    
    public void setDName(String DName) {
        this.DName = DName;
    }

    
    @Column(name="FORMULA", columnDefinition="VARCHAR", length=2048)
    public String getFormula() {
        return this.Formula;
    }
    
    public void setFormula(String Formula) {
        this.Formula = Formula;
    }




}


