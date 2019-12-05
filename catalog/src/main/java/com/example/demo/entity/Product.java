package com.example.demo.entity;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="JPITEM")
public class Product {

    @Id
    private int productId;
    private String productName;
    private double ratePerUnit;
    private String imageRef;

 /*   @ManyToOne
    @JoinColumn(name="id")
    private Catalog catalog;
*/
}
