package harold_dbd.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class RecepcionesController {
    @GetMapping("/recepciones")
    public String recepciones() {
        return "recepciones";  // Redirige a recepciones.html
    }
}
