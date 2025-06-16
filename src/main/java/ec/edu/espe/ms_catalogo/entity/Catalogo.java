package ec.edu.espe.ms_catalogo.entity;

import jakarta.persistence.*;
import lombok.Data;
import java.time.LocalDateTime;

@Entity
@Table(name = "catalogo_publicaciones")
@Data
public class Catalogo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String titulo;

    private int anioPublicacion;
    private String editorial;

    @Column(unique = true, nullable = true) // ISBN puede ser único si existe, y nulo
    private String isbn;

    @Lob // Para textos largos
    private String resumen;
    private String idioma;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private TipoPublicacion tipoPublicacion;

    // Campos específicos para LIBRO
    private String genero;
    private Integer numeroPaginas; // Usar Integer para permitir null si no es libro
    private String edicion;

    // Campos específicos para ARTICULO
    private String revista;

    @Column(unique = true, nullable = true) // DOI puede ser único si existe, y nulo
    private String doi;
    private String areaInvestigacion;
    private String fechaPublicacionArticulo; // e.g., "2023-10-15"

    @Column(nullable = false, updatable = false)
    private LocalDateTime fechaRegistro;

    @PrePersist
    protected void onCreate() {
        fechaRegistro = LocalDateTime.now();
    }
}