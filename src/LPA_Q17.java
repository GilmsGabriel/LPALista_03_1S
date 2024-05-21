import java.util.Scanner;

/*
Escreva um algoritmo que lê em um vetor de 20 posições de números positivos, até que o
vetor esteja completo ou que tenha sido fornecido o valor 0 (zero). Após, escreva o vetor. A
seguir, o algoritmo deve ler um número positivo qualquer e, caso ele se encontre no vetor,
deve remover todas suas ocorrências, por um deslocamento para a esquerda dos
elementos que encontram-se à direita daquele a ser removido. Escreve o vetor modificado.
 */
public class LPA_Q17 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] vetor = new int[20];
        boolean hasInt = false;
        int num = 0;
        System.out.println("Removedor de valor de um vetor N de 20 elementos!");

        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("\nDigite um valor inteiro positivo para a posição %d do vetor: ", i+1);
            if(input.hasNextInt()){
                vetor[i] = input.nextInt();
            }
            else{
                System.out.println("Lembre-se que o valor precisa ser inteiro! Tente novamente");
                input.next();
                i-=1;
            }
        }

        System.out.println("Agora digite um número para remover este do vetor");
        while(!hasInt){
            if(input.hasNextInt()){
                num = input.nextInt();
                if (!(num <= 0)){
                    hasInt = true;
                }
                else{
                    System.out.println("Lembre-se que o valor precisa ser inteiro e POSITIVO! Tente novamente");
                }
            }
            else{
                System.out.println("Lembre-se que o valor precisa ser INTEIRO e positivo! Tente novamente");
                input.next();
            }
        }

        System.out.print("Vetor restante:");
        for (int i = 0; i < vetor.length; i++) {
            if(num != vetor[i]){
                System.out.printf("%d, ", vetor[i]);
            }
        }
    }

}
