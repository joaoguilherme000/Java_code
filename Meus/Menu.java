public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int escolha = 0;
		int exe =1;
		
		System.out.println("\nEscolha um exercicio:");
		
        while(true){
            exe = 1;
            while(exe < 4){
            	System.out.println(" "+exe+ " - exercicio " + exe);
            	exe++;
            }
            System.out.println("ou "+ exe + " para sair");
            
            do {
                if (scanner.hasNextInt()) {
                    escolha = scanner.nextInt();
                    scanner.nextLine();
                    if (escolha <= 0) {
                        System.out.println("Escolha somente os numeros que aparecem no menu.");
                    }
                } else {
                    System.out.println("Invalido, deve ser um numero inteiro");
                    scanner.nextLine(); // pra nao dar erro
                    escolha = 0;
                }

            } while (escolha <= 0);
            
            switch(escolha){
                case 1:
                    System.out.println("\n");
                    exercicio1();
                    break;
                case 2:
                    System.out.println("\n");
                    exercicio2();
                    break;
                case 3:
                    System.out.println("\n");
                    exercicio3();
                    break;
                case 4:
                    System.out.println("\nSaindo do programa...");
                    return; // Sai do método e encerra o programa
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
                }
