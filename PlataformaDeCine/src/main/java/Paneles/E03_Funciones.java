
package Paneles;

import Clases.Funcion;
import Clases.Pelicula;
import ConexionBD.CRUD_Butacas;
import ConexionBD.CRUD_Funciones;
import ConexionBD.CRUD_Peliculas;
import ConexionBD.ConexionSQLServer;
import Ventanas.E04_MenuEspectador;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class E03_Funciones extends javax.swing.JPanel {

    private E04_MenuEspectador menuEspectador;
    private int codigoPelicula;
    private int codigoFuncion;
    
    public E03_Funciones(
            E04_MenuEspectador menuEspectador
    ) {
        
        this.menuEspectador = menuEspectador;
        
        initComponents();
        
        obtenerValores(codigoPelicula, codigoFuncion);
        mostrarFunciones(codigoPelicula);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        lbPeliculas = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblListaFunciones = new javax.swing.JTable();
        btnElegirFuncion = new javax.swing.JButton();
        btnAtras = new javax.swing.JButton();

        setMaximumSize(new java.awt.Dimension(960, 478));
        setMinimumSize(new java.awt.Dimension(960, 478));
        setPreferredSize(new java.awt.Dimension(960, 478));

        panelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        panelPrincipal.setMaximumSize(new java.awt.Dimension(960, 478));
        panelPrincipal.setMinimumSize(new java.awt.Dimension(960, 478));
        panelPrincipal.setPreferredSize(new java.awt.Dimension(960, 478));

        lbPeliculas.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbPeliculas.setForeground(new java.awt.Color(51, 51, 255));
        lbPeliculas.setText("Funciones");

        jScrollPane2.setBorder(null);
        jScrollPane2.setMaximumSize(new java.awt.Dimension(948, 379));
        jScrollPane2.setMinimumSize(new java.awt.Dimension(948, 379));
        jScrollPane2.setPreferredSize(new java.awt.Dimension(948, 379));

        tblListaFunciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Pelicula", "Formato", "Inicio", "Fin", "Sala", "Aforo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblListaFunciones.setMaximumSize(new java.awt.Dimension(918, 500));
        tblListaFunciones.setMinimumSize(new java.awt.Dimension(918, 500));
        tblListaFunciones.setPreferredSize(new java.awt.Dimension(918, 500));
        jScrollPane2.setViewportView(tblListaFunciones);

        btnElegirFuncion.setBackground(new java.awt.Color(204, 204, 204));
        btnElegirFuncion.setText("Elegir Funcion");
        btnElegirFuncion.setBorder(null);
        btnElegirFuncion.setBorderPainted(false);
        btnElegirFuncion.setContentAreaFilled(false);
        btnElegirFuncion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnElegirFuncion.setMaximumSize(new java.awt.Dimension(100, 30));
        btnElegirFuncion.setMinimumSize(new java.awt.Dimension(100, 30));
        btnElegirFuncion.setOpaque(true);
        btnElegirFuncion.setPreferredSize(new java.awt.Dimension(100, 30));
        btnElegirFuncion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnElegirFuncionActionPerformed(evt);
            }
        });

        btnAtras.setBackground(new java.awt.Color(204, 204, 204));
        btnAtras.setText("Atras");
        btnAtras.setBorder(null);
        btnAtras.setBorderPainted(false);
        btnAtras.setContentAreaFilled(false);
        btnAtras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAtras.setMaximumSize(new java.awt.Dimension(100, 30));
        btnAtras.setMinimumSize(new java.awt.Dimension(100, 30));
        btnAtras.setOpaque(true);
        btnAtras.setPreferredSize(new java.awt.Dimension(100, 30));
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelPrincipalLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addComponent(lbPeliculas)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnElegirFuncion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(lbPeliculas, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnElegirFuncion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnElegirFuncionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnElegirFuncionActionPerformed
        int filaSeleccionada = tblListaFunciones.getSelectedRow();
        
        if (filaSeleccionada != -1) {
            codigoFuncion = (int) tblListaFunciones.getValueAt(filaSeleccionada, 0);
            menuEspectador.mostrarPanel("verButacas", codigoPelicula, codigoFuncion);
        } else {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una función antes de continuar.", "Aviso", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnElegirFuncionActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        menuEspectador.mostrarPanel("vistaPelicula", codigoPelicula, 0);
    }//GEN-LAST:event_btnAtrasActionPerformed

    public void obtenerValores(int idPelicula, int idFuncion){
        this.codigoPelicula = idPelicula;
        this.codigoFuncion = idFuncion;
    }
    
    public void mostrarFuncionCompleta(int codigoPelicula){
        try {
            // OBTENER LA CONEXIÓN:_____________________________________________
            Connection conexion = ConexionSQLServer.getInstance().getConnection();

            // CREAR INSTANCIAS DE CRUD_Encuestas Y OBTENER LA ÚLTIMA ENCUESTA:_
            CRUD_Funciones crud = new CRUD_Funciones();
            Funcion funcion = crud.obtenerFuncion(conexion, codigoPelicula);

            // VERIFICAR SI SE OBTUVO UNA ENCUESTA:_____________________________
            if (funcion != null) {
                // CREAR VARIABLES Y ASIGNAR VALORES:___________________________
                int codigo = funcion.getCodigoFuncion();
                String formato = funcion.getFormato();
                String estado = funcion.getEstado();
                String fechaInicio = funcion.getFechaInicio();
                String fechaFin = funcion.getFechaFin();
                int sala = funcion.getSala().getNumero();
                int aforo = funcion.getSala().getAforo();
                int pelicula = funcion.getPelicula().getCodigoPelicula();
                String titulo = funcion.getPelicula().getTitulo();
                
                // MOSTRAR LOS DATOS EN LOS JLabel:_____________________________
                
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
    
    
    public void mostrarFunciones(int codigoPelicula) {
        try {
            // Obtener el modelo de la tabla
            DefaultTableModel dtm = (DefaultTableModel) tblListaFunciones.getModel();
            while (dtm.getRowCount() != 0) dtm.removeRow(0); // Limpiar la tabla

            // Usar getInstance() para obtener la conexión
            Connection conexion = ConexionSQLServer.getInstance().getConnection();
        
            // Instanciar la clase CRUD_Funciones y obtener la lista de funciones
            CRUD_Funciones crudFunciones = new CRUD_Funciones();
            List<Funcion> listaFunciones = crudFunciones.obtenerFunciones(conexion, codigoPelicula);
/*
            // Verificar si hay funciones disponibles
            if (listaFunciones.isEmpty()) {
                JOptionPane.showMessageDialog(this, "No hay funciones disponibles para esta película.");
                return;
            }
*/ 
            // Llenar la tabla con las funciones obtenidas
            for (Funcion funcion : listaFunciones) {
                Object[] rowData = {
                    funcion.getCodigoFuncion(),
                    funcion.getFormato(),
                    funcion.getEstado(),
                    funcion.getSala().getNumero(),
                    funcion.getFechaInicio(),
                    funcion.getFechaFin()
                };
                dtm.addRow(rowData);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error al conectar a la base de datos: " + e.getMessage());
            e.printStackTrace();
        }
    }



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnElegirFuncion;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lbPeliculas;
    private javax.swing.JPanel panelPrincipal;
    private javax.swing.JTable tblListaFunciones;
    // End of variables declaration//GEN-END:variables
}
