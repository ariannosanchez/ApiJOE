package pe.com.apijoecyber.repository.gestion;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.com.apijoecyber.entity.base.gestion.CategoriaEntity;

import java.util.List;

@Repository
public interface CategoriaRepository extends JpaRepository<CategoriaEntity, Long> {
    @Query("select c from CategoriaEntity c where c.estado=1")
    List<CategoriaEntity> findAllCustom();
}
