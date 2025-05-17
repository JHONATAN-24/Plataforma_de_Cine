
package Clases;

public abstract class Persona {
    // ATRIBUTOS :______________________________________________________________
    private String nombre;
    private String apellido;
    private String genero;
    private String fechaNacimiento;
    
    // CONSTRUCTOR SIN PARAMETROS:______________________________________________
    public Persona() {
    }
    
    // CONSTRUCTOR CON PARAMETROS:______________________________________________
    public Persona(
            String nombre, 
            String apellido, 
            String genero, 
            String fechaNacimiento
    ) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.fechaNacimiento = fechaNacimiento;
    }
    
    // GETTERS :________________________________________________________________
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getGenero() {
        return genero;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }
    
    // SETTERS :________________________________________________________________
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }
    
    // SOBREESCRITURA DEL METODO TO STRING :____________________________________
    @Override
    public String toString() {
        return "Persona{" 
                + "nombre=" + nombre 
                + ", apellido=" + apellido 
                + ", genero=" + genero 
                + ", fechaNacimiento=" + fechaNacimiento 
                + '}';
    }

}
