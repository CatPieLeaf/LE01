public class Exercicio09 {

    // Leia dois números nas variáveis A e B e identifique se os valores são iguais ou
    // diferentes. Caso eles sejam iguais imprima uma mensagem dizendo que são iguais.
    // Caso sejam diferentes, informe que são diferentes e qual número é o maior. 

    public static void run() {
        int a = Prompt.lerInteiro("Digite um Número A:");
        int b = Prompt.lerInteiro("Digite um Número B:");
        if (a == b) {
            Prompt.imprimir("Ambos os números sao iguais!");
        } else if (a > b) {
            Prompt.imprimir("Ambos sao diferentes.\nO Número A é maior que o número B.");
        } else {
            Prompt.imprimir("Ambos sao diferentes.\nO Número B é maior que o número A.");
        }
    }

}