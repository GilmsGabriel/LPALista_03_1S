
// A conjectura de Goldbach diz que qualquer número par maior que 2 pode ser representado
//como a soma de dois números primos. Assim, 4=2+2, 6=3+3, 8=3+5... Faça um algoritmo que
//leia um número N, par, e escreva, em ordem crescente, os dois números primos que o
//compõem. No caso de haver mais de um par de números (p.ex:20=3+17 e 20=7+13) escreva o
//par que tiver o menor número primo.


import java.util.Scanner;

public class LPA_Q13 {
    public static void main(String[] args) {
        int valor;
        Scanner input = new Scanner(System.in);
        System.out.println("Digite um número PAR para descobrir os dois primos pelo qual este é composto");
        do{
            System.out.println("OBS: O número precisa ser PAR: ");
            valor = input.nextInt();
        }while(valor % 2 != 0);

        soma_primos(valor);
    }
    public static void soma_primos(int num){
        int metade = num/ 2;
        int valor1 = 0, valor2 = 0;
        boolean primo;

        for (int i = metade, j = metade; i < num; i--, j++) {
            for (int k = 2; k < i; k++) {
                if(i % k == 0){
                    break;
                }
            }
            primo = true;
            for (int k = 2; k < j; k++) {
                if(j % k == 0){
                    primo = false;
                    break;
                }
            }
            if(primo){
                valor1 = i;
                valor2 = j;
                break;
            }

        }
        System.out.printf("Valores primos: %d e %d, soma = %d", valor1, valor2, valor1+valor2);
    }

}
