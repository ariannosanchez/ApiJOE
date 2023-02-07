/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.com.apijoecyber.repository.gestion;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import pe.com.apijoecyber.entity.base.gestion.ProveedorEntity;

/**
 *
 * @author medina
 */
public interface ProveedorRepository extends JpaRepository<ProveedorEntity, Long> {
    @Query("select d from EmpleadoEntity d where d.estado=1")
    List<ProveedorEntity> findAllCustom();
    
}
