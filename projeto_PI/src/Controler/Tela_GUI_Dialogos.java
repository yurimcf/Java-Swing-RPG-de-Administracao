package Controler;

import View.Tela_GUI;
import javax.swing.JOptionPane;


public class Tela_GUI_Dialogos {
    
    //Classe para progrmar o botão sair.
    public static void BotaoSair() {

        Object [] op = {"SIM", "NÃO"};
        int x = JOptionPane.showOptionDialog(null, "Você gostaria de sair ?", "SAIR ?", 0, 3, null, op, "NÃO");
        
        if(x == 0){
            
            System.exit(0);
            
        }else{
        
        }
    }
    
    public static void start() {
        
        new View.telaGame().setVisible(true);
        View.telaGame.telaPause.setVisible(false);
        View.telaGame.jLabel8.setVisible(false);
        View.telaGame.jLabel9.setVisible(false);
        View.telaGame.jLabel10.setVisible(false);
        View.telaGame.barraDinheiro.setValue(50);
        View.telaGame.barraCliente.setValue(50);
        View.telaGame.barraFuncionarios.setValue(50);
        Controler.telaGame.pergunta();
    }
        
}

