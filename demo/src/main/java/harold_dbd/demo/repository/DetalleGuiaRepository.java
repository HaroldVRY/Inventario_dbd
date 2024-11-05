
/* 
// DetalleGuiaRepository.java
package harold_dbd.demo.repository;

import harold_dbd.demo.model.DetalleGuia;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface DetalleGuiaRepository extends JpaRepository<DetalleGuia, String> {
    List<DetalleGuia> findByGuiaRemisionId(String idGuiaRemision);
}
*/