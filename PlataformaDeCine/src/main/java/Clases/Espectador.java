
package Clases;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Espectador extends Persona{
    // ATRIBUTOS:_______________________________________________________________
    private String codigoEspectador;
    private String contraseña;
    private String fechaRegistro;
    
    // LISTA ESTÁTICA PARA ALMACENAR TODOS LOS ESPECTADORES REGISTRADOS:________
    private static List<Espectador> listaEspectadores = new ArrayList<>();
    
    // LISTA PARA GUARDAR EL HISTORIAL DE ENTRADAS COMPRADAS:___________________
    private List<Entrada> historialEntradas = new ArrayList<>();
    
    // CONSTRUCTOR SIN PARAMETROS:______________________________________________
    public Espectador() {
    }
    
    // CONSTRUCTOR CON PARAMETROS:______________________________________________
    public Espectador(
            String codigoEspectador, 
            String nombre, 
            String apellido, 
            String genero, 
            String fechaNacimiento, 
            String fechaRegistro, 
            String contraseña          
    ) {
        super(nombre, apellido, genero, fechaNacimiento);
        this.codigoEspectador = codigoEspectador;
        this.contraseña = contraseña;
        this.fechaRegistro = fechaRegistro;
    }
        
    // GETTERS:_________________________________________________________________
    public String getCodigoEspectador() {
        return codigoEspectador;
    }

    public String getContraseña() {
        return contraseña;
    }

    public String getFechaRegistro() {
        return fechaRegistro;
    }

    public static List<Espectador> getListaEspectadores() {
        return listaEspectadores;
    }

    public List<Entrada> getHistorialEntradas() {
        return historialEntradas;
    }
    
    // SETTERS:_________________________________________________________________
    public void setCodigoEspectador(String codigoEspectador) {
        this.codigoEspectador = codigoEspectador;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public void setFechaRegistro(String fechaRegistro) {
        this.fechaRegistro = fechaRegistro;
    }

    public static void setListaEspectadores(List<Espectador> listaEspectadores) {
        Espectador.listaEspectadores = listaEspectadores;
    }

    public void setHistorialEntradas(List<Entrada> historialEntradas) {
        this.historialEntradas = historialEntradas;
    }
    
    // SOBREESCRITURA DEL METODO TO STRING :____________________________________
    @Override
    public String toString() {
        return "Espectador{" 
                + "codigoEspectador=" + codigoEspectador 
                + ", contrase\u00f1a=" + contraseña 
                + ", fechaRegistro=" + fechaRegistro 
                + ", historialEntradas=" + historialEntradas 
                + '}';
    }
    
    // MÉTODO PARA COMPARAR SI DOS ESPECTADORES SON IGUALES MEDIANTE SU CÓDIGO:_  
    @Override
    public boolean equals(Object obj) {
        // SI SON LA MISMA INSTANCIA, SON IGUALES:______________________________
        if (this == obj) return true;   
        // VERIFICA QUE EL OBJETO NO SEA NULO Y QUE SEAN DE LA MISMA CLASE:_____
        if (obj == null || getClass() != obj.getClass()) return false;   
        Espectador other = (Espectador) obj;
        // COMPARA LOS CÓDIGOS PARA DETERMINAR IGUALDAD:_ _ _ _ _ _ _ _ _ _ _ _ 
        return Objects.equals(codigoEspectador, other.codigoEspectador);   
    }

    // MÉTODO PARA GENERAR UN CÓDIGO HASH BASADO EN EL CÓDIGO DEL ESPECTADOR:___  
    @Override
    public int hashCode() {
        // GENERA UN CÓDIGO HASH UTILIZANDO EL CÓDIGO DEL ESPECTADOR:_ _ _ _ _ _  
        return Objects.hash(codigoEspectador);   
    }
    
    /*________________________________________________________________________*/
    
    // MÉTODO ESTÁTICO PARA REGISTRAR UN NUEVO ESPECTADOR:______________________
    public static Espectador registrarse(
            String nombre, 
            String apellido, 
            String genero, 
            String fechaNacimiento, 
            String codigoEspectador, 
            String contraseña,
            String fechaRegistro
    ) {
        Espectador nuevoEspectador = new Espectador(
                nombre, 
                apellido, 
                genero, 
                fechaNacimiento, 
                codigoEspectador, 
                contraseña,
                fechaRegistro
        );
        // SE AGREGA A LA LISTA DE ESPECTADORES REGISTRADOS:_ _ _ _ _ _ _ _ _ _ 
        listaEspectadores.add(nuevoEspectador);  
        return nuevoEspectador;
    }
    
    // MÉTODO PARA REGISTRARSE:_________________________________________________
    public void agregarEspectador(Espectador espectador) {
        listaEspectadores.add(espectador);
    }
    
    // MÉTODO PARA COMPRAR UNA ENTRADA Y GUARDARLA EN EL HISTORIAL:_____________
    public void comprarEntrada(Entrada entrada) {
        historialEntradas.add(entrada);
    }

    // MÉTODO PARA CANCELAR UNA ENTRADA Y ELIMINARLA DEL HISTORIAL:_____________
    public void cancelarEntrada(Entrada entrada) {
        historialEntradas.remove(entrada);
    }

    // MÉTODO PARA LISTAR TODAS LAS ENTRADAS QUE HA COMPRADO EL ESPECTADOR:_____
    public List<Entrada> listarHistorialEntradas() {
        return historialEntradas;
    }
}
