package Repetição;

import java.util.Scanner;

public class med {
    /**
     * Escrever um algoritmo que leia um número não determinado de valores e
     * calcule a média aritmética dos valores lidos, a quantidade de valores
     * positivos, a quantidade de valores negativos e o percentual de valores
     * negativos e positivos. Imprima os resultados. A condição de parada é
     * inserir o valor zero.
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite o número e pra sair digite 0: ");
        int num = ler.nextInt();
        double somaN, somaP, cont, qtdN, qtdP;
        double med, percN, percP;
        qtdP = 1;
        qtdN = 0;
        somaP = 0;
        somaN = 0;
        cont = 0;
        while(num != 0){           
           System.out.print("Digite o número e pra sair digite 0: ");
           num = ler.nextInt();
           cont = cont + 1;
           
           if(num > 0){
               somaP = somaP + num;
               qtdP = qtdP + 1;
           }
           if(num < 0){
               somaN = somaN + num;
               qtdN = qtdN + 1;
           }          
        }
        med = (somaP + somaN) / cont;
        percP = somaP * (somaP/100);
        percN = somaN * (somaN/100);
        
        System.out.println("A média é = " +med);
        System.out.println("Quantidade de números positivos é = " +qtdP);
        System.out.println("Quantidade de números negativos é = " +qtdN);
        System.out.println("A porcentagem de números positivos é = " +percP);
        System.out.println("A porcentagem de números negativos é = " +percN);
    }

}
