import java.util.Scanner;

// Escreva um algoritmo que lê um vetor A[10] e escreva a posição de cada elemento primo
//deste vetor.
public class LPA_Q08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] vetor = new int[10];
        System.out.println("Apontador de números primos!");
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("\nDigite o valor n° %d: ", i+1);
            vetor[i] = input.nextInt();
        }
        System.out.println("Números primos:");
        for (int i = 0; i < vetor.length; i++) {
            boolean primo = true;
            for (int j = 2; j < vetor[i]; j++) {
                if(vetor[i] % j == 0){
                    primo = false;
                    break;
                }
            }
            if(primo){
                System.out.printf("Valor primo: %d na posição [%d] \n", vetor[i], i+1);
            }
        }
    }
}
