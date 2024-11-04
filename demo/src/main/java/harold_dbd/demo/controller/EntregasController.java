package harold_dbd.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class EntregasController {

    @GetMapping("/entregas")
    public String entregas() {
        return "entregas";  // Redirige a entregas.html
    }

    @GetMapping("/detalle_entrega")
    public String detalleEntrega(@RequestParam(value = "id", required = false) String id) {
        // Puedes usar el parámetro 'id' en el modelo si es necesario para el detalle
        return "detalle_entrega";  // Redirige a detalle_entrega.html
    }

    @GetMapping("/editar_entrega")
    public String editarEntrega(@RequestParam(value = "id", required = false) String id) {
        // Puedes usar el parámetro 'id' en el modelo si es necesario para la edición
        return "editar_entrega";  // Redirige a editar_entrega.html
    }
}
