package com.sq.notification_service.notification.consumer;

import com.sq.notification_service.notification.NotificationEvents;
import com.sq.notification_service.notification.events.auction.started.StartedKafkaEvent;
import com.sq.notification_service.notification.events.bid.outbid.OutbidKafkaEvent;
import com.sq.notification_service.notification.events.bid.placed.PlacedKafkaEvent;
import com.sq.notification_service.notification.handler.auction.StartedHandler;
import com.sq.notification_service.notification.handler.bid.OutbidHandler;
import com.sq.notification_service.notification.handler.bid.PlacedHandler;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class NotificationKafkaConsumer {

    private final OutbidHandler outbidHandler;
    private final PlacedHandler placedHandler;
    private final StartedHandler startedHandler;

    public NotificationKafkaConsumer(OutbidHandler outbidHandler, PlacedHandler placedHandler, StartedHandler startedHandler) {
        this.outbidHandler = outbidHandler;
        this.placedHandler = placedHandler;
        this.startedHandler = startedHandler;
    }

    @KafkaListener(topics = NotificationEvents.AUCTION_STARTED)
    public void consume(StartedKafkaEvent event){
        startedHandler.handle(event);
    }

    @KafkaListener(topics = NotificationEvents.BID_OUTBID)
    public void consume(OutbidKafkaEvent outbidEvent) {
        outbidHandler.handle(outbidEvent);
    }


    // Not using for now
    @KafkaListener(topics = NotificationEvents.BID_PLACED)
    public void consume(PlacedKafkaEvent placedKafkaEvent) {
        placedHandler.handle(placedKafkaEvent);
    }

}
