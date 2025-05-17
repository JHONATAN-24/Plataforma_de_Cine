
package Ventanas;

import Aplicacion.A01_CineSpacio;
import Clases.Administrador;
import Clases.Espectador;
import ConexionBD.CRUD_Administradores;
import ConexionBD.CRUD_Espectadores;
import ConexionBD.ConexionSQLServer;
import java.sql.Connection;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

public class A03_Registro extends javax.swing.JFrame {

    Administrador listaAdministradores = new Administrador();
    Espectador listaEspectadores = new Espectador();
    
    // DECLARACION DE VARIABLES:________________________________________________
    private boolean contraseñaVisible = false;
    
    public A03_Registro() {
    // PROPIEDADES DE LA VENTANA:_______________________________________________    
        this.setTitle("CineSpacio - Registrarse");
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
        bgGenero = new javax.swing.ButtonGroup();
        PanelPrincipal = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnAtras = new javax.swing.JButton();
        btnRegistrarse = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        rbMasculino = new javax.swing.JRadioButton();
        txtCodigo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        dcFechaNacimiento = new com.toedter.calendar.JDateChooser();
        txtApellido = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        rbFemenino = new javax.swing.JRadioButton();
        rbEspectador = new javax.swing.JRadioButton();
        rbAdministrador = new javax.swing.JRadioButton();
        chbVisualizarContraseña = new javax.swing.JCheckBox();
        txtContraseña = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(800, 500));
        setResizable(false);

