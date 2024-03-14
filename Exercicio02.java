public class Exercicio02 {

    // Escreva um algoritmo que leia dois números digitados 
    // pelo usuário e exiba o resultado da sua soma

    public static void run() {
        int num1 = Prompt.lerInteiro("Digite um Número:");
        int num2 = Prompt.lerInteiro("Digite mais um Número:");
        Prompt.imprimir("Soma: " + (num1+num2));
    }
}