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
@Entity(name = "RolEntity")
@Table(name = "rol")
public class RolEntity extends BaseEntity implements Serializable {
    private static final long serialVersionUID=1L;
    @Id
    @Column(name = "idrol")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;
    @Column(name = "rol")
    private String rol;
}
