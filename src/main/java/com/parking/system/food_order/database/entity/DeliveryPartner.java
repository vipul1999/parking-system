package com.parking.system.food_order.database.entity;



//User can order food->User can place a order which holds dish they want to eat
//User can search the dish -> add this into the cart with qty
//User can search the restaurant -> select the dish and add this into cart with qty
//User can pay for the order

//restaurant will accept the order and send to the kitchen and hand
//delivery partner will go to pick assigned order to restaurant
// and restaurant manager hand over the order to delivery -partner
//delivery partner can go to customers order placing location and hand over the order at the location
//customer can rate delivery the order and rate the dish
public class DeliveryPartner extends FoodAbstractUser {
    private Long id;
    private float rating;

    //delivery partner will accept the assigned order

    //delivery partner update order status-> ORDER_PICKED, IN_TRANSIT, REACHED, DELIVERED

}
