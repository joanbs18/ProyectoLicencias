/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Frames;

import Data.Conexiones.Conexion;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author josep
 */
public class FrmPrincipal extends javax.swing.JFrame {

    Conexion x;

    /**
     * Creates new form FrmInicial
     */
    public FrmPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public void comprobar() {
        if (x.connection != null) {
            this.conexion.setForeground(Color.BLUE);
            this.conexion.setText("Conectado");
        }
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
        logoG = new javax.swing.JLabel();
        logoname = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        exitBtn = new javax.swing.JPanel();
        exitTxt = new javax.swing.JLabel();
        conexion = new javax.swing.JLabel();
        logoP = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        conectarseBtn = new javax.swing.JPanel();
        conectarseBtnTxt = new javax.swing.JLabel();
        desconectarseBtn = new javax.swing.JPanel();
        desconectarseBtnTxt = new javax.swing.JLabel();
        tituloSisLicencias = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logoG.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/LOGO_PNG.png"))); // NOI18N
        bg.add(logoG, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 110, 240, 140));

        logoname.setBackground(new java.awt.Color(255, 255, 255));
        logoname.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        logoname.setForeground(new java.awt.Color(255, 255, 255));
        logoname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoname.setText("LICENCIAS");
        bg.add(logoname, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 260, 250, 20));

        header.setBackground(new java.awt.Color(255, 255, 255));
        header.setPreferredSize(new java.awt.Dimension(840, 40));

        exitBtn.setBackground(new java.awt.Color(255, 255, 255));
        exitBtn.setPreferredSize(new java.awt.Dimension(40, 40));

        exitTxt.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        exitTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitTxt.setText("X");
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, exitBtnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(exitTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        exitBtnLayout.setVerticalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, exitBtnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(exitTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        conexion.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        conexion.setForeground(new java.awt.Color(255, 0, 0));
        conexion.setText("Sin conexión");

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 442, Short.MAX_VALUE)
                .addComponent(conexion)
                .addContainerGap())
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(conexion, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(523, 523, 523))
        );

        bg.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, -1));

        logoP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/LOGO_PEQUEÑO.png"))); // NOI18N
        bg.add(logoP, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 100, -1, 70));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/city557.png"))); // NOI18N
        bg.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(574, 0, -1, -1));

        conectarseBtn.setBackground(new java.awt.Color(0, 134, 190));

        conectarseBtnTxt.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        conectarseBtnTxt.setForeground(new java.awt.Color(255, 255, 255));
        conectarseBtnTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        conectarseBtnTxt.setText("CONECTARSE");
        conectarseBtnTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        conectarseBtnTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                conectarseBtnTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                conectarseBtnTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                conectarseBtnTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout conectarseBtnLayout = new javax.swing.GroupLayout(conectarseBtn);
        conectarseBtn.setLayout(conectarseBtnLayout);
        conectarseBtnLayout.setHorizontalGroup(
            conectarseBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, conectarseBtnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(conectarseBtnTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        conectarseBtnLayout.setVerticalGroup(
            conectarseBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(conectarseBtnTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        bg.add(conectarseBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, -1));

        desconectarseBtn.setBackground(new java.awt.Color(0, 134, 190));

        desconectarseBtnTxt.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        desconectarseBtnTxt.setForeground(new java.awt.Color(255, 255, 255));
        desconectarseBtnTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        desconectarseBtnTxt.setText("DESCONECTARSE");
        desconectarseBtnTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        desconectarseBtnTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                desconectarseBtnTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                desconectarseBtnTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                desconectarseBtnTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout desconectarseBtnLayout = new javax.swing.GroupLayout(desconectarseBtn);
        desconectarseBtn.setLayout(desconectarseBtnLayout);
        desconectarseBtnLayout.setHorizontalGroup(
            desconectarseBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, desconectarseBtnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(desconectarseBtnTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        desconectarseBtnLayout.setVerticalGroup(
            desconectarseBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desconectarseBtnTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        bg.add(desconectarseBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, -1, -1));

        tituloSisLicencias.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        tituloSisLicencias.setText("SISTEMA LICENCIAS CODE");
        bg.add(tituloSisLicencias, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 120, -1, -1));

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

    private void exitTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseClicked
        System.exit(0);
    }//GEN-LAST:event_exitTxtMouseClicked

    private void exitTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseEntered
        exitBtn.setBackground(Color.red);
        exitTxt.setForeground(Color.white);
    }//GEN-LAST:event_exitTxtMouseEntered

    private void exitTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseExited
        exitBtn.setBackground(Color.white);
        exitTxt.setForeground(Color.black);
    }//GEN-LAST:event_exitTxtMouseExited

    private void conectarseBtnTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_conectarseBtnTxtMouseClicked
        try {
            x = new Conexion();
            x.conectar();
            this.comprobar();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "¡Oh! Algo falló en este proceso. \nInténtalo de nuevo.", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
        this.conectarseBtn.setVisible(false);
    }//GEN-LAST:event_conectarseBtnTxtMouseClicked

    private void conectarseBtnTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_conectarseBtnTxtMouseEntered
        conectarseBtn.setBackground(new Color(0, 156, 223));
    }//GEN-LAST:event_conectarseBtnTxtMouseEntered

    private void conectarseBtnTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_conectarseBtnTxtMouseExited
        conectarseBtn.setBackground(new Color(0, 134, 190));
    }//GEN-LAST:event_conectarseBtnTxtMouseExited

    private void desconectarseBtnTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_desconectarseBtnTxtMouseClicked
        x.desconectar();
        this.conectarseBtn.setVisible(true);
        this.conexion.setForeground(Color.red);
        this.conexion.setText("Sin conexión");
    }//GEN-LAST:event_desconectarseBtnTxtMouseClicked

    private void desconectarseBtnTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_desconectarseBtnTxtMouseEntered
        conectarseBtn.setBackground(new Color(0, 156, 223));
    }//GEN-LAST:event_desconectarseBtnTxtMouseEntered

    private void desconectarseBtnTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_desconectarseBtnTxtMouseExited
        conectarseBtn.setBackground(new Color(0, 134, 190));
    }//GEN-LAST:event_desconectarseBtnTxtMouseExited

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
            java.util.logging.Logger.getLogger(FrmPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPrincipal.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JPanel conectarseBtn;
    private javax.swing.JLabel conectarseBtnTxt;
    private javax.swing.JLabel conexion;
    private javax.swing.JPanel desconectarseBtn;
    private javax.swing.JLabel desconectarseBtnTxt;
    private javax.swing.JPanel exitBtn;
    private javax.swing.JLabel exitTxt;
    private javax.swing.JPanel header;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel logoG;
    private javax.swing.JLabel logoP;
    private javax.swing.JLabel logoname;
    private javax.swing.JLabel tituloSisLicencias;
    // End of variables declaration//GEN-END:variables
}
