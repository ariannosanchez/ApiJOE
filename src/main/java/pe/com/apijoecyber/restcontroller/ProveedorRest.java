/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.com.apijoecyber.restcontroller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.com.apijoecyber.entity.base.gestion.ProveedorEntity;
import pe.com.apijoecyber.service.gestion.ProveedorService;

@RestController
@RequestMapping("/proveedor")
public class ProveedorRest {
        @Autowired
    private ProveedorService service;
    
    @GetMapping
    public List<ProveedorEntity> findAll(){
        return service.findAll();
    }
    @GetMapping("/custom")
    public List<ProveedorEntity> findAllCustom(){
        return service.findAllCustom();
    }
    @PostMapping
    public ProveedorEntity add(@RequestBody ProveedorEntity p){
        return service.add(p);
    }
    @GetMapping("/{id}")
    public Optional<ProveedorEntity> findById(@PathVariable long id){
        return service.findById(id);
    }
    @PutMapping("/{id}")
    public ProveedorEntity update(@PathVariable long id, @RequestBody ProveedorEntity p){
        p.setIdproveedor(id);
        return service.update(p);
    }
    @DeleteMapping("/{id}")
    public ProveedorEntity delete(@PathVariable long id){
        ProveedorEntity objrol = new ProveedorEntity();
        objrol.setIdproveedor(id);
        return service.delete(ProveedorEntity.builder().idproveedor(id).build());
    }
}
