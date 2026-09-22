package com.sq.notification_service.notification.consumer;

import com.sq.notification_service.notification.events.bid.outbid.OutbidKafkaEvent;
import com.sq.notification_service.notification.handler.bid.OutbidHandler;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class NotificationKafkaConsumer {

    private final OutbidHandler outbidHandler;

    public NotificationKafkaConsumer(OutbidHandler outbidHandler) {
        this.outbidHandler = outbidHandler;
    }

    @KafkaListener(topics = "bid.outbid")
    public void consume(OutbidKafkaEvent outbidEvent) {
        outbidHandler.handle(outbidEvent);
    }
}
