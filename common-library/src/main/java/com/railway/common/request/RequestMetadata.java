package com.railway.common.request;

import lombok.Data;

@Data
public class RequestMetadata {
    private String correlationId;

    private String sourceSystem;
}
