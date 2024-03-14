public class Exercicio08 {

    // Escreva um algoritmo que leia um número e mostre uma mensagem caso este
    // número seja maior ou igual a 50, outra se ele for menor que 50.

    public static void run() {
        int num = Prompt.lerInteiro("Digite um Número:");
        if (num >= 50) {
            Prompt.imprimir("O número é maior ou igual a 50");
        } else {
            Prompt.imprimir("O número é menor que 50");
        }
    }

}