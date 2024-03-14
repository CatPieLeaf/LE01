public class Exercicio10 {

    // Escreva um algoritmo que leia um número de 1 a 5 e escreva-o por extenso. Caso
    // o usuário digite um valor que não esteja neste intervalo, exibir a mensagem: “Número
    // inválido!”. 

    public static void run() {
        int num = Prompt.lerInteiro("Digite um Número de 1 a 5:");
        String[] extenso = new String[] {"um", "dois", "três", "quatro", "cinco"};
        try {
            Prompt.imprimir("Seu número: " + extenso[num-1]);
        } catch (Exception e) {
            Prompt.imprimir("Número inválido!");
        }
    }

}