package com.railway.common.events;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public abstract class BaseEvent {
    private String eventId;

    private LocalDateTime eventTime;
    
}
