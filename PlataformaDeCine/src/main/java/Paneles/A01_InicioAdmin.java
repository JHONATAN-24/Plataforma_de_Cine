
package Paneles;

import Ventanas.A04_MenuAdministrador;

public class A01_InicioAdmin extends javax.swing.JPanel {

    private A04_MenuAdministrador menuAdministrador;
    
    public A01_InicioAdmin(
            A04_MenuAdministrador menuAdministrador
    ) {
        this.menuAdministrador = menuAdministrador;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelPrincipal = new javax.swing.JPanel();
        btnEspectadores = new javax.swing.JButton();
        btnPeliculas = new javax.swing.JButton();
        btnFunciones = new javax.swing.JButton();
        btnEntradas = new javax.swing.JButton();
        lbIconoFondo = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        setMaximumSize(new java.awt.Dimension(960, 478));
        setMinimumSize(new java.awt.Dimension(960, 478));
        setPreferredSize(new java.awt.Dimension(960, 478));

        PanelPrincipal.setMaximumSize(new java.awt.Dimension(960, 478));
        PanelPrincipal.setMinimumSize(new java.awt.Dimension(960, 478));
        PanelPrincipal.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnEspectadores.setText("Espectadores");
        btnEspectadores.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnEspectadores.setContentAreaFilled(false);
        btnEspectadores.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEspectadores.setMaximumSize(new java.awt.Dimension(100, 100));
        btnEspectadores.setMinimumSize(new java.awt.Dimension(100, 100));
        btnEspectadores.setOpaque(true);
        btnEspectadores.setPreferredSize(new java.awt.Dimension(100, 100));
        btnEspectadores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEspectadoresActionPerformed(evt);
            }
        });
        PanelPrincipal.add(btnEspectadores, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 100, -1, -1));

        btnPeliculas.setText("Peliculas");
        btnPeliculas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnPeliculas.setContentAreaFilled(false);
        btnPeliculas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPeliculas.setMaximumSize(new java.awt.Dimension(100, 100));
        btnPeliculas.setMinimumSize(new java.awt.Dimension(100, 100));
        btnPeliculas.setOpaque(true);
        btnPeliculas.setPreferredSize(new java.awt.Dimension(100, 100));
        btnPeliculas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPeliculasActionPerformed(evt);
            }
        });
        PanelPrincipal.add(btnPeliculas, new org.netbeans.lib.awtextra.AbsoluteConstraints(405, 100, -1, -1));

        btnFunciones.setText("Funciones");
        btnFunciones.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnFunciones.setContentAreaFilled(false);
        btnFunciones.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFunciones.setMaximumSize(new java.awt.Dimension(100, 100));
        btnFunciones.setMinimumSize(new java.awt.Dimension(100, 100));
        btnFunciones.setOpaque(true);
        btnFunciones.setPreferredSize(new java.awt.Dimension(100, 100));
        btnFunciones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFuncionesActionPerformed(evt);
            }
        });
        PanelPrincipal.add(btnFunciones, new org.netbeans.lib.awtextra.AbsoluteConstraints(555, 100, -1, -1));

        btnEntradas.setText("Entradas");
        btnEntradas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnEntradas.setContentAreaFilled(false);
        btnEntradas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEntradas.setMaximumSize(new java.awt.Dimension(100, 100));
        btnEntradas.setMinimumSize(new java.awt.Dimension(100, 100));
        btnEntradas.setOpaque(true);
        btnEntradas.setPreferredSize(new java.awt.Dimension(100, 100));
        btnEntradas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntradasActionPerformed(evt);
            }
        });
        PanelPrincipal.add(btnEntradas, new org.netbeans.lib.awtextra.AbsoluteConstraints(255, 250, -1, -1));

        lbIconoFondo.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\Iconos - Cine\\Diseño de lineas Fondo (960-540px).png")); // NOI18N
        PanelPrincipal.add(lbIconoFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 960, 480));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(305, 305, 305))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(PanelPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(200, 200, 200))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnEspectadoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEspectadoresActionPerformed
        menuAdministrador.mostrarPanel("espectadores");
    }//GEN-LAST:event_btnEspectadoresActionPerformed

    private void btnPeliculasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPeliculasActionPerformed
        
    }//GEN-LAST:event_btnPeliculasActionPerformed

    private void btnFuncionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFuncionesActionPerformed
        
    }//GEN-LAST:event_btnFuncionesActionPerformed

    private void btnEntradasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntradasActionPerformed
        menuAdministrador.mostrarPanel("entradas");
    }//GEN-LAST:event_btnEntradasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelPrincipal;
    private javax.swing.JButton btnEntradas;
    private javax.swing.JButton btnEspectadores;
    private javax.swing.JButton btnFunciones;
    private javax.swing.JButton btnPeliculas;
    private javax.swing.JLabel lbIconoFondo;
    // End of variables declaration//GEN-END:variables
}
