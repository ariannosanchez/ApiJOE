/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.com.apijoecyber.restcontroller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.com.apijoecyber.entity.base.gestion.EmpleadoEntity;
import pe.com.apijoecyber.service.gestion.EmpleadoService;

@RestController
@RequestMapping("/empleado")
public class EmpleadoRest  {
    @Autowired
    private EmpleadoService service;
    
    @GetMapping
    public List<EmpleadoEntity> findAll(){
        return service.findAll();
    }
    @GetMapping("/custom")
    public List<EmpleadoEntity> findAllCustom(){
        return service.findAllCustom();
    }
    @PostMapping
    public EmpleadoEntity add(@RequestBody EmpleadoEntity f){
        return service.add(f);
    }
    @GetMapping("/{id}")
    public Optional<EmpleadoEntity> findById(@PathVariable long id){
        return service.findById(id);
    }
    @PutMapping("/{id}")
    public EmpleadoEntity update(@PathVariable long id, @RequestBody EmpleadoEntity f){
        f.setCodigo(id);
        return service.update(f);
    }
}
