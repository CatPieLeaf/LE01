public class Exercicio20 {

    // Elabore um algoritmo que calcule a quantidade de litros de combustível gasta em
    // uma viagem, utilizando um automóvel que faz 12km por litro e considerando que são
    // fornecidos o tempo em hora e a velocidade média da viagem.

    public static void run() {
        double t = Prompt.lerDecimal("Insira o tempo da viagem (horas):");
        double v = Prompt.lerDecimal("Insira a velocidade média da viagem (km/h):");
        double l = (t * v) / 12;
        Prompt.imprimir("Litros gastos na viagem: " + l);
    }
}