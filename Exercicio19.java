public class Exercicio19 {

    // Faça um algoritmo que receba o raio e a altura de um cilindro e retorne o seu
    // volume calculado de acordo com a seguinte fórmula: volume = 3.14 * raio2 * altura;
    // Exemplo: raio = 10, altura = 15. Volume = 4710

    public static void run() {
        double raio = Prompt.lerDecimal("Insira o raio do cilindro");
        double altura = Prompt.lerDecimal("Insira a altura do cilindro");
        double volume = 3.14 * Math.pow(raio, 2) * altura;
        Prompt.imprimir("Volume: " + volume);
    }
}