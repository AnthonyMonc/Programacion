/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaz;

import controlador.Metodos_libro;
import java.awt.Graphics;
import java.awt.Image;
import java.util.List;
import java.util.Vector;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;




/**
 *
 * @author antho
 */
public class Libros extends javax.swing.JFrame {

     FondoPanel fondo =new FondoPanel();

    private DefaultTableModel dtm;
    Metodos_libro metl = new Metodos_libro();

    /**
     * Creates new form Libros
     */
    public Libros() {
        
        
               this.setContentPane(fondo);
  
        
        
        initComponents();
        List<modelo.Libros> libro = metl.ListarLibro();
        dtm = (DefaultTableModel) tbl_libros.getModel();
        
        for (modelo.Libros li: libro) {
           Vector fila = new Vector();
//            fila.add(au.getId_autor());
            fila.add(li.getIcbn());
            fila.add(li.getNombre());
            fila.add(li.getNum_pag());
            fila.add(li.getEdicion());
            fila.add(li.getFecha());
            fila.add(li.getNom_edt());
            fila.add(li.getAutor_id());
            dtm.addRow(fila);
        }
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_libros = new javax.swing.JTable();
        btn_regresarL = new javax.swing.JButton();
        btn_salirL = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        txt_busq = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("LIBROS");

        tbl_libros.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ICBN", "Nombre", "Numero de Pag.", "Edicion", "Fecha_publicacion", "Nombre editorial", "Autor ID"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbl_libros);

        btn_regresarL.setText("Regresar");
        btn_regresarL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_regresarLActionPerformed(evt);
            }
        });

        btn_salirL.setText("Salir");
        btn_salirL.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_salirLActionPerformed(evt);
            }
        });

        jButton1.setText("BUSCAR");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setText("LIBRO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(55, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(txt_busq, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1)
                .addGap(57, 57, 57)
                .addComponent(btn_regresarL)
                .addGap(103, 103, 103))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(168, 168, 168)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(btn_salirL))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_regresarL)
                    .addComponent(jButton1)
                    .addComponent(txt_busq, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(btn_salirL)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_regresarLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_regresarLActionPerformed
        
  Menu me=new Menu();
    me.getJ_cliente().setEnabled(true);
    me.getJ_autor().setEnabled(true);
    me.getJ_libros().setEnabled(true);
  me.setVisible(true);
  this.setVisible(false);

    }//GEN-LAST:event_btn_regresarLActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        dtm = (DefaultTableModel) tbl_libros.getModel();
        String id = txt_busq.getText();
            modelo.Libros consultaLibro = new Metodos_libro().Buscarlibro(id);
            eliminar();
            Vector fila = new Vector();
            fila.add(consultaLibro.getIcbn());
            fila.add(consultaLibro.getNombre());
            fila.add(consultaLibro.getNum_pag());
            fila.add(consultaLibro.getEdicion());
            fila.add(consultaLibro.getFecha());
            fila.add(consultaLibro.getNom_edt());
            fila.add(consultaLibro.getAutor_id());
            dtm.addRow(fila);
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btn_salirLActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_salirLActionPerformed
        this.dispose();        
    }//GEN-LAST:event_btn_salirLActionPerformed

    public void eliminar(){ 
     try{
        DefaultTableModel dtm = (DefaultTableModel) tbl_libros.getModel();
        int a = tbl_libros.getRowCount()-1;
        for (int i = a; i >= 0; i--) {           
        dtm.removeRow(dtm.getRowCount()-1);
        } 
     }catch(Exception ex){
         System.out.println("Error al limpiar tabla");
     }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_regresarL;
    private javax.swing.JButton btn_salirL;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tbl_libros;
    private javax.swing.JTextField txt_busq;
    // End of variables declaration//GEN-END:variables

class FondoPanel extends JPanel{
        private Image imagen ;
        
        
        @Override
        public void paint(Graphics g){
            
            imagen = new ImageIcon(getClass().getResource("/imagenes/3.jpg")).getImage();
            
            g.drawImage(imagen, 0, 0,getWidth(), getHeight(), this );
            
            setOpaque(false);
            
            super.paint(g);
        }
    }
    
  

}
