package pe.com.apijoecyber.service.impl.gestion;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.apijoecyber.entity.base.gestion.CompraEntity;
import pe.com.apijoecyber.repository.gestion.CompraRepository;
import pe.com.apijoecyber.service.gestion.CompraService;

import java.util.List;
import java.util.Optional;

@Service
public class CompraServiceImpl implements CompraService {
    @Autowired
    private CompraRepository repository;

    @Override
    public List<CompraEntity> findAll() {
        return repository.findAll();
    }

    @Override
    public List<CompraEntity> findAllCustom() {
        return repository.findAllCustom();
    }

    @Override
    public CompraEntity add(CompraEntity t) {
        return repository.save(t);
    }

    @Override
    public Optional<CompraEntity> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public CompraEntity update(CompraEntity t) {
        CompraEntity objcompra = repository.getById(t.getIdcompra());
        BeanUtils.copyProperties(t, objcompra);
        return repository.save(objcompra);
    }

    @Override
    public CompraEntity delete(CompraEntity t) {
        CompraEntity objcompra = repository.getById(t.getIdcompra());
        objcompra.setEstado(false);
        return repository.save(objcompra);
    }
}
