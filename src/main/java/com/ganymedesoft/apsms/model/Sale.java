/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ganymedesoft.apsms.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author UmAir
 */
@Entity
@Table(name = "Sale")

public class Sale extends AuditFields implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "Sale_ID")
    private String saleID;
    @Column(name = "Sale_Date")
    @Temporal(TemporalType.DATE)
    private Date saleDate;

    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "Sale_Value")
    private Float saleValue;
    @Column(name = "Return_Value")
    private Float returnValue;
    @Column(name = "Net_Sale")
    private Float netSale;
    @Column(name = "Bonus_Value")
    private Float bonusValue;
    @JoinColumn(name = "Client_ID", referencedColumnName = "Client_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Clients clients;
    @JoinColumn(name = "Customer_ID", referencedColumnName = "Customer_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Customers customers;
    @OneToMany(mappedBy = "sale", fetch = FetchType.LAZY)
    private List<Saledesc> saledescList;

    public Sale() {
    }

    public Sale(String saleID) {
        this.saleID = saleID;
    }

    public String getSaleID() {
        return saleID;
    }

    public void setSaleID(String saleID) {
        this.saleID = saleID;
    }

    public Date getSaleDate() {
        return saleDate;
    }

    public void setSaleDate(Date saleDate) {
        this.saleDate = saleDate;
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

    public Float getBonusValue() {
        return bonusValue;
    }

    public void setBonusValue(Float bonusValue) {
        this.bonusValue = bonusValue;
    }

    public Clients getClients() {
        return clients;
    }

    public void setClients(Clients clients) {
        this.clients = clients;
    }

    public Customers getCustomers() {
        return customers;
    }

    public void setCustomers(Customers customers) {
        this.customers = customers;
    }

    public List<Saledesc> getSaledescList() {
        return saledescList;
    }

    public void setSaledescList(List<Saledesc> saledescList) {
        this.saledescList = saledescList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (saleID != null ? saleID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Sale)) {
            return false;
        }
        Sale other = (Sale) object;
        if ((this.saleID == null && other.saleID != null) || (this.saleID != null && !this.saleID.equals(other.saleID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ganymedesoft.apsms.model.Sale[ saleID=" + saleID + " ]";
    }

}
