package ibm.academy.cognome;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CognomeController {

   @RequestMapping(value = "/cognome", produces = "text/plain")
   public String sayCognome() {
      return "Guastamacchia";
   }
}