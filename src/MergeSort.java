import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] banana = new int[]{1,5,3,2,4,8,7,6,9};
        //mergeSort(banana, 9);
        System.out.printf("%s\n", Arrays.toString(banana));

    }


    public static void mergeSort(int vetor[], int tamanho){
        // Função com o objetivo de dividir o vetor em metades até que tamanho < 2
        // a função divide cada lado, e então chama o merge() para ordenar cada vetorzinho e unir-los

        if(tamanho < 2){ // Se o vetor tiver tamanho menor que 2, então a função cessa, terminando a recursão
            return;
        }

        int middle = tamanho/2;
        int[] left = new int[middle];
        int[] right = new int[tamanho - middle];

        for (int i = middle; i < tamanho; i++) {    // Preenche o lado direito do meio adiante
            right[i - middle] = vetor[i];
        }

        for (int i = 0; i < middle; i++) {          // Preenche o lado esquerdo até o meio
            left[i] = vetor[i];
        }

        //System.out.printf("Esquerda: %s", Arrays.toString(left));
        //System.out.printf("     |   Direita: %s\n", Arrays.toString(right));

        mergeSort(left, middle);                        // Recursão para dividir o lado esquerdo do vetor atual
        mergeSort(right, tamanho-middle);       // Recursão para dividir o lado direito do vetor atual

        merge(vetor, left, right, middle, tamanho-middle);      // Ordena os vetores atuais e junta-os
    }

    public static void merge(int[] vetor, int[] l, int[] r, int esquerda, int direita){
        int i = 0, j = 0, k = 0;

        while (i < direita && j < esquerda){
            if (l[j] <= r[i]){
                vetor[k++] = l[j++];
            }
            else {
                vetor[k++] = r[i++];
            }
        }
        while (i < direita){
            vetor[k++] = r[i++];

        }
        while (j < esquerda){
            vetor[k++] = l[j++];
        }
    }
}


