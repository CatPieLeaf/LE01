public class Exercicio03 {

    // Escreva um algoritmo que leia os valores de dois números inteiros distintos nas 
    // variáveis A e B e informe qual deles é o maior. Caso os números sejam iguais informarao usuário 
    // que a sequência de números informados é inválida

    public static void run() {
        int a = Prompt.lerInteiro("Digite um Número A:");
        int b = Prompt.lerInteiro("Digite um Número B:");
        if (a == b) {
            Prompt.imprimir("Sequência de Números Inválida!");
        } else if (a > b) {
            Prompt.imprimir("O Número A é maior que o número B.");
        } else {
            Prompt.imprimir("O Número B é maior que o número A.");
        }
    }

}