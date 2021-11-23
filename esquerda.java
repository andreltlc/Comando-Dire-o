package hackaton;

import java.util.*;

public class esquerda {
    public static void main(String[] aStrings) {
        String str;
        double contC, contD, contE, direcao, orientacao;
        int x;
        x = 0;
        contD = 0;
        contE = 0;
        Scanner s = new Scanner(System.in);
        System.out.println("informe quantos comandos o soldado vai receber");
        contC = s.nextInt();
        System.out.println("Informe D, para virar a direita, E para virar a esquerda");
        str = s.next();
        int Comandos = str.length();
        while (Comandos != contC) {
            System.out.println("Quantidade de comandos incorreta, repita o processo");
            str = s.next();
            Comandos = str.length();
        }
        while (x < contC) {
            char a = str.charAt(x);
            System.out.println(a);
            if (a == 'd' || a == 'D') {
                contD++;
            } else if (a == 'e' || a == 'E') {
                contE++;
            } else {
            }
            x++;
        }
        if (contD > contE) {
            direcao = contD - contE;
            orientacao = direcao % 4;
        } else {
            direcao = contE - contD;
            orientacao = direcao % 4;
        }
        if (orientacao == 0) {
            System.out.println("Está virado para o norte");
        } else if (orientacao == 1) {
            System.out.println("Está virado para o leste");
        } else if (orientacao == 2) {
            System.out.println("Está virado para o sul");
        } else {
            System.out.println("Está virado para oeste");
        }
    }
}
