package com.example.demo.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import java.util.Set;



@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="JPCATALOG")
public class Catalog {

    @Id
    private int id;
    private String catalogName;

    @OneToMany(cascade = CascadeType.ALL)
   // @Fetch(FetchMode.JOIN)
    @JoinColumn(name="catalogref",nullable = false)
    private Set<Product> productList;


}
