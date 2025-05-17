
package ConexionBD;

import Clases.Funcion;
import Clases.Pelicula;
import Clases.Sala;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CRUD_Funciones {

    public CRUD_Funciones() {
    }
    
    public Connection obtenerConexion() throws SQLException {
        return ConexionSQLServer.getInstance().getConnection();
    }
    
    public Funcion obtenerFuncion(Connection conexion, int codigoPelicula) {
        Funcion datosFuncion = null;

        // Consulta SQL con JOIN para obtener datos de la función, película y sala
        String consulta = "SELECT F.ID_Funcion, F.Formato, F.Estado, F.FechaHoraInicio, F.FechaHoraFin," 
                + "S.ID_Sala, S.Aforo," 
                + "P.ID_Pelicula, P.Titulo AS NombrePelicula" 
                + "FROM Funciones F" 
                + "JOIN Salas S ON F.ID_Sala = S.ID_Sala" 
                + "JOIN Peliculas P ON F.ID_Pelicula = P.ID_Pelicula" 
                + "WHERE F.ID_Pelicula = ?;";

        try (PreparedStatement declaracion = conexion.prepareStatement(consulta)) {
            // Asignamos el valor del parámetro
            declaracion.setInt(1, codigoPelicula);

            try (ResultSet resultado = declaracion.executeQuery()) {
                // Si hay resultados, creamos la función
                if (resultado.next()) {
                    datosFuncion = new Funcion();

                    // Llenamos los datos de la función
                    datosFuncion.setCodigoFuncion(resultado.getInt("ID_Funcion"));
                    datosFuncion.setFormato(resultado.getString("Formato"));
                    datosFuncion.setEstado(resultado.getString("Estado"));
                    datosFuncion.setFechaInicio(resultado.getString("FechaHoraInicio"));
                    datosFuncion.setFechaFin(resultado.getString("FechaHoraFin"));

                    // Crear y asignar la sala
                    Sala sala = new Sala();
                    sala.setNumero(resultado.getInt("ID_Sala"));
                    sala.setAforo(resultado.getInt("Aforo"));
                    datosFuncion.setSala(sala);

                    // Crear y asignar la película
                    Pelicula pelicula = new Pelicula();
                    pelicula.setCodigoPelicula(resultado.getInt("ID_Pelicula"));
                    pelicula.setTitulo(resultado.getString("NombrePelicula"));
                    datosFuncion.setPelicula(pelicula);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Imprime el error en la consola para depuración
        }

        return datosFuncion;
    }

    public List<Funcion> obtenerFunciones(Connection conexion, int codigoPelicula) {
        List<Funcion> listaFunciones = new ArrayList<>();

        // Consulta SQL corregida con espacios adecuados y alias claros
        String consulta = "SELECT F.ID_Funcion, F.Formato, F.Estado, F.FechaHoraInicio, F.FechaHoraFin, " 
                + "S.ID_Sala, S.Aforo, "
                + "P.ID_Pelicula, P.Titulo AS NombrePelicula "
                + "FROM Funciones F "
                + "JOIN Salas S ON F.ID_Sala = S.ID_Sala "
                + "JOIN Peliculas P ON F.ID_Pelicula = P.ID_Pelicula "
                + "WHERE F.ID_Pelicula = ?;";

        try (PreparedStatement declaracion = conexion.prepareStatement(consulta)) {
            // Asignamos el valor del parámetro
            declaracion.setInt(1, codigoPelicula);

            try (ResultSet resultado = declaracion.executeQuery()) {
                // Iteramos sobre los resultados y creamos las funciones
                while (resultado.next()) {
                    Funcion datosFuncion = new Funcion();

                    // Llenamos los datos de la función
                    datosFuncion.setCodigoFuncion(resultado.getInt("ID_Funcion"));
                    datosFuncion.setFormato(resultado.getString("Formato"));
                    datosFuncion.setEstado(resultado.getString("Estado"));
                    datosFuncion.setFechaInicio(resultado.getTimestamp("FechaHoraInicio").toString());
                    datosFuncion.setFechaFin(resultado.getTimestamp("FechaHoraFin").toString());

                    // Crear y asignar la sala
                    Sala sala = new Sala();
                    sala.setNumero(resultado.getInt("ID_Sala"));
                    sala.setAforo(resultado.getInt("Aforo"));
                    datosFuncion.setSala(sala);

                    // Crear y asignar la película
                    Pelicula pelicula = new Pelicula();
                    pelicula.setCodigoPelicula(resultado.getInt("ID_Pelicula"));
                    pelicula.setTitulo(resultado.getString("NombrePelicula"));
                    datosFuncion.setPelicula(pelicula);

                    // Agregamos la función a la lista
                    listaFunciones.add(datosFuncion);
                }
            }
        } catch (SQLException e) {
            e.printStackTrace(); // Imprime el error en la consola para depuración
        }

        return listaFunciones;
    }

}
