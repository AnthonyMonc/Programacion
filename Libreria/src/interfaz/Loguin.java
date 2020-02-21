/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package interfaz;



import controlador.Metodo_usuario;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import modelo.Usuario;

/**
 *
 * @author Usuario
 */
public class Loguin extends javax.swing.JFrame{
        FondoPanel fondo =new FondoPanel();
    
    
    Usuario usua = new Usuario();
    Metodo_usuario met = new Metodo_usuario();
    
    /** Creates new form Loguin */
    public Loguin() {
        
        this.setContentPane(fondo);
        
        initComponents();
        
        setTitle("Ingreso al Sistema");
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblloguin = new javax.swing.JLabel();
        lbl_usuario = new javax.swing.JLabel();
        lbl_contraseña = new javax.swing.JLabel();
        txt_usuario = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        btn_regresar = new javax.swing.JButton();
        psw_contr = new javax.swing.JPasswordField();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblloguin.setText("Usuario");

        lbl_usuario.setText("Usuario");

        lbl_contraseña.setText("Contraseña");

        txt_usuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_usuarioActionPerformed(evt);
            }
        });

        jButton1.setText("Ingresar ");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btn_regresar.setText("Regresar");
        btn_regresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_regresarActionPerformed(evt);
            }
        });

        jButton2.setText("Agregar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(lblloguin))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbl_usuario)
                            .addComponent(lbl_contraseña))
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(psw_contr, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                            .addComponent(txt_usuario)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(jButton1)
                        .addGap(64, 64, 64)
                        .addComponent(btn_regresar)))
                .addContainerGap(75, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(154, 154, 154))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(lblloguin)
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_usuario)
                    .addComponent(txt_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbl_contraseña)
                    .addComponent(psw_contr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(btn_regresar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_usuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_usuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_usuarioActionPerformed

    private void btn_regresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_regresarActionPerformed
    Menu me=new Menu();
    me.setVisible(true);
    this.setVisible(false);
    }//GEN-LAST:event_btn_regresarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        autenticar();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        Agregar_usuario  a = new Agregar_usuario();
        a.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void autenticar() {
        
        Usuario perfil;
        Menu men = new Menu();
        System.out.println(txt_usuario.getText() + " " + psw_contr.getPassword());
        perfil = met.Perfiles(txt_usuario.getText(), new String(psw_contr.getPassword()));

        if (perfil != null && perfil.getPermiso() == 'c') { //cliente
            
            System.out.println(txt_usuario.getText() + " " + psw_contr.getPassword());
            men.getJ_administrador().setEnabled(false);
            men.getJ_cliente().setEnabled(true);
            men.getJ_libros().setEnabled(true);
            men.getJ_autor().setEnabled(true);
            men.getJ_Mautores().setEnabled(false);
            men.getJ_Mlibros().setEnabled(false);
            dispose();
            men.setVisible(true);
            
            JOptionPane.showMessageDialog(this, perfil.getNombre2() + " autenticado con éxito", "EXITO", JOptionPane.INFORMATION_MESSAGE);

        } else if (perfil != null && perfil.getPermiso() == 'a') { //administrador
            
            men.getJ_administrador().setEnabled(true);
            men.getJ_cliente().setEnabled(true);
            men.getJ_libros().setEnabled(true);
            men.getJ_autor().setEnabled(true);
            men.getJ_Mautores().setEnabled(true);
            men.getJ_Mlibros().setEnabled(true);
            dispose();
            men.setVisible(true);
            
            JOptionPane.showMessageDialog(this, perfil.getNombre2() + " autenticado con éxito", "EXITO", JOptionPane.INFORMATION_MESSAGE);

        } else { //autenticacion fallida
            dispose();
            men.getJ_administrador().setEnabled(false);
            men.getJ_cliente().setEnabled(false);
            men.setVisible(true);
            JOptionPane.showMessageDialog(this, "Credenciales invalidas", "FAIL", JOptionPane.ERROR_MESSAGE);
        }
        dispose();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_regresar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel lbl_contraseña;
    private javax.swing.JLabel lbl_usuario;
    private javax.swing.JLabel lblloguin;
    private javax.swing.JPasswordField psw_contr;
    private javax.swing.JTextField txt_usuario;
    // End of variables declaration//GEN-END:variables


    class FondoPanel extends JPanel{
        private Image imagen ;
        
        
        @Override
        public void paint(Graphics g){
            
            imagen = new ImageIcon(getClass().getResource("/imagenes/2.jpg")).getImage();
            
            g.drawImage(imagen, 0, 0,getWidth(), getHeight(), this );
            
            setOpaque(false);
            
            super.paint(g);
        }
    }
    
    
}
