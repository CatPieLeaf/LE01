public class Exercicio07 {

    // Escreva um algoritmo que leia um número e diga, através de uma mensagem, se
    // este número está no intervalo entre 100 e 200. Caso o número esteja fora do intervalo
    // o usuário também deverá ser informado. 

    public static void run() {
        int num = Prompt.lerInteiro("Digite um Número:");
        if (100 < num && num < 200) {
            Prompt.imprimir("O número está no intervalo entre 100 e 200");
        } else {
            Prompt.imprimir("O número é externo ao intervalo entre 100 e 200");
        }
    }
}