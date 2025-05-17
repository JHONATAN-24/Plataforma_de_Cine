
package Ventanas;

import Paneles.A01_InicioAdmin;
import Paneles.A02_Espectadores;
import Clases.Administrador;
import Clases.Espectador;
import Paneles.A04_VentaEntradas;
import java.awt.CardLayout;

public class A04_MenuAdministrador extends javax.swing.JFrame {

    A01_InicioAdmin panelInicio = new A01_InicioAdmin(this);
    A02_Espectadores panelEspectadores = new A02_Espectadores(this);
    A04_VentaEntradas panelEntradas = new A04_VentaEntradas(this);
    
    Administrador listaAdministrador = new Administrador();
    Espectador listaEspectador = new Espectador();
    
    private Administrador administrador = new Administrador();
    private String codigo;
    private String nombre;
    private String apellido;
    private String genero;
    private String fechaNacimiento;
    
    private CardLayout cardLayout;
    
    public A04_MenuAdministrador(
            Administrador administrador, 
            String codigo, 
            String nombre, 
            String apellido, 
            String genero, 
            String fechaNacimiento
    ) {
    // PROPIEDADES DE LA VENTANA:_______________________________________________
        this.setTitle("CineSpacio - Menú del Administrador");
        this.setSize(960, 540);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        
    // IGUALANDO LAS VARIBLES CON LOS PARAMETROS DEL CONSTRUCTOR:_______________
        this.administrador = administrador;
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        this.genero = genero;
        this.fechaNacimiento = fechaNacimiento;
        
    // INICIALIZAR LOS COMPONENTES:_____________________________________________
        initComponents();
        mostrarNombre();
                                                                                           
        cardLayout = new CardLayout();
        pnl_Fondo.setLayout(cardLayout);

        pnl_Fondo.add(panelInicio, "inicio"); 
        pnl_Fondo.add(panelEspectadores, "espectadores");
        pnl_Fondo.add(panelEntradas, "entradas");
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgGenero = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        PanelPrincipal = new javax.swing.JPanel();
        pnl_Fondo = new javax.swing.JPanel();
        btnCuenta = new javax.swing.JButton();
        lbNombreCompleto = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Brush Script MT", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 255));
        jLabel2.setText("CineSpacio");
        jLabel2.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel2.setPreferredSize(new java.awt.Dimension(150, 45));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(960, 540));
        setResizable(false);

        PanelPrincipal.setBackground(new java.awt.Color(51, 51, 51));
        PanelPrincipal.setMaximumSize(new java.awt.Dimension(960, 540));
        PanelPrincipal.setMinimumSize(new java.awt.Dimension(960, 540));
        PanelPrincipal.setPreferredSize(new java.awt.Dimension(960, 540));

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

        lbNombreCompleto.setBackground(new java.awt.Color(255, 255, 255));
        lbNombreCompleto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbNombreCompleto.setForeground(new java.awt.Color(255, 255, 255));
        lbNombreCompleto.setText("Nombre Completo");
        lbNombreCompleto.setMaximumSize(new java.awt.Dimension(200, 22));
        lbNombreCompleto.setMinimumSize(new java.awt.Dimension(200, 22));
        lbNombreCompleto.setPreferredSize(new java.awt.Dimension(200, 22));

        jLabel11.setBackground(new java.awt.Color(255, 255, 255));
        jLabel11.setFont(new java.awt.Font("Brush Script MT", 0, 36)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("CineSpacio");
        jLabel11.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel11.setPreferredSize(new java.awt.Dimension(150, 45));

        javax.swing.GroupLayout PanelPrincipalLayout = new javax.swing.GroupLayout(PanelPrincipal);
        PanelPrincipal.setLayout(PanelPrincipalLayout);
        PanelPrincipalLayout.setHorizontalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbNombreCompleto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(pnl_Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        PanelPrincipalLayout.setVerticalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lbNombreCompleto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnl_Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCuentaActionPerformed
        A05_CuentaADM cuenta = new A05_CuentaADM(
            administrador,
            codigo, 
            nombre, 
            apellido, 
            genero, 
            fechaNacimiento);
        cuenta.setVisible(true);
    }//GEN-LAST:event_btnCuentaActionPerformed

    // METODO PARA MOSTRAR EL NOMBRE COMPLETO:__________________________________
    public void mostrarNombre(){
        lbNombreCompleto.setText("<html><p>" + nombre + " " + apellido + "</p></html>");
    }
    
    // Método para cambiar de panel y pasar parámetros si es necesario
    public void mostrarPanel(String nombrePanel) {
        switch (nombrePanel) {
            case "espectadores":
                
                break;
            case "verFunciones":
                
                break;

            case "verButacas":
                
                break;
        }

        cardLayout.show(pnl_Fondo, nombrePanel);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.ButtonGroup bgGenero;
    private javax.swing.JButton btnCuenta;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lbNombreCompleto;
    private javax.swing.JPanel pnl_Fondo;
    // End of variables declaration//GEN-END:variables
}
