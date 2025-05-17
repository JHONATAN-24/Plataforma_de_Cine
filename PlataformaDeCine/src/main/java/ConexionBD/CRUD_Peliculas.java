
package ConexionBD;

import Clases.Administrador;
import Clases.Pelicula;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CRUD_Peliculas {

    public CRUD_Peliculas() {
    }
    
    public Connection obtenerConexion() throws SQLException {
        return ConexionSQLServer.getInstance().getConnection();
    }
    
    public Pelicula obtenerPelicula(Connection conexion, int codigoPelicula){
        // INICIALIZAMOS A NULL YA QUE SOLO NECESITAMOS UNA PELÍCULA
        Pelicula datosPelicula = null;

        // SENTENCIA SQL PARA OBTENER LOS DATOS DE UNA PELÍCULA POR SU ID
        String consulta = "SELECT p.ID_Pelicula, p.Titulo, p.Descripcion, p.Genero, "
                + "p.Clasificacion, p.Duracion, p.Director, p.Idioma, p.Subtitulos, "
                + "ep.Estado, a.Nombre AS Nombre_Admin, a.Apellido AS Apellido_Admin "
                + "FROM Peliculas p "
                + "LEFT JOIN Estado_Pelicula ep ON p.ID_Pelicula = ep.ID_Pelicula "
                + "LEFT JOIN Administradores a ON p.ID_Administrador = a.ID_Administrador "
                + "WHERE ep.FechaCambio = ( "
                + "    SELECT MAX(FechaCambio) "
                + "    FROM Estado_Pelicula "
                + "    WHERE ID_Pelicula = p.ID_Pelicula "
                + ") "
                + "AND p.ID_Pelicula = ?;";

        try (PreparedStatement declaracion = conexion.prepareStatement(consulta)) {
            // ASIGNAMOS EL VALOR DEL PARÁMETRO
            declaracion.setInt(1, codigoPelicula);

            try (ResultSet resultado = declaracion.executeQuery()) {
                // USAMOS IF YA QUE SOLO QUEREMOS UNA PELÍCULA
                if (resultado.next()) {
                    // CREAMOS UNA INSTANCIA DE PELÍCULA Y ADMINISTRADOR
                    Pelicula pelicula = new Pelicula();
                    Administrador administrador = new Administrador();

                    // ASIGNAR LOS VALORES DEL RESULTSET A LA PELÍCULA
                    pelicula.setCodigoPelicula(resultado.getInt("ID_Pelicula"));
                    pelicula.setTitulo(resultado.getString("Titulo"));
                    pelicula.setDescripcion(resultado.getString("Descripcion"));
                    pelicula.setGenero(resultado.getString("Genero"));
                    pelicula.setClasificacion(resultado.getString("Clasificacion"));
                    pelicula.setDuracion(resultado.getString("Duracion"));
                    pelicula.setDirector(resultado.getString("Director"));
                    pelicula.setIdioma(resultado.getString("Idioma"));
                    pelicula.setSubtitulos(resultado.getBoolean("Subtitulos"));
                    pelicula.setEstado(resultado.getString("Estado"));

                    // ASIGNAR LOS DATOS DEL ADMINISTRADOR
                    administrador.setNombre(resultado.getString("Nombre_Admin"));
                    administrador.setApellido(resultado.getString("Apellido_Admin"));

                    // ASOCIAR EL ADMINISTRADOR A LA PELÍCULA
                    pelicula.setAdministrador(administrador);

                    // ASIGNAMOS LA PELÍCULA OBTENIDA
                    datosPelicula = pelicula;
                }
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        // DEVOLVER LOS DATOS DE LA PELÍCULA
        return datosPelicula;
    }
    
    public List<Pelicula> obtenerPeliculas(Connection conexion){
        // CREAR UNA LISTA PARA ALMACENAR LOS ADMINISTRADORES QUE SE OBTENDRÁN DE LA BASE DE DATOS
        List<Pelicula> listaPeliculas = new ArrayList<>();

        // SENTENCIA SQL PARA OBTENER LOS DATOS DE UNA PELÍCULA POR SU ID
        String consulta = "SELECT * From Peliculas;";

        // PREPARAR LA DECLARACIÓN Y EJECUTAR LA CONSULTA
        try (PreparedStatement declaracion = conexion.prepareStatement(consulta);
             ResultSet resultado = declaracion.executeQuery()) {

            // RECORRER LOS RESULTADOS DE LA CONSULTA
            while (resultado.next()) {
                // CREAMOS UNA INSTANCIA DE PELÍCULA Y ADMINISTRADOR
                    Pelicula pelicula = new Pelicula();

                    // ASIGNAR LOS VALORES DEL RESULTSET A LA PELÍCULA
                    pelicula.setCodigoPelicula(resultado.getInt("ID_Pelicula"));
                    pelicula.setTitulo(resultado.getString("Titulo"));
                    pelicula.setGenero(resultado.getString("Genero"));
                    pelicula.setDuracion(resultado.getString("Duracion"));
                    pelicula.setIdioma(resultado.getString("Idioma"));
                    pelicula.setSubtitulos(resultado.getBoolean("Subtitulos"));
                    // ASIGNAMOS LA PELÍCULA OBTENIDA
                    listaPeliculas.add(pelicula);
            }
        } catch (SQLException ex) {
            // IMPRIMIR LA EXCEPCIÓN EN CASO DE ERROR DE CONSULTA O CONEXIÓN
            ex.printStackTrace();
        }

        // DEVOLVER LOS DATOS DE LA PELÍCULA
        return listaPeliculas;
    }
    
}
