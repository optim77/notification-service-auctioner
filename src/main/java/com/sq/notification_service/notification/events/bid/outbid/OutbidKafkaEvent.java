package com.sq.notification_service.notification.events.bid.outbid;

import com.fasterxml.jackson.annotation.JsonProperty;

public record OutbidKafkaEvent (
        @JsonProperty("event_type") String eventType,
        @JsonProperty("payload") OutbidEvent payload
        ) {
    
}
