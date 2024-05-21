import java.util.Scanner;

/*
24)Faça um algoritmo que leia um número N e escreva os N primeiros números primos em
ordem decrescente. Considere que N é no máximo igual a 100. Ex: Se N=5, escreva 11,7,5,3,2.
 */
public class LPA_Q24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = 0;
        int primo_max = 0;
        boolean primo = true;

        System.out.println("Digite o valor N para descobrir em forma decrescente, os primeiros N primos");
        n = input.nextInt();
        System.out.printf("Os %d° primeiros N primos são: | ", n);

        int[] vetor = new int[n];

        for (int i = 2; primo_max < n; i++) {
            primo = true;
            for (int j = 2; j < i; j++) {
                if(i % j == 0){
                    primo = false;
                }
            }
            if(primo){
                vetor[primo_max] = i;
                primo_max++;
            }
        }

        for (int i = n-1; i >= 0; i--) {
            System.out.printf("%d | ", vetor[i]);
        }
    }
}
