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
@Table(name = "Town")

public class Town extends AuditFields implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Town_ID")
    private Integer townID;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "Town_Name")
    private String townName;
    @Size(max = 50)
    @Column(name = "Town_Code")
    private String townCode;
    @Size(max = 2)
    @Column(name = "Town_Status")
    private String townStatus;

    @OneToMany(mappedBy = "town", fetch = FetchType.LAZY)
    private List<Retailers> retailersList;
    @JoinColumn(name = "City_ID", referencedColumnName = "City_ID")
    @ManyToOne(fetch = FetchType.LAZY)
    private City city;

    public Town() {
    }

    public Town(Integer townID) {
        this.townID = townID;
    }

    public Town(Integer townID, String townName) {
        this.townID = townID;
        this.townName = townName;
    }

    public Integer getTownID() {
        return townID;
    }

    public void setTownID(Integer townID) {
        this.townID = townID;
    }

    public String getTownName() {
        return townName;
    }

    public void setTownName(String townName) {
        this.townName = townName;
    }

    public String getTownCode() {
        return townCode;
    }

    public void setTownCode(String townCode) {
        this.townCode = townCode;
    }

    public String getTownStatus() {
        return townStatus;
    }

    public void setTownStatus(String townStatus) {
        this.townStatus = townStatus;
    }

    public List<Retailers> getRetailersList() {
        return retailersList;
    }

    public void setRetailersList(List<Retailers> retailersList) {
        this.retailersList = retailersList;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (townID != null ? townID.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Town)) {
            return false;
        }
        Town other = (Town) object;
        if ((this.townID == null && other.townID != null) || (this.townID != null && !this.townID.equals(other.townID))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ganymedesoft.apsms.model.Town[ townID=" + townID + " ]";
    }

}
