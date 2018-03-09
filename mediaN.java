package Repetição;

import java.util.Scanner;

public class mediaN {
    /**
      Construir um programa que calcule a média aritmétrica de varios valores inteiros
      positivos O final da leitura acontecerá quando for lido um valor negativo.
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int num, cont = 0, soma = 0;
        double med;
        
        System.out.print("Digite o valor positivo e o negativo para encerrar: ");
        num = ler.nextInt();
        
        while(num >= 0){
            soma = soma + num;
            cont++;
            System.out.print("Digite o valor positivo e o negativo para encerrar: ");
            num = ler.nextInt();
        }
        if(cont > 0){
            med = soma / cont;
            System.out.println("A média é = " +med);
        }else{
            System.out.println("Nenhum valor digitado!");
        }
    }
    
}
