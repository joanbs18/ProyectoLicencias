/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Frames;

import Data.Conexiones.Conexion;
import MVC.Vistas.Oficiales.FrmOficiales;
import MVC.Vistas.Secretaria.FrmSecretaria;
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
        try {
            x = new Conexion();
            x.conectar();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "¡Oh! Algo falló en este proceso. \nInténtalo de nuevo.", "ERROR", JOptionPane.ERROR_MESSAGE);
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
        minimizarBtn = new javax.swing.JPanel();
        minimizarBtnTxt = new javax.swing.JLabel();
        exitBtn = new javax.swing.JPanel();
        exitTxt = new javax.swing.JLabel();
        opcionesBtn = new javax.swing.JPanel();
        opcionesBtnTxt = new javax.swing.JLabel();
        secretariasBtn = new javax.swing.JPanel();
        secretariasBtnTxt = new javax.swing.JLabel();
        clientesBtn = new javax.swing.JPanel();
        clientesBtnTxt = new javax.swing.JLabel();
        citasBtn = new javax.swing.JPanel();
        citasBtnTxt = new javax.swing.JLabel();
        oficialesBtn = new javax.swing.JPanel();
        oficialesBtnTxt = new javax.swing.JLabel();

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
        bg.add(imagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 0, 260, -1));

        logoP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/images/LOGO_PEQUEÑO.png"))); // NOI18N
        bg.add(logoP, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 70, -1, 70));

        tituloSisLicencias.setFont(new java.awt.Font("Roboto Black", 1, 24)); // NOI18N
        tituloSisLicencias.setText("SISTEMA LICENCIAS CODE");
        bg.add(tituloSisLicencias, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 90, -1, -1));

        header.setBackground(new java.awt.Color(255, 255, 255));
        header.setPreferredSize(new java.awt.Dimension(840, 40));

        minimizarBtn.setBackground(new java.awt.Color(255, 255, 255));
        minimizarBtn.setPreferredSize(new java.awt.Dimension(40, 40));

        minimizarBtnTxt.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        minimizarBtnTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minimizarBtnTxt.setText("-");
        minimizarBtnTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        minimizarBtnTxt.setPreferredSize(new java.awt.Dimension(40, 40));
        minimizarBtnTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizarBtnTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                minimizarBtnTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                minimizarBtnTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout minimizarBtnLayout = new javax.swing.GroupLayout(minimizarBtn);
        minimizarBtn.setLayout(minimizarBtnLayout);
        minimizarBtnLayout.setHorizontalGroup(
            minimizarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(minimizarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(minimizarBtnLayout.createSequentialGroup()
                    .addComponent(minimizarBtnTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        minimizarBtnLayout.setVerticalGroup(
            minimizarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addGroup(minimizarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(minimizarBtnTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE))
        );

        exitBtn.setBackground(new java.awt.Color(255, 255, 255));
        exitBtn.setPreferredSize(new java.awt.Dimension(40, 40));

        exitTxt.setFont(new java.awt.Font("Roboto Light", 0, 24)); // NOI18N
        exitTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exitTxt.setText("x");
        exitTxt.setToolTipText("");
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
                .addComponent(exitTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );
        exitBtnLayout.setVerticalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(exitBtnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(exitTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        opcionesBtn.setBackground(new java.awt.Color(0, 0, 0));

        opcionesBtnTxt.setBackground(new java.awt.Color(0, 0, 0));
        opcionesBtnTxt.setFont(new java.awt.Font("Roboto Black", 0, 14)); // NOI18N
        opcionesBtnTxt.setForeground(new java.awt.Color(255, 255, 255));
        opcionesBtnTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        opcionesBtnTxt.setText("OPCIONES");

        javax.swing.GroupLayout opcionesBtnLayout = new javax.swing.GroupLayout(opcionesBtn);
        opcionesBtn.setLayout(opcionesBtnLayout);
        opcionesBtnLayout.setHorizontalGroup(
            opcionesBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(opcionesBtnTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 136, Short.MAX_VALUE)
        );
        opcionesBtnLayout.setVerticalGroup(
            opcionesBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(opcionesBtnTxt, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout headerLayout = new javax.swing.GroupLayout(header);
        header.setLayout(headerLayout);
        headerLayout.setHorizontalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerLayout.createSequentialGroup()
                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(minimizarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 269, Short.MAX_VALUE)
                .addComponent(opcionesBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(79, 79, 79))
        );
        headerLayout.setVerticalGroup(
            headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(headerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(opcionesBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(minimizarBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(523, 523, 523))
        );

        bg.add(header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, -1));

        secretariasBtn.setBackground(new java.awt.Color(0, 134, 190));

        secretariasBtnTxt.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        secretariasBtnTxt.setForeground(new java.awt.Color(255, 255, 255));
        secretariasBtnTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        secretariasBtnTxt.setText("SECRETARIAS");
        secretariasBtnTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        secretariasBtnTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                secretariasBtnTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                secretariasBtnTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                secretariasBtnTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout secretariasBtnLayout = new javax.swing.GroupLayout(secretariasBtn);
        secretariasBtn.setLayout(secretariasBtnLayout);
        secretariasBtnLayout.setHorizontalGroup(
            secretariasBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(secretariasBtnTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
        );
        secretariasBtnLayout.setVerticalGroup(
            secretariasBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(secretariasBtnLayout.createSequentialGroup()
                .addComponent(secretariasBtnTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        bg.add(secretariasBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 430, 70));

        clientesBtn.setBackground(new java.awt.Color(0, 134, 190));

        clientesBtnTxt.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        clientesBtnTxt.setForeground(new java.awt.Color(255, 255, 255));
        clientesBtnTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        clientesBtnTxt.setText("CLIENTES");
        clientesBtnTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        clientesBtnTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                clientesBtnTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                clientesBtnTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                clientesBtnTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout clientesBtnLayout = new javax.swing.GroupLayout(clientesBtn);
        clientesBtn.setLayout(clientesBtnLayout);
        clientesBtnLayout.setHorizontalGroup(
            clientesBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(clientesBtnTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
        );
        clientesBtnLayout.setVerticalGroup(
            clientesBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(clientesBtnLayout.createSequentialGroup()
                .addComponent(clientesBtnTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        bg.add(clientesBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, -1, -1));

        citasBtn.setBackground(new java.awt.Color(0, 134, 190));

        citasBtnTxt.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        citasBtnTxt.setForeground(new java.awt.Color(255, 255, 255));
        citasBtnTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        citasBtnTxt.setText("CITAS");
        citasBtnTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        citasBtnTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                citasBtnTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                citasBtnTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                citasBtnTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout citasBtnLayout = new javax.swing.GroupLayout(citasBtn);
        citasBtn.setLayout(citasBtnLayout);
        citasBtnLayout.setHorizontalGroup(
            citasBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(citasBtnTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
        );
        citasBtnLayout.setVerticalGroup(
            citasBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(citasBtnLayout.createSequentialGroup()
                .addComponent(citasBtnTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        bg.add(citasBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 480, -1, 68));

        oficialesBtn.setBackground(new java.awt.Color(0, 134, 190));

        oficialesBtnTxt.setFont(new java.awt.Font("Roboto Condensed", 1, 14)); // NOI18N
        oficialesBtnTxt.setForeground(new java.awt.Color(255, 255, 255));
        oficialesBtnTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        oficialesBtnTxt.setText("OFICIALES");
        oficialesBtnTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        oficialesBtnTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                oficialesBtnTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                oficialesBtnTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                oficialesBtnTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout oficialesBtnLayout = new javax.swing.GroupLayout(oficialesBtn);
        oficialesBtn.setLayout(oficialesBtnLayout);
        oficialesBtnLayout.setHorizontalGroup(
            oficialesBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(oficialesBtnTxt, javax.swing.GroupLayout.DEFAULT_SIZE, 430, Short.MAX_VALUE)
        );
        oficialesBtnLayout.setVerticalGroup(
            oficialesBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(oficialesBtnLayout.createSequentialGroup()
                .addComponent(oficialesBtnTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );

        bg.add(oficialesBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, -1, -1));

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

    private void secretariasBtnTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_secretariasBtnTxtMouseClicked
        FrmSecretaria frm = new FrmSecretaria();
        frm.setVisible(true);
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_secretariasBtnTxtMouseClicked

    private void secretariasBtnTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_secretariasBtnTxtMouseEntered
        secretariasBtn.setBackground(new Color(0, 156, 223));
    }//GEN-LAST:event_secretariasBtnTxtMouseEntered

    private void secretariasBtnTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_secretariasBtnTxtMouseExited
        secretariasBtn.setBackground(new Color(0, 134, 190));
    }//GEN-LAST:event_secretariasBtnTxtMouseExited

    private void clientesBtnTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clientesBtnTxtMouseExited
        clientesBtn.setBackground(new Color(0, 134, 190));
    }//GEN-LAST:event_clientesBtnTxtMouseExited

    private void clientesBtnTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clientesBtnTxtMouseEntered
        clientesBtn.setBackground(new Color(0, 156, 223));
    }//GEN-LAST:event_clientesBtnTxtMouseEntered

    private void clientesBtnTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_clientesBtnTxtMouseClicked

    }//GEN-LAST:event_clientesBtnTxtMouseClicked

    private void citasBtnTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_citasBtnTxtMouseClicked

    }//GEN-LAST:event_citasBtnTxtMouseClicked

    private void citasBtnTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_citasBtnTxtMouseEntered
        citasBtn.setBackground(new Color(0, 156, 223));
    }//GEN-LAST:event_citasBtnTxtMouseEntered

    private void citasBtnTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_citasBtnTxtMouseExited
        citasBtn.setBackground(new Color(0, 134, 190));
    }//GEN-LAST:event_citasBtnTxtMouseExited

    private void oficialesBtnTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_oficialesBtnTxtMouseClicked

        FrmOficiales frm = new FrmOficiales();
        frm.setVisible(true);
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_oficialesBtnTxtMouseClicked

    private void oficialesBtnTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_oficialesBtnTxtMouseEntered
        oficialesBtn.setBackground(new Color(0, 156, 223));
    }//GEN-LAST:event_oficialesBtnTxtMouseEntered

    private void oficialesBtnTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_oficialesBtnTxtMouseExited
        oficialesBtn.setBackground(new Color(0, 134, 190));
    }//GEN-LAST:event_oficialesBtnTxtMouseExited

    private void minimizarBtnTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizarBtnTxtMouseClicked
        this.setExtendedState(ICONIFIED);
    }//GEN-LAST:event_minimizarBtnTxtMouseClicked

    private void minimizarBtnTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizarBtnTxtMouseEntered
        minimizarBtn.setBackground(Color.orange);
        minimizarBtnTxt.setForeground(Color.black);
    }//GEN-LAST:event_minimizarBtnTxtMouseEntered

    private void minimizarBtnTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizarBtnTxtMouseExited
        minimizarBtn.setBackground(Color.white);
        minimizarBtnTxt.setForeground(Color.black);
    }//GEN-LAST:event_minimizarBtnTxtMouseExited

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
    private javax.swing.JPanel citasBtn;
    private javax.swing.JLabel citasBtnTxt;
    private javax.swing.JPanel clientesBtn;
    private javax.swing.JLabel clientesBtnTxt;
    private javax.swing.JPanel exitBtn;
    private javax.swing.JLabel exitTxt;
    private javax.swing.JPanel header;
    private javax.swing.JLabel imagen;
    private javax.swing.JLabel logoG;
    private javax.swing.JLabel logoP;
    private javax.swing.JLabel logoname;
    private javax.swing.JPanel minimizarBtn;
    private javax.swing.JLabel minimizarBtnTxt;
    private javax.swing.JPanel oficialesBtn;
    private javax.swing.JLabel oficialesBtnTxt;
    private javax.swing.JPanel opcionesBtn;
    private javax.swing.JLabel opcionesBtnTxt;
    private javax.swing.JPanel secretariasBtn;
    private javax.swing.JLabel secretariasBtnTxt;
    private javax.swing.JLabel tituloSisLicencias;
    // End of variables declaration//GEN-END:variables
}
