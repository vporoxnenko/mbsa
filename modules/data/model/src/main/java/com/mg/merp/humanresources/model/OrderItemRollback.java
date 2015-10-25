package com.mg.merp.humanresources.model;

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
 * OrderItemRollback generated by hbm2java
 */
@Entity
@Table(name = "HR_ORDER_ITEM_ROLLBACK")
public class OrderItemRollback extends com.mg.merp.core.model.AbstractEntity implements java.io.Serializable {

    private Integer Id;

    private OrderItem OrderItem;

    private SysClient SysClient;

    private String SysCode;

    private String ParamValue;

    public OrderItemRollback() {
    }

    public OrderItemRollback(OrderItem OrderItem, String SysCode) {
        this.OrderItem = OrderItem;
        this.SysCode = SysCode;
    }

    public OrderItemRollback(OrderItem OrderItem, SysClient SysClient, String SysCode, String ParamValue) {
        this.OrderItem = OrderItem;
        this.SysClient = SysClient;
        this.SysCode = SysCode;
        this.ParamValue = ParamValue;
    }

    @SequenceGenerator(name = "generator", sequenceName = "HR_ORDER_ITEM_ROLLBACK_ID_GEN")
    @Id
    @GeneratedValue(strategy = SEQUENCE, generator = "generator")
    @Column(name = "ID", unique = true, columnDefinition = "INTEGER")
    //$NON-NLS-1$
    @DataItemName("ID")
    public Integer getId() {
        return this.Id;
    }

    public void setId(Integer Id) {
        this.Id = Id;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "ORDER_ITEM_ID", nullable = false)
    public OrderItem getOrderItem() {
        return this.OrderItem;
    }

    public void setOrderItem(OrderItem OrderItem) {
        this.OrderItem = OrderItem;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CLIENT_ID")
    public SysClient getSysClient() {
        return this.SysClient;
    }

    public void setSysClient(SysClient SysClient) {
        this.SysClient = SysClient;
    }

    @Column(name = "SYS_CODE", nullable = false, columnDefinition = "CHAR", length = 20)
    public String getSysCode() {
        return this.SysCode;
    }

    public void setSysCode(String SysCode) {
        this.SysCode = SysCode;
    }

    @Column(name = "PARAM_VALUE", columnDefinition = "VARCHAR", length = 80)
    public String getParamValue() {
        return this.ParamValue;
    }

    public void setParamValue(String ParamValue) {
        this.ParamValue = ParamValue;
    }
}

