package com.sq.notification_service.notification.events.auction.started;

import com.fasterxml.jackson.annotation.JsonProperty;

public record StartedKafkaEvent(
        @JsonProperty("event_type") String event_type,
        @JsonProperty("payload") StartedEvent payload
) {
}
