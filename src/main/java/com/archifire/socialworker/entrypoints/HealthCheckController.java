package com.archifire.socialworker.entrypoints;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthCheckController {

    @GetMapping(value = "/healthcheck")
    public String healthCheck() {
        return "SocialWorkAPI is OK!!";
    }

    @GetMapping(value = "/")
    public String root() {
        return "SocialWorkAPI";
    }
}
