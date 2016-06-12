/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eiralesalomon.Interfaz;

import eiralesalomon.Compra;
import eiralesalomon.Producto;
import eiralesalomon.Usuario;
import eiralesalomon.Sistema;
import java.awt.Dimension;
import java.awt.Toolkit;
import java.util.*;

/**
 *
 * @author fsalomon
 */
public class PantallaInicial extends javax.swing.JFrame {

    Sistema sistema;
    
    /**
     * Creates new form PantallaInicial
     * @param sistema
     */
    public PantallaInicial(Sistema sistema) {
        initComponents();
        this.sistema = sistema;
        /*Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        setBounds(0,0,screenSize.width, screenSize.height);
        setVisible(true);*/
        JPPrincipal.setVisible(true);
        //remover panel
        JPPrincipal.removeAll();
        JPPrincipal.repaint();
        JPPrincipal.revalidate();
        //agregar panel
        JPPrincipal.add(JPLogin);
        JPPrincipal.repaint();
        JPPrincipal.revalidate();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPPrincipal = new javax.swing.JPanel();
        JPLogin = new javax.swing.JPanel();
        jLabelBienvenida = new javax.swing.JLabel();
        JLabelMensajeBienvenida = new javax.swing.JLabel();
        jLabelUsuario = new javax.swing.JLabel();
        jTextFieldUsuarioAlias = new javax.swing.JTextField();
        jButtonIniciar = new javax.swing.JButton();
        jButtonRegistrarme = new javax.swing.JButton();
        jLabelMsjError = new javax.swing.JLabel();
        JPPantallaPrinc = new javax.swing.JPanel();
        JPMenu = new javax.swing.JPanel();
        JPVarios = new javax.swing.JPanel();
        JPVarios1 = new javax.swing.JPanel();
        JPVarios2 = new javax.swing.JPanel();
        JPRegistrarme = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblAlias = new javax.swing.JLabel();
        txtAlias = new javax.swing.JTextField();
        lblFechaNac = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        lblNombre = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        btnCancelar = new javax.swing.JButton();
        lblInfo = new javax.swing.JLabel();
        dtpFechaNac = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menú Principal - Sistema de Gestión de gastos del hogar");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(800, 600));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });
        getContentPane().setLayout(new java.awt.CardLayout());

        jLabelBienvenida.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabelBienvenida.setText("BIENVENIDO");

        JLabelMensajeBienvenida.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        JLabelMensajeBienvenida.setText("Inicie sesión para empezar a usar el gestor de gastos");

        jLabelUsuario.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabelUsuario.setText("Usuario");

        jTextFieldUsuarioAlias.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jButtonIniciar.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonIniciar.setText("Iniciar Sesión");
        jButtonIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIniciarActionPerformed(evt);
            }
        });

        jButtonRegistrarme.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jButtonRegistrarme.setText("Registrarme");
        jButtonRegistrarme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarmeActionPerformed(evt);
            }
        });

        jLabelMsjError.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        javax.swing.GroupLayout JPLoginLayout = new javax.swing.GroupLayout(JPLogin);
        JPLogin.setLayout(JPLoginLayout);
        JPLoginLayout.setHorizontalGroup(
            JPLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 656, Short.MAX_VALUE)
            .addGroup(JPLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(JPLoginLayout.createSequentialGroup()
                    .addGroup(JPLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(JPLoginLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(jLabelMsjError, javax.swing.GroupLayout.PREFERRED_SIZE, 318, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, JPLoginLayout.createSequentialGroup()
                            .addGap(169, 169, 169)
                            .addGroup(JPLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPLoginLayout.createSequentialGroup()
                                    .addComponent(jLabelUsuario)
                                    .addGap(18, 18, 18)
                                    .addComponent(jTextFieldUsuarioAlias, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(63, 63, 63))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPLoginLayout.createSequentialGroup()
                                    .addComponent(jLabelBienvenida)
                                    .addGap(103, 103, 103))
                                .addComponent(JLabelMensajeBienvenida, javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPLoginLayout.createSequentialGroup()
                                    .addGroup(JPLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jButtonRegistrarme, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jButtonIniciar))
                                    .addGap(101, 101, 101)))))
                    .addContainerGap(169, Short.MAX_VALUE)))
        );
        JPLoginLayout.setVerticalGroup(
            JPLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 524, Short.MAX_VALUE)
            .addGroup(JPLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(JPLoginLayout.createSequentialGroup()
                    .addGap(130, 130, 130)
                    .addComponent(jLabelBienvenida)
                    .addGap(18, 18, 18)
                    .addComponent(JLabelMensajeBienvenida)
                    .addGap(39, 39, 39)
                    .addComponent(jLabelMsjError)
                    .addGap(18, 18, 18)
                    .addGroup(JPLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextFieldUsuarioAlias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabelUsuario))
                    .addGap(36, 36, 36)
                    .addComponent(jButtonIniciar)
                    .addGap(45, 45, 45)
                    .addComponent(jButtonRegistrarme)
                    .addContainerGap(130, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout JPMenuLayout = new javax.swing.GroupLayout(JPMenu);
        JPMenu.setLayout(JPMenuLayout);
        JPMenuLayout.setHorizontalGroup(
            JPMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 656, Short.MAX_VALUE)
        );
        JPMenuLayout.setVerticalGroup(
            JPMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 81, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout JPVarios1Layout = new javax.swing.GroupLayout(JPVarios1);
        JPVarios1.setLayout(JPVarios1Layout);
        JPVarios1Layout.setHorizontalGroup(
            JPVarios1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        JPVarios1Layout.setVerticalGroup(
            JPVarios1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 448, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout JPVarios2Layout = new javax.swing.GroupLayout(JPVarios2);
        JPVarios2.setLayout(JPVarios2Layout);
        JPVarios2Layout.setHorizontalGroup(
            JPVarios2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        JPVarios2Layout.setVerticalGroup(
            JPVarios2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 448, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout JPVariosLayout = new javax.swing.GroupLayout(JPVarios);
        JPVarios.setLayout(JPVariosLayout);
        JPVariosLayout.setHorizontalGroup(
            JPVariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 656, Short.MAX_VALUE)
            .addGroup(JPVariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(JPVariosLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(JPVarios1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(JPVariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(JPVariosLayout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(JPVarios2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
        );
        JPVariosLayout.setVerticalGroup(
            JPVariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 490, Short.MAX_VALUE)
            .addGroup(JPVariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(JPVariosLayout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(JPVarios1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap()))
            .addGroup(JPVariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(JPVariosLayout.createSequentialGroup()
                    .addGap(21, 21, 21)
                    .addComponent(JPVarios2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGap(1, 1, 1)))
        );

        javax.swing.GroupLayout JPPantallaPrincLayout = new javax.swing.GroupLayout(JPPantallaPrinc);
        JPPantallaPrinc.setLayout(JPPantallaPrincLayout);
        JPPantallaPrincLayout.setHorizontalGroup(
            JPPantallaPrincLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(JPVarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        JPPantallaPrincLayout.setVerticalGroup(
            JPPantallaPrincLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPPantallaPrincLayout.createSequentialGroup()
                .addComponent(JPMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(JPVarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Registrarme");

        lblAlias.setText("Alias");

        lblFechaNac.setText("Fecha Nacimiento");

        jButton1.setText("Confirmar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        lblNombre.setText("Nombre");

        txtNombre.setToolTipText("");

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JPRegistrarmeLayout = new javax.swing.GroupLayout(JPRegistrarme);
        JPRegistrarme.setLayout(JPRegistrarmeLayout);
        JPRegistrarmeLayout.setHorizontalGroup(
            JPRegistrarmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPRegistrarmeLayout.createSequentialGroup()
                .addGroup(JPRegistrarmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPRegistrarmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPRegistrarmeLayout.createSequentialGroup()
                            .addGap(278, 278, 278)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(JPRegistrarmeLayout.createSequentialGroup()
                            .addGap(178, 178, 178)
                            .addGroup(JPRegistrarmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(JPRegistrarmeLayout.createSequentialGroup()
                                    .addGroup(JPRegistrarmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(lblNombre)
                                        .addComponent(lblFechaNac)
                                        .addComponent(lblAlias))
                                    .addGroup(JPRegistrarmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(JPRegistrarmeLayout.createSequentialGroup()
                                            .addGap(16, 16, 16)
                                            .addComponent(txtAlias, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(JPRegistrarmeLayout.createSequentialGroup()
                                            .addGap(18, 18, 18)
                                            .addComponent(dtpFechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addComponent(lblInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(JPRegistrarmeLayout.createSequentialGroup()
                        .addGap(267, 267, 267)
                        .addComponent(jLabel2))
                    .addGroup(JPRegistrarmeLayout.createSequentialGroup()
                        .addGap(242, 242, 242)
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar)))
                .addContainerGap(192, Short.MAX_VALUE))
        );
        JPRegistrarmeLayout.setVerticalGroup(
            JPRegistrarmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPRegistrarmeLayout.createSequentialGroup()
                .addGap(126, 126, 126)
                .addComponent(jLabel2)
                .addGap(58, 58, 58)
                .addGroup(JPRegistrarmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNombre)
                    .addComponent(lblNombre))
                .addGap(18, 18, 18)
                .addGroup(JPRegistrarmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblFechaNac)
                    .addComponent(dtpFechaNac, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(JPRegistrarmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAlias)
                    .addComponent(txtAlias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblInfo)
                .addGap(84, 84, 84)
                .addGroup(JPRegistrarmeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(btnCancelar))
                .addGap(158, 158, 158))
        );

        javax.swing.GroupLayout JPPrincipalLayout = new javax.swing.GroupLayout(JPPrincipal);
        JPPrincipal.setLayout(JPPrincipalLayout);
        JPPrincipalLayout.setHorizontalGroup(
            JPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPPrincipalLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(JPLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(JPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(JPPrincipalLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(JPPantallaPrinc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(JPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPPrincipalLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JPRegistrarme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );
        JPPrincipalLayout.setVerticalGroup(
            JPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPPrincipalLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(JPLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(JPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(JPPrincipalLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(JPPantallaPrinc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
            .addGroup(JPPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPPrincipalLayout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(JPRegistrarme, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
        );

        getContentPane().add(JPPrincipal, "card2");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        //Serializar todos los arraylist al cerrar la app
         sistema.guardar();
    }//GEN-LAST:event_formWindowClosing

    //Evento botón iniciar sesión en JPLogin
    private void jButtonIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIniciarActionPerformed
        // TODO add your handling code here:
        try{
            String alias = this.jTextFieldUsuarioAlias.getText();
            
            if (sistema.getListaAlias().contains(alias)) {
                //remover panel
                JPPrincipal.removeAll();
                JPPrincipal.repaint();
                JPPrincipal.revalidate();
                //agregar panel
                JPPrincipal.add(JPPantallaPrinc);
                JPPrincipal.repaint();
                JPPrincipal.revalidate();
                
            }else{                 
                this.jLabelMsjError.setText("Nombre de usuario incorrecto, intenta con uno válido.");               
            }
        }catch(Exception e){
            this.jLabelMsjError.setText(e.toString());
        }
    }//GEN-LAST:event_jButtonIniciarActionPerformed

    //Evento botón registrarme en JPLogin
    private void jButtonRegistrarmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarmeActionPerformed
        // TODO add your handling code here:
            //remover panel
            JPPrincipal.removeAll();
            JPPrincipal.repaint();
            JPPrincipal.revalidate();
            //agregar panel
            JPPrincipal.add(JPRegistrarme);
            JPPrincipal.repaint();
            JPPrincipal.revalidate();
    }//GEN-LAST:event_jButtonRegistrarmeActionPerformed

    //Evento botón registrarme en JPRegistrarme
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        try {
            String nombre = this.txtNombre.getText();
            String alias = this.txtAlias.getText();
            int edad;

            Date fechaNac = this.dtpFechaNac.getDate();

            Date hoy = Calendar.getInstance().getTime();

            long diff = hoy.getTime() - fechaNac.getTime();
            long d=(1000l*60*60*24*365);
            long years = Math.round(diff / d);
            edad = Math.toIntExact(years);

            if (sistema.getListaAlias().contains(alias)) {
                this.lblInfo.setText("El alias definido ya está en uso, elige otro por favor.");
                limpiarCampos();
            }else{
                if (edad >= 18){
                    alias = this.txtAlias.getText();
                    Usuario usuario = new Usuario(nombre, alias, fechaNac, new ArrayList<Producto>(), new ArrayList<Compra>());
                    sistema.agregarUsuario(usuario);
                    //sistema.guardarUsuario();
                    sistema.getListaAlias().add(alias);
                    limpiarCampos();
                    this.lblInfo.setText("Usuario ingresado con éxito.");
                    //remover panel
                    JPPrincipal.removeAll();
                    JPPrincipal.repaint();
                    JPPrincipal.revalidate();
                    //agregar panel
                    JPPrincipal.add(JPLogin);
                    JPPrincipal.repaint();
                    JPPrincipal.revalidate();
                }else{
                    this.lblInfo.setText("Debes ser mayor de 18 años para poder registrarte en el sistema.");
                }
            }

        } catch (Exception e) {
            this.lblInfo.setText("Error al ingresar Usuario.");// + e.getMessage());
        }    
    }//GEN-LAST:event_jButton1ActionPerformed

    //Evento btnCancelar en JPRegistrarme
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        //remover panel
        JPPrincipal.removeAll();
        JPPrincipal.repaint();
        JPPrincipal.revalidate();
        //agregar panel
        JPPrincipal.add(JPLogin);
        JPPrincipal.repaint();
        JPPrincipal.revalidate();
        this.lblInfo.setText("");
        limpiarCampos();
    }//GEN-LAST:event_btnCancelarActionPerformed

    //limpiar campos en JPRegistrarme
     public void limpiarCampos() {
        this.txtNombre.setText("");
        this.txtAlias.setText("");
        dtpFechaNac.setCalendar(null);
    }
   
    
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
            java.util.logging.Logger.getLogger(PantallaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaInicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new PantallaInicial().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel JLabelMensajeBienvenida;
    private javax.swing.JPanel JPLogin;
    private javax.swing.JPanel JPMenu;
    private javax.swing.JPanel JPPantallaPrinc;
    private javax.swing.JPanel JPPrincipal;
    private javax.swing.JPanel JPRegistrarme;
    private javax.swing.JPanel JPVarios;
    private javax.swing.JPanel JPVarios1;
    private javax.swing.JPanel JPVarios2;
    private javax.swing.JButton btnCancelar;
    private com.toedter.calendar.JDateChooser dtpFechaNac;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButtonIniciar;
    private javax.swing.JButton jButtonRegistrarme;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelBienvenida;
    private javax.swing.JLabel jLabelMsjError;
    private javax.swing.JLabel jLabelUsuario;
    private javax.swing.JTextField jTextFieldUsuarioAlias;
    private javax.swing.JLabel lblAlias;
    private javax.swing.JLabel lblFechaNac;
    private javax.swing.JLabel lblInfo;
    private javax.swing.JLabel lblNombre;
    private javax.swing.JTextField txtAlias;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
