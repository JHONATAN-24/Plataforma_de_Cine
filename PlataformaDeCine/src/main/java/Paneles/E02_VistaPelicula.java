
package Paneles;

import Clases.Pelicula;
import ConexionBD.CRUD_Peliculas;
import ConexionBD.ConexionSQLServer;
import Ventanas.E04_MenuEspectador;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class E02_VistaPelicula extends javax.swing.JPanel {

    private E04_MenuEspectador menuEspectador;
    private int codigoPelicula;
    private int codigoFuncion;
    
    public E02_VistaPelicula(
            E04_MenuEspectador menuEspectador
    ) {
        
        this.menuEspectador = menuEspectador;
        
        initComponents();
        obtenerValores(codigoPelicula, codigoFuncion);
        mostrarPeliculaCompleta(codigoPelicula);
        mostrarIconos(codigoPelicula);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        lbCodigo = new javax.swing.JLabel();
        lbEstado = new javax.swing.JLabel();
        lbTitulo = new javax.swing.JLabel();
        lbDescripcion = new javax.swing.JLabel();
        lbDirector = new javax.swing.JLabel();
        lbGenero = new javax.swing.JLabel();
        lbClasificacion = new javax.swing.JLabel();
        lbIdioma = new javax.swing.JLabel();
        lbSubtitulos = new javax.swing.JLabel();
        lbDuracion = new javax.swing.JLabel();
        btnVerFunciones = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();
        lbIconoPelicula = new javax.swing.JLabel();
        lbFondo = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(960, 478));
        setMinimumSize(new java.awt.Dimension(960, 478));
        setPreferredSize(new java.awt.Dimension(960, 478));

        panelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        panelPrincipal.setMaximumSize(new java.awt.Dimension(960, 478));
        panelPrincipal.setMinimumSize(new java.awt.Dimension(960, 478));
        panelPrincipal.setPreferredSize(new java.awt.Dimension(960, 478));
        panelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbCodigo.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lbCodigo.setForeground(new java.awt.Color(255, 255, 255));
        lbCodigo.setText("ID");
        panelPrincipal.add(lbCodigo, new org.netbeans.lib.awtextra.AbsoluteConstraints(21, 18, -1, -1));

        lbEstado.setBackground(new java.awt.Color(0, 0, 0));
        lbEstado.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbEstado.setForeground(new java.awt.Color(255, 255, 255));
        lbEstado.setText("Estado :");
        lbEstado.setOpaque(true);
        panelPrincipal.add(lbEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(266, 274, -1, -1));

        lbTitulo.setBackground(new java.awt.Color(0, 0, 0));
        lbTitulo.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        lbTitulo.setForeground(new java.awt.Color(255, 255, 255));
        lbTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbTitulo.setText("TITULO");
        lbTitulo.setAlignmentY(0.0F);
        lbTitulo.setMaximumSize(new java.awt.Dimension(930, 50));
        lbTitulo.setMinimumSize(new java.awt.Dimension(930, 50));
        lbTitulo.setOpaque(true);
        lbTitulo.setPreferredSize(new java.awt.Dimension(930, 50));
        panelPrincipal.add(lbTitulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(15, 12, -1, -1));

        lbDescripcion.setBackground(new java.awt.Color(255, 255, 255));
        lbDescripcion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbDescripcion.setText("Descripcion :");
        lbDescripcion.setPreferredSize(new java.awt.Dimension(550, 100));
        panelPrincipal.add(lbDescripcion, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 306, -1, -1));

        lbDirector.setBackground(new java.awt.Color(255, 255, 255));
        lbDirector.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbDirector.setText("Director :");
        panelPrincipal.add(lbDirector, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 412, -1, -1));

        lbGenero.setBackground(new java.awt.Color(255, 255, 255));
        lbGenero.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbGenero.setText("Genero :");
        panelPrincipal.add(lbGenero, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 412, -1, -1));

        lbClasificacion.setBackground(new java.awt.Color(255, 255, 255));
        lbClasificacion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbClasificacion.setText("Clasificacion :");
        panelPrincipal.add(lbClasificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 412, -1, -1));

        lbIdioma.setBackground(new java.awt.Color(255, 255, 255));
        lbIdioma.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbIdioma.setText("Idioma :");
        panelPrincipal.add(lbIdioma, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 438, -1, -1));

        lbSubtitulos.setBackground(new java.awt.Color(255, 255, 255));
        lbSubtitulos.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbSubtitulos.setText("Subtitulos :");
        panelPrincipal.add(lbSubtitulos, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 438, -1, -1));

        lbDuracion.setBackground(new java.awt.Color(255, 255, 255));
        lbDuracion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lbDuracion.setText("Duracion :");
        panelPrincipal.add(lbDuracion, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 438, -1, -1));

        btnVerFunciones.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnVerFunciones.setText("Ver Funciones");
        btnVerFunciones.setBorder(null);
        btnVerFunciones.setBorderPainted(false);
        btnVerFunciones.setContentAreaFilled(false);
        btnVerFunciones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVerFunciones.setMaximumSize(new java.awt.Dimension(100, 30));
        btnVerFunciones.setMinimumSize(new java.awt.Dimension(100, 30));
        btnVerFunciones.setPreferredSize(new java.awt.Dimension(100, 30));
        btnVerFunciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVerFuncionesActionPerformed(evt);
            }
        });
        panelPrincipal.add(btnVerFunciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(850, 438, -1, -1));

        btnAtras.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAtras.setText("Atrás");
        btnAtras.setBorder(null);
        btnAtras.setBorderPainted(false);
        btnAtras.setContentAreaFilled(false);
        btnAtras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAtras.setMaximumSize(new java.awt.Dimension(100, 30));
        btnAtras.setMinimumSize(new java.awt.Dimension(100, 30));
        btnAtras.setPreferredSize(new java.awt.Dimension(100, 30));
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });
        panelPrincipal.add(btnAtras, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 438, -1, -1));

        lbIconoPelicula.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        lbIconoPelicula.setMaximumSize(new java.awt.Dimension(210, 315));
        lbIconoPelicula.setMinimumSize(new java.awt.Dimension(210, 315));
        lbIconoPelicula.setPreferredSize(new java.awt.Dimension(210, 315));
        panelPrincipal.add(lbIconoPelicula, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, -1, -1));

        lbFondo.setMaximumSize(new java.awt.Dimension(960, 467));
        lbFondo.setMinimumSize(new java.awt.Dimension(960, 467));
        lbFondo.setPreferredSize(new java.awt.Dimension(960, 300));
        panelPrincipal.add(lbFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        menuEspectador.mostrarPanel("inicio", 0, 0); // No pasamos un ID porque no es necesario al volver
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnVerFuncionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVerFuncionesActionPerformed
        menuEspectador.mostrarPanel("verFunciones", codigoPelicula, 0);
    }//GEN-LAST:event_btnVerFuncionesActionPerformed
    
    public void obtenerValores(int idPelicula, int idFuncion){
        this.codigoPelicula = idPelicula;
        this.codigoFuncion = idFuncion;
    }
    
    public void mostrarPeliculaCompleta(int codigoPelicula){
        try {
            // OBTENER LA CONEXIÓN:_____________________________________________
            Connection conexion = ConexionSQLServer.getInstance().getConnection();

            // CREAR INSTANCIAS DE CRUD_Encuestas Y OBTENER LA ÚLTIMA ENCUESTA:_
            CRUD_Peliculas crud = new CRUD_Peliculas();
            Pelicula pelicula = crud.obtenerPelicula(conexion, codigoPelicula);

            // VERIFICAR SI SE OBTUVO UNA ENCUESTA:_____________________________
            if (pelicula != null) {
                // CREAR VARIABLES Y ASIGNAR VALORES:___________________________
                int codigo = pelicula.getCodigoPelicula();
                String titulo = pelicula.getTitulo();
                String descripcion = pelicula.getDescripcion();
                String genero = pelicula.getGenero();
                String clasificacion = pelicula.getClasificacion();
                String duracion = pelicula.getDuracion();
                String director = pelicula.getDirector();
                String idioma = pelicula.getIdioma();
                boolean subtitulos = pelicula.isSubtitulos();
                String estado = pelicula.getEstado();
                String nombreAdmin = pelicula.getAdministrador().getNombre();
                String apellidoAdmin = pelicula.getAdministrador().getApellido();
                
                // MOSTRAR LOS DATOS EN LOS JLabel:_____________________________
                lbCodigo.setText(Integer.toString(codigo));
                lbTitulo.setText("<html><p>" + titulo + "</p></html>");
                lbDescripcion.setText("<html><p>" + descripcion + "</p></html>");
                lbDirector.setText("Dirigiada por : " + director);
                lbGenero.setText("Genero: " + genero);
                lbClasificacion.setText("Clasificacion: " + clasificacion);
                lbDuracion.setText("Duracion: " + duracion);
                lbIdioma.setText("Idioma: " + idioma);
                lbSubtitulos.setText("Subtitulos: " + subtitulos);
                lbEstado.setText("Estado: " + estado);

            } else {
                // SI NO SE OBTIENE NINGUNA ENCUESTA:___________________________
                System.out.println("No se encontró ninguna pelicula.");
            }
        } catch (SQLException e) {
            // MANEJO DE EXCEPCIONES SQL:_______________________________________
            e.printStackTrace();
        } catch (Exception e) {
            // MANEJO DE CUALQUIER OTRA EXCEPCIÓN:______________________________
            e.printStackTrace();
        }
    }

    public void mostrarIconos(int codigoPelicula) {
        // Definir la ruta base para evitar repetirlo muchas veces
        String rutaBase = "C:\\Users\\Usuario\\Documents\\NetBeansProjects\\Iconos - Cine\\";

        // Rutas de los iconos por película
        String iconoFondo = "";
        String iconoPelicula = "";

        switch (codigoPelicula) {
            case 1:
                iconoPelicula = rutaBase + "El planeta de los simios poster (210-315px).png";
                iconoFondo = rutaBase + "Fondo - El reino del planeta de los simios (830-467px).png";
                break;
            case 2:
                iconoPelicula = rutaBase + "Oppenheimer poster (210-315px).png";
                iconoFondo = rutaBase + "Fondo - Oppenheimer (830-467px).png";
                break;
            case 3:
                iconoPelicula = rutaBase + "Deadpool & Wolverine poster (210-315px).png";
                iconoFondo = rutaBase + "Fondo - Deadpool & Wolverine (830-467px).jpg";
                break;
            case 4:
                iconoPelicula = rutaBase + "Mi villano favorito 4 poster (210-315px).png";
                iconoFondo = rutaBase + "Fondo - Mi villano favorito 4 (830-467px).jpg";
                break;
            case 5:
                iconoPelicula = rutaBase + "Intensamente 2 poster (210-315px).png";
                iconoFondo = rutaBase + "Fondo blanco y negro.png";
                break;
            case 6:
                iconoPelicula = rutaBase + "Godzilla x Kong - The New Empire poster (210-315px).png";
                iconoFondo = rutaBase + "Fondo blanco y negro.png";
                break;
            default:
                System.out.println("Código de película no válido");
                return; // Sale del método si el código no es válido
        }

        // Asegurar que las imágenes existen antes de cargarlas
        lbFondo.setIcon(new ImageIcon(iconoFondo));
        lbIconoPelicula.setIcon(new ImageIcon(iconoPelicula));
        
        // OBTENER EL COLOR PREDOMINANTE DE LA IMAGEN DE FONDO
        Color colorFondo = obtenerColorPromedio(iconoFondo);

        // DEFINIR UN COLOR CLARO PARA EL PANEL PRINCIPAL
        Color colorPanel = obtenerColorMuyClaro(colorFondo);
        panelPrincipal.setBackground(colorPanel);
        
    }
    
    // MÉTODO PARA OBTENER EL COLOR PROMEDIO DE UNA IMAGEN
    public static Color obtenerColorPromedio(String rutaImagen) {
        try {
            BufferedImage imagen = ImageIO.read(new File(rutaImagen));
            if (imagen == null) {
                System.out.println("ERROR: IMAGEN NO CARGADA.");
                return Color.GRAY;
            }

            int rojo = 0, verde = 0, azul = 0, contador = 0;
            for (int x = 0; x < imagen.getWidth(); x += 10) { // OPTIMIZACIÓN: SALTOS DE 10 PIXELES
                for (int y = 0; y < imagen.getHeight(); y += 10) {
                    Color color = new Color(imagen.getRGB(x, y));
                    rojo += color.getRed();
                    verde += color.getGreen();
                    azul += color.getBlue();
                    contador++;
                }
            }

            return new Color(rojo / contador, verde / contador, azul / contador);
        } catch (IOException e) {
            System.out.println("ERROR AL CARGAR LA IMAGEN: " + e.getMessage());
            return Color.GRAY;
        }
    }

    // MÉTODO PARA OBTENER UN COLOR MUY CLARO PARA EL PANEL PRINCIPAL
    public static Color obtenerColorMuyClaro(Color colorFondo) {
        // INCREMENTAR LA LUMINOSIDAD PARA HACER EL COLOR MÁS CLARO
        int nuevoRojo = Math.min(255, (int) (colorFondo.getRed() * 1.75));
        int nuevoVerde = Math.min(255, (int) (colorFondo.getGreen() * 1.75));
        int nuevoAzul = Math.min(255, (int) (colorFondo.getBlue() * 1.75));

        return new Color(nuevoRojo, nuevoVerde, nuevoAzul);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnVerFunciones;
    private javax.swing.JLabel lbClasificacion;
    private javax.swing.JLabel lbCodigo;
    private javax.swing.JLabel lbDescripcion;
    private javax.swing.JLabel lbDirector;
    private javax.swing.JLabel lbDuracion;
    private javax.swing.JLabel lbEstado;
    private javax.swing.JLabel lbFondo;
    private javax.swing.JLabel lbGenero;
    private javax.swing.JLabel lbIconoPelicula;
    private javax.swing.JLabel lbIdioma;
    private javax.swing.JLabel lbSubtitulos;
    private javax.swing.JLabel lbTitulo;
    private javax.swing.JPanel panelPrincipal;
    // End of variables declaration//GEN-END:variables
}
