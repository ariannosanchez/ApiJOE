package pe.com.apijoecyber.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.com.apijoecyber.entity.base.gestion.CompraEntity;
import pe.com.apijoecyber.service.gestion.CompraService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/compra")
public class CompraRest {
    @Autowired
    private CompraService service;

    @GetMapping
    public List<CompraEntity> findAll(){
        return service.findAll();
    }

    @GetMapping("/custom")
    public List<CompraEntity> findAllCustom(){
        return service.findAllCustom();
    }

    @PostMapping
    public CompraEntity add(@RequestBody CompraEntity c){
        return service.add(c);
    }

    @GetMapping("/{id}")
    public Optional<CompraEntity> findById(@PathVariable long id){
        return service.findById(id);
    }

    @PutMapping("/{id}")
    public CompraEntity update(@PathVariable long id, @RequestBody CompraEntity c){
        c.setIdcompra(id);
        return service.update(c);
    }

    @DeleteMapping("/{id}")
    public CompraEntity delete(@PathVariable long id){
        CompraEntity objcompra = new CompraEntity();
        objcompra.setIdcompra(id);
        return service.delete(CompraEntity.builder().idcompra(id).build());
    }
}
