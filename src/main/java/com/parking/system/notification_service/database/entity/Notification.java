package com.parking.system.notification_service.database.entity;

public class Notification {
    private Long id;
    private String notificationType;//could be an Enum
    private String originService;
    private String destinationService;

}
/*
Design a notifications service that allows users to receive notifications
on various devices, such as mobile phones, desktops, and email clients.
The service should be able to deliver notifications in real-time
and support different types of notifications, such as text messages, push notifications, and emails.

The system should also be scalable and fault-tolerant to handle a large number of users and devices.
Additionally, the system should allow users to customize their notification preferences,
such as the types of notifications they want to receive and the frequency of notifications.

The system should also be able to handle spikes in traffic,
such as during special events or promotions.

Finally, the system should be designed to be easy to use and
integrate with other systems, such as user authentication and notification triggers.
The system should also provide analytics and insights on
user engagement and notification effectiveness,
to help improve the user experience and increase the value of the service.
 */
