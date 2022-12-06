package MVC.Vistas.Usuarios;

import Data.Conexiones.Conexion;
import MVC.Vistas.Secretaria.*;
import MVC.Vistas.Oficiales.*;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author joans
 */
public class FrmRegistroUsuarios extends javax.swing.JFrame {

    int xMouse, yMouse;
 Conexion x;
    public FrmRegistroUsuarios() {
        initComponents();
        this.setLocationRelativeTo(null);
         try {
            x = new Conexion();
            x.conectar();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "¡Oh! Algo falló en este proceso. \nInténtalo de nuevo.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        title = new javax.swing.JLabel();
        logoname = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        minimizeBtn = new javax.swing.JPanel();
        minimizeTxt = new javax.swing.JLabel();
        exitBtn = new javax.swing.JPanel();
        exitTxt = new javax.swing.JLabel();
        continuarBtn = new javax.swing.JPanel();
        continuarBtnTxt = new javax.swing.JLabel();
        lblCedula = new javax.swing.JLabel();
        txtCedula = new javax.swing.JFormattedTextField();
        cedulaSeparador = new javax.swing.JSeparator();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        nombreSeparador = new javax.swing.JSeparator();
        lblCorreo = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        correoSeparador = new javax.swing.JSeparator();
        lblFecha = new javax.swing.JLabel();
        txtFecha = new javax.swing.JFormattedTextField();
        fechaSeparador = new javax.swing.JSeparator();
        lblNumero = new javax.swing.JLabel();
        txtNumero = new javax.swing.JFormattedTextField();
        numeroSeparado = new javax.swing.JSeparator();
        logoP = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        title.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        title.setText("REGISTRO USUARIOS");
        bg.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

        logoname.setBackground(new java.awt.Color(255, 255, 255));
        logoname.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        logoname.setForeground(new java.awt.Color(255, 255, 255));
        logoname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoname.setText("LICENCIAS");
        bg.add(logoname, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 240, 250, 20));

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
            .addGap(0, 41, Short.MAX_VALUE)
            .addGroup(minimizeBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(minimizeBtnLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(minimizeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        minimizeBtnLayout.setVerticalGroup(
            minimizeBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(minimizeBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(minimizeBtnLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(minimizeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        exitBtn.setBackground(new java.awt.Color(0, 0, 0));

        exitTxt.setBackground(new java.awt.Color(0, 0, 0));
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
            .addComponent(exitTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        exitBtnLayout.setVerticalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(minimizeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 753, Short.MAX_VALUE))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(headerLayout.createSequentialGroup()
                        .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(minimizeBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        bg.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 40));

        continuarBtn.setBackground(new java.awt.Color(0, 134, 190));

        continuarBtnTxt.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        continuarBtnTxt.setForeground(new java.awt.Color(255, 255, 255));
        continuarBtnTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        continuarBtnTxt.setText("CONTINUAR");
        continuarBtnTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        continuarBtnTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                continuarBtnTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                continuarBtnTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                continuarBtnTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout continuarBtnLayout = new javax.swing.GroupLayout(continuarBtn);
        continuarBtn.setLayout(continuarBtnLayout);
        continuarBtnLayout.setHorizontalGroup(
            continuarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(continuarBtnTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
        );
        continuarBtnLayout.setVerticalGroup(
            continuarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(continuarBtnTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        bg.add(continuarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 370, 310, 40));

        lblCedula.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        lblCedula.setText("NÚMERO DE CÉDULA");
        bg.add(lblCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, -1, -1));

        txtCedula.setBorder(null);
        txtCedula.setForeground(new java.awt.Color(204, 204, 204));
        txtCedula.setText("Número de cédula");
        txtCedula.setToolTipText("");
        txtCedula.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtCedula.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtCedulaMousePressed(evt);
            }
        });
        txtCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedulaActionPerformed(evt);
            }
        });
        bg.add(txtCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 310, 20));

        cedulaSeparador.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(cedulaSeparador, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 310, 20));

        lblNombre.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        lblNombre.setText("NOMBRE COMPLETO");
        bg.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        txtNombre.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(204, 204, 204));
        txtNombre.setText("Nombre completo");
        txtNombre.setBorder(null);
        txtNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtNombreMousePressed(evt);
            }
        });
        bg.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, 310, 20));

        nombreSeparador.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(nombreSeparador, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, 310, 30));

        lblCorreo.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        lblCorreo.setText("CORREO ELECTRÓNICO");
        bg.add(lblCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, -1, 20));

        txtCorreo.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtCorreo.setForeground(new java.awt.Color(204, 204, 204));
        txtCorreo.setText("ejemplo@ejemplo.com");
        txtCorreo.setBorder(null);
        txtCorreo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtCorreoMousePressed(evt);
            }
        });
        txtCorreo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorreoActionPerformed(evt);
            }
        });
        bg.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 380, 310, 20));

        correoSeparador.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(correoSeparador, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 310, 30));

        lblFecha.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        lblFecha.setText("FECHA DE NACIMIENTO");
        bg.add(lblFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 120, -1, -1));

        txtFecha.setBorder(null);
        txtFecha.setForeground(new java.awt.Color(204, 204, 204));
        txtFecha.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("yyyy-MM-dd"))));
        txtFecha.setText("yyyy-MM-dd");
        txtFecha.setToolTipText("");
        txtFecha.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtFecha.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtFechaMousePressed(evt);
            }
        });
        bg.add(txtFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 150, 310, 20));

        fechaSeparador.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(fechaSeparador, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 170, 310, 20));

        lblNumero.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        lblNumero.setText("NÚMERO TELEFÓNICO");
        bg.add(lblNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 230, -1, -1));

        txtNumero.setBorder(null);
        txtNumero.setForeground(new java.awt.Color(204, 204, 204));
        txtNumero.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));
        txtNumero.setText("####-####");
        txtNumero.setToolTipText("");
        txtNumero.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtNumero.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtNumeroMousePressed(evt);
            }
        });
        txtNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroActionPerformed(evt);
            }
        });
        bg.add(txtNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 260, 310, 20));

        numeroSeparado.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(numeroSeparado, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 280, 310, 20));

        logoP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/LOGO_PEQUEÑO.png"))); // NOI18N
        bg.add(logoP, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 50, 60, 44));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, 765, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_headerMousePressed

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_headerMouseDragged

    private void exitTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseClicked
        this.dispose();
    }//GEN-LAST:event_exitTxtMouseClicked

    private void exitTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseEntered
        exitBtn.setBackground(Color.red);
        exitTxt.setForeground(Color.black);
    }//GEN-LAST:event_exitTxtMouseEntered

    private void exitTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseExited
        exitBtn.setBackground(Color.black);
        exitTxt.setForeground(Color.white);
    }//GEN-LAST:event_exitTxtMouseExited

    private void continuarBtnTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_continuarBtnTxtMouseClicked
        if (this.txtCedula.getText().equals("Número de cédula") || this.txtCedula.getText().isEmpty() || this.txtCorreo.getText().equals("ejemplo@ejemplo.com")
                || this.txtCorreo.getText().isEmpty() || this.txtFecha.getText().equals("YYYY-MM-DD") || this.txtFecha.getText().isEmpty()
                || this.txtNombre.getText().equals("Nombre completo") || this.txtNombre.getText().isEmpty() || this.txtNumero.getText().equals("####-####") || this.txtNumero.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Debe llenar todos los espacios", "ERROR", JOptionPane.ERROR_MESSAGE);
        } else {
            String sql="INSERT INTO persona (Cedula, NombreCompleto, FechaNacimiento, Email, Telefono) VALUES (?, ?, ?, ?, ?)";
            try {
                x.prepareQuery(sql);
                x.addParameter(1, txtCedula.getText());
                x.addParameter(2, txtNombre.getText());
                x.addParameter(3, txtFecha.getText());
                x.addParameter(4, txtCorreo.getText());
                x.addParameter(5, txtNumero.getText());
                x.executeUpdate();
            } catch (Exception ex) {
                Logger.getLogger(FrmRegistroUsuarios.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            FrmRegistroUsuarios2 frm = new FrmRegistroUsuarios2();
            
            frm.setVisible(true);
            //AGREGAR ACÁ EL CÓDIGO O MÉTODO PARA ALMACENAR LOS DATOS EN LA BASE DE DATOS//
        }

    }//GEN-LAST:event_continuarBtnTxtMouseClicked

    private void continuarBtnTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_continuarBtnTxtMouseEntered
        continuarBtn.setBackground(new Color(0, 156, 223));
    }//GEN-LAST:event_continuarBtnTxtMouseEntered

    private void continuarBtnTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_continuarBtnTxtMouseExited
        continuarBtn.setBackground(new Color(0, 134, 190));
    }//GEN-LAST:event_continuarBtnTxtMouseExited

    private void txtCorreoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorreoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorreoActionPerformed

    private void txtNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroActionPerformed

    private void txtCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedulaActionPerformed

    private void txtCedulaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCedulaMousePressed
        if ("Número de cédula".equals(txtCedula.getText())) {
            txtCedula.setText("");
            txtCedula.setForeground(Color.black);
        }
        if (txtNombre.getText().isEmpty()) {
            txtNombre.setText("Nombre completo");
            txtNombre.setForeground(Color.gray);
        }
        if (txtFecha.getText().isEmpty()) {
            txtFecha.setText("YYYY-MM-DD");
            txtFecha.setForeground(Color.gray);
        }
        if (txtNumero.getText().isEmpty()) {
            txtNumero.setText("####-####");
            txtNumero.setForeground(Color.gray);
        }
        if (txtCorreo.getText().isEmpty()) {
            txtCorreo.setText("ejemplo@ejemplo.com");
            txtCorreo.setForeground(Color.gray);
        }
        if (txtFecha.getText().isEmpty()) {
            txtFecha.setText("YYYY-MM-DD");
            txtFecha.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtCedulaMousePressed

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

    private void txtNombreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombreMousePressed
        if ("Nombre completo".equals(txtNombre.getText())) {
            txtNombre.setText("");
            txtNombre.setForeground(Color.black);
        }
        if (txtCedula.getText().isEmpty()) {
            txtCedula.setText("Número de cédula");
            txtCedula.setForeground(Color.gray);
        }
        if (txtFecha.getText().isEmpty()) {
            txtFecha.setText("yyyy-MM-dd");
            txtFecha.setForeground(Color.gray);
        }
        if (txtNumero.getText().isEmpty()) {
            txtNumero.setText("####-####");
            txtNumero.setForeground(Color.gray);
        }
        if (txtCorreo.getText().isEmpty()) {
            txtCorreo.setText("ejemplo@ejemplo.com");
            txtCorreo.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtNombreMousePressed

    private void txtCorreoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCorreoMousePressed
        if ("ejemplo@ejemplo.com".equals(txtCorreo.getText())) {
            txtCorreo.setText("");
            txtCorreo.setForeground(Color.black);
        }
        if (txtCedula.getText().isEmpty()) {
            txtCedula.setText("Número de cédula");
            txtCedula.setForeground(Color.gray);
        }
        if (txtNombre.getText().isEmpty()) {
            txtNombre.setText("Nombre completo");
            txtNombre.setForeground(Color.gray);
        }
        if (txtFecha.getText().isEmpty()) {
            txtFecha.setText("yyyy-MM-dd");
            txtFecha.setForeground(Color.gray);
        }
        if (txtNumero.getText().isEmpty()) {
            txtNumero.setText("####-####");
            txtNumero.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtCorreoMousePressed

    private void txtFechaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtFechaMousePressed
        if ("yyyy-MM-dd".equals(txtFecha.getText())) {
            txtFecha.setText("");
            txtFecha.setForeground(Color.black);
        }
        if (txtNumero.getText().isEmpty()) {
            txtNumero.setText("####-####");
            txtNumero.setForeground(Color.gray);
        }
        if (txtNombre.getText().isEmpty()) {
            txtNombre.setText("Nombre completo");
            txtNombre.setForeground(Color.gray);
        }
        if (txtCorreo.getText().isEmpty()) {
            txtCorreo.setText("ejemplo@ejemplo.com");
            txtCorreo.setForeground(Color.gray);
        }
        if (txtCedula.getText().isEmpty()) {
            txtCedula.setText("Número de cédula");
            txtCedula.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtFechaMousePressed

    private void txtNumeroMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNumeroMousePressed
        if ("####-####".equals(txtNumero.getText())) {
            txtNumero.setText("");
            txtNumero.setForeground(Color.black);
        }
        if (txtCedula.getText().isEmpty()) {
            txtCedula.setText("Número de cédula");
            txtCedula.setForeground(Color.gray);
        }
        if (txtCorreo.getText().isEmpty()) {
            txtCorreo.setText("ejemplo@ejemplo.com");
            txtCorreo.setForeground(Color.gray);
        }
        if (txtNombre.getText().isEmpty()) {
            txtNombre.setText("Nombre completo");
            txtNombre.setForeground(Color.gray);
        }
        if (txtFecha.getText().isEmpty()) {
            txtFecha.setText("yyyy-MM-dd");
            txtFecha.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtNumeroMousePressed

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
            java.util.logging.Logger.getLogger(FrmRegistroUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmRegistroUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmRegistroUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmRegistroUsuarios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmRegistroUsuarios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JSeparator cedulaSeparador;
    private javax.swing.JPanel continuarBtn;
    private javax.swing.JLabel continuarBtnTxt;
    private javax.swing.JSeparator correoSeparador;
    private javax.swing.JPanel exitBtn;
    private javax.swing.JLabel exitTxt;
    private javax.swing.JSeparator fechaSeparador;
    private javax.swing.JPanel header;
    private javax.swing.JLabel lblCedula;
    private javax.swing.JLabel lblCorreo;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel lblNumero;
    private javax.swing.JLabel logoP;
    private javax.swing.JLabel logoname;
    private javax.swing.JPanel minimizeBtn;
    private javax.swing.JLabel minimizeTxt;
    private javax.swing.JSeparator nombreSeparador;
    private javax.swing.JSeparator numeroSeparado;
    private javax.swing.JLabel title;
    private javax.swing.JFormattedTextField txtCedula;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JFormattedTextField txtFecha;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JFormattedTextField txtNumero;
    // End of variables declaration//GEN-END:variables
}
