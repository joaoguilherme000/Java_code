import java.util.Scanner;
public class Main {
    
    public static void main(String[] args) {
        
        exercicio1();
        exercicio2();
        exercicio3();
        exercicio4();
    }
    
    public static void exercicio1(){
        System.out.println("\nExercicio 1\n ");
        int cont = 0;
        for(int i=0; i<100;i++){
            cont++;
            if(cont %2 !=0){
                System.out.println("Numero impar " + cont);
            }
        }
    }
    
    public static void exercicio2 (){
        System.out.println("\nExercicio 2 ");
        
        int cont = 100;
        for(int i=100; i>0;i--){
            System.out.println("De 100 a 0 " + cont);
            cont--;
        }
    }
    
    public static void exercicio3 (){
        System.out.println("\nExercicio 3 ");
        Scanner scanner = new Scanner(System.in);
        int idade = 0;
        int soma = 0;
        
        for(int i = 0; i<5; i++){
            System.out.println("Coloque a idade do aluno " + i);
            idade = scanner.nextInt();
            soma += idade / 5;
        }
         System.out.println("Media do aluno " + soma);
    }
    
    public static void exercicio4 (){
        System.out.println("\nExercicio 4 ");
        
        System.out.println("\n quantas vezes a mensagem isso é um teste deve aparecer? ");
        Scanner scanner = new Scanner(System.in);
        int cont = scanner.nextInt();
        
        for(int i=0; i < cont; i++){
            System.out.println("Isso é um teste");
            
        }
    }
}