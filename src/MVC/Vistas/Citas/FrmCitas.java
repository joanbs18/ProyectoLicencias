/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package MVC.Vistas.Citas;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author josep
 */
public class FrmCitas extends javax.swing.JFrame {

    int xMouse, yMouse;
    /**
     * Creates new form FrmCitas
     */
    public FrmCitas() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        header = new javax.swing.JPanel();
        minimizeBtn = new javax.swing.JPanel();
        minimizeTxt = new javax.swing.JLabel();
        exitBtn = new javax.swing.JPanel();
        exitTxt = new javax.swing.JLabel();
        logoP = new javax.swing.JLabel();
        bg2 = new javax.swing.JPanel();
        registrarBtn = new javax.swing.JPanel();
        registrarCitaBtnTxt = new javax.swing.JLabel();
        lblCedula2 = new javax.swing.JLabel();
        txtCedulaRC = new javax.swing.JFormattedTextField();
        cedulaSeparador2 = new javax.swing.JSeparator();
        lblNombre = new javax.swing.JLabel();
        txtNombreRC = new javax.swing.JTextField();
        nombreSeparador = new javax.swing.JSeparator();
        lblCorreo = new javax.swing.JLabel();
        txtCorreoRC = new javax.swing.JTextField();
        correoSeparador = new javax.swing.JSeparator();
        lblFecha = new javax.swing.JLabel();
        txtFechaNacimientoRC = new javax.swing.JFormattedTextField();
        fechaSeparador = new javax.swing.JSeparator();
        lblNumero = new javax.swing.JLabel();
        txtNumeroRC = new javax.swing.JFormattedTextField();
        numeroSeparado = new javax.swing.JSeparator();
        logoP1 = new javax.swing.JLabel();
        lblCedula3 = new javax.swing.JLabel();
        txtFechaRC = new javax.swing.JFormattedTextField();
        cedulaSeparador3 = new javax.swing.JSeparator();
        lblCedula4 = new javax.swing.JLabel();
        txtHoraRC = new javax.swing.JFormattedTextField();
        cedulaSeparador4 = new javax.swing.JSeparator();
        title = new javax.swing.JLabel();
        btnVerificar = new javax.swing.JPanel();
        lblVerificar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        bg.setBackground(new java.awt.Color(255, 255, 255));

