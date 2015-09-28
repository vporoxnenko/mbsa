package com.mg.merp.document.model;
// Generated Sep 28, 2015 11:36:59 PM by Hibernate Tools 3.6.0.Final


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
 * DocumentSpecSerialNum generated by hbm2java
 */
@Entity
@Table(name="DOC_SPEC_SERIAL_NUM"
)
public class DocumentSpecSerialNum extends com.mg.merp.core.model.AbstractEntity implements java.io.Serializable {


     private int Id;
     private DocSpec DocSpec;
     private SysClient SysClient;
     private String SerialNum;
     private String Comment;

    public DocumentSpecSerialNum() {
    }

	
    public DocumentSpecSerialNum(String SerialNum) {
        this.SerialNum = SerialNum;
    }
    public DocumentSpecSerialNum(DocSpec DocSpec, SysClient SysClient, String SerialNum, String Comment) {
       this.DocSpec = DocSpec;
       this.SysClient = SysClient;
       this.SerialNum = SerialNum;
       this.Comment = Comment;
    }
   
     @SequenceGenerator(name="generator", sequenceName="DOC_SPEC_SERIAL_NUM_ID_GEN")@Id @GeneratedValue(strategy=SEQUENCE, generator="generator")

    
    @Column(name="ID", unique=true, nullable=false, columnDefinition="INTEGER")
    public int getId() {
        return this.Id;
    }
    
    public void setId(int Id) {
        this.Id = Id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="DOCSPEC_ID")
    public DocSpec getDocSpec() {
        return this.DocSpec;
    }
    
    public void setDocSpec(DocSpec DocSpec) {
        this.DocSpec = DocSpec;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="CLIENT_ID")
    public SysClient getSysClient() {
        return this.SysClient;
    }
    
    public void setSysClient(SysClient SysClient) {
        this.SysClient = SysClient;
    }

    
    @Column(name="SERIAL_NUM", nullable=false, columnDefinition="VARCHAR", length=50)
    public String getSerialNum() {
        return this.SerialNum;
    }
    
    public void setSerialNum(String SerialNum) {
        this.SerialNum = SerialNum;
    }

    
    @Column(name="COMMENT", columnDefinition="VARCHAR", length=256)
    public String getComment() {
        return this.Comment;
    }
    
    public void setComment(String Comment) {
        this.Comment = Comment;
    }




}


