package com.railway.common.events;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class BookingCreatedEvent extends BaseEvent {
    
    private Long bookingId;

    private String pnr;
    
}
