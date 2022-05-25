package View;

public class Tela_GUI extends javax.swing.JFrame {

    public Tela_GUI() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        botaoStart = new javax.swing.JButton();
        botaoInstrucao = new javax.swing.JButton();
        botaoSair = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setLayout(null);

        botaoStart.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Botão Iniciar.png"))); // NOI18N
        botaoStart.setToolTipText("INICIAR");
        botaoStart.setBorder(null);
        botaoStart.setBorderPainted(false);
        botaoStart.setContentAreaFilled(false);
        botaoStart.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoStart.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        botaoStart.setName(""); // NOI18N
        botaoStart.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoStartActionPerformed(evt);
            }
        });
        jPanel1.add(botaoStart);
        botaoStart.setBounds(560, 420, 240, 48);

        botaoInstrucao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Botão Instruções.png"))); // NOI18N
        botaoInstrucao.setBorderPainted(false);
        botaoInstrucao.setContentAreaFilled(false);
        botaoInstrucao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoInstrucao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoInstrucaoActionPerformed(evt);
            }
        });
        jPanel1.add(botaoInstrucao);
        botaoInstrucao.setBounds(560, 480, 240, 48);

        botaoSair.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Botão Sair.png"))); // NOI18N
        botaoSair.setBorderPainted(false);
        botaoSair.setContentAreaFilled(false);
        botaoSair.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        botaoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSairActionPerformed(evt);
            }
        });
        jPanel1.add(botaoSair);
        botaoSair.setBounds(560, 540, 240, 48);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Logo.png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(230, 60, 600, 170);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Luiza Oi.png"))); // NOI18N
        jPanel1.add(jLabel2);
        jLabel2.setBounds(90, 230, 290, 410);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Imagem Fundo.png"))); // NOI18N
        jPanel1.add(jLabel3);
        jLabel3.setBounds(0, -10, 850, 650);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 845, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 635, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    //códigos do botão SAIR abaixo:
    private void botaoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSairActionPerformed
      
       Controler.Tela_GUI_Dialogos.BotaoSair();

    }//GEN-LAST:event_botaoSairActionPerformed
    
    //códigos do botão START abaixo:
    private void botaoStartActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoStartActionPerformed
        
        Controler.Tela_GUI_Dialogos.start();
        this.dispose();
    }//GEN-LAST:event_botaoStartActionPerformed

    private void botaoInstrucaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoInstrucaoActionPerformed
        
        this.dispose();
        new View.telaInstrucoes().setVisible(true);
    }//GEN-LAST:event_botaoInstrucaoActionPerformed

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
            java.util.logging.Logger.getLogger(Tela_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoInstrucao;
    private javax.swing.JButton botaoSair;
    private javax.swing.JButton botaoStart;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
