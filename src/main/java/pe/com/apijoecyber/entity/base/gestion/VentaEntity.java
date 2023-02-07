package pe.com.apijoecyber.entity.base.gestion;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import java.io.Serializable;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import pe.com.apijoecyber.entity.base.BaseEntity;

@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Data
@EqualsAndHashCode(callSuper = false)
@Entity(name = "VentaEntity")
@Table(name = "venta")
public class VentaEntity extends BaseEntity implements Serializable{
 
    private static final long serialVersionUID=1L;
    @Id
    @Column(name = "idventa")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idventa;
    
    @Column(name = "fechaventa")
    private String fechaventa;

    @ManyToOne
    @JoinColumn(name = "idcliente",nullable = false)
    private ClienteEntity cliente;

    @ManyToOne
    @JoinColumn(name = "idempleado",nullable = false)
    private EmpleadoEntity empleado;    

}
