/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Sala319
 */
public class FrmHistoriaLaboral extends javax.swing.JFrame {

    /**
     * Creates new form FrmHistoriaLaboral
     */
    public FrmHistoriaLaboral() {
       initComponents();
        setLocationRelativeTo(this);
        setSize(650, 400); 
        this.jBtnAgregarHistorial.setEnabled(false);     
    }
    
     private void asignarFecha(){
            Calendar fecha = new GregorianCalendar();
            
            String hoy = "";
            System.out.println(fecha.get(Calendar.MONTH));
            int año = fecha.get(Calendar.YEAR);
            int mes = fecha.get(Calendar.MONTH)+1;
            int dia = fecha.get(Calendar.DAY_OF_MONTH);
     
            hoy = dia+"/"+mes+"/"+año; 
            
//             JOptionPane.showMessageDialog(rootPane, hoy);
             
             try{   
                    SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy ");
                    Date fechaDate = new Date();
                    fechaDate = formato.parse(hoy);              
                    
                                                          
                    this.jDateChooserFEgreso.setDate(fechaDate);
                    jDateChooserFEgreso.getDateEditor().setEnabled(false);
                    this.jDateChooserFIngreso.setDate(fechaDate);
                    jDateChooserFIngreso.getDateEditor().setEnabled(false);
                   
                    
                 
             }catch (ParseException ex){
                 JOptionPane.showMessageDialog(jTextDocumento, "No ha seleccionado ninguna fecha!!");
             //Logger.getLogger(FrmHistoriaLaboral.class.getName()).log(Level.SEVERE,null, ex);
         }
         } 
    
     public  void deshabilitarMenu(){
        jCbCodigoCargo.setEnabled(false);
        jCbCodigoOficina.setEnabled(false);
        jDateChooserFIngreso.setEnabled(false);
        jDateChooserFEgreso.setEnabled(false);
    } 
    
    public void habilitarMenu(){
        jCbCodigoCargo.setEnabled(true);
        jCbCodigoOficina.setEnabled(true);
        jDateChooserFIngreso.setEnabled(true);
        jDateChooserFEgreso.setEnabled(true);        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        jLbDocumento = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableHistoriaLaboral = new javax.swing.JTable();
        jBtnVerHisorial = new javax.swing.JButton();
        jBtnAdicionarHistorial = new javax.swing.JButton();
        jBtnAgregarHistorial = new javax.swing.JButton();
        jLbFechaIngreso = new javax.swing.JLabel();
        jLbFechaEgreso = new javax.swing.JLabel();
        jLbCodigoCargo = new javax.swing.JLabel();
        jLbCodigoOficina = new javax.swing.JLabel();
        jLblNombre = new javax.swing.JLabel();
        jTextNombre = new javax.swing.JTextField();
        jTextDocumento = new javax.swing.JTextField();
        jDateChooserFEgreso = new com.toedter.calendar.JDateChooser();
        jDateChooserFIngreso = new com.toedter.calendar.JDateChooser();
        jCbCodigoCargo = new javax.swing.JComboBox();
        jCbCodigoOficina = new javax.swing.JComboBox();
        jBtnNuevoHistorial = new javax.swing.JButton();
        jLbObligatorio = new javax.swing.JLabel();
        jLblAsterico = new javax.swing.JLabel();

        jScrollPane1.setViewportView(jTextPane1);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Historia Laboral de Empleados");
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jLbDocumento.setText("Documento: ");
        getContentPane().add(jLbDocumento);
        jLbDocumento.setBounds(10, 20, 75, 14);

        jTableHistoriaLaboral.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTableHistoriaLaboral);

        getContentPane().add(jScrollPane2);
        jScrollPane2.setBounds(10, 150, 617, 104);

