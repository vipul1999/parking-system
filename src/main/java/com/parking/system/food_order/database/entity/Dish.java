package com.parking.system.food_order.database.entity;

public class Dish {
    private String dishName;
    private float dishPrice;
    private String dishDescription;
    //this can be an enum -> Beverage, Snacks, Thali, Main-course, bread, sweets, starter
    private String foodCategory;
    private Long kitchenId;

}
