package com.mg.merp.table.model;
// Generated Sep 28, 2015 11:36:59 PM by Hibernate Tools 3.6.0.Final


import com.mg.merp.core.model.SysClient;
import java.math.BigDecimal;
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
 * TimeBoardSpec generated by hbm2java
 */
@Entity
@Table(name="TAB_TIME_BOARD_SPEC"
)
public class TimeBoardSpec extends com.mg.merp.core.model.AbstractEntity implements java.io.Serializable {


     private Integer Id;
     private TimeKind TimeKind;
     private TimeBoardPosition TimeBoardPosition;
     private SysClient SysClient;
     private BigDecimal HoursQuantity;
     private Date TimeBoardDate;

    public TimeBoardSpec() {
    }

    public TimeBoardSpec(TimeKind TimeKind, TimeBoardPosition TimeBoardPosition, SysClient SysClient, BigDecimal HoursQuantity, Date TimeBoardDate) {
       this.TimeKind = TimeKind;
       this.TimeBoardPosition = TimeBoardPosition;
       this.SysClient = SysClient;
       this.HoursQuantity = HoursQuantity;
       this.TimeBoardDate = TimeBoardDate;
    }
   
     @SequenceGenerator(name="generator", sequenceName="TAB_TIME_BOARD_SPEC_ID_GEN")@Id @GeneratedValue(strategy=SEQUENCE, generator="generator")

    
    @Column(name="ID", unique=true, columnDefinition="INTEGER")
    public Integer getId() {
        return this.Id;
    }
    
    public void setId(Integer Id) {
        this.Id = Id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="TIME_KIND_ID")
    public TimeKind getTimeKind() {
        return this.TimeKind;
    }
    
    public void setTimeKind(TimeKind TimeKind) {
        this.TimeKind = TimeKind;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="TIME_BOARD_POSITION_ID")
    public TimeBoardPosition getTimeBoardPosition() {
        return this.TimeBoardPosition;
    }
    
    public void setTimeBoardPosition(TimeBoardPosition TimeBoardPosition) {
        this.TimeBoardPosition = TimeBoardPosition;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="CLIENT_ID")
    public SysClient getSysClient() {
        return this.SysClient;
    }
    
    public void setSysClient(SysClient SysClient) {
        this.SysClient = SysClient;
    }

    
    @Column(name="HOURS_QUANTITY", columnDefinition="NUMERIC", precision=18, scale=3)
    public BigDecimal getHoursQuantity() {
        return this.HoursQuantity;
    }
    
    public void setHoursQuantity(BigDecimal HoursQuantity) {
        this.HoursQuantity = HoursQuantity;
    }

    
    @Column(name="TIME_BOARD_DATE", columnDefinition="TIMESTAMP")
    public Date getTimeBoardDate() {
        return this.TimeBoardDate;
    }
    
    public void setTimeBoardDate(Date TimeBoardDate) {
        this.TimeBoardDate = TimeBoardDate;
    }




}


