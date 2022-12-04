package MVC.Vistas.Oficiales;

import MVC.Vistas.Secretaria.*;
import MVC.Vistas.Oficiales.*;
import java.awt.Color;

/**
 *
 * @author joans
 */
public class FrmRegistroOficiales2 extends javax.swing.JFrame {

    int xMouse, yMouse;

    public FrmRegistroOficiales2() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bg = new javax.swing.JPanel();
        logoP = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        minimizeBtn = new javax.swing.JPanel();
        minimizeTxt = new javax.swing.JLabel();
        exitBtn = new javax.swing.JPanel();
        exitTxt = new javax.swing.JLabel();
        registrarseBtn = new javax.swing.JPanel();
        registrarseBtnTxt = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        nombreSeparador = new javax.swing.JSeparator();
        passLabel = new javax.swing.JLabel();
        passTxt = new javax.swing.JPasswordField();
        jSeparator2 = new javax.swing.JSeparator();
        lblNombre = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocationByPlatform(true);
        setUndecorated(true);
        setResizable(false);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logoP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/LOGO_PEQUEÑO.png"))); // NOI18N
        bg.add(logoP, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 40, 60, 60));

        title.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        title.setText("REGISTRO OFICIALES");
        bg.add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, -1, -1));

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

        registrarseBtn.setBackground(new java.awt.Color(0, 134, 190));

        registrarseBtnTxt.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        registrarseBtnTxt.setForeground(new java.awt.Color(255, 255, 255));
        registrarseBtnTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        registrarseBtnTxt.setText("REGISTRARSE");
        registrarseBtnTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        registrarseBtnTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registrarseBtnTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                registrarseBtnTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                registrarseBtnTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout registrarseBtnLayout = new javax.swing.GroupLayout(registrarseBtn);
        registrarseBtn.setLayout(registrarseBtnLayout);
        registrarseBtnLayout.setHorizontalGroup(
            registrarseBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(registrarseBtnTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
        );
        registrarseBtnLayout.setVerticalGroup(
            registrarseBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(registrarseBtnTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        bg.add(registrarseBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 360, 310, 40));

        txtNombre.setFont(new java.awt.Font("Roboto", 0, 12)); // NOI18N
        txtNombre.setForeground(new java.awt.Color(204, 204, 204));
        txtNombre.setText("Nombre usuario");
        txtNombre.setBorder(null);
        txtNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtNombreMousePressed(evt);
            }
        });
        bg.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, 310, 20));

        nombreSeparador.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(nombreSeparador, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 310, 30));

        passLabel.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        passLabel.setText("CONTRASEÑA");
        bg.add(passLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 240, -1, -1));

        passTxt.setForeground(new java.awt.Color(204, 204, 204));
        passTxt.setText("********");
        passTxt.setBorder(null);
        passTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                passTxtMousePressed(evt);
            }
        });
        bg.add(passTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 270, 310, 30));

        jSeparator2.setForeground(new java.awt.Color(0, 0, 0));
        bg.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, 310, 20));

        lblNombre.setFont(new java.awt.Font("Roboto Light", 1, 14)); // NOI18N
        lblNombre.setText("NOMBRE USUARIO");
        bg.add(lblNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 130, -1, -1));

        jScrollPane1.setBorder(null);
        jScrollPane1.setFont(new java.awt.Font("Roboto", 0, 18)); // NOI18N

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        jTextArea1.setForeground(new java.awt.Color(102, 102, 102));
        jTextArea1.setRows(5);
        jTextArea1.setText("Para finalizar con su proceso de registro en el\nsistema de Licencias Code, por favor, ingrese\nsu nombre de usuario y contraseña que utilizará\npara ingresar en el perfil de oficiales.\n\nPor su seguridad, le sugerimos que esta \ncontraseña sea lo más segura posible. Evite \nnombres sencillos o fáciles de adivinar. \n\nAl dar click en el botón de \"REGISTRARSE\" solo\npodrá cambiar su contraseña, además que solo\npodrá editarla desde el apartado de seguridad. \nPara ello, deberá ingresar su nombre de usuario,\nen dado caso que no recuerde su nombre de \nusuario, deberá comunicarse con nuestros asesores.\n");
        jScrollPane1.setViewportView(jTextArea1);

        bg.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 120, 360, 300));

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

    private void txtNombreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombreMousePressed
        if ("Nombre usuario".equals(txtNombre.getText())) {
            txtNombre.setText("");
            txtNombre.setForeground(Color.black);
        }
        if (String.valueOf(passTxt.getPassword()).isEmpty()) {
            passTxt.setText("********");
            passTxt.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtNombreMousePressed

    private void registrarseBtnTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registrarseBtnTxtMouseExited
        registrarseBtn.setBackground(new Color(0, 134, 190));
    }//GEN-LAST:event_registrarseBtnTxtMouseExited

    private void registrarseBtnTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registrarseBtnTxtMouseEntered
        registrarseBtn.setBackground(new Color(0, 156, 223));
    }//GEN-LAST:event_registrarseBtnTxtMouseEntered

    private void registrarseBtnTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registrarseBtnTxtMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_registrarseBtnTxtMouseClicked

    private void headerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_headerMousePressed

    private void headerMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_headerMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x - xMouse, y - yMouse);
    }//GEN-LAST:event_headerMouseDragged

    private void exitTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseExited
        exitBtn.setBackground(Color.black);
        exitTxt.setForeground(Color.white);
    }//GEN-LAST:event_exitTxtMouseExited

    private void exitTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseEntered
        exitBtn.setBackground(Color.red);
        exitTxt.setForeground(Color.black);
    }//GEN-LAST:event_exitTxtMouseEntered

    private void exitTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseClicked
        this.dispose();
    }//GEN-LAST:event_exitTxtMouseClicked

    private void minimizeTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeTxtMouseExited
        minimizeBtn.setBackground(Color.black);
        minimizeTxt.setForeground(Color.white);
    }//GEN-LAST:event_minimizeTxtMouseExited

    private void minimizeTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeTxtMouseEntered
        minimizeBtn.setBackground(Color.orange);
        minimizeTxt.setForeground(Color.black);
    }//GEN-LAST:event_minimizeTxtMouseEntered

    private void minimizeTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeTxtMouseClicked
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_minimizeTxtMouseClicked

    private void passTxtMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_passTxtMousePressed
        if (String.valueOf(passTxt.getPassword()).equals("********")) {
            passTxt.setText("");
            passTxt.setForeground(Color.black);
        }
        if (txtNombre.getText().isEmpty()) {
            txtNombre.setText("Nombre usuario");
            txtNombre.setForeground(Color.gray);
        }
    }//GEN-LAST:event_passTxtMousePressed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
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
                new FrmRegistroOficiales2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JPanel exitBtn;
    private javax.swing.JLabel exitTxt;
    private javax.swing.JPanel header;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JLabel logoP;
    private javax.swing.JPanel minimizeBtn;
    private javax.swing.JLabel minimizeTxt;
    private javax.swing.JSeparator nombreSeparador;
    private javax.swing.JLabel passLabel;
    private javax.swing.JPasswordField passTxt;
    private javax.swing.JPanel registrarseBtn;
    private javax.swing.JLabel registrarseBtnTxt;
    private javax.swing.JLabel title;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
