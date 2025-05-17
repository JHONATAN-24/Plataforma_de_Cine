
package Clases;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Butaca {
    // ATRIBUTOS:_______________________________________________________________
    private int codigoButaca;
    private Funcion funcion;
    private char fila;
    private int numero;
    private boolean estado;

    // LISTAS PARA ADMINISTRAR BUTACAS:_________________________________________
    private List<Butaca> listaButacas = new ArrayList<>();
    
    // CONSTRUCTOR SIN PARAMETROS:______________________________________________
    public Butaca() {
    }

    // CONSTRUCTOR CON PARAMETROS:______________________________________________   
    public Butaca(
            int codigoButaca, 
            Funcion funcion, 
            char fila, 
            int numero, 
            boolean estado
    ) {    
        this.codigoButaca = codigoButaca;
        this.funcion = funcion;
        this.fila = fila;
        this.numero = numero;
        this.estado = estado;
    }

    // GETTERS:_________________________________________________________________
    public int getCodigoButaca() {
        return codigoButaca;
    }

    public Funcion getFuncion() {
        return funcion;
    }

    public char getFila() {
        return fila;
    }

    public int getNumero() {
        return numero;
    }

    public boolean isEstado() {
        return estado;
    }

    public List<Butaca> getListaButacas() {
        return listaButacas;
    }
 
    // SETTERS:_________________________________________________________________

    public void setCodigoButaca(int codigoButaca) {
        this.codigoButaca = codigoButaca;
    }

    public void setFuncion(Funcion funcion) {
        this.funcion = funcion;
    }

    public void setFila(char fila) {
        this.fila = fila;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public void setListaButacas(List<Butaca> listaButacas) {
        this.listaButacas = listaButacas;
    }
    
    // SOBREESCRITURA DEL METODO TO STRING :____________________________________
    @Override    
    public String toString() {
        return "Butaca{" + "codigoButaca=" + codigoButaca + ", funcion=" + funcion + ", fila=" + fila + ", numero=" + numero + ", estado=" + estado + ", listaButacas=" + listaButacas + '}';   
    }

    // MÉTODO PARA COMPARAR SI DOS BUTACAS SON IGUALES MEDIANTE SU CÓDIGO:
    @Override
    public boolean equals(Object obj) {
        // SI SON LA MISMA INSTANCIA, SON IGUALES:______________________________
        if (this == obj) return true;   
        // VERIFICA QUE EL OBJETO NO SEA NULO Y QUE SEAN DE LA MISMA CLASE:_____
        if (obj == null || getClass() != obj.getClass()) return false;   
        Butaca other = (Butaca) obj;
        // COMPARA LOS CÓDIGOS PARA DETERMINAR IGUALDAD:_ _ _ _ _ _ _ _ _ _ _ _
        return Objects.equals(codigoButaca, other.codigoButaca);   
    }

    // MÉTODO PARA GENERAR UN CÓDIGO HASH BASADO EN EL CÓDIGO DE LA BUTACA:  
    @Override
    public int hashCode() {
        // GENERA UN CÓDIGO HASH UTILIZANDO EL CÓDIGO DE LA BUTACA:_ _ _ _ _ _ _ 
        return Objects.hash(codigoButaca);   
    }
    
    // MÉTODO PARA LISTAR TODOS LAS BUTACAS REGISTRADAS:________________________
    public List<Butaca> listarButacas() {
        return listaButacas;
    }
    
}
