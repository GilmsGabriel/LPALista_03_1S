import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.Random;

// Resolva as questões 2, 3, 8, 11, 12 e 13 da Lista de Exercícios No 3 utilizando a linguagem Java.
/*
    Os que retornam algum valor:
*/
class rodada1Test {
    //TODO Questão 11
    @Test
    public void LPA_Q11Test(){
        Random ran = new Random();
        int[] v = new int[80];

        for (int i = 0; i < 80; i++) {
            for (int j = 0; j < 80; j++) {
                v[j] = ran.nextInt(80) + i;
            }
            v[i] = i;
            assertEquals(i, LPA_Q11.valor_min(v, 80));
            System.out.printf("\nO menor valor é %d ", LPA_Q11.valor_min(v, 80));
            System.out.printf(Arrays.toString(v));
        }
    }

    //TODO Questão 12
    @Test
    public void LPA_Q12Test(){
        double[] v;
        v = new double[]{40, 36, 14, 10};
        assertEquals(25,LPA_Q12.media(v));
        v = new double[]{28, 30, 29, 31, 32, 33, 34};
        assertEquals(31,LPA_Q12.media(v));
        v = new double[]{3,12,23,15,2};
        assertEquals(11,LPA_Q12.media(v));
    }
}
/*
Ma = (3+12+23+15+2) / 5

Ma = 55 / 5

Ma = 11
 */