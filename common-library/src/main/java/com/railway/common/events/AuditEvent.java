package com.railway.common.events;

import lombok.Data;

@Data
public class AuditEvent {
    private String serviceName;

    private String action;

    private String correlationId;

    private String payload;
}
