import java.util.Scanner;

/*
26)Escrever um algoritmo que lê 3 vetores A[10], B[10] e C[10] e escreve os elementos que
estão em A e B (interseção) mas não estão em C. Escreva os valores na ordem em que eles
aparecem no vetor A. Os três vetores devem ser lidos separadamente (em primeiro lugar, todo
o vetor A, após, o vetor B e por fim o vetor C).
 */
public class LPA_Q26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] A = new int[10];
        int[] B = new int[10];
        int[] C = new int[10];

        A = inserir(A, "A");
        B = inserir(B, "B");
        C = inserir(C, "C");



        for (int i = 0; i < A.length; i++) {
            if(contem(B, A[i]) && !contem(C, A[i])){
                System.out.printf("%d, ", A[i]);
            }
        }
    }
    public static int[] inserir(int[] vetor, String vetor_nome){
        Scanner input = new Scanner(System.in);
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("Por favor insira o %d° número inteiro para o vetor %s :  ", i + 1, vetor_nome);
            vetor[i] = input.nextInt();
        }
        return vetor;
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
