package com.sq.notification_service.notification.entity;

import jakarta.persistence.*;

import java.time.Instant;
import java.util.UUID;

@Entity
public class Notification {
    @Id
    @GeneratedValue
    private UUID id;

    @Column(nullable = false)
    private UUID receiverId;

    @ManyToOne
    @JoinColumn(name = "notification_type")
    private NotificationType type;

    @Column(nullable = false)
    private String message;

    @Column(nullable = false)
    private Instant timestamp;

    @Column(nullable = false)
    private boolean read;
}
