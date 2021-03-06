package com.apiexample.webflux.controller.quotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

import static org.springframework.web.reactive.function.server.RequestPredicates.GET;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;

@Configuration
public class QuotationRouter {

    @Bean
    public RouterFunction<ServerResponse> QuotationRoute(QuotationHandler handler) {
        return RouterFunctions
                .route(GET("/quotation").and(accept(MediaType.APPLICATION_JSON)), handler::getQuotation);
    }

}
