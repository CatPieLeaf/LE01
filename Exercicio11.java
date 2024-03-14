import java.util.Arrays;

public class Exercicio11 {

    // Escreva um algoritmo que leia três valores inteiros distintos e escreva-os em
    // ordem crescente. 

    public static void run() {
        int[] nums = new int[3];
        for (int i = 0; i < 3; i++) {
            nums[i] = Prompt.lerInteiro("Digite um Número:");
        }
        Arrays.sort(nums);
        Prompt.imprimir("Em ordem crescente: " + Arrays.toString(nums).replace("[", "").replace("]", ""));
    }

}