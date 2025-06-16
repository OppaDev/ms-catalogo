package ec.edu.espe.ms_catalogo.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ArticuloCientificoDto {
    // Campos de Publicacion
    private String titulo;
    private int anioPublicacion;
    private String editorial;
    private String isbn; // Aunque usualmente los artículos no tienen ISBN, está en el DTO original
    private String resumen;
    private String idioma;
    // Campos específicos de Articulo
    private String revista;
    private String doi;
    private String areaInvestigacion;
    private String fechaPublicacion; // Fecha específica de publicación del artículo

    private long idAutor; // Para referencia
    private String tipo; // Para ayudar a identificar el tipo en el listener
}