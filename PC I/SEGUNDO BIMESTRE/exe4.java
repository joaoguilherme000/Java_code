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