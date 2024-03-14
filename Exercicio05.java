public class Exercicio05 {

    // Leia valores nas variáveis A e B, e efetue a troca dos valores de forma que o 
    // valorda variável A passe a ser o valor da variável B e o valor da variável B passe 
    // a ser o valor da variável A. Apresentar uma mensagem com o valor original de cada variável e 
    // outra com os valores trocados.

    public static void run() {
        int a = Prompt.lerInteiro("Digite um Número A:");
        int b = Prompt.lerInteiro("Digite um Número B:");
        Prompt.imprimir("Valor Original A:" + a);
        Prompt.imprimir("Valor Original B:" + b);
        int temporary = b;
        b = a;
        a = temporary;
        Prompt.imprimir("Valor Atual A:" + a);
        Prompt.imprimir("Valor Atual B:" + b);
    }
}