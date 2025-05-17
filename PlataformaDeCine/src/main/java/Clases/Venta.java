
package Clases;

import java.util.List;
import java.util.Objects;

public class Venta {
    // ATRIBUTOS:_______________________________________________________________
    private int codigoVenta;
    private Espectador espectador;
    private List<Entrada> entradas;
    private String metodoPago;
    private String estadoPago;
    private double precioTotal;
    private String fechaVenta;
    
    // CONSTRUCTOR SIN PARAMETROS:______________________________________________
    public Venta() {
    }
    
    // CONSTRUCTOR CON PARAMETROS:______________________________________________
    public Venta(
            int codigoVenta, 
            Espectador espectador, 
            List<Entrada> entradas, 
            String metodoPago, 
            String estadoPago, 
            double precioTotal, 
            String fechaVenta
    ) {
        this.codigoVenta = codigoVenta;
        this.espectador = espectador;
        this.entradas = entradas;
        this.metodoPago = metodoPago;
        this.estadoPago = estadoPago;
        this.precioTotal = precioTotal;
        this.fechaVenta = fechaVenta;
    }
    
    // GETTERS:_________________________________________________________________
    public int getCodigoVenta() {
        return codigoVenta;
    }

    public Espectador getEspectador() {
        return espectador;
    }

    public List<Entrada> getEntradas() {
        return entradas;
    }

    public String getMetodoPago() {
        return metodoPago;
    }

    public String getEstadoPago() {
        return estadoPago;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public String getFechaVenta() {
        return fechaVenta;
    }

    // SETTERS:_________________________________________________________________
    public void setCodigoVenta(int codigoVenta) {
        this.codigoVenta = codigoVenta;
    }

    public void setEspectador(Espectador espectador) {
        this.espectador = espectador;
    }

    public void setEntradas(List<Entrada> entradas) {
        this.entradas = entradas;
    }

    public void setMetodoPago(String metodoPago) {
        this.metodoPago = metodoPago;
    }

    public void setEstadoPago(String estadoPago) {
        this.estadoPago = estadoPago;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }

    public void setFechaVenta(String fechaVenta) {
        this.fechaVenta = fechaVenta;
    }
    
    // SOBREESCRITURA DEL METODO TO STRING :____________________________________
    @Override
    public String toString() {
        return "Venta{" 
                + "codigoVenta=" + codigoVenta 
                + ", espectador=" + espectador 
                + ", entradas=" + entradas 
                + ", metodoPago=" + metodoPago 
                + ", estadoPago=" + estadoPago 
                + ", precioTotal=" + precioTotal 
                + ", fechaVenta=" + fechaVenta 
                + '}';
    }
    
    // MÉTODO PARA COMPARAR SI DOS VENTAS SON IGUALES MEDIANTE SU CÓDIGO:_______ 
    @Override
    public boolean equals(Object obj) {
        // SI SON LA MISMA INSTANCIA, SON IGUALES:______________________________
        if (this == obj) return true;   
        // VERIFICA QUE EL OBJETO NO SEA NULO Y QUE SEAN DE LA MISMA CLASE:_____
        if (obj == null || getClass() != obj.getClass()) return false;   
        Venta other = (Venta) obj;
        // COMPARA LOS CÓDIGOS PARA DETERMINAR IGUALDAD:_ _ _ _ _ _ _ _ _ _ _ _ 
        return Objects.equals(codigoVenta, other.codigoVenta);   
    }

    // MÉTODO PARA GENERAR UN CÓDIGO HASH BASADO EN EL CÓDIGO DE LA VENTA:______  
    @Override
    public int hashCode() {
        // GENERA UN CÓDIGO HASH UTILIZANDO EL CÓDIGO DE LA VENTA:_ _ _ _ _ _ _  
        return Objects.hash(codigoVenta);   
    }
}
