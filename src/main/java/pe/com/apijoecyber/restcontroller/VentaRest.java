package pe.com.apijoecyber.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.com.apijoecyber.entity.base.gestion.VentaEntity;
import pe.com.apijoecyber.service.gestion.VentaService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/venta")
public class VentaRest {

    @Autowired
    private VentaService service;

    @GetMapping
    public List<VentaEntity> findAll(){
        return service.findAll();
    }

    @PostMapping
    public VentaEntity add(@RequestBody VentaEntity v){
        return service.add(v);
    }

    @GetMapping("/{id}")
    public Optional<VentaEntity> findById(@PathVariable long id){
        return service.findById(id);
    }

    @GetMapping("/custom")
    public List<VentaEntity> findAllCustom() {
        return service.findAllCustom();
    }

    @PutMapping("/{id}")
    public VentaEntity update(@PathVariable long id, @RequestBody VentaEntity v){
        v.setIdventa(id);
        return service.update(v);
    }

    @DeleteMapping("/{id}")
    public VentaEntity delete(@PathVariable long id){
        VentaEntity objventa = new VentaEntity();
        objventa.setIdventa(id);
        return service.delete(VentaEntity.builder().idventa(id).build());
    }
    
    
}
