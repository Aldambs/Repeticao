package Repetição;

import java.util.Scanner;

public class menorV_A {
/*Escrever um algoritmo que lê 5 valores para a, um de cada vez, e conta quantos
  destes valores são negativos, escrevendo esta informação.
 */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int qtd = 0;
        double num;

        for(int i = 1; i <= 5; i++){
           System.out.println("Digite os valores: ");
           num = ler.nextDouble();
           if(num < 0){
               qtd = qtd + 1;
           }           
        }
        System.out.println("A quantidade é = " +qtd);
    } 
}
