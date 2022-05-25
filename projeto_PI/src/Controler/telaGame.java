package Controler;

import static View.telaGame.*;
import java.util.*;
import javax.swing.JOptionPane;

public class telaGame {
    
    //comandos para chedBox.
    public static void check(){
    
        if(infoIcon.isSelected() == true){
            
            jLabel8.setVisible(true);
            jLabel9.setVisible(true);
            jLabel10.setVisible(true);
        
        }else{
        
            jLabel8.setVisible(false);
            jLabel9.setVisible(false);
            jLabel10.setVisible(false);
        }
    
    }
    
    //Botão puase: Abre o menu de pause.
    public static void botaoPause(){
        
        telaPause.setVisible(true);
        btnSim.setEnabled(false);
        btnNao.setEnabled(false);
        textQuestao.setEnabled(false);
        btnPause.setEnabled(false);
        barraDinheiro.setEnabled(false);
        barraCliente.setEnabled(false);
        barraFuncionarios.setEnabled(false);
        infoIcon.setEnabled(false);
    }
    
    //Dentro do menu de pause, tem-se o botão voltar.
    //Utilidade: Sair do menu de pause e voltar para a partida.
    public static void botaoVoltar(){
        
        telaPause.setVisible(false);
        btnSim.setEnabled(true);
        btnNao.setEnabled(true);
        textQuestao.setEnabled(true);
        btnPause.setEnabled(true);
        barraDinheiro.setEnabled(true);
        barraCliente.setEnabled(true);
        barraFuncionarios.setEnabled(true);
        infoIcon.setEnabled(true);
        
    }
    
    //Agrupar as funções em um lugar:
    public static void mainSIM() {
       
//      pergunta(); Redundante? já que é chamada abaixo.
        verificaPerguntaBtnSIM(pergunta());
    }
    
    //Agrupar as funções em um lugar:
    public static void mainNAO() {
        
        verificaPerguntaBtnNAO(pergunta());
    }
    
    //Gera a pergunta:
    public static int pergunta(){ 
     
        String pergunta[] = new String[7];
       
            pergunta [0] = "<html>Podemos afirmar que o segredo do sucesso organizacional ou empresarial está na maneira como as organizações e as empresas são administradas e conduzidas?</html>";
            pergunta [1] = "<html>Os termos eficiência e eficácia – Eficiência: capacidade de realização das atividades da organização minimizando a utilização de seus recursos (produtividade). Eficácia: capacidade de realizar as atividades da organização de modo a alcançar os objetivos estabelecidos – tem relevância na definição de administração?</html>";
            pergunta [2] = "<html>As funções básicas de uma empresa são: Funções técnicas, de segurança, contábeis e administrativas. Funções comerciais e financeiras não são consideradas básicas. </html>";
            pergunta [3] = "<html>Você como gestor percebe novas tecnologia de inovação no mercado deseja pesquisar sobre elas?</html>";
            pergunta [4] = "<html>É importante ter vantagens e benefícios exclusivos que a empresa proporciona à sua clientela, que a concorrência ainda não conseguiu oferecer? </html>";
            pergunta [5] = "<html>Dar feedback, reconhecimento, liberdade para pedir ajuda não são práticas que o gestor deve ter para incentivar os funcionários.</html>";
            pergunta [6] = "<html>Treinamento, benefícios e incentivo são formas de envolver os funcionários nas atividades da empresa. </html>";
       
        
        Random random = new Random();
        int numAleatorio = random.nextInt(7);
       //Integer.parseInt
       
       textQuestao.setText(pergunta[numAleatorio]);
       
    return numAleatorio;
    }
    
 
    //Função a ser chamada na tela 'telaGame' pelo botão sim:
    public static void verificaPerguntaBtnSIM(int pergunta) {
        
        int valorBarraDinheiro = barraDinheiro.getValue(), valorBarraCliente = barraCliente.getValue(), valorBarraFuncionarios = barraCliente.getValue(); 
        
        switch(pergunta){
                
                    case 0: 
                            
                        // valores do botão SIM da primeira pergunta.
                        //n = n + 1;
                                                
                        barraDinheiro.setValue(valorBarraDinheiro + 20);
                        barraCliente.setValue(valorBarraCliente + 20);
                        barraCliente.setValue(valorBarraFuncionarios + 20);
                        break;
            
                    case 1:
                        //valores do botão SIM da segunda pergunta.
                        //n = n + 1;
                        
                        valorBarraDinheiro += 25;
                        valorBarraCliente = valorBarraCliente + 25;
                        barraDinheiro.setValue(valorBarraDinheiro);
                        barraCliente.setValue(valorBarraCliente);
                        break;
                    
                    case 2:
                        // valores do botão SIM da terceira pergunta.
                        //n = n + 1;
                        
                        valorBarraDinheiro = valorBarraDinheiro + 20;
                        valorBarraFuncionarios = valorBarraFuncionarios + 20;
                        
                        barraDinheiro.setValue(valorBarraDinheiro);
                        barraFuncionarios.setValue(valorBarraFuncionarios);
                        break;
                    
                    case 3:
                        // valores do botão SIM da quarta pergunta.
                        //n = n + 1;
                        
                        valorBarraCliente = valorBarraCliente + 20;
                        valorBarraFuncionarios = valorBarraFuncionarios - 20;
                        
                        barraCliente.setValue(valorBarraCliente);
                        barraFuncionarios.setValue(valorBarraFuncionarios);
                        break;
                    
                    case 4:
                        // valores do botão SIM da quinta pergunta.
                        //n = n + 1;
                        
                        valorBarraDinheiro = valorBarraDinheiro + 25;
                        valorBarraCliente = valorBarraCliente + 25;
                        
                        barraDinheiro.setValue(valorBarraDinheiro);
                        barraCliente.setValue(valorBarraCliente);
                        break;
                    
                    case 5:
                        // valores do botão SIM da SEXTOU :D pergunta.
                        //n = n + 1;
                        
                        valorBarraFuncionarios = valorBarraFuncionarios + 20;
                        
                        barraFuncionarios.setValue(valorBarraFuncionarios);
                        break;
                    
                    case 6:
                        // valores do botão SIM da setima pergunta.
                        //n = n + 1;
                        
                        valorBarraDinheiro = valorBarraDinheiro - 20;
                        valorBarraFuncionarios = valorBarraFuncionarios + 25;
                        
                        barraDinheiro.setValue(valorBarraDinheiro);
                        barraFuncionarios.setValue(valorBarraFuncionarios);
                    break;
                }
    }
    
