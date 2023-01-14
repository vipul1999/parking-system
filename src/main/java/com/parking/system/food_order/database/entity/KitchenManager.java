package com.parking.system.food_order.database.entity;

public class KitchenManager extends FoodAbstractUser {
    private CloudKitchen cloudKitchen;
    //accept the customers order and update its status to preparing

    //hand over order to delivery partner

    //add dishes into the restaurant

    //update dish details into the restaurant

    //update restaurant info

}

/*
create table KitchenManager(
    kitchenManagerId int auto_increment primary key,
    foreign key cloud_kitchen_id references CloudKitchen(id),
)
 */
