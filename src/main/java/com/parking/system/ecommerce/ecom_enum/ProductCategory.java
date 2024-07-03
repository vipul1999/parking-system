package com.parking.system.ecommerce.ecom_enum;

public enum ProductCategory {

    HEALTH("health"),
    ELECTRONICS("electronics"),
    GROCERIES("groceries");

    public final String desc;

    ProductCategory(String desc){
        this.desc = desc;
    }
}
