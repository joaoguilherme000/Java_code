/*
 1 - Dentro de uma classe principal  , crie três funções  que daram as seguintes informações na tela  :

    Mensagem 1
    Mensagem 2
    Mensagem 3

Em seguida instancie as 3 funções dentro da classe Main

2 – Crie a classe principal , em seguida crie 3 classes externas  , crie uma função dentro de cada classe externa que de uma mensagem qualquer e instancie  as 3 funções dentro da classe main */
package main;

import javax.swing.JOptionPane;


public class Main {

    
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Main ");
        coisa1();
        coisa2();
        coisa3();
    }
    
    public static void coisa1(){
        JOptionPane.showMessageDialog(null, "mensagem 1");
    }
    
    public static void coisa2(){
        JOptionPane.showMessageDialog(null, "mensagem 2");
    }
    
    public static void coisa3(){
        JOptionPane.showMessageDialog(null, "mensagem 3");
    }
   
}
