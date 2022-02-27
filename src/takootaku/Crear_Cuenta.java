/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package takootaku;

import java.awt.Color;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import logicaproyecto.GenerarContraseña;
import logicaproyecto.Usuario;

public class Crear_Cuenta extends javax.swing.JFrame {
    
    public static ArrayList<Usuario> objUsuarios = new ArrayList<Usuario>();

    public  ArrayList<Usuario> getUsuarios(){
        return objUsuarios;
    }

    public Crear_Cuenta() {
        initComponents();
        setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel = new javax.swing.JPanel();
        cuadroimagen = new javax.swing.JLabel();
        titulocc = new javax.swing.JLabel();
        correo = new javax.swing.JLabel();
        txtcorreo = new javax.swing.JTextField();
        nombre = new javax.swing.JLabel();
        txtnombre = new javax.swing.JTextField();
        contra = new javax.swing.JLabel();
        txtcontra = new javax.swing.JPasswordField();
        confirmarcontra = new javax.swing.JLabel();
        txtconfirmarcontra = new javax.swing.JPasswordField();
        btncrear = new javax.swing.JPanel();
        txtcrear = new javax.swing.JLabel();
        generarcontra = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel.setBackground(new java.awt.Color(255, 255, 255));

        cuadroimagen.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        cuadroimagen.setText("imagen");

        titulocc.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        titulocc.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        titulocc.setText("CREAR CUENTA");

        correo.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        correo.setText("Correo electrónico");

        txtcorreo.setForeground(new java.awt.Color(204, 204, 204));
        txtcorreo.setText("Ingrese una direccion de correo");
        txtcorreo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtcorreoMousePressed(evt);
            }
        });

        nombre.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        nombre.setText("Nombre de usuario");

        txtnombre.setForeground(new java.awt.Color(204, 204, 204));
        txtnombre.setText("Ingrese su nombre de usuario");
        txtnombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtnombreMousePressed(evt);
            }
        });

        contra.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        contra.setText("Contraseña");

        txtcontra.setForeground(new java.awt.Color(204, 204, 204));
        txtcontra.setText("********");
        txtcontra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtcontraMousePressed(evt);
            }
        });

        confirmarcontra.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        confirmarcontra.setText("Confirmar contraseña");

        txtconfirmarcontra.setForeground(new java.awt.Color(204, 204, 204));
        txtconfirmarcontra.setText("********");
        txtconfirmarcontra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txtconfirmarcontraMousePressed(evt);
            }
        });

        txtcrear.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txtcrear.setText("CREAR CUENTA");
        txtcrear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txtcrear.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtcrearMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout btncrearLayout = new javax.swing.GroupLayout(btncrear);
        btncrear.setLayout(btncrearLayout);
        btncrearLayout.setHorizontalGroup(
            btncrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtcrear, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
        );
        btncrearLayout.setVerticalGroup(
            btncrearLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txtcrear, javax.swing.GroupLayout.DEFAULT_SIZE, 29, Short.MAX_VALUE)
        );

        generarcontra.setBackground(new java.awt.Color(255, 255, 255));
        generarcontra.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        generarcontra.setForeground(new java.awt.Color(0, 153, 255));
        generarcontra.setText("Generar contraseña");
        generarcontra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        generarcontra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                generarcontraMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(cuadroimagen, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(titulocc, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtcorreo)
                            .addComponent(txtnombre)
                            .addComponent(txtcontra)
                            .addComponent(txtconfirmarcontra)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(correo, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(contra, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(confirmarcontra, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                                .addComponent(generarcontra))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btncrear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panelLayout.createSequentialGroup()
                        .addComponent(titulocc)
                        .addGap(18, 18, 18)
                        .addComponent(correo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtcorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(nombre)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtnombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(contra)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtcontra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(confirmarcontra))
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(generarcontra)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtconfirmarcontra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(cuadroimagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addComponent(btncrear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

    private void txtcorreoMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtcorreoMousePressed
        if(txtcorreo.getText().contains("Ingrese una direccion de correo"))
        {
            txtcorreo.setText("");
            txtcorreo.setForeground(Color.black);
        }
        if(String.valueOf(txtcontra.getPassword()).isEmpty())
        {
            txtcontra.setText("********");
            txtcontra.setForeground(Color.gray);
        }
         else
            if(String.valueOf(txtconfirmarcontra.getPassword()).isEmpty())
            {
                txtconfirmarcontra.setText("********");
                txtconfirmarcontra.setForeground(Color.gray);
            }
        else
                if(txtnombre.getText().isEmpty())
                {
                    txtnombre.setText("Ingrese su nombre de usuario");
                    txtnombre.setForeground(Color.gray);
                } 
    }//GEN-LAST:event_txtcorreoMousePressed

    private void txtnombreMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtnombreMousePressed
        if(txtnombre.getText().contains("Ingrese su nombre de usuario"))
        {
            txtnombre.setText("");
            txtnombre.setForeground(Color.black);
        }
        if(String.valueOf(txtcontra.getPassword()).isEmpty())
        {
            txtcontra.setText("********");
            txtcontra.setForeground(Color.gray);
        }
        else
            if(String.valueOf(txtconfirmarcontra.getPassword()).isEmpty() )
            {
                txtconfirmarcontra.setText("********");
                txtconfirmarcontra.setForeground(Color.gray);
            }
        else
                if(txtcorreo.getText().isEmpty())
                    {
                        txtcorreo.setText("Ingrese una direccion de correo");
                        txtcorreo.setForeground(Color.gray);
                    }
    }//GEN-LAST:event_txtnombreMousePressed

    private void txtcontraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtcontraMousePressed
        if(String.valueOf(txtcontra.getPassword()).contains("********"))
        {
            txtcontra.setText("");
            txtcontra.setForeground(Color.black);
        }
        if(txtcorreo.getText().isEmpty())
        {
            txtcorreo.setText("Ingrese una direccion de correo");
            txtcorreo.setForeground(Color.gray);
        }
        else
            if(String.valueOf(txtconfirmarcontra.getPassword()).isEmpty() )
            {
                txtconfirmarcontra.setText("********");
                txtconfirmarcontra.setForeground(Color.gray);
            }
        else
                if(txtnombre.getText().isEmpty())
                {
                    txtnombre.setText("Ingrese su nombre de usuario");
                    txtnombre.setForeground(Color.gray);
                }
    }//GEN-LAST:event_txtcontraMousePressed

    private void txtconfirmarcontraMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtconfirmarcontraMousePressed
        if(String.valueOf(txtconfirmarcontra.getPassword()).contains("********"))
        {
            txtconfirmarcontra.setText("");
            txtconfirmarcontra.setForeground(Color.black);
        }
        if(txtcorreo.getText().isEmpty())
        {
            txtcorreo.setText("Ingrese una direccion de correo");
            txtcorreo.setForeground(Color.gray);
        }
        else
            if(String.valueOf(txtcontra.getPassword()).isEmpty() )
            {
                txtcontra.setText("********");
                txtcontra.setForeground(Color.gray);
            }
            else
                 if(txtnombre.getText().isEmpty())
                    {
                        txtnombre.setText("Ingrese su nombre de usuario");
                        txtnombre.setForeground(Color.gray);
                    }
    }//GEN-LAST:event_txtconfirmarcontraMousePressed

    private void generarcontraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_generarcontraMouseClicked
        GenerarContraseña objContra = new GenerarContraseña(8);
        String clave = objContra.generarContra();
        txtcontra.setText(clave);
        txtcontra.setForeground(Color.black);
        txtconfirmarcontra.setText(clave);
        txtconfirmarcontra.setForeground(Color.black);
    }//GEN-LAST:event_generarcontraMouseClicked

    private void txtcrearMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtcrearMouseClicked
        if(!(String.valueOf(txtcontra.getPassword()).equals(String.valueOf(txtconfirmarcontra.getPassword()))))
           JOptionPane.showMessageDialog(this, "Las contraseñas no concuerdan, intente ingresarlas nuevamente", "Registro", JOptionPane.ERROR_MESSAGE);
        else
        {
            if(!(VerificarCorreo(txtcorreo.getText())))
            {
                JOptionPane.showMessageDialog(this, "El correo ingresado no es valido, Intente nuevamente, intente ingresarlo nuevamente", "Registro", JOptionPane.ERROR_MESSAGE);
            }
            else
            {
                if(UsuarioExiste(txtnombre.getText())){
                   JOptionPane.showMessageDialog(this, "El Usuario ingresado no esta Disponible, intente con un nuevo nombre", "Registro", JOptionPane.ERROR_MESSAGE);
                }
                else
                {
                   if(CorreoRegistrado(txtcorreo.getText()))
                   {
                       JOptionPane.showMessageDialog(this, "El correo ingresado ya existe, intente ingresar un nuevo correo", "Registro", JOptionPane.ERROR_MESSAGE);
                   }
                   else
                    {
                    InicioSesion objiniciosesion = new InicioSesion();
                    String correo = txtcorreo.getText();
                    String nombre = txtnombre.getText();
                    String clave = String.valueOf(txtcontra.getPassword());
                    Usuario objUsuario = new Usuario(nombre, correo, clave);
                    objUsuarios.add(objUsuario);
                    System.out.println(clave);
                    //Indicar a usuario que todo correcto
                    JOptionPane.showMessageDialog(this, "Cuenta creada con exito", "Registro", JOptionPane.INFORMATION_MESSAGE);
                    //Esto sirve para cerrar ventana y guardar array
                    this.setVisible(false);
                    objiniciosesion.setVisible(true);
                    }
                }
            }
        }
    }//GEN-LAST:event_txtcrearMouseClicked
    
    ///Merodo para verificar correo
    public boolean VerificarCorreo(String correo)
    {
        Pattern patron = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"+"[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
        Matcher mat = patron.matcher(correo);
        //si se cumple los requisitos da true si no da false
        return mat.find();
    }
    
    public boolean UsuarioExiste(String username){
        boolean existe=false;
        for (Usuario usuario : objUsuarios) {
            if(usuario.getNombre().equals(username)){
                existe=true;
                break;
            }
        }
        return existe;
    }
    
    public boolean CorreoRegistrado(String correo)
    {
         boolean existe=false;
        for (Usuario usuario : objUsuarios) {
            if(usuario.getCorreo().equals(correo)){
                existe=true;
                break;
            }
        }
        return existe;
    }
    
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
            java.util.logging.Logger.getLogger(Crear_Cuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Crear_Cuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Crear_Cuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Crear_Cuenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Crear_Cuenta().setVisible(true);
            }
        });
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel btncrear;
    private javax.swing.JLabel confirmarcontra;
    private javax.swing.JLabel contra;
    private javax.swing.JLabel correo;
    private javax.swing.JLabel cuadroimagen;
    private javax.swing.JLabel generarcontra;
    private javax.swing.JLabel nombre;
    private javax.swing.JPanel panel;
    private javax.swing.JLabel titulocc;
    private javax.swing.JPasswordField txtconfirmarcontra;
    private javax.swing.JPasswordField txtcontra;
    private javax.swing.JTextField txtcorreo;
    private javax.swing.JLabel txtcrear;
    private javax.swing.JTextField txtnombre;
    // End of variables declaration//GEN-END:variables
}
