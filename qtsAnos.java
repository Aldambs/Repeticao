package Repetição;

import java.util.Scanner;

public class qtsAnos {
    /**
     * Chico tem 1,50 metros e cresce 2 centimetros por ano, enquanto zé tem 1,10 
     * metro e cresce 3 centimetros por ano. Construa um programa que calcule e 
     * imprima quantos anos serão necessário para que zé seja maior que chico.
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        float Chico = 1.50f, Zé = 1.10f, qtdID = 0;
        
        while(Chico >= Zé){
            Chico = Chico + 0.02f;
            Zé = Zé + 0.03f;
            qtdID = qtdID + 1;
        }
        System.out.println("Serão necessário = " +qtdID+ " anos");
    }
    
}
