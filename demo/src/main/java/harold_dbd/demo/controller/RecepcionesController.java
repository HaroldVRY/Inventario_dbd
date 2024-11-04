package harold_dbd.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RecepcionesController {

    @GetMapping("/recepciones")
    public String recepciones() {
        return "recepciones";  // Redirige a recepciones.html
    }

    @GetMapping("/detalle_recepcion")
    public String detalleRecepcion(@RequestParam(value = "id", required = false) String id) {
        // Puedes usar el parámetro 'id' en el modelo si es necesario para el detalle
        return "detalle_recepcion";  // Redirige a detalle_recepcion.html
    }

    @GetMapping("/editar_recepcion")
    public String editarRecepcion(@RequestParam(value = "id", required = false) String id) {
        // Puedes usar el parámetro 'id' en el modelo si es necesario para la edición
        return "editar_recepcion";  // Redirige a editar_recepcion.html
    }
}
