package com.sq.notification_service.notification.events.bid.outbid;


import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.UUID;

public record OutbidEvent(
        @JsonProperty("auction_id")
        UUID auctionId,
        @JsonProperty("bid_price")
        String bidPrice,
        @JsonProperty("receiver_id")
        UUID receiverId,
        @JsonProperty("listing_id")
        UUID listingId,
        @JsonProperty("listing_name")
        String listingName

) {
}


