import java.util.Scanner;

/*
Escrever um algoritmo que lê um vetor N[10] e o escreve. Troque, a seguir, o 1° elemento
com o último, o 2° com o penúltimo, etc até o 5° com o 6° e escreva o vetor N assim
modificado.
 */
public class LPA_Q15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] vetor = new int[10];
        int aux = 0;
        System.out.println("Inversor de vetor N de 10 elementos!");

        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("\nDigite um valor para a posição %d do vetor: ", i+1);
            if(input.hasNextInt()){
                vetor[i] = input.nextInt();
            }
            else{
                System.out.println("Lembre-se que o valor precisa ser inteiro! Tente novamente");
                input.next();
                i-=1;
            }
        }

        for (int i = 0, j = vetor.length-1; i < (vetor.length)/2; i++, j--) {
            aux = vetor[i];
            vetor[i] = vetor[j];
            vetor[j] = aux;
        }

        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("Valor da posição %d do Vetor N: %d\n", i+1, vetor[i]);
        }
    }
}
