package com.sq.notification_service.notification.events.bid.placed;

import com.fasterxml.jackson.annotation.JsonProperty;

public record PlacedKafkaEvent(
        @JsonProperty("event_type") String eventType,
        @JsonProperty("payload") PlacedEvent payload
) {
}
