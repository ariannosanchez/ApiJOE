package pe.com.apijoecyber.service.impl.gestion;


import pe.com.apijoecyber.entity.base.gestion.ClienteEntity;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.apijoecyber.entity.base.gestion.ClienteEntity;
import pe.com.apijoecyber.repository.gestion.ClienteRepository;
import pe.com.apijoecyber.service.gestion.ClienteService;

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
    public ClienteEntity add(ClienteEntity cli) {
        return repository.save(cli);
    }

    @Override
    public Optional<ClienteEntity> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public ClienteEntity update(ClienteEntity cli) {
        ClienteEntity objcli = repository.getById(cli.getCodigo());
        BeanUtils.copyProperties(cli, objcli);
        return repository.save(objcli);
    }

    @Override
    public ClienteEntity delete(ClienteEntity cli) {
        ClienteEntity objcli = repository.getById(cli.getCodigo());
        objcli.setEstado(false);
        return repository.save(objcli);
    }
}


