
package pe.com.apijoecyber.service.impl.gestion;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import pe.com.apijoecyber.entity.base.gestion.ProductoEntity;
import pe.com.apijoecyber.repository.gestion.ProductoRepository;
import pe.com.apijoecyber.service.gestion.ProductoService;


public class ProductoServicelmpl implements ProductoService{
    
     @Autowired
    private ProductoRepository repositorio;

    @Override
    public List<ProductoEntity> findAll() {
        return repositorio.findAll();
    }

    @Override
    public List<ProductoEntity> findAllCustom() {
        return repositorio.findAllCustom();
    }

    @Override
    public ProductoEntity add(ProductoEntity t) {
        return repositorio.save(t);

    }

    @Override
    public Optional<ProductoEntity> findById(Long id) {
        return repositorio.findById(id);
    }

    @Override
    public ProductoEntity update(ProductoEntity t) {
        ProductoEntity objproducto = repositorio.getById(t.getIdprod());
        BeanUtils.copyProperties(t, objproducto);
        return repositorio.save(objproducto);
    }

    @Override
    public ProductoEntity delete(ProductoEntity t) {
        ProductoEntity objproducto = repositorio.getById(t.getIdprod());
        objproducto.setEstado(false);
        return repositorio.save(objproducto);
    }

    
    
}
