package com.sq.notification_service.notification.events.bid.placed;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public record PlacedEvent(
        @JsonProperty("auction_id")
        UUID auctionId,
        @JsonProperty("receiver_id")
        UUID receiverId,
        @JsonProperty("listing_id")
        UUID listingId,
        @JsonProperty("listing_name")
        UUID listingName,
        @JsonProperty("bid_price")
        UUID bidPrice,
        @JsonProperty("current_price")
        UUID currentPrice
) {
}
