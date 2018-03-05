/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ganymedesoft.apsms.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author UmAir
 */
@Entity
@Table(name = "Saledesc")

public class Saledesc extends AuditFields implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "Sale_Desc_ID")
    private String saleDescID;
    @Column(name = "Qty")
    private Integer qty;
    @Column(name = "Return_Qty")
    private Integer returnQty;
    @Column(name = "Bonus_Qty")
    private Integer bonusQty;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "Sale_Value")
    private Float saleValue;
    @Column(name = "Return_Value")
    private Float returnValue;
    @Column(name = "Net_Sale")
    private Float netSale;
    @Column(name = "Tax_Value")
    private Float taxValue;

    @JoinColumn(name = "Item_ID", referencedColumnName = "Item_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Items items;
    @JoinColumn(name = "Retailer_ID", referencedColumnName = "Retailer_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Retailers retailers;
    @JoinColumn(name = "Sale_ID", referencedColumnName = "Sale_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Sale sale;

    public Saledesc() {
    }

    public Saledesc(String saleDescID) {
        this.saleDescID = saleDescID;
    }

    public String getSaleDescID() {
        return saleDescID;
    }

    public void setSaleDescID(String saleDescID) {
        this.saleDescID = saleDescID;
    }

    public Integer getQty() {
        return qty;
    }

    public void setQty(Integer qty) {
        this.qty = qty;
    }

    public Integer getReturnQty() {
        return returnQty;
    }

    public void setReturnQty(Integer returnQty) {
        this.returnQty = returnQty;
    }

    public Integer getBonusQty() {
        return bonusQty;
    }

    public void setBonusQty(Integer bonusQty) {
        this.bonusQty = bonusQty;
    }

    public Float getSaleValue() {
        return saleValue;
    }

    public void setSaleValue(Float saleValue) {
        this.saleValue = saleValue;
    }

    public Float getReturnValue() {
        return returnValue;
    }

    public void setReturnValue(Float returnValue) {
        this.returnValue = returnValue;
    }

    public Float getNetSale() {
        return netSale;
    }

    public void setNetSale(Float netSale) {
        this.netSale = netSale;
    }

    public Float getTaxValue() {
        return taxValue;
    }

    public void setTaxValue(Float taxValue) {
        this.taxValue = taxValue;
    }

    public Items getItems() {
        return items;
    }

    public void setItems(Items items) {
        this.items = items;
    }

    public Retailers getRetailers() {
        return retailers;
    }

    public void setRetailers(Retailers retailers) {
        this.retailers = retailers;
    }

    public Sale getSale() {
        return sale;
    }

    public void setSale(Sale sale) {
        this.sale = sale;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (saleDescID != null ? saleDescID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Saledesc)) {
            return false;
        }
        Saledesc other = (Saledesc) object;
        if ((this.saleDescID == null && other.saleDescID != null) || (this.saleDescID != null && !this.saleDescID.equals(other.saleDescID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ganymedesoft.apsms.model.Saledesc[ saleDescID=" + saleDescID + " ]";
    }

}
