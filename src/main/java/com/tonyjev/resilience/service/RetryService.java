package com.tonyjev.resilience.service;

import io.github.resilience4j.retry.annotation.Retry;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class RetryService {

    @Retry(name = "retryService", fallbackMethod = "retryFallback")
    public String retry(String param) {
        if (param.equals("error")) {
            log.error("error in retry service");
            throw new RuntimeException("error occurred : %s".formatted(param));
        }

        return param;
    }

    private String retryFallback(String param, Exception ex) {
        log.error("occurred fallback with error message : {}", ex.getMessage());

        return "retry with %s".formatted(param);
    }
}
