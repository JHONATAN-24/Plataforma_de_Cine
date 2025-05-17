
package Paneles;

import Clases.Butaca;
import Ventanas.E04_MenuEspectador;
import javax.swing.ImageIcon;

public class E05_PagoEntrada extends javax.swing.JPanel {

    private E04_MenuEspectador menuEspectador;
    private int codigoEntrada;
    private int codigoFuncion;
    private String codigoEspectador;
    private String butaca;
    private String metodoPago;
    private double precioFinal;
    private String fechaCompra;
    
    public E05_PagoEntrada(
            E04_MenuEspectador menuEspectador
    ) {
        
        this.menuEspectador = menuEspectador;
        
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        lbFechaInicio = new javax.swing.JLabel();
        lbFechaFin = new javax.swing.JLabel();
        lbTituloPelicula = new javax.swing.JLabel();
        lbSala = new javax.swing.JLabel();
        lbFila = new javax.swing.JLabel();
        lbButaca = new javax.swing.JLabel();
        lbCodigoEntrada = new javax.swing.JLabel();
        lbCodigoFuncion = new javax.swing.JLabel();
        lbFondo = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(960, 478));
        setMinimumSize(new java.awt.Dimension(960, 478));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(960, 478));
        jPanel1.setMinimumSize(new java.awt.Dimension(960, 478));
        jPanel1.setPreferredSize(new java.awt.Dimension(960, 478));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        jLabel1.setText("Vista previa de entrada :");

        jButton1.setText("Finalizar");
        jButton1.setMaximumSize(new java.awt.Dimension(100, 30));
        jButton1.setMinimumSize(new java.awt.Dimension(100, 30));
        jButton1.setPreferredSize(new java.awt.Dimension(100, 30));

        jPanel2.setMaximumSize(new java.awt.Dimension(900, 290));
        jPanel2.setMinimumSize(new java.awt.Dimension(900, 290));
        jPanel2.setPreferredSize(new java.awt.Dimension(900, 290));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbFechaInicio.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        lbFechaInicio.setForeground(new java.awt.Color(255, 255, 255));
        lbFechaInicio.setText("00-00-0000");
        jPanel2.add(lbFechaInicio, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 122, -1, 30));

        lbFechaFin.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        lbFechaFin.setForeground(new java.awt.Color(255, 255, 255));
        lbFechaFin.setText("00-00-0000");
        jPanel2.add(lbFechaFin, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 122, -1, 30));

        lbTituloPelicula.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        lbTituloPelicula.setForeground(new java.awt.Color(255, 255, 255));
        lbTituloPelicula.setText("Titulo Completo De La Pelicula");
        lbTituloPelicula.setMaximumSize(new java.awt.Dimension(400, 44));
        lbTituloPelicula.setMinimumSize(new java.awt.Dimension(400, 44));
        lbTituloPelicula.setPreferredSize(new java.awt.Dimension(400, 44));
        jPanel2.add(lbTituloPelicula, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 145, -1, -1));

        lbSala.setFont(new java.awt.Font("Consolas", 0, 36)); // NOI18N
        lbSala.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbSala.setText("00");
        lbSala.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbSala.setPreferredSize(new java.awt.Dimension(40, 40));
        jPanel2.add(lbSala, new org.netbeans.lib.awtextra.AbsoluteConstraints(317, 220, -1, -1));

        lbFila.setFont(new java.awt.Font("Consolas", 0, 36)); // NOI18N
        lbFila.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbFila.setText("00");
        lbFila.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbFila.setPreferredSize(new java.awt.Dimension(40, 40));
        jPanel2.add(lbFila, new org.netbeans.lib.awtextra.AbsoluteConstraints(382, 220, -1, -1));

        lbButaca.setFont(new java.awt.Font("Consolas", 0, 36)); // NOI18N
        lbButaca.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbButaca.setText("00");
        lbButaca.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbButaca.setPreferredSize(new java.awt.Dimension(40, 40));
        jPanel2.add(lbButaca, new org.netbeans.lib.awtextra.AbsoluteConstraints(447, 220, -1, -1));

        lbCodigoEntrada.setFont(new java.awt.Font("Consolas", 0, 24)); // NOI18N
        lbCodigoEntrada.setForeground(new java.awt.Color(255, 255, 255));
        lbCodigoEntrada.setText("000-000-000");
        jPanel2.add(lbCodigoEntrada, new org.netbeans.lib.awtextra.AbsoluteConstraints(605, 260, -1, 30));

        lbCodigoFuncion.setFont(new java.awt.Font("Consolas", 0, 36)); // NOI18N
        lbCodigoFuncion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbCodigoFuncion.setText("00");
        lbCodigoFuncion.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        lbCodigoFuncion.setPreferredSize(new java.awt.Dimension(40, 40));
        jPanel2.add(lbCodigoFuncion, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 220, -1, -1));

        lbFondo.setIcon(new javax.swing.ImageIcon("C:\\Users\\Usuario\\Documents\\NetBeansProjects\\Iconos - Cine\\Plantilla de Boleto (Fondo 0)(900-291px).png")); // NOI18N
        lbFondo.setMaximumSize(new java.awt.Dimension(900, 290));
        lbFondo.setMinimumSize(new java.awt.Dimension(900, 290));
        lbFondo.setPreferredSize(new java.awt.Dimension(900, 290));
        jPanel2.add(lbFondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(30, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(97, 97, 97)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(30, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    public void datosDeLaEntrada(
            int entrada,
            int funcion,
            String espectador,
            String butaca,
            String metodoPago,
            double precioFinal,
            String fechaCompra 
    ){
        this.codigoEspectador = espectador;
        this.codigoFuncion = funcion;
        this.codigoEntrada = entrada;
        this.butaca = butaca;
        this.metodoPago = metodoPago;
        this.precioFinal = precioFinal;
        this.fechaCompra = fechaCompra;
        
        lbCodigoEntrada.setText(Integer.toString(codigoEntrada));
        lbCodigoFuncion.setText(Integer.toString(codigoFuncion));
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbButaca;
    private javax.swing.JLabel lbCodigoEntrada;
    private javax.swing.JLabel lbCodigoFuncion;
    private javax.swing.JLabel lbFechaFin;
    private javax.swing.JLabel lbFechaInicio;
    private javax.swing.JLabel lbFila;
    private javax.swing.JLabel lbFondo;
    private javax.swing.JLabel lbSala;
    private javax.swing.JLabel lbTituloPelicula;
    // End of variables declaration//GEN-END:variables
}
