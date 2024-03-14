public class Exercicio04 {

    // Escreva um algoritmo que leia dois números e ao final mostre a soma, subtração, 
    // multiplicação e a divisão dos números lidos.

    public static void run() {
        int num1 = Prompt.lerInteiro("Digite um Número:");
        int num2 = Prompt.lerInteiro("Digite mais um Número:");
        Prompt.imprimir("Soma: " + (num1+num2));
        Prompt.imprimir("Subtraçao: " + (num1-num2));
        Prompt.imprimir("Multiplicaçao: " + (num1*num2));
        Prompt.imprimir("Divisao: " + (num1/num2));
    }
}