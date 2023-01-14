package com.parking.system.food_order.database.entity;

import java.util.List;

public class FoodOrders {
    private Long orderId;
    private Long customerId;
    private List<DishItem> dishItemList;
    //ignoring coupons and discount in the system-> working on flat prices

}
