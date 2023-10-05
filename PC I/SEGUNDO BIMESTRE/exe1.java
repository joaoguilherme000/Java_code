import java.util.Scanner;

import javax.swing.JOptionPane;


public class exe1 {

	
	public static void main(String[] args) {
	
        int negativos=0 ;
        double positivos=0;
		double [] valor = new double[10];
		String total ="";
		
		for(int i = 0 ; i<=9 ;i++){
			
			String x = JOptionPane.showInputDialog(null, "Digite o  numero -> " + (i+1));
			valor[i] = Double.parseDouble(x);
			total = total + valor[i] + " | " ;
			if(valor[i] < 0){
				negativos++;
			}else{
				positivos=positivos+valor[i];
			}
			
			
			
		}
		
		
   
		JOptionPane.showMessageDialog(null, "Ä quantidade de negativos digitados foi " + negativos );
		JOptionPane.showMessageDialog(null, "E a soma dos positivos foi " + positivos );
	}
}

/*BASICAMENTE VOCE TEM QUE ARRUMAR O CODIGO EM CIMA O ANTIGO E EM BAIXO O NOVO*/

import java.util.Scanner;

public class Main {

	
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
	
        int negativos=0 ;
        double positivos=0;
		double [] valor = new double[10];
		double total =0;
		
		for(int i = 0 ; i<=9 ;i++){
			System.out.println("Digite o  numero -> " + (i+1));
			valor[i] = scanner.nextDouble();

			total = total + valor[i];
			if(valor[i] < 0){
				negativos++;
			}else{
				positivos=positivos+valor[i];
			}
			
		}

		System.out.println( "Ä quantidade de negativos digitados foi " + negativos );
		System.out.println( "E a soma dos positivos foi " + positivos );
	}
}