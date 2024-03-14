public class Exercicio01 {

    // Escreva um algoritmo que leia um número digitado pelo usuário e mostre a mensagem “Número maior do que 10!”
    // caso este número seja maior, ou “Número menor ou igual a 10!” caso este número seja menor ou igual.

    public static void run() {
        int num = Prompt.lerInteiro("Digite um Número");
        if (num > 10) {
            Prompt.imprimir("Número maior do que 10!");
        } else {
            Prompt.imprimir("Número menor ou igual a 10!");
        }
    }

}