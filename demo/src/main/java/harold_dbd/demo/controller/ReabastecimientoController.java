package harold_dbd.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ReabastecimientoController {

    @GetMapping("/reabastecimiento")
    public String reabastecimiento() {
        return "reabastecimiento";  // Redirige a solicitudes_reabastecimiento.html
    }
}
