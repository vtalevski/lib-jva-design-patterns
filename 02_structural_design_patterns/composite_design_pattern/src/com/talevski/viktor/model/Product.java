package com.talevski.viktor.model;

import com.talevski.viktor.composition.Component;

public class Product extends Component {
    private String productName;
    private Integer productPrice;

    public Product(String productName, Integer productPrice) {
        // super(null);
        this.productName = productName;
        this.productPrice = productPrice;
    }

    @Override
    public void showPrice() {
        System.out.println(this.productName + " - " + this.productPrice);
    }
}
