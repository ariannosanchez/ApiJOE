package pe.com.apijoecyber.service.impl.gestion;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.apijoecyber.entity.base.gestion.ProductoEntity;
import pe.com.apijoecyber.entity.base.gestion.VentaEntity;
import pe.com.apijoecyber.repository.gestion.ProductoRepository;
import pe.com.apijoecyber.repository.gestion.VentaRepository;
import pe.com.apijoecyber.service.gestion.VentaService;

@Service
public class VentaServiceImpl implements VentaService{
    
    @Autowired
    private VentaRepository repositorio;
    
    @Override
    public List<VentaEntity> findAll() {
        return repositorio.findAll();
    }

    @Override
    public List<VentaEntity> findAllCustom() {
        return repositorio.findAllCustom();
    }

    @Override
    public VentaEntity add(VentaEntity v) {
        return repositorio.save(v);
    }
    @Override
    public Optional<VentaEntity> findById(Long id) {
        return repositorio.findById(id);
    }

    @Override
    public VentaEntity update(VentaEntity v) {
        VentaEntity objventa = repositorio.getById(v.getIdventa());
        BeanUtils.copyProperties(v, objventa);
        return repositorio.save(objventa);
    }

    @Override
    public VentaEntity delete(VentaEntity v) {
        VentaEntity objventa = repositorio.getById(v.getIdventa());
        objventa.setEstado(false);
        return repositorio.save(objventa);
    }
}
