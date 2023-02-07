package pe.com.apijoecyber.repository.gestion;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.com.apijoecyber.entity.base.gestion.CompraEntity;

import java.util.List;

@Repository
public interface CompraRepository extends JpaRepository<CompraEntity, Long> {
    @Query("select c from CompraEntity c where c.estado=1")
    List<CompraEntity> findAllCustom();
}
