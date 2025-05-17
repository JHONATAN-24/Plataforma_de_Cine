
package Paneles;

import Clases.Butaca;
import Clases.Funcion;
import ConexionBD.CRUD_Butacas;
import Ventanas.E04_MenuEspectador;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class E04_ElegirAsiento extends javax.swing.JPanel {

    private E04_MenuEspectador menuEspectador;
    
    private int codigoPelicula;
    private int codigoFuncion;

    private JButton[][] butacas = new JButton[8][12]; // Matriz de botones para las butacas
    private Butaca butacaSeleccionada = null; // Solo guarda la butaca seleccionada
    
    public E04_ElegirAsiento(
            E04_MenuEspectador menuEspectador
    ) {
        
        this.menuEspectador = menuEspectador;
        
        initComponents();
        declararBotones();
        asignarEventos();
        cargarButacas(codigoFuncion);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        Nivel_A = new javax.swing.JPanel();
        btnButaca_A1 = new javax.swing.JButton();
        btnButaca_A2 = new javax.swing.JButton();
        btnButaca_A3 = new javax.swing.JButton();
        btnButaca_A4 = new javax.swing.JButton();
        btnButaca_A5 = new javax.swing.JButton();
        btnButaca_A6 = new javax.swing.JButton();
        btnButaca_A7 = new javax.swing.JButton();
        btnButaca_A8 = new javax.swing.JButton();
        btnButaca_A9 = new javax.swing.JButton();
        btnButaca_A10 = new javax.swing.JButton();
        btnButaca_A11 = new javax.swing.JButton();
        btnButaca_A12 = new javax.swing.JButton();
        Nivel_B = new javax.swing.JPanel();
        btnButaca_B1 = new javax.swing.JButton();
        btnButaca_B2 = new javax.swing.JButton();
        btnButaca_B3 = new javax.swing.JButton();
        btnButaca_B4 = new javax.swing.JButton();
        btnButaca_B5 = new javax.swing.JButton();
        btnButaca_B6 = new javax.swing.JButton();
        btnButaca_B7 = new javax.swing.JButton();
        btnButaca_B8 = new javax.swing.JButton();
        btnButaca_B9 = new javax.swing.JButton();
        btnButaca_B10 = new javax.swing.JButton();
        btnButaca_B11 = new javax.swing.JButton();
        btnButaca_B12 = new javax.swing.JButton();
        Nivel_C = new javax.swing.JPanel();
        btnButaca_C1 = new javax.swing.JButton();
        btnButaca_C2 = new javax.swing.JButton();
        btnButaca_C3 = new javax.swing.JButton();
        btnButaca_C4 = new javax.swing.JButton();
        btnButaca_C5 = new javax.swing.JButton();
        btnButaca_C6 = new javax.swing.JButton();
        btnButaca_C7 = new javax.swing.JButton();
        btnButaca_C8 = new javax.swing.JButton();
        btnButaca_C9 = new javax.swing.JButton();
        btnButaca_C10 = new javax.swing.JButton();
        btnButaca_C11 = new javax.swing.JButton();
        btnButaca_C12 = new javax.swing.JButton();
        Nivel_D = new javax.swing.JPanel();
        btnButaca_D1 = new javax.swing.JButton();
        btnButaca_D2 = new javax.swing.JButton();
        btnButaca_D3 = new javax.swing.JButton();
        btnButaca_D4 = new javax.swing.JButton();
        btnButaca_D5 = new javax.swing.JButton();
        btnButaca_D6 = new javax.swing.JButton();
        btnButaca_D7 = new javax.swing.JButton();
        btnButaca_D8 = new javax.swing.JButton();
        btnButaca_D9 = new javax.swing.JButton();
        btnButaca_D10 = new javax.swing.JButton();
        btnButaca_D11 = new javax.swing.JButton();
        btnButaca_D12 = new javax.swing.JButton();
        Nivel_E = new javax.swing.JPanel();
        btnButaca_E1 = new javax.swing.JButton();
        btnButaca_E2 = new javax.swing.JButton();
        btnButaca_E3 = new javax.swing.JButton();
        btnButaca_E4 = new javax.swing.JButton();
        btnButaca_E5 = new javax.swing.JButton();
        btnButaca_E6 = new javax.swing.JButton();
        btnButaca_E7 = new javax.swing.JButton();
        btnButaca_E8 = new javax.swing.JButton();
        btnButaca_E9 = new javax.swing.JButton();
        btnButaca_E10 = new javax.swing.JButton();
        btnButaca_E11 = new javax.swing.JButton();
        btnButaca_E12 = new javax.swing.JButton();
        Nivel_F = new javax.swing.JPanel();
        btnButaca_F1 = new javax.swing.JButton();
        btnButaca_F2 = new javax.swing.JButton();
        btnButaca_F3 = new javax.swing.JButton();
        btnButaca_F4 = new javax.swing.JButton();
        btnButaca_F5 = new javax.swing.JButton();
        btnButaca_F6 = new javax.swing.JButton();
        btnButaca_F7 = new javax.swing.JButton();
        btnButaca_F8 = new javax.swing.JButton();
        btnButaca_F9 = new javax.swing.JButton();
        btnButaca_F10 = new javax.swing.JButton();
        btnButaca_F11 = new javax.swing.JButton();
        btnButaca_F12 = new javax.swing.JButton();
        Nivel_G = new javax.swing.JPanel();
        btnButaca_G1 = new javax.swing.JButton();
        btnButaca_G2 = new javax.swing.JButton();
        btnButaca_G3 = new javax.swing.JButton();
        btnButaca_G4 = new javax.swing.JButton();
        btnButaca_G5 = new javax.swing.JButton();
        btnButaca_G6 = new javax.swing.JButton();
        btnButaca_G7 = new javax.swing.JButton();
        btnButaca_G8 = new javax.swing.JButton();
        btnButaca_G9 = new javax.swing.JButton();
        btnButaca_G10 = new javax.swing.JButton();
        btnButaca_G11 = new javax.swing.JButton();
        btnButaca_G12 = new javax.swing.JButton();
        Nivel_H = new javax.swing.JPanel();
        btnButaca_H1 = new javax.swing.JButton();
        btnButaca_H2 = new javax.swing.JButton();
        btnButaca_H3 = new javax.swing.JButton();
        btnButaca_H4 = new javax.swing.JButton();
        btnButaca_H5 = new javax.swing.JButton();
        btnButaca_H6 = new javax.swing.JButton();
        btnButaca_H7 = new javax.swing.JButton();
        btnButaca_H8 = new javax.swing.JButton();
        btnButaca_H9 = new javax.swing.JButton();
        btnButaca_H10 = new javax.swing.JButton();
        btnButaca_H11 = new javax.swing.JButton();
        btnButaca_H12 = new javax.swing.JButton();
        lbPeliculas = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnAtras = new javax.swing.JButton();
        btnProcesarEntrada = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        rbEfectivo = new javax.swing.JRadioButton();
        rbTarjeta = new javax.swing.JRadioButton();
        rbIzipay = new javax.swing.JRadioButton();
        rbYape = new javax.swing.JRadioButton();
        lbCodigoQR = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(960, 478));
        setMinimumSize(new java.awt.Dimension(960, 478));
        setPreferredSize(new java.awt.Dimension(960, 478));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(960, 478));
        jPanel1.setMinimumSize(new java.awt.Dimension(960, 478));
        jPanel1.setPreferredSize(new java.awt.Dimension(960, 478));

        jLabel1.setBackground(new java.awt.Color(0, 0, 0));
        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Pantalla");
        jLabel1.setMaximumSize(new java.awt.Dimension(600, 16));
        jLabel1.setMinimumSize(new java.awt.Dimension(600, 16));
        jLabel1.setOpaque(true);
        jLabel1.setPreferredSize(new java.awt.Dimension(600, 16));

        Nivel_A.setBackground(new java.awt.Color(204, 204, 204));
        Nivel_A.setMaximumSize(new java.awt.Dimension(800, 50));
        Nivel_A.setMinimumSize(new java.awt.Dimension(800, 50));

        btnButaca_A1.setText("A1");
        btnButaca_A1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnButaca_A1.setContentAreaFilled(false);
        btnButaca_A1.setMaximumSize(new java.awt.Dimension(50, 50));
        btnButaca_A1.setMinimumSize(new java.awt.Dimension(50, 50));
        btnButaca_A1.setOpaque(true);
        btnButaca_A1.setPreferredSize(new java.awt.Dimension(50, 50));

        btnButaca_A2.setText("A2");
        btnButaca_A2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnButaca_A2.setContentAreaFilled(false);
        btnButaca_A2.setMaximumSize(new java.awt.Dimension(50, 50));
        btnButaca_A2.setMinimumSize(new java.awt.Dimension(50, 50));
        btnButaca_A2.setOpaque(true);
        btnButaca_A2.setPreferredSize(new java.awt.Dimension(50, 50));

        btnButaca_A3.setText("A3");
        btnButaca_A3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnButaca_A3.setContentAreaFilled(false);
        btnButaca_A3.setMaximumSize(new java.awt.Dimension(50, 50));
        btnButaca_A3.setMinimumSize(new java.awt.Dimension(50, 50));
        btnButaca_A3.setOpaque(true);
        btnButaca_A3.setPreferredSize(new java.awt.Dimension(50, 50));

        btnButaca_A4.setText("A4");
        btnButaca_A4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnButaca_A4.setContentAreaFilled(false);
        btnButaca_A4.setMaximumSize(new java.awt.Dimension(50, 50));
        btnButaca_A4.setMinimumSize(new java.awt.Dimension(50, 50));
        btnButaca_A4.setOpaque(true);
        btnButaca_A4.setPreferredSize(new java.awt.Dimension(50, 50));

        btnButaca_A5.setText("A5");
        btnButaca_A5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnButaca_A5.setContentAreaFilled(false);
        btnButaca_A5.setMaximumSize(new java.awt.Dimension(50, 50));
        btnButaca_A5.setMinimumSize(new java.awt.Dimension(50, 50));
        btnButaca_A5.setOpaque(true);
        btnButaca_A5.setPreferredSize(new java.awt.Dimension(50, 50));

        btnButaca_A6.setText("A6");
        btnButaca_A6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnButaca_A6.setContentAreaFilled(false);
        btnButaca_A6.setMaximumSize(new java.awt.Dimension(50, 50));
        btnButaca_A6.setMinimumSize(new java.awt.Dimension(50, 50));
        btnButaca_A6.setOpaque(true);
        btnButaca_A6.setPreferredSize(new java.awt.Dimension(50, 50));

        btnButaca_A7.setText("A7");
        btnButaca_A7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnButaca_A7.setContentAreaFilled(false);
        btnButaca_A7.setMaximumSize(new java.awt.Dimension(50, 50));
        btnButaca_A7.setMinimumSize(new java.awt.Dimension(50, 50));
        btnButaca_A7.setOpaque(true);
        btnButaca_A7.setPreferredSize(new java.awt.Dimension(50, 50));

        btnButaca_A8.setText("A8");
        btnButaca_A8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnButaca_A8.setContentAreaFilled(false);
        btnButaca_A8.setMaximumSize(new java.awt.Dimension(50, 50));
        btnButaca_A8.setMinimumSize(new java.awt.Dimension(50, 50));
        btnButaca_A8.setOpaque(true);
        btnButaca_A8.setPreferredSize(new java.awt.Dimension(50, 50));

        btnButaca_A9.setText("A9");
        btnButaca_A9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnButaca_A9.setContentAreaFilled(false);
        btnButaca_A9.setMaximumSize(new java.awt.Dimension(50, 50));
        btnButaca_A9.setMinimumSize(new java.awt.Dimension(50, 50));
        btnButaca_A9.setOpaque(true);
        btnButaca_A9.setPreferredSize(new java.awt.Dimension(50, 50));

        btnButaca_A10.setText("A10");
        btnButaca_A10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnButaca_A10.setContentAreaFilled(false);
        btnButaca_A10.setMaximumSize(new java.awt.Dimension(50, 50));
        btnButaca_A10.setMinimumSize(new java.awt.Dimension(50, 50));
        btnButaca_A10.setOpaque(true);
        btnButaca_A10.setPreferredSize(new java.awt.Dimension(50, 50));

        btnButaca_A11.setText("A11");
        btnButaca_A11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnButaca_A11.setContentAreaFilled(false);
        btnButaca_A11.setMaximumSize(new java.awt.Dimension(50, 50));
        btnButaca_A11.setMinimumSize(new java.awt.Dimension(50, 50));
        btnButaca_A11.setOpaque(true);
        btnButaca_A11.setPreferredSize(new java.awt.Dimension(50, 50));

        btnButaca_A12.setText("A12");
        btnButaca_A12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnButaca_A12.setContentAreaFilled(false);
        btnButaca_A12.setMaximumSize(new java.awt.Dimension(50, 50));
        btnButaca_A12.setMinimumSize(new java.awt.Dimension(50, 50));
        btnButaca_A12.setOpaque(true);
        btnButaca_A12.setPreferredSize(new java.awt.Dimension(50, 50));

        javax.swing.GroupLayout Nivel_ALayout = new javax.swing.GroupLayout(Nivel_A);
        Nivel_A.setLayout(Nivel_ALayout);
        Nivel_ALayout.setHorizontalGroup(
            Nivel_ALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Nivel_ALayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(btnButaca_A1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnButaca_A2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnButaca_A3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnButaca_A4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnButaca_A5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnButaca_A6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnButaca_A7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnButaca_A8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnButaca_A9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnButaca_A10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnButaca_A11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnButaca_A12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );
        Nivel_ALayout.setVerticalGroup(
            Nivel_ALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Nivel_ALayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(Nivel_ALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnButaca_A1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnButaca_A2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnButaca_A3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnButaca_A4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnButaca_A5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnButaca_A6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnButaca_A7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnButaca_A8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnButaca_A9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnButaca_A10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnButaca_A11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnButaca_A12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        Nivel_B.setBackground(new java.awt.Color(204, 204, 204));
        Nivel_B.setMaximumSize(new java.awt.Dimension(800, 50));
        Nivel_B.setMinimumSize(new java.awt.Dimension(800, 50));

        btnButaca_B1.setText("B1");
        btnButaca_B1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnButaca_B1.setContentAreaFilled(false);
        btnButaca_B1.setMaximumSize(new java.awt.Dimension(50, 50));
        btnButaca_B1.setMinimumSize(new java.awt.Dimension(50, 50));
        btnButaca_B1.setOpaque(true);
        btnButaca_B1.setPreferredSize(new java.awt.Dimension(50, 50));

        btnButaca_B2.setText("B2");
        btnButaca_B2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnButaca_B2.setContentAreaFilled(false);
        btnButaca_B2.setMaximumSize(new java.awt.Dimension(50, 50));
        btnButaca_B2.setMinimumSize(new java.awt.Dimension(50, 50));
        btnButaca_B2.setOpaque(true);
        btnButaca_B2.setPreferredSize(new java.awt.Dimension(50, 50));

        btnButaca_B3.setText("B3");
        btnButaca_B3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnButaca_B3.setContentAreaFilled(false);
        btnButaca_B3.setMaximumSize(new java.awt.Dimension(50, 50));
        btnButaca_B3.setMinimumSize(new java.awt.Dimension(50, 50));
        btnButaca_B3.setOpaque(true);
        btnButaca_B3.setPreferredSize(new java.awt.Dimension(50, 50));

        btnButaca_B4.setText("B4");
        btnButaca_B4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnButaca_B4.setContentAreaFilled(false);
        btnButaca_B4.setMaximumSize(new java.awt.Dimension(50, 50));
        btnButaca_B4.setMinimumSize(new java.awt.Dimension(50, 50));
        btnButaca_B4.setOpaque(true);
        btnButaca_B4.setPreferredSize(new java.awt.Dimension(50, 50));

        btnButaca_B5.setText("B5");
        btnButaca_B5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnButaca_B5.setContentAreaFilled(false);
        btnButaca_B5.setMaximumSize(new java.awt.Dimension(50, 50));
        btnButaca_B5.setMinimumSize(new java.awt.Dimension(50, 50));
        btnButaca_B5.setOpaque(true);
        btnButaca_B5.setPreferredSize(new java.awt.Dimension(50, 50));

        btnButaca_B6.setText("B6");
        btnButaca_B6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnButaca_B6.setContentAreaFilled(false);
        btnButaca_B6.setMaximumSize(new java.awt.Dimension(50, 50));
        btnButaca_B6.setMinimumSize(new java.awt.Dimension(50, 50));
        btnButaca_B6.setOpaque(true);
        btnButaca_B6.setPreferredSize(new java.awt.Dimension(50, 50));

        btnButaca_B7.setText("B7");
        btnButaca_B7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnButaca_B7.setContentAreaFilled(false);
        btnButaca_B7.setMaximumSize(new java.awt.Dimension(50, 50));
        btnButaca_B7.setMinimumSize(new java.awt.Dimension(50, 50));
        btnButaca_B7.setOpaque(true);
        btnButaca_B7.setPreferredSize(new java.awt.Dimension(50, 50));

        btnButaca_B8.setText("B8");
        btnButaca_B8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnButaca_B8.setContentAreaFilled(false);
        btnButaca_B8.setMaximumSize(new java.awt.Dimension(50, 50));
        btnButaca_B8.setMinimumSize(new java.awt.Dimension(50, 50));
        btnButaca_B8.setOpaque(true);
        btnButaca_B8.setPreferredSize(new java.awt.Dimension(50, 50));

        btnButaca_B9.setText("B9");
        btnButaca_B9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnButaca_B9.setContentAreaFilled(false);
        btnButaca_B9.setMaximumSize(new java.awt.Dimension(50, 50));
        btnButaca_B9.setMinimumSize(new java.awt.Dimension(50, 50));
        btnButaca_B9.setOpaque(true);
        btnButaca_B9.setPreferredSize(new java.awt.Dimension(50, 50));

        btnButaca_B10.setText("B10");
        btnButaca_B10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnButaca_B10.setContentAreaFilled(false);
        btnButaca_B10.setMaximumSize(new java.awt.Dimension(50, 50));
        btnButaca_B10.setMinimumSize(new java.awt.Dimension(50, 50));
        btnButaca_B10.setOpaque(true);
        btnButaca_B10.setPreferredSize(new java.awt.Dimension(50, 50));

        btnButaca_B11.setText("B11");
        btnButaca_B11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnButaca_B11.setContentAreaFilled(false);
        btnButaca_B11.setMaximumSize(new java.awt.Dimension(50, 50));
        btnButaca_B11.setMinimumSize(new java.awt.Dimension(50, 50));
        btnButaca_B11.setOpaque(true);
        btnButaca_B11.setPreferredSize(new java.awt.Dimension(50, 50));

        btnButaca_B12.setText("B12");
        btnButaca_B12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnButaca_B12.setContentAreaFilled(false);
        btnButaca_B12.setMaximumSize(new java.awt.Dimension(50, 50));
        btnButaca_B12.setMinimumSize(new java.awt.Dimension(50, 50));
        btnButaca_B12.setOpaque(true);
        btnButaca_B12.setPreferredSize(new java.awt.Dimension(50, 50));

        javax.swing.GroupLayout Nivel_BLayout = new javax.swing.GroupLayout(Nivel_B);
        Nivel_B.setLayout(Nivel_BLayout);
        Nivel_BLayout.setHorizontalGroup(
            Nivel_BLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Nivel_BLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(btnButaca_B1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnButaca_B2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnButaca_B3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnButaca_B4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnButaca_B5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnButaca_B6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnButaca_B7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnButaca_B8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnButaca_B9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnButaca_B10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnButaca_B11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnButaca_B12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );
        Nivel_BLayout.setVerticalGroup(
            Nivel_BLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Nivel_BLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(Nivel_BLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnButaca_B1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnButaca_B2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnButaca_B3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnButaca_B4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnButaca_B5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnButaca_B6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnButaca_B7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnButaca_B8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnButaca_B9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnButaca_B10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnButaca_B11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnButaca_B12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        Nivel_C.setBackground(new java.awt.Color(204, 204, 204));
        Nivel_C.setMaximumSize(new java.awt.Dimension(800, 50));
        Nivel_C.setMinimumSize(new java.awt.Dimension(800, 50));

        btnButaca_C1.setText("C1");
        btnButaca_C1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnButaca_C1.setContentAreaFilled(false);
        btnButaca_C1.setMaximumSize(new java.awt.Dimension(50, 50));
        btnButaca_C1.setMinimumSize(new java.awt.Dimension(50, 50));
        btnButaca_C1.setOpaque(true);
        btnButaca_C1.setPreferredSize(new java.awt.Dimension(50, 50));

        btnButaca_C2.setText("C2");
        btnButaca_C2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnButaca_C2.setContentAreaFilled(false);
        btnButaca_C2.setMaximumSize(new java.awt.Dimension(50, 50));
        btnButaca_C2.setMinimumSize(new java.awt.Dimension(50, 50));
        btnButaca_C2.setOpaque(true);
        btnButaca_C2.setPreferredSize(new java.awt.Dimension(50, 50));

        btnButaca_C3.setText("C3");
        btnButaca_C3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnButaca_C3.setContentAreaFilled(false);
        btnButaca_C3.setMaximumSize(new java.awt.Dimension(50, 50));
        btnButaca_C3.setMinimumSize(new java.awt.Dimension(50, 50));
        btnButaca_C3.setOpaque(true);
        btnButaca_C3.setPreferredSize(new java.awt.Dimension(50, 50));

        btnButaca_C4.setText("C4");
        btnButaca_C4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnButaca_C4.setContentAreaFilled(false);
        btnButaca_C4.setMaximumSize(new java.awt.Dimension(50, 50));
        btnButaca_C4.setMinimumSize(new java.awt.Dimension(50, 50));
        btnButaca_C4.setOpaque(true);
        btnButaca_C4.setPreferredSize(new java.awt.Dimension(50, 50));

        btnButaca_C5.setText("C5");
        btnButaca_C5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnButaca_C5.setContentAreaFilled(false);
        btnButaca_C5.setMaximumSize(new java.awt.Dimension(50, 50));
        btnButaca_C5.setMinimumSize(new java.awt.Dimension(50, 50));
        btnButaca_C5.setOpaque(true);
        btnButaca_C5.setPreferredSize(new java.awt.Dimension(50, 50));

        btnButaca_C6.setText("C6");
        btnButaca_C6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnButaca_C6.setContentAreaFilled(false);
        btnButaca_C6.setMaximumSize(new java.awt.Dimension(50, 50));
        btnButaca_C6.setMinimumSize(new java.awt.Dimension(50, 50));
        btnButaca_C6.setOpaque(true);
        btnButaca_C6.setPreferredSize(new java.awt.Dimension(50, 50));

        btnButaca_C7.setText("C7");
        btnButaca_C7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnButaca_C7.setContentAreaFilled(false);
        btnButaca_C7.setMaximumSize(new java.awt.Dimension(50, 50));
        btnButaca_C7.setMinimumSize(new java.awt.Dimension(50, 50));
        btnButaca_C7.setOpaque(true);
        btnButaca_C7.setPreferredSize(new java.awt.Dimension(50, 50));

        btnButaca_C8.setText("C8");
        btnButaca_C8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnButaca_C8.setContentAreaFilled(false);
        btnButaca_C8.setMaximumSize(new java.awt.Dimension(50, 50));
        btnButaca_C8.setMinimumSize(new java.awt.Dimension(50, 50));
        btnButaca_C8.setOpaque(true);
        btnButaca_C8.setPreferredSize(new java.awt.Dimension(50, 50));

        btnButaca_C9.setText("C9");
        btnButaca_C9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnButaca_C9.setContentAreaFilled(false);
        btnButaca_C9.setMaximumSize(new java.awt.Dimension(50, 50));
        btnButaca_C9.setMinimumSize(new java.awt.Dimension(50, 50));
        btnButaca_C9.setOpaque(true);
        btnButaca_C9.setPreferredSize(new java.awt.Dimension(50, 50));

        btnButaca_C10.setText("C10");
        btnButaca_C10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnButaca_C10.setContentAreaFilled(false);
        btnButaca_C10.setMaximumSize(new java.awt.Dimension(50, 50));
        btnButaca_C10.setMinimumSize(new java.awt.Dimension(50, 50));
        btnButaca_C10.setOpaque(true);
        btnButaca_C10.setPreferredSize(new java.awt.Dimension(50, 50));

        btnButaca_C11.setText("C11");
        btnButaca_C11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnButaca_C11.setContentAreaFilled(false);
        btnButaca_C11.setMaximumSize(new java.awt.Dimension(50, 50));
        btnButaca_C11.setMinimumSize(new java.awt.Dimension(50, 50));
        btnButaca_C11.setOpaque(true);
        btnButaca_C11.setPreferredSize(new java.awt.Dimension(50, 50));

        btnButaca_C12.setText("C12");
        btnButaca_C12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnButaca_C12.setContentAreaFilled(false);
        btnButaca_C12.setMaximumSize(new java.awt.Dimension(50, 50));
        btnButaca_C12.setMinimumSize(new java.awt.Dimension(50, 50));
        btnButaca_C12.setOpaque(true);
        btnButaca_C12.setPreferredSize(new java.awt.Dimension(50, 50));

        javax.swing.GroupLayout Nivel_CLayout = new javax.swing.GroupLayout(Nivel_C);
        Nivel_C.setLayout(Nivel_CLayout);
        Nivel_CLayout.setHorizontalGroup(
            Nivel_CLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Nivel_CLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(btnButaca_C1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnButaca_C2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnButaca_C3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnButaca_C4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnButaca_C5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnButaca_C6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnButaca_C7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnButaca_C8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnButaca_C9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnButaca_C10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnButaca_C11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnButaca_C12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );
        Nivel_CLayout.setVerticalGroup(
            Nivel_CLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Nivel_CLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(Nivel_CLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnButaca_C1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnButaca_C2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnButaca_C3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnButaca_C4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnButaca_C5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnButaca_C6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnButaca_C7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnButaca_C8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnButaca_C9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnButaca_C10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnButaca_C11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnButaca_C12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        Nivel_D.setBackground(new java.awt.Color(204, 204, 204));
        Nivel_D.setMaximumSize(new java.awt.Dimension(800, 50));
        Nivel_D.setMinimumSize(new java.awt.Dimension(800, 50));

        btnButaca_D1.setText("D1");
        btnButaca_D1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnButaca_D1.setContentAreaFilled(false);
        btnButaca_D1.setMaximumSize(new java.awt.Dimension(50, 50));
        btnButaca_D1.setMinimumSize(new java.awt.Dimension(50, 50));
        btnButaca_D1.setOpaque(true);
        btnButaca_D1.setPreferredSize(new java.awt.Dimension(50, 50));

        btnButaca_D2.setText("D2");
        btnButaca_D2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnButaca_D2.setContentAreaFilled(false);
        btnButaca_D2.setMaximumSize(new java.awt.Dimension(50, 50));
        btnButaca_D2.setMinimumSize(new java.awt.Dimension(50, 50));
        btnButaca_D2.setOpaque(true);
        btnButaca_D2.setPreferredSize(new java.awt.Dimension(50, 50));

        btnButaca_D3.setText("D3");
        btnButaca_D3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnButaca_D3.setContentAreaFilled(false);
        btnButaca_D3.setMaximumSize(new java.awt.Dimension(50, 50));
        btnButaca_D3.setMinimumSize(new java.awt.Dimension(50, 50));
        btnButaca_D3.setOpaque(true);
        btnButaca_D3.setPreferredSize(new java.awt.Dimension(50, 50));

        btnButaca_D4.setText("D4");
        btnButaca_D4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnButaca_D4.setContentAreaFilled(false);
        btnButaca_D4.setMaximumSize(new java.awt.Dimension(50, 50));
        btnButaca_D4.setMinimumSize(new java.awt.Dimension(50, 50));
        btnButaca_D4.setOpaque(true);
        btnButaca_D4.setPreferredSize(new java.awt.Dimension(50, 50));

        btnButaca_D5.setText("D5");
        btnButaca_D5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnButaca_D5.setContentAreaFilled(false);
        btnButaca_D5.setMaximumSize(new java.awt.Dimension(50, 50));
        btnButaca_D5.setMinimumSize(new java.awt.Dimension(50, 50));
        btnButaca_D5.setOpaque(true);
        btnButaca_D5.setPreferredSize(new java.awt.Dimension(50, 50));

        btnButaca_D6.setText("D6");
        btnButaca_D6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnButaca_D6.setContentAreaFilled(false);
        btnButaca_D6.setMaximumSize(new java.awt.Dimension(50, 50));
        btnButaca_D6.setMinimumSize(new java.awt.Dimension(50, 50));
        btnButaca_D6.setOpaque(true);
        btnButaca_D6.setPreferredSize(new java.awt.Dimension(50, 50));

        btnButaca_D7.setText("D7");
        btnButaca_D7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnButaca_D7.setContentAreaFilled(false);
        btnButaca_D7.setMaximumSize(new java.awt.Dimension(50, 50));
        btnButaca_D7.setMinimumSize(new java.awt.Dimension(50, 50));
        btnButaca_D7.setOpaque(true);
        btnButaca_D7.setPreferredSize(new java.awt.Dimension(50, 50));

        btnButaca_D8.setText("D8");
        btnButaca_D8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnButaca_D8.setContentAreaFilled(false);
        btnButaca_D8.setMaximumSize(new java.awt.Dimension(50, 50));
        btnButaca_D8.setMinimumSize(new java.awt.Dimension(50, 50));
        btnButaca_D8.setOpaque(true);
        btnButaca_D8.setPreferredSize(new java.awt.Dimension(50, 50));

        btnButaca_D9.setText("D9");
        btnButaca_D9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnButaca_D9.setContentAreaFilled(false);
        btnButaca_D9.setMaximumSize(new java.awt.Dimension(50, 50));
        btnButaca_D9.setMinimumSize(new java.awt.Dimension(50, 50));
        btnButaca_D9.setOpaque(true);
        btnButaca_D9.setPreferredSize(new java.awt.Dimension(50, 50));

        btnButaca_D10.setText("D10");
        btnButaca_D10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnButaca_D10.setContentAreaFilled(false);
        btnButaca_D10.setMaximumSize(new java.awt.Dimension(50, 50));
        btnButaca_D10.setMinimumSize(new java.awt.Dimension(50, 50));
        btnButaca_D10.setOpaque(true);
        btnButaca_D10.setPreferredSize(new java.awt.Dimension(50, 50));

        btnButaca_D11.setText("D11");
        btnButaca_D11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnButaca_D11.setContentAreaFilled(false);
        btnButaca_D11.setMaximumSize(new java.awt.Dimension(50, 50));
        btnButaca_D11.setMinimumSize(new java.awt.Dimension(50, 50));
        btnButaca_D11.setOpaque(true);
        btnButaca_D11.setPreferredSize(new java.awt.Dimension(50, 50));

        btnButaca_D12.setText("D12");
        btnButaca_D12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnButaca_D12.setContentAreaFilled(false);
        btnButaca_D12.setMaximumSize(new java.awt.Dimension(50, 50));
        btnButaca_D12.setMinimumSize(new java.awt.Dimension(50, 50));
        btnButaca_D12.setOpaque(true);
        btnButaca_D12.setPreferredSize(new java.awt.Dimension(50, 50));

        javax.swing.GroupLayout Nivel_DLayout = new javax.swing.GroupLayout(Nivel_D);
        Nivel_D.setLayout(Nivel_DLayout);
        Nivel_DLayout.setHorizontalGroup(
            Nivel_DLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Nivel_DLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(btnButaca_D1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnButaca_D2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnButaca_D3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnButaca_D4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnButaca_D5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnButaca_D6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnButaca_D7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnButaca_D8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnButaca_D9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnButaca_D10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnButaca_D11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnButaca_D12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );
        Nivel_DLayout.setVerticalGroup(
            Nivel_DLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Nivel_DLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(Nivel_DLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnButaca_D1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnButaca_D2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnButaca_D3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnButaca_D4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnButaca_D5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnButaca_D6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnButaca_D7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnButaca_D8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnButaca_D9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnButaca_D10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnButaca_D11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnButaca_D12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        Nivel_E.setBackground(new java.awt.Color(204, 204, 204));
        Nivel_E.setMaximumSize(new java.awt.Dimension(800, 50));
        Nivel_E.setMinimumSize(new java.awt.Dimension(800, 50));

        btnButaca_E1.setText("E1");
        btnButaca_E1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnButaca_E1.setContentAreaFilled(false);
        btnButaca_E1.setMaximumSize(new java.awt.Dimension(50, 50));
        btnButaca_E1.setMinimumSize(new java.awt.Dimension(50, 50));
        btnButaca_E1.setOpaque(true);
        btnButaca_E1.setPreferredSize(new java.awt.Dimension(50, 50));

        btnButaca_E2.setText("E2");
        btnButaca_E2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnButaca_E2.setContentAreaFilled(false);
        btnButaca_E2.setMaximumSize(new java.awt.Dimension(50, 50));
        btnButaca_E2.setMinimumSize(new java.awt.Dimension(50, 50));
        btnButaca_E2.setOpaque(true);
        btnButaca_E2.setPreferredSize(new java.awt.Dimension(50, 50));

        btnButaca_E3.setText("E3");
        btnButaca_E3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnButaca_E3.setContentAreaFilled(false);
        btnButaca_E3.setMaximumSize(new java.awt.Dimension(50, 50));
        btnButaca_E3.setMinimumSize(new java.awt.Dimension(50, 50));
        btnButaca_E3.setOpaque(true);
        btnButaca_E3.setPreferredSize(new java.awt.Dimension(50, 50));

        btnButaca_E4.setText("E4");
        btnButaca_E4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnButaca_E4.setContentAreaFilled(false);
        btnButaca_E4.setMaximumSize(new java.awt.Dimension(50, 50));
        btnButaca_E4.setMinimumSize(new java.awt.Dimension(50, 50));
        btnButaca_E4.setOpaque(true);
        btnButaca_E4.setPreferredSize(new java.awt.Dimension(50, 50));

        btnButaca_E5.setText("E5");
        btnButaca_E5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnButaca_E5.setContentAreaFilled(false);
        btnButaca_E5.setMaximumSize(new java.awt.Dimension(50, 50));
        btnButaca_E5.setMinimumSize(new java.awt.Dimension(50, 50));
        btnButaca_E5.setOpaque(true);
        btnButaca_E5.setPreferredSize(new java.awt.Dimension(50, 50));

        btnButaca_E6.setText("E6");
        btnButaca_E6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnButaca_E6.setContentAreaFilled(false);
        btnButaca_E6.setMaximumSize(new java.awt.Dimension(50, 50));
        btnButaca_E6.setMinimumSize(new java.awt.Dimension(50, 50));
        btnButaca_E6.setOpaque(true);
        btnButaca_E6.setPreferredSize(new java.awt.Dimension(50, 50));

        btnButaca_E7.setText("E7");
        btnButaca_E7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnButaca_E7.setContentAreaFilled(false);
        btnButaca_E7.setMaximumSize(new java.awt.Dimension(50, 50));
        btnButaca_E7.setMinimumSize(new java.awt.Dimension(50, 50));
        btnButaca_E7.setOpaque(true);
        btnButaca_E7.setPreferredSize(new java.awt.Dimension(50, 50));

        btnButaca_E8.setText("E8");
        btnButaca_E8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnButaca_E8.setContentAreaFilled(false);
        btnButaca_E8.setMaximumSize(new java.awt.Dimension(50, 50));
        btnButaca_E8.setMinimumSize(new java.awt.Dimension(50, 50));
        btnButaca_E8.setOpaque(true);
        btnButaca_E8.setPreferredSize(new java.awt.Dimension(50, 50));

        btnButaca_E9.setText("E9");
        btnButaca_E9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnButaca_E9.setContentAreaFilled(false);
        btnButaca_E9.setMaximumSize(new java.awt.Dimension(50, 50));
        btnButaca_E9.setMinimumSize(new java.awt.Dimension(50, 50));
        btnButaca_E9.setOpaque(true);
        btnButaca_E9.setPreferredSize(new java.awt.Dimension(50, 50));

        btnButaca_E10.setText("E10");
        btnButaca_E10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnButaca_E10.setContentAreaFilled(false);
        btnButaca_E10.setMaximumSize(new java.awt.Dimension(50, 50));
        btnButaca_E10.setMinimumSize(new java.awt.Dimension(50, 50));
        btnButaca_E10.setOpaque(true);
        btnButaca_E10.setPreferredSize(new java.awt.Dimension(50, 50));

        btnButaca_E11.setText("E11");
        btnButaca_E11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnButaca_E11.setContentAreaFilled(false);
        btnButaca_E11.setMaximumSize(new java.awt.Dimension(50, 50));
        btnButaca_E11.setMinimumSize(new java.awt.Dimension(50, 50));
        btnButaca_E11.setOpaque(true);
        btnButaca_E11.setPreferredSize(new java.awt.Dimension(50, 50));

        btnButaca_E12.setText("E12");
        btnButaca_E12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnButaca_E12.setContentAreaFilled(false);
        btnButaca_E12.setMaximumSize(new java.awt.Dimension(50, 50));
        btnButaca_E12.setMinimumSize(new java.awt.Dimension(50, 50));
        btnButaca_E12.setOpaque(true);
        btnButaca_E12.setPreferredSize(new java.awt.Dimension(50, 50));

        javax.swing.GroupLayout Nivel_ELayout = new javax.swing.GroupLayout(Nivel_E);
        Nivel_E.setLayout(Nivel_ELayout);
        Nivel_ELayout.setHorizontalGroup(
            Nivel_ELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Nivel_ELayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(btnButaca_E1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnButaca_E2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnButaca_E3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnButaca_E4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnButaca_E5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnButaca_E6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnButaca_E7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnButaca_E8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnButaca_E9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnButaca_E10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnButaca_E11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnButaca_E12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );
        Nivel_ELayout.setVerticalGroup(
            Nivel_ELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Nivel_ELayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(Nivel_ELayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnButaca_E1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnButaca_E2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnButaca_E3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnButaca_E4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnButaca_E5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnButaca_E6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnButaca_E7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnButaca_E8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnButaca_E9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnButaca_E10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnButaca_E11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnButaca_E12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        Nivel_F.setBackground(new java.awt.Color(204, 204, 204));
        Nivel_F.setMaximumSize(new java.awt.Dimension(800, 50));
        Nivel_F.setMinimumSize(new java.awt.Dimension(800, 50));

        btnButaca_F1.setText("F1");
        btnButaca_F1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnButaca_F1.setContentAreaFilled(false);
        btnButaca_F1.setMaximumSize(new java.awt.Dimension(50, 50));
        btnButaca_F1.setMinimumSize(new java.awt.Dimension(50, 50));
        btnButaca_F1.setOpaque(true);
        btnButaca_F1.setPreferredSize(new java.awt.Dimension(50, 50));

        btnButaca_F2.setText("F2");
        btnButaca_F2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnButaca_F2.setContentAreaFilled(false);
        btnButaca_F2.setMaximumSize(new java.awt.Dimension(50, 50));
        btnButaca_F2.setMinimumSize(new java.awt.Dimension(50, 50));
        btnButaca_F2.setOpaque(true);
        btnButaca_F2.setPreferredSize(new java.awt.Dimension(50, 50));

        btnButaca_F3.setText("F3");
        btnButaca_F3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnButaca_F3.setContentAreaFilled(false);
        btnButaca_F3.setMaximumSize(new java.awt.Dimension(50, 50));
        btnButaca_F3.setMinimumSize(new java.awt.Dimension(50, 50));
        btnButaca_F3.setOpaque(true);
        btnButaca_F3.setPreferredSize(new java.awt.Dimension(50, 50));

        btnButaca_F4.setText("F4");
        btnButaca_F4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnButaca_F4.setContentAreaFilled(false);
        btnButaca_F4.setMaximumSize(new java.awt.Dimension(50, 50));
        btnButaca_F4.setMinimumSize(new java.awt.Dimension(50, 50));
        btnButaca_F4.setOpaque(true);
        btnButaca_F4.setPreferredSize(new java.awt.Dimension(50, 50));

        btnButaca_F5.setText("F5");
        btnButaca_F5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnButaca_F5.setContentAreaFilled(false);
        btnButaca_F5.setMaximumSize(new java.awt.Dimension(50, 50));
        btnButaca_F5.setMinimumSize(new java.awt.Dimension(50, 50));
        btnButaca_F5.setOpaque(true);
        btnButaca_F5.setPreferredSize(new java.awt.Dimension(50, 50));

        btnButaca_F6.setText("F6");
        btnButaca_F6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnButaca_F6.setContentAreaFilled(false);
        btnButaca_F6.setMaximumSize(new java.awt.Dimension(50, 50));
        btnButaca_F6.setMinimumSize(new java.awt.Dimension(50, 50));
        btnButaca_F6.setOpaque(true);
        btnButaca_F6.setPreferredSize(new java.awt.Dimension(50, 50));

        btnButaca_F7.setText("F7");
        btnButaca_F7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnButaca_F7.setContentAreaFilled(false);
        btnButaca_F7.setMaximumSize(new java.awt.Dimension(50, 50));
        btnButaca_F7.setMinimumSize(new java.awt.Dimension(50, 50));
        btnButaca_F7.setOpaque(true);
        btnButaca_F7.setPreferredSize(new java.awt.Dimension(50, 50));

        btnButaca_F8.setText("F8");
        btnButaca_F8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnButaca_F8.setContentAreaFilled(false);
        btnButaca_F8.setMaximumSize(new java.awt.Dimension(50, 50));
        btnButaca_F8.setMinimumSize(new java.awt.Dimension(50, 50));
        btnButaca_F8.setOpaque(true);
        btnButaca_F8.setPreferredSize(new java.awt.Dimension(50, 50));

        btnButaca_F9.setText("F9");
        btnButaca_F9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnButaca_F9.setContentAreaFilled(false);
        btnButaca_F9.setMaximumSize(new java.awt.Dimension(50, 50));
        btnButaca_F9.setMinimumSize(new java.awt.Dimension(50, 50));
        btnButaca_F9.setOpaque(true);
        btnButaca_F9.setPreferredSize(new java.awt.Dimension(50, 50));

        btnButaca_F10.setText("F10");
        btnButaca_F10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnButaca_F10.setContentAreaFilled(false);
        btnButaca_F10.setMaximumSize(new java.awt.Dimension(50, 50));
        btnButaca_F10.setMinimumSize(new java.awt.Dimension(50, 50));
        btnButaca_F10.setOpaque(true);
        btnButaca_F10.setPreferredSize(new java.awt.Dimension(50, 50));

        btnButaca_F11.setText("F11");
        btnButaca_F11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnButaca_F11.setContentAreaFilled(false);
        btnButaca_F11.setMaximumSize(new java.awt.Dimension(50, 50));
        btnButaca_F11.setMinimumSize(new java.awt.Dimension(50, 50));
        btnButaca_F11.setOpaque(true);
        btnButaca_F11.setPreferredSize(new java.awt.Dimension(50, 50));

        btnButaca_F12.setText("F12");
        btnButaca_F12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnButaca_F12.setContentAreaFilled(false);
        btnButaca_F12.setMaximumSize(new java.awt.Dimension(50, 50));
        btnButaca_F12.setMinimumSize(new java.awt.Dimension(50, 50));
        btnButaca_F12.setOpaque(true);
        btnButaca_F12.setPreferredSize(new java.awt.Dimension(50, 50));

        javax.swing.GroupLayout Nivel_FLayout = new javax.swing.GroupLayout(Nivel_F);
        Nivel_F.setLayout(Nivel_FLayout);
        Nivel_FLayout.setHorizontalGroup(
            Nivel_FLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Nivel_FLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(btnButaca_F1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnButaca_F2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnButaca_F3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnButaca_F4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnButaca_F5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnButaca_F6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnButaca_F7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnButaca_F8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnButaca_F9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnButaca_F10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnButaca_F11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnButaca_F12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );
        Nivel_FLayout.setVerticalGroup(
            Nivel_FLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Nivel_FLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(Nivel_FLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnButaca_F1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnButaca_F2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnButaca_F3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnButaca_F4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnButaca_F5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnButaca_F6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnButaca_F7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnButaca_F8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnButaca_F9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnButaca_F10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnButaca_F11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnButaca_F12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        Nivel_G.setBackground(new java.awt.Color(204, 204, 204));
        Nivel_G.setMaximumSize(new java.awt.Dimension(800, 50));
        Nivel_G.setMinimumSize(new java.awt.Dimension(800, 50));

        btnButaca_G1.setText("G1");
        btnButaca_G1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnButaca_G1.setContentAreaFilled(false);
        btnButaca_G1.setMaximumSize(new java.awt.Dimension(50, 50));
        btnButaca_G1.setMinimumSize(new java.awt.Dimension(50, 50));
        btnButaca_G1.setOpaque(true);
        btnButaca_G1.setPreferredSize(new java.awt.Dimension(50, 50));

        btnButaca_G2.setText("G2");
        btnButaca_G2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnButaca_G2.setContentAreaFilled(false);
        btnButaca_G2.setMaximumSize(new java.awt.Dimension(50, 50));
        btnButaca_G2.setMinimumSize(new java.awt.Dimension(50, 50));
        btnButaca_G2.setOpaque(true);
        btnButaca_G2.setPreferredSize(new java.awt.Dimension(50, 50));

        btnButaca_G3.setText("G3");
        btnButaca_G3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnButaca_G3.setContentAreaFilled(false);
        btnButaca_G3.setMaximumSize(new java.awt.Dimension(50, 50));
        btnButaca_G3.setMinimumSize(new java.awt.Dimension(50, 50));
        btnButaca_G3.setOpaque(true);
        btnButaca_G3.setPreferredSize(new java.awt.Dimension(50, 50));

        btnButaca_G4.setText("G4");
        btnButaca_G4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnButaca_G4.setContentAreaFilled(false);
        btnButaca_G4.setMaximumSize(new java.awt.Dimension(50, 50));
        btnButaca_G4.setMinimumSize(new java.awt.Dimension(50, 50));
        btnButaca_G4.setOpaque(true);
        btnButaca_G4.setPreferredSize(new java.awt.Dimension(50, 50));

        btnButaca_G5.setText("G5");
        btnButaca_G5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnButaca_G5.setContentAreaFilled(false);
        btnButaca_G5.setMaximumSize(new java.awt.Dimension(50, 50));
        btnButaca_G5.setMinimumSize(new java.awt.Dimension(50, 50));
        btnButaca_G5.setOpaque(true);
        btnButaca_G5.setPreferredSize(new java.awt.Dimension(50, 50));

        btnButaca_G6.setText("G6");
        btnButaca_G6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnButaca_G6.setContentAreaFilled(false);
        btnButaca_G6.setMaximumSize(new java.awt.Dimension(50, 50));
        btnButaca_G6.setMinimumSize(new java.awt.Dimension(50, 50));
        btnButaca_G6.setOpaque(true);
        btnButaca_G6.setPreferredSize(new java.awt.Dimension(50, 50));

        btnButaca_G7.setText("G7");
        btnButaca_G7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnButaca_G7.setContentAreaFilled(false);
        btnButaca_G7.setMaximumSize(new java.awt.Dimension(50, 50));
        btnButaca_G7.setMinimumSize(new java.awt.Dimension(50, 50));
        btnButaca_G7.setOpaque(true);
        btnButaca_G7.setPreferredSize(new java.awt.Dimension(50, 50));

        btnButaca_G8.setText("G8");
        btnButaca_G8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnButaca_G8.setContentAreaFilled(false);
        btnButaca_G8.setMaximumSize(new java.awt.Dimension(50, 50));
        btnButaca_G8.setMinimumSize(new java.awt.Dimension(50, 50));
        btnButaca_G8.setOpaque(true);
        btnButaca_G8.setPreferredSize(new java.awt.Dimension(50, 50));

        btnButaca_G9.setText("G9");
        btnButaca_G9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnButaca_G9.setContentAreaFilled(false);
        btnButaca_G9.setMaximumSize(new java.awt.Dimension(50, 50));
        btnButaca_G9.setMinimumSize(new java.awt.Dimension(50, 50));
        btnButaca_G9.setOpaque(true);
        btnButaca_G9.setPreferredSize(new java.awt.Dimension(50, 50));

        btnButaca_G10.setText("G10");
        btnButaca_G10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnButaca_G10.setContentAreaFilled(false);
        btnButaca_G10.setMaximumSize(new java.awt.Dimension(50, 50));
        btnButaca_G10.setMinimumSize(new java.awt.Dimension(50, 50));
        btnButaca_G10.setOpaque(true);
        btnButaca_G10.setPreferredSize(new java.awt.Dimension(50, 50));

        btnButaca_G11.setText("G11");
        btnButaca_G11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnButaca_G11.setContentAreaFilled(false);
        btnButaca_G11.setMaximumSize(new java.awt.Dimension(50, 50));
        btnButaca_G11.setMinimumSize(new java.awt.Dimension(50, 50));
        btnButaca_G11.setOpaque(true);
        btnButaca_G11.setPreferredSize(new java.awt.Dimension(50, 50));

        btnButaca_G12.setText("G12");
        btnButaca_G12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnButaca_G12.setContentAreaFilled(false);
        btnButaca_G12.setMaximumSize(new java.awt.Dimension(50, 50));
        btnButaca_G12.setMinimumSize(new java.awt.Dimension(50, 50));
        btnButaca_G12.setOpaque(true);
        btnButaca_G12.setPreferredSize(new java.awt.Dimension(50, 50));

        javax.swing.GroupLayout Nivel_GLayout = new javax.swing.GroupLayout(Nivel_G);
        Nivel_G.setLayout(Nivel_GLayout);
        Nivel_GLayout.setHorizontalGroup(
            Nivel_GLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Nivel_GLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(btnButaca_G1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnButaca_G2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnButaca_G3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnButaca_G4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnButaca_G5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnButaca_G6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnButaca_G7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnButaca_G8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnButaca_G9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnButaca_G10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnButaca_G11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnButaca_G12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );
        Nivel_GLayout.setVerticalGroup(
            Nivel_GLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Nivel_GLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(Nivel_GLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnButaca_G1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnButaca_G2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnButaca_G3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnButaca_G4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnButaca_G5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnButaca_G6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnButaca_G7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnButaca_G8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnButaca_G9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnButaca_G10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnButaca_G11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnButaca_G12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        Nivel_H.setBackground(new java.awt.Color(204, 204, 204));
        Nivel_H.setMaximumSize(new java.awt.Dimension(800, 50));
        Nivel_H.setMinimumSize(new java.awt.Dimension(800, 50));

        btnButaca_H1.setText("H1");
        btnButaca_H1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnButaca_H1.setContentAreaFilled(false);
        btnButaca_H1.setMaximumSize(new java.awt.Dimension(50, 50));
        btnButaca_H1.setMinimumSize(new java.awt.Dimension(50, 50));
        btnButaca_H1.setOpaque(true);
        btnButaca_H1.setPreferredSize(new java.awt.Dimension(50, 50));

        btnButaca_H2.setText("H2");
        btnButaca_H2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnButaca_H2.setContentAreaFilled(false);
        btnButaca_H2.setMaximumSize(new java.awt.Dimension(50, 50));
        btnButaca_H2.setMinimumSize(new java.awt.Dimension(50, 50));
        btnButaca_H2.setOpaque(true);
        btnButaca_H2.setPreferredSize(new java.awt.Dimension(50, 50));

        btnButaca_H3.setText("H3");
        btnButaca_H3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnButaca_H3.setContentAreaFilled(false);
        btnButaca_H3.setMaximumSize(new java.awt.Dimension(50, 50));
        btnButaca_H3.setMinimumSize(new java.awt.Dimension(50, 50));
        btnButaca_H3.setOpaque(true);
        btnButaca_H3.setPreferredSize(new java.awt.Dimension(50, 50));

        btnButaca_H4.setText("H4");
        btnButaca_H4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnButaca_H4.setContentAreaFilled(false);
        btnButaca_H4.setMaximumSize(new java.awt.Dimension(50, 50));
        btnButaca_H4.setMinimumSize(new java.awt.Dimension(50, 50));
        btnButaca_H4.setOpaque(true);
        btnButaca_H4.setPreferredSize(new java.awt.Dimension(50, 50));

        btnButaca_H5.setText("H5");
        btnButaca_H5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnButaca_H5.setContentAreaFilled(false);
        btnButaca_H5.setMaximumSize(new java.awt.Dimension(50, 50));
        btnButaca_H5.setMinimumSize(new java.awt.Dimension(50, 50));
        btnButaca_H5.setOpaque(true);
        btnButaca_H5.setPreferredSize(new java.awt.Dimension(50, 50));

        btnButaca_H6.setText("H6");
        btnButaca_H6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnButaca_H6.setContentAreaFilled(false);
        btnButaca_H6.setMaximumSize(new java.awt.Dimension(50, 50));
        btnButaca_H6.setMinimumSize(new java.awt.Dimension(50, 50));
        btnButaca_H6.setOpaque(true);
        btnButaca_H6.setPreferredSize(new java.awt.Dimension(50, 50));

        btnButaca_H7.setText("H7");
        btnButaca_H7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnButaca_H7.setContentAreaFilled(false);
        btnButaca_H7.setMaximumSize(new java.awt.Dimension(50, 50));
        btnButaca_H7.setMinimumSize(new java.awt.Dimension(50, 50));
        btnButaca_H7.setOpaque(true);
        btnButaca_H7.setPreferredSize(new java.awt.Dimension(50, 50));

        btnButaca_H8.setText("H8");
        btnButaca_H8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnButaca_H8.setContentAreaFilled(false);
        btnButaca_H8.setMaximumSize(new java.awt.Dimension(50, 50));
        btnButaca_H8.setMinimumSize(new java.awt.Dimension(50, 50));
        btnButaca_H8.setOpaque(true);
        btnButaca_H8.setPreferredSize(new java.awt.Dimension(50, 50));

        btnButaca_H9.setText("H9");
        btnButaca_H9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnButaca_H9.setContentAreaFilled(false);
        btnButaca_H9.setMaximumSize(new java.awt.Dimension(50, 50));
        btnButaca_H9.setMinimumSize(new java.awt.Dimension(50, 50));
        btnButaca_H9.setOpaque(true);
        btnButaca_H9.setPreferredSize(new java.awt.Dimension(50, 50));

        btnButaca_H10.setText("H10");
        btnButaca_H10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnButaca_H10.setContentAreaFilled(false);
        btnButaca_H10.setMaximumSize(new java.awt.Dimension(50, 50));
        btnButaca_H10.setMinimumSize(new java.awt.Dimension(50, 50));
        btnButaca_H10.setOpaque(true);
        btnButaca_H10.setPreferredSize(new java.awt.Dimension(50, 50));

        btnButaca_H11.setText("H11");
        btnButaca_H11.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnButaca_H11.setContentAreaFilled(false);
        btnButaca_H11.setMaximumSize(new java.awt.Dimension(50, 50));
        btnButaca_H11.setMinimumSize(new java.awt.Dimension(50, 50));
        btnButaca_H11.setOpaque(true);
        btnButaca_H11.setPreferredSize(new java.awt.Dimension(50, 50));

        btnButaca_H12.setText("H12");
        btnButaca_H12.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        btnButaca_H12.setContentAreaFilled(false);
        btnButaca_H12.setMaximumSize(new java.awt.Dimension(50, 50));
        btnButaca_H12.setMinimumSize(new java.awt.Dimension(50, 50));
        btnButaca_H12.setOpaque(true);
        btnButaca_H12.setPreferredSize(new java.awt.Dimension(50, 50));

        javax.swing.GroupLayout Nivel_HLayout = new javax.swing.GroupLayout(Nivel_H);
        Nivel_H.setLayout(Nivel_HLayout);
        Nivel_HLayout.setHorizontalGroup(
            Nivel_HLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Nivel_HLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(btnButaca_H1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnButaca_H2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnButaca_H3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnButaca_H4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnButaca_H5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnButaca_H6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnButaca_H7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnButaca_H8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnButaca_H9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(btnButaca_H10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnButaca_H11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnButaca_H12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );
        Nivel_HLayout.setVerticalGroup(
            Nivel_HLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Nivel_HLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(Nivel_HLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnButaca_H1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnButaca_H2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnButaca_H3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnButaca_H4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnButaca_H5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnButaca_H6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnButaca_H7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnButaca_H8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnButaca_H9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnButaca_H10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnButaca_H11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnButaca_H12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        lbPeliculas.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lbPeliculas.setForeground(new java.awt.Color(51, 51, 255));
        lbPeliculas.setText("Asientos");
        lbPeliculas.setMaximumSize(new java.awt.Dimension(100, 30));
        lbPeliculas.setMinimumSize(new java.awt.Dimension(100, 30));
        lbPeliculas.setPreferredSize(new java.awt.Dimension(100, 32));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Ocupados : 00");
        jLabel2.setMaximumSize(new java.awt.Dimension(100, 22));
        jLabel2.setMinimumSize(new java.awt.Dimension(100, 22));
        jLabel2.setPreferredSize(new java.awt.Dimension(100, 22));

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Libres : 00");
        jLabel3.setMaximumSize(new java.awt.Dimension(100, 22));
        jLabel3.setMinimumSize(new java.awt.Dimension(100, 22));
        jLabel3.setPreferredSize(new java.awt.Dimension(100, 22));

        btnAtras.setBackground(new java.awt.Color(204, 204, 204));
        btnAtras.setText("Atras");
        btnAtras.setBorder(null);
        btnAtras.setBorderPainted(false);
        btnAtras.setContentAreaFilled(false);
        btnAtras.setMaximumSize(new java.awt.Dimension(100, 30));
        btnAtras.setMinimumSize(new java.awt.Dimension(100, 30));
        btnAtras.setOpaque(true);
        btnAtras.setPreferredSize(new java.awt.Dimension(100, 30));
        btnAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtrasActionPerformed(evt);
            }
        });

        btnProcesarEntrada.setBackground(new java.awt.Color(204, 204, 204));
        btnProcesarEntrada.setText("Procesar");
        btnProcesarEntrada.setBorder(null);
        btnProcesarEntrada.setBorderPainted(false);
        btnProcesarEntrada.setContentAreaFilled(false);
        btnProcesarEntrada.setMaximumSize(new java.awt.Dimension(100, 30));
        btnProcesarEntrada.setMinimumSize(new java.awt.Dimension(100, 30));
        btnProcesarEntrada.setOpaque(true);
        btnProcesarEntrada.setPreferredSize(new java.awt.Dimension(100, 30));
        btnProcesarEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnProcesarEntradaActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI Black", 0, 12)); // NOI18N
        jLabel4.setText("Metodo de pago :");

        rbEfectivo.setText("Efectivo");
        rbEfectivo.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rbEfectivo.setMaximumSize(new java.awt.Dimension(100, 22));
        rbEfectivo.setMinimumSize(new java.awt.Dimension(100, 22));
        rbEfectivo.setPreferredSize(new java.awt.Dimension(100, 20));
        rbEfectivo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbEfectivoActionPerformed(evt);
            }
        });

        rbTarjeta.setText("Tarjeta");
        rbTarjeta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rbTarjeta.setMaximumSize(new java.awt.Dimension(100, 22));
        rbTarjeta.setMinimumSize(new java.awt.Dimension(100, 22));
        rbTarjeta.setPreferredSize(new java.awt.Dimension(100, 20));
        rbTarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbTarjetaActionPerformed(evt);
            }
        });

        rbIzipay.setText("Izipay");
        rbIzipay.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rbIzipay.setMaximumSize(new java.awt.Dimension(100, 22));
        rbIzipay.setMinimumSize(new java.awt.Dimension(100, 22));
        rbIzipay.setPreferredSize(new java.awt.Dimension(100, 20));
        rbIzipay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbIzipayActionPerformed(evt);
            }
        });

        rbYape.setText("Yape");
        rbYape.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rbYape.setMaximumSize(new java.awt.Dimension(100, 22));
        rbYape.setMinimumSize(new java.awt.Dimension(100, 22));
        rbYape.setPreferredSize(new java.awt.Dimension(100, 20));
        rbYape.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbYapeActionPerformed(evt);
            }
        });

        lbCodigoQR.setMaximumSize(new java.awt.Dimension(100, 100));
        lbCodigoQR.setMinimumSize(new java.awt.Dimension(100, 100));
        lbCodigoQR.setPreferredSize(new java.awt.Dimension(100, 100));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(rbEfectivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbIzipay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(rbYape, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lbCodigoQR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Nivel_G, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Nivel_F, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Nivel_E, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Nivel_D, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Nivel_C, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Nivel_B, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Nivel_A, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Nivel_H, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(127, 127, 127))))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lbPeliculas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnAtras, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnProcesarEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addContainerGap(852, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Nivel_A, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Nivel_B, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Nivel_C, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Nivel_D, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Nivel_E, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Nivel_F, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Nivel_G, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Nivel_H, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbEfectivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbIzipay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rbYape, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbCodigoQR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(7, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(lbPeliculas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(310, 310, 310)
                    .addComponent(btnAtras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(btnProcesarEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(80, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtrasActionPerformed
        menuEspectador.mostrarPanel("verFunciones", codigoPelicula, codigoFuncion);
    }//GEN-LAST:event_btnAtrasActionPerformed

    private void btnProcesarEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnProcesarEntradaActionPerformed
        if (butacaSeleccionada == null) {
            JOptionPane.showMessageDialog(null, 
                "Debes seleccionar una butaca antes de continuar.", 
                "Selección requerida", JOptionPane.WARNING_MESSAGE);
            return;
        }

        System.out.println("Procesando butaca seleccionada:");
        System.out.println("Fila: " + butacaSeleccionada.getFila() + 
                           " Número: " + butacaSeleccionada.getNumero() + 
                           " Función: " + (butacaSeleccionada.getFuncion() != null ? butacaSeleccionada.getFuncion().getCodigoFuncion() : "No asignada"));

        // Asignar la función a la butaca seleccionada antes de actualizar en BD
        Funcion funcion = new Funcion();
        funcion.setCodigoFuncion(codigoFuncion);
        butacaSeleccionada.setFuncion(funcion);

        // Guardar en BD
        CRUD_Butacas crudButacas = new CRUD_Butacas();
        boolean actualizado = crudButacas.actualizarEstadoButacaEnBD(butacaSeleccionada);

        if (actualizado) {
            // Cambiar color a rojo (ocupado)
            int filaIndex = butacaSeleccionada.getFila() - 'A';
            int columnaIndex = butacaSeleccionada.getNumero() - 1;
            butacas[filaIndex][columnaIndex].setBackground(Color.RED); // Aquí se usa `butacas[][]`

            JOptionPane.showMessageDialog(null, 
                "Butaca confirmada correctamente.", 
                "Éxito", JOptionPane.INFORMATION_MESSAGE);

            // Redirigir al panel de pago
            menuEspectador.mostrarPanel("pagoEntrada", codigoPelicula, codigoFuncion);
        } else {
            JOptionPane.showMessageDialog(null, 
                "Error al actualizar la butaca en la base de datos.", 
                "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnProcesarEntradaActionPerformed

    private void rbEfectivoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbEfectivoActionPerformed
        lbCodigoQR.setIcon(new ImageIcon(""));
    }//GEN-LAST:event_rbEfectivoActionPerformed

    private void rbTarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbTarjetaActionPerformed
        // Definir la ruta base para evitar repetirlo muchas veces
        String rutaBase = "C:\\Users\\Usuario\\Documents\\NetBeansProjects\\Iconos - Cine\\";
        // Rutas del codigo QR
        String iconoCodigoQR = rutaBase + "Icono de Tarjetas (100px).png";

        lbCodigoQR.setIcon(new ImageIcon(iconoCodigoQR));
    }//GEN-LAST:event_rbTarjetaActionPerformed

    private void rbIzipayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbIzipayActionPerformed
        // Definir la ruta base para evitar repetirlo muchas veces
        String rutaBase = "C:\\Users\\Usuario\\Documents\\NetBeansProjects\\Iconos - Cine\\";
        // Rutas del codigo QR
        String iconoCodigoQR = rutaBase + "Codigo QR Izipay (100px).png";

        lbCodigoQR.setIcon(new ImageIcon(iconoCodigoQR));
    }//GEN-LAST:event_rbIzipayActionPerformed

    private void rbYapeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbYapeActionPerformed
        // Definir la ruta base para evitar repetirlo muchas veces
        String rutaBase = "C:\\Users\\Usuario\\Documents\\NetBeansProjects\\Iconos - Cine\\";
        // Rutas del codigo QR
        String iconoCodigoQR = rutaBase + "Codigo QR Yape (100px).png";

        lbCodigoQR.setIcon(new ImageIcon(iconoCodigoQR));
    }//GEN-LAST:event_rbYapeActionPerformed
    
    private void declararBotones() {
        JButton[][] botones = {
            {btnButaca_A1, btnButaca_A2, btnButaca_A3, btnButaca_A4, btnButaca_A5, btnButaca_A6, btnButaca_A7, btnButaca_A8, btnButaca_A9, btnButaca_A10, btnButaca_A11, btnButaca_A12},
            {btnButaca_B1, btnButaca_B2, btnButaca_B3, btnButaca_B4, btnButaca_B5, btnButaca_B6, btnButaca_B7, btnButaca_B8, btnButaca_B9, btnButaca_B10, btnButaca_B11, btnButaca_B12},
            {btnButaca_C1, btnButaca_C2, btnButaca_C3, btnButaca_C4, btnButaca_C5, btnButaca_C6, btnButaca_C7, btnButaca_C8, btnButaca_C9, btnButaca_C10, btnButaca_C11, btnButaca_C12},
            {btnButaca_D1, btnButaca_D2, btnButaca_D3, btnButaca_D4, btnButaca_D5, btnButaca_D6, btnButaca_D7, btnButaca_D8, btnButaca_D9, btnButaca_D10, btnButaca_D11, btnButaca_D12},
            {btnButaca_E1, btnButaca_E2, btnButaca_E3, btnButaca_E4, btnButaca_E5, btnButaca_E6, btnButaca_E7, btnButaca_E8, btnButaca_E9, btnButaca_E10, btnButaca_E11, btnButaca_E12},
            {btnButaca_F1, btnButaca_F2, btnButaca_F3, btnButaca_F4, btnButaca_F5, btnButaca_F6, btnButaca_F7, btnButaca_F8, btnButaca_F9, btnButaca_F10, btnButaca_F11, btnButaca_F12},
            {btnButaca_G1, btnButaca_G2, btnButaca_G3, btnButaca_G4, btnButaca_G5, btnButaca_G6, btnButaca_G7, btnButaca_G8, btnButaca_G9, btnButaca_G10, btnButaca_G11, btnButaca_G12},
            {btnButaca_H1, btnButaca_H2, btnButaca_H3, btnButaca_H4, btnButaca_H5, btnButaca_H6, btnButaca_H7, btnButaca_H8, btnButaca_H9, btnButaca_H10, btnButaca_H11, btnButaca_H12}
        };

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 12; j++) {
                butacas[i][j] = botones[i][j];
            }
        }
    }
    
    private void asignarEventos() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 12; j++) {
                JButton btnButaca = butacas[i][j]; // Obtenemos el botón
                if (btnButaca != null) {
                    String fila = obtenerFila(i);
                    int numero = j + 1;
                    btnButaca.setActionCommand(fila + numero);

                    // Verifica el color inicial
                    if (btnButaca.getBackground() == null || btnButaca.getBackground().equals(Color.WHITE)) {
                        btnButaca.setBackground(Color.GREEN); // Libre (verde) por defecto
                    }

                    btnButaca.addActionListener(e -> {
                        // Si la butaca está ocupada (roja), mostrar mensaje y no permitir selección
                        if (btnButaca.getBackground().equals(Color.RED)) {
                            JOptionPane.showMessageDialog(null, 
                                "Esta butaca ya está ocupada. Elige otra.", 
                                "Butaca ocupada", JOptionPane.WARNING_MESSAGE);
                            return;
                        }

                        // Si ya hay una butaca seleccionada, restaurar su color anterior (verde)
                        if (butacaSeleccionada != null) {
                            int filaAnt = butacaSeleccionada.getFila() - 'A'; // Convertimos 'A' en 0, 'B' en 1, etc.
                            int numAnt = butacaSeleccionada.getNumero() - 1; // Convertimos 1 en 0, 2 en 1, etc.
                            butacas[filaAnt][numAnt].setBackground(Color.GREEN); // Restaurar color verde
                        }

                        // Crear nueva butaca seleccionada
                        Butaca nuevaButaca = new Butaca();
                        nuevaButaca.setFila(fila.charAt(0));
                        nuevaButaca.setNumero(numero);
                        nuevaButaca.setEstado(true);

                        // Guardamos la selección y marcamos el botón en amarillo
                        butacaSeleccionada = nuevaButaca;
                        btnButaca.setBackground(Color.YELLOW); // Marcar la butaca seleccionada
                    });
                }
            }
        }
    }

    public void cargarButacas(int codigoFuncion) {
        this.codigoFuncion = codigoFuncion;
        CRUD_Butacas crudButacas = new CRUD_Butacas();
        List<Butaca> listaButacas = crudButacas.cargarButacasDesdeBD(codigoFuncion);
        actualizarEstadoButacas(listaButacas);
    }

    public void actualizarEstadoButacas(List<Butaca> listaButacas) {
        for (Butaca butaca : listaButacas) {
            int filaIndex = butaca.getFila() - 'A';
            int columnaIndex = butaca.getNumero() - 1;

            if (filaIndex >= 0 && filaIndex < 8 && columnaIndex >= 0 && columnaIndex < 12) {
                JButton boton = butacas[filaIndex][columnaIndex];

                if (boton != null) {
                    boton.setBackground(butaca.isEstado() ? Color.RED : Color.GREEN);
                    boton.setActionCommand(obtenerFila(filaIndex) + (columnaIndex + 1));
                }
            }
        }
    }

    private String obtenerFila(int index) {
        return String.valueOf((char) ('A' + index));
    }

    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Nivel_A;
    private javax.swing.JPanel Nivel_B;
    private javax.swing.JPanel Nivel_C;
    private javax.swing.JPanel Nivel_D;
    private javax.swing.JPanel Nivel_E;
    private javax.swing.JPanel Nivel_F;
    private javax.swing.JPanel Nivel_G;
    private javax.swing.JPanel Nivel_H;
    private javax.swing.JButton btnAtras;
    private javax.swing.JButton btnButaca_A1;
    private javax.swing.JButton btnButaca_A10;
    private javax.swing.JButton btnButaca_A11;
    private javax.swing.JButton btnButaca_A12;
    private javax.swing.JButton btnButaca_A2;
    private javax.swing.JButton btnButaca_A3;
    private javax.swing.JButton btnButaca_A4;
    private javax.swing.JButton btnButaca_A5;
    private javax.swing.JButton btnButaca_A6;
    private javax.swing.JButton btnButaca_A7;
    private javax.swing.JButton btnButaca_A8;
    private javax.swing.JButton btnButaca_A9;
    private javax.swing.JButton btnButaca_B1;
    private javax.swing.JButton btnButaca_B10;
    private javax.swing.JButton btnButaca_B11;
    private javax.swing.JButton btnButaca_B12;
    private javax.swing.JButton btnButaca_B2;
    private javax.swing.JButton btnButaca_B3;
    private javax.swing.JButton btnButaca_B4;
    private javax.swing.JButton btnButaca_B5;
    private javax.swing.JButton btnButaca_B6;
    private javax.swing.JButton btnButaca_B7;
    private javax.swing.JButton btnButaca_B8;
    private javax.swing.JButton btnButaca_B9;
    private javax.swing.JButton btnButaca_C1;
    private javax.swing.JButton btnButaca_C10;
    private javax.swing.JButton btnButaca_C11;
    private javax.swing.JButton btnButaca_C12;
    private javax.swing.JButton btnButaca_C2;
    private javax.swing.JButton btnButaca_C3;
    private javax.swing.JButton btnButaca_C4;
    private javax.swing.JButton btnButaca_C5;
    private javax.swing.JButton btnButaca_C6;
    private javax.swing.JButton btnButaca_C7;
    private javax.swing.JButton btnButaca_C8;
    private javax.swing.JButton btnButaca_C9;
    private javax.swing.JButton btnButaca_D1;
    private javax.swing.JButton btnButaca_D10;
    private javax.swing.JButton btnButaca_D11;
    private javax.swing.JButton btnButaca_D12;
    private javax.swing.JButton btnButaca_D2;
    private javax.swing.JButton btnButaca_D3;
    private javax.swing.JButton btnButaca_D4;
    private javax.swing.JButton btnButaca_D5;
    private javax.swing.JButton btnButaca_D6;
    private javax.swing.JButton btnButaca_D7;
    private javax.swing.JButton btnButaca_D8;
    private javax.swing.JButton btnButaca_D9;
    private javax.swing.JButton btnButaca_E1;
    private javax.swing.JButton btnButaca_E10;
    private javax.swing.JButton btnButaca_E11;
    private javax.swing.JButton btnButaca_E12;
    private javax.swing.JButton btnButaca_E2;
    private javax.swing.JButton btnButaca_E3;
    private javax.swing.JButton btnButaca_E4;
    private javax.swing.JButton btnButaca_E5;
    private javax.swing.JButton btnButaca_E6;
    private javax.swing.JButton btnButaca_E7;
    private javax.swing.JButton btnButaca_E8;
    private javax.swing.JButton btnButaca_E9;
    private javax.swing.JButton btnButaca_F1;
    private javax.swing.JButton btnButaca_F10;
    private javax.swing.JButton btnButaca_F11;
    private javax.swing.JButton btnButaca_F12;
    private javax.swing.JButton btnButaca_F2;
    private javax.swing.JButton btnButaca_F3;
    private javax.swing.JButton btnButaca_F4;
    private javax.swing.JButton btnButaca_F5;
    private javax.swing.JButton btnButaca_F6;
    private javax.swing.JButton btnButaca_F7;
    private javax.swing.JButton btnButaca_F8;
    private javax.swing.JButton btnButaca_F9;
    private javax.swing.JButton btnButaca_G1;
    private javax.swing.JButton btnButaca_G10;
    private javax.swing.JButton btnButaca_G11;
    private javax.swing.JButton btnButaca_G12;
    private javax.swing.JButton btnButaca_G2;
    private javax.swing.JButton btnButaca_G3;
    private javax.swing.JButton btnButaca_G4;
    private javax.swing.JButton btnButaca_G5;
    private javax.swing.JButton btnButaca_G6;
    private javax.swing.JButton btnButaca_G7;
    private javax.swing.JButton btnButaca_G8;
    private javax.swing.JButton btnButaca_G9;
    private javax.swing.JButton btnButaca_H1;
    private javax.swing.JButton btnButaca_H10;
    private javax.swing.JButton btnButaca_H11;
    private javax.swing.JButton btnButaca_H12;
    private javax.swing.JButton btnButaca_H2;
    private javax.swing.JButton btnButaca_H3;
    private javax.swing.JButton btnButaca_H4;
    private javax.swing.JButton btnButaca_H5;
    private javax.swing.JButton btnButaca_H6;
    private javax.swing.JButton btnButaca_H7;
    private javax.swing.JButton btnButaca_H8;
    private javax.swing.JButton btnButaca_H9;
    private javax.swing.JButton btnProcesarEntrada;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbCodigoQR;
    private javax.swing.JLabel lbPeliculas;
    private javax.swing.JRadioButton rbEfectivo;
    private javax.swing.JRadioButton rbIzipay;
    private javax.swing.JRadioButton rbTarjeta;
    private javax.swing.JRadioButton rbYape;
    // End of variables declaration//GEN-END:variables
}
