package com.sq.notification_service.notification.handler.auction;

import com.sq.notification_service.notification.NotificationEvents;
import com.sq.notification_service.notification.entity.Notification;
import com.sq.notification_service.notification.events.auction.started.StartedKafkaEvent;
import com.sq.notification_service.notification.repository.NotificationRepository;
import org.springframework.stereotype.Component;

import java.time.Instant;

@Component
public class StartedHandler {

    private final NotificationRepository notificationRepository;
    public StartedHandler(NotificationRepository notificationRepository) {
        this.notificationRepository = notificationRepository;
    }

    public void handle(StartedKafkaEvent event) {
        Notification notification = new Notification();
        notification.setType(NotificationEvents.AUCTION_STARTED);
        notification.setTimestamp(Instant.now());
        notification.setReceiverId(event.payload().receiverId());
        notification.setMessage("Auction Started");
        notificationRepository.save(notification);
    }
}
