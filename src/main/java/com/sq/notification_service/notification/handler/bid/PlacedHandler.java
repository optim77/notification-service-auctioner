package com.sq.notification_service.notification.handler.bid;


import com.sq.notification_service.notification.events.bid.placed.PlacedKafkaEvent;
import org.springframework.stereotype.Component;

@Component
public class PlacedHandler {

    public void handle(PlacedKafkaEvent event) {
        System.out.println("Placed event: " + event);
    }
}
