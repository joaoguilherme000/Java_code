/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

/**
 *
 * @author LAB3M3
 */
public class Tela3_GUI extends javax.swing.JFrame {

    /**
     * Creates new form Tela3_GUI
     */
    public Tela3_GUI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        vinte = new javax.swing.JButton();
        cinquenta = new javax.swing.JButton();
        Cem = new javax.swing.JButton();
        trezentos = new javax.swing.JButton();
        Quinheintos = new javax.swing.JButton();
        novecentos = new javax.swing.JButton();
        quarenta = new javax.swing.JButton();
        Mil = new javax.swing.JButton();
        Background = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setLayout(null);

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(51, 51, 255));
        jTextField1.setBorder(null);
        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField1);
        jTextField1.setBounds(420, 250, 320, 50);

        vinte.setText("Vinte");
        jPanel1.add(vinte);
        vinte.setBounds(10, 230, 220, 80);

        cinquenta.setText("Quinta");
        jPanel1.add(cinquenta);
        cinquenta.setBounds(10, 520, 220, 80);

        Cem.setText("Cem");
        jPanel1.add(Cem);
        Cem.setBounds(10, 660, 230, 80);

        trezentos.setText("Trezentos");
        jPanel1.add(trezentos);
        trezentos.setBounds(820, 230, 220, 80);

        Quinheintos.setText("Quinhentos");
        jPanel1.add(Quinheintos);
        Quinheintos.setBounds(820, 370, 220, 80);

        novecentos.setText("Nove centos");
        jPanel1.add(novecentos);
        novecentos.setBounds(820, 520, 220, 80);

        quarenta.setText("Quarenta");
        quarenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quarentaActionPerformed(evt);
            }
        });
        jPanel1.add(quarenta);
        quarenta.setBounds(10, 370, 220, 80);

        Mil.setText("Mil");
        jPanel1.add(Mil);
        Mil.setBounds(823, 663, 210, 80);

        Background.setIcon(new javax.swing.ImageIcon("C:\\Users\\LAB3M3\\Desktop\\Virus.trojan.jpg")); // NOI18N
        Background.setBorderPainted(false);
        Background.setContentAreaFilled(false);
        Background.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackgroundActionPerformed(evt);
            }
        });
        jPanel1.add(Background);
        Background.setBounds(0, 0, 1040, 800);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1035, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 796, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1051, 835));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BackgroundActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackgroundActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BackgroundActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void quarentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quarentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quarentaActionPerformed

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
            java.util.logging.Logger.getLogger(Tela3_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela3_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela3_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela3_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela3_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Background;
    private javax.swing.JButton Cem;
    private javax.swing.JButton Mil;
    private javax.swing.JButton Quinheintos;
    private javax.swing.JButton cinquenta;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton novecentos;
    private javax.swing.JButton quarenta;
    private javax.swing.JButton trezentos;
    private javax.swing.JButton vinte;
    // End of variables declaration//GEN-END:variables
}