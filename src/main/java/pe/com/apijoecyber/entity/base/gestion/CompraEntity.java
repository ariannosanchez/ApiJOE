package pe.com.apijoecyber.entity.base.gestion;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import pe.com.apijoecyber.entity.base.BaseEntity;

import java.io.Serializable;

@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Data
@EqualsAndHashCode(callSuper = false)
@Entity(name = "CompraEntity")
@Table(name = "compras")

public class CompraEntity extends BaseEntity implements Serializable {
    private static final long serialVersionUID=1L;
    @Id
    @Column(name = "idcompra")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idcompra;
    @Column (name = "fechacompra")
    private String fechacompra;
    @Column (name = "numcomprobante")
    private String numcomprobante;

    @ManyToOne
    @JoinColumn(name="idproveedor")
    private ProveedorEntity proveedor;
}
