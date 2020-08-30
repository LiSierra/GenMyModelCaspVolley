package casovolley;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class EmployeeController {

    @RequestMapping("/employee")
    public String index() {
        return "Greetings from EmployeeController!";
    }

}
