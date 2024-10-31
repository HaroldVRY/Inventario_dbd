package harold_dbd.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EntregasController {

    @GetMapping("/entregas")
    public String entregas() {
        return "entregas";  // Redirige a entregas.html
    }
}
