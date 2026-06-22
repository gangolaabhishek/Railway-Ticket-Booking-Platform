package com.railway.common.constants;

public final class KafkaTopics {
    private KafkaTopics() {
    }

    public static final String BOOKING_CREATED =
            "booking-created";

    public static final String PAYMENT_SUCCESS =
            "payment-success";

    public static final String PAYMENT_FAILED =
            "payment-failed";

    public static final String NOTIFICATION =
            "notification";

    public static final String AUDIT =
            "audit-log";

}
