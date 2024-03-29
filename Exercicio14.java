public class Exercicio14 {

    // A expressão an = a1 + (n – 1) * r é denominada termo geral da Progressão
    // Aritmética (PA). Nesta fórmula, temos que an é o termo de ordem n (n-ésimo termo),
    // r é a razão e a1 é o primeiro termo da Progressão Aritmética. Escreva um algoritmo
    // que encontre o n-ésimo termo de uma progressão aritmética. Exemplo: a1 = 10, n = 7, r = 3.
    // Resultado: an = 28

    public static void run() {
        int a1 = Prompt.lerInteiro("Digite o Primeiro Termo (a1):");
        int n = Prompt.lerInteiro("Digite o n-ésimo termo (n):");
        int r = Prompt.lerInteiro("Digite a Razao (r):");
        int an = a1 + (n - 1) * r;
        Prompt.imprimir("Resultado: " + an);
    }
}