    //Função a ser chamada na tela 'telaGame' pelo botão não:
    public static void verificaPerguntaBtnNAO(int pergunta) {
            
        int valorBarraDinheiro = barraCliente.getValue(), valorBarraCliente = barraCliente.getValue(), valorBarraFuncionarios = barraFuncionarios.getValue(); 
        
                switch(pergunta){
                    
                    case 0: 
                            
                        // valores do botão NÃO da primeira pergunta.
                        //n = n + 1;
                        
                        valorBarraDinheiro = valorBarraDinheiro - 20;
                        valorBarraCliente = valorBarraCliente - 20;
                        valorBarraFuncionarios = valorBarraFuncionarios - 20;
                        barraDinheiro.setValue(valorBarraDinheiro);
                        barraCliente.setValue(valorBarraCliente);
                        barraFuncionarios.setValue(valorBarraFuncionarios);
                        break;
            
                    case 1:
                        // valores do botão NÃO da segunda pergunta.
                        //n = n + 1;
                       
                        valorBarraDinheiro = valorBarraDinheiro - 25;
                        valorBarraCliente = valorBarraCliente - 25;
                        barraDinheiro.setValue(valorBarraDinheiro);
                        barraCliente.setValue(valorBarraCliente);
                        break;
                    
                    case 2:
                        // valores do botão NÃO da terceira pergunta.
                        //n = n + 1;
                        
                        valorBarraDinheiro = valorBarraDinheiro - 20;
                        valorBarraFuncionarios = valorBarraFuncionarios - 20;
                        
                        barraDinheiro.setValue(valorBarraDinheiro);
                        barraFuncionarios.setValue(valorBarraFuncionarios);
                        break;
                    
                    case 3:
                        // valores do botão NÃO da quarta pergunta.
                        //n = n + 1;
                        
                        valorBarraCliente = valorBarraCliente - 20;
                        valorBarraFuncionarios = valorBarraFuncionarios + 20;
                        
                        barraCliente.setValue(valorBarraCliente);
                        barraFuncionarios.setValue(valorBarraFuncionarios);
                        break;
                    
                    case 4:
                        // valores do botão NÃO da quinta pergunta.
                        //n = n + 1;
                        valorBarraDinheiro = valorBarraDinheiro - 25;
                        valorBarraCliente = valorBarraCliente - 25;
                        
                        barraDinheiro.setValue(valorBarraDinheiro);
                        barraCliente.setValue(valorBarraCliente);
                        break;
                    
                    case 5:
                        // valores do botão NÃO da SEXTOU :D pergunta.
                        //n = n + 1;
                        
                        valorBarraFuncionarios = valorBarraFuncionarios - 20;
                        
                        barraFuncionarios.setValue(valorBarraFuncionarios);
                        break;
                    
                    case 6:
                        // valores do botão NÃO da setima pergunta.
                        //n = n + 1;
                        
                        valorBarraDinheiro = valorBarraDinheiro + 20;
                        valorBarraFuncionarios = valorBarraFuncionarios - 25;
                        
                        View.telaGame.barraDinheiro.setValue(valorBarraDinheiro);
                        View.telaGame.barraFuncionarios.setValue(valorBarraFuncionarios);
                    break;
                
            }
                
                if(valorBarraDinheiro == 0 || valorBarraFuncionarios == 0 || valorBarraCliente == 0){
 
                    
                    Object [] op = {"Jogar novamente", "Sair"};
                    int x = JOptionPane.showOptionDialog(null, "Você fracassou em gerir sua empresa, ela faliu por falta de recurso.", "!!!Que pena!!!", 0, 3, null, op, "Jogar novamente");
        
                        if(x == 0){
            
                            barraDinheiro.setValue(50);
                            barraCliente.setValue(50);
                            barraFuncionarios.setValue(50);
             
                        }else{
         
                            new View.telaGame().setVisible(true);
                        
                        } 
            
            }else if (valorBarraDinheiro == 100 || valorBarraFuncionarios == 100 || valorBarraCliente == 100){
                
                 Object [] op = {"Jogar novamente", "Sair"};
                    int x = JOptionPane.showOptionDialog(null, "Você fracassou em gerir sua empresa!!", "!!!Que pena!!!", 0, 3, null, op, "Jogar novamente");
        
                        if(x == 0){
            
                            barraDinheiro.setValue(50);
                            barraCliente.setValue(50);
                            barraFuncionarios.setValue(50);
             
                        }else{
         
                            new View.telaGame().setVisible(true);
                        
                        } 
            
            
            }
        }
    }                   

    