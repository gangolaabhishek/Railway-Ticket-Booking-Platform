package com.railway.apigateway.config;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayRouteConfig {

    @Bean
    public RouteLocator routeLocator(RouteLocatorBuilder builder){
        return builder.routes()
                .route("user-service",
                        r -> r.path("/api/users/**")
                                .uri("lb://USER-SERVICE"))

                .route("train-service",
                        r -> r.path("/api/trains/**")
                                .uri("lb://TRAIN-SERVICE"))

                .route("schedule-service",
                        r -> r.path("/api/schedules/**")
                                .uri("lb://SCHEDULE-SERVICE"))

                .route("seat-service",
                        r -> r.path("/api/seats/**")
                                .uri("lb://SEAT-SERVICE"))

                .route("booking-service",
                        r -> r.path("/api/bookings/**")
                                .uri("lb://BOOKING-SERVICE"))

                .route("payment-service",
                        r -> r.path("/api/payments/**")
                                .uri("lb://PAYMENT-SERVICE"))

                .route("pnr-service",
                        r -> r.path("/api/pnr/**")
                                .uri("lb://PNR-SERVICE"))

                .route("notification-service",
                        r -> r.path("/api/notifications/**")
                                .uri("lb://NOTIFICATION-SERVICE"))

                .route("audit-service",
                        r -> r.path("/api/audit/**")
                                .uri("lb://AUDIT-SERVICE"))

                .route("admin-service",
                        r -> r.path("/api/admin/**")
                                .uri("lb://ADMIN-SERVICE"))

                .build();
    }
}
