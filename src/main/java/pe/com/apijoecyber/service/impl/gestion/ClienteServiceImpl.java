package pe.com.apijoecyber.service.impl.gestion;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.apijoecyber.entity.base.gestion.ClienteEntity;
import pe.com.apijoecyber.repository.gestion.ClienteRepository;
import pe.com.apijoecyber.service.gestion.ClienteService;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteServiceImpl implements ClienteService{
    
    @Autowired
    private ClienteRepository repository;

    @Override
    public List<ClienteEntity> findAll() {
        return repository.findAll();
    }

    @Override
    public List<ClienteEntity> findAllCustom() {
        return repository.findAllCustom();
    }

    @Override
    public ClienteEntity add(ClienteEntity t) {
        return repository.save(t);
    }

    @Override
    public Optional<ClienteEntity> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public ClienteEntity update(ClienteEntity t) {
        ClienteEntity objcli = repository.getById(t.getCodigo());
        BeanUtils.copyProperties(t, objcli);
        return repository.save(objcli);
    }

    @Override
    public ClienteEntity delete(ClienteEntity t) {
        ClienteEntity objcli = repository.getById(t.getCodigo());
        objcli.setEstado(false);
        return repository.save(objcli);
    }
}
