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
import pe.com.apijoecyber.entity.base.gestion.ProductoEntity;
import pe.com.apijoecyber.service.gestion.ProductoService;


@RestController
@RequestMapping("/producto")
public class ProductoRest {
    @Autowired
    private ProductoService servicio;
    
    @GetMapping
    public List<ProductoEntity> findAll(){
        return servicio.findAll();
    }
    
    @GetMapping("/custom")
    public List<ProductoEntity> findAllCustom(){
        return servicio.findAllCustom();
    }
    
    @PostMapping
    public ProductoEntity add(@RequestBody ProductoEntity p){
        return servicio.add(p);
    }
    @GetMapping("/{id}")
    public Optional<ProductoEntity>findById(@PathVariable long id){
        return servicio.findById(id);
    }
    @PutMapping("/{id}")
    public ProductoEntity update(@PathVariable long id,@RequestBody ProductoEntity c){
        c.getIdprod();
        return servicio.update(c);
   
    }
    
    @DeleteMapping("/{id}")
    public ProductoEntity delete(@PathVariable long id){
        ProductoEntity objproducto=new ProductoEntity();
        objproducto.setIdprod(id);
        return servicio.delete(ProductoEntity.builder().idprod(id).build());
    }
    
}
