package View;

import Controler.TelaGame;

import static Controler.TelaGame.pergunta;
import javax.swing.JOptionPane;


/**
 *
 * @author lucas.scampos4
 */
public class telaGame extends javax.swing.JFrame {

    /**
     * Creates new form telaGame
     */
    public telaGame() {
        
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelGame = new javax.swing.JPanel();
        telaPause = new javax.swing.JPanel();
        voltarPause = new javax.swing.JButton();
        sairPause = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        barraFuncionarios = new javax.swing.JProgressBar();
        jLabel8 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        barraDinheiro = new javax.swing.JProgressBar();
        jLabel2 = new javax.swing.JLabel();
        barraCliente = new javax.swing.JProgressBar();
        jLabel10 = new javax.swing.JLabel();
        btnPause = new javax.swing.JButton();
        btnSim = new javax.swing.JButton();
        btnNao = new javax.swing.JButton();
        textQuestao = new javax.swing.JLabel();
        infoIcon = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setExtendedState(2);
        setUndecorated(true);
        setState(2);

        painelGame.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        painelGame.setPreferredSize(new java.awt.Dimension(1080, 720));
        painelGame.setLayout(null);

        telaPause.setEnabled(false);
        telaPause.setLayout(null);

        voltarPause.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Botão Voltar.png"))); // NOI18N
        voltarPause.setBorderPainted(false);
        voltarPause.setContentAreaFilled(false);
        voltarPause.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        voltarPause.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarPauseActionPerformed(evt);
            }
        });
        telaPause.add(voltarPause);
        voltarPause.setBounds(50, 220, 240, 50);

        sairPause.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Botão Sair.png"))); // NOI18N
        sairPause.setBorderPainted(false);
        sairPause.setContentAreaFilled(false);
        sairPause.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sairPause.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sairPauseActionPerformed(evt);
            }
        });
        telaPause.add(sairPause);
        sairPause.setBounds(50, 280, 240, 50);

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 48)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(32, 120, 140));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Pause menu");
        jLabel6.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        telaPause.add(jLabel6);
        jLabel6.setBounds(0, 10, 338, 50);

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Balão de EscritaMenor.png"))); // NOI18N
        telaPause.add(jLabel7);
        jLabel7.setBounds(0, 0, 340, 410);

        painelGame.add(telaPause);
        telaPause.setBounds(370, 100, 340, 410);

        jLabel3.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\vanes\\Downloads\\Empregados.png")); // NOI18N
        jLabel3.setToolTipText("Funcionarios");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        painelGame.add(jLabel3);
        jLabel3.setBounds(0, 10, 80, 80);

        barraFuncionarios.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        barraFuncionarios.setForeground(new java.awt.Color(159, 99, 0));
        barraFuncionarios.setStringPainted(true);
        painelGame.add(barraFuncionarios);
        barraFuncionarios.setBounds(90, 20, 260, 60);

        jLabel8.setText("Barra de funcionarios:");
        painelGame.add(jLabel8);
        jLabel8.setBounds(90, 80, 130, 20);

        jLabel1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\vanes\\Downloads\\Dinheiro.png")); // NOI18N
        jLabel1.setToolTipText("Dinheiro");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        painelGame.add(jLabel1);
        jLabel1.setBounds(360, 10, 80, 80);

        jLabel9.setText("Barra de dinheiro:");
        painelGame.add(jLabel9);
        jLabel9.setBounds(450, 80, 120, 20);

        barraDinheiro.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        barraDinheiro.setForeground(new java.awt.Color(0, 160, 33));
        barraDinheiro.setStringPainted(true);
        painelGame.add(barraDinheiro);
        barraDinheiro.setBounds(450, 20, 260, 60);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        jLabel2.setIcon(new javax.swing.ImageIcon("C:\\Users\\vanes\\Downloads\\Clientes.png")); // NOI18N
        jLabel2.setToolTipText("Clientes");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        painelGame.add(jLabel2);
        jLabel2.setBounds(720, 10, 80, 80);

        barraCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        barraCliente.setForeground(new java.awt.Color(0, 204, 204));
        barraCliente.setStringPainted(true);
        painelGame.add(barraCliente);
        barraCliente.setBounds(810, 20, 260, 60);

        jLabel10.setText("Barra de clientes:");
        painelGame.add(jLabel10);
        jLabel10.setBounds(810, 80, 110, 20);

        btnPause.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Pause.png"))); // NOI18N
        btnPause.setBorderPainted(false);
        btnPause.setContentAreaFilled(false);
        btnPause.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnPause.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPauseActionPerformed(evt);
            }
        });
        painelGame.add(btnPause);
        btnPause.setBounds(10, 650, 60, 60);

        btnSim.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Sim.png"))); // NOI18N
        btnSim.setBorderPainted(false);
        btnSim.setContentAreaFilled(false);
        btnSim.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSim.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimActionPerformed(evt);
            }
        });
        painelGame.add(btnSim);
        btnSim.setBounds(310, 620, 210, 72);

        btnNao.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Não.png"))); // NOI18N
        btnNao.setBorderPainted(false);
        btnNao.setContentAreaFilled(false);
        btnNao.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnNao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNaoActionPerformed(evt);
            }
        });
        painelGame.add(btnNao);
        btnNao.setBounds(550, 620, 210, 72);

        textQuestao.setFont(new java.awt.Font("Arial Narrow", 0, 24)); // NOI18N
        textQuestao.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        textQuestao.setAutoscrolls(true);
        textQuestao.setDebugGraphicsOptions(javax.swing.DebugGraphics.LOG_OPTION);
        textQuestao.setHorizontalTextPosition(javax.swing.SwingConstants.RIGHT);
        textQuestao.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textQuestaoMouseClicked(evt);
                textQuestaoMouseClickedBtnNao(evt);
            }
        });
        painelGame.add(textQuestao);
        textQuestao.setBounds(230, 160, 630, 410);

        infoIcon.setFont(new java.awt.Font("Times New Roman", 0, 36)); // NOI18N
        infoIcon.setText("?");
        infoIcon.setContentAreaFilled(false);
        infoIcon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                infoIconActionPerformed(evt);
            }
        });
        painelGame.add(infoIcon);
        infoIcon.setBounds(220, 590, 40, 30);

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Balão de Escrita.png"))); // NOI18N
        painelGame.add(jLabel4);
        jLabel4.setBounds(220, 150, 650, 435);

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/Imagem Fundo (1).png"))); // NOI18N
        jLabel5.setText("jLabel5");
        painelGame.add(jLabel5);
        jLabel5.setBounds(-6, -6, 1090, 730);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelGame, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelGame, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1080, 720));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnPauseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPauseActionPerformed
        
        TelaGame.botaoPause();
                
    }//GEN-LAST:event_btnPauseActionPerformed

    private void btnSimActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimActionPerformed
               
        TelaGame.mainSIM();
        if((barraDinheiro.getValue() == 0)|| (barraCliente.getValue() == 0) || (barraFuncionarios.getValue() == 0)){
                    
                Object [] op = {"Jogar novamente", "Sair"};
                int x = JOptionPane.showOptionDialog(null, "Você fracassou em gerir sua empresa, ela faliu por falta de recurso.", "!!!Que pena!!!",1, 1, null, op, "Jogar novamente");
        
                    if(x == 0){
            
                        pergunta();
                        barraDinheiro.setValue(50);
                        barraCliente.setValue(50);
                        barraFuncionarios.setValue(50);
                            
                    }else{
                        
                        this.dispose();
                        new View.Tela_GUI().setVisible(true);
                            
                        } 
            
            }else if ((barraDinheiro.getValue() == 100) || (barraCliente.getValue() == 100) || (barraFuncionarios.getValue() == 100)){
                
                 Object [] op = {"Jogar novamente", "Sair"};
                    int x = JOptionPane.showOptionDialog(null, "Você fracassou em gerir sua empresa, por não saber ivestir na sua empresa e foi taxado de ganacioso ganacioso!!", "!!!Que pena!!!", 0, 3, null, op, "Jogar novamente");
        
                        if(x == 0){
            
                            
                            View.telaGame.barraDinheiro.setValue(50);
                            View.telaGame.barraCliente.setValue(50);
                            View.telaGame.barraFuncionarios.setValue(50);
             
                        }else{
                            
                            this.dispose();
                            new View.Tela_GUI().setVisible(true);
                        
                    }
            }
        
    }//GEN-LAST:event_btnSimActionPerformed

    private void btnNaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNaoActionPerformed
        
        TelaGame.mainNAO();
        
        if((barraDinheiro.getValue() == 0)|| (barraCliente.getValue() == 0) || (barraFuncionarios.getValue() == 0)){
                    
                Object [] op = {"Jogar novamente", "Sair"};
                int x = JOptionPane.showOptionDialog(null, "Você fracassou em gerir sua empresa, ela faliu por falta de recurso.", "!!!Que pena!!!", 0, 3, null, op, "Jogar novamente");
        
                    if(x == 0){
            
                        pergunta();
                        barraDinheiro.setValue(50);
                        barraCliente.setValue(50);
                        barraFuncionarios.setValue(50);
                            
                    }else{
                        
                        this.dispose();
                        new View.Tela_GUI().setVisible(true);
                            
                        } 
            
            }else if ((barraDinheiro.getValue() == 100) || (barraCliente.getValue() == 100) || (barraFuncionarios.getValue() == 100)){
                
                 Object [] op = {"Jogar novamente", "Sair"};
                    int x = JOptionPane.showOptionDialog(null, "Você fracassou em gerir sua empresa, por ter um s!!", "!!!Que pena!!!", 0, 3, null, op, "Jogar novamente");
        
                        if(x == 0){
            
                            
                            View.telaGame.barraDinheiro.setValue(50);
                            View.telaGame.barraCliente.setValue(50);
                            View.telaGame.barraFuncionarios.setValue(50);
             
                        }else{
                            
                            this.dispose();
                            new View.Tela_GUI().setVisible(true);
                        
                    }
            }
    }//GEN-LAST:event_btnNaoActionPerformed

    private void sairPauseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sairPauseActionPerformed
    
        //Dentro do menu de pause, tem-se o botão sair.
        //Utilidade: Parar a partida e voltar para o menu inicial.
        Object [] op = {"SIM", "NÃO"};
        int x = JOptionPane.showOptionDialog(null, "Você gostaria de sair do jogo e retornar para o menu?", "SAIR DO JOGO?", 0, 3, null, op, "NÃO");
        
        if(x == 0){
            
            this.dispose();
            new View.Tela_GUI().setVisible(true);
            
        }
        
        
    }//GEN-LAST:event_sairPauseActionPerformed

    private void voltarPauseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarPauseActionPerformed
        
        TelaGame.botaoVoltar();
        
    }//GEN-LAST:event_voltarPauseActionPerformed

    private void textQuestaoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textQuestaoMouseClicked

    }//GEN-LAST:event_textQuestaoMouseClicked

    private void textQuestaoMouseClickedBtnNao(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textQuestaoMouseClickedBtnNao
        // TODO add your handling code here:
    }//GEN-LAST:event_textQuestaoMouseClickedBtnNao

    private void infoIconActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_infoIconActionPerformed
        
        TelaGame.check();
        
    }//GEN-LAST:event_infoIconActionPerformed

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
            java.util.logging.Logger.getLogger(telaGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaGame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaGame().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JProgressBar barraCliente;
    public static javax.swing.JProgressBar barraDinheiro;
    public static javax.swing.JProgressBar barraFuncionarios;
    public static javax.swing.JButton btnNao;
    public static javax.swing.JButton btnPause;
    public static javax.swing.JButton btnSim;
    public static javax.swing.JCheckBox infoIcon;
    private javax.swing.JLabel jLabel1;
    public static javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    public static javax.swing.JLabel jLabel8;
    public static javax.swing.JLabel jLabel9;
    public static javax.swing.JPanel painelGame;
    public static javax.swing.JButton sairPause;
    public static javax.swing.JPanel telaPause;
    public static javax.swing.JLabel textQuestao;
    public static javax.swing.JButton voltarPause;
    // End of variables declaration//GEN-END:variables
}