        header.setBackground(new java.awt.Color(0, 0, 0));
        header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                headerMouseDragged(evt);
            }
        });
        header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                headerMousePressed(evt);
            }
        });

        minimizeBtn.setBackground(new java.awt.Color(0, 0, 0));
        minimizeBtn.setPreferredSize(new java.awt.Dimension(40, 40));

        minimizeTxt.setBackground(new java.awt.Color(0, 0, 0));
        minimizeTxt.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        minimizeTxt.setForeground(new java.awt.Color(255, 255, 255));
        minimizeTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minimizeTxt.setText("-");
        minimizeTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        minimizeTxt.setPreferredSize(new java.awt.Dimension(40, 40));
        minimizeTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                minimizeTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                minimizeTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout minimizeBtnLayout = new javax.swing.GroupLayout(minimizeBtn);
        minimizeBtn.setLayout(minimizeBtnLayout);
        minimizeBtnLayout.setHorizontalGroup(
            minimizeBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(minimizeBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(minimizeTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
        );
        minimizeBtnLayout.setVerticalGroup(
            minimizeBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(minimizeBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(minimizeBtnLayout.createSequentialGroup()
                    .addComponent(minimizeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        exitBtn.setBackground(new java.awt.Color(0, 0, 0));

        exitTxt.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        exitTxt.setForeground(new java.awt.Color(255, 255, 255));
        exitTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitTxt.setText("x");
        exitTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        exitTxt.setPreferredSize(new java.awt.Dimension(40, 40));
        exitTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout exitBtnLayout = new javax.swing.GroupLayout(exitBtn);
        exitBtn.setLayout(exitBtnLayout);
        exitBtnLayout.setHorizontalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(exitBtnLayout.createSequentialGroup()
                .addComponent(exitTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        exitBtnLayout.setVerticalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(minimizeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(headerLayout.createSequentialGroup()
                .addComponent(minimizeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        logoP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/LOGO_PEQUEÑO.png"))); // NOI18N

        bg2.setBackground(new java.awt.Color(255, 255, 255));
        bg2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        registrarBtn.setBackground(new java.awt.Color(0, 134, 190));

        registrarCitaBtnTxt.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        registrarCitaBtnTxt.setForeground(new java.awt.Color(255, 255, 255));
        registrarCitaBtnTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        registrarCitaBtnTxt.setText("REGISTRAR CITA");
        registrarCitaBtnTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        registrarCitaBtnTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registrarCitaBtnTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                registrarCitaBtnTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                registrarCitaBtnTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout registrarBtnLayout = new javax.swing.GroupLayout(registrarBtn);
        registrarBtn.setLayout(registrarBtnLayout);
        registrarBtnLayout.setHorizontalGroup(
            registrarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(registrarCitaBtnTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
        );
        registrarBtnLayout.setVerticalGroup(
            registrarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(registrarCitaBtnTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        bg2.add(registrarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 470, 310, 40));

        lblCedula2.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        lblCedula2.setText("NÚMERO DE CÉDULA");
        bg2.add(lblCedula2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 150, -1));

        txtCedulaRC.setBorder(null);
        txtCedulaRC.setForeground(new java.awt.Color(204, 204, 204));
        txtCedulaRC.setText("Número de cédula");
        txtCedulaRC.setToolTipText("");
        txtCedulaRC.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtCedulaRC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtCedulaRCMousePressed(evt);
            }
        });
        txtCedulaRC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedulaRCActionPerformed(evt);
            }
        });
        bg2.add(txtCedulaRC, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 310, 20));

        cedulaSeparador2.setForeground(new java.awt.Color(0, 0, 0));
        bg2.add(cedulaSeparador2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, 310, 20));

        lblNombre.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        lblNombre.setText("NOMBRE COMPLETO");
        bg2.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        txtNombreRC.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtNombreRC.setForeground(new java.awt.Color(204, 204, 204));
        txtNombreRC.setText("Nombre completo");
        txtNombreRC.setBorder(null);
        txtNombreRC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtNombreRCMousePressed(evt);
            }
        });
        bg2.add(txtNombreRC, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 310, 20));

        nombreSeparador.setForeground(new java.awt.Color(0, 0, 0));
        bg2.add(nombreSeparador, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 310, 30));

        lblCorreo.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        lblCorreo.setText("CORREO ELECTRÓNICO");
        bg2.add(lblCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, -1, 20));

        txtCorreoRC.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtCorreoRC.setForeground(new java.awt.Color(204, 204, 204));
        txtCorreoRC.setText("ejemplo@ejemplo.com");
        txtCorreoRC.setBorder(null);
        txtCorreoRC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtCorreoRCMousePressed(evt);
            }
        });
        txtCorreoRC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoRCActionPerformed(evt);
            }
        });
        bg2.add(txtCorreoRC, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 310, 20));

        correoSeparador.setForeground(new java.awt.Color(0, 0, 0));
        bg2.add(correoSeparador, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 310, 30));

        lblFecha.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        lblFecha.setText("FECHA DE NACIMIENTO");
        bg2.add(lblFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 450, -1, -1));

        txtFechaNacimientoRC.setBorder(null);
        txtFechaNacimientoRC.setForeground(new java.awt.Color(204, 204, 204));
        txtFechaNacimientoRC.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("yyyy-MM-dd"))));
        txtFechaNacimientoRC.setText("yyyy-MM-dd");
        txtFechaNacimientoRC.setToolTipText("");
        txtFechaNacimientoRC.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtFechaNacimientoRC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtFechaNacimientoRCMousePressed(evt);
            }
        });
        bg2.add(txtFechaNacimientoRC, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 480, 310, 20));

        fechaSeparador.setForeground(new java.awt.Color(0, 0, 0));
        bg2.add(fechaSeparador, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 500, 310, 20));

        lblNumero.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        lblNumero.setText("NÚMERO TELEFÓNICO");
        bg2.add(lblNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 120, -1, -1));

        txtNumeroRC.setBorder(null);
        txtNumeroRC.setForeground(new java.awt.Color(204, 204, 204));
        txtNumeroRC.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        txtNumeroRC.setText("####-####");
        txtNumeroRC.setToolTipText("");
        txtNumeroRC.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtNumeroRC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtNumeroRCMousePressed(evt);
            }
        });
        txtNumeroRC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroRCActionPerformed(evt);
            }
        });
        bg2.add(txtNumeroRC, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 150, 310, 20));

        numeroSeparado.setForeground(new java.awt.Color(0, 0, 0));
        bg2.add(numeroSeparado, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 170, 310, 20));

        logoP1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/LOGO_PEQUEÑO.png"))); // NOI18N
        bg2.add(logoP1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, 60, 44));

        lblCedula3.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        lblCedula3.setText("FECHA");
        bg2.add(lblCedula3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 340, -1, -1));

        txtFechaRC.setBorder(null);
        txtFechaRC.setForeground(new java.awt.Color(204, 204, 204));
        txtFechaRC.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd-M-yy"))));
        txtFechaRC.setToolTipText("");
        txtFechaRC.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtFechaRC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtFechaRCMousePressed(evt);
            }
        });
        txtFechaRC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFechaRCActionPerformed(evt);
            }
        });
        bg2.add(txtFechaRC, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 380, 310, 20));

        cedulaSeparador3.setForeground(new java.awt.Color(0, 0, 0));
        bg2.add(cedulaSeparador3, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 400, 310, 20));

        lblCedula4.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        lblCedula4.setText("HORA");
        bg2.add(lblCedula4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 220, -1, -1));

        txtHoraRC.setBorder(null);
        txtHoraRC.setForeground(new java.awt.Color(204, 204, 204));
        txtHoraRC.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(java.text.DateFormat.getTimeInstance())));
        txtHoraRC.setToolTipText("");
        txtHoraRC.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtHoraRC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtHoraRCMousePressed(evt);
            }
        });
        txtHoraRC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtHoraRCActionPerformed(evt);
            }
        });
        bg2.add(txtHoraRC, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 250, 310, 20));

        cedulaSeparador4.setForeground(new java.awt.Color(0, 0, 0));
        bg2.add(cedulaSeparador4, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 270, 310, 20));

        title.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        title.setText("SISTEMA DE CITAS");
        bg2.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        btnVerificar.setBackground(new java.awt.Color(0, 134, 190));

        lblVerificar.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        lblVerificar.setForeground(new java.awt.Color(255, 255, 255));
        lblVerificar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblVerificar.setText("VERIFICAR");
        lblVerificar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblVerificarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lblVerificarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lblVerificarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btnVerificarLayout = new javax.swing.GroupLayout(btnVerificar);
        btnVerificar.setLayout(btnVerificarLayout);
        btnVerificarLayout.setHorizontalGroup(
            btnVerificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblVerificar, javax.swing.GroupLayout.DEFAULT_SIZE, 71, Short.MAX_VALUE)
        );
        btnVerificarLayout.setVerticalGroup(
            btnVerificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblVerificar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
        );

        bg2.add(btnVerificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 90, -1, 20));

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(217, 217, 217)
                .addComponent(logoP)
                .addContainerGap(669, Short.MAX_VALUE))
            .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(bg2, javax.swing.GroupLayout.DEFAULT_SIZE, 940, Short.MAX_VALUE))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addComponent(header, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(logoP, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 476, Short.MAX_VALUE))
            .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, bgLayout.createSequentialGroup()
                    .addGap(0, 40, Short.MAX_VALUE)
                    .addComponent(bg2, javax.swing.GroupLayout.PREFERRED_SIZE, 548, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void minimizeTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeTxtMouseClicked
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_minimizeTxtMouseClicked

    private void minimizeTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeTxtMouseEntered
        minimizeBtn.setBackground(Color.orange);
        minimizeTxt.setForeground(Color.black);
    }//GEN-LAST:event_minimizeTxtMouseEntered

    private void minimizeTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeTxtMouseExited
        minimizeBtn.setBackground(Color.black);
        minimizeTxt.setForeground(Color.white);
    }//GEN-LAST:event_minimizeTxtMouseExited

    private void exitTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseClicked
        this.dispose();
    }//GEN-LAST:event_exitTxtMouseClicked

    private void exitTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseEntered
        exitBtn.setBackground(Color.red);
        exitTxt.setForeground(Color.white);
    }//GEN-LAST:event_exitTxtMouseEntered

    private void exitTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseExited
        exitBtn.setBackground(Color.black);
        exitTxt.setForeground(Color.white);
    }//GEN-LAST:event_exitTxtMouseExited

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_headerMouseDragged

    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_headerMousePressed

    private void txtNumeroRCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroRCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroRCActionPerformed

    private void txtNumeroRCMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNumeroRCMousePressed
        if ("####-####".equals(txtNumeroRC.getText())) {
            txtNumeroRC.setText("");
            txtNumeroRC.setForeground(Color.black);
        }
        if (txtCedulaRC.getText().isEmpty()) {
            txtCedulaRC.setText("Número de cédula");
            txtCedulaRC.setForeground(Color.gray);
        }
        if (txtCorreoRC.getText().isEmpty()) {
            txtCorreoRC.setText("ejemplo@ejemplo.com");
            txtCorreoRC.setForeground(Color.gray);
        }
        if (txtNombreRC.getText().isEmpty()) {
            txtNombreRC.setText("Nombre completo");
            txtNombreRC.setForeground(Color.gray);
        }
        if (txtFechaNacimientoRC.getText().isEmpty()) {
            txtFechaNacimientoRC.setText("yyyy-MM-dd");
            txtFechaNacimientoRC.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtNumeroRCMousePressed

    private void txtFechaNacimientoRCMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFechaNacimientoRCMousePressed
        if ("yyyy-MM-dd".equals(txtFechaNacimientoRC.getText())) {
            txtFechaNacimientoRC.setText("");
            txtFechaNacimientoRC.setForeground(Color.black);
        }
        if (txtNumeroRC.getText().isEmpty()) {
            txtNumeroRC.setText("####-####");
            txtNumeroRC.setForeground(Color.gray);
        }
        if (txtNombreRC.getText().isEmpty()) {
            txtNombreRC.setText("Nombre completo");
            txtNombreRC.setForeground(Color.gray);
        }
        if (txtCorreoRC.getText().isEmpty()) {
            txtCorreoRC.setText("ejemplo@ejemplo.com");
            txtCorreoRC.setForeground(Color.gray);
        }
        if (txtCedulaRC.getText().isEmpty()) {
            txtCedulaRC.setText("Número de cédula");
            txtCedulaRC.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtFechaNacimientoRCMousePressed

    private void txtCorreoRCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoRCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoRCActionPerformed

    private void txtCorreoRCMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCorreoRCMousePressed
        if ("ejemplo@ejemplo.com".equals(txtCorreoRC.getText())) {
            txtCorreoRC.setText("");
            txtCorreoRC.setForeground(Color.black);
        }
        if (txtCedulaRC.getText().isEmpty()) {
            txtCedulaRC.setText("Número de cédula");
            txtCedulaRC.setForeground(Color.gray);
        }
        if (txtNombreRC.getText().isEmpty()) {
            txtNombreRC.setText("Nombre completo");
            txtNombreRC.setForeground(Color.gray);
        }
        if (txtFechaNacimientoRC.getText().isEmpty()) {
            txtFechaNacimientoRC.setText("yyyy-MM-dd");
            txtFechaNacimientoRC.setForeground(Color.gray);
        }
        if (txtNumeroRC.getText().isEmpty()) {
            txtNumeroRC.setText("####-####");
            txtNumeroRC.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtCorreoRCMousePressed

    private void txtNombreRCMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombreRCMousePressed
        if ("Nombre completo".equals(txtNombreRC.getText())) {
            txtNombreRC.setText("");
            txtNombreRC.setForeground(Color.black);
        }
        if (txtCedulaRC.getText().isEmpty()) {
            txtCedulaRC.setText("Número de cédula");
            txtCedulaRC.setForeground(Color.gray);
        }
        if (txtFechaNacimientoRC.getText().isEmpty()) {
            txtFechaNacimientoRC.setText("yyyy-MM-dd");
            txtFechaNacimientoRC.setForeground(Color.gray);
        }
        if (txtNumeroRC.getText().isEmpty()) {
            txtNumeroRC.setText("####-####");
            txtNumeroRC.setForeground(Color.gray);
        }
        if (txtCorreoRC.getText().isEmpty()) {
            txtCorreoRC.setText("ejemplo@ejemplo.com");
            txtCorreoRC.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtNombreRCMousePressed

    private void txtCedulaRCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedulaRCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedulaRCActionPerformed

    private void txtCedulaRCMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCedulaRCMousePressed
        if ("Número de cédula".equals(txtCedulaRC.getText())) {
            txtCedulaRC.setText("");
            txtCedulaRC.setForeground(Color.black);
        }
        if (txtNombreRC.getText().isEmpty()) {
            txtNombreRC.setText("Nombre completo");
            txtNombreRC.setForeground(Color.gray);
        }
        if (txtFechaNacimientoRC.getText().isEmpty()) {
            txtFechaNacimientoRC.setText("YYYY-MM-DD");
            txtFechaNacimientoRC.setForeground(Color.gray);
        }
        if (txtNumeroRC.getText().isEmpty()) {
            txtNumeroRC.setText("####-####");
            txtNumeroRC.setForeground(Color.gray);
        }
        if (txtCorreoRC.getText().isEmpty()) {
            txtCorreoRC.setText("ejemplo@ejemplo.com");
            txtCorreoRC.setForeground(Color.gray);
        }
        if (txtFechaNacimientoRC.getText().isEmpty()) {
            txtFechaNacimientoRC.setText("YYYY-MM-DD");
            txtFechaNacimientoRC.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtCedulaRCMousePressed

    private void registrarCitaBtnTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registrarCitaBtnTxtMouseExited
        registrarBtn.setBackground(new Color(0, 134, 190));
    }//GEN-LAST:event_registrarCitaBtnTxtMouseExited

    private void registrarCitaBtnTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registrarCitaBtnTxtMouseEntered
        registrarBtn.setBackground(new Color(0, 156, 223));
    }//GEN-LAST:event_registrarCitaBtnTxtMouseEntered

    private void registrarCitaBtnTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registrarCitaBtnTxtMouseClicked
        if (this.txtCedulaRC.getText().equals("Número de cédula") || this.txtCedulaRC.getText().isEmpty() || this.txtCorreoRC.getText().equals("ejemplo@ejemplo.com")
            || this.txtCorreoRC.getText().isEmpty() || this.txtFechaNacimientoRC.getText().equals("YYYY-MM-DD") || this.txtFechaNacimientoRC.getText().isEmpty()
            || this.txtNombreRC.getText().equals("Nombre completo") || this.txtNombreRC.getText().isEmpty() || this.txtNumeroRC.getText().equals("####-####") || this.txtNumeroRC.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe llenar todos los espacios", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else {

            //AGREGAR ACÁ EL CÓDIGO O MÉTODO PARA ALMACENAR LOS DATOS EN LA BASE DE DATOS//
        }
    }//GEN-LAST:event_registrarCitaBtnTxtMouseClicked

    private void txtFechaRCMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFechaRCMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaRCMousePressed

    private void txtFechaRCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFechaRCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFechaRCActionPerformed

    private void txtHoraRCMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtHoraRCMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHoraRCMousePressed

    private void txtHoraRCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtHoraRCActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtHoraRCActionPerformed

    private void lblVerificarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVerificarMouseClicked
        
    }//GEN-LAST:event_lblVerificarMouseClicked

    private void lblVerificarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVerificarMouseEntered
        registrarBtn.setBackground(new Color(0, 156, 223));
    }//GEN-LAST:event_lblVerificarMouseEntered

    private void lblVerificarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblVerificarMouseExited
        btnVerificar.setBackground(new Color(0, 134, 190));
    }//GEN-LAST:event_lblVerificarMouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmCitas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCitas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCitas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCitas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCitas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JPanel bg2;
    private javax.swing.JPanel btnVerificar;
    private javax.swing.JSeparator cedulaSeparador2;
    private javax.swing.JSeparator cedulaSeparador3;
    private javax.swing.JSeparator cedulaSeparador4;
    private javax.swing.JSeparator correoSeparador;
    private javax.swing.JPanel exitBtn;
    private javax.swing.JLabel exitTxt;
    private javax.swing.JSeparator fechaSeparador;
    private javax.swing.JPanel header;
    private javax.swing.JLabel lblCedula2;
    private javax.swing.JLabel lblCedula3;
    private javax.swing.JLabel lblCedula4;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JLabel lblVerificar;
    private javax.swing.JLabel logoP;
    private javax.swing.JLabel logoP1;
    private javax.swing.JPanel minimizeBtn;
    private javax.swing.JLabel minimizeTxt;
    private javax.swing.JSeparator nombreSeparador;
    private javax.swing.JSeparator numeroSeparado;
    private javax.swing.JPanel registrarBtn;
    private javax.swing.JLabel registrarCitaBtnTxt;
    private javax.swing.JLabel title;
    private javax.swing.JFormattedTextField txtCedulaRC;
    private javax.swing.JTextField txtCorreoRC;
    private javax.swing.JFormattedTextField txtFechaNacimientoRC;
    private javax.swing.JFormattedTextField txtFechaRC;
    private javax.swing.JFormattedTextField txtHoraRC;
    private javax.swing.JTextField txtNombreRC;
    private javax.swing.JFormattedTextField txtNumeroRC;
    // End of variables declaration//GEN-END:variables
}
