/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.com.apijoecyber.repository.gestion;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import pe.com.apijoecyber.entity.base.gestion.ProveedorEntity;

/**
 *
 * @author medina
 */
@Repository
public interface ProveedorRepository extends JpaRepository<ProveedorEntity, Long> {
    @Query("select p from ProveedorEntity p where p.estado=1")
    List<ProveedorEntity> findAllCustom();
    
}
