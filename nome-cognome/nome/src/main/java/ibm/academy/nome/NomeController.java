package ibm.academy.nome;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NomeController {

   @RequestMapping(value = "/nome", produces = "text/plain")
   public String sayNome() {
      return "Francesco";
   }
}