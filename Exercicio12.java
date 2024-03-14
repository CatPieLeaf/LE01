public class Exercicio12 {

    // Escreva um algoritmo que receba o número do mês e mostre o mês
    // correspondente. Valide mês inválido.

    public static void run() {
        int num = Prompt.lerInteiro("Digite o número de um mês:");
        String[] meses = new String[] {"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};
        try {
            Prompt.imprimir("Mês correspondente: " + meses[num-1]);
        } catch (Exception e) {
            Prompt.imprimir("Mês inválido!");
        }
    }

}