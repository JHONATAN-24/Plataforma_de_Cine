
package ConexionBD;

import Clases.Butaca;
import Clases.Sala;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;

public class CRUD_Butacas {

    public CRUD_Butacas() {
    }
    
    public Connection obtenerConexion() throws SQLException {
        return ConexionSQLServer.getInstance().getConnection();
    }
    
    public void cargarButacasDesdeBD(JButton[][] butacas) {
        String consulta = "SELECT Fila, Numero, Estado FROM Butacas";

        try (Connection conn = obtenerConexion();
             PreparedStatement declaracion = conn.prepareStatement(consulta);
             ResultSet resultado = declaracion.executeQuery()) {

            while (resultado.next()) {
                String fila = resultado.getString("Fila");
                int numero = resultado.getInt("Numero");
                boolean ocupada = resultado.getBoolean("Estado");

                // Convertir Fila (A, B, C, ...) a índice de la matriz
                int filaIndex = fila.charAt(0) - 'A';
                int colIndex = numero - 1;

                if (filaIndex >= 0 && filaIndex < 8 && colIndex >= 0 && colIndex < 12) {
                    butacas[filaIndex][colIndex].setBackground(ocupada ? Color.RED : Color.WHITE);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Butaca> cargarButacasDesdeBD(int idFuncion) {
        List<Butaca> listaButacas = new ArrayList<>();
        String consulta = "SELECT ID_Butaca, Fila, Numero, Estado FROM Butacas WHERE ID_Funcion = ?";

        try (Connection conexion = ConexionSQLServer.getInstance().getConnection();
             PreparedStatement declaracion = conexion.prepareStatement(consulta)) {

            declaracion.setInt(1, idFuncion);
            try (ResultSet resultado = declaracion.executeQuery()) {
                while (resultado.next()) {
                    Butaca butaca = new Butaca();
                    butaca.setCodigoButaca(resultado.getInt("ID_Butaca"));
                    butaca.setFila(resultado.getString("Fila").charAt(0));
                    butaca.setNumero(resultado.getInt("Numero"));
                    butaca.setEstado(resultado.getBoolean("Estado"));

                    listaButacas.add(butaca);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return listaButacas;
    }

    public void actualizarEstadoButaca(String fila, int numero, boolean ocupado) {
        String consulta = "UPDATE Butacas SET Estado = ? WHERE Fila = ? AND Numero = ?";

        try (Connection conn = obtenerConexion();
             PreparedStatement stmt = conn.prepareStatement(consulta)) {

            stmt.setBoolean(1, ocupado);
            stmt.setString(2, fila);
            stmt.setInt(3, numero);

            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
/*
    public boolean actualizarEstadoButacasEnBD(List<Butaca> butacasSeleccionadas) {
        String consulta = "UPDATE Butacas SET Estado = 1 WHERE ID_Funcion = ? AND Fila = ? AND Numero = ?";

        try (Connection conexion = obtenerConexion();
             PreparedStatement declaracion = conexion.prepareStatement(consulta)) {

            for (Butaca butaca : butacasSeleccionadas) {
                declaracion.setInt(1, butaca.getFuncion().getCodigoFuncion());
                declaracion.setString(2, String.valueOf(butaca.getFila()));
                declaracion.setInt(3, butaca.getNumero());
                declaracion.addBatch(); // Agregar a la ejecución en lote
            }

            int[] resultados = declaracion.executeBatch(); // Ejecutar en lote
            return resultados.length > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
*/
    public boolean actualizarEstadoButacasEnBD(List<Butaca> butacasSeleccionadas) {
        String consulta = "UPDATE Butacas SET Estado = 1 WHERE ID_Funcion = ? AND Fila = ? AND Numero = ?";

        try (Connection conexion = ConexionSQLServer.getInstance().getConnection();
             PreparedStatement declaracion = conexion.prepareStatement(consulta)) {

            for (Butaca butaca : butacasSeleccionadas) {
                declaracion.setInt(1, butaca.getFuncion().getCodigoFuncion());
                declaracion.setString(2, String.valueOf(butaca.getFila()));
                declaracion.setInt(3, butaca.getNumero());
                declaracion.addBatch();
            }

            int[] resultados = declaracion.executeBatch();
            int filasAfectadas = 0;
            for (int r : resultados) {
                if (r > 0) filasAfectadas += r;
            }

            System.out.println("Filas afectadas: " + filasAfectadas);
            return filasAfectadas > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public boolean actualizarEstadoButacaEnBD(Butaca butaca) {
        String consulta = "UPDATE Butacas SET Estado = 1 WHERE ID_Funcion = ? AND Fila = ? AND Numero = ?";

        if (butaca.getFuncion() == null) {
            System.err.println("Error: La butaca no tiene una función asignada.");
            return false;
        }

        try (Connection conexion = ConexionSQLServer.getInstance().getConnection();
             PreparedStatement declaracion = conexion.prepareStatement(consulta)) {

            declaracion.setInt(1, butaca.getFuncion().getCodigoFuncion());
            declaracion.setString(2, String.valueOf(butaca.getFila()));
            declaracion.setInt(3, butaca.getNumero());

            int filasAfectadas = declaracion.executeUpdate();
            System.out.println("Filas afectadas: " + filasAfectadas);

            return filasAfectadas > 0;

        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }


}
