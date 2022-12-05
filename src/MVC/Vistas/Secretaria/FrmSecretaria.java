/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package MVC.Vistas.Secretaria;

import MVC.Vistas.Oficiales.*;
import Frames.*;
import Data.Conexiones.Conexion;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author josep
 */
public class FrmSecretaria extends javax.swing.JFrame {

    Conexion x;

    /**
     * Creates new form FrmInicial
     */
    public FrmSecretaria() {
        initComponents();
        this.setLocationRelativeTo(null);
        if (!"Conectado".equals(this.conexion.getText())) {
            this.conexion.setText("Sin conexión");
        }
    }

    public void comprobar() {
        if (x.connection != null) {
            this.conexion.setForeground(Color.BLUE);
            this.conexion.setText("Conectado");
        }
    }

    public void errorNoConectado() {
        JOptionPane.showMessageDialog(null, "Para ingresar en este módulo debe tener conexión.\nVerifique que esté conectado a la base de datos.");
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
        logoname = new javax.swing.JLabel();
        logoG = new javax.swing.JLabel();
        imagen = new javax.swing.JLabel();
        logoP = new javax.swing.JLabel();
        tituloSisLicencias = new javax.swing.JLabel();
        header = new javax.swing.JPanel();
        minimizeBtn = new javax.swing.JPanel();
        minimizeTxt = new javax.swing.JLabel();
        exitBtn = new javax.swing.JPanel();
        exitTxt = new javax.swing.JLabel();
        conexion = new javax.swing.JLabel();
        crearBtn = new javax.swing.JPanel();
        crearBtnTxt = new javax.swing.JLabel();
        mostrarBtn = new javax.swing.JPanel();
        mostrarBtnTxt = new javax.swing.JLabel();
        actualizarBtn = new javax.swing.JPanel();
        actualizarBtnTxt = new javax.swing.JLabel();
        eliminarBtn = new javax.swing.JPanel();
        eliminarBtnTxt = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        bg.setBackground(new java.awt.Color(255, 255, 255));
        bg.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logoname.setBackground(new java.awt.Color(255, 255, 255));
        logoname.setFont(new java.awt.Font("Roboto Medium", 0, 18)); // NOI18N
        logoname.setForeground(new java.awt.Color(255, 255, 255));
        logoname.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoname.setText("LICENCIAS");
        bg.add(logoname, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 260, 250, 20));

