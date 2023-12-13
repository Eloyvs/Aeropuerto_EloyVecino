/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package com.eloyvscifpaviles.gui;

import com.eloyvscifpaviles.dto.VueloBase;
import com.eloyvscifpaviles.dto.VueloDiario;
import com.eloyvscifpaviles.logica.LogicaNegocio;
import static com.eloyvscifpaviles.logica.LogicaNegocio.leerVuelosBase;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author eloyv
 */
public class dlgAltaVueloDiario extends javax.swing.JDialog {

    /**
     * Creates new form dlgAltaVueloDiario
     */
    public dlgAltaVueloDiario(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
    }

    public dlgAltaVueloDiario() {
        initComponents();
        recuperarCodigosVueloBase();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCodigo = new javax.swing.JLabel();
        lblFecha = new javax.swing.JLabel();
        lblHoraSalidaLabel = new javax.swing.JLabel();
        lblHoraLlegadaLabel = new javax.swing.JLabel();
        lblNumPlazas = new javax.swing.JLabel();
        lblPrecio = new javax.swing.JLabel();
        cbCodigosVuelos = new javax.swing.JComboBox<>();
        btnVuelos = new javax.swing.JButton();
        txtDia = new javax.swing.JTextField();
        txtMes = new javax.swing.JTextField();
        txtAnyo = new javax.swing.JTextField();
        txtHoraSalida = new javax.swing.JTextField();
        txtMinSalida = new javax.swing.JTextField();
        txtHoraLlegada = new javax.swing.JTextField();
        txtMinLlegada = new javax.swing.JTextField();
        txtPlazas = new javax.swing.JTextField();
        txtPrecio = new javax.swing.JTextField();
        btnAlta = new javax.swing.JButton();
        btnVaciar = new javax.swing.JButton();
        lblDia = new javax.swing.JLabel();
        lblMes = new javax.swing.JLabel();
        lblAnyo = new javax.swing.JLabel();
        lblHoraLlegada = new javax.swing.JLabel();
        lblHoraSalida = new javax.swing.JLabel();
        lblMinSalida = new javax.swing.JLabel();
        lblMinLlegada = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        lblCodigo.setText("Codigo Vuelo");

        lblFecha.setText("Fecha");

        lblHoraSalidaLabel.setText("Hora salida");

        lblHoraLlegadaLabel.setText("Hora llegada");

        lblNumPlazas.setText("Número de plazas");
        lblNumPlazas.setToolTipText("");

        lblPrecio.setText("Precio Vuelo");

        cbCodigosVuelos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbCodigosVuelosActionPerformed(evt);
            }
        });

        btnVuelos.setText("Ver vuelos base");
        btnVuelos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVuelosActionPerformed(evt);
            }
        });

        txtDia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDiaActionPerformed(evt);
            }
        });

        txtMes.setToolTipText("");

        txtPlazas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPlazasActionPerformed(evt);
            }
        });

        btnAlta.setText("Alta");
        btnAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAltaActionPerformed(evt);
            }
        });

        btnVaciar.setText("Vaciar campos");
        btnVaciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVaciarActionPerformed(evt);
            }
        });

        lblDia.setText("Día");

        lblMes.setText("Mes");

        lblAnyo.setText("Año");

        lblHoraLlegada.setText("Hora (00-23)");

        lblHoraSalida.setText("Hora (00-23)");

        lblMinSalida.setText("MInutos (00.59)");

        lblMinLlegada.setText("MInutos (00.59)");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(btnVaciar)
                .addGap(49, 49, 49)
                .addComponent(btnAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblNumPlazas, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                    .addComponent(lblPrecio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblHoraLlegadaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblHoraSalidaLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblFecha, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblCodigo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cbCodigosVuelos, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addComponent(btnVuelos)
                        .addGap(21, 21, 21))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtPlazas, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtHoraLlegada, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtMinLlegada, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtDia, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(20, 20, 20)
                                        .addComponent(lblDia, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtMes, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(lblMes, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(15, 15, 15)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtAnyo, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(14, 14, 14)
                                        .addComponent(lblAnyo, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblHoraLlegada)
                                .addGap(18, 18, 18)
                                .addComponent(lblMinLlegada, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtHoraSalida, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lblHoraSalida))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtMinSalida)
                                    .addComponent(lblMinSalida, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCodigo)
                    .addComponent(cbCodigosVuelos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVuelos))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblMes)
                    .addComponent(lblAnyo)
                    .addComponent(lblDia))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFecha)
                    .addComponent(txtDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAnyo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHoraSalida)
                    .addComponent(lblMinSalida))
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHoraSalidaLabel)
                    .addComponent(txtHoraSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMinSalida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblHoraLlegada)
                    .addComponent(lblMinLlegada))
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtHoraLlegada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHoraLlegadaLabel)
                    .addComponent(txtMinLlegada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblNumPlazas)
                    .addComponent(txtPlazas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPrecio)
                    .addComponent(txtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAlta, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVaciar, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbCodigosVuelosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbCodigosVuelosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbCodigosVuelosActionPerformed

    private void btnVuelosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVuelosActionPerformed
      dlgConsultaVueloBase vuelos = new dlgConsultaVueloBase();
      vuelos.setVisible(true);
    }//GEN-LAST:event_btnVuelosActionPerformed

    private void txtDiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDiaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDiaActionPerformed

    private void txtPlazasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPlazasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPlazasActionPerformed

    private void btnVaciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVaciarActionPerformed
       cbCodigosVuelos.setSelectedIndex(0);
       txtDia.setText("");
       txtMes.setText("");
       txtAnyo.setText("");
       txtHoraSalida.setText("");
       txtMinSalida.setText("");
       txtHoraLlegada.setText("");
       txtMinLlegada.setText("");
       txtPlazas.setText("");
       txtPrecio.setText("");
    }//GEN-LAST:event_btnVaciarActionPerformed

    private void btnAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAltaActionPerformed
       VueloDiario vD = new VueloDiario();
       
       vD.setCodigoVuelo(cbCodigosVuelos.getSelectedItem().toString());
       int dia = Integer.parseInt(txtDia.getText());
       int mes = Integer.parseInt(txtMes.getText());
       int anyo = Integer.parseInt(txtAnyo.getText());
       Date fecha = new Date (anyo - 1901, mes, dia);
       vD.setFechaVuelo(fecha);
       int horaSalida = Integer.parseInt(txtHoraSalida.getText());
       int minSalida = Integer.parseInt(txtMinSalida.getText());
       Date salida = LogicaNegocio.getFechaByHora(horaSalida, minSalida);
       vD.setHoraSalida(salida);
       int horaLlegada = Integer.parseInt(txtHoraLlegada.getText());
       int minLlegada = Integer.parseInt(txtMinLlegada.getText());
       Date llegada = LogicaNegocio.getFechaByHora(horaLlegada, minLlegada);
       vD.setHoraLlegada(llegada);
       vD.setNumPlazas(Integer.parseInt(txtPlazas.getText()));
       vD.setPrecioVuelo(Integer.parseInt(txtPrecio.getText()));
       VueloBase codigos = LogicaNegocio.getVueloBaseByCodigo(cbCodigosVuelos.getSelectedItem().toString());
       vD.setCodAeroOrigen(codigos.getCodAeroOrigen());
       vD.setCodAeroDestino(codigos.getCodAeroDestino());
       
       LogicaNegocio.guardarVueloDiarioCSV(vD);
       
    }//GEN-LAST:event_btnAltaActionPerformed

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
            java.util.logging.Logger.getLogger(dlgAltaVueloDiario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(dlgAltaVueloDiario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(dlgAltaVueloDiario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(dlgAltaVueloDiario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                dlgAltaVueloDiario dialog = new dlgAltaVueloDiario(new javax.swing.JFrame(), true);
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

    public void recuperarCodigosVueloBase() {
        List<VueloBase> vuelosBase = LogicaNegocio.leerVuelosBase();

        for (VueloBase v : vuelosBase) {
            cbCodigosVuelos.addItem(v.getCodigoVuelo());
        }
        
        cbCodigosVuelos.setSelectedIndex(0);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAeropuertos;
    private javax.swing.JButton btnAeropuertos1;
    private javax.swing.JButton btnAeropuertos2;
    private javax.swing.JButton btnAeropuertos3;
    private javax.swing.JButton btnAeropuertos4;
    private javax.swing.JButton btnAeropuertos5;
    private javax.swing.JButton btnAlta;
    private javax.swing.JButton btnVaciar;
    private javax.swing.JButton btnVuelos;
    private javax.swing.JComboBox<String> cbCodigosVuelos;
    private javax.swing.JLabel lblAnyo;
    private javax.swing.JLabel lblCodigo;
    private javax.swing.JLabel lblDia;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblHoraLlegada;
    private javax.swing.JLabel lblHoraLlegadaLabel;
    private javax.swing.JLabel lblHoraSalida;
    private javax.swing.JLabel lblHoraSalidaLabel;
    private javax.swing.JLabel lblMes;
    private javax.swing.JLabel lblMinLlegada;
    private javax.swing.JLabel lblMinSalida;
    private javax.swing.JLabel lblNumPlazas;
    private javax.swing.JLabel lblPrecio;
    private javax.swing.JTextField txtAnyo;
    private javax.swing.JTextField txtDia;
    private javax.swing.JTextField txtHoraLlegada;
    private javax.swing.JTextField txtHoraSalida;
    private javax.swing.JTextField txtMes;
    private javax.swing.JTextField txtMinLlegada;
    private javax.swing.JTextField txtMinSalida;
    private javax.swing.JTextField txtPlazas;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}