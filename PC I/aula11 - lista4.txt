/*1 - Receba dois valores reais , divida e mostre o resultado.*/

import javax.swing.JOptionPane;

public class DivisaoComJOptionPane {
    public static void main(String[] args) {
        // Solicite ao usuario que insira o primeiro valor real
        String input1 = JOptionPane.showInputDialog("Digite o primeiro valor real:");
        
        // Solicite ao usuario que insira o segundo valor real
        String input2 = JOptionPane.showInputDialog("Digite o segundo valor real:");
        
        try {
            // Converta as entradas em numeros reais
            double valor1 = Double.parseDouble(input1);
            double valor2 = Double.parseDouble(input2);
            
            // Verifique se o segundo valor nao e zero para evitar uma divisao por zero
            if (valor2 != 0) {
                // Realize a divisao
                double resultado = valor1 / valor2;
                
                // Exiba o resultado usando JOptionPane
                JOptionPane.showMessageDialog(null, "Resultado da divisao: " + resultado);
            } else {
                // Exiba uma mensagem de erro se o segundo valor for zero
                JOptionPane.showMessageDialog(null, "Nao e possivel dividir por zero.", "Erro", JOptionPane.ERROR_MESSAGE);
            }
        } catch (NumberFormatException e) {
            // Exiba uma mensagem de erro se as entradas nao forem numeros validos
            JOptionPane.showMessageDialog(null, "Por favor, insira valores numericos validos.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}

// -----------------------------------------------------------------------------

/*2 - Receba dois valores inteiros  , some e mostre o resultado .*/

import javax.swing.JOptionPane;

public class SomaComJOptionPane {
    public static void main(String[] args) {
        // Solicite ao usuario que insira o primeiro valor inteiro
        String input1 = JOptionPane.showInputDialog("Digite o primeiro valor inteiro:");
        
        // Solicite ao usuario que insira o segundo valor inteiro
        String input2 = JOptionPane.showInputDialog("Digite o segundo valor inteiro:");
        
        try {
            // Converta as entradas em numeros inteiros
            int valor1 = Integer.parseInt(input1);
            int valor2 = Integer.parseInt(input2);
            
            // Realize a soma
            int resultado = valor1 + valor2;
            
            // Exiba o resultado usando JOptionPane
            JOptionPane.showMessageDialog(null, "Resultado da soma: " + resultado);
        } catch (NumberFormatException e) {
            // Exiba uma mensagem de erro se as entradas nao forem numeros inteiros validos
            JOptionPane.showMessageDialog(null, "Por favor, insira valores inteiros validos.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}

// -----------------------------------------------------------------------------


/*3 - Solicite tres valores reais , obtenha a media e faça a seguinte comparação
  nota < que 5  : Mensagem "Média I"
  nota entre  5 e 6.9  : Mensagem "Média R"
  nota entre  7 e 8.9  : Mensagem "Média B"
  nota entre  9 e 10  : Mensagem "Média MB"*/

import javax.swing.JOptionPane;

public class CalculoMediaComJOptionPane {
    public static void main(String[] args) {
        // Solicite ao usuario que insira tres valores reais
        String input1 = JOptionPane.showInputDialog("Digite o primeiro valor real:");
        String input2 = JOptionPane.showInputDialog("Digite o segundo valor real:");
        String input3 = JOptionPane.showInputDialog("Digite o terceiro valor real:");
        
        try {
            // Converta as entradas em numeros reais
            double valor1 = Double.parseDouble(input1);
            double valor2 = Double.parseDouble(input2);
            double valor3 = Double.parseDouble(input3);
            
            // Calcule a media
            double media = (valor1 + valor2 + valor3) / 3.0;
            
            // Faca a comparacao e exiba a mensagem apropriada usando JOptionPane
            String mensagem = "";
            if (media < 5) {
                mensagem = "Media I";
            } else if (media >= 5 && media < 7) {
                mensagem = "Media R";
            } else if (media >= 7 && media < 9) {
                mensagem = "Media B";
            } else if (media >= 9 && media <= 10) {
                mensagem = "Media MB";
            }
            
            JOptionPane.showMessageDialog(null, "Media: " + media + "\n" + mensagem);
        } catch (NumberFormatException e) {
            // Exiba uma mensagem de erro se as entradas nao forem numeros reais validos
            JOptionPane.showMessageDialog(null, "Por favor, insira valores numericos validos.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}

// ------------------------------------------------------------------------------
/*4 - Solicite ao usuário o valor da tabuada e mostre a tabuada correspondente do 0 ate o 10.*/

import javax.swing.JOptionPane;

public class TabuadaComJOptionPane {
    public static void main(String[] args) {
        // Solicite ao usuario que insira o valor para o qual ele deseja a tabuada
        String input = JOptionPane.showInputDialog("Digite um valor para a tabuada:");
        
        try {
            // Converta a entrada em um numero inteiro
            int valor = Integer.parseInt(input);
            
            // Inicie um loop para calcular e exibir a tabuada de 0 a 10
            String tabuada = "Tabuada de " + valor + ":\n";
            for (int i = 0; i <= 10; i++) {
                int resultado = valor * i;
                tabuada += valor + " x " + i + " = " + resultado + "\n";
            }
            
            // Exiba a tabuada usando JOptionPane
            JOptionPane.showMessageDialog(null, tabuada);
        } catch (NumberFormatException e) {
            // Exiba uma mensagem de erro se a entrada nao for um numero inteiro valido
            JOptionPane.showMessageDialog(null, "Por favor, insira um valor inteiro valido.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}

// ------------------------------------------------------------------------------

/*5 - Receba a idade do usuário e faça as seguintes perguntas : Você Fuma ? , Você Bebe ?
 , Você perde noites de Sono ? 
  Logo após subtraia a idade do usuário de 65 (que é a idade média de uma pessoa) , 
  e o provavel restante de anos de vida.
  Se o usuário disser sim a primeira pergunta , subtraia do tempo restante  5 
  Se o usuário disser sim a segunda pergunta , subtraia do tempo restante  7
  Se o usuário disser sim a terceira pergunta , subtraia do tempo restante  6

  se o tempo que sobrar for < 3  : Mensagem : "Você tem " + Tempo de vida + 
  "anos  de vida e esta com o Pé na Cova"

  se o tempo que sobrar estiver entre 4 e 10  :Você tem " + Tempo de vida
  + "anos  de vida Cuidade , vc esta com um pé na cova"

  se o tempo que sobrar estiver entre 11 e 20 :Você tem " + Tempo de vida + 
  "anos  de vida  Durma mais , pare de fumar e manere no alcool"
  
  se o tempo que sobrar estiver acima de 20  :"Você tem " + Tempo de vida + 
 "anos  de vida E isso ai continue assim"*/

 import javax.swing.JOptionPane;

public class CalculoTempoVidaComJOptionPane {
    public static void main(String[] args) {
        // Solicite ao usuario que insira sua idade
        String inputIdade = JOptionPane.showInputDialog("Digite sua idade:");
        
        try {
            // Converta a entrada em um numero inteiro
            int idade = Integer.parseInt(inputIdade);
            
            // Inicialize o tempo de vida restante com base na idade media de 65 anos
            int tempoDeVida = 65 - idade;
            
            // Faca as tres perguntas ao usuario
            String fuma = JOptionPane.showInputDialog("Voce fuma? (Sim ou Nao):");
            String bebe = JOptionPane.showInputDialog("Voce bebe? (Sim ou Nao):");
            String perdeNoites = JOptionPane.showInputDialog("Voce perde noites de sono? (Sim ou Nao):");
            
            // Subtraia do tempo de vida restante com base nas respostas
            if ("Sim".equalsIgnoreCase(fuma)) {
                tempoDeVida -= 5;
            }
            if ("Sim".equalsIgnoreCase(bebe)) {
                tempoDeVida -= 7;
            }
            if ("Sim".equalsIgnoreCase(perdeNoites)) {
                tempoDeVida -= 6;
            }
            
            // Determine a mensagem com base no tempo de vida restante
            String mensagem;
            if (tempoDeVida < 3) {
                mensagem = "Voce tem " + (65 - tempoDeVida) + " anos de vida e esta com o Pe na Cova";
            } else if (tempoDeVida >= 4 && tempoDeVida <= 10) {
                mensagem = "Voce tem " + (65 - tempoDeVida) + " anos de vida. Cuidado, voce esta com um pe na cova.";
            } else if (tempoDeVida >= 11 && tempoDeVida <= 20) {
                mensagem = "Voce tem " + (65 - tempoDeVida) + " anos de vida. Durma mais, pare de fumar e modere no alcool.";
            } else {
                mensagem = "Voce tem " + (65 - tempoDeVida) + " anos de vida. Continue assim!";
            }
            
            // Exiba a mensagem usando JOptionPane
            JOptionPane.showMessageDialog(null, mensagem);
        } catch (NumberFormatException e) {
            // Exiba uma mensagem de erro se a entrada nao for um numero inteiro valido
            JOptionPane.showMessageDialog(null, "Por favor, insira uma idade valida.", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}


 // -----------------------------------------------------------------------------