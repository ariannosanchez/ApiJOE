/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.com.apijoecyber.entity.base.gestion;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import java.io.Serializable;
import pe.com.apijoecyber.entity.base.BaseEntity;

@Entity(name = "DetalleVentaEntity")
@Table(name = "detalle_pedido")
public class DetalleVentaEntity extends BaseEntity implements Serializable{
    public static final long serialVersionUID = 1L;

    @Id
    @Column(name = "iddetallepedido")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long iddetalle;
    @Column(name = "cantidad")
    private int cantidad;
    @Column(name = "precioventa")
    private double precioventa;
    @Column(name = "igv")
    private double igv;

    @ManyToOne
    @JoinColumn(name = "idpedido")
    private VentaEntity venta;

    @ManyToOne
    @JoinColumn(name = "idproducto")
    private ProductoEntity producto;
}
