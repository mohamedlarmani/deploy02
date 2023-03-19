package com.develhope.deploy02;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {

    @GetMapping("/sum")
    public int sumInt(@RequestParam int a, @RequestParam int b){
        int sum = a + b;
        return sum;
    }

}
