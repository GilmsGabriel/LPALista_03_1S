import java.util.Scanner;

// Faça um algoritmo que leia 10 valores e os escreva na ordem contrária à que foram
// digitados.
public class LPA_Q02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] vetor = new int[10];

        System.out.println("Inversor de conjunto!");
        for (int i = 9, j = 1; i >= 0; i--, j++) {
            System.out.printf("\nDigite o valor n° %d: ", j);
            vetor[i] = input.nextInt();
        }
        System.out.println("Ordem contrária do conjunto:");
        for (int j : vetor) {
            System.out.printf("%d, ", j);
        }

    }

}
