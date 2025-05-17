
package Ventanas;

import Aplicacion.A01_CineSpacio;
import Clases.Administrador;
import Clases.Espectador;
import ConexionBD.CRUD_Administradores;
import ConexionBD.CRUD_Espectadores;
import ConexionBD.ConexionSQLServer;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class A02_IniciarSesion extends javax.swing.JFrame {
    // INSTANCIAS DE LAS CLASES:________________________________________________
    Administrador listaAdministrador = new Administrador();
    Espectador listaEspectador = new Espectador();
    
    // DECLARACION DE VARIABLES:________________________________________________
    private boolean contraseñaVisible = false;
    
    public A02_IniciarSesion() {
    // PROPIEDADES DE LA VENTANA:_______________________________________________    
        this.setTitle("CineSpacio - Iniciar Sesion");
        this.setSize(800, 500);
        this.setLocationRelativeTo(null);
        this.setResizable(false);
        
    // INICIALIZAR LOS COMPONENTES:_____________________________________________ 
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bgRoles = new javax.swing.ButtonGroup();
        PanelPrincipal = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        rbAdministrador = new javax.swing.JRadioButton();
        rbEspectador = new javax.swing.JRadioButton();
        btnAtras = new javax.swing.JButton();
        btnIniciarSesion = new javax.swing.JButton();
        txtContraseña = new javax.swing.JPasswordField();
        chbVisualizarContraseña = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 500));
        setResizable(false);

        PanelPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        PanelPrincipal.setMaximumSize(new java.awt.Dimension(800, 500));
        PanelPrincipal.setMinimumSize(new java.awt.Dimension(800, 500));

        jPanel1.setBackground(new java.awt.Color(255, 204, 102));
        jPanel1.setMaximumSize(new java.awt.Dimension(350, 400));
        jPanel1.setMinimumSize(new java.awt.Dimension(350, 400));
        jPanel1.setPreferredSize(new java.awt.Dimension(350, 400));

        jLabel13.setBackground(new java.awt.Color(0, 0, 0));
        jLabel13.setFont(new java.awt.Font("Bungee Inline", 0, 36)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("inicia sesion");
        jLabel13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel13.setMaximumSize(new java.awt.Dimension(300, 40));
        jLabel13.setMinimumSize(new java.awt.Dimension(300, 40));
        jLabel13.setPreferredSize(new java.awt.Dimension(300, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("Codigo :");

        txtCodigo.setMaximumSize(new java.awt.Dimension(250, 28));
        txtCodigo.setMinimumSize(new java.awt.Dimension(250, 28));
        txtCodigo.setPreferredSize(new java.awt.Dimension(250, 28));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Contraseña :");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Rol :");

        bgRoles.add(rbAdministrador);
        rbAdministrador.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rbAdministrador.setText("Administrador");
        rbAdministrador.setMaximumSize(new java.awt.Dimension(110, 22));
        rbAdministrador.setMinimumSize(new java.awt.Dimension(110, 22));
        rbAdministrador.setPreferredSize(new java.awt.Dimension(110, 22));
        rbAdministrador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbAdministradorActionPerformed(evt);
            }
        });

        bgRoles.add(rbEspectador);
        rbEspectador.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rbEspectador.setText("Espectador");
        rbEspectador.setMaximumSize(new java.awt.Dimension(110, 22));
        rbEspectador.setMinimumSize(new java.awt.Dimension(110, 22));
        rbEspectador.setPreferredSize(new java.awt.Dimension(110, 22));
        rbEspectador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbEspectadorActionPerformed(evt);
            }
        });

        btnAtras.setBackground(new java.awt.Color(255, 255, 153));
        btnAtras.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
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

        btnIniciarSesion.setBackground(new java.awt.Color(255, 255, 153));
        btnIniciarSesion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnIniciarSesion.setText("Ingresar");
        btnIniciarSesion.setBorder(null);
        btnIniciarSesion.setBorderPainted(false);
        btnIniciarSesion.setContentAreaFilled(false);
        btnIniciarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIniciarSesion.setMaximumSize(new java.awt.Dimension(100, 30));
        btnIniciarSesion.setMinimumSize(new java.awt.Dimension(100, 30));
        btnIniciarSesion.setOpaque(true);
        btnIniciarSesion.setPreferredSize(new java.awt.Dimension(100, 30));
        btnIniciarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarSesionActionPerformed(evt);
            }
        });

        txtContraseña.setMaximumSize(new java.awt.Dimension(250, 28));
        txtContraseña.setMinimumSize(new java.awt.Dimension(250, 28));
        txtContraseña.setPreferredSize(new java.awt.Dimension(250, 28));

        chbVisualizarContraseña.setText("Visualizar contraseña");
        chbVisualizarContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbVisualizarContraseñaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(chbVisualizarContraseña)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnIniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtCodigo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(rbAdministrador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(rbEspectador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(txtContraseña, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(51, 51, 51))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jLabel4)
                .addGap(1, 1, 1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbEspectador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbAdministrador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chbVisualizarContraseña)
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnIniciarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\Iconos - Cine\\Fondo Registro Cine (800-600px).png")); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(800, 500));
        jLabel1.setMinimumSize(new java.awt.Dimension(800, 500));
        jLabel1.setPreferredSize(new java.awt.Dimension(800, 500));

        javax.swing.GroupLayout PanelPrincipalLayout = new javax.swing.GroupLayout(PanelPrincipal);
        PanelPrincipal.setLayout(PanelPrincipalLayout);
        PanelPrincipalLayout.setHorizontalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPrincipalLayout.createSequentialGroup()
                .addGap(225, 225, 225)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        PanelPrincipalLayout.setVerticalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelPrincipalLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbAdministradorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbAdministradorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbAdministradorActionPerformed

    private void rbEspectadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbEspectadorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbEspectadorActionPerformed

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        
        A01_CineSpacio inicio = new A01_CineSpacio();
        inicio.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnIniciarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarSesionActionPerformed
        try {
            // VALIDAR QUE SE HAYA SELECCIONADO UN ROL
            if (!rbAdministrador.isSelected() && !rbEspectador.isSelected()) {
                JOptionPane.showMessageDialog(this, "Por favor, seleccione un rol");
                return;
            }

            // OBTENER CONEXIÓN A LA BASE DE DATOS
            Connection conexion = ConexionSQLServer.getInstance().getConnection();

            // VERIFICAR CREDENCIALES SEGÚN EL ROL SELECCIONADO
            if (rbAdministrador.isSelected()) {
                String codigoAdministrador = txtCodigo.getText().trim();
                String contraseñaAdministrador = new String(txtContraseña.getPassword());

                // VALIDAR QUE LOS CAMPOS NO ESTÉN VACÍOS
                if (codigoAdministrador.isEmpty() || contraseñaAdministrador.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios");
                    limpiarCampos();
                    return;
                }

                // VALIDAR QUE EL CÓDIGO DE ADMINISTRADOR TENGA EL FORMATO CORRECTO
                if (!codigoAdministrador.matches("^A[0-9]{8}$")) {
                    JOptionPane.showMessageDialog(this, "El código de Administrador debe iniciar con 'A' seguido de 8 dígitos");
                    limpiarCampos();
                    return;
                }

                CRUD_Administradores crudAdministrador = new CRUD_Administradores();
                Administrador administrador = crudAdministrador.validarCredenciales(codigoAdministrador, contraseñaAdministrador);

                // SI LAS CREDENCIALES SON VÁLIDAS
                if (administrador != null) {
                    JOptionPane.showMessageDialog(this, "¡Inicio de sesión exitoso!");
                    // OBTENER CÓDIGO
                    String codigo = administrador.getCodigoAdministrador(); 
                    // OBTENER NOMBRE
                    String nombre = administrador.getNombre(); 
                    // OBTENER APELLIDO
                    String apellido = administrador.getApellido();             
                    // OBTENER GÉNERO
                    String genero = administrador.getGenero(); 
                    // OBTENER FECHA DE NACIMIENTO
                    String fechaNacimiento = administrador.getFechaNacimiento(); 

                    // CREAR Y MOSTRAR EL MENÚ DEL ADMINISTRADOR
                    A04_MenuAdministrador menu = new A04_MenuAdministrador(
                            listaAdministrador,
                            codigo,
                            nombre, 
                            apellido, 
                            genero, 
                            fechaNacimiento
                    );
                    menu.setVisible(true); // HACER VISIBLE EL MENÚ
                    this.dispose(); // CERRAR LA VENTANA ACTUAL
                } else {
                    JOptionPane.showMessageDialog(this, "Código o contraseña incorrectos");
                    limpiarCampos();
                }
            } else {
                String codigoEspectador = txtCodigo.getText().trim();
                String contraseñaEspectador = new String(txtContraseña.getPassword());

                // VALIDAR QUE LOS CAMPOS NO ESTÉN VACÍOS
                if (codigoEspectador.isEmpty() || contraseñaEspectador.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios");
                    limpiarCampos();
                    return;
                }

                // VALIDAR QUE EL CÓDIGO DE ESPECTADOR TENGA EL FORMATO CORRECTO
                if (!codigoEspectador.matches("^E[0-9]{8}$")) {
                    JOptionPane.showMessageDialog(this, "El código de Espectador debe iniciar con 'E' seguido de 8 dígitos");
                    limpiarCampos();
                    return;
                }

                CRUD_Espectadores crudEspectador = new CRUD_Espectadores();
                Espectador espectador = crudEspectador.validarCredenciales(codigoEspectador, contraseñaEspectador);

                // SI LAS CREDENCIALES SON VÁLIDAS
                if (espectador != null) {
                    JOptionPane.showMessageDialog(this, "¡Inicio de sesión exitoso!");
                    // OBTENER CÓDIGO
                    String codigo = espectador.getCodigoEspectador(); 
                    // OBTENER NOMBRE
                    String nombre = espectador.getNombre(); 
                    // OBTENER APELLIDO
                    String apellido = espectador.getApellido();             
                    // OBTENER GÉNERO
                    String genero = espectador.getGenero(); 
                    // OBTENER FECHA DE NACIMIENTO
                    String fechaNacimiento = espectador.getFechaNacimiento(); 

                    // CREAR Y MOSTRAR EL MENÚ DEL ESPECTADOR
                    E04_MenuEspectador menu = new E04_MenuEspectador(
                            listaEspectador,
                            codigo,
                            nombre, 
                            apellido, 
                            genero, 
                            fechaNacimiento
                    );
                    menu.setVisible(true); // HACER VISIBLE EL MENÚ
                    this.dispose(); // CERRAR LA VENTANA ACTUAL
                } else {
                    JOptionPane.showMessageDialog(this, "Código o contraseña incorrectos");
                    limpiarCampos();
                }
            }
        } catch (SQLException e) {
            // MOSTRAR MENSAJE DE ERROR SI OCURRE UNA EXCEPCIÓN DE SQL
            JOptionPane.showMessageDialog(this, "Error de conexión: " + e.getMessage());
            e.printStackTrace();
        }  
    }//GEN-LAST:event_btnIniciarSesionActionPerformed

    private void chbVisualizarContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chbVisualizarContraseñaActionPerformed
        // METODO PARA PERMITIR LA VISIBILIDAD DE LA CONTRASEÑA:________________
        if (contraseñaVisible) {
            txtContraseña.setEchoChar('•'); 
            contraseñaVisible = false; 
        } else {
            txtContraseña.setEchoChar((char) 0); 
            contraseñaVisible = true; 
        } 
    }//GEN-LAST:event_chbVisualizarContraseñaActionPerformed
    
    // MÉTODO PARA LIMPIAR LOS CAMPOS DEL FORMULARIO:___________________________
    private void limpiarCampos() {
        // LIMPIAR EL CAMPO DE TEXTO "VARIANTE"
        txtCodigo.setText(""); 
        // LIMPIAR EL CAMPO DE CONTRASEÑA
        txtContraseña.setText(""); 
        // DESELECCIONAR EL RADIOBUTTON "ENCUESTADOR"
        rbAdministrador.setSelected(false); 
        // DESELECCIONAR EL RADIOBUTTON "PARTICIPANTE"
        rbEspectador.setSelected(false);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.ButtonGroup bgRoles;
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnIniciarSesion;
    private javax.swing.JCheckBox chbVisualizarContraseña;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton rbAdministrador;
    private javax.swing.JRadioButton rbEspectador;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JPasswordField txtContraseña;
    // End of variables declaration//GEN-END:variables
}
