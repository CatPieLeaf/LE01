public class Exercicio17 {

    // Elabore um algoritmo que receba três notas de um aluno os pesos referentes a
    // cada nota e retorne a sua média ponderada. Veja o cálculo da média ponderada:
    //                              nota1 * peso1 + nota2 * peso2 + nota3 * peso3
    //       Média ponderada =    ------------------------------------------------
    //                                        peso1 + peso2 + peso3
    //
    // Exemplo: nota1 = 10, nota2 = 5.5, nota3 = 8, peso1 = 5, peso2 = 3, peso3 = 2
    // Média ponderada = 8.25

    public static void run() {
        double nota1 = Prompt.lerDecimal("Digite nota 1 do aluno");
        double nota2 = Prompt.lerDecimal("Digite nota 2 do aluno");
        double nota3 = Prompt.lerDecimal("Digite nota 3 do aluno");
        double peso1 = Prompt.lerDecimal("Digite o peso da nota 1");
        double peso2 = Prompt.lerDecimal("Digite o peso da nota 2");
        double peso3 = Prompt.lerDecimal("Digite o peso da nota 3");
        double media = ((nota1 * peso1) + (nota2 * peso2) + (nota3 * peso3)) / (peso1 + peso2 + peso3);
        Prompt.imprimir("Média ponderada: " + media);
    }
}