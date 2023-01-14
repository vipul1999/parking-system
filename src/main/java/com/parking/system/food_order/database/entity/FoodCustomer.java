package com.parking.system.food_order.database.entity;

import jakarta.persistence.OneToMany;

import java.util.List;

public class FoodCustomer extends FoodAbstractUser {
    private List<UserAddress> userAddressList;

    private List<FoodOrders> foodOrdersList;

    public void rateTheOrder(){

    }
    public void rateTheDelivery(){

    }
    public void placeTheOrder(){
        //select the kitchen or dish

        //add the item into cart
        //select the address
        //select the payment method and pay
    }

    //customer will add customerAddress

    //customer will update customerAddress

    //update profile
}
/*
create table customer(
    customerId INT AUTO_INCREMENT primary key,
    Name varchar(100) not null,
    email varchar(100) unique not null,
    phoneNumber varchar(15) unique not null,
    created_at timestamp default current_timestamp,
    updated_at timestamp default current_timestamp on update current_timestamp
)
 */
