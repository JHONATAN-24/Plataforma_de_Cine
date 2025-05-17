
package Clases;

import java.util.Objects;

public class Funcion {
    // ATRIBUTOS:_______________________________________________________________
    private int codigoFuncion;
    private Pelicula pelicula;
    private Sala sala;
    private String formato;
    private String estado;
    private int asientosDisponibles;
    private String fechaInicio;
    private String horaInicio;
    private String fechaFin;
    private String horaFin;
    
    // CONSTRUCTOR SIN PARAMETROS:______________________________________________
    public Funcion() {
    }
    
    // CONSTRUCTOR CON PARAMETROS:______________________________________________
    public Funcion(int codigoFuncion, Pelicula pelicula, Sala sala, String formato, String estado, int asientosDisponibles, String fechaInicio, String horaInicio, String fechaFin, String horaFin) {
        this.codigoFuncion = codigoFuncion;
        this.pelicula = pelicula;
        this.sala = sala;
        this.formato = formato;
        this.estado = estado;
        this.asientosDisponibles = asientosDisponibles;
        this.fechaInicio = fechaInicio;
        this.horaInicio = horaInicio;
        this.fechaFin = fechaFin;
        this.horaFin = horaFin;
    }    
    
    // GETTERS:_________________________________________________________________
    public int getCodigoFuncion() {
        return codigoFuncion;
    }

    public Pelicula getPelicula() {
        return pelicula;
    }
    
    public Sala getSala() {
        return sala;
    }

    public String getFormato() {
        return formato;
    }

    public String getEstado() {
        return estado;
    }

    public int getAsientosDisponibles() {
        return asientosDisponibles;
    }

    public String getFechaInicio() {
        return fechaInicio;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public String getFechaFin() {
        return fechaFin;
    }

    public String getHoraFin() {
        return horaFin;
    }
    
    // SETTERS:_________________________________________________________________
    public void setCodigoFuncion(int codigoFuncion) {
        this.codigoFuncion = codigoFuncion;
    }

    public void setPelicula(Pelicula pelicula) {
        this.pelicula = pelicula;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setAsientosDisponibles(int asientosDisponibles) {
        this.asientosDisponibles = asientosDisponibles;
    }

    public void setFechaInicio(String fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public void setFechaFin(String fechaFin) {
        this.fechaFin = fechaFin;
    }

    public void setHoraFin(String horaFin) {
        this.horaFin = horaFin;
    }
    
    // SOBREESCRITURA DEL METODO TO STRING :____________________________________
    @Override
    public String toString() {
        return "Funcion{" + "codigoFuncion=" + codigoFuncion + ", pelicula=" + pelicula + ", sala=" + sala + ", formato=" + formato + ", estado=" + estado + ", asientosDisponibles=" + asientosDisponibles + ", fechaInicio=" + fechaInicio + ", horaInicio=" + horaInicio + ", fechaFin=" + fechaFin + ", horaFin=" + horaFin + '}';   
    }

    // MÉTODO PARA COMPARAR SI DOS FUNCIONES SON IGUALES MEDIANTE SU CÓDIGO:____
    @Override
    public boolean equals(Object obj) {
        // SI SON LA MISMA INSTANCIA, SON IGUALES:______________________________
        if (this == obj) return true;   
        // VERIFICA QUE EL OBJETO NO SEA NULO Y QUE SEAN DE LA MISMA CLASE:_____
        if (obj == null || getClass() != obj.getClass()) return false;   
        Funcion other = (Funcion) obj;
        // COMPARA LOS CÓDIGOS PARA DETERMINAR IGUALDAD:_ _ _ _ _ _ _ _ _ _ _ _
        return Objects.equals(codigoFuncion, other.codigoFuncion);   
    }

    // MÉTODO PARA GENERAR UN CÓDIGO HASH BASADO EN EL CÓDIGO DE LA FUNCIÓN:____  
    @Override
    public int hashCode() {
        // GENERA UN CÓDIGO HASH UTILIZANDO EL CÓDIGO DE LA FUNCIÓN:_ _ _ _ _ _  
        return Objects.hash(codigoFuncion);   
    }
}
