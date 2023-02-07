/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.com.apijoecyber.service.impl.gestion;


import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.com.apijoecyber.entity.base.gestion.ProveedorEntity;
import pe.com.apijoecyber.repository.gestion.ProveedorRepository;
import pe.com.apijoecyber.service.gestion.ProveedorService;

@Service
public class ProveedorServiceImpl implements ProveedorService{
    @Autowired
    private ProveedorRepository repository;
    
    @Override
    public List<ProveedorEntity> findAll() {
        return repository.findAll();
    }
    @Override
    public List<ProveedorEntity> findAllCustom() {
        return repository.findAllCustom();
    }

    @Override
    public ProveedorEntity add(ProveedorEntity t) {
        return repository.save(t);
    }

    @Override
    public Optional<ProveedorEntity> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public ProveedorEntity update(ProveedorEntity t) {
        ProveedorEntity objrol = repository.getById(t.getIdproveedor());
        BeanUtils.copyProperties(t, objrol);
        return repository.save(objrol);
    }

    @Override
    public ProveedorEntity delete(ProveedorEntity t) {
        ProveedorEntity objrol = repository.getById(t.getIdproveedor());
        objrol.setEstado(false);
        return repository.save(objrol);
    }
}
