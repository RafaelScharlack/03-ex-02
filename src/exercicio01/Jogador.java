package exercicio01;

import java.util.Scanner;

public class Jogador {


      // atributos ou variáveis de instãncia

        String nome;
        int[] score = new int[3];



      // método para calcular e retornar o score total

    public int  calcularScoreTotal () {
        int total = 0;

        for (int i = 0; i < score.length; i++) {
            total += score[i];
        }

        return total;
    }




}
