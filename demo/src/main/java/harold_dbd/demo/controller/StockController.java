package harold_dbd.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StockController {

    @GetMapping("/informe_stock")
    public String informeStock() {
        return "informe_stock";  // Redirige a informe_stock.html
    }

    @GetMapping("/detalle_informe_stock")
    public String detalleInformeStock(@RequestParam("id") String id, Model model) {
        // Añade el ID al modelo para que esté disponible en la vista
        model.addAttribute("id", id);
        
        // Aquí puedes añadir lógica adicional para obtener detalles específicos del recurso usando el ID
        
        return "detalle_informe_stock";  // Redirige a detalle_informe_stock.html
    }

    @GetMapping("/editar_informe_stock")
    public String editarInformeStock(@RequestParam("id") String id, Model model) {
        // Añade el ID al modelo para que esté disponible en la vista
        model.addAttribute("id", id);
        
        // Aquí puedes añadir lógica adicional para obtener los datos del recurso que serán editados
        
        return "editar_informe_stock";  // Redirige a editar_informe_stock.html
    }
}
