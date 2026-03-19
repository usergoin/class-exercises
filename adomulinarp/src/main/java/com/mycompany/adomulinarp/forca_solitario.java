package com.mycompany.adomulinarp;
import java.util.Scanner;
public class forca_solitario {

    public static void main(String[] args) {
        Scanner feel = new Scanner(System.in);
        char[] palavra = {'S', 'O', 'L', 'I', 'T', 'A', 'R', 'I', 'O'};
        char[] resposta = new char[palavra.length];
        int erros = 0;

        for (int i = 0; i < resposta.length; i++) resposta[i] = '_';

        System.out.println("=== JOGO DA FORCA ===");
        System.out.println("Dica: pessoa que gosta de ficar sozinha!");

        while (erros < 6) {
            System.out.print("Palavra: ");
            for (char c : resposta) System.out.print(c + " ");
            System.out.print("Digite uma letra: ");
            char letra = Character.toUpperCase(feel.next().charAt(0));

            boolean acertou = false;
            for (int i = 0; i < palavra.length; i++) {
                if (palavra[i] == letra) {
                    resposta[i] = letra;
                    acertou = true;
                }
            }

            if (!acertou) {
                erros++;
                System.out.println("Errou! Tentativas restantes: " + (6 - erros));
            }

            boolean ganhou = true;
            for (int i = 0; i < resposta.length; i++) {
                if (resposta[i] == '_') ganhou = false;
            }

            if (ganhou) {
                System.out.println("\nParabéns! A palavra era SOLITARIO!");
                break;
            }
        }

        if (erros == 6) {
            System.out.println("Você perdeu! A palavra era SOLITARIO!");
        }

        feel.close();
    }
}