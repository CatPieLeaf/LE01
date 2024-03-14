public class Exercicio06 {

    // Ler uma temperatura em graus Celsius e apresentá-la convertida em graus
    // Fahrenheit. A fórmula de conversão é:F = (9 * C + 160) / 5

    public static void run() {
        double c = Prompt.lerDecimal("Digite uma temperatura em Celsius:");
        double f = (9 * c + 160) / 5;
        Prompt.imprimir("Fahrenheit: " + f);

    }

}