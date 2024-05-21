import java.util.Scanner;

public class LPA_Q50 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numCandidatos = 20;

        // Vetores pedidos
        String[] cadastro = new String[numCandidatos];
        int[] partido = new int[numCandidatos];
        int[] votos = new int[numCandidatos];

        // Novos vetores contendo, por ordem de partido, os nomes dos candidatos e a sua quantidade de votos
        int[] maisVotadoPartido = new int[10];
        String[] maisVotadosNome = new String[10];

        int partido_atual, temp = 0;

        for (int i = 0; i < numCandidatos; i++) {       // OBTER DADOS

            System.out.printf("Digite o cadastro do candidato n°%d: ", (i+1));
            cadastro[i] = input.nextLine();
            System.out.printf("Digite o partido (1-10) do candidato n°%d: ", (i+1));

            partido[i] = input.nextInt();
            input.nextLine();
            while (partido[i] < 1 || partido[i] > 10){
                System.out.printf("O valor precisa estar entre 1-10, tente novamente (candidato n°%d): ", (i+1));
                partido[i] = input.nextInt();
            }

            System.out.printf("Digite o número de votos do candidato n°%d: ", (i+1));
            votos[i] = input.nextInt();
            while (votos[i] < 0){
                System.out.printf("O número de votos não pode ser menor que 0 , tente novamente (candidato n°%d): ", (i+1));
                votos[i] = input.nextInt();
            }
            input.nextLine();
        }

        for (int i = 0; i < numCandidatos; i++) {       // OBTER CANDIDATOS MAIS VOTADOS
            partido_atual = partido[i] - 1;

            for (int j = 0; j < 10; j++) {
                if(partido_atual == j && votos[i] > maisVotadoPartido[j]){
                    maisVotadoPartido[j] = votos[i];
                    maisVotadosNome[j] = cadastro[i];
                }
            }

        }

        for (int i = 0; i < 10; i++) {
            if(maisVotadosNome[i] != null){
                System.out.printf("Mais votado do partido %d: %s com quantidade de votos %d\n", i+1, maisVotadosNome[i], maisVotadoPartido[i]);
            }
        }

    }

}