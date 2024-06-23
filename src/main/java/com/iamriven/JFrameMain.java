/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.iamriven;

import java.awt.Desktop;
import java.awt.Dimension;
import java.io.IOException;
import java.net.URL;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.SpinnerNumberModel;

import java.net.URI;

/**
 *
 * @author Juan Antonio
 */
public class JFrameMain extends javax.swing.JFrame {

        /**
         * Creates new form JFrameMain
         */
        public JFrameMain() {
                initComponents();
                cargarEquipamiento();

                /**
                 * ! TODO: CAMBIAR ESTO
                 * try {
                 * Desktop.getDesktop().browse(new URL("https://github.com/IAmRiven").toURI());
                 * } catch (Exception e) {
                 * JOptionPane.showMessageDialog(rootPane, "Ha ocurrido un error, prueba de
                 * nuevo.");
                 * }
                 */

        }

        /**
         * This method is called from within the constructor to initialize the form.
         * WARNING: Do NOT modify this code. The content of this method is always
         * regenerated by the Form Editor.
         */
        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated
        // <editor-fold defaultstate="collapsed" desc="Generated
        // <editor-fold defaultstate="collapsed" desc="Generated
        // <editor-fold defaultstate="collapsed" desc="Generated
        // <editor-fold defaultstate="collapsed" desc="Generated
        // <editor-fold defaultstate="collapsed" desc="Generated
        // <editor-fold defaultstate="collapsed" desc="Generated
        // <editor-fold defaultstate="collapsed" desc="Generated
        // <editor-fold defaultstate="collapsed" desc="Generated
        // <editor-fold defaultstate="collapsed" desc="Generated
        // <editor-fold defaultstate="collapsed" desc="Generated
        // <editor-fold defaultstate="collapsed" desc="Generated
        // <editor-fold defaultstate="collapsed" desc="Generated
        // <editor-fold defaultstate="collapsed" desc="Generated
        // <editor-fold defaultstate="collapsed" desc="Generated
        // <editor-fold defaultstate="collapsed" desc="Generated
        // <editor-fold defaultstate="collapsed" desc="Generated
        // <editor-fold defaultstate="collapsed" desc="Generated
        // <editor-fold defaultstate="collapsed" desc="Generated
        // <editor-fold defaultstate="collapsed" desc="Generated
        // <editor-fold defaultstate="collapsed" desc="Generated
        // <editor-fold defaultstate="collapsed" desc="Generated
        // <editor-fold defaultstate="collapsed" desc="Generated
        // <editor-fold defaultstate="collapsed" desc="Generated
        // <editor-fold defaultstate="collapsed" desc="Generated
        // <editor-fold defaultstate="collapsed" desc="Generated
        // <editor-fold defaultstate="collapsed" desc="Generated
        // <editor-fold defaultstate="collapsed" desc="Generated
        // <editor-fold defaultstate="collapsed" desc="Generated
        // <editor-fold defaultstate="collapsed" desc="Generated
        // <editor-fold defaultstate="collapsed" desc="Generated
        // <editor-fold defaultstate="collapsed" desc="Generated
        // Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jLabel1 = new javax.swing.JLabel();
                jRadioButton1Crons = new javax.swing.JRadioButton();
                jLabel2 = new javax.swing.JLabel();
                jComboBox3ElegirNivel = new javax.swing.JComboBox<>();
                jLabel3 = new javax.swing.JLabel();
                jComboBoxEquipo = new javax.swing.JComboBox<>();
                jLabel4 = new javax.swing.JLabel();
                jTextField1Porcentaje = new javax.swing.JTextField();
                jLabel5 = new javax.swing.JLabel();
                jScrollPane1 = new javax.swing.JScrollPane();
                jTextArea1 = new javax.swing.JTextArea();
                jSpinner1 = new javax.swing.JSpinner();
                jButton1Calcular = new javax.swing.JButton();
                jMenuBar1 = new javax.swing.JMenuBar();
                jMenu1 = new javax.swing.JMenu();
                jMenuItem1BotonVersion = new javax.swing.JMenuItem();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                setTitle("Calculadora de Black Desert Online");
                setResizable(false);

                jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
                jLabel1.setText("Calculadora para Black Desert Online");

