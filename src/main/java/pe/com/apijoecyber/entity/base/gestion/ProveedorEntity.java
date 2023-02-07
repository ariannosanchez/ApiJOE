/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.com.apijoecyber.entity.base.gestion;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import java.io.Serializable;
import pe.com.apijoecyber.entity.base.BaseEntity;

/**
 *
 * @author medina
 */
public class ProveedorEntity extends BaseEntity implements Serializable{
    private static final long serialVersionUID=1L;
    @Id
    @Column(name="idproveedor")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idproveedor;
    @Column(name="nombre")
    private String nombre;
    @Column(name="ruc")
    private String ruc;
    @Column(name="razonsocial")
    private String razonsocial;
    @Column(name="direccion")
    private String direccion;
    @Column(name="email")
    private String email;
    @Column(name="telefono")
    private String telefono;
    
}
