package Repetição;

import java.util.Scanner;

public class qtdIntervalos {

    /**
     * Escrever um algoritmo que leia uma quantidade desconhecida de números e
     * conte quantos deles estão no intervalo [0.25] e quantos estão no
     * intervalo [51,75]. A entrada de dados deve terminar quando for lido um
     * número negativo.
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int cont, inter1 = 0, inter2 = 0, num;
        cont = 1;
        num = 1;

        while(num > 0){
            System.out.println("Entre com o número de 1 a 75, pra sair com número negativo: ");
            num = ler.nextInt();
            if (num > 0 && num <= 25) {
                cont = cont + 1;
                inter1++;
            } else {
                if (num > 51 && num <= 75) {
                    cont = cont + 1;
                    inter2++;
                }
            }
        }    
        System.out.print("Números no intervalo de 0 a 25 = " + inter1);
        System.out.print("\nNúmeros no intervalo de 51 a 75 = " + inter2);
    }
}
