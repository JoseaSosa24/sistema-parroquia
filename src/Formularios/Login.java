/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import Clases.Validacion;//importando paqute
import java.awt.Color;
//import com.sun.awt.AWTUtilities; //
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author JoseArmando
 */
public class Login extends javax.swing.JFrame {

    /**
     * Creates new form Menu
     */
    Validacion v;

    public Login() {
        initComponents();
        this.setSize(600, 600);
        errorusuario.setVisible(false);
        errorcontra1.setVisible(false);
        this.setLocationRelativeTo(null);

        /*AWTUtilities.setWindowOpaque(this, false);*/
        v = new Validacion();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jXFrame1 = new org.jdesktop.swingx.JXFrame();
        panelImage1 = new org.edisoncor.gui.panel.PanelImage();
        jLabel2 = new javax.swing.JLabel();
        jlusario = new javax.swing.JLabel();
        txtnomusuario = new javax.swing.JTextField();
        labelloginnombre = new javax.swing.JLabel();
        jlcontrase = new javax.swing.JLabel();
        pswcontraseña = new javax.swing.JPasswordField();
        btniniciar = new javax.swing.JButton();
        btnregistrar = new javax.swing.JButton();
        btnSalir = new javax.swing.JButton();
        jLabelcontra = new javax.swing.JLabel();
        errorusuario = new javax.swing.JLabel();
        errorcontra1 = new javax.swing.JLabel();

        javax.swing.GroupLayout jXFrame1Layout = new javax.swing.GroupLayout(jXFrame1.getContentPane());
        jXFrame1.getContentPane().setLayout(jXFrame1Layout);
        jXFrame1Layout.setHorizontalGroup(
            jXFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jXFrame1Layout.setVerticalGroup(
            jXFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        panelImage1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/600px-GREEN-SEA.png"))); // NOI18N
        panelImage1.setLayout(null);

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("Airborne Pilot", 1, 48)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("INGRESO");
        panelImage1.add(jLabel2);
        jLabel2.setBounds(160, 70, 280, 40);

        jlusario.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        jlusario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlusario.setText("Usuario:");
        panelImage1.add(jlusario);
        jlusario.setBounds(60, 140, 480, 40);

        txtnomusuario.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        txtnomusuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtnomusuario.setBorder(null);
        txtnomusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnomusuarioActionPerformed(evt);
            }
        });
        txtnomusuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnomusuarioKeyTyped(evt);
            }
        });
        panelImage1.add(txtnomusuario);
        txtnomusuario.setBounds(190, 190, 210, 20);

        labelloginnombre.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/txt_med.png"))); // NOI18N
        panelImage1.add(labelloginnombre);
        labelloginnombre.setBounds(180, 170, 240, 60);

        jlcontrase.setFont(new java.awt.Font("Berlin Sans FB Demi", 0, 24)); // NOI18N
        jlcontrase.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jlcontrase.setText("Contraseña:");
        panelImage1.add(jlcontrase);
        jlcontrase.setBounds(20, 240, 560, 30);

        pswcontraseña.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        pswcontraseña.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        pswcontraseña.setBorder(null);
        pswcontraseña.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pswcontraseñaKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                pswcontraseñaKeyTyped(evt);
            }
        });
        panelImage1.add(pswcontraseña);
        pswcontraseña.setBounds(190, 290, 220, 20);

        btniniciar.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 18)); // NOI18N
        btniniciar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn_ch.png"))); // NOI18N
        btniniciar.setText("Iniciar");
        btniniciar.setBorder(null);
        btniniciar.setBorderPainted(false);
        btniniciar.setContentAreaFilled(false);
        btniniciar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btniniciar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn_ch_hov.png"))); // NOI18N
        btniniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btniniciarActionPerformed(evt);
            }
        });
        panelImage1.add(btniniciar);
        btniniciar.setBounds(160, 400, 118, 40);

        btnregistrar.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 18)); // NOI18N
        btnregistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn_ch.png"))); // NOI18N
        btnregistrar.setText("Registar");
        btnregistrar.setBorder(null);
        btnregistrar.setBorderPainted(false);
        btnregistrar.setContentAreaFilled(false);
        btnregistrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnregistrar.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn_ch_hov.png"))); // NOI18N
        btnregistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregistrarActionPerformed(evt);
            }
        });
        panelImage1.add(btnregistrar);
        btnregistrar.setBounds(310, 400, 120, 40);

        btnSalir.setFont(new java.awt.Font("Berlin Sans FB Demi", 1, 18)); // NOI18N
        btnSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn_ch.png"))); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.setBorder(null);
        btnSalir.setBorderPainted(false);
        btnSalir.setContentAreaFilled(false);
        btnSalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnSalir.setRolloverIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn_ch_hov.png"))); // NOI18N
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });
        panelImage1.add(btnSalir);
        btnSalir.setBounds(230, 460, 120, 40);

        jLabelcontra.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelcontra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/txt_med.png"))); // NOI18N
        panelImage1.add(jLabelcontra);
        jLabelcontra.setBounds(180, 270, 240, 60);

        errorusuario.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        errorusuario.setForeground(new java.awt.Color(255, 102, 51));
        errorusuario.setLabelFor(txtnomusuario);
        errorusuario.setText("Ingrese Usuario.");
        panelImage1.add(errorusuario);
        errorusuario.setBounds(420, 200, 130, 14);

        errorcontra1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        errorcontra1.setForeground(new java.awt.Color(255, 102, 51));
        errorcontra1.setLabelFor(pswcontraseña);
        errorcontra1.setText("Ingrese Contraseña.");
        errorcontra1.setToolTipText("");
        panelImage1.add(errorcontra1);
        errorcontra1.setBounds(420, 300, 130, 14);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelImage1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelImage1, javax.swing.GroupLayout.PREFERRED_SIZE, 600, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtnomusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnomusuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnomusuarioActionPerformed

    private void btniniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btniniciarActionPerformed

         if (pswcontraseña.getText().length() > 0) {
            errorcontra1.setVisible(false);

        } else {
            errorcontra1.setVisible(true);
        }
        
         if (txtnomusuario.getText().length() > 0) {
            errorusuario.setVisible(false);

        } else {
            errorusuario.setVisible(true);
        }
         
        if (v.validarIngreso(txtnomusuario, pswcontraseña)) {
            //JOptionPane.showMessageDialog(rootPane, "Usuario o Contraseña sin digitar","",JOptionPane.ERROR_MESSAGE);
            /*errorusuario.setVisible(true);
            errorcontra1.setVisible(true);*/

        } else {
            new Principal().setVisible(true);
            this.setVisible(false);
            errorusuario.setVisible(false);
            errorcontra1.setVisible(false);

        }
    }//GEN-LAST:event_btniniciarActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    private void btnregistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregistrarActionPerformed
        if (JOptionPane.showConfirmDialog(null, "¿Es un nuevo usuario en el sistema?",
                "Confirmar", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {

            RegistroNuevo r = new RegistroNuevo();
            r.setVisible(true);
            r.requestFocus();
            this.setVisible(false);
        }
    }//GEN-LAST:event_btnregistrarActionPerformed

    private void pswcontraseñaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pswcontraseñaKeyPressed

        if (evt.getKeyCode() == KeyEvent.VK_ENTER)//si la accion del teclado es igual a "Enter"
        {
            if (v.validarIngreso(txtnomusuario, pswcontraseña)) {
                JOptionPane.showMessageDialog(rootPane, "Usuario o Contraseña sin digitar", "", JOptionPane.ERROR_MESSAGE);
            } else {
                new Principal().setVisible(true);
                this.setVisible(false);
            }
        }
    }//GEN-LAST:event_pswcontraseñaKeyPressed

    private void txtnomusuarioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnomusuarioKeyTyped
        if (txtnomusuario.getText().length() > 0) {
            errorusuario.setVisible(false);

        } else {
            errorusuario.setVisible(true);
        }
    }//GEN-LAST:event_txtnomusuarioKeyTyped

    private void pswcontraseñaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pswcontraseñaKeyTyped
        if (pswcontraseña.getText().length() > 0) {
            errorcontra1.setVisible(false);

        } else {
            errorcontra1.setVisible(true);
        }
    }//GEN-LAST:event_pswcontraseñaKeyTyped

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Login().setVisible(true);
                /* try {
                    UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName()); //valida que no se vean los textfiel encima de los label
                } catch (Exception e) {
                     
                }*/

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btniniciar;
    private javax.swing.JButton btnregistrar;
    private javax.swing.JLabel errorcontra1;
    private javax.swing.JLabel errorusuario;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelcontra;
    private org.jdesktop.swingx.JXFrame jXFrame1;
    private javax.swing.JLabel jlcontrase;
    private javax.swing.JLabel jlusario;
    private javax.swing.JLabel labelloginnombre;
    private org.edisoncor.gui.panel.PanelImage panelImage1;
    private javax.swing.JPasswordField pswcontraseña;
    private javax.swing.JTextField txtnomusuario;
    // End of variables declaration//GEN-END:variables
}