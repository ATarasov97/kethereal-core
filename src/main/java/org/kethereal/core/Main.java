package org.kethereal.core;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.stereotype.*;
import org.springframework.web.bind.annotation.*;

@Controller
@EnableAutoConfiguration
public class Main {

    @RequestMapping("/")
    @ResponseBody
    String home() {
        return "Hello Kethereal!";
    }

    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }
}