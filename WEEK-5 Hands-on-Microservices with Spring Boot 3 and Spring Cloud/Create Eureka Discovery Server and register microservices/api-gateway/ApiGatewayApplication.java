package com.cognizant.apigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.gateway.config.GlobalCorsProperties;
import org.springframework.cloud.gateway.filter.GlobalFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import reactor.core.publisher.Mono;

import org.springframework.web.server.ServerWebExchange;
import java.util.logging.Logger;

@SpringBootApplication
@EnableDiscoveryClient
public class ApiGatewayApplication {

    private static final Logger LOGGER = Logger.getLogger(ApiGatewayApplication.class.getName());

    public static void main(String[] args) {
        SpringApplication.run(ApiGatewayApplication.class, args);
    }

    @Bean
    public GlobalFilter customFilter() {
        return (exchange, chain) -> {
            LOGGER.info("Request Path: " + exchange.getRequest().getPath());
            return chain.filter(exchange).then(Mono.fromRunnable(() -> {
                LOGGER.info("Response Code: " + exchange.getResponse().getStatusCode());
            }));
        };
    }
}