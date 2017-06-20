package com.loboss.test.zaptest;

import com.loboss.test.zaptest.dto.InputDto;
import lombok.extern.java.Log;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Log
public class TestController {

    @RequestMapping("/")
    public String home() {
        return "Hello World!";
    }

    @PostMapping("/input")
    public String input(@RequestBody InputDto input) {
        log.info("Received input: " + input.toString());
        return "OK";
    }
}
