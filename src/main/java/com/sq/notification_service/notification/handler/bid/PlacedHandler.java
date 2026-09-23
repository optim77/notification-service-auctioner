package com.sq.notification_service.notification.handler.bid;


import com.sq.notification_service.notification.NotificationEvents;
import com.sq.notification_service.notification.entity.Notification;
import com.sq.notification_service.notification.events.bid.placed.PlacedKafkaEvent;
import com.sq.notification_service.notification.repository.NotificationRepository;
import org.springframework.stereotype.Component;

import java.time.Instant;

@Component
public class PlacedHandler {

    NotificationRepository notificationRepository;

    public PlacedHandler(NotificationRepository notificationRepository) {
        this.notificationRepository = notificationRepository;
    }

    public void handle(PlacedKafkaEvent event) {
        Notification notification = new Notification();
        notification.setType(NotificationEvents.BID_PLACED);
        notification.setReceiverId(event.payload().receiverId());
        notification.setTimestamp(Instant.now());
        notification.setMessage(
                "New bid on " + event.payload().listingName()
                        + " for " + event.payload().bidPrice()
        );
        notificationRepository.save(notification);


    }
}
