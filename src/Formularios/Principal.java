
package Formularios;

import Clases.Persona;
import Clases.Validacion;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;





/**
 *
 * @author JOSE
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    Persona P;
    Validacion v;
    public Principal() {
        initComponents();
        P=new Persona();
        v =new Validacion();
       
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        escritorio = new javax.swing.JDesktopPane();
        MBPrincipal = new javax.swing.JMenuBar();
        muSacerdotesparroquia = new javax.swing.JMenu();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenuItem16 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jmregistroparroco = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jmmisas = new javax.swing.JMenu();
        MIRestroMisas = new javax.swing.JMenuItem();
        jmsacramentos = new javax.swing.JMenu();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenuItem13 = new javax.swing.JMenuItem();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenu8 = new javax.swing.JMenu();
        jmgrupos = new javax.swing.JMenu();
        MIregistrogrupo = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem20 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem21 = new javax.swing.JMenuItem();
        jmeventos = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        jMenuItem19 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        mSalir = new javax.swing.JMenu();
        Salir = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SISTEMA PARROQUIA");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        escritorio.setBackground(new java.awt.Color(0, 102, 153));
        escritorio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1085, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 735, Short.MAX_VALUE)
        );

        MBPrincipal.setBackground(new java.awt.Color(0, 0, 0));
        MBPrincipal.setBorder(new javax.swing.border.MatteBorder(null));

        muSacerdotesparroquia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/icons8-iglesia-48.png"))); // NOI18N
        muSacerdotesparroquia.setText("Parroquia");
        muSacerdotesparroquia.setFont(new java.awt.Font("235MKSD", 1, 18)); // NOI18N
        muSacerdotesparroquia.setMargin(new java.awt.Insets(1, 1, 1, 1));

        jMenuItem15.setText("Registrar Datos de Parroquia");
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        muSacerdotesparroquia.add(jMenuItem15);

        jMenuItem16.setText("Consultar Datos");
        muSacerdotesparroquia.add(jMenuItem16);

        jMenu1.setText("Parrocos");

        jmregistroparroco.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/icons8-sacerdote-filled-50.png"))); // NOI18N
        jmregistroparroco.setText("Registro Parroco");
        jmregistroparroco.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmregistroparrocoMouseClicked(evt);
            }
        });
        jmregistroparroco.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmjmregistroparrocoActionPerformed(evt);
            }
        });
        jMenu1.add(jmregistroparroco);

        jMenuItem4.setText("Consultar Sacerdote");
        jMenu1.add(jMenuItem4);

        muSacerdotesparroquia.add(jMenu1);

        MBPrincipal.add(muSacerdotesparroquia);

        jmmisas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/icons8-rezar-filled-50.png"))); // NOI18N
        jmmisas.setText("Misas");
        jmmisas.setFont(new java.awt.Font("235MKSD", 1, 18)); // NOI18N
        jmmisas.setMargin(new java.awt.Insets(1, 1, 1, 1));

        MIRestroMisas.setText("Registro Misas");
        MIRestroMisas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MIRestroMisasActionPerformed(evt);
            }
        });
        jmmisas.add(MIRestroMisas);

        MBPrincipal.add(jmmisas);

        jmsacramentos.setText("Sacramentos");
        jmsacramentos.setFont(new java.awt.Font("235MKSD", 1, 18)); // NOI18N
        jmsacramentos.setMargin(new java.awt.Insets(1, 1, 1, 1));

        jMenuItem17.setText("Bautizo");
        jmsacramentos.add(jMenuItem17);

        jMenuItem13.setText("Primera Comunión");
        jmsacramentos.add(jMenuItem13);

        jMenuItem14.setText("Confirmación.");
        jmsacramentos.add(jMenuItem14);

        jMenuItem18.setText("Matrimonio");
        jmsacramentos.add(jMenuItem18);

        MBPrincipal.add(jmsacramentos);

        jMenu8.setText("Registros");

        jmgrupos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/icons8-grupos-de-usuarios-48.png"))); // NOI18N
        jmgrupos.setText("Grupos");
        jmgrupos.setDelay(201);
        jmgrupos.setFont(new java.awt.Font("235MKSD", 1, 18)); // NOI18N
        jmgrupos.setMargin(new java.awt.Insets(1, 1, 1, 1));

        MIregistrogrupo.setText("Registro De l Grupo");
        MIregistrogrupo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MIregistrogrupoActionPerformed(evt);
            }
        });
        jmgrupos.add(MIregistrogrupo);

        jMenu8.add(jmgrupos);

        jMenuItem8.setText("Actas de actividades");
        jMenu8.add(jMenuItem8);

        jMenuItem2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/icons8-grupos-de-usuarios-30.png"))); // NOI18N
        jMenuItem2.setText("Registro de Personas");
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu8.add(jMenuItem2);

        jMenuItem20.setText("Consultar Personas");
        jMenu8.add(jMenuItem20);

        jMenu3.setText("Catequesis");

        jMenuItem5.setText("Catequesis Primera Comunion");
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem5);

        jMenuItem21.setText("Catequeis Cofirmacion");
        jMenu3.add(jMenuItem21);

        jMenu8.add(jMenu3);

        jmeventos.setText("Eventos");

        jMenuItem3.setText("Registro de Evento");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jmeventos.add(jMenuItem3);

        jMenu8.add(jmeventos);

        MBPrincipal.add(jMenu8);

        jMenu6.setText("Ingresos");

        jMenuItem19.setText("Ofrendas");
        jMenuItem19.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem19ActionPerformed(evt);
            }
        });
        jMenu6.add(jMenuItem19);

        jMenu5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/icons8-voluntariado-48.png"))); // NOI18N
        jMenu5.setText("Donación");
        jMenu5.setDelay(201);
        jMenu5.setFont(new java.awt.Font("235MKSD", 1, 18)); // NOI18N
        jMenu5.setMargin(new java.awt.Insets(1, 1, 1, 1));

        jMenuItem9.setText("Registro Donantes");
        jMenu5.add(jMenuItem9);

        jMenuItem10.setText("Consultar");
        jMenu5.add(jMenuItem10);

        jMenu6.add(jMenu5);

        MBPrincipal.add(jMenu6);

        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/icons8-santa-biblia-48.png"))); // NOI18N
        jMenu2.setText("Cursos");
        jMenu2.setFont(new java.awt.Font("235MKSD", 1, 18)); // NOI18N
        jMenu2.setMargin(new java.awt.Insets(1, 1, 1, 1));

        jMenuItem1.setText("Registro de Cursos");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem1);

        MBPrincipal.add(jMenu2);

        jMenu7.setText("Herramientas");
        MBPrincipal.add(jMenu7);

        mSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/icons8-salida-48.png"))); // NOI18N
        mSalir.setText("Cerar Sesión");
        mSalir.setFont(new java.awt.Font("235MKSD", 1, 18)); // NOI18N
        mSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mSalirActionPerformed(evt);
            }
        });

        Salir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/icons8-cerrar-ventana-48.png"))); // NOI18N
        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });
        mSalir.add(Salir);

        MBPrincipal.add(mSalir);

        setJMenuBar(MBPrincipal);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );

        escritorio.getAccessibleContext().setAccessibleDescription("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmjmregistroparrocoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmjmregistroparrocoActionPerformed
        
        RegistroParroco R= new RegistroParroco();
        escritorio.add(R);
        R.show();
        
    }//GEN-LAST:event_jmjmregistroparrocoActionPerformed

    private void jmregistroparrocoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmregistroparrocoMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jmregistroparrocoMouseClicked

    private void mSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mSalirActionPerformed
       
    }//GEN-LAST:event_mSalirActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
       if(JOptionPane.showConfirmDialog(rootPane, "¿Realmente desea Salir?","Confirmación",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
       {
           this.dispose();
           new Login().setVisible(true);
       }
    }//GEN-LAST:event_SalirActionPerformed

    private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        RegistroPersonas RP = new RegistroPersonas();
        escritorio.add(RP);
        RP.toFront();
        RP.show();
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
       this.setExtendedState(MAXIMIZED_BOTH);
    }//GEN-LAST:event_formWindowOpened

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem15ActionPerformed

    private void jMenuItem19ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem19ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem19ActionPerformed

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void MIregistrogrupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MIregistrogrupoActionPerformed
        RegistroGrupo RG = new RegistroGrupo();
        escritorio.add(RG);
        RG.show();
    }//GEN-LAST:event_MIregistrogrupoActionPerformed

    private void MIRestroMisasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MIRestroMisasActionPerformed
        RegistroMisas RM = new RegistroMisas();
        escritorio.add(RM);
        RM.show();
    }//GEN-LAST:event_MIRestroMisasActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        RegistroCursos RC =new RegistroCursos();
        
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar MBPrincipal;
    private javax.swing.JMenuItem MIRestroMisas;
    private javax.swing.JMenuItem MIregistrogrupo;
    private javax.swing.JMenuItem Salir;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenu jMenu8;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem13;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem16;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem19;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem21;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JMenu jmeventos;
    private javax.swing.JMenu jmgrupos;
    private javax.swing.JMenu jmmisas;
    private javax.swing.JMenuItem jmregistroparroco;
    private javax.swing.JMenu jmsacramentos;
    private javax.swing.JMenu mSalir;
    private javax.swing.JMenu muSacerdotesparroquia;
    // End of variables declaration//GEN-END:variables
}