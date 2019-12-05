package com.example.hateoasexample.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="JPHOTEL")
public class Hotel {
    @Id
    private int id;
    private String hotelName;
    private String hotelType;
    private String location;
}
