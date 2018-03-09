package Repetição;

import java.util.Scanner;

public class pesqHB {
    /**
     * Foi feita uma pesquisa entre os 6 habitantes de uma região para coletar
     * os seguintes dados: sexo (0-feminino, 1-masculino), idade e altura. Faça
     * um programa que mostre as seguintes informações: 
     * a) média da idade do grupo; 
     * b) média da altura das mulheres; 
     * c) média da idade dos homens;
     * d) percentual de pessoas com idade entre 18 e 35 anos (inclusive).
     */
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        int op, idM, idH, cont,somaH, somaM, totalM, totalH, id18a35, soma_id18a35;
        double altM, altH, medID, med_altM = 0, soma_altM = 0, medID_H = 0, perc;
        cont = 0;
        somaH = 0;
        somaM = 0;
        totalM = 0;
        totalH = 0; 
        id18a35 = 0;
        soma_id18a35 = 0;
        for (int i = 1; i <= 6; i++) {
            System.out.println("Informe a opção desejada: \n0.Feminina \n1.Masculina ");
            op = ler.nextInt();
            if(op == 0){
                System.out.print("Informe a idade: ");
                idM = ler.nextInt();
                System.out.print("Informe a altura: ");
                altM = ler.nextDouble();
                somaM = somaM + idM;
                soma_altM = soma_altM + altM;
                totalM = totalM + 1;
                if(id18a35 >= 18 && id18a35 <= 35){
                    soma_id18a35 = soma_id18a35 + id18a35;
                    cont = cont + 1;
                }
            }
            if(op == 1){
                System.out.print("Informe a idade: ");
                idH = ler.nextInt();
                System.out.print("Informe a altura: ");
                altH = ler.nextDouble();
                somaH = somaH + idH;
                totalH = totalH + 1;
                if(id18a35 >= 18 && id18a35 <= 35){
                    soma_id18a35 = soma_id18a35 + id18a35;
                    cont = cont + 1;
                }
            }
            if(op != 0 && op != 1){
                System.out.println("OPÇÃO INVÁLIDA!!");
            }
        }
        medID = (somaM + somaH)/6;
        if(soma_altM != 0){
            med_altM = soma_altM / totalM;
        }else{
           med_altM = 0; 
        }
        if(somaH != 0){
            medID_H = somaH / totalH;
        }else{
           medID_H = 0; 
        }
        perc = id18a35 / cont * 100;
        System.out.println("\nA média do grupo é = " +medID);
        System.out.println("A média da altura de mulher é = " +med_altM);
        System.out.println("A média da idade de homem é = " +medID_H);
        System.out.println("A porcentagem é = " +perc);
        
    }
}
