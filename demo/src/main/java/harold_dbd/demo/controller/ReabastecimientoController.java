package harold_dbd.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ReabastecimientoController {

    @GetMapping("/reabastecimiento")
    public String reabastecimiento() {
        return "reabastecimiento";  // Redirige a reabastecimiento.html
    }

    @GetMapping("/detalle_reabastecimiento")
    public String detalleReabastecimiento(@RequestParam("id") String id, Model model) {
        // Añade el ID al modelo para que esté disponible en la vista
        model.addAttribute("id", id);
        
        // Aquí puedes añadir cualquier lógica adicional para obtener detalles específicos del recurso usando el ID
        
        return "detalle_reabastecimiento"; // Redirige a detalle_reabastecimiento.html
    }

    @GetMapping("/editar_reabastecimiento")
    public String editarReabastecimiento(@RequestParam("id") String id, Model model) {
        // Añade el ID al modelo para que esté disponible en la vista
        model.addAttribute("id", id);
        
        // Aquí puedes añadir cualquier lógica adicional para obtener los datos del recurso que serán editados
        
        return "editar_reabastecimiento"; // Redirige a editar_reabastecimiento.html
    }
}
