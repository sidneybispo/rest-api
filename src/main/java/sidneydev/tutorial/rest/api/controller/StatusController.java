package sidneydev.tutorial.rest.api.controller; // Autor: Sidney Bispo

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StatusController {

    @GetMapping(path = "/api/status")
    public String check() {
        return "online";
    }
}
