/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import controlador.Metodos_libro;
import java.text.SimpleDateFormat;
import javax.swing.JOptionPane;
import java.util.Calendar;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author Usuario
 */
public class Agregar_libros extends javax.swing.JFrame {
    Metodos_libro metl = new Metodos_libro();
    modelo.Libros lib= null;
    /**
     * Creates new form Agregar_libros
     */
    public Agregar_libros() {
        initComponents();
        Modificar_libros libr = new Modificar_libros();
        String nomb = libr.nombre;
        
        modelo.Libros libro = new Metodos_libro().Buscarlibro(nomb);
        txt_ICBN.setText(String.valueOf(libro.getIcbn()));
        txt_nombreAL.setText(libro.getNombre());
        txt_numeroP.setText(String.valueOf(libro.getNum_pag()));
        txt_edicion.setText(String.valueOf(libro.getEdicion()));
        txt_fechaP.setText(String.valueOf(libro.getFecha()));
        txt_nombreE.setText(libro.getNom_edt());
        txt_autorID.setText(String.valueOf(libro.getAutor_id()));
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btn_agregarAL = new javax.swing.JButton();
        btn_regresarAL = new javax.swing.JButton();
        btn_salirAL = new javax.swing.JButton();
        txt_ICBN = new javax.swing.JTextField();
        txt_nombreAL = new javax.swing.JTextField();
        txt_numeroP = new javax.swing.JTextField();
        txt_edicion = new javax.swing.JTextField();
        txt_fechaP = new javax.swing.JTextField();
        txt_nombreE = new javax.swing.JTextField();
        txt_autorID = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Agregar libros");

        jLabel2.setText("ICBN:");

        jLabel3.setText("Nombre:");

        jLabel4.setText("Numero de paginas :");

        jLabel5.setText("Edicion :");

        jLabel6.setText("Fecha de Publicacion:");

        jLabel7.setText("Nombre de editorial:");

        jLabel8.setText("Autor ID:");

        btn_agregarAL.setText("Actualizar");
        btn_agregarAL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_agregarALActionPerformed(evt);
            }
        });

        btn_regresarAL.setText("Regresar");
        btn_regresarAL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_regresarALActionPerformed(evt);
            }
        });

        btn_salirAL.setText("SALIR");
        btn_salirAL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirALActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txt_edicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_fechaP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_nombreE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_autorID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_ICBN, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_nombreAL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txt_numeroP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(165, 165, 165)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel8))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(btn_agregarAL)
                        .addGap(38, 38, 38)
                        .addComponent(btn_regresarAL)
                        .addGap(35, 35, 35)
                        .addComponent(btn_salirAL)))
                .addContainerGap(71, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {txt_ICBN, txt_autorID, txt_edicion, txt_fechaP, txt_nombreAL, txt_nombreE, txt_numeroP});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txt_ICBN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txt_nombreAL, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txt_numeroP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txt_edicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txt_fechaP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txt_nombreE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txt_autorID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_agregarAL)
                    .addComponent(btn_regresarAL)
                    .addComponent(btn_salirAL))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_salirALActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirALActionPerformed
this.dispose();
    }//GEN-LAST:event_btn_salirALActionPerformed

    private void btn_regresarALActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_regresarALActionPerformed
  Menu me=new Menu();
  me.setVisible(true);
  this.setVisible(false);

    }//GEN-LAST:event_btn_regresarALActionPerformed

    private void btn_agregarALActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_agregarALActionPerformed
        
          if(!txt_nombreAL.getText().trim().equals("")
                && JOptionPane.showConfirmDialog(this, "Seguro que desea guardar datos",
                        "Ingreso Cliente", JOptionPane.OK_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE)==0){
            
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            Date fechanac=null;
            modelo.Libros cliente= new modelo.Libros(
                    Integer.parseInt(txt_ICBN.getText()), 
                    txt_nombreAL.getText(), 
                    Integer.parseInt(txt_numeroP.getText()), 
                    Integer.parseInt(txt_edicion.getText()),
                    java.sql.Date.valueOf(txt_fechaP.getText()), 
                    txt_nombreE.getText(), 
                    Integer.parseInt(txt_autorID.getText()));
            metl.Actualizarlibro(cliente);
        }
        
    }//GEN-LAST:event_btn_agregarALActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_agregarAL;
    private javax.swing.JButton btn_regresarAL;
    private javax.swing.JButton btn_salirAL;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField txt_ICBN;
    private javax.swing.JTextField txt_autorID;
    private javax.swing.JTextField txt_edicion;
    private javax.swing.JTextField txt_fechaP;
    private javax.swing.JTextField txt_nombreAL;
    private javax.swing.JTextField txt_nombreE;
    private javax.swing.JTextField txt_numeroP;
    // End of variables declaration//GEN-END:variables
}
