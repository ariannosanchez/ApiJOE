package pe.com.apijoecyber.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.com.apijoecyber.entity.base.gestion.RolEntity;
import pe.com.apijoecyber.service.gestion.RolService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/rol")
public class RolRest {
    @Autowired
    private RolService service;

    @GetMapping
    public List<RolEntity> findAll(){
        return service.findAll();
    }

    @GetMapping("/custom")
    public List<RolEntity> findAllCustom(){
        return service.findAllCustom();
    }

    @PostMapping
    public RolEntity add(@RequestBody RolEntity r){
        return service.add(r);
    }

    @GetMapping("/{id}")
    public Optional<RolEntity> findById(@PathVariable long id){
        return service.findById(id);
    }

    @PutMapping("/{id}")
    public RolEntity update(@PathVariable long id, @RequestBody RolEntity r){
        r.setCodigo(id);
        return service.update(r);
    }

    @DeleteMapping("/{id}")
    public RolEntity delete(@PathVariable long id){
        RolEntity objrol = new RolEntity();
        objrol.setCodigo(id);
        return service.delete(RolEntity.builder().codigo(id).build());
    }

}
