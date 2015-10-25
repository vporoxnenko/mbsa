package com.mg.merp.discount.model;

import com.mg.merp.core.model.SysClient;
import com.mg.merp.reference.model.Contractor;
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
 * CardUser generated by hbm2java
 */
@Entity
@Table(name = "DIS_CARD_USER")
public class CardUser extends com.mg.merp.core.model.AbstractEntity implements java.io.Serializable {

    private Integer Id;

    private Card Card;

    private SysClient SysClient;

    private Contractor Contractor;

    public CardUser() {
    }

    public CardUser(Card Card, SysClient SysClient, Contractor Contractor) {
        this.Card = Card;
        this.SysClient = SysClient;
        this.Contractor = Contractor;
    }

    @SequenceGenerator(name = "generator", sequenceName = "DIS_CARD_USER_ID_GEN")
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
    @JoinColumn(name = "CARD_ID")
    public Card getCard() {
        return this.Card;
    }

    public void setCard(Card Card) {
        this.Card = Card;
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
    @JoinColumn(name = "CONTRACTOR_ID")
    @DataItemName("Discount.Car.Contractor")
    public Contractor getContractor() {
        return this.Contractor;
    }

    public void setContractor(Contractor Contractor) {
        this.Contractor = Contractor;
    }
}

