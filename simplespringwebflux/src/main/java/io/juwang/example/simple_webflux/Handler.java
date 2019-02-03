package io.juwang.example.simple_webflux;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;

import reactor.core.publisher.Mono;
/**
 * Created on: 2/2/2019
 * Author: Junjie Wang
 */
@Component
public class Handler {
    private static final Logger LOG = LoggerFactory.getLogger(Handler.class);
    public Mono<ServerResponse> hello(ServerRequest request) {
        LOG.info("request");
        return ServerResponse.ok().contentType(MediaType.TEXT_PLAIN)
                .body(BodyInserters.fromObject("Hello, Spring!"));
    }
}
