public class Exercicio15 {

    // Tendo como dados de entrada dois pontos quaisquer no plano, P1(x1, y1) e P2(x2, y2), 
    // calcule e retorne a distância entre eles. A fórmula que efetua tal cálculo é: d = raiz (((x2 - x1)2) + ((y2 - y1)2)). 
    // Exemplo: p1(0, 5), p2(10, 20). Distancia: 18,03

    public static void run() {
        double x1 = Prompt.lerDecimal("Digite a coordenada X do ponto 1");
        double y1 = Prompt.lerDecimal("Digite a coordenada Y do ponto 1");
        double x2 = Prompt.lerDecimal("Digite a coordenada X do ponto 2");
        double y2 = Prompt.lerDecimal("Digite a coordenada Y do ponto 2");
        double d = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        Prompt.imprimir("Distancia: " + d);
    }
}