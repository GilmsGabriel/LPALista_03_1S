import java.util.Arrays;
import java.util.Scanner;

/*
   Escrever um algoritmo que lê um vetor X[10] e, após, leia um vetor Y[10]. Crie, a seguir, um
terceiro vetor Z com os elementos que aparecem em um X ou em Y (união); elementos que
aparecem em X e Y simultaneamente devem aparecer apenas uma vez em Z. Os elementos
devem aparecer no vetor Z na mesma ordem em que aparecem no vetor X e Y. Considere que
não há repetição de valores dentro do mesmo vetor. Escreva o vetor Z (apenas as posições
que foram preenchidas).
 */
public class LPA_Q22 {
    public static void main(String[] args) {
        int tamanho = 10;
        int[] x = new int[tamanho];
        int[] y = new int[tamanho];
        int[] z = new int[tamanho*2];
        int i = 0;
        int count = 0;
        System.out.println("Comparador de Vetores");
        System.out.println("Este programa recebe 10 números para um conjunto X e um conjunto Y, e os apresenta sem repetições");


        x = inserir(x, "X");
        System.out.println("\n Agora para o vetor Y! \n");


        y = inserir(y, "Y");

        for (int valor : x) {
            z[i++] = valor;
        }

        for (int j = 0; j < tamanho; j++) {
            if(!contem(x, y[j])){
                z[i++] = y[j];
            }
        }

        z = Arrays.copyOf(z, i);


        for (int valor: z) {
            System.out.printf("%d, ", valor);
        }


        System.out.printf("\n\t DEBUG ARRAY Z: %s", Arrays.toString(z));


    }


    public static boolean contem(int[] vetor, int Value){
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == Value){
                return true;
            }
        }
        return false;
    }


    public static int[] inserir(int[] vetor, String nome_vetor){
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("Por favor insira o %d° número inteiro para o vetor %s :  ", i+1, nome_vetor);
            vetor[i] = input.nextInt();
            for (int j = 0; j < vetor.length; j++) {
                if (i != j && vetor[i] == vetor[j] && vetor[i] != 0) {
                    System.out.println("\nEste número já foi digitado! ");
                    i -= 1;
                    break;
                }
            }
        }
        return vetor;
    }
}


