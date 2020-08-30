package casovolley;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class TarifaController {

    @RequestMapping("/tarifa")
    public String index() {
        return "Greetings from TarifaController!";
    }

}
