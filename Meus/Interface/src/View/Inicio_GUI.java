
package View;
import javax.swing.JOptionPane;

public class Inicio_GUI extends javax.swing.JFrame {

    public Inicio_GUI() {
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

        jPanel6 = new javax.swing.JPanel();
        valor1 = new javax.swing.JTextField();
        valor2 = new javax.swing.JTextField();
        fechar = new javax.swing.JButton();
        soma = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        res = new javax.swing.JTextPane();
        limpar = new javax.swing.JButton();
        dividir = new javax.swing.JButton();
        subtrair = new javax.swing.JButton();
        multiplicar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel6.setBackground(new java.awt.Color(0, 153, 153));
        jPanel6.setLayout(null);

        valor1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Valor1", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        valor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valor1ActionPerformed(evt);
            }
        });
        jPanel6.add(valor1);
        valor1.setBounds(20, 10, 140, 40);

        valor2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Valor2", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Tahoma", 1, 14))); // NOI18N
        jPanel6.add(valor2);
        valor2.setBounds(20, 70, 140, 40);

        fechar.setText("Fechar");
        fechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fecharActionPerformed(evt);
            }
        });
        jPanel6.add(fechar);
        fechar.setBounds(390, 390, 100, 40);

        soma.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        soma.setText("+");
        soma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                somaActionPerformed(evt);
            }
        });
        jPanel6.add(soma);
        soma.setBounds(20, 220, 60, 60);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Resultado:");
        jPanel6.add(jLabel3);
        jLabel3.setBounds(170, 10, 90, 40);

        jScrollPane1.setViewportView(res);

        jPanel6.add(jScrollPane1);
        jScrollPane1.setBounds(260, 10, 170, 40);

        limpar.setText("Limpar");
        limpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limparActionPerformed(evt);
            }
        });
        jPanel6.add(limpar);
        limpar.setBounds(390, 340, 100, 40);

        dividir.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        dividir.setText("/");
        dividir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dividirActionPerformed(evt);
            }
        });
        jPanel6.add(dividir);
        dividir.setBounds(20, 310, 60, 60);

        subtrair.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        subtrair.setText("-");
        subtrair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subtrairActionPerformed(evt);
            }
        });
        jPanel6.add(subtrair);
        subtrair.setBounds(120, 310, 60, 60);

        multiplicar.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        multiplicar.setText("*");
        multiplicar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multiplicarActionPerformed(evt);
            }
        });
        jPanel6.add(multiplicar);
        multiplicar.setBounds(120, 220, 60, 60);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 493, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void valor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valor1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valor1ActionPerformed

    private void fecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fecharActionPerformed
        dispose();
    }//GEN-LAST:event_fecharActionPerformed

    private void somaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_somaActionPerformed
       
        double v1 = Double.parseDouble(valor1.getText()); 
        double v2 = Double.parseDouble(valor2.getText()); 
        double val = v1 + v2;
        
        res.setText(String.valueOf(val));
    }//GEN-LAST:event_somaActionPerformed

    private void limparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limparActionPerformed
        valor1.setText(""); 
        valor2.setText("");
        res.setText("");
    }//GEN-LAST:event_limparActionPerformed

    private void multiplicarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multiplicarActionPerformed
        double v1 = Double.parseDouble(valor1.getText()); 
        double v2 = Double.parseDouble(valor2.getText()); 
        double val = v1 * v2;
        
        res.setText(String.valueOf(val));
    }//GEN-LAST:event_multiplicarActionPerformed

    private void dividirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dividirActionPerformed
        double v1 = Double.parseDouble(valor1.getText()); 
        double v2 = Double.parseDouble(valor2.getText()); 
        double val = v1 / v2;
        
        res.setText(String.valueOf(val));
    }//GEN-LAST:event_dividirActionPerformed

    private void subtrairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subtrairActionPerformed
        double v1 = Double.parseDouble(valor1.getText()); 
        double v2 = Double.parseDouble(valor2.getText()); 
        double val = v1 - v2;
        
        res.setText(String.valueOf(val));
    }//GEN-LAST:event_subtrairActionPerformed

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
            java.util.logging.Logger.getLogger(Inicio_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton dividir;
    private javax.swing.JButton fechar;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton limpar;
    private javax.swing.JButton multiplicar;
    private javax.swing.JTextPane res;
    private javax.swing.JButton soma;
    private javax.swing.JButton subtrair;
    private javax.swing.JTextField valor1;
    private javax.swing.JTextField valor2;
    // End of variables declaration//GEN-END:variables
}
