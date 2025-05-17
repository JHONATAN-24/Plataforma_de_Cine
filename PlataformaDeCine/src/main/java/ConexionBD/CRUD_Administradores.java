
package ConexionBD;


import Clases.Administrador;
import Clases.Espectador;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class CRUD_Administradores {
     List<Administrador> listaAdmins = new ArrayList<Administrador>();
    
    public CRUD_Administradores() {
        
    }
    
    public Connection obtenerConexion() throws SQLException {
        return ConexionSQLServer.getInstance().getConnection();
    }
    
    public Administrador validarCredenciales(String codigoAdministrador, String contraseña) {
        Administrador administradorRegistrado = null;

        try (Connection conexion = obtenerConexion()) {
            // SENTENCIA SQL PARA SELECCIONAR ADMINISTRADOR CON LAS CREDENCIALES PROPORCIONADAS
            String consulta = "SELECT * FROM Administradores WHERE ID_Administrador = ? AND Contraseña = ?";

            try (PreparedStatement declaracion = conexion.prepareStatement(consulta)) {
                // ESTABLECER LOS PARÁMETROS DE LA CONSULTA
                declaracion.setString(1, codigoAdministrador);
                declaracion.setString(2, contraseña);

                // EJECUTAR LA CONSULTA Y OBTENER EL RESULTADO
                try (ResultSet resultado = declaracion.executeQuery()) {
                    // SI SE ENCUENTRA UN ADMINISTRADOR QUE COINCIDE CON LAS CREDENCIALES
                    if (resultado.next()) {
                        // CREAR UN NUEVO OBJETO ADMINISTRADOR CON LOS DATOS OBTENIDOS
                        administradorRegistrado = new Administrador(
                            resultado.getString("ID_Administrador"),
                            resultado.getString("Nombre"),
                            resultado.getString("Apellido"),
                            resultado.getString("Genero"),
                            resultado.getString("FechaNacimiento"),
                            resultado.getString("FechaRegistro"),
                            resultado.getString("Contraseña")
                        );
                    }
                }
            }
        } catch (SQLException e) {
            // MANEJO DE ERRORES Y MENSAJE DE DIÁLOGO EN CASO DE ERROR DE CONEXIÓN
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error de conexión: " + e.getMessage());
        }
        return administradorRegistrado;
    }

    
    public void insertarAdministrador(Connection conexion, Administrador administrador) {
        // CONSULTA SQL PARA INSERTAR UN ADMINISTRADOR EN LA TABLA "Administradores"
        String consulta = "INSERT INTO Administradores (ID_Administrador, Nombre, Apellido, Genero, FechaNacimiento, Contraseña) VALUES (?, ?, ?, ?, ?, ?)";

        try {
            // PREPARAR LA DECLARACIÓN SQL CON LA CONEXIÓN PROPORCIONADA
            PreparedStatement declaracion = conexion.prepareStatement(consulta);

            // ESTABLECER LOS PARÁMETROS DE LA CONSULTA
            declaracion.setString(1, administrador.getCodigoAdministrador());
            declaracion.setString(2, administrador.getNombre());
            declaracion.setString(3, administrador.getApellido());
            declaracion.setString(4, administrador.getGenero());
            declaracion.setString(5, administrador.getFechaNacimiento());
            declaracion.setString(6, administrador.getContraseña());

            // EJECUTAR LA DECLARACIÓN SQL Y OBTENER EL NÚMERO DE FILAS INSERTADAS
            int filasInsertadas = declaracion.executeUpdate();

            // VERIFICAR SI SE INSERTÓ AL MENOS UNA FILA
            if (filasInsertadas > 0) {
                JOptionPane.showMessageDialog(null, "¡Administrador registrado en la base de datos!");
            }
        } catch (SQLException e) {
            // MANEJO DE ERRORES Y MENSAJE DE DIÁLOGO EN CASO DE ERROR DE INSERCIÓN
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al insertar Administrador: " + e.getMessage());
        }
    }

    public List<Administrador> obtenerAdministradores(Connection conexion) {
        // CREAR UNA LISTA PARA ALMACENAR LOS ADMINISTRADORES QUE SE OBTENDRÁN DE LA BASE DE DATOS
        List<Administrador> listaAdministradores = new ArrayList<>();

        // CONSULTA SQL PARA SELECCIONAR TODOS LOS REGISTROS DE LA TABLA "Administradores"
        String consulta = "SELECT * FROM Administradores";

        // PREPARAR LA DECLARACIÓN Y EJECUTAR LA CONSULTA
        try (PreparedStatement declaracion = conexion.prepareStatement(consulta);
             ResultSet resultado = declaracion.executeQuery()) {

            // RECORRER LOS RESULTADOS DE LA CONSULTA
            while (resultado.next()) {
                // CREAR UN NUEVO OBJETO ADMINISTRADOR Y ESTABLECER SUS ATRIBUTOS CON LOS DATOS OBTENIDOS
                Administrador administrador = new Administrador();
                administrador.setCodigoAdministrador(resultado.getString("ID_Administrador"));
                administrador.setNombre(resultado.getString("Nombre"));
                administrador.setApellido(resultado.getString("Apellido"));
                administrador.setGenero(resultado.getString("Genero"));
                administrador.setFechaNacimiento(resultado.getString("FechaNacimiento"));
                administrador.setFechaRegistro(resultado.getString("FechaRegistro"));
                administrador.setContraseña(resultado.getString("Contraseña"));

                // AÑADIR EL OBJETO ADMINISTRADOR A LA LISTA
                listaAdministradores.add(administrador);
            }
        } catch (SQLException ex) {
            // IMPRIMIR LA EXCEPCIÓN EN CASO DE ERROR DE CONSULTA O CONEXIÓN
            ex.printStackTrace();
        }

        // RETORNAR LA LISTA DE ADMINISTRADORES
        return listaAdministradores;
    }

    public List<Espectador> obtenerEspectadores(Connection conexion) {
        // CREAR UNA LISTA PARA ALMACENAR LOS ESPECTADORES QUE SE OBTENDRÁN DE LA BASE DE DATOS
        List<Espectador> listaEspectadores = new ArrayList<>();

        // CONSULTA SQL PARA SELECCIONAR TODOS LOS REGISTROS DE LA TABLA "Espectadores"
        String consulta = "SELECT * FROM Espectadores";

        // PREPARAR LA DECLARACIÓN Y EJECUTAR LA CONSULTA
        try (PreparedStatement declaracion = conexion.prepareStatement(consulta);
             ResultSet resultado = declaracion.executeQuery()) {

            // RECORRER LOS RESULTADOS DE LA CONSULTA
            while (resultado.next()) {
                // CREAR UN NUEVO OBJETO ESPECTADOR Y ESTABLECER SUS ATRIBUTOS CON LOS DATOS OBTENIDOS
                Espectador espectador = new Espectador(
                    resultado.getString("ID_Espectador"),
                    resultado.getString("Nombre"),
                    resultado.getString("Apellido"),
                    resultado.getString("Genero"),
                    resultado.getString("FechaNacimiento"),
                    resultado.getString("FechaRegistro"),
                    resultado.getString("Contraseña")
                );

                // AÑADIR EL OBJETO ESPECTADOR A LA LISTA
                listaEspectadores.add(espectador);
            }
        } catch (SQLException ex) {
            // IMPRIMIR LA EXCEPCIÓN EN CASO DE ERROR DE CONSULTA O CONEXIÓN
            ex.printStackTrace();
        }

        // RETORNAR LA LISTA DE ESPECTADORES
        return listaEspectadores;
    }

    
    
    public void actualizarAdministrador(Connection conexion, Administrador administrador) {
        String consulta = "UPDATE Administrador SET Nombre=?, Apellido=?, Genero=?, FechaNacimiento=?, Contraseña=? WHERE ID_Administrador=?";
        try {
            PreparedStatement declaracion = conexion.prepareStatement(consulta);
            declaracion.setString(1, administrador.getNombre());
            declaracion.setString(2, administrador.getApellido());
            declaracion.setString(3, administrador.getGenero());
            declaracion.setString(4, administrador.getFechaNacimiento());
            declaracion.setString(5, administrador.getCodigoAdministrador());
            declaracion.setString(6, administrador.getContraseña());

            int filasActualizadas = declaracion.executeUpdate();
            if (filasActualizadas > 0) {
                JOptionPane.showMessageDialog(null, "¡Administrador actualizado correctamente!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al actualizar administrador: " + e.getMessage());
        }
    }

    public void borrarAdministrador(Connection conexion, String codigoAdministrador) {
        String consulta = "DELETE FROM T_Encuestadores WHERE codigo=?";
        try {
            PreparedStatement statement = conexion.prepareStatement(consulta);
            statement.setString(1, codigoAdministrador);

            int filasEliminadas = statement.executeUpdate();
            if (filasEliminadas > 0) {
                JOptionPane.showMessageDialog(null, "¡Encuestador eliminado correctamente!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al eliminar encuestador: " + e.getMessage());
        }
    }
    
    public void mostrarLista(List<Administrador> lista) {
        StringBuilder cadena = new StringBuilder();
        for (Administrador enc : lista) {
            cadena.append("Código: ").append(enc.getCodigoAdministrador())
                  .append(", Nombre: ").append(enc.getNombre())
                  .append(", Apellido: ").append(enc.getApellido())
                  .append(", Género: ").append(enc.getGenero())
                  .append(", Fecha de Nacimiento: ").append(enc.getFechaNacimiento())
                  .append(", Contraseña : ").append(enc.getContraseña())
                  .append("\n");
        }
        JOptionPane.showMessageDialog(null, cadena.toString());
    }

}
