import java.util.Scanner;

/*
25)Escrever um algoritmo que lê 2 vetores X[10] e Y[10], e escreva os elementos que
aparecem no vetor X e não aparecem no vetor Y (diferença de conjuntos). Escreva os valores
na ordem em que eles aparecem no vetor X. Os dois vetores devem ser lidos separadamente
(em primeiro lugar, todo o vetor X, após, o vetor Y).
 */
public class LPA_Q25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] X = new int[10];
        int[] Y = new int[10];
        System.out.println("Este programa é um determinador de diferença entre dois conjuntos");


        for (int i = 0; i < X.length; i++) {
            System.out.printf("Por favor insira o %d° número inteiro para o vetor X :  ", i + 1);
            X[i] = input.nextInt();
        }

        for (int i = 0; i < X.length; i++) {
            System.out.printf("Por favor insira o %d° número inteiro para o vetor Y :  ", i + 1);
            Y[i] = input.nextInt();
        }
        System.out.println("Todos os elementos em X que não estão em Y:");
        for (int i = 0; i < X.length; i++) {
            if(!contem(Y, X[i])){
                System.out.printf("%d, ", X[i]);
            }
        }


    }

    public static boolean contem(int[] vetor, int Value){
        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == Value){
                return true;
            }
        }
        return false;
    }
}
