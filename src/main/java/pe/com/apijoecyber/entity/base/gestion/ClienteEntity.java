package pe.com.apijoecyber.entity.base.gestion;

import java.io.Serializable;

@SuperBuilder
@NoArgsConstructor
@AllArgsConstructor
@Data
@EqualsAndHashCode(callSuper = false)
@Entity(name = "ClienteEntity")
@Table(name = "cliente")
public class ClienteEntity extends BaseEntity implements Serializable{
    private static final long serialVersionUID=1L;
    @Id
    @Column(name = "idcliente")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long codigo;
    @Column(name = "nombre")
    private String nombre;
    @Column(name = "apellido")
    private String apellido;
    @Column(name = "sexo")
    private String sexo;
    @Column(name = "email")
    private String email;
    @Column(name = "fechanacimiento")
    private String fecha;
    @Column(name = "documento")
    private String documento;
}
