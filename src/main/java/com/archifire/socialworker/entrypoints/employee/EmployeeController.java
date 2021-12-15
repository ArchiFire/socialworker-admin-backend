package com.archifire.socialworker.entrypoints.employee;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class EmployeeController {
    @GetMapping(value = "/helloworld/string")
    public String helloworldString() {
        return "helloworld";
    }
}
