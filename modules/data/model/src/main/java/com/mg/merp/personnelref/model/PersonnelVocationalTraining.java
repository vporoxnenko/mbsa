package com.mg.merp.personnelref.model;

import com.mg.merp.core.model.SysClient;
import com.mg.merp.humanresources.model.Order;
import com.mg.merp.reference.model.OriginalDocument;
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
 * PersonnelVocationalTraining generated by hbm2java
 */
@Entity
@Table(name = "PREF_PERS_VOCATIONAL_TRAINING")
public class PersonnelVocationalTraining extends com.mg.merp.core.model.AbstractEntity implements java.io.Serializable {

    private Integer Id;

    private Speciality Speciality;

    private Order Order;

    private Personnel Personnel;

    private SysClient SysClient;

    private OriginalDocument CertificateDocument;

    private Date TrainingBeginDate;

    private Date TrainingEndDate;

    public PersonnelVocationalTraining() {
    }

    public PersonnelVocationalTraining(Speciality Speciality) {
        this.Speciality = Speciality;
    }

    public PersonnelVocationalTraining(Speciality Speciality, Order Order, Personnel Personnel, SysClient SysClient, OriginalDocument CertificateDocument, Date TrainingBeginDate, Date TrainingEndDate) {
        this.Speciality = Speciality;
        this.Order = Order;
        this.Personnel = Personnel;
        this.SysClient = SysClient;
        this.CertificateDocument = CertificateDocument;
        this.TrainingBeginDate = TrainingBeginDate;
        this.TrainingEndDate = TrainingEndDate;
    }

    @SequenceGenerator(name = "generator", sequenceName = "PREF_PERS_VOCATNL_TRAIN_ID_GEN")
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
    @JoinColumn(name = "SPECIALITY_ID", nullable = false)
    @DataItemName("PersonnelRef.Vocat.Speciality")
    public Speciality getSpeciality() {
        return this.Speciality;
    }

    public void setSpeciality(Speciality Speciality) {
        this.Speciality = Speciality;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ORDER_ID")
    public Order getOrder() {
        return this.Order;
    }

    public void setOrder(Order Order) {
        this.Order = Order;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "PERSONNEL_ID")
    public Personnel getPersonnel() {
        return this.Personnel;
    }

    public void setPersonnel(Personnel Personnel) {
        this.Personnel = Personnel;
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
    @JoinColumn(name = "CERTIFICATE_DOCUMENT_ID")
    @DataItemName("PersonnelRef.Personnel.OriginalDocument")
    public OriginalDocument getCertificateDocument() {
        return this.CertificateDocument;
    }

    public void setCertificateDocument(OriginalDocument CertificateDocument) {
        this.CertificateDocument = CertificateDocument;
    }

    @Column(name = "TRAINING_BEGINDATE", columnDefinition = "TIMESTAMP")
    @DataItemName("PersonnelRef.Personnel.TrainingBeginDate")
    public Date getTrainingBeginDate() {
        return this.TrainingBeginDate;
    }

    public void setTrainingBeginDate(Date TrainingBeginDate) {
        this.TrainingBeginDate = TrainingBeginDate;
    }

    @Column(name = "TRAINING_ENDDATE", columnDefinition = "TIMESTAMP")
    @DataItemName("PersonnelRef.Personnel.TrainingEndDate")
    public Date getTrainingEndDate() {
        return this.TrainingEndDate;
    }

    public void setTrainingEndDate(Date TrainingEndDate) {
        this.TrainingEndDate = TrainingEndDate;
    }
}

