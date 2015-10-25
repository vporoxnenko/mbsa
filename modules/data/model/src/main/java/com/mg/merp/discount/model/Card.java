package com.mg.merp.discount.model;

import com.mg.merp.core.model.Folder;
import com.mg.merp.core.model.SysClient;
import com.mg.merp.reference.model.Contractor;
import java.math.BigDecimal;
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
import org.hibernate.annotations.Formula;
import com.mg.framework.api.annotations.DataItemName;

/**
 * Card generated by hbm2java
 */
@Entity
@Table(name = "DIS_CARD")
public class Card extends com.mg.merp.core.model.AbstractEntity implements java.io.Serializable {

    private Integer Id;

    private Folder Folder;

    private SysClient SysClient;

    private Contractor Owner;

    private String CardNum;

    private BigDecimal Discount;

    private BigDecimal CreditLimit;

    private Integer CreditDepth;

    private String Comments;

    private boolean IsActive;

    private Set<ExtraDiscount> ExtraDiscounts = new HashSet<ExtraDiscount>(0);

    private Set<CardHist> History = new HashSet<CardHist>(0);

    private Set<CardUser> Users = new HashSet<CardUser>(0);

    private Set<Coefficient> Coefficients = new HashSet<Coefficient>(0);

    public Card() {
    }

    public Card(Folder Folder, SysClient SysClient, Contractor Owner, String CardNum, BigDecimal CreditLimit, Integer CreditDepth, String Comments, boolean IsActive, Set<ExtraDiscount> ExtraDiscounts, Set<CardHist> History, Set<CardUser> Users, Set<Coefficient> Coefficients) {
        this.Folder = Folder;
        this.SysClient = SysClient;
        this.Owner = Owner;
        this.CardNum = CardNum;
        this.CreditLimit = CreditLimit;
        this.CreditDepth = CreditDepth;
        this.Comments = Comments;
        this.IsActive = IsActive;
        this.ExtraDiscounts = ExtraDiscounts;
        this.History = History;
        this.Users = Users;
        this.Coefficients = Coefficients;
    }

    @SequenceGenerator(name = "generator", sequenceName = "DIS_CARD_ID_GEN")
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
    @JoinColumn(name = "FOLDER_ID")
    public Folder getFolder() {
        return this.Folder;
    }

    public void setFolder(Folder Folder) {
        this.Folder = Folder;
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
    @JoinColumn(name = "OWNER_ID")
    @DataItemName("Discount.Car.Owner")
    public Contractor getOwner() {
        return this.Owner;
    }

    public void setOwner(Contractor Owner) {
        this.Owner = Owner;
    }

    @Column(name = "CARDNUM", columnDefinition = "CHAR", length = 20)
    @DataItemName("Discount.Card.CardNum")
    public String getCardNum() {
        return this.CardNum;
    }

    public void setCardNum(String CardNum) {
        this.CardNum = CardNum;
    }

    @Formula(value = "(select dch.discount from dis_card_hist dch where (dch.time_stamp = (select max(dch2.time_stamp) from dis_card_hist dch2 where dch2.card_id = ID) and dch.card_id = ID))")
    @DataItemName("Discount.Card.Discount")
    public BigDecimal getDiscount() {
        return this.Discount;
    }

    public void setDiscount(BigDecimal Discount) {
        this.Discount = Discount;
    }

    @Column(name = "CREDITLIMIT", columnDefinition = "NUMERIC", precision = 15, scale = 4)
    @DataItemName("Discount.Card.CreditLimit")
    public BigDecimal getCreditLimit() {
        return this.CreditLimit;
    }

    public void setCreditLimit(BigDecimal CreditLimit) {
        this.CreditLimit = CreditLimit;
    }

    @Column(name = "CREDITDEPTH", columnDefinition = "INTEGER")
    @DataItemName("Discount.Card.CreditDepth")
    public Integer getCreditDepth() {
        return this.CreditDepth;
    }

    public void setCreditDepth(Integer CreditDepth) {
        this.CreditDepth = CreditDepth;
    }

    @Column(name = "COMMENTS", columnDefinition = "VARCHAR", length = 256)
    @DataItemName("Discount.Card.Comments")
    public String getComments() {
        return this.Comments;
    }

    public void setComments(String Comments) {
        this.Comments = Comments;
    }

    @Column(name = "IS_ACTIVE", columnDefinition = "SMALLINT")
    @DataItemName("Discount.Card.IsActive")
    public boolean isActive() {
        return this.IsActive;
    }

    public void setActive(boolean IsActive) {
        this.IsActive = IsActive;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "Card")
    public Set<ExtraDiscount> getExtraDiscounts() {
        return this.ExtraDiscounts;
    }

    public void setExtraDiscounts(Set<ExtraDiscount> ExtraDiscounts) {
        this.ExtraDiscounts = ExtraDiscounts;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "Card")
    public Set<CardHist> getHistory() {
        return this.History;
    }

    public void setHistory(Set<CardHist> History) {
        this.History = History;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "Card")
    public Set<CardUser> getUsers() {
        return this.Users;
    }

    public void setUsers(Set<CardUser> Users) {
        this.Users = Users;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "Card")
    public Set<Coefficient> getCoefficients() {
        return this.Coefficients;
    }

    public void setCoefficients(Set<Coefficient> Coefficients) {
        this.Coefficients = Coefficients;
    }
}

