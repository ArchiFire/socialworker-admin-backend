package com.archifire.socialworker.entrypoints.employee;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
@Slf4j
public class EmployeeController {
    @GetMapping(value = "/helloworld/string")
    public String helloworldString() {
        log.info("test {}", "test");

        return "helloworld";
    }
}
