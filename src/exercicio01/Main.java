package exercicio01;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Jogador jg = new Jogador();

        System.out.println("Qual o nome do jogador?");
        jg.nome = sc.nextLine();

        System.out.println("Qual o score do jogador?");
        for (int i = 0; i < jg.score.length; i++) {
            jg.score[i] = sc.nextInt();
        }

        // saída de dados
        System.out.println("O jogador " + jg.nome + " tem um total de " + jg.calcularScoreTotal() + " pontos.");

    }
}
