package by.tms.lesson5535onl.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author simonpirko
 * @version 1.0
 * @since 14.11.2025
 */

@RestController
@RequestMapping("/greeting")
public class GreetingController {
    
    @GetMapping
    public String greeting(@RequestParam(value = "name", defaultValue = "World") String name) {
        return "Hello %s!".formatted(name);
    }
}
