
/* 
// GuiaRemisionService.java
package harold_dbd.demo.service;

import harold_dbd.demo.model.GuiaRemision;
import harold_dbd.demo.model.DetalleGuia;
import harold_dbd.demo.repository.GuiaRemisionRepository;
import harold_dbd.demo.repository.DetalleGuiaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class GuiaRemisionService {

    @Autowired
    private GuiaRemisionRepository guiaRemisionRepository;
    
    @Autowired
    private DetalleGuiaRepository detalleGuiaRepository;

    public GuiaRemision obtenerGuiaRemision(String idGuiaRemision) {
        return guiaRemisionRepository.findById(idGuiaRemision).orElse(null);
    }

    public List<DetalleGuia> obtenerDetallesGuia(String idGuiaRemision) {
        return detalleGuiaRepository.findByGuiaRemisionId(idGuiaRemision);
    }
}

*/