
package takootaku;

import java.awt.Color;
import javax.swing.JOptionPane;
import logicaproyecto.Usuario;
import logicaproyecto.hash;

public class InicioSesion extends javax.swing.JFrame {
    
    private Crear_Cuenta objcrear = new Crear_Cuenta();

    public InicioSesion() {
        initComponents();
        setLocationRelativeTo(null);
        this.ocultar.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<>();
        panel = new javax.swing.JPanel();
        CuadroImagen = new javax.swing.JLabel();
        TituloInicioSesion = new javax.swing.JLabel();
        Correo = new javax.swing.JLabel();
        txtCorreo = new javax.swing.JTextField();
        Contraseña = new javax.swing.JLabel();
        btniIngresar = new javax.swing.JPanel();
        txtentrar = new javax.swing.JLabel();
        btncrearcuenta = new javax.swing.JPanel();
        txtccuenta = new javax.swing.JLabel();
        txtcontra = new javax.swing.JPasswordField();
        ver = new javax.swing.JLabel();
        ocultar = new javax.swing.JLabel();

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel.setBackground(new java.awt.Color(255, 255, 255));

        CuadroImagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        CuadroImagen.setText("IMAGEN");

        TituloInicioSesion.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        TituloInicioSesion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TituloInicioSesion.setText("INICIAR SESION");

        Correo.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        Correo.setText("CORREO DE USUARIO");

        txtCorreo.setForeground(new java.awt.Color(204, 204, 204));
        txtCorreo.setText("Ingrese el correo de su usuario");
        txtCorreo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtCorreoMousePressed(evt);
            }
        });

        Contraseña.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        Contraseña.setText("CONTRASEÑA");

        txtentrar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtentrar.setText("INGRESAR");
        txtentrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtentrarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btniIngresarLayout = new javax.swing.GroupLayout(btniIngresar);
        btniIngresar.setLayout(btniIngresarLayout);
        btniIngresarLayout.setHorizontalGroup(
            btniIngresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtentrar, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        btniIngresarLayout.setVerticalGroup(
            btniIngresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtentrar, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        txtccuenta.setFont(new java.awt.Font("Segoe UI", 2, 10)); // NOI18N
        txtccuenta.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtccuenta.setText("Crear cuenta");
        txtccuenta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtccuenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtccuentaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btncrearcuentaLayout = new javax.swing.GroupLayout(btncrearcuenta);
        btncrearcuenta.setLayout(btncrearcuentaLayout);
        btncrearcuentaLayout.setHorizontalGroup(
            btncrearcuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtccuenta, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        btncrearcuentaLayout.setVerticalGroup(
            btncrearcuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtccuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        txtcontra.setForeground(new java.awt.Color(204, 204, 204));
        txtcontra.setText("********");
        txtcontra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtcontraMousePressed(evt);
            }
        });
        txtcontra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcontraActionPerformed(evt);
            }
        });

        ver.setText("Ver");
        ver.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                verMouseClicked(evt);
            }
        });

        ocultar.setText("Ocultar");
        ocultar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        ocultar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ocultarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(CuadroImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TituloInicioSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Correo, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Contraseña, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(txtcontra, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(7, 7, 7)
                                .addComponent(ver))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGap(255, 255, 255)
                                .addComponent(ocultar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))))))
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(205, 205, 205)
                .addComponent(btncrearcuenta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(91, 91, 91)
                .addComponent(btniIngresar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CuadroImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(TituloInicioSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34)
                        .addComponent(Correo)
                        .addGap(7, 7, 7)
                        .addComponent(txtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(Contraseña)
                        .addGap(7, 7, 7)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtcontra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(ver))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(ocultar)))))
                .addGap(7, 7, 7)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btncrearcuenta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btniIngresar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 13, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCorreoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtCorreoMousePressed
        if(txtCorreo.getText().contains("Ingrese el correo de su usuario"))
        {
            txtCorreo.setText("");
            txtCorreo.setForeground(Color.black);
        }
        if(String.valueOf(txtcontra.getPassword()).isEmpty())
        {
            txtcontra.setText("********");
            txtcontra.setForeground(Color.gray);   
        }
    }//GEN-LAST:event_txtCorreoMousePressed

    private void txtcontraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcontraActionPerformed
        //Se puso por ERROR
    }//GEN-LAST:event_txtcontraActionPerformed

    private void txtcontraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtcontraMousePressed
        if(String.valueOf(txtcontra.getPassword()).contains("********"))
        {
            txtcontra.setText("");
            txtcontra.setForeground(Color.black);
        }
        if(txtCorreo.getText().isEmpty())
        {
            txtCorreo.setText("Ingrese el correo de su usuario");
            txtCorreo.setForeground(Color.gray);
        }
    }//GEN-LAST:event_txtcontraMousePressed

    private void txtccuentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtccuentaMouseClicked
        dispose();
        objcrear.setVisible(true);
    }//GEN-LAST:event_txtccuentaMouseClicked

    private void txtentrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtentrarMouseClicked
        Crear_Cuenta CrearCuenta = new Crear_Cuenta();
        Menu_Principal objMenu = new Menu_Principal();
        System.out.println(CrearCuenta.getUsuarios());
        boolean control=false;
        if(!(CrearCuenta.getUsuarios().isEmpty()))
        {
            if(!(txtCorreo.getText().equals("")) && !(txtcontra.getPassword().equals("")))
            {
                for (Usuario usuario : CrearCuenta.getUsuarios()) 
                {
                    //if((usuario.getCorreo().equals(this.txtCorreo.getText()))&&(usuario.getContraseña().equals(String.valueOf(this.txtcontra.getPassword()))))
                    if((usuario.getCorreo().equals(hash.sha1(this.txtCorreo.getText().toLowerCase())))&&(usuario.getContraseña().equals(hash.sha1(String.valueOf(this.txtcontra.getPassword())))))
                    {
                        JOptionPane.showMessageDialog(this, "Inicio de sesion exitoso. Bienvenido", "Inicio de sesion", JOptionPane.INFORMATION_MESSAGE);
                        control=true;
                        dispose();
                        objMenu.setVisible(true);
                        break;
                    }
                    if((usuario.getCorreo().equals(this.txtCorreo.getText()))&&(!(usuario.getContraseña().equals(String.valueOf(this.txtcontra.getPassword())))))
                    {
                        JOptionPane.showMessageDialog(this, "El usuario existe pero la contrsena es incorrecta", "Inicio de sesion", JOptionPane.INFORMATION_MESSAGE);
                        txtcontra.setText("");
                        break;
                    }
                }
                if(control!=true)
                {
                    JOptionPane.showMessageDialog(this, "Revise los datos que escribio en los campos de informacion sean correctos, intente nuevamente", "Inicio de sesion", JOptionPane.CANCEL_OPTION);
                    
                }
            }
            else
                JOptionPane.showMessageDialog(this, "No ingreso datos en los campos", "Inicio de sesion", JOptionPane.CANCEL_OPTION);

        }
        else
        {
            JOptionPane.showMessageDialog(this, "No hay usuarios registrados", "Inicio de sesion", JOptionPane.ERROR_MESSAGE);
            System.out.print("NO HAY USUSARIOS REGISTRADOS");
        }
    }//GEN-LAST:event_txtentrarMouseClicked

    private void verMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_verMouseClicked
        ver.setVisible(false);
        ocultar.setVisible(true);
        txtcontra.setEchoChar((char)0);
    }//GEN-LAST:event_verMouseClicked

    private void ocultarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ocultarMouseClicked
        ver.setVisible(true);
        ocultar.setVisible(false);
        txtcontra.setEchoChar('*');
    }//GEN-LAST:event_ocultarMouseClicked

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
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InicioSesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InicioSesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Contraseña;
    private javax.swing.JLabel Correo;
    private javax.swing.JLabel CuadroImagen;
    private javax.swing.JLabel TituloInicioSesion;
    private javax.swing.JPanel btncrearcuenta;
    private javax.swing.JPanel btniIngresar;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel ocultar;
    private javax.swing.JPanel panel;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JLabel txtccuenta;
    private javax.swing.JPasswordField txtcontra;
    private javax.swing.JLabel txtentrar;
    private javax.swing.JLabel ver;
    // End of variables declaration//GEN-END:variables
}
