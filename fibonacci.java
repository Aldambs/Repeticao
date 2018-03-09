package Repetição;

import java.util.Scanner;

public class fibonacci {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite o valor: ");
        int n = ler.nextInt();
        
        int ant = 0 , at = 1, prx = 1;
        
        for(int i = 1; i < n; i++){
            System.out.print(prx+ " , ");
            prx = at + ant;
            ant = at;
            at = prx;
        }  
        System.out.println(prx);
    }
    
}
