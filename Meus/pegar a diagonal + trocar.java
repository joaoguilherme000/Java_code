System.out.println("\nDiagonal Principal: ");
		
    	for (int i = 0; i < 10; i++) {
        	System.out.print(m[i][i] +" ");
    	}
    	System.out.println();

    	System.out.println("\nDiagonal Secundária: ");
    	
    	for (int i = 0; i < 10; i++) {
        	System.out.print(m[i][10 - i - 1]+" ");
    	}
    	System.out.println();

      // trocar a diagonal principal com a secundária.
    	
    	for (int i = 0; i < 10; i++) {
        	int temp = m[i][i];
        	m[i][i] = m[i][10 -i - 1];
        	m[i][10 -i - 1] = temp;
    	}
