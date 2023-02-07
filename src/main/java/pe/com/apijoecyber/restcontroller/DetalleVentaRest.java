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
import pe.com.apijoecyber.entity.base.gestion.DetalleVentaEntity;
import pe.com.apijoecyber.service.gestion.DetalleVentaService;

@RestController
@RequestMapping("/detalleventa")
public class DetalleVentaRest {
    @Autowired
    private DetalleVentaService service;
    
     @GetMapping
    public List<DetalleVentaEntity> findAll(){
        return service.findAll();
    }
    @GetMapping("/custom")
    public List<DetalleVentaEntity> findAllCustom(){
        return service.findAllCustom();
    }
    @PostMapping
    public DetalleVentaEntity add(@RequestBody DetalleVentaEntity r){
        return service.add(r);
    }
    @GetMapping("/{id}")
    public Optional<DetalleVentaEntity> findById(@PathVariable long id){
        return service.findById(id);
    }
    @PutMapping("/{id}")
    public DetalleVentaEntity update(@PathVariable long id, @RequestBody DetalleVentaEntity r){     
        r.setIddetalle(id);
        return service.update(r);
    }
     @DeleteMapping("/{id}")
    public DetalleVentaEntity delete(@PathVariable long id){
        DetalleVentaEntity objrol = new DetalleVentaEntity();
        objrol.setIddetalle(id);
        return service.delete(DetalleVentaEntity.builder().iddetalle(id).build());
    }

}
