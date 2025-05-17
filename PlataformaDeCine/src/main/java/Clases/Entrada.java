
package Clases;

import java.util.Objects;

public class Entrada {
    // ATRIBUTOS:_______________________________________________________________
    private int codigoEntrada;
    private Funcion funcion;
    private Espectador espectador; 
    private String asiento;
    private String metodoPago;
    private double precioFinal;
    private String fechaCompra;
 
    // CONSTRUCTOR SIN PARAMETROS:______________________________________________
    public Entrada() {
    }
    
    // CONSTRUCTOR CON PARAMETROS:______________________________________________
    public Entrada(
            int codigoEntrada, 
            Funcion funcion, 
            Espectador espectador, 
            String asiento, 
            String metodoPago, 
            double precioFinal, 
            String fechaCompra
    ) {
        this.codigoEntrada = codigoEntrada;
        this.funcion = funcion;
        this.espectador = espectador;
        this.asiento = asiento;
        this.metodoPago = metodoPago;
        this.precioFinal = precioFinal;
        this.fechaCompra = fechaCompra;
    }
    
    // GETTERS:_________________________________________________________________
    public int getCodigoEntrada() {
        return codigoEntrada;
    }

    public Funcion getFuncion() {
        return funcion;
    }

    public Espectador getEspectador() {
        return espectador;
    }

    public String getAsiento() {
        return asiento;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public double getPrecioFinal() {
        return precioFinal;
    }

    public String getFechaCompra() {
        return fechaCompra;
    }
    
    // SETTERS:_________________________________________________________________
    public void setCodigoEntrada(int codigoEntrada) {
        this.codigoEntrada = codigoEntrada;
    }

    public void setFuncion(Funcion funcion) {
        this.funcion = funcion;
    }

    public void setEspectador(Espectador espectador) {
        this.espectador = espectador;
    }

    public void setAsiento(String asiento) {
        this.asiento = asiento;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public void setPrecioFinal(double precioFinal) {
        this.precioFinal = precioFinal;
    }

    public void setFechaCompra(String fechaCompra) {
        this.fechaCompra = fechaCompra;
    }
    
    // SOBREESCRITURA DEL METODO TO STRING :____________________________________
    @Override
    public String toString() {
        return "Entrada{" 
                + "codigoEntrada=" + codigoEntrada 
                + ", funcion=" + funcion 
                + ", espectador=" + espectador 
                + ", asiento=" + asiento 
                + ", metodoPago=" + metodoPago 
                + ", precioFinal=" + precioFinal 
                + ", fechaCompra=" + fechaCompra 
                + '}';   
    }

    // MÉTODO PARA COMPARAR SI DOS ENTRADAS SON IGUALES MEDIANTE SU CÓDIGO:_____
    @Override
    public boolean equals(Object obj) {
        // SI SON LA MISMA INSTANCIA, SON IGUALES:______________________________
        if (this == obj) return true;   
        // VERIFICA QUE EL OBJETO NO SEA NULO Y QUE SEAN DE LA MISMA CLASE:_____
        if (obj == null || getClass() != obj.getClass()) return false;   
        Entrada other = (Entrada) obj;
        // COMPARA LOS CÓDIGOS PARA DETERMINAR IGUALDAD:_ _ _ _ _ _ _ _ _ _ _ _
        return Objects.equals(codigoEntrada, other.codigoEntrada);   
    }

    // MÉTODO PARA GENERAR UN CÓDIGO HASH BASADO EN EL CÓDIGO DE LA ENTRADA:____  
    @Override
    public int hashCode() {
        // GENERA UN CÓDIGO HASH UTILIZANDO EL CÓDIGO DE LA ENTRADA:_ _ _ _ _ _  
        return Objects.hash(codigoEntrada);   
    }
}
