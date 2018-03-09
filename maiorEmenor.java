package Repetição;

import java.util.Scanner;

public class maiorEmenor {
    /**
      Fazer um programa que leia 50 valores e encontre o maior e o menor deles, 
      imprimir no final o resultado. 
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        byte vl, menor = 0, maior = 0;
        
        for(int i = 1; i <= 50; i++){
           System.out.print("Digite o "+i+"º valor: ");
           vl = ler.nextByte();
            
            if(vl > maior){
                maior = vl;
            } else {
                if (vl < menor) {
                    menor = vl;
                }
            }
        }
        System.out.println("O maior é = " +maior);
        System.out.println("O menor é = " +menor);
    }
    
}
