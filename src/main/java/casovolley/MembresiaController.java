package casovolley;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class MembresiaController {

    @RequestMapping("/membresia")
    public String index() {
        return "Greetings from MembresiaController!";
    }

}
