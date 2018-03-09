package Repetição;

import java.util.Scanner;

public class somaParesImpares {
    /**
     * Faça um programa que leia vários inteiros positivos e mostre, no final, a
     * soma dos números pares e a soma dos números ímpares. O programa para
     * quando entrar um número maior que 1000.
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int num, somaI, somaP;
        somaP = 0;
        somaI = 0;
        System.out.print("Informe o número e pra sair digite um número maior que 1000: ");
        num = ler.nextInt();
        
        while(num > 1000){
            if(num % 2 == 0){
                somaP = somaP + num;
            }else{
                somaI = somaI + num;
            }
            System.out.print("Informe o número e pra sair digite um número maior que 1000: ");
            num = ler.nextInt();
        }
        System.out.println("A soma dos pares é = " +somaP);
        System.out.println("A soma dos impares é = " +somaI);
    }

}
