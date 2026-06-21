package com.railway.common.events;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
public class PaymentSuccessEvent extends BaseEvent {
    
    private Long paymentId;

    private Long bookingId;
    
}
