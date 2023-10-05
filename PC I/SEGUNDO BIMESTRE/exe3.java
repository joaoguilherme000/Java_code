import java.util.Scanner;

import javax.swing.JOptionPane;


public class exe1 {

	
	public static void main(String[] args) {
	
      
		int [] valor = new  int [7];
		
		
		for(int i = 0 ; i<=6 ;i++){
			
			String x = JOptionPane.showInputDialog(null, "Digite o  numero -> " + (i+1));
			valor[i] = Integer.parseInt(x);
			
			if(valor[i] % 2 ==0  && valor[i] % 3 ==0  ){
				JOptionPane.showMessageDialog(null, "valor divisivel por 2 e 3");
			}else if(valor[i] % 2==0  ){
				JOptionPane.showMessageDialog(null, "valor divisivel por 2");
			}else if(valor[i] % 3==0  ){
				JOptionPane.showMessageDialog(null, "valor divisivel por 3");
			}else{
				JOptionPane.showMessageDialog(null, "valor não divisivel nem por 2 e nem por 3");
			}
			
			
			
		}
		
		
   
		
	}
}

/*BASICAMENTE VOCE TEM QUE ARRUMAR O CODIGO, EM CIMA O ANTIGO E EM BAIXO O NOVO*/