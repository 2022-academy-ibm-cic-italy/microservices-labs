package ibm.academy.service;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceController {

    @RequestMapping(value = "/", produces = "text/plain")
    public String index() {
        return "Luglio 2022\n";
    }
}