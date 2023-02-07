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
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import pe.com.apijoecyber.entity.base.BaseEntity;

@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Data
@EqualsAndHashCode(callSuper = false)
@Entity(name = "ProductoEntity")
@Table(name = "producto")

public class ProductoEntity extends BaseEntity implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @Column(name = "idproducto")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idprod;
    
    @Column(name = "nombreproducto", length = 40, nullable = false)
    private String nombreprod;
    @Column(name = "precio", nullable = false)
    private double precioprod;   
    @Column(name = "stock")
    private int stockprod;
    @Column(name = "descripcion")
    private String descripcionprod;   
    @Column(name = "marca")
    private String marcaprod;
    @ManyToOne
    @JoinColumn(name = "idcategoria")
    private CategoriaEntity categoria;

}
