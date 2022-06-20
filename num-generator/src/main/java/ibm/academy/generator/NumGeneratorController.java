package ibm.academy.generator;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class NumGeneratorController {

   final String hostname = System.getenv().getOrDefault("HOSTNAME", "unknown");

   private final Random random = new Random();

   @RequestMapping(value = "/random", produces = "text/plain")
   public String random() {
      int maxint = 100;
      int value = random.nextInt(maxint) + 1;
      return "Numero random generato: " + value + " su " + hostname + "\n";
   }
}