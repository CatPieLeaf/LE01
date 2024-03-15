public class Exercicio18 {

    // Elabore um algoritmo que receba três notas de um aluno e retorne a sua média harmônica.
    //                                        3
    //      Média harmônica = ---------------------------------
    //                             1          1         1
    //                         -------- + -------- + --------
    //                           nota1     nota2      nota3
    //
    // Exemplo: nota1 = 10, nota2 = 5.5, nota3 = 8
    // Média: 7.37


    public static void run() {
        double nota1 = Prompt.lerDecimal("Digite nota 1 do aluno");
        double nota2 = Prompt.lerDecimal("Digite nota 2 do aluno");
        double nota3 = Prompt.lerDecimal("Digite nota 3 do aluno");
        double media = 3 / ((1/nota1) + (1/nota2) + (1/nota3));
        Prompt.imprimir("Média: " + media);
    }
}