package com.training.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Doctor {

    private long doctorId;
    private String doctorName;
    private String specialization;

    private Address address;

    //collaborating object
    @Autowired
    private List<Patient> patient;


/*
    public Doctor() {
    }

    public Doctor(long doctorId, String doctorName, String specialization, Address address) {
        this.doctorId = doctorId;
        this.doctorName = doctorName;
        this.specialization = specialization;
        this.address = address;
    }

    public void setPatient(List<Patient> patient) {
        this.patient = patient;
    }

    public List<Patient> getPatient() {
        return patient;
    }

    public long getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(long doctorId) {
        this.doctorId = doctorId;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }



    @Override
    public String toString() {
        return "Doctor{" +
                "doctorId=" + doctorId +
                ", doctorName='" + doctorName + '\'' +
                ", specialization='" + specialization + '\'' +
                ", address=" + address +
                ", patient=" + patient +
                '}';
    }*/
}
