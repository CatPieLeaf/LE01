public class Exercicio13 {

    // Escreva um algoritmo que leia valores REAIS nas variáveis A e B e o tipo de
    // operador em outra variável do tipo CARACTERE. Imprima o resultado da operação
    // de A por B se o operador aritmético for válido; caso contrário deve ser impresso uma
    // mensagem de operador não definido. Tratar erro de divisão por zero.

    public static void run() {
        double a = Prompt.lerDecimal("Digite um Número A:");
        double b = Prompt.lerDecimal("Digite um Número B:");
        String caractere = Prompt.lerLinha("Digite um Operador Matemático:");
        if (caractere.equals("+")) { 
            Prompt.imprimir("Soma: " + (a+b));
        } else if (caractere.equals("-")) { 
            Prompt.imprimir("Subtraçao: " + (a-b));
        } else if (caractere.equals("/")) {
            if (b != 0) {
                Prompt.imprimir("Divisao: " + (a/b));
            } else {
                Prompt.imprimir("Impossível dividir por zero!");
            }
        } else if (caractere.equals("*") || caractere.equals("x")) {
            Prompt.imprimir("Multiplicaçao: " + (a*b));
        } else if (caractere.equals("^")) {
            Prompt.imprimir("Potenciaçao: " + (Math.pow(a, b)));
        } else {
            Prompt.imprimir("Operador nao definido!");
        }
    }
}