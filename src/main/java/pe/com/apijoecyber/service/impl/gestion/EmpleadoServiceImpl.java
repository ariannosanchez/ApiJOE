/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.com.apijoecyber.service.impl.gestion;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import pe.com.apijoecyber.entity.base.gestion.EmpleadoEntity;
import pe.com.apijoecyber.repository.gestion.EmpleadoRepository;
import pe.com.apijoecyber.service.gestion.EmpleadoService;

/**
 *
 * @author medina
 */
public class EmpleadoServiceImpl implements EmpleadoService {
    @Autowired
    private EmpleadoRepository repository;
    
    @Override
    public List<EmpleadoEntity> findAll() {
        return repository.findAll();
    }

    @Override
    public List<EmpleadoEntity> findAllCustom() {
        return repository.findAllCustom();
    }

    @Override
    public EmpleadoEntity add(EmpleadoEntity t) {
        return repository.save(t);
    }

    @Override
    public Optional<EmpleadoEntity> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public EmpleadoEntity update(EmpleadoEntity t) {
        EmpleadoEntity objrol = repository.getById(t.getCodigo());
        BeanUtils.copyProperties(t, objrol);
        return repository.save(objrol);
    }

    @Override
    public EmpleadoEntity delete(EmpleadoEntity t) {
        EmpleadoEntity objrol = repository.getById(t.getCodigo());
        objrol.setEstado(false);
        return repository.save(objrol);
    }
    
}
