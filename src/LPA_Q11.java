import java.util.Arrays;
import java.util.Scanner;

// Escrever um algoritmo que lê um vetor N[80] e o escreve. Encontre, a seguir, o menor
//elemento e a sua posição no vetor N e escreva: "O menor elemento de N é = ... e a sua
//posição é... ".
public class LPA_Q11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] vetor = new int[80];

        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("Digite o valor da posição %d/80", i);
            vetor[i] = input.nextInt();
        }

        System.out.printf("\nO menor valor é %d ", valor_min(vetor, 80));
        System.out.printf(Arrays.toString(vetor));
    }

    public static int valor_min(int[] v, int tamanho){
        int aux = v[0];
        for (int i = 0; i < v.length - 1; i++) {
            for (int j = i+1; j < v.length; j++) {
                if(v[i] > v[j]){
                    aux = v[j];
                    v[j] = v[i];
                    v[i] = aux;
                }
            }
        }

        for (int i = 0; i < tamanho; i++) {
            if (aux > v[i]){
                aux = v[i];
            }
        }
        return aux;
    }




}
