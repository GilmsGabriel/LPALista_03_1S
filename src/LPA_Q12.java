//import java.util.Arrays; DEBUG

import java.util.Scanner;

// Faça um algoritmo que leia 10 valores, calcule sua média e escreva os valores que
//estão acima da média calculada.
public class LPA_Q12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] vetor = new double[10];
        System.out.println("Escritor de média!");
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("\nDigite o valor n° %d: ", i+1);
            vetor[i] = input.nextDouble();
        }
        System.out.printf("A média entre os valores inseridos é de: %1.2f", media(vetor));
    }

    public static double media(double[] v){
        double media = 0;

        for (double j : v) {
            media += j;
        }
        //debug_msg(media, v); DEBUG
        return media / v.length;
    }

    /* Código para debug:
    private static void debug_msg(double media, int[] v){
        System.out.printf("%s | Média: %1.2f | Tamanho: %d \n", Arrays.toString(v), media,v.length);
    }*/
}
