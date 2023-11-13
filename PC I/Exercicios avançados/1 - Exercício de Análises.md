## Exercícios de análise

roadmap

- [Exercício 1](#exercicio1)
- [Exercício 2](#exercicio2)
- [Exercício 3](#exercicio3)
- [Exercício 4](#exercicio4)
- [Exercício 5](#exercicio5)


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
