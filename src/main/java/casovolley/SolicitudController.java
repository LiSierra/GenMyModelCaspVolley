package casovolley;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class SolicitudController {

    @RequestMapping("/solicitud")
    public String index() {
        return "Greetings from SolicitudController!";
    }

}
