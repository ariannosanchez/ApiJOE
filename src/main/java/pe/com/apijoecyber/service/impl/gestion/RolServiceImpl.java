package pe.com.apijoecyber.service.impl.gestion;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.apijoecyber.entity.base.gestion.RolEntity;
import pe.com.apijoecyber.repository.gestion.RolRepository;
import pe.com.apijoecyber.service.gestion.RolService;

import java.util.List;
import java.util.Optional;

@Service
public class RolServiceImpl implements RolService {

    @Autowired
    private RolRepository repository;

    @Override
    public List<RolEntity> findAll() {
        return repository.findAll();
    }

    @Override
    public List<RolEntity> findAllCustom() {
        return repository.findAllCustom();
    }

    @Override
    public RolEntity add(RolEntity t) {
        return repository.save(t);
    }

    @Override
    public Optional<RolEntity> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public RolEntity update(RolEntity t) {
        RolEntity objrol = repository.getById(t.getCodigo());
        BeanUtils.copyProperties(t, objrol);
        return repository.save(objrol);
    }

    @Override
    public RolEntity delete(RolEntity t) {
        RolEntity objrol = repository.getById(t.getCodigo());
        objrol.setEstado(false);
        return repository.save(objrol);
    }
}
