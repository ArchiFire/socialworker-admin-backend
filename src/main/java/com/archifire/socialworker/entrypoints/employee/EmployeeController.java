package com.archifire.socialworker.entrypoints.employee;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
    @GetMapping(value = "/helloworld/string")
    @ResponseBody
    public String helloworldString() {
        return "helloworld";
    }
}
