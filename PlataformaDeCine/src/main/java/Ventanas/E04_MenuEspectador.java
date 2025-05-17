
package Ventanas;

import Paneles.E02_VistaPelicula;
import Paneles.E03_Funciones;
import Paneles.E04_ElegirAsiento;
import Paneles.E01_InicioEspect;
import Clases.Espectador;
import Paneles.E05_PagoEntrada;
import java.awt.BorderLayout;
import java.awt.CardLayout;

public class E04_MenuEspectador extends javax.swing.JFrame {

    // Agregar los paneles al `Fondo`
    E01_InicioEspect panelInicio = new E01_InicioEspect(this);
    E02_VistaPelicula panelPelicula = new E02_VistaPelicula(this);
    E03_Funciones panelFunciones = new E03_Funciones(this);
    E04_ElegirAsiento panelAsientos = new E04_ElegirAsiento(this);
    E05_PagoEntrada panelPagos = new E05_PagoEntrada(this);
    

    private Espectador espectador = new Espectador();
    private String codigo;
    private String nombre;
    private String apellido;
    private String genero;
    private String fechaNacimiento;
    
    private CardLayout cardLayout;
    
    public E04_MenuEspectador(
            Espectador espectador,
            String codigo, 
            String nombre, 
            String apellido, 
            String genero, 
            String fechaNacimiento
    ) {
        // PROPIEDADES DE LA VENTANA:_______________________________________________
        this.setTitle("CineSpacio - Menú del Espectador");
        this.setSize(960, 540);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        
    // IGUALANDO LAS VARIBLES CON LOS PARAMETROS DEL CONSTRUCTOR:_______________
        this.espectador = espectador;
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.fechaNacimiento = fechaNacimiento;
        
    // INICIALIZAR LOS COMPONENTES:_____________________________________________
        initComponents();
        mostrarNombre();
        
        // Definir `CardLayout` en el panel Fondo
        cardLayout = new CardLayout();
        pnl_Fondo.setLayout(cardLayout);

        pnl_Fondo.add(panelInicio, "inicio"); 
        pnl_Fondo.add(panelPelicula, "vistaPelicula"); 
        pnl_Fondo.add(panelFunciones, "verFunciones");
        pnl_Fondo.add(panelAsientos, "verButacas");
        pnl_Fondo.add(panelPagos, "pagoEntrada");
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        pnl_Fondo = new javax.swing.JPanel();
        btnCuenta = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        lbNombreCompleto = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(960, 540));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setMaximumSize(new java.awt.Dimension(960, 540));
        jPanel1.setMinimumSize(new java.awt.Dimension(960, 540));
        jPanel1.setPreferredSize(new java.awt.Dimension(960, 540));

        pnl_Fondo.setBackground(new java.awt.Color(204, 204, 204));
        pnl_Fondo.setMaximumSize(new java.awt.Dimension(960, 478));
        pnl_Fondo.setMinimumSize(new java.awt.Dimension(960, 478));
        pnl_Fondo.setPreferredSize(new java.awt.Dimension(960, 478));

        javax.swing.GroupLayout pnl_FondoLayout = new javax.swing.GroupLayout(pnl_Fondo);
        pnl_Fondo.setLayout(pnl_FondoLayout);
        pnl_FondoLayout.setHorizontalGroup(
            pnl_FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 960, Short.MAX_VALUE)
        );
        pnl_FondoLayout.setVerticalGroup(
            pnl_FondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 478, Short.MAX_VALUE)
        );

        btnCuenta.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\Iconos - Cine\\Icono Perfil (Fondo 0)(50px).png")); // NOI18N
        btnCuenta.setBorder(null);
        btnCuenta.setBorderPainted(false);
        btnCuenta.setContentAreaFilled(false);
        btnCuenta.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCuentaActionPerformed(evt);
            }
        });

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Brush Script MT", 0, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("CineSpacio");
        jLabel11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel11.setPreferredSize(new java.awt.Dimension(150, 45));

        lbNombreCompleto.setBackground(new java.awt.Color(255, 255, 255));
        lbNombreCompleto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbNombreCompleto.setForeground(new java.awt.Color(255, 255, 255));
        lbNombreCompleto.setText("Nombre Completo");
        lbNombreCompleto.setMaximumSize(new java.awt.Dimension(200, 22));
        lbNombreCompleto.setMinimumSize(new java.awt.Dimension(200, 22));
        lbNombreCompleto.setPreferredSize(new java.awt.Dimension(200, 22));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbNombreCompleto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addComponent(pnl_Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(btnCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbNombreCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)))
                .addComponent(pnl_Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCuentaActionPerformed
        E05_CuentaESP cuenta = new E05_CuentaESP(        
            espectador,
            codigo, 
            nombre, 
            apellido, 
            genero, 
            fechaNacimiento
        );
        cuenta.setVisible(true);
    }//GEN-LAST:event_btnCuentaActionPerformed

    // METODO PARA MOSTRAR EL NOMBRE COMPLETO:__________________________________
    public void mostrarNombre(){
        lbNombreCompleto.setText(nombre + " " + apellido);
    }
    
    // Método para cambiar de panel y pasar parámetros si es necesario
    public void mostrarPanel(String nombrePanel, int idPelicula, int idFuncion) {
        switch (nombrePanel) {
            case "vistaPelicula":
                panelPelicula.obtenerValores(idPelicula, idFuncion);
                panelPelicula.mostrarPeliculaCompleta(idPelicula);
                panelPelicula.mostrarIconos(idPelicula);
                break;
            case "verFunciones":
                panelFunciones.obtenerValores(idPelicula, idFuncion);
                panelFunciones.mostrarFunciones(idPelicula);
                break;

            case "verButacas":
                panelAsientos.cargarButacas(idFuncion);
                break;
                
            case "pagoEntrada":
                //panelPagos.obtenerEspectador(codigo, nombre, apellido);
                break;
        }

        cardLayout.show(pnl_Fondo, nombrePanel);
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCuenta;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbNombreCompleto;
    private javax.swing.JPanel pnl_Fondo;
    // End of variables declaration//GEN-END:variables
}
