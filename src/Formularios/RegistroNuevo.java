/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Formularios;

import Clases.Validacion;
import java.awt.event.ItemEvent;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

/**
 *
 * @author JOSE
 */
public class RegistroNuevo extends javax.swing.JFrame {

    /**
     * Creates new form RegistroNuevo
     */
    Validacion v;
    public RegistroNuevo() {
        initComponents();
        v=new Validacion();
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        cbovicarias = new javax.swing.JComboBox<>();
        jlnombreparroquia = new javax.swing.JLabel();
        cbonomparroquia = new javax.swing.JComboBox<>();
        txtapellidos = new javax.swing.JTextField();
        txtnombreusuario = new javax.swing.JTextField();
        pswcontrase = new javax.swing.JPasswordField();
        jlcontra = new javax.swing.JLabel();
        rbF = new javax.swing.JRadioButton();
        rbM = new javax.swing.JRadioButton();
        jlnomusu = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        dcfechanaci = new com.toedter.calendar.JDateChooser();
        txtnombres = new javax.swing.JTextField();
        jbidentificacion = new javax.swing.JLabel();
        txtcorreo = new javax.swing.JTextField();
        jlnombre = new javax.swing.JLabel();
        txtcelular = new javax.swing.JTextField();
        jlcorreo = new javax.swing.JLabel();
        jlcel = new javax.swing.JLabel();
        jltel = new javax.swing.JLabel();
        jlapellidos = new javax.swing.JLabel();
        jlfehcanaci = new javax.swing.JLabel();
        txtidentificacion = new javax.swing.JTextField();
        txttelefono = new javax.swing.JTextField();
        jlseleccionvica = new javax.swing.JLabel();
        btnsalir = new javax.swing.JButton();
        btnregistrar = new javax.swing.JButton();
        panelImage1 = new org.edisoncor.gui.panel.PanelImage();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setForeground(new java.awt.Color(0, 153, 153));
        jPanel1.setOpaque(false);
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cbovicarias.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccione Vicaría", "Vicaría Episcopal del Norte", "Vicaría Episcopal del Sur", "Vicaría Episcopal del Occidente", "Vicaría Episcopal del Oriente" }));
        cbovicarias.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbovicariasItemStateChanged(evt);
            }
        });
        cbovicarias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbovicariasActionPerformed(evt);
            }
        });
        jPanel1.add(cbovicarias, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 30, 240, -1));

        jlnombreparroquia.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlnombreparroquia.setText("Seleccione el Nombre de la parroquia:");
        jPanel1.add(jlnombreparroquia, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 290, -1));

        jPanel1.add(cbonomparroquia, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, 280, -1));

        txtapellidos.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtapellidosKeyTyped(evt);
            }
        });
        jPanel1.add(txtapellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 170, 190, -1));

        txtnombreusuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombreusuarioActionPerformed(evt);
            }
        });
        jPanel1.add(txtnombreusuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 420, 190, -1));
        jPanel1.add(pswcontrase, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 460, 190, -1));

        jlcontra.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlcontra.setText("Contraseña:");
        jPanel1.add(jlcontra, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 460, -1, -1));

        buttonGroup1.add(rbF);
        rbF.setText("F");
        rbF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbFActionPerformed(evt);
            }
        });
        jPanel1.add(rbF, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, -1, -1));

        buttonGroup1.add(rbM);
        rbM.setText("M");
        jPanel1.add(rbM, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 360, -1, -1));

        jlnomusu.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlnomusu.setText("Nombre De Usuario:");
        jPanel1.add(jlnomusu, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 420, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Sexo:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 360, -1, -1));
        jPanel1.add(dcfechanaci, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 190, -1));

        txtnombres.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnombresActionPerformed(evt);
            }
        });
        txtnombres.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtnombresKeyTyped(evt);
            }
        });
        jPanel1.add(txtnombres, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 140, 190, -1));

        jbidentificacion.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jbidentificacion.setText("Identificación:");
        jPanel1.add(jbidentificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));
        jPanel1.add(txtcorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 320, 190, -1));

        jlnombre.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlnombre.setText("Nombres:");
        jPanel1.add(jlnombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, -1, -1));

        txtcelular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcelularActionPerformed(evt);
            }
        });
        txtcelular.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtcelularKeyTyped(evt);
            }
        });
        jPanel1.add(txtcelular, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 280, 190, -1));

        jlcorreo.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlcorreo.setText("Correo:");
        jPanel1.add(jlcorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 320, -1, -1));

        jlcel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlcel.setText("Celular:");
        jPanel1.add(jlcel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 280, -1, -1));

        jltel.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jltel.setText("Teléfono:");
        jPanel1.add(jltel, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 250, -1, -1));

        jlapellidos.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlapellidos.setText("Apellidos:");
        jPanel1.add(jlapellidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 180, -1, -1));

        jlfehcanaci.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlfehcanaci.setText("Fecha de Nacimiento:");
        jPanel1.add(jlfehcanaci, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, -1, -1));

        txtidentificacion.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtidentificacionKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtidentificacionKeyTyped(evt);
            }
        });
        jPanel1.add(txtidentificacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 190, -1));

        txttelefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txttelefonoKeyTyped(evt);
            }
        });
        jPanel1.add(txttelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, 190, -1));

        jlseleccionvica.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlseleccionvica.setText("Seleccione la Vicaría episcopal en la cual esta:");
        jPanel1.add(jlseleccionvica, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 690, 600));

        btnsalir.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnsalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn_ch.png"))); // NOI18N
        btnsalir.setText("Salir");
        btnsalir.setBorder(null);
        btnsalir.setBorderPainted(false);
        btnsalir.setContentAreaFilled(false);
        btnsalir.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn_ch_hov.png"))); // NOI18N
        btnsalir.setFocusPainted(false);
        btnsalir.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnsalir.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn_ch_hov.png"))); // NOI18N
        btnsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnsalirActionPerformed(evt);
            }
        });
        getContentPane().add(btnsalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 620, -1, -1));

        btnregistrar.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        btnregistrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn_ch.png"))); // NOI18N
        btnregistrar.setText("Registrar");
        btnregistrar.setBorder(null);
        btnregistrar.setBorderPainted(false);
        btnregistrar.setContentAreaFilled(false);
        btnregistrar.setDisabledIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn_ch_hov.png"))); // NOI18N
        btnregistrar.setDisabledSelectedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn_ch_hov.png"))); // NOI18N
        btnregistrar.setFocusPainted(false);
        btnregistrar.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnregistrar.setPressedIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/btn_ch_hov.png"))); // NOI18N
        btnregistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnregistrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnregistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 620, -1, -1));

        panelImage1.setBackground(new java.awt.Color(0, 153, 153));
        panelImage1.setForeground(new java.awt.Color(0, 153, 153));
        panelImage1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(panelImage1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 710, 680));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnsalirActionPerformed

    private void btnregistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregistrarActionPerformed
        //validando datos
        if(v.validarcombox(cbovicarias, cbonomparroquia))
        {
            JOptionPane.showMessageDialog(rootPane, "Por seleccione la vicaría y su respectiva parroquia", "ERROR AL REGISTRAR", JOptionPane.ERROR_MESSAGE);

        }else{

                    if(v.camposenblancorn(txtidentificacion, txtnombres, txtapellidos, txttelefono, txtcelular, txtcorreo))
                    {
                        JOptionPane.showMessageDialog(rootPane, "Por favor complete los espacios en blanco", "ERROR AL REGISTRAR", JOptionPane.ERROR_MESSAGE);

                    }else
                    {
                        if(v.cantidaddedigitosid(txtidentificacion))//valida la cantidad de digitos de la identificación
                        {
                            JOptionPane.showMessageDialog(rootPane, "Le identificación debe contener diez digitos ","ERROR AL REGISTRAR",JOptionPane.ERROR_MESSAGE);
                            txtidentificacion.setText("");

                        }else
                        {
                            if(v.catidaddedigitostel(txttelefono))//validad la cantidad de digitos del teléfono
                        {
                            JOptionPane.showMessageDialog(rootPane, "El Teléfono debe tener ocho digitos","ERROR AL REGISTRAR",JOptionPane.ERROR_MESSAGE);
                            txttelefono.setText("");

                            }else
                                {
                                    if(!v.validarcel(txtcelular))//validad la cantidad de digitos del celuar
                                    {
                                        JOptionPane.showMessageDialog(rootPane, "El Celular debe tener diez digitos","ERROR AL REGISTRAR",JOptionPane.ERROR_MESSAGE);
                                        txtcelular.setText("");

                                    }else
                                        {    if(v.validarregistrocampos(txtnombres, pswcontrase))
                                              {
                                                    JOptionPane.showMessageDialog(rootPane, "Por favor complete rel resgistro de usuario", "ERROR AL REGISTRAR", JOptionPane.ERROR_MESSAGE);

                                              }else
                                                 {
                                                    if(!v.validarsexo(rbM, rbF))//valida que si eligio una opción
                                                    {
                                                        JOptionPane.showMessageDialog(rootPane, "Por favor seleccione una OPCIÓN en SEXO",
                                                            "Seleccione Sexo", JOptionPane.WARNING_MESSAGE);

                                                    } else{ if(JOptionPane.showConfirmDialog(rootPane, "¿Està seguro de Registrar los Datos?", "Confirmaciòn", JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION)
                                                            {
                                                            //guardar los datos
                                                            v.setIdenti(txtidentificacion.getText());
                                                            v.setNom(txtnombres.getText());
                                                            v.setApel(txtapellidos.getText());
                                                            //guardar fecha
                                                            String fecha=v.fecha(dcfechanaci);
                                                            System.out.print(fecha);
                                                            v.setTel(txttelefono.getText());
                                                            v.setCel(txtcelular.getText());
                                                            v.setCorreo(txtcorreo.getText());
                                                            //Guarda opcción de sexo
                                                            if(rbM.isSelected())
                                                            {
                                                                v.setSexo("M");
                                                            }else{v.setSexo("F");}
                                                            v.setNomusua(txtnombreusuario.getText());
                                                            v.setConra(pswcontrase.getText());

                                                            JOptionPane.showMessageDialog(rootPane, "Ha sido registrado en la plataforma satisfactoriamente",
                                                                "Acción Correcta", JOptionPane.INFORMATION_MESSAGE);
                                                            new Principal().setVisible(true);
                                                            this.setVisible(false);

                                                            }//finsi
                                                          }//finsi
                                                  }
                                        }
                                }
                        }//finsi
                  }//finsi
             }//finsi

    }//GEN-LAST:event_btnregistrarActionPerformed

    private void txttelefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txttelefonoKeyTyped
        v.solonumeros(evt.getKeyChar(),evt);//llama al método solotexto para  validar que el usuario solo ingrese números.
        if(txttelefono.getText().length()>=7)
        {
            evt.consume();
            //JOptionPane.showMessageDialog(rootPane, "Sólo se permiten siete caracteres");
        }//finsi
    }//GEN-LAST:event_txttelefonoKeyTyped

    private void txtidentificacionKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtidentificacionKeyTyped
        v.solonumeros(evt.getKeyChar(),evt);//llama al método solotexto para  validar que el usuario solo ingrese números.
        if( txtidentificacion.getText().length()>=10)
        {
            evt.consume();
            //JOptionPane.showMessageDialog(rootPane, "Sólo se permiten de ocho a diez caracteres");
        }//finsi
    }//GEN-LAST:event_txtidentificacionKeyTyped

    private void txtidentificacionKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtidentificacionKeyPressed

    }//GEN-LAST:event_txtidentificacionKeyPressed

    private void txtcelularKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtcelularKeyTyped
        v.solonumeros(evt.getKeyChar(),evt);
    }//GEN-LAST:event_txtcelularKeyTyped

    private void txtcelularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcelularActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcelularActionPerformed

    private void txtnombresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombresActionPerformed

    }//GEN-LAST:event_txtnombresActionPerformed

    private void rbFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rbFActionPerformed

    private void txtnombreusuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnombreusuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnombreusuarioActionPerformed

    private void cbovicariasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbovicariasActionPerformed

    }//GEN-LAST:event_cbovicariasActionPerformed

    public String[] getParroquia(String Vicaria)
    {
        String parroquia[]={} ;//un array list vacio
        if(Vicaria.equalsIgnoreCase("Vicaría Episcopal del Norte"))
        {
            parroquia=new String [21];
            
            parroquia[0] = " P. El Santo Evangelio";
            parroquia[1] = " P. Madre Teresa De Calcuta";     
            parroquia[2] = " P. Nuestra Señora De La Valvanera";  
            parroquia[3] = " P. Nuestra Señora De Las Lajas";   
            parroquia[4] = " P. Nuestra Señora De Las Misericordias";   
            parroquia[5] = " P. Nuestra Señora Del Buen Consejo";   
            parroquia[6] = " P. San Agustín";   
            parroquia[7] = " P. San Alfonso María De Ligorio";   
            parroquia[8] = " P. San Andrés Apóstol";   
            parroquia[9] = " P. San Camilo De Lelis";   
            parroquia[10] = "P. San Carlos Borromeo";   
            parroquia[11] = "P. San Fernando Rey";   
            parroquia[12] = "P. San Gregorio Magno";   
            parroquia[13] = "P. San Juan Bautista Precursor";   
            parroquia[14] = "P. San Juan Crisóstomo";
            parroquia[15] = "P. San Judas Tadeo";
            parroquia[16] = "P. San Pedro Claver";
            parroquia[17] = "P. Santa María Del Carmen";
            parroquia[18] = "P. Santa Mariana De Jesús Paredes";
            parroquia[19] = "P.  Santa Teresa De Jesús"; 
            parroquia[20] = "P. ";
            
        }
        
        
        if(Vicaria.equalsIgnoreCase("Vicaría Episcopal del Sur"))
        
        {
           parroquia = new String [18];
           parroquia[0] = " P. Jesús Eucaristía";
           parroquia[1] = " P. La Ermita De La Virgen De Chiquinquirá";
           parroquia[2] = " P. La Trinidad";     
           parroquia[3] = " P. María Reina De La Familia";  
           parroquia[4] = " P. Marie Poussepin";   
           parroquia[5] = " P. Nuestra Señora De La Reconciliación";   
           parroquia[6] = " P. Nuestra Señora De Los ángeles";   
           parroquia[7] = " P. Nuestra Señora Del Rosario De Chiquinquirá";   
           parroquia[8] = " P. San Antonio De Prado";   
           parroquia[9] = " P. San Francisco De Paula";   
           parroquia[10] =" P. San Gabriel Arcángel";   
           parroquia[11] = "P. San José Del Limonar";   
           parroquia[12] = "P. San Juan Eudes";   
           parroquia[13] = "P. San Martín De Porres-ancón";   
           parroquia[14] = "P. San Pedro Apóstol-bariloche";   
           parroquia[15] = "P. Santa Teresa De Calcuta";
           parroquia[16] = "P. Santo Tomás Apóstol";
           parroquia[17] = "P. San Judas TadeoSantos ángeles Custodios";
          
        }
        if(Vicaria.equalsIgnoreCase("Vicaría Episcopal del Occidente"))
          
        {
           parroquia = new String [14];
           parroquia[0] = " P.  El Verbo Divino";
           parroquia[1] = " P. La Ermita De Jesús";
           parroquia[2] = " P. Madre Del Verbo Divino";     
           parroquia[3] = " P. Nuestra Señora De La Consolata";  
           parroquia[4] = " P. Nuestra Señora De Las Mercedes";   
           parroquia[5] = " P. Nuestra Señora De Lourdes";   
           parroquia[6] = " P. San Atanasio";   
           parroquia[7] = " P. San Clemente María Hofbauer";   
           parroquia[8] = " P. San Joaquín";   
           parroquia[9] = " P. San Juan Evangelista";   
           parroquia[10] =" P. San Pedro Y San Pablo";   
           parroquia[11] = "P. Santa Gema";   
           parroquia[12] = "P. Santa María Magdalena";   
           parroquia[13] = "P. Santa Teresita Del Niño Jesús";   
         
          
        }
        return parroquia;
    }
    private void cbovicariasItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbovicariasItemStateChanged
        if (evt.getStateChange()==ItemEvent.SELECTED) //cambio de estado. cuando selecciona algun Item del combobox
        {
            if(this.cbovicarias.getSelectedIndex()>0) //excluye la primera opción(donde se le muestra el mensaje)
            {
                //actualiza el segundocbx     crea undcbx              lleva al cbx parroquia los items segun vicaria
                this.cbonomparroquia.setModel(new DefaultComboBoxModel(this.getParroquia(this.cbovicarias.getSelectedItem().toString()))); // actuliza con el array list digitado el combobox dependiente

            }else
            {
                cbonomparroquia.removeAllItems();

            }

        }
    }//GEN-LAST:event_cbovicariasItemStateChanged

    private void txtnombresKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtnombresKeyTyped
        v.solotexto(evt.getKeyChar(),evt);
    }//GEN-LAST:event_txtnombresKeyTyped

    private void txtapellidosKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtapellidosKeyTyped
        v.solotexto(evt.getKeyChar(),evt);
    }//GEN-LAST:event_txtapellidosKeyTyped

    
    
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
            java.util.logging.Logger.getLogger(RegistroNuevo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroNuevo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroNuevo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroNuevo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroNuevo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnregistrar;
    private javax.swing.JButton btnsalir;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> cbonomparroquia;
    private javax.swing.JComboBox<String> cbovicarias;
    private com.toedter.calendar.JDateChooser dcfechanaci;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jbidentificacion;
    private javax.swing.JLabel jlapellidos;
    private javax.swing.JLabel jlcel;
    private javax.swing.JLabel jlcontra;
    private javax.swing.JLabel jlcorreo;
    private javax.swing.JLabel jlfehcanaci;
    private javax.swing.JLabel jlnombre;
    private javax.swing.JLabel jlnombreparroquia;
    private javax.swing.JLabel jlnomusu;
    private javax.swing.JLabel jlseleccionvica;
    private javax.swing.JLabel jltel;
    private org.edisoncor.gui.panel.PanelImage panelImage1;
    private javax.swing.JPasswordField pswcontrase;
    private javax.swing.JRadioButton rbF;
    private javax.swing.JRadioButton rbM;
    private javax.swing.JTextField txtapellidos;
    private javax.swing.JTextField txtcelular;
    private javax.swing.JTextField txtcorreo;
    private javax.swing.JTextField txtidentificacion;
    private javax.swing.JTextField txtnombres;
    private javax.swing.JTextField txtnombreusuario;
    private javax.swing.JTextField txttelefono;
    // End of variables declaration//GEN-END:variables
}