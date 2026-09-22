package com.sq.notification_service.notification.handler.bid;

import com.sq.notification_service.notification.events.bid.outbid.OutbidKafkaEvent;
import org.springframework.stereotype.Component;

@Component
public class OutbidHandler {

    public void handle(OutbidKafkaEvent event) {
        System.out.println(
                "User " + event.payload().receiverId()
                        + " was outbid on " + event.payload().listingName()
                        + ". Current price: " + event.payload().bidPrice()
        );
    }
}
