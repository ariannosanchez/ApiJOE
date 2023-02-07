package pe.com.apijoecyber.service.impl.gestion;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.apijoecyber.entity.base.gestion.CategoriaEntity;
import pe.com.apijoecyber.repository.gestion.CategoriaRepository;
import pe.com.apijoecyber.service.gestion.CategoriaService;

import java.util.List;
import java.util.Optional;

@Service
public class CategoriaServiceImpl implements CategoriaService {
    @Autowired
    private CategoriaRepository repository;

    @Override
    public List<CategoriaEntity> findAll() {
        return repository.findAll();
    }

    @Override
    public List<CategoriaEntity> findAllCustom() {
        return repository.findAllCustom();
    }

    @Override
    public CategoriaEntity add(CategoriaEntity t) {
        return repository.save(t);
    }

    @Override
    public Optional<CategoriaEntity> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public CategoriaEntity update(CategoriaEntity t) {
        CategoriaEntity objcategoria = repository.getById(t.getCodigo());
        BeanUtils.copyProperties(t, objcategoria);
        return repository.save(objcategoria);
    }

    @Override
    public CategoriaEntity delete(CategoriaEntity t) {
        CategoriaEntity objcategoria = repository.getById(t.getCodigo());
        objcategoria.setEstado(false);
        return repository.save(objcategoria);
    }
}
