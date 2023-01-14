package com.parking.system.food_order.database.entity;

import java.util.Date;
import java.util.List;

public class CloudKitchen {
    private Long id;
    private String location;
    private List<Dish> dishList;
    private Date openingTime;
    private Date closingTime;
    private List<String> daysOpen;
    private boolean isOpen = true;
}
