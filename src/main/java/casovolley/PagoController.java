package casovolley;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class PagoController {

    @RequestMapping("/pago")
    public String index() {
        return "Greetings from PagoController!";
    }

}
