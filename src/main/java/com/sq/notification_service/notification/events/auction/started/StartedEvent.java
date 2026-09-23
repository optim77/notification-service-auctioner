package com.sq.notification_service.notification.events.auction.started;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public record StartedEvent(
        @JsonProperty("auction_id")
        UUID auctionId,
        @JsonProperty("status")
        String status,
        @JsonProperty("start_price")
        String startingPrice,
        @JsonProperty("listing_id")
        UUID listingId,
        @JsonProperty("listing_name")
        UUID listingName,
        @JsonProperty("receiver_id")
        UUID receiverId
) {
}
