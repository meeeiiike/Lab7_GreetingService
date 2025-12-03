package ie.atu.lab7;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    @GetMapping("/health")
    public String health() {
        return "I'm alive";
    }

    @GetMapping("/api/greet/{name}")
    public String greet(@PathVariable("name") String name) {
        return "Hello " + name + " from service A!";
    }
}
