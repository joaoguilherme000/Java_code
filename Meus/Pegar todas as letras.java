for (int i = 0; i < entrada.length(); i++) {
    char caractere = entrada.charAt(i);

    if (caractere == ' ') {
        mensagem += "\n";
    } else {
        mensagem += caractere;
    }
}