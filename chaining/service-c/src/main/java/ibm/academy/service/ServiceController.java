package ibm.academy.service;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.client.RestTemplate;
import org.springframework.http.ResponseEntity;

@RestController
public class ServiceController {
    RestTemplate restTemplate = new RestTemplate();

    @RequestMapping(value = "/", produces = "text/plain")
    public String index() {

        String url = "http://service-d:8080/";

        ResponseEntity<String> response = restTemplate.getForEntity(url, String.class);

        System.out.println(response.getBody());

        return "Academy " + response.getBody();
    }
}