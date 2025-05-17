
package ConexionBD;

import Clases.Espectador;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class CRUD_Espectadores {
    List<Espectador> listaEspects = new ArrayList<Espectador>();

    public CRUD_Espectadores() {
    }
    
    public Connection obtenerConexion() throws SQLException {
        return ConexionSQLServer.getInstance().getConnection();
    }
    
    public Espectador validarCredenciales(String codigoEspectador, String contraseña) {
        Espectador espectadorRegistrado = null;

        try (Connection conexion = obtenerConexion()) {
            String consulta = "SELECT * FROM Espectadores WHERE ID_Espectador = ? AND Contraseña = ?";

            try (PreparedStatement declaracion = conexion.prepareStatement(consulta)) {
                declaracion.setString(1, codigoEspectador);
                declaracion.setString(2, contraseña);

                try (ResultSet retorno = declaracion.executeQuery()) {
                    if (retorno.next()) {
                        // Crear objeto Espectador con los datos de la base de datos
                        espectadorRegistrado = new Espectador(
                            retorno.getString("ID_Espectador"),
                            retorno.getString("Nombre"),
                            retorno.getString("Apellido"),
                            retorno.getString("Genero"), // Asegúrate de que el nombre de la columna sea correcto
                            retorno.getString("FechaNacimiento"),
                            retorno.getString("FechaRegistro"),
                            retorno.getString("Contraseña")
                        );
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error de conexión: " + e.getMessage());
        }
        return espectadorRegistrado;
    }
    
    public void insertarEspectador(Connection conexion, Espectador espectador) {
        String consulta = "INSERT INTO Espectadores (ID_Espectador, Nombre, Apellido, Genero, FechaNacimiento, Contraseña) VALUES (?, ?, ?, ?, ?, ?)";
        try {
            PreparedStatement declaracion = conexion.prepareStatement(consulta);
            declaracion.setString(1, espectador.getCodigoEspectador());
            declaracion.setString(2, espectador.getNombre());
            declaracion.setString(3, espectador.getApellido());
            declaracion.setString(4, espectador.getGenero());
            declaracion.setString(5, espectador.getFechaNacimiento());
            declaracion.setString(6, espectador.getContraseña());

            int filasInsertadas = declaracion.executeUpdate();
            if (filasInsertadas > 0) {
                JOptionPane.showMessageDialog(null, "¡Espectador registrado en la base de datos!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error al insertar Espectador: " + e.getMessage());
        }
    }
    
    public String ultimoIdEspectador(Connection conexion) {
        String consulta = "SELECT TOP 1 ID_Espectador FROM Espectadores ORDER BY FechaRegistro DESC";
        String ultimoID = null;

        try (PreparedStatement declaracion = conexion.prepareStatement(consulta);
             ResultSet resultado = declaracion.executeQuery()) {

            if (resultado.next()) {
                ultimoID = resultado.getString("ID_Espectador"); // Ejemplo: "E00000002"
            }

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return ultimoID; // Retorna el ID completo, incluyendo la "E"
    }

    
}
