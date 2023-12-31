/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package com.eloyvscifpaviles.gui;

import com.eloyvscifpaviles.dto.Aeropuerto;
import com.eloyvscifpaviles.dto.VueloBase;
import com.eloyvscifpaviles.logica.LogicaNegocio;
import java.util.Date;
import java.util.List;

/**
 *
 * @author eloyv
 */
public class dlgModificarVueloBase extends javax.swing.JDialog {

    /**
     * Creates new form dlgModificarVueloBase
     */
    public dlgModificarVueloBase(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }
    
    public dlgModificarVueloBase() {
        initComponents();
        recuperarAeropuertos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblHoraLlegada1 = new javax.swing.JLabel();
        btnAlta = new javax.swing.JButton();
        lblCodigo = new javax.swing.JLabel();
        lblAeroOrigen = new javax.swing.JLabel();
        lblAeroDestino = new javax.swing.JLabel();
        lblNumPlazas = new javax.swing.JLabel();
        lblHoraSalida = new javax.swing.JLabel();
        lblHoraLlegada = new javax.swing.JLabel();
        lblDias = new javax.swing.JLabel();
        txtCodigo = new javax.swing.JTextField();
        cbAeroOrigen2 = new javax.swing.JComboBox<>();
        cbAeroDestino = new javax.swing.JComboBox<>();
        txtPlazas = new javax.swing.JTextField();
        txtHoraSalida = new javax.swing.JTextField();
        txtMinSalida = new javax.swing.JTextField();
        lblHoraSalida1 = new javax.swing.JLabel();
        lblMinSalida = new javax.swing.JLabel();
        txtHoraLlegada = new javax.swing.JTextField();
        txtMinLlegada = new javax.swing.JTextField();
        lblHoraLlegada2 = new javax.swing.JLabel();
        lblMinllegada = new javax.swing.JLabel();
        txtDias = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btnLimpiar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        btnAeropuertos = new javax.swing.JButton();

        lblHoraLlegada1.setText("Horas (00 - 23)");

        btnAlta.setText("Alta");
        btnAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAltaActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblCodigo.setText("Código");

        lblAeroOrigen.setText("Aeropuerto Origen");

        lblAeroDestino.setText("Aeropuerto Destino");

        lblNumPlazas.setText("Número de plazas");

        lblHoraSalida.setText("Hora Salida");

        lblHoraLlegada.setText("Hora Llegada");

        lblDias.setText("Días que opera");

        cbAeroOrigen2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAeroOrigen2ActionPerformed(evt);
            }
        });

        cbAeroDestino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbAeroDestinoActionPerformed(evt);
            }
        });

        txtPlazas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPlazasActionPerformed(evt);
            }
        });

        txtMinSalida.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMinSalidaActionPerformed(evt);
            }
        });

        lblHoraSalida1.setText("Horas (00 - 23)");

        lblMinSalida.setText("Min (00 - 59)");

        lblHoraLlegada2.setText("Horas (00 - 23)");

        lblMinllegada.setText("Min (00 - 59)");

        jLabel8.setText("L - M - X - J - V - S -D");

        btnLimpiar.setText("Vaciar campos");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        btnAeropuertos.setText("Visualizar Aeropuertos");
        btnAeropuertos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAeropuertosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblAeroOrigen, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(cbAeroOrigen2, 0, 176, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblAeroDestino, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                            .addComponent(lblNumPlazas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblHoraSalida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblHoraLlegada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblDias, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE))
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCodigo)
                            .addComponent(cbAeroDestino, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtPlazas, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblHoraSalida1)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblMinSalida))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtHoraSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtMinSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtHoraLlegada, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtMinLlegada, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblHoraLlegada2)
                                        .addGap(18, 18, 18)
                                        .addComponent(lblMinllegada)))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtDias)
                            .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addComponent(btnAeropuertos)
                .addGap(41, 41, 41))
            .addGroup(layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(btnLimpiar)
                .addGap(83, 83, 83)
                .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigo)
                    .addComponent(txtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAeroOrigen)
                            .addComponent(cbAeroOrigen2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblAeroDestino)
                            .addComponent(cbAeroDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(btnAeropuertos, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumPlazas)
                    .addComponent(txtPlazas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHoraSalida1)
                    .addComponent(lblMinSalida))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHoraSalida)
                    .addComponent(txtHoraSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMinSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHoraLlegada2)
                    .addComponent(lblMinllegada))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHoraLlegada)
                    .addComponent(txtHoraLlegada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMinLlegada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblDias)
                    .addComponent(txtDias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLimpiar)
                    .addComponent(btnModificar))
                .addGap(29, 29, 29))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbAeroOrigen2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAeroOrigen2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbAeroOrigen2ActionPerformed

    private void cbAeroDestinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbAeroDestinoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbAeroDestinoActionPerformed

    private void txtPlazasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPlazasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPlazasActionPerformed

    private void txtMinSalidaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMinSalidaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMinSalidaActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtCodigo.setText("");
        txtPlazas.setText("");
        txtHoraSalida.setText("");
        txtMinSalida.setText("");
        txtHoraLlegada.setText("");
        txtMinLlegada.setText("");
        txtHoraSalida.setText("");
        txtDias.setText("");
        cbAeroOrigen2.setSelectedIndex(0);
        cbAeroDestino.setSelectedIndex(0);

    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAltaActionPerformed
   
    }//GEN-LAST:event_btnAltaActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        VueloBase vuelo= new VueloBase();
        String codigo = txtCodigo.getText();

        vuelo.setCodigoVuelo(txtCodigo.getText());
        vuelo.setCodAeroOrigen(cbAeroOrigen2.getSelectedItem().toString());
        vuelo.setCodAeroDestino(cbAeroDestino.getSelectedItem().toString());
        vuelo.setNumPlazas(Integer.parseInt(txtPlazas.getText()));
        int horaSalida = Integer.parseInt(txtHoraSalida.getText());
        int minSalida = Integer.parseInt(txtMinSalida.getText());
        Date salida = LogicaNegocio.getFechaByHora(horaSalida, minSalida);
        vuelo.setHoraSalida(salida);
        int horaLlegada = Integer.parseInt(txtHoraLlegada.getText());
        int minLlegada = Integer.parseInt(txtMinLlegada.getText());
        Date llegada = LogicaNegocio.getFechaByHora(horaLlegada, minLlegada);
        vuelo.setHoraLlegada(llegada);
        vuelo.setDias(txtDias.getText());

        LogicaNegocio.updateVueloBaseByCodigo(codigo, vuelo);
        LogicaNegocio.actualizarVueloBaseCSV();

    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnAeropuertosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAeropuertosActionPerformed
        dlgVisualizarAeropuertos aero = new dlgVisualizarAeropuertos();
        aero.setVisible(true);
    }//GEN-LAST:event_btnAeropuertosActionPerformed

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
            java.util.logging.Logger.getLogger(dlgModificarVueloBase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dlgModificarVueloBase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dlgModificarVueloBase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dlgModificarVueloBase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                dlgModificarVueloBase dialog = new dlgModificarVueloBase(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    
    public void recuperarAeropuertos() {
       
        List<Aeropuerto> aeropuertos = LogicaNegocio.leerAeropuertos();

        for (Aeropuerto a : aeropuertos) {
            cbAeroOrigen2.addItem(a.getCodigoIATA());
            cbAeroDestino.addItem(a.getCodigoIATA());
        }
        
        cbAeroOrigen2.setSelectedIndex(0);
        cbAeroDestino.setSelectedIndex(0);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAeropuertos;
    private javax.swing.JButton btnAlta;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JComboBox<String> cbAeroDestino;
    private javax.swing.JComboBox<String> cbAeroOrigen2;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel lblAeroDestino;
    private javax.swing.JLabel lblAeroOrigen;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblDias;
    private javax.swing.JLabel lblHoraLlegada;
    private javax.swing.JLabel lblHoraLlegada1;
    private javax.swing.JLabel lblHoraLlegada2;
    private javax.swing.JLabel lblHoraSalida;
    private javax.swing.JLabel lblHoraSalida1;
    private javax.swing.JLabel lblMinSalida;
    private javax.swing.JLabel lblMinllegada;
    private javax.swing.JLabel lblNumPlazas;
    private javax.swing.JTextField txtCodigo;
    private javax.swing.JTextField txtDias;
    private javax.swing.JTextField txtHoraLlegada;
    private javax.swing.JTextField txtHoraSalida;
    private javax.swing.JTextField txtMinLlegada;
    private javax.swing.JTextField txtMinSalida;
    private javax.swing.JTextField txtPlazas;
    // End of variables declaration//GEN-END:variables
}
