package Repetição;

import java.util.Scanner;

public class printCarac {

    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double nLinha, contLinha = 0;
        String ast = "";
        
        System.out.print("Digite o número de linhas: ");
        nLinha = ler.nextDouble();
        
        for(int i = 0; i < nLinha; i++){
            ast = (ast + "*");
            System.out.println(ast);
            contLinha ++;
        }
    }
    
}