        PanelPrincipal.setMaximumSize(new java.awt.Dimension(800, 500));
        PanelPrincipal.setMinimumSize(new java.awt.Dimension(800, 500));
        PanelPrincipal.setPreferredSize(new java.awt.Dimension(800, 500));
        PanelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 204, 102));
        jPanel1.setMaximumSize(new java.awt.Dimension(350, 400));
        jPanel1.setMinimumSize(new java.awt.Dimension(350, 400));
        jPanel1.setPreferredSize(new java.awt.Dimension(350, 450));

        jLabel13.setBackground(new java.awt.Color(0, 0, 0));
        jLabel13.setFont(new java.awt.Font("Bungee Inline", 0, 36)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 255));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Registrate");
        jLabel13.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel13.setMaximumSize(new java.awt.Dimension(300, 40));
        jLabel13.setMinimumSize(new java.awt.Dimension(300, 40));
        jLabel13.setPreferredSize(new java.awt.Dimension(300, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel2.setText("Codigo :");
        jLabel2.setPreferredSize(new java.awt.Dimension(274, 16));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel3.setText("Contraseña :");
        jLabel3.setPreferredSize(new java.awt.Dimension(274, 16));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel4.setText("Rol :");

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

        btnRegistrarse.setBackground(new java.awt.Color(255, 255, 153));
        btnRegistrarse.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnRegistrarse.setText("Registrar");
        btnRegistrarse.setBorder(null);
        btnRegistrarse.setBorderPainted(false);
        btnRegistrarse.setContentAreaFilled(false);
        btnRegistrarse.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrarse.setMaximumSize(new java.awt.Dimension(100, 30));
        btnRegistrarse.setMinimumSize(new java.awt.Dimension(100, 30));
        btnRegistrarse.setOpaque(true);
        btnRegistrarse.setPreferredSize(new java.awt.Dimension(100, 30));
        btnRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarseActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel5.setText("Género :");

        bgGenero.add(rbMasculino);
        rbMasculino.setText("Masculino");
        rbMasculino.setMaximumSize(new java.awt.Dimension(100, 22));
        rbMasculino.setMinimumSize(new java.awt.Dimension(100, 22));
        rbMasculino.setPreferredSize(new java.awt.Dimension(104, 22));

        txtCodigo.setMaximumSize(new java.awt.Dimension(274, 28));
        txtCodigo.setMinimumSize(new java.awt.Dimension(274, 28));
        txtCodigo.setPreferredSize(new java.awt.Dimension(274, 28));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel6.setText("Fecha de nacimiento :");
        jLabel6.setPreferredSize(new java.awt.Dimension(120, 28));

        dcFechaNacimiento.setMaximumSize(new java.awt.Dimension(148, 28));
        dcFechaNacimiento.setPreferredSize(new java.awt.Dimension(148, 28));

        txtApellido.setMaximumSize(new java.awt.Dimension(274, 28));
        txtApellido.setMinimumSize(new java.awt.Dimension(274, 28));
        txtApellido.setPreferredSize(new java.awt.Dimension(274, 28));

        txtNombre.setMaximumSize(new java.awt.Dimension(274, 28));
        txtNombre.setMinimumSize(new java.awt.Dimension(274, 28));
        txtNombre.setPreferredSize(new java.awt.Dimension(274, 28));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel7.setText("Apellido :");
        jLabel7.setPreferredSize(new java.awt.Dimension(274, 16));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel8.setText("Nombre :");
        jLabel8.setPreferredSize(new java.awt.Dimension(274, 16));

        bgGenero.add(rbFemenino);
        rbFemenino.setText("Femenino");
        rbFemenino.setMaximumSize(new java.awt.Dimension(110, 22));
        rbFemenino.setMinimumSize(new java.awt.Dimension(110, 22));
        rbFemenino.setPreferredSize(new java.awt.Dimension(110, 22));

        bgRoles.add(rbEspectador);
        rbEspectador.setText("Espectador");
        rbEspectador.setMaximumSize(new java.awt.Dimension(110, 22));
        rbEspectador.setMinimumSize(new java.awt.Dimension(110, 22));
        rbEspectador.setPreferredSize(new java.awt.Dimension(110, 22));

        bgRoles.add(rbAdministrador);
        rbAdministrador.setText("Administrador");
        rbAdministrador.setMaximumSize(new java.awt.Dimension(110, 22));
        rbAdministrador.setMinimumSize(new java.awt.Dimension(110, 22));
        rbAdministrador.setPreferredSize(new java.awt.Dimension(110, 22));

        chbVisualizarContraseña.setText("Visualizar contraseña");
        chbVisualizarContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chbVisualizarContraseñaActionPerformed(evt);
            }
        });

        txtContraseña.setMaximumSize(new java.awt.Dimension(274, 28));
        txtContraseña.setMinimumSize(new java.awt.Dimension(274, 28));
        txtContraseña.setPreferredSize(new java.awt.Dimension(274, 28));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(chbVisualizarContraseña)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 274, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbMasculino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbFemenino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnRegistrarse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(txtCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtApellido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(dcFechaNacimiento, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(rbAdministrador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbEspectador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtContraseña, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(rbEspectador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(rbAdministrador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(rbMasculino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbFemenino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(dcFechaNacimiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(txtContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(chbVisualizarContraseña)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnRegistrarse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        PanelPrincipal.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 25, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\Iconos - Cine\\Fondo Registro Cine (800-600px).png")); // NOI18N
        jLabel1.setMaximumSize(new java.awt.Dimension(800, 500));
        jLabel1.setMinimumSize(new java.awt.Dimension(800, 500));
        jLabel1.setPreferredSize(new java.awt.Dimension(800, 500));
        PanelPrincipal.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

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

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        // TODO add your handling code here:
        A01_CineSpacio inicio = new A01_CineSpacio();
        inicio.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarseActionPerformed
        try {
            // VERIFICA QUE ALGÚN ROL ESTÉ SELECCIONADO:________________________
            if (!rbAdministrador.isSelected() && !rbEspectador.isSelected()) {
                JOptionPane.showMessageDialog(this, "Por favor, seleccione un rol");
                return;
            }

            // SI EL ROL SELECCIONADO ES ADMINISTRADOR:_________________________
            if (rbAdministrador.isSelected()) {
                // VERIFICA QUE EL CAMPO DE NOMBRE NO ESTÉ VACÍO:_ _ _ _ _ _ _ _
                if (txtNombre.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Por favor, ingrese su nombre");
                    return;
                }
                
                String nombre = txtNombre.getText();
                Pattern patronNombre = Pattern.compile("^[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+$");
                Matcher matcherNombre = patronNombre.matcher(nombre);
                
                // VERIFICA QUE EL NOMBRE SOLO CONTENGA LETRAS:_ _ _ _ _ _ _ _ _
                if (!matcherNombre.matches()) {
                    JOptionPane.showMessageDialog(this, "El nombre solo puede contener letras");
                    return;
                }

                // VERIFICA QUE EL CAMPO DE APELLIDO NO ESTÉ VACÍO:_ _ _ _ _ _ _
                if (txtApellido.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Por favor, ingrese su apellido");
                    return;
                }
                
                String apellido = txtApellido.getText();
                Pattern patronApellido = Pattern.compile("^[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+$");
                Matcher matcherApellido = patronApellido.matcher(apellido);
                
                // VERIFICA QUE EL APELLIDO SOLO CONTENGA LETRAS:_ _ _ _ _ _ _ _
                if (!matcherApellido.matches()) {
                    JOptionPane.showMessageDialog(this, "El apellido solo puede contener letras");
                    return;
                }

                // VERIFICA QUE LA FECHA DE NACIMIENTO NO ESTÉ VACÍA:_ _ _ _ _ _
                if (dcFechaNacimiento.getDate() == null) {
                    JOptionPane.showMessageDialog(this, "Por favor, ingrese su fecha de nacimiento");
                    return;
                }

                // VERIFICA QUE ALGÚN GÉNERO ESTÉ SELECCIONADO:_ _ _ _ _ _ _ _ _
                if (!rbMasculino.isSelected() && !rbFemenino.isSelected()) {
                    JOptionPane.showMessageDialog(this, "Por favor, seleccione un género");
                    return;
                }

                // VERIFICA QUE EL CÓDIGO NO ESTÉ VACÍO:_ _ _ _ _ _ _ _ _ _ _ _ 
                if (txtCodigo.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Por favor, ingrese su código");
                    return;
                }

                String codigo = txtCodigo.getText();
                Pattern patronCodigoAdmin = Pattern.compile("^A[0-9]{8}$");
                Matcher matcherCodigoAdmin = patronCodigoAdmin.matcher(codigo);
                
                // VERIFICA QUE EL CÓDIGO DEL ADMINISTRADOR SEA VÁLIDO:_ _ _ _ _
                if (!matcherCodigoAdmin.matches()) {
                    JOptionPane.showMessageDialog(this, "El código de Administrador debe iniciar con 'A' seguido de 8 dígitos");
                    return;
                }

                // VERIFICA QUE EL CAMPO DE CONTRASEÑA NO ESTÉ VACÍO:_ _ _ _ _ _
                if (txtContraseña.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Por favor, ingrese una contraseña");
                    return;
                }

                Date fechaNacimiento = dcFechaNacimiento.getDate();
                SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
                String fechaString = formatoFecha.format(fechaNacimiento);

                // CREA UNA NUEVA INSTANCIA DE ADMINISTRADOR:_ _ _ _ _ _ _ _ _ _
                Administrador nuevoAdmin = new Administrador();
                nuevoAdmin.setNombre(nombre);
                nuevoAdmin.setApellido(apellido);
                nuevoAdmin.setFechaNacimiento(fechaString);
                nuevoAdmin.setGenero(rbMasculino.isSelected() ? "Masculino" : "Femenino");
                nuevoAdmin.setCodigoAdministrador(codigo);
                nuevoAdmin.setContraseña(txtContraseña.getText());

                // MUESTRA UN MENSAJE DE CONFIRMACIÓN:_ _ _ _ _ _ _ _ _ _ _ _ _ 
                JOptionPane.showMessageDialog(this, "¡Administrador registrado!");

                // OBTIENE UNA CONEXIÓN A LA BASE DE DATOS Y GUARDA EL ADMINISTRADOR
                Connection conexion = ConexionSQLServer.getInstance().getConnection();
                CRUD_Administradores crud = new CRUD_Administradores();
                crud.insertarAdministrador(conexion, nuevoAdmin);

                // AGREGA EL NUEVO ADMINISTRADOR A LA LISTA:_ _ _ _ _ _ _ _ _ _
                listaAdministradores.agregarAdministrador(nuevoAdmin);
                
                // SE LIMPIAN LOS CAMPOS:_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _
                limpiarCampos();

                // ABRE EL MENÚ DE ADMINISTRADOR Y CIERRA LA VENTANA ACTUAL:_ _ 
                A04_MenuAdministrador menu = new A04_MenuAdministrador(
                    listaAdministradores, 
                    nuevoAdmin.getCodigoAdministrador(), 
                    nuevoAdmin.getNombre(), 
                    nuevoAdmin.getApellido(), 
                    nuevoAdmin.getGenero(), 
                    nuevoAdmin.getFechaNacimiento()
                );
                menu.setVisible(true);
                this.dispose();
                
            // SI EL ROL SELECCIONADO ES ESPECTADOR:____________________________
            } else if (rbEspectador.isSelected()) {
                // VERIFICA QUE EL CAMPO DE NOMBRE NO ESTÉ VACÍO:_ _ _ _ _ _ _ _
                if (txtNombre.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Por favor, ingrese su nombre");
                    return;
                }

                String nombre = txtNombre.getText();
                Pattern patronNombre = Pattern.compile("^[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+$");
                Matcher matcherNombre = patronNombre.matcher(nombre);
                
                // VERIFICA QUE EL NOMBRE SOLO CONTENGA LETRAS:_ _ _ _ _ _ _ _ _
                if (!matcherNombre.matches()) {
                    JOptionPane.showMessageDialog(this, "El nombre solo puede contener letras");
                    return;
                }

                // VERIFICA QUE EL CAMPO DE APELLIDO NO ESTÉ VACÍO:_ _ _ _ _ _ _
                if (txtApellido.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Por favor, ingrese su apellido");
                    return;
                }

                String apellido = txtApellido.getText();
                Pattern patronApellido = Pattern.compile("^[a-zA-ZáéíóúÁÉÍÓÚñÑ ]+$");
                Matcher matcherApellido = patronApellido.matcher(apellido);
                
                // VERIFICA QUE EL APELLIDO SOLO CONTENGA LETRAS:_ _ _ _ _ _ _ _
                if (!matcherApellido.matches()) {
                    JOptionPane.showMessageDialog(this, "El apellido solo puede contener letras");
                    return;
                }

                // VERIFICA QUE LA FECHA DE NACIMIENTO NO ESTÉ VACÍA:_ _ _ _ _ _ 
                if (dcFechaNacimiento.getDate() == null) {
                    JOptionPane.showMessageDialog(this, "Por favor, ingrese su fecha de nacimiento");
                    return;
                }

                // VERIFICA QUE ALGÚN GÉNERO ESTÉ SELECCIONADO:_ _ _ _ _ _ _ _ _
                if (!rbMasculino.isSelected() && !rbFemenino.isSelected()) {
                    JOptionPane.showMessageDialog(this, "Por favor, seleccione un género");
                    return;
                }

                // VERIFICA QUE EL CÓDIGO NO ESTÉ VACÍO:_ _ _ _ _ _ _ _ _ _ _ _ 
                if (txtCodigo.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Por favor, ingrese su código");
                    return;
                }

                String codigo = txtCodigo.getText();
                Pattern patronCodigoEspectador = Pattern.compile("^E[0-9]{8}$");
                Matcher matcherCodigoEspectador = patronCodigoEspectador.matcher(codigo);
                
                // VERIFICA QUE EL CÓDIGO DEL ESPECTADOR SEA VÁLIDO:_ _ _ _ _ _ 
                if (!matcherCodigoEspectador.matches()) {
                    JOptionPane.showMessageDialog(this, "El código de Espectador debe iniciar con 'E' seguido de 8 dígitos");
                    return;
                }

                // VERIFICA QUE EL CAMPO DE CONTRASEÑA NO ESTÉ VACÍO:_ _ _ _ _ _ 
                if (txtContraseña.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(this, "Por favor, ingrese una contraseña");
                    return;
                }

                Date fechaNacimiento = dcFechaNacimiento.getDate();
                SimpleDateFormat formatoFecha = new SimpleDateFormat("yyyy-MM-dd");
                String fechaString = formatoFecha.format(fechaNacimiento);
                
                // CREA UNA NUEVA INSTANCIA DE ESPECTADOR:_ _ _ _ _ _ _ _ _ _ _ 
                Espectador nuevoEspectador = new Espectador();
                nuevoEspectador.setNombre(nombre);
                nuevoEspectador.setApellido(apellido);
                nuevoEspectador.setFechaNacimiento(fechaString);
                nuevoEspectador.setGenero(rbMasculino.isSelected() ? "Masculino" : "Femenino");
                nuevoEspectador.setCodigoEspectador(codigo);
                nuevoEspectador.setContraseña(txtContraseña.getText());

                // MUESTRA UN MENSAJE DE CONFIRMACIÓN:_ _ _ _ _ _ _ _ _ _ _ _ _ 
                JOptionPane.showMessageDialog(this, "¡Espectador registrado!");

                // OBTIENE UNA CONEXIÓN A LA BASE DE DATOS Y GUARDA EL ESPECTADOR
                Connection conexion = ConexionSQLServer.getInstance().getConnection();
                CRUD_Espectadores crud = new CRUD_Espectadores();
                crud.insertarEspectador(conexion, nuevoEspectador);

                // AGREGA EL NUEVO ESPECTADOR A LA LISTA:_ _ _ _ _ _ _ _ _ _ _ _
                listaEspectadores.agregarEspectador(nuevoEspectador);
                
                // SE LIMPIAN LOS CAMPOS:_ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _ _
                limpiarCampos();

                // ABRE EL MENÚ DE ESPECTADOR Y CIERRA LA VENTANA ACTUAL:_ _ _ _
                E04_MenuEspectador menu = new E04_MenuEspectador(
                    listaEspectadores,
                    nuevoEspectador.getCodigoEspectador(),
                    nuevoEspectador.getNombre(),
                    nuevoEspectador.getApellido(),
                    nuevoEspectador.getGenero(),
                    nuevoEspectador.getFechaNacimiento()
                );
                menu.setVisible(true);
                this.dispose();
            }
        } catch (SQLException e) {
            // MUESTRA UN MENSAJE DE ERROR SI OCURRE UNA EXCEPCIÓN DE SQL:______
            JOptionPane.showMessageDialog(this, "Error de conexión: " + e.getMessage());
            e.printStackTrace();
        }
    }//GEN-LAST:event_btnRegistrarseActionPerformed

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
    public void limpiarCampos(){
        txtNombre.setText("");
        txtApellido.setText("");
        dcFechaNacimiento.setDate(null);
        bgRoles.clearSelection();
        bgGenero.clearSelection();
        txtCodigo.setText("");
        txtContraseña.setText("");
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.ButtonGroup bgGenero;
    private javax.swing.ButtonGroup bgRoles;
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnRegistrarse;
    private javax.swing.JCheckBox chbVisualizarContraseña;
    private com.toedter.calendar.JDateChooser dcFechaNacimiento;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton rbAdministrador;
    private javax.swing.JRadioButton rbEspectador;
    private javax.swing.JRadioButton rbFemenino;
    private javax.swing.JRadioButton rbMasculino;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
