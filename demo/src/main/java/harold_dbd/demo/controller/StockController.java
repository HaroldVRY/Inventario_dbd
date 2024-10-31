package harold_dbd.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class StockController {

    @GetMapping("/informe_stock")
    public String informeStock() {
        return "informe_stock";  // Redirige a informe_stock.html
    }
}