                jRadioButton1Crons.setText("Utilizar cronilitas");
                jRadioButton1Crons.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jRadioButton1CronsActionPerformed(evt);
                        }
                });

                jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
                jLabel2.setText("Equipamiento a calcular");

                jComboBox3ElegirNivel.setModel(new javax.swing.DefaultComboBoxModel<>(
                                new String[] { "Elegir nivel", "PRI", "DUO", "TRI", "TET", "PEN" }));

                jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
                jLabel3.setText("Elegir nivel de encantamiento");

                jComboBoxEquipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Elegir equipo" }));

                jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
                jLabel4.setText("% de éxito");

                jTextField1Porcentaje.setText("00.00");
                jTextField1Porcentaje.setToolTipText("");
                jTextField1Porcentaje.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jTextField1PorcentajeActionPerformed(evt);
                        }
                });

                jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
                jLabel5.setText("Número de intentos");

                jTextArea1.setEditable(false);
                jTextArea1.setColumns(20);
                jTextArea1.setRows(5);
                jScrollPane1.setViewportView(jTextArea1);

                jSpinner1.setValue(1);

                jButton1Calcular.setText("Calcular");
                jButton1Calcular.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton1CalcularActionPerformed(evt);
                        }
                });

                jMenu1.setBorder(null);
                jMenu1.setText("Help");
                jMenu1.setToolTipText("");

                jMenuItem1BotonVersion.setText("Version");
                jMenuItem1BotonVersion.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jMenuItem1BotonVersionActionPerformed(evt);
                        }
                });
                jMenu1.add(jMenuItem1BotonVersion);

                jMenuBar1.add(jMenu1);

                setJMenuBar(jMenuBar1);

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                                .addGap(37, 37, 37)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                .addComponent(jLabel1)
                                                                                .addGroup(layout.createParallelGroup(
                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                                .addGroup(layout.createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                .addComponent(jLabel2,
                                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                169,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                .addComponent(jComboBoxEquipo,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                175,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                                .addGap(29, 29, 29)
                                                                                                                .addComponent(jRadioButton1Crons))
                                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                                .addGroup(layout.createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                                                false)
                                                                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                                                                .addGap(6, 6, 6)
                                                                                                                                                .addComponent(jLabel3,
                                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                                169,
                                                                                                                                                                Short.MAX_VALUE))
                                                                                                                                .addComponent(jComboBox3ElegirNivel,
                                                                                                                                                0,
                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                Short.MAX_VALUE)
                                                                                                                                .addComponent(jButton1Calcular,
                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                Short.MAX_VALUE))
                                                                                                                .addGap(35, 35, 35)
                                                                                                                .addGroup(layout.createParallelGroup(
                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                .addComponent(jLabel4,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                169,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                .addComponent(jTextField1Porcentaje,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                46,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                .addComponent(jLabel5,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                169,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                                .addComponent(jSpinner1,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                82,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                                .addPreferredGap(
                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                .addComponent(jScrollPane1,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                                .addContainerGap(38, Short.MAX_VALUE)));
                layout.setVerticalGroup(
                                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addGroup(layout.createSequentialGroup()
                                                                .addComponent(jLabel1,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                82,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(12, 12, 12)
                                                                .addGroup(layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                .addComponent(jLabel2)
                                                                                                .addGap(8, 8, 8)
                                                                                                .addGroup(layout.createParallelGroup(
                                                                                                                javax.swing.GroupLayout.Alignment.BASELINE)
                                                                                                                .addComponent(jRadioButton1Crons)
                                                                                                                .addComponent(jComboBoxEquipo,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                .addGap(29, 29, 29)
                                                                                                .addGroup(layout.createParallelGroup(
                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                                                .addGroup(layout.createParallelGroup(
                                                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                                                .addComponent(jLabel4,
                                                                                                                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                                                                                .addComponent(jLabel3))
                                                                                                                                .addGap(8, 8, 8)
                                                                                                                                .addComponent(jComboBox3ElegirNivel,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                                                .addGap(22, 22, 22)
                                                                                                                                .addComponent(jTextField1Porcentaje,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                                                                                .addGroup(layout.createParallelGroup(
                                                                                                                javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                                .addGroup(layout.createSequentialGroup()
                                                                                                                                .addGap(33, 33, 33)
                                                                                                                                .addComponent(jLabel5)
                                                                                                                                .addPreferredGap(
                                                                                                                                                javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                                                                                .addComponent(jSpinner1,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                                                layout.createSequentialGroup()
                                                                                                                                                .addGap(30, 30, 30)
                                                                                                                                                .addComponent(jButton1Calcular,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                                                                                51,
                                                                                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                                                .addComponent(jScrollPane1,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                                230,
                                                                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addContainerGap(31, Short.MAX_VALUE)));

                pack();
        }// </editor-fold>//GEN-END:initComponents

        private void jTextField1PorcentajeActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jTextField1PorcentajeActionPerformed

        }// GEN-LAST:event_jTextField1PorcentajeActionPerformed

        private void jButton1CalcularActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jButton1CalcularActionPerformed
                DecimalFormat formato = new DecimalFormat("###,###");
                String nombre_equipo = (String) jComboBoxEquipo.getSelectedItem();
                int id = Query.recuperarID(nombre_equipo);
                float precio = 0;
                double coste_medio = 0;
                double fallo = Double.parseDouble(jTextField1Porcentaje.getText());
                if (jComboBox3ElegirNivel.getSelectedItem() == "PRI") {
                        precio = RequestPrice.recuperarPrecio(id, 1);
                        coste_medio = (precio * 2) / (fallo / 100);
                        jTextArea1.setText("El coste medio es: " + formato.format(coste_medio));
                } else if (jComboBox3ElegirNivel.getSelectedItem() == "DUO") {
                        precio = RequestPrice.recuperarPrecio(id, 2);
                        coste_medio = (precio * 2) / (fallo / 100);
                        jTextArea1.setText("El coste medio es: " + formato.format(coste_medio));
                } else if (jComboBox3ElegirNivel.getSelectedItem() == "TRI") {
                        precio = RequestPrice.recuperarPrecio(id, 3);
                        coste_medio = (precio * 2) / (fallo / 100);
                        jTextArea1.setText("El coste medio es: " + formato.format(coste_medio));

                } else if (jComboBox3ElegirNivel.getSelectedItem() == "TET") {
                        precio = RequestPrice.recuperarPrecio(id, 4);
                        coste_medio = (precio * 2) / (fallo / 100);
                        jTextArea1.setText("El coste medio es: " + formato.format(coste_medio));
                } else if (jComboBox3ElegirNivel.getSelectedItem() == "PEN") {
                        precio = RequestPrice.recuperarPrecio(id, 5);
                        coste_medio = (precio * 2) / (fallo / 100);
                        jTextArea1.setText("El coste medio es: " + formato.format(coste_medio));
                }
        }// GEN-LAST:event_jButton1CalcularActionPerformed

        private void jComboBoxEquipoActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jComboBoxEquipoActionPerformed
        }// GEN-LAST:event_jComboBoxEquipoActionPerformed

        private void jRadioButton1CronsActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jRadioButton1CronsActionPerformed
        }// GEN-LAST:event_jRadioButton1CronsActionPerformed

        private void jComboBox3ElegirNivelActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jComboBox3ElegirNivelActionPerformed
        }// GEN-LAST:event_jComboBox3ElegirNivelActionPerformed

        private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) throws IOException {// GEN-FIRST:event_jButton1ActionPerformed

        }

        private void jMenuItem1BotonVersionActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_jMenuItem1BotonVersionActionPerformed
                JOptionPane.showMessageDialog(rootPane, "Versión: 0.1\nCreado por: IAmRiven (Riiveeen in game)");
        }// GEN-LAST:event_jMenuItem1BotonVersionActionPerformed

        /**
         * @param args the command line arguments
         */
        public static void main(String args[]) {
                /* Set the Nimbus look and feel */
                // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
                // (optional) ">
                /*
                 * If Nimbus (introduced in Java SE 6) is not available, stay with the default
                 * look and feel.
                 * For details see
                 * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
                 */
                try {
                        for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager
                                        .getInstalledLookAndFeels()) {
                                if ("Nimbus".equals(info.getName())) {
                                        javax.swing.UIManager.setLookAndFeel(info.getClassName());
                                        break;
                                }
                        }
                } catch (ClassNotFoundException ex) {
                        java.util.logging.Logger.getLogger(JFrameMain.class.getName()).log(
                                        java.util.logging.Level.SEVERE, null,
                                        ex);
                } catch (InstantiationException ex) {
                        java.util.logging.Logger.getLogger(JFrameMain.class.getName()).log(
                                        java.util.logging.Level.SEVERE, null,
                                        ex);
                } catch (IllegalAccessException ex) {
                        java.util.logging.Logger.getLogger(JFrameMain.class.getName()).log(
                                        java.util.logging.Level.SEVERE, null,
                                        ex);
                } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                        java.util.logging.Logger.getLogger(JFrameMain.class.getName()).log(
                                        java.util.logging.Level.SEVERE, null,
                                        ex);
                }
                // </editor-fold>

                /* Create and display the form */
                java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                                new JFrameMain().setVisible(true);
                        }

                });
        }

        public void cargarEquipamiento() {
                List<Equipamiento> equipamiento = Query.recuperarEquipamiento();
                for (Equipamiento meter_equipo : equipamiento) {
                        jComboBoxEquipo.addItem(meter_equipo.getNombre());
                }
        }

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton jButton1Calcular;
        private javax.swing.JComboBox<String> jComboBox3ElegirNivel;
        private javax.swing.JComboBox<String> jComboBoxEquipo;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JMenu jMenu1;
        private javax.swing.JMenuBar jMenuBar1;
        private javax.swing.JMenuItem jMenuItem1BotonVersion;
        private javax.swing.JRadioButton jRadioButton1Crons;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JSpinner jSpinner1;
        private javax.swing.JTextArea jTextArea1;
        private javax.swing.JTextField jTextField1Porcentaje;
        // End of variables declaration//GEN-END:variables
}
