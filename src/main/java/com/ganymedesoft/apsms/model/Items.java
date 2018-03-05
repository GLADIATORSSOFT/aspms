/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ganymedesoft.apsms.model;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author UmAir
 */
@Entity
@Table(name = "Items")
public class Items extends AuditFields implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Item_ID")
    private Integer itemID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "ItemDesc")
    private String itemDesc;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 50)
    @Column(name = "ItemPacking")
    private String itemPacking;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "Trade_Price")
    private Float tradePrice;
    @Column(name = "Distributor_Margin")
    private Float distributorMargin;
    @Column(name = "Distributor_Price")
    private Float distributorPrice;
    @Column(name = "Retail_Price")
    private Float retailPrice;
    @Size(max = 2)
    @Column(name = "Item_Status")
    private String itemStatus;
    @Column(name = "GST_Applicable")
    private Short gSTApplicable;
    @Column(name = "Additional_GST_Applicable")
    private Short additionalGSTApplicable;
    @OneToMany(mappedBy = "items", fetch = FetchType.LAZY)
    private List<Saledesc> saledescList;
    @JoinColumn(name = "Brand_Id")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Brand brand;
    @JoinColumn(name = "Client_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Clients clients;
    @JoinColumn(name = "Group_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Groups groups;

    public Items() {
    }

    public Items(Integer itemID) {
        this.itemID = itemID;
    }

    public Items(Integer itemID, String itemDesc, String itemPacking) {
        this.itemID = itemID;
        this.itemDesc = itemDesc;
        this.itemPacking = itemPacking;
    }

    public Integer getItemID() {
        return itemID;
    }

    public void setItemID(Integer itemID) {
        this.itemID = itemID;
    }

    public String getItemDesc() {
        return itemDesc;
    }

    public void setItemDesc(String itemDesc) {
        this.itemDesc = itemDesc;
    }

    public String getItemPacking() {
        return itemPacking;
    }

    public void setItemPacking(String itemPacking) {
        this.itemPacking = itemPacking;
    }

    public Float getTradePrice() {
        return tradePrice;
    }

    public void setTradePrice(Float tradePrice) {
        this.tradePrice = tradePrice;
    }

    public Float getDistributorMargin() {
        return distributorMargin;
    }

    public void setDistributorMargin(Float distributorMargin) {
        this.distributorMargin = distributorMargin;
    }

    public Float getDistributorPrice() {
        return distributorPrice;
    }

    public void setDistributorPrice(Float distributorPrice) {
        this.distributorPrice = distributorPrice;
    }

    public Float getRetailPrice() {
        return retailPrice;
    }

    public void setRetailPrice(Float retailPrice) {
        this.retailPrice = retailPrice;
    }

    public String getItemStatus() {
        return itemStatus;
    }

    public void setItemStatus(String itemStatus) {
        this.itemStatus = itemStatus;
    }

    public Short getGSTApplicable() {
        return gSTApplicable;
    }

    public void setGSTApplicable(Short gSTApplicable) {
        this.gSTApplicable = gSTApplicable;
    }

    public Short getAdditionalGSTApplicable() {
        return additionalGSTApplicable;
    }

    public void setAdditionalGSTApplicable(Short additionalGSTApplicable) {
        this.additionalGSTApplicable = additionalGSTApplicable;
    }

    public List<Saledesc> getSaledescList() {
        return saledescList;
    }

    public void setSaledescList(List<Saledesc> saledescList) {
        this.saledescList = saledescList;
    }

    public Short getgSTApplicable() {
        return gSTApplicable;
    }

    public void setgSTApplicable(Short gSTApplicable) {
        this.gSTApplicable = gSTApplicable;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public Clients getClients() {
        return clients;
    }

    public void setClients(Clients clients) {
        this.clients = clients;
    }

    public Groups getGroups() {
        return groups;
    }

    public void setGroups(Groups groups) {
        this.groups = groups;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (itemID != null ? itemID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Items)) {
            return false;
        }
        Items other = (Items) object;
        if ((this.itemID == null && other.itemID != null) || (this.itemID != null && !this.itemID.equals(other.itemID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ganymedesoft.apsms.model.Items[ itemID=" + itemID + " ]";
    }

}
