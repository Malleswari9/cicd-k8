package com.devops.devopsk8s.ws;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class devopsDockerDemoController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello - devops-k8s i Have updated the message";
    }
}
