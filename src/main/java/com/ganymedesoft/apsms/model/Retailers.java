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
import javax.validation.constraints.Size;

/**
 *
 * @author UmAir
 */
@Entity
@Table(name = "Retailers")
public class Retailers extends AuditFields implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Retailer_ID")
    private Integer retailerID;
    @Size(max = 100)
    @Column(name = "Retailer_Name")
    private String retailerName;
    @Size(max = 500)
    @Column(name = "Address")
    private String address;
    // @Pattern(regexp="^\\(?(\\d{3})\\)?[- ]?(\\d{3})[- ]?(\\d{4})$", message="Invalid phone/fax format, should be as xxx-xxx-xxxx")//if the field contains phone or fax number consider using this annotation to enforce field validation
    @Size(max = 100)
    @Column(name = "Phone")
    private String phone;
    @Size(max = 2)
    @Column(name = "Retailer_Status")
    private String retailerStatus;

    @JoinColumn(name = "Client_ID", referencedColumnName = "Client_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Clients clients;
    @JoinColumn(name = "Town_ID", referencedColumnName = "Town_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private Town town;
    @OneToMany(mappedBy = "retailers", fetch = FetchType.LAZY)
    private List<Saledesc> saledescList;

    public Retailers() {
    }

    public Retailers(Integer retailerID) {
        this.retailerID = retailerID;
    }

    public Integer getRetailerID() {
        return retailerID;
    }

    public void setRetailerID(Integer retailerID) {
        this.retailerID = retailerID;
    }

    public String getRetailerName() {
        return retailerName;
    }

    public void setRetailerName(String retailerName) {
        this.retailerName = retailerName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getRetailerStatus() {
        return retailerStatus;
    }

    public void setRetailerStatus(String retailerStatus) {
        this.retailerStatus = retailerStatus;
    }

    public Clients getClients() {
        return clients;
    }

    public void setClients(Clients clients) {
        this.clients = clients;
    }

    public Town getTown() {
        return town;
    }

    public void setTown(Town town) {
        this.town = town;
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
        hash += (retailerID != null ? retailerID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Retailers)) {
            return false;
        }
        Retailers other = (Retailers) object;
        if ((this.retailerID == null && other.retailerID != null) || (this.retailerID != null && !this.retailerID.equals(other.retailerID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ganymedesoft.apsms.model.Retailers[ retailerID=" + retailerID + " ]";
    }

}
