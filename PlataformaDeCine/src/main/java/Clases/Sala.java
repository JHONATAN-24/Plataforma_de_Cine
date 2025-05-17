
package Clases;

import java.util.List;

public class Sala {
    // ATRIBUTOS:_______________________________________________________________
    private int numero;
    private int aforo;
    private String tipo;
    private List<Funcion> funciones;
    
    // CONSTRUCTOR SIN PARAMETROS:______________________________________________
    public Sala() {
    }
    
    // CONSTRUCTOR CON PARAMETROS:______________________________________________
    public Sala(int numero, int aforo, String tipo, List<Funcion> funciones) {
        this.numero = numero;
        this.aforo = aforo;
        this.tipo = tipo;
        this.funciones = funciones;
    }
    
    // GETTERS:_________________________________________________________________
    public int getNumero() {
        return numero;
    }

    public int getAforo() {
        return aforo;
    }

    public String getTipo() {
        return tipo;
    }

    public List<Funcion> getFunciones() {
        return funciones;
    }
    
    // SETTERS:_________________________________________________________________
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setAforo(int aforo) {
        this.aforo = aforo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setFunciones(List<Funcion> funciones) {
        this.funciones = funciones;
    }

    // SOBREESCRITURA DEL METODO TO STRING :____________________________________
    @Override
    public String toString() {
        return "Sala{" 
                + "numero=" + numero 
                + ", aforo=" + aforo 
                + ", tipo=" + tipo 
                + ", funciones=" + funciones 
                + '}';
    }
    
}
