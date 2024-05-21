import java.util.Scanner;

/*
Faça um algoritmo que leia um vetor de 10 elementos. Leia, a seguir, um valor N e verifique
se o valor aparece no vetor escrevendo: 0 - se o valor N não aparece no vetor; 1 - se o valor N
aparece no vetor.
 */
public class LPA_Q14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] vetor = new int[10];
        int num = 0, result = 0;
        boolean hasInt = false;
        System.out.println("Comparador de valor com valores de um vetor de 10 elementos!");
        System.out.println("0 - se o valor N não aparece no vetor; 1 - se o valor N\n" +
                "aparece no vetor.");

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

        System.out.println("Agora digite um número para saber se este está presente no vetor");
        while(!hasInt){
            if(input.hasNextInt()){
                num = input.nextInt();
                hasInt = true;
            }
            else{
                System.out.println("Lembre-se que o valor precisa ser inteiro! Tente novamente");
                input.next();
            }
        }

        for (int i = 0; i < vetor.length; i++) {
            if (num == vetor[i]){
                result = 1;
                break;
            }
        }

        System.out.printf("Resultado: %d", result);

    }

}