        logoG.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        logoG.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/LOGO_PNG.png"))); // NOI18N
        bg.add(logoG, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 110, 240, 140));

        imagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/city557.png"))); // NOI18N
        bg.add(imagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(574, 0, -1, -1));

        logoP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/LOGO_PEQUEÑO.png"))); // NOI18N
        bg.add(logoP, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, 70));

        tituloSisLicencias.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        tituloSisLicencias.setText("ADMINISTRACIÓN SECRETARIAS");
        bg.add(tituloSisLicencias, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, -1, -1));

        header.setBackground(new java.awt.Color(255, 255, 255));
        header.setPreferredSize(new java.awt.Dimension(840, 40));

        minimizeBtn.setBackground(new java.awt.Color(255, 255, 255));
        minimizeBtn.setPreferredSize(new java.awt.Dimension(40, 40));

        minimizeTxt.setBackground(new java.awt.Color(255, 255, 255));
        minimizeTxt.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
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
                .addGroup(minimizeBtnLayout.createSequentialGroup()
                    .addComponent(minimizeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 12, Short.MAX_VALUE)))
        );
        minimizeBtnLayout.setVerticalGroup(
            minimizeBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(minimizeBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(minimizeBtnLayout.createSequentialGroup()
                    .addGap(1, 1, 1)
                    .addComponent(minimizeTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

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
            .addComponent(exitTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        exitBtnLayout.setVerticalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(exitBtnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(exitTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        conexion.setFont(new java.awt.Font("Roboto", 0, 14)); // NOI18N
        conexion.setForeground(new java.awt.Color(255, 0, 0));
        conexion.setToolTipText("");

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(minimizeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 369, Short.MAX_VALUE)
                .addComponent(conexion, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(conexion, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(minimizeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(523, 523, 523))
        );

        bg.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, -1));

        crearBtn.setBackground(new java.awt.Color(0, 134, 190));

        crearBtnTxt.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        crearBtnTxt.setForeground(new java.awt.Color(255, 255, 255));
        crearBtnTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        crearBtnTxt.setText("CREAR");
        crearBtnTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        crearBtnTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                crearBtnTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                crearBtnTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                crearBtnTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout crearBtnLayout = new javax.swing.GroupLayout(crearBtn);
        crearBtn.setLayout(crearBtnLayout);
        crearBtnLayout.setHorizontalGroup(
            crearBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(crearBtnTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
        );
        crearBtnLayout.setVerticalGroup(
            crearBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(crearBtnLayout.createSequentialGroup()
                .addComponent(crearBtnTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );

        bg.add(crearBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 180, -1, -1));

        mostrarBtn.setBackground(new java.awt.Color(0, 134, 190));

        mostrarBtnTxt.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        mostrarBtnTxt.setForeground(new java.awt.Color(255, 255, 255));
        mostrarBtnTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mostrarBtnTxt.setText("MOSTRAR");
        mostrarBtnTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        mostrarBtnTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                mostrarBtnTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                mostrarBtnTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                mostrarBtnTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout mostrarBtnLayout = new javax.swing.GroupLayout(mostrarBtn);
        mostrarBtn.setLayout(mostrarBtnLayout);
        mostrarBtnLayout.setHorizontalGroup(
            mostrarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(mostrarBtnTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
        );
        mostrarBtnLayout.setVerticalGroup(
            mostrarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(mostrarBtnLayout.createSequentialGroup()
                .addComponent(mostrarBtnTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );

        bg.add(mostrarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 280, -1, -1));

        actualizarBtn.setBackground(new java.awt.Color(0, 134, 190));

        actualizarBtnTxt.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        actualizarBtnTxt.setForeground(new java.awt.Color(255, 255, 255));
        actualizarBtnTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        actualizarBtnTxt.setText("ACTUALIZAR");
        actualizarBtnTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        actualizarBtnTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                actualizarBtnTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                actualizarBtnTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                actualizarBtnTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout actualizarBtnLayout = new javax.swing.GroupLayout(actualizarBtn);
        actualizarBtn.setLayout(actualizarBtnLayout);
        actualizarBtnLayout.setHorizontalGroup(
            actualizarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(actualizarBtnTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
        );
        actualizarBtnLayout.setVerticalGroup(
            actualizarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(actualizarBtnLayout.createSequentialGroup()
                .addComponent(actualizarBtnTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );

        bg.add(actualizarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 380, -1, -1));

        eliminarBtn.setBackground(new java.awt.Color(0, 134, 190));

        eliminarBtnTxt.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        eliminarBtnTxt.setForeground(new java.awt.Color(255, 255, 255));
        eliminarBtnTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        eliminarBtnTxt.setText("ELIMINAR");
        eliminarBtnTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        eliminarBtnTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                eliminarBtnTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                eliminarBtnTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                eliminarBtnTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout eliminarBtnLayout = new javax.swing.GroupLayout(eliminarBtn);
        eliminarBtn.setLayout(eliminarBtnLayout);
        eliminarBtnLayout.setHorizontalGroup(
            eliminarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(eliminarBtnTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
        );
        eliminarBtnLayout.setVerticalGroup(
            eliminarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(eliminarBtnLayout.createSequentialGroup()
                .addComponent(eliminarBtnTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );

        bg.add(eliminarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 480, -1, -1));

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

    private void crearBtnTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearBtnTxtMouseExited
        crearBtn.setBackground(new Color(0, 134, 190));
    }//GEN-LAST:event_crearBtnTxtMouseExited

    private void crearBtnTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearBtnTxtMouseEntered
        crearBtn.setBackground(new Color(0, 156, 223));
    }//GEN-LAST:event_crearBtnTxtMouseEntered

    private void crearBtnTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_crearBtnTxtMouseClicked
        if ("Sin conexión".equals(conexion.getText())) {
            errorNoConectado();
        } else {

        }
    }//GEN-LAST:event_crearBtnTxtMouseClicked

    private void exitTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseExited
        exitBtn.setBackground(Color.white);
        exitTxt.setForeground(Color.black);
    }//GEN-LAST:event_exitTxtMouseExited

    private void exitTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseEntered
        exitBtn.setBackground(Color.red);
        exitTxt.setForeground(Color.white);
    }//GEN-LAST:event_exitTxtMouseEntered

    private void exitTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitTxtMouseClicked
        this.dispose();
    }//GEN-LAST:event_exitTxtMouseClicked

    private void minimizeTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeTxtMouseClicked
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_minimizeTxtMouseClicked

    private void minimizeTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeTxtMouseEntered
        minimizeBtn.setBackground(Color.orange);
        minimizeTxt.setForeground(Color.black);
    }//GEN-LAST:event_minimizeTxtMouseEntered

    private void minimizeTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeTxtMouseExited
        minimizeBtn.setBackground(Color.white);
        minimizeTxt.setForeground(Color.black);
    }//GEN-LAST:event_minimizeTxtMouseExited

    private void mostrarBtnTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mostrarBtnTxtMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_mostrarBtnTxtMouseClicked

    private void mostrarBtnTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mostrarBtnTxtMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_mostrarBtnTxtMouseEntered

    private void mostrarBtnTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mostrarBtnTxtMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_mostrarBtnTxtMouseExited

    private void actualizarBtnTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actualizarBtnTxtMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_actualizarBtnTxtMouseClicked

    private void actualizarBtnTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actualizarBtnTxtMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_actualizarBtnTxtMouseEntered

    private void actualizarBtnTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_actualizarBtnTxtMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_actualizarBtnTxtMouseExited

    private void eliminarBtnTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminarBtnTxtMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_eliminarBtnTxtMouseClicked

    private void eliminarBtnTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminarBtnTxtMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_eliminarBtnTxtMouseEntered

    private void eliminarBtnTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_eliminarBtnTxtMouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_eliminarBtnTxtMouseExited

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
            java.util.logging.Logger.getLogger(FrmSecretaria.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmSecretaria.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmSecretaria.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmSecretaria.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
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
                new FrmSecretaria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel actualizarBtn;
    private javax.swing.JLabel actualizarBtnTxt;
    private javax.swing.JPanel bg;
    private javax.swing.JLabel conexion;
    private javax.swing.JPanel crearBtn;
    private javax.swing.JLabel crearBtnTxt;
    private javax.swing.JPanel eliminarBtn;
    private javax.swing.JLabel eliminarBtnTxt;
    private javax.swing.JPanel exitBtn;
    private javax.swing.JLabel exitTxt;
    private javax.swing.JPanel header;
    private javax.swing.JLabel imagen;
    private javax.swing.JLabel logoG;
    private javax.swing.JLabel logoP;
    private javax.swing.JLabel logoname;
    private javax.swing.JPanel minimizeBtn;
    private javax.swing.JLabel minimizeTxt;
    private javax.swing.JPanel mostrarBtn;
    private javax.swing.JLabel mostrarBtnTxt;
    private javax.swing.JLabel tituloSisLicencias;
    // End of variables declaration//GEN-END:variables
}
