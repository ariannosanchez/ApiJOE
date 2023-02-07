package pe.com.apijoecyber.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.com.apijoecyber.entity.base.gestion.CategoriaEntity;
import pe.com.apijoecyber.service.gestion.CategoriaService;

import java.util.List;

@RestController
@RequestMapping("/categoria")
public class CategoriaRest {
    @Autowired
    private CategoriaService service;

    @GetMapping
    public List<CategoriaEntity> findAll(){
        return service.findAll();
    }

    @PostMapping
    public CategoriaEntity add(@RequestBody CategoriaEntity c){
        return service.add(c);
    }

    @GetMapping("/{id}")
    public CategoriaEntity update(@PathVariable long id, @RequestBody CategoriaEntity c){
        c.setCodigo(id);
        return service.update(c);
    }

    @DeleteMapping("/{id}")
    public CategoriaEntity delete(@PathVariable long id){
        CategoriaEntity objcategoria = new CategoriaEntity();
        objcategoria.setCodigo(id);
        return service.delete(CategoriaEntity.builder().codigo(id).build());
    }

}
