package pe.com.apijoecyber.repository.gestion;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.apijoecyber.entity.base.gestion.ClienteEntity;
import java.util.List;

public class ClienteRepository extends JpaRepository<ClienteEntity, Long>{
    @Query("select r from ClienteEntity r where r.estado=1")
    List<ClienteEntity> findAllCustom();
}
