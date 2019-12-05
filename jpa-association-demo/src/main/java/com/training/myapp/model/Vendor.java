package com.training.myapp.model;

import javax.persistence.*;
import java.util.List;
@Entity
@Table(name="vendors")
public class Vendor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int vendorId;
    private String vendorName;
    private String vendorAddress;
    @ManyToMany
    @JoinTable(joinColumns = @JoinColumn(name="vendor_id"), inverseJoinColumns = @JoinColumn(name="customer_id"))
    private List<Customer> customers;

    public Vendor() {
    }

    public int getVendorId() {
        return vendorId;
    }

    public void setVendorId(int vendorId) {
        this.vendorId = vendorId;
    }

    public String getVendorName() {
        return vendorName;
    }

    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    public String getVendorAddress() {
        return vendorAddress;
    }

    public void setVendorAddress(String vendorAddress) {
        this.vendorAddress = vendorAddress;
    }

    public List<Customer> getCustomers() {
        return customers;
    }

    public void setCustomers(List<Customer> customers) {
        this.customers = customers;
    }
}
