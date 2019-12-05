package com.training.entity;

import javax.xml.bind.annotation.XmlRootElement;

//@XmlRootElement - required in case of type being Application_XML to identify root element
public class Medicine {

    private long code;
    private String medicineName;
    private double ratePerUnit;

    private Address address;

    public Medicine() {
    }

    public Medicine(long code, String medicineName, double ratePerUnit) {
        this.code = code;
        this.medicineName = medicineName;
        this.ratePerUnit = ratePerUnit;
    }

    public long getCode() {
        return code;
    }

    public void setCode(long code) {
        this.code = code;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public String getMedicineName() {
        return medicineName;
    }

    public void setMedicineName(String medicineName) {
        this.medicineName = medicineName;
    }

    public double getRatePerUnit() {
        return ratePerUnit;
    }

    public void setRatePerUnit(double ratePerUnit) {
        this.ratePerUnit = ratePerUnit;
    }

    public Medicine(long code, String medicineName, double ratePerUnit, Address address) {
        this.code = code;
        this.medicineName = medicineName;
        this.ratePerUnit = ratePerUnit;
        this.address = address;
    }

    @Override
    public String toString() {
        return "Medicine{" +
                "code=" + code +
                ", medicineName='" + medicineName + '\'' +
                ", ratePerUnit=" + ratePerUnit +
                ", address=" + address +
                '}';
    }
}
