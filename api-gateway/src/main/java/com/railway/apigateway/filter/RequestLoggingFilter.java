package com.railway.apigateway.filter;

import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.filter.GatewayFilterChain;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Mono;


/*Interview Question:
How do you log every request in a microservice system?
Answer: Use GlobalFilter at API Gateway. Every request passes through Gateway first.

@Slf4j is a Lombok annotation that automatically creates a logger object for the class.
reducing boilerplate code for logging. It allows us to use methods like log.info(), log.warn(),
and log.error() without manually creating a Logger object.*/

@Slf4j
@Component
public class RequestLoggingFilter implements GlobalFilter {
    @Override
    public Mono<Void> filter(ServerWebExchange exchange, GatewayFilterChain chain) {
        log.info("Incoming Request: {} {}",
                exchange.getRequest().getMethod(),
                exchange.getRequest().getURI());

        return chain.filter(exchange);
    }
}
