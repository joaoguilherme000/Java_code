## Exercícios de análise

roadmap

- [Exercício 1](#exercício1)
- [Exercício 2](#exercício2)
- [Exercício 3](#exercício3)
- [Exercício 4](#exercício4)
- [Exercício 5](#exercício5)


# Exercício 1
<h4>Analise o código abaixo e descubra os erros :</h4></h4>

```
Public Static void Main ( String [ ] args){

JOptionPane.showMessageDialog(null , “Isso é um teste”); 
}
```

`R: o public static e main esta em maiúsculo, a mensagem esta com aspas duplas diferentes mas pode não ser um erro`

# Exercício 2

<h4>Analise o código abaixo e descubra os erros :</h4>

```
import javax.swing.JOptionPane;

public class Principal {

	public static void Mes(){
		JOptionPane.showMessageDialog(null, "CEFET-PHB");
		
	}
		
	public static void main(String[] args) {	
     Mes();		
	}
}
```

`R: Sei não`

# Exercício 3

<h4>Analise o código abaixo e descubra os erros :</h4>

```
public class exer4 {

	
	public static void main(String[] args) {
	double altura=0;
	double diametro=0;
	double volume = 0;
	double area=0;
	
	scanner gravar = new scanner(System.inin);
    	System.out.println("Digite o diametro");
	diametro = gravar.nextDouble();
		
	System.out.println("Digite a altura");
	altura = gravar.nextInt();
	área+- diametro*diametro;  // área com acento agudo e com +- o que nao funciona.
	volume = area/altura;
	System.out.println("A area é de " + area)  // falta o ponto e virgula.
	System.out.println("O Volume é de " + volume);
	
	}

}
```

`R: resposta comentada no código`

#Exercício 4

<h4>Analise o código abaixo e descubra os erros :</h4>

```
public class Mudar {

	// falta a importação do JOptionPane
	public static void main(String[] args) {

		int i=0;
		int j=9;
		int a=0;
		int b=0;  // variavel a e b nao precisa ser criada
		
		int [] valores = new int[10];
		int [] valores2 = new int[10];
		
		for(i=0;i>10;i--){  // esse for nao executa porque o i nunca é > 10
			
		String tmp = JOptionPane.showInputDialog("Digite o valor numero" + (i+1));
		valores[i] = Integer.parseInt(tmp);
				
		}
		
		for(i=0;i<10;i--){  // aqui ele executa pra sempre porque sempre é < 10.
			
			a = valores[i];
			b = valores[j]; 
			// mais facil fazer isso => valores[i] = valores2[i] 
			valores2[i] = b;
			valores2[j] = a;
			j--;  // pra que?
			
		}
		
		JOptionPane.showMessageDialog(null, valores[0]+ " "+valores[1]+" " +valores[2]+ " " +valores[3]+ " " +valores[4]+ " " +valores[5]+ " " +valores[6]+ " " +valores[7]+ " " +valores[i]+ " " +valores[i]); // valores[i] ???? vai dar erro

JOptionPane.showMessageDialog(null, valores2[0]+ " " +valores2[1]+ " " +valores2[i]+ " " +valores2[3]+ " " +valores2[4]+ " " +valores2[i]+ " " +valores2[6]+ " " +valores2[7]+ " " +valores2[8]+ " " +valores2[9]);  // de nova vai dar erro 
		
		
	}

}
```

`R: Primeiro de tudo esse código ta todo idiota, segunda que a resposta ta comentada no código divirta-se.`
