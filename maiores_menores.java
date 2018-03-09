package Repetição;

import java.util.Scanner;

public class maiores_menores {

    /*
    Fazer um programa que mostre os números maiores do que 999 e menores do que 
    10.000 tem a seguintes caracteristicas: 3025 = 30+25 = 55*55 = 3025
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int r, d, m;
        int v = 0;
        for (int i = 999; i < 10000; i++) {
            System.out.println("Digite o número: ");
            int n = ler.nextInt();
            d = n / 100;
            System.out.println("A divisão é = " +d);
            r = n % 100;
            System.out.println("O resto é = " +r);
            v = d + r;
            m = v * v;
            
            if(m == n){
                System.out.println("O valor é = " +m);
            }else{
                System.out.println("Não é válido");
            }
        }
    }
}
