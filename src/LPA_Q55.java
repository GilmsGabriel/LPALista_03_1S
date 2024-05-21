import java.util.Arrays;
import java.util.Scanner;

public class LPA_Q55 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] naipe = new int[10];
        int[] cartas = new int[10];
        int[] naipe_ord = new int[10];
        int[] cartas_ord = new int[10];
        int k = 0, temp;
        for (int i = 0; i < 10; i++) {
            System.out.printf("Digite o valor da carta (1-13) para a %d° carta ", i+1);
            cartas[i] = input.nextInt();
            while (cartas[i] < 1 || cartas[i] > 13){
                System.out.printf("O valor do naipe não pode além do limite 1-4 , tente novamente (candidato n°%d): ", (i+1));
                cartas[i] = input.nextInt();
            }


            System.out.printf("Digite o naipe (1 - ouros, 2 - copas, 3 - paus, 4 - espadas) para a %d° carta ", i+1);
            naipe[i] = input.nextInt();
            while (naipe[i] < 1 || naipe[i] > 4){
                System.out.printf("O valor do naipe não pode além do limite 1-4 , tente novamente (candidato n°%d): ", (i+1));
                naipe[i] = input.nextInt();
            }
        }

        for (int i = 0; i < 5; i++) {

            for (int j = 0; j < 10; j++) {
                if(naipe[j] == i+1 && k<10){
                    naipe_ord[k] = i+1;
                    cartas_ord[k++] = cartas[j];
                }
            }

            for (int j = 0; j < 10; j++) {
                if(naipe_ord[j] == i+1){
                    for (int l = j+1; l < 10; l++) {
                        if (cartas_ord[j] > cartas_ord[l] && cartas_ord[l] != 0){
                            temp = cartas_ord[l];
                            cartas_ord[l] = cartas_ord[j];
                            cartas_ord[j] = temp;
                        }
                    }
                }
            }


        }
        System.out.println("A ordem das cartas por nipe é: ");
        for (int i = 0; i < 10; i++) {
            System.out.printf("No nipe %d: Carta n° %d\n", naipe_ord[i], cartas_ord[i]);
        }

    }
}