        jBtnVerHisorial.setText("Ver Historial");
        jBtnVerHisorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnVerHisorialActionPerformed(evt);
            }
        });
        getContentPane().add(jBtnVerHisorial);
        jBtnVerHisorial.setBounds(60, 270, 112, 23);

        jBtnAdicionarHistorial.setText("Adicionar Historial");
        jBtnAdicionarHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAdicionarHistorialActionPerformed(evt);
            }
        });
        getContentPane().add(jBtnAdicionarHistorial);
        jBtnAdicionarHistorial.setBounds(180, 270, 142, 23);

        jBtnAgregarHistorial.setText("Agregar Historial");
        jBtnAgregarHistorial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBtnAgregarHistorialMouseEntered(evt);
            }
        });
        jBtnAgregarHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnAgregarHistorialActionPerformed(evt);
            }
        });
        getContentPane().add(jBtnAgregarHistorial);
        jBtnAgregarHistorial.setBounds(470, 270, 134, 23);

        jLbFechaIngreso.setText("Fecha de Ingreso: ");
        getContentPane().add(jLbFechaIngreso);
        jLbFechaIngreso.setBounds(20, 70, 110, 14);

        jLbFechaEgreso.setText("Fecha de Egreso: ");
        getContentPane().add(jLbFechaEgreso);
        jLbFechaEgreso.setBounds(350, 72, 110, 14);

        jLbCodigoCargo.setText("Cargo: ");
        getContentPane().add(jLbCodigoCargo);
        jLbCodigoCargo.setBounds(10, 50, 75, 14);

        jLbCodigoOficina.setText("Oficina: ");
        getContentPane().add(jLbCodigoOficina);
        jLbCodigoOficina.setBounds(350, 44, 60, 14);

        jLblNombre.setText("Nombre: ");
        getContentPane().add(jLblNombre);
        jLblNombre.setBounds(350, 21, 80, 14);
        getContentPane().add(jTextNombre);
        jTextNombre.setBounds(447, 11, 180, 20);

        jTextDocumento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextDocumentoActionPerformed(evt);
            }
        });
        jTextDocumento.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                jTextDocumentoFocusLost(evt);
            }
        });
        jTextDocumento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextDocumentoKeyTyped(evt);
            }
        });
        getContentPane().add(jTextDocumento);
        jTextDocumento.setBounds(120, 10, 170, 20);

        jDateChooserFEgreso.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDateChooserFEgresoPropertyChange(evt);
            }
        });
        getContentPane().add(jDateChooserFEgreso);
        jDateChooserFEgreso.setBounds(480, 70, 140, 20);

        jDateChooserFIngreso.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                jDateChooserFIngresoPropertyChange(evt);
            }
        });
        getContentPane().add(jDateChooserFIngreso);
        jDateChooserFIngreso.setBounds(140, 70, 150, 20);

        getContentPane().add(jCbCodigoCargo);
        jCbCodigoCargo.setBounds(120, 40, 170, 20);

        getContentPane().add(jCbCodigoOficina);
        jCbCodigoOficina.setBounds(450, 40, 180, 20);

        jBtnNuevoHistorial.setText("Nuevo Historial");
        jBtnNuevoHistorial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jBtnNuevoHistorialMouseEntered(evt);
            }
        });
        jBtnNuevoHistorial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnNuevoHistorialActionPerformed(evt);
            }
        });
        getContentPane().add(jBtnNuevoHistorial);
        jBtnNuevoHistorial.setBounds(330, 270, 134, 23);

        jLbObligatorio.setForeground(new java.awt.Color(255, 0, 0));
        jLbObligatorio.setText(" * Campo Obligatorio");
        getContentPane().add(jLbObligatorio);
        jLbObligatorio.setBounds(140, 90, 130, 20);

        jLblAsterico.setForeground(new java.awt.Color(255, 0, 51));
        jLblAsterico.setText("*");
        getContentPane().add(jLblAsterico);
        jLblAsterico.setBounds(10, 70, 20, 20);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBtnAdicionarHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAdicionarHistorialActionPerformed
        // TODO add your handling code here:
        jLbCodigoCargo.setVisible(true);
        jLbCodigoOficina.setVisible(true);
        jLbFechaEgreso.setVisible(true);
        jLbFechaIngreso.setVisible(true);
        jLbDocumento.setVisible(true);
        jLblNombre.setEnabled(true);
        jCbCodigoCargo.setVisible(true);
        jCbCodigoOficina.setVisible(true);
        jDateChooserFEgreso.setVisible(true);
        jDateChooserFIngreso.setVisible(true);
        jLblAsterico.setVisible(true);
        jTextDocumento.setVisible(true);
        jTextNombre.setVisible(true);  
        jBtnVerHisorial.setVisible(true);
        jBtnVerHisorial.setEnabled(false);
        jBtnAgregarHistorial.setVisible(true);
        jBtnAgregarHistorial.setEnabled(false);
        jBtnNuevoHistorial.setVisible(true);
        jBtnNuevoHistorial.setEnabled(true);
        jTextDocumento.setEnabled(false);
        jLbObligatorio.setVisible(true);
        jCbCodigoCargo.requestFocus();
        jLbObligatorio.setEnabled(true);
        
        this.habilitarMenu();
    }//GEN-LAST:event_jBtnAdicionarHistorialActionPerformed

    private void jBtnAgregarHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnAgregarHistorialActionPerformed
        // TODO add your handling code here:
