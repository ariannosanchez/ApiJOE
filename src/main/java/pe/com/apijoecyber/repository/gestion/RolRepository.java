package pe.com.apijoecyber.repository.gestion;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.apijoecyber.entity.base.gestion.RolEntity;

import java.util.List;

public interface RolRepository extends JpaRepository<RolEntity, Long> {
    @Query("select r from RolEntity r where r.estado=1")
    List<RolEntity> findAllCustom();
}
