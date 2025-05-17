
package Clases;

import java.util.List;
import java.util.Objects;

public class Pelicula {
    // ATRIBUTOS:_______________________________________________________________
    private int codigoPelicula;
    private String titulo;
    private String descripcion;
    private String genero;
    private String clasificacion;
    private String duracion;
    private String director;
    private List<String> actores;
    private String idioma;
    private boolean subtitulos;
    private String estado;
    private Administrador administrador;
    
    // CONSTRUCTOR SIN PARAMETROS:______________________________________________
    public Pelicula() {
    }
    
    // CONSTRUCTOR CON PARAMETROS:______________________________________________
    public Pelicula(
            int codigoPelicula, 
            String titulo, 
            String descripcion, 
            String genero, 
            String clasificacion, 
            String duracion, 
            String director, 
            List<String> actores, 
            String idioma, 
            boolean subtitulos, 
            String estado, 
            Administrador administrador
    ) {
        this.codigoPelicula = codigoPelicula;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.genero = genero;
        this.clasificacion = clasificacion;
        this.duracion = duracion;
        this.director = director;
        this.actores = actores;
        this.idioma = idioma;
        this.subtitulos = subtitulos;
        this.estado = estado;
        this.administrador = administrador;
    }

    // GETTERS:_________________________________________________________________
    public int getCodigoPelicula() {
        return codigoPelicula;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getGenero() {
        return genero;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public String getDuracion() {
        return duracion;
    }

    public String getDirector() {
        return director;
    }

    public List<String> getActores() {
        return actores;
    }

    public String getIdioma() {
        return idioma;
    }

    public boolean isSubtitulos() {
        return subtitulos;
    }

    public String getEstado() {
        return estado;
    }

    public Administrador getAdministrador() {
        return administrador;
    }

    // SETTERS:_________________________________________________________________
    public void setCodigoPelicula(int codigoPelicula) {
        this.codigoPelicula = codigoPelicula;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setActores(List<String> actores) {
        this.actores = actores;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public void setSubtitulos(boolean subtitulos) {
        this.subtitulos = subtitulos;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setAdministrador(Administrador administrador) {
        this.administrador = administrador;
    }
    
    // SOBREESCRITURA DEL METODO TO STRING :____________________________________
    @Override
    public String toString() {
        return "Pelicula{" + "codigoPelicula=" + codigoPelicula + ", titulo=" + titulo + ", descripcion=" + descripcion + ", genero=" + genero + ", clasificacion=" + clasificacion + ", duracion=" + duracion + ", director=" + director + ", actores=" + actores + ", idioma=" + idioma + ", subtitulos=" + subtitulos + ", estado=" + estado + ", administrador=" + administrador + '}';   
    }

    // MÉTODO PARA COMPARAR SI DOS PELICULAS SON IGUALES MEDIANTE SU CÓDIGO:____
    @Override
    public boolean equals(Object obj) {
        // SI SON LA MISMA INSTANCIA, SON IGUALES:______________________________
        if (this == obj) return true;   
        // VERIFICA QUE EL OBJETO NO SEA NULO Y QUE SEAN DE LA MISMA CLASE:_____
        if (obj == null || getClass() != obj.getClass()) return false;   
        Pelicula other = (Pelicula) obj;
        // COMPARA LOS CÓDIGOS PARA DETERMINAR IGUALDAD:_ _ _ _ _ _ _ _ _ _ _ _
        return Objects.equals(codigoPelicula, other.codigoPelicula);   
    }

    // MÉTODO PARA GENERAR UN CÓDIGO HASH BASADO EN EL CÓDIGO DE LA PELICULA:___  
    @Override
    public int hashCode() {
        // GENERA UN CÓDIGO HASH UTILIZANDO EL CÓDIGO DE LA PELICULA:_ _ _ _ _ _  
        return Objects.hash(codigoPelicula);   
    }
}
