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
import pe.com.apijoecyber.entity.base.gestion.DetalleVentaEntity;
import pe.com.apijoecyber.repository.gestion.DetalleVentaRepository;
import pe.com.apijoecyber.service.gestion.DetalleVentaService;

@Service
public class DetalleVentaServiceImpl implements DetalleVentaService{
    @Autowired
    private DetalleVentaRepository repository;
    @Override
    public List<DetalleVentaEntity> findAll() {
        return repository.findAll();
    }

    @Override
    public List<DetalleVentaEntity> findAllCustom() {
        return repository.findAllCustom();
    }

    @Override
    public DetalleVentaEntity add(DetalleVentaEntity t) {
        return repository.save(t);
    }

    @Override
    public Optional<DetalleVentaEntity> findById(Long id) {
        return repository.findById(id);
    }

    @Override
    public DetalleVentaEntity update(DetalleVentaEntity t) {
        DetalleVentaEntity objrol = repository.getById(t.getCodigo());
        BeanUtils.copyProperties(t, objrol);
        return repository.save(objrol);
    }

    @Override
    public DetalleVentaEntity delete(DetalleVentaEntity t) {
        DetalleVentaEntity objrol = repository.getById(t.getCodigo());
        objrol.setEstado(false);
        return repository.save(objrol);
    }
    
}
