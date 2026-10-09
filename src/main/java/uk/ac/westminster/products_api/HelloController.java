package uk.ac.westminster.products_api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;

/**
 * Week 1 starter controller.
 * Already provided:
 *   GET /hello   -> a simple greeting
 *   GET /status  -> a simple status message
 * TODO (Lab Activity 3):
 *   Add a new endpoint GET /goodbye that returns the String
 *   "Goodbye from Spring Boot!"
 */

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){

        return "Hello from Spring Boots!";
    }

    @GetMapping("/status")
    public String status(){

        return "API running -" + LocalDate.now().toString();
    }

    @GetMapping("/goodbye")
    public String goodbye(){

        return "Goodbye from Spring Boots!";
    }

    @GetMapping("/info")
    public String info(){

        return "Okayy okayyy so in brief, this is a OOP tutorial stuff, and this was given to us to complete the whole thing in Week 2 and here I am figring out at the end of 3rd Week";
    }

    // TODO (Activity 3): add your /goodbye endpoint here.

}
