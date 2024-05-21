import java.util.Scanner;

/*
23)Faça um algoritmo que leia um vetor V[5], com os valores sorteados em um sorteio de
Loto. Leia, a seguir, para um conjunto de 5 apostadores, seus 5 apostadors e escreva, para cada
um, o número de acertos que teve.
 */
public class LPA_Q23 {
    public static void main(String[] args) {
        int[] num_sorteados = new int[5];
        int[] apostador1 = new int[5];
        int[] apostador2 = new int[5];
        int[] apostador3 = new int[5];
        int[] apostador4 = new int[5];
        int[] apostador5 = new int[5];
        int[] acertos_por_apostador = new int[5]; // Acertos para a cada apostador. Ex: acertos[0] 



        //  Insere valores num_sorteados
        num_sorteados = inserir_aposta(num_sorteados, "s Num Sorteados");

        //  Insere valores para cada Apostador, e retorna em ordem
        acertos_por_apostador[0] = acertos(apostador1, " palpite do apostador 1", num_sorteados);
        acertos_por_apostador[1] = acertos(apostador2, " palpite do apostador 2", num_sorteados);
        acertos_por_apostador[2] = acertos(apostador3, " palpite do apostador 3", num_sorteados);
        acertos_por_apostador[3] = acertos(apostador4, " palpite do apostador 4", num_sorteados);
        acertos_por_apostador[4] = acertos(apostador5, " palpite do apostador 5", num_sorteados);


        //Diz o num de acertos por apostador
        for (int i = 0; i < 5; i++) {
            System.out.printf("O apostador n° %d teve %d acertos! \n", i+1, acertos_por_apostador[i]);
        }
    }


    //Insere os valores sorteados para a váriavel que contém os números de aposta
    public static int[] inserir_aposta(int[] vetor, String nome_vetor){
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.printf("Por favor insira o %d° número inteiro para o definir o%s ", i, nome_vetor);
            vetor[i] = input.nextInt();
            for (int j = 0; j < vetor.length; j++) {
                if (i != j && vetor[i] == vetor[j]) {
                    System.out.println("\nEste número já foi digitado! ");
                    i -= 1;
                    break;
                }
            }
        }
        return vetor;
    }

    //Insere os valores para os vetores de cada Apostador, ao mesmo tempo que aumenta o score de acertos caso ele acerte um número
    public static int acertos(int[] vetor, String nome_vetor, int[]sorteados) {
        Scanner input = new Scanner(System.in);
        int acerto = 0;

        for (int i = 0; i < 5; i++) {
            System.out.printf("Por favor insira o %d° número inteiro para o definir o%s \n", i, nome_vetor);
            vetor[i] = input.nextInt();
            for (int j = 0; j < vetor.length; j++) {
                if (i != j && vetor[i] == vetor[j]) {
                    System.out.println("\nEste número já foi digitado! ");
                    j -= 1;
                    break;
                }
            }
            for (int j = 0; j < 5; j++) {
                if(vetor[i] == sorteados[j]){
                    acerto++;
                }
            }
        }
        return acerto;
    }
}
