
package Clases;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Administrador extends Persona{
    // ATRIBUTOS:_______________________________________________________________
    private String codigoAdministrador;
    private String contraseña;
    private String fechaRegistro;

    // LISTAS PARA ADMINISTRAR ESPECTADORES Y FUNCIONES:________________________
    private List<Administrador> listaAdministradores = new ArrayList<>();
    private List<Espectador> listaEspectadores = new ArrayList<>();
    private List<Funcion> listaFunciones = new ArrayList<>();
    
    // CONSTRUCTOR SIN PARAMETROS:______________________________________________
    public Administrador() {
    }

    // CONSTRUCTOR CON PARAMETROS:______________________________________________
    public Administrador(
            String codigoAdministrador,
            String nombre,
            String apellido,
            String genero, 
            String fechaNacimiento, 
            String fechaRegistro, 
            String contraseña
    ) {
        super(nombre, apellido, genero, fechaNacimiento);
        this.codigoAdministrador = codigoAdministrador;
        this.contraseña = contraseña;
        this.fechaRegistro = fechaRegistro;
    }
    

    // GETTERS:_________________________________________________________________
    public String getCodigoAdministrador() {
        return codigoAdministrador;
    }

    public String getContraseña() {
        return contraseña;
    }

    public String getFechaRegistro() {
        return fechaRegistro;
    }

    public List<Espectador> getListaEspectadores() {
        return listaEspectadores;
    }

    public List<Funcion> getListaFunciones() {
        return listaFunciones;
    }
    
    // SETTERS:_________________________________________________________________
    public void setCodigoAdministrador(String codigoAdministrador) {
        this.codigoAdministrador = codigoAdministrador;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public void setListaEspectadores(List<Espectador> listaEspectadores) {
        this.listaEspectadores = listaEspectadores;
    }

    
    public void setListaFunciones(List<Funcion> listaFunciones) {
        this.listaFunciones = listaFunciones;
    }

    // SOBREESCRITURA DEL METODO TO STRING :____________________________________
    @Override
    public String toString() {
        return "Administrador{"
                + "codigoAdministrador=" + codigoAdministrador
                + ", contrase\u00f1a=" + contraseña
                + ", fechaRegistro=" + fechaRegistro
                + ", listaEspectadores=" + listaEspectadores
                + ", listaFunciones=" + listaFunciones 
                + '}';
    }

    // MÉTODO PARA COMPARAR SI DOS ADMINISTRADORES SON IGUALES MEDIANTE SU CÓDIGO:  
    @Override
    public boolean equals(Object obj) {
        // SI SON LA MISMA INSTANCIA, SON IGUALES:______________________________
        if (this == obj) return true;   
        // VERIFICA QUE EL OBJETO NO SEA NULO Y QUE SEAN DE LA MISMA CLASE:_____
        if (obj == null || getClass() != obj.getClass()) return false;   
        Administrador other = (Administrador) obj;
        // COMPARA LOS CÓDIGOS PARA DETERMINAR IGUALDAD:_ _ _ _ _ _ _ _ _ _ _ _ 
        return Objects.equals(codigoAdministrador, other.codigoAdministrador);   
    }

    // MÉTODO PARA GENERAR UN CÓDIGO HASH BASADO EN EL CÓDIGO DEL ADMINISTRADOR:  
    @Override
    public int hashCode() {
        // GENERA UN CÓDIGO HASH UTILIZANDO EL CÓDIGO DEL ADMINISTRADOR:_ _ _ _  
        return Objects.hash(codigoAdministrador);   
    }
    
    /*________________________________________________________________________*/
    
    // MÉTODO PARA REGISTRARSE:_________________________________________________
    public void agregarAdministrador(Administrador administrador){
        listaAdministradores.add(administrador);
    }
    
    // MÉTODO PARA AGREGAR UN ESPECTADOR AL SISTEMA:____________________________
    public void agregarEspectador(Espectador espectador) {
        listaEspectadores.add(espectador);
    }

    // MÉTODO PARA ELIMINAR UN ESPECTADOR DEL SISTEMA:__________________________
    public void quitarEspectador(Espectador espectador) {
        listaEspectadores.remove(espectador);
    }

    // MÉTODO PARA LISTAR TODOS LOS ESPECTADORES REGISTRADOS:___________________
    public List<Espectador> listarEspectadores() {
        return listaEspectadores;
    }

    // MÉTODO PARA AGREGAR UNA FUNCIÓN AL SISTEMA:______________________________
    public void agregarFuncion(Funcion funcion) {
        listaFunciones.add(funcion);
    }

    // MÉTODO PARA ELIMINAR UNA FUNCIÓN DEL SISTEMA:____________________________
    public void quitarFuncion(Funcion funcion) {
        listaFunciones.remove(funcion);
    }

    // MÉTODO PARA LISTAR TODAS LAS FUNCIONES DISPONIBLES:______________________
    public List<Funcion> listarFunciones() {
        return listaFunciones;
    }
}
