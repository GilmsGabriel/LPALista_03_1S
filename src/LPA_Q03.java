import java.util.Scanner;
/* Faça um algoritmo que leia os conceitos (1, 2, 3, 4 ou 5) dos alunos de uma turma de 20
alunos. Após, o algoritmo desenha um histograma com os conceitos na forma
111
2222
3333333333
44
5
*/
public class LPA_Q03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] vetor = new int[20];

        System.out.println("Criador do histograma de notas!");

        // Leitor de Notas
        for (int i = 0; i < vetor.length; i++) {
            System.out.printf("\nDigite a nota do aluno n° %d de 1-5: ", i);
                vetor[i] = input.nextInt();
                if(vetor[i] > 5 || vetor[i] <=0){
                    System.out.println("Por favor, digite apenas valores entre 1 e 5");
                    i-=1;
                }
        }

        // Coloca as notas na tela. O primeiro loop permite iterar sobre o intervalo das notas (1-5)
        // Enquanto o segundo compara o valor do vetor, para imprimir apenas quando for igual à nota do loop acima.
        for (int i = 0; i < 5; i++) {
            for (int k : vetor) {
                if (k == i) {
                    System.out.printf("%d", i);
                }
            }
            System.out.println("\n");
        }

    }
}