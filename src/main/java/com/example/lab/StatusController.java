package com.example.lab;

import lombok.Data;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Data
public class StatusController {
    // some text
    private final StatusService statusService;

    @GetMapping("/arrival")
    public String sayHello() {
        return "springfundamentals/hello";
    }

    @GetMapping("/departure")
    public String sayGoodbye() {
        return "springfundamentals/goodbye";
    }
    @GetMapping("/success")
    public String saySuccess() {
        return "springfundamentals/success";
    }
}