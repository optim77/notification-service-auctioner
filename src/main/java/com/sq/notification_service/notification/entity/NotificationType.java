package com.sq.notification_service.notification.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

import java.util.Set;

@Entity
public class NotificationType {

    @Id
    private String eventName;

    @OneToMany(mappedBy = "type", cascade = CascadeType.ALL, orphanRemoval = true)
    private Set<Notification> notifications;
}
