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
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author UmAir
 */
@Entity
@Table(name = "Customer_Type")
public class CustomerType implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "Customer_Type_Id")
    private Integer customerTypeId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 10)
    @Column(name = "Customer_Type_Code")
    private String customerTypeCode;
    @Size(max = 50)
    @Column(name = "Customer_Type")
    private String customerType;
    @OneToMany(mappedBy = "customerType", fetch = FetchType.LAZY)
    private List<Customers> customersList;

    public CustomerType() {
    }

    public CustomerType(Integer customerTypeId) {
        this.customerTypeId = customerTypeId;
    }

    public CustomerType(Integer customerTypeId, String customerTypeCode) {
        this.customerTypeId = customerTypeId;
        this.customerTypeCode = customerTypeCode;
    }

    public Integer getCustomerTypeId() {
        return customerTypeId;
    }

    public void setCustomerTypeId(Integer customerTypeId) {
        this.customerTypeId = customerTypeId;
    }

    public String getCustomerTypeCode() {
        return customerTypeCode;
    }

    public void setCustomerTypeCode(String customerTypeCode) {
        this.customerTypeCode = customerTypeCode;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public List<Customers> getCustomersList() {
        return customersList;
    }

    public void setCustomersList(List<Customers> customersList) {
        this.customersList = customersList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (customerTypeId != null ? customerTypeId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CustomerType)) {
            return false;
        }
        CustomerType other = (CustomerType) object;
        if ((this.customerTypeId == null && other.customerTypeId != null) || (this.customerTypeId != null && !this.customerTypeId.equals(other.customerTypeId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.ganymedesoft.apsms.model.CustomerType[ customerTypeId=" + customerTypeId + " ]";
    }
    
}
