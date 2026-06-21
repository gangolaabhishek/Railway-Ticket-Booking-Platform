package com.railway.apigateway.filter;

import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;

import java.util.UUID;

/*
What is Correlation ID?
Correlation ID is a unique identifier attached to a request and propagated across multiple microservices.
It helps trace a request end-to-end, making debugging, monitoring, and distributed logging easier.

Why is it needed?
In a microservices architecture, a single request may travel through multiple services.
Correlation IDs allow us to identify all logs related to the same request and troubleshoot issues efficiently.
*/

@Component
public class CorrelationIdFilter implements GlobalFilter {
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        String correlationId = UUID.randomUUID().toString();

        exchange.getRequest()
                .mutate()
                .header("X-Correlation-Id", correlationId)
                .build();

        return chain.filter(exchange);
    }
}
