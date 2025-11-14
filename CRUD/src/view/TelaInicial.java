
package view;

public class TelaInicial extends javax.swing.JPanel {

    /**
     * Creates new form NewJPanel
     */
    public TelaInicial() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textoInicial = new javax.swing.JLabel();
        atualizarBtn = new javax.swing.JButton();
        cadastroBtn1 = new javax.swing.JButton();
        removerBtn = new javax.swing.JButton();
        visualizarBtn = new javax.swing.JButton();
        textoInicial1 = new javax.swing.JLabel();
        atualizarBtn1 = new javax.swing.JButton();
        cadastroBtn2 = new javax.swing.JButton();
        removerBtn1 = new javax.swing.JButton();
        visualizarBtn1 = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        textoInicial.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        textoInicial.setText("Selecione qual das opções...");

        atualizarBtn.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        atualizarBtn.setText("Atualizar");
        atualizarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizarBtnActionPerformed(evt);
            }
        });

        cadastroBtn1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        cadastroBtn1.setText("Cadastrar");
        cadastroBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroBtn1ActionPerformed(evt);
            }
        });

        removerBtn.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        removerBtn.setForeground(new java.awt.Color(230, 5, 5));
        removerBtn.setText("Remover");
        removerBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerBtnActionPerformed(evt);
            }
        });

        visualizarBtn.setFont(new java.awt.Font("Segoe UI Black", 1, 10)); // NOI18N
        visualizarBtn.setText("Visualizar Produtos");
        visualizarBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visualizarBtnActionPerformed(evt);
            }
        });

        textoInicial1.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        textoInicial1.setText("Selecione qual das opções...");

        atualizarBtn1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        atualizarBtn1.setText("Atualizar");
        atualizarBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                atualizarBtn1ActionPerformed(evt);
            }
        });

        cadastroBtn2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        cadastroBtn2.setText("Cadastrar");
        cadastroBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cadastroBtn2ActionPerformed(evt);
            }
        });

        removerBtn1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        removerBtn1.setForeground(new java.awt.Color(230, 5, 5));
        removerBtn1.setText("Remover");
        removerBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removerBtn1ActionPerformed(evt);
            }
        });

        visualizarBtn1.setFont(new java.awt.Font("Segoe UI Black", 1, 10)); // NOI18N
        visualizarBtn1.setText("Visualizar Produtos");
        visualizarBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                visualizarBtn1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(145, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(cadastroBtn2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(atualizarBtn1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(removerBtn1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(visualizarBtn1, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(textoInicial1)
                                .addGap(162, 162, 162)))))
                .addGap(26, 26, 26))
            .addGroup(layout.createSequentialGroup()
                .addGap(167, 167, 167)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(193, 193, 193)
                .addComponent(textoInicial1)
                .addGap(2, 2, 2)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 4, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(atualizarBtn1)
                    .addComponent(removerBtn1)
                    .addComponent(cadastroBtn2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 189, Short.MAX_VALUE)
                .addComponent(visualizarBtn1)
                .addGap(20, 20, 20))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void atualizarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizarBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_atualizarBtnActionPerformed

    private void cadastroBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroBtn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cadastroBtn1ActionPerformed

    private void removerBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_removerBtnActionPerformed

    private void visualizarBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visualizarBtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_visualizarBtnActionPerformed

    private void atualizarBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_atualizarBtn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_atualizarBtn1ActionPerformed

    private void cadastroBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cadastroBtn2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cadastroBtn2ActionPerformed

    private void removerBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removerBtn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_removerBtn1ActionPerformed

    private void visualizarBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_visualizarBtn1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_visualizarBtn1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton atualizarBtn;
    private javax.swing.JButton atualizarBtn1;
    private javax.swing.JButton cadastroBtn1;
    private javax.swing.JButton cadastroBtn2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JButton removerBtn;
    private javax.swing.JButton removerBtn1;
    private javax.swing.JLabel textoInicial;
    private javax.swing.JLabel textoInicial1;
    private javax.swing.JButton visualizarBtn;
    private javax.swing.JButton visualizarBtn1;
    // End of variables declaration//GEN-END:variables
}
