package Repetição;

import java.util.Scanner;

public class somaN {
    
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite o primeiro número da série: ");
        int num = ler.nextInt();
        int i = 0, soma = 0;
        
        while(i < num){
           soma = num + 1;
           i = i + 1;
        }
        System.out.println("A soma é = " +soma);
    }
    
}
