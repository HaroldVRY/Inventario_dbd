/* 
package harold_dbd.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import harold_dbd.demo.model.DetalleGuia;
import harold_dbd.demo.model.GuiaRemision;
import harold_dbd.demo.service.GuiaRemisionService;

@Controller
public class RecepcionesController {

    @Autowired
    private GuiaRemisionService guiaRemisionService;

    // Ruta para mostrar la página principal de recepciones
    @GetMapping("/recepciones")
    public String recepciones() {
        return "recepciones";  // Redirige a recepciones.html
    }

    // Ruta para mostrar el detalle de una recepción específica
    @GetMapping("/detalle_recepcion")
    public String detalleRecepcion(@RequestParam(value = "id", required = false) String id, Model model) {
        if (id != null) {
            // Obtener la guía de remisión por ID
            GuiaRemision guiaRemision = guiaRemisionService.obtenerGuiaRemision(id);
            // Obtener los detalles de la guía de remisión asociados a este ID
            List<DetalleGuia> detallesGuia = guiaRemisionService.obtenerDetallesGuia(id);

            // Agregar los datos al modelo para pasarlos a la vista
            model.addAttribute("guiaRemision", guiaRemision);
            model.addAttribute("detallesGuia", detallesGuia);
        }
        return "detalle_recepcion";  // Redirige a detalle_recepcion.html
    }

    // Ruta para editar una recepción específica
    @GetMapping("/editar_recepcion")
    public String editarRecepcion(@RequestParam(value = "id", required = false) String id, Model model) {
        if (id != null) {
            // Obtener la guía de remisión por ID para editar
            GuiaRemision guiaRemision = guiaRemisionService.obtenerGuiaRemision(id);
            // Agregar los datos de la guía al modelo para pasarlos a la vista de edición
            model.addAttribute("guiaRemision", guiaRemision);
        }
        return "editar_recepcion";  // Redirige a editar_recepcion.html
    }
    /* 

    @GetMapping("/testConnection")
    @ResponseBody
    public String testConnection() {
    List<DetalleGuia> detalles = guiaRemisionService.obtenerDetallesGuia("GR0001"); // Asegúrate de que exista el ID "1" en tu tabla
    return detalles.isEmpty() ? "No se encontraron datos" : "Conexión exitosa con la base de datos";
}
    */



    package harold_dbd.demo.controller;

    import org.springframework.stereotype.Controller;
    import org.springframework.ui.Model;
    import org.springframework.web.bind.annotation.GetMapping;
    import org.springframework.web.bind.annotation.RequestParam;
    
    @Controller
    public class RecepcionesController {
    
        @GetMapping("/recepciones")
        public String recepciones() {
            return "recepciones";  // Redirige a recepciones.html
        }
    
        @GetMapping("/detalle_recepcion")
        public String detalleRecepcion(@RequestParam(value = "id", required = false) String id, Model model) {
            // Pasa el parámetro 'id' a la vista
            model.addAttribute("id", id);
            return "detalle_recepcion";  // Redirige a detalle_recepcion.html
        }
    
        @GetMapping("/editar_recepcion")
        public String editarRecepcion(@RequestParam(value = "id", required = false) String id, Model model) {
            // Pasa el parámetro 'id' a la vista
            model.addAttribute("id", id);
            return "editar_recepcion";  // Redirige a editar_recepcion.html
        }
    }
    