//        jLbCodigoCargo.setVisible(false);
//        jLbCodigoOficina.setVisible(false);
//        jLbFechaIngreso.setVisible(false);
//        jLbFechaEgreso.setVisible(false);
//        jCbCodigoCargo.setVisible(false);
//        jCbCodigoOficina.setVisible(false);
//        jDateChooserFEgreso.setVisible(false);
//        jDateChooserFIngreso.setVisible(false);
//        //jBtnAgregarHistorial.setEnabled(false);
//        jBtnAdicionarHistorial.setEnabled(true);
//        jBtnVerHisorial.setEnabled(true);
//        jBtnAgregarHistorial.setVisible(false);
//        jTableHistoriaLaboral.setModel(new DefaultTableModel());
//        this.deshabilitarMenu();
    }//GEN-LAST:event_jBtnAgregarHistorialActionPerformed

    private void jBtnVerHisorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnVerHisorialActionPerformed
        // TODO add your handling code here:
        jLbDocumento.setEnabled(true);
        jLblNombre.setEnabled(true);
        jTextDocumento.setEnabled(true);
        jTextNombre.setEnabled(false);
        jBtnAdicionarHistorial.setEnabled(true);
        jBtnAgregarHistorial.setEnabled(true);
        
    }//GEN-LAST:event_jBtnVerHisorialActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        jLbCodigoCargo.setVisible(false);
        jLbCodigoOficina.setVisible(false);
        jLbFechaEgreso.setVisible(false);
        jLbFechaIngreso.setVisible(false);
        jCbCodigoCargo.setVisible(false);
        jCbCodigoOficina.setVisible(false);
        jDateChooserFEgreso.setVisible(false);
        jDateChooserFIngreso.setVisible(false);
//        jLbDocumento.setVisible(false);
        jLblNombre.setEnabled(true);
