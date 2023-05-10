package com.tonyjev.resilience.controller;

import com.tonyjev.resilience.service.RetryService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class RetryController {

    private final RetryService retryService;

    @GetMapping("retry")
    public String retry(@RequestParam String param) {
        return retryService.retry(param);
    }
}
