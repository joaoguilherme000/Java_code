import java.util.Scanner;

import javax.swing.JOptionPane;


public class exe1 {

	
	public static void main(String[] args) {
	
      int quantidade=0;
		int [] pecas = new  int [10];
		double [] valor = new  double [10];
		double [] total = new  double [10];
		for(int i = 0 ; i<=9 ;i++){
			
			String x = JOptionPane.showInputDialog(null, "Digite a quantidade de peças do vendedor -> " + (i+1));
			pecas[i] = Integer.parseInt(x);
			quantidade = quantidade +pecas[i];
			
			x = JOptionPane.showInputDialog(null, "Digite o valor dessa peça ");
			valor[i] = Double.parseDouble(x);
			
			total[i] = pecas[i]*valor[i];
			
			JOptionPane.showMessageDialog(null, "O vendedor " + (i+1) + " vendeu R$" + total[i]);
			
		}
	}
}

/*BASICAMENTE VOCE TEM QUE ARRUMAR O CODIGO, EM CIMA O ANTIGO E EM BAIXO O NOVO*/

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
	
        int quantidade=0;
		int [] pecas = new  int [10];
		double [] valor = new  double [10];
		double [] total = new  double [10];
        
		for(int i = 0 ; i<=9 ;i++){

			System.out.println("Digite a quantidade de peças do vendedor -> " + (i+1));
			pecas[i] = scanner.nextInt();
            
			quantidade = quantidade +pecas[i];
			
			System.out.println("\nDigite o valor dessa peça ");
			valor[i] = scanner.nextDouble();
			
			total[i] = pecas[i]*valor[i];
			
			System.out.println("O vendedor " + (i+1) + " vendeu R$" + total[i]);
        }
	}
}