//        jTextDocumento.setVisible(false);
        jTextNombre.setEnabled(false);
        jBtnVerHisorial.setVisible(true);
        jBtnAdicionarHistorial.setEnabled(false);
        jBtnNuevoHistorial.setEnabled(false);
        jBtnAgregarHistorial.setVisible(false);
        jLbObligatorio.setVisible(false);
        jLblAsterico.setVisible(false);
        
        this.deshabilitarMenu();
        
    }//GEN-LAST:event_formWindowOpened

    private void jTextDocumentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextDocumentoActionPerformed
        // TODO add your handling code here:
        jBtnAdicionarHistorial.setEnabled(true);
        jBtnAgregarHistorial.setEnabled(false);
    }//GEN-LAST:event_jTextDocumentoActionPerformed

    private void jTextDocumentoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextDocumentoKeyTyped
        // TODO add your handling code here:
        char c = evt.getKeyChar();
           
        if (c < '0' || c > '9') {
            evt.consume();
        }

        String cadena = jTextDocumento.getText();
        if (cadena.length() >= 10) {
            evt.consume();
        }
        

    }//GEN-LAST:event_jTextDocumentoKeyTyped

    private void jTextDocumentoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jTextDocumentoFocusLost
        // TODO add your handling code here:
 
         int longitud = this.jTextDocumento.getText().length();
        
        
        if(longitud < 10){
           JOptionPane.showMessageDialog(jTextDocumento,"Debe Tener 10 Digitos");
        }
     
    }//GEN-LAST:event_jTextDocumentoFocusLost

    private void jBtnAgregarHistorialMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnAgregarHistorialMouseEntered
        // TODO add your handling code here:        
//        if(jTextDocumento.getText().length() > 0 && jDateChooserFIngreso.getDate().toString().equals("null")){
//            this.jBtnAgregarHistorial.setEnabled(true);
//        }
    }//GEN-LAST:event_jBtnAgregarHistorialMouseEntered

    private void jDateChooserFIngresoPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDateChooserFIngresoPropertyChange
        // TODO add your handling code here:
        ((JTextField)this.jDateChooserFIngreso.getDateEditor().getUiComponent()).setEditable(false);
        
        java.util.Date fecha = new Date();        
        if (this.jDateChooserFIngreso.getDate()!= null){  
         if  (this.jTextDocumento.getText() != null){
             this.jBtnAgregarHistorial.setEnabled(true);
         }
        }                 
    }//GEN-LAST:event_jDateChooserFIngresoPropertyChange

    private void jDateChooserFEgresoPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_jDateChooserFEgresoPropertyChange
        // TODO add your handling code here:
        ((JTextField)this.jDateChooserFEgreso.getDateEditor().getUiComponent()).setEditable(false);
        
    }//GEN-LAST:event_jDateChooserFEgresoPropertyChange

    private void jBtnNuevoHistorialMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnNuevoHistorialMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_jBtnNuevoHistorialMouseEntered

    private void jBtnNuevoHistorialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnNuevoHistorialActionPerformed
        // TODO add your handling code here:
        jBtnAgregarHistorial.setVisible(true);
        jTextDocumento.setEnabled(true);
        
    }//GEN-LAST:event_jBtnNuevoHistorialActionPerformed

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
            java.util.logging.Logger.getLogger(FrmHistoriaLaboral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmHistoriaLaboral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmHistoriaLaboral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmHistoriaLaboral.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmHistoriaLaboral().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton jBtnAdicionarHistorial;
    public javax.swing.JButton jBtnAgregarHistorial;
    public javax.swing.JButton jBtnNuevoHistorial;
    public javax.swing.JButton jBtnVerHisorial;
    public javax.swing.JComboBox jCbCodigoCargo;
    public javax.swing.JComboBox jCbCodigoOficina;
    public com.toedter.calendar.JDateChooser jDateChooserFEgreso;
    public com.toedter.calendar.JDateChooser jDateChooserFIngreso;
    public javax.swing.JLabel jLbCodigoCargo;
    public javax.swing.JLabel jLbCodigoOficina;
    public javax.swing.JLabel jLbDocumento;
    public javax.swing.JLabel jLbFechaEgreso;
    public javax.swing.JLabel jLbFechaIngreso;
    private javax.swing.JLabel jLbObligatorio;
    private javax.swing.JLabel jLblAsterico;
    public javax.swing.JLabel jLblNombre;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JTable jTableHistoriaLaboral;
    public javax.swing.JTextField jTextDocumento;
    public javax.swing.JTextField jTextNombre;
    private javax.swing.JTextPane jTextPane1;
    // End of variables declaration//GEN-END:variables
}
