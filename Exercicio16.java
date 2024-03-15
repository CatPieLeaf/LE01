public class Exercicio16 {

    // Elabore um algoritmo que receba três notas de um aluno e retorne a sua média
    // aritmética. Exemplo: nota1 = 10.0, nota2 = 5.5, nota3 = 8.0. Média: 7.83

    public static void run() {
        double nota1 = Prompt.lerDecimal("Digite nota 1 do aluno");
        double nota2 = Prompt.lerDecimal("Digite nota 2 do aluno");
        double nota3 = Prompt.lerDecimal("Digite nota 3 do aluno");
        double media = (nota1 + nota2 + nota3) / 3;
        Prompt.imprimir("Média: " + media);
    }
}