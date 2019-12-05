package com.training.myapp.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "carts")
public class Cart {
    @Id
    @Column(name = "cart_Id")
    private int cartId;
    @Column(name = "user_name")
    private String username;

    @OneToMany(cascade = CascadeType.PERSIST)
    @JoinTable(name = "carts_products", joinColumns = @JoinColumn(name = "cart_id"),
    inverseJoinColumns = @JoinColumn(name = "product_id"))
    @MapKeyColumn
    /*OneToMany - Its use when we have one directional relationship. Product can exits without cart.
    * In this case 3 tables get created. 1 - Carts, 2-Products, 3- carts_products. 3rd table gets created 2 maintain
    * In one to Many association default fetch type is LAZY, we can make it EAGER by fetch = FetchType.LAZY.
    * If we remove cart then it will delete entry from cart and carts_products table and products entry will remain over there*/
    private List<Product> products;

    public Cart() {
    }

    public Cart(int cartId, String username, List<Product> products) {
        this.cartId = cartId;
        this.username = username;
        this.products = products;
    }

    public int getCartId() {
        return cartId;
    }

    public void setCartId(int cartId) {
        this.cartId = cartId;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return "Cart{" +
                "cartId=" + cartId +
                ", username='" + username + '\'' +
                ", products=" + products +
                '}';
    }
}
