package Repetição;

import java.util.Scanner;

public class serie {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Digite os primeiros números: ");
        double num = ler.nextDouble();
        double s = 1;
        
        for(int i = 1; i <= num; i++){
            s = 1 + (1/3) + (2/num);
        }
        System.out.println("A serie é = " +s);
    }
    
}
