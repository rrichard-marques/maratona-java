package introducao;

import java.util.Scanner;

public class Aula07Arrays02 {
    public static void main(String[] args) {

        /* int[] v1 = {1,2,3,4,5,6,7,8,9};
        int[] v2 = {2,3,4,5,6,7,8,9,0};

        for (int i = 0 ; i < v1.length && i < v2.length  ; i++) {
            int vr = v1[i] * v2[i];
            System.out.println(v1[i] + " x " + v2[i] + " = " + vr);
        } */

        /* int[][][] aM = new int[2][2][2];

        aM[0][0][0] = 1;
        aM[0][0][1] = 2;
        aM[0][1][0] = 3;
        aM[0][1][1] = 4;
        aM[1][0][0] = 5;
        aM[1][0][1] = 6;
        aM[1][1][0] = 7;
        aM[1][1][1] = 8;

        System.out.println(aM[0][0][0]);
        System.out.println(aM[0][0][1]);
        System.out.println(aM[0][1][0]);
        System.out.println(aM[0][1][1]);
        System.out.println(aM[1][0][0]);
        System.out.println(aM[1][0][1]);
        System.out.println(aM[1][1][0]);
        System.out.println(aM[1][1][1]); */

        /* Scanner input = new Scanner(System.in);
        int a1 [][][] = new int [2][2][2];

        for (int i = 0 ; i < a1.length ; i++) {
            for (int j = 0 ; j < a1[i].length ; j++) {
                for (int k = 0 ; k < a1[j].length ; k++) {
                    System.out.println("Digite o valor da posição: [" + i + "]" + "[" + j + "]" + "[" + k + "]");
                    a1[i][j][k] = input.nextInt();
                }
            }
        }
        for (int i = 0 ; i < a1.length ; i++) {
            for (int j = 0 ; j < a1[i].length ; j++) {
                for (int k = 0 ; k < a1[j].length ; k++) {
                    System.out.println("[" + i + "]" + "[" + j + "]" + "[" + j + "] = " + a1[i][j][k]);
                }
            } */

        /*int a1[][] = new int[3][3];

        a1[0][0] = 1;
        a1[0][1] = 2;
        a1[0][2] = 3;
        a1[1][0] = 4;
        a1[1][1] = 5;
        a1[1][2] = 6;
        a1[2][0] = 7;
        a1[2][1] = 8;
        a1[2][2] = 9;

        int resultado = 1;
        for (int i = 0; i < a1.length; i++) {
            for (int j = 0; j < a1[i].length; j++) {
                if (i == j) {
                    resultado = resultado * a1[i][j];
                }
            }

        }
        System.out.println("Resuldado da multiplicação da matriz é: " + resultado);*/

        /*int[][] array = new int[12][];

        array[0] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31};
        array[1] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28};
        array[2] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31};
        array[3] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30};
        array[4] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31};
        array[5] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30};
        array[6] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31};
        array[7] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31};
        array[8] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30};
        array[9] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31};
        array[10] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30};
        array[11] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31};

        String[] mes = new String[]{"Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho",
                "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro"};


        int i = 0;

        while (i < mes.length) {


            for (int[] arrayBase : array) {

                System.out.println("");
                System.out.println("Mês de " + mes[i]);
                System.out.println("");
                i = i + 1;

                for (int num : arrayBase) {

                    if (arrayBase == array[4] && num == 3) {
                        System.out.println(num + " Aniversário de Fafá");
                    }
                    if (arrayBase == array[4] && num == 27) {
                        System.out.println(num + " Aniversário de Richard");
                    }
                    if (arrayBase == array[8] && num == 18) {
                        System.out.println(num + " Aniversário de My Love");
                    }
                    System.out.println(num);
                }
            }
        }*/

        /*for (int i = 0 ; i <= 10 ; i++) {
            for (int j = 1 ; j <= 10 ; j++) {
                System.out.println(i + " x " + j + " = " + (i * j));
            }
            System.out.println("");
        }*/

        /*Scanner input = new Scanner(System.in);

        System.out.println("Informe um número:");
        int num = input.nextInt();
        String tex1 = " é maior que ";
        String tex2 = " é menor que ";
        String tex3 = " é igual a ";

        if(num > 10) {
            System.out.println(num + tex1 + 10);
        }
        if(num < 10) {
            System.out.println(num + tex2 + 10);
        }
        if(num == 10) {
            System.out.println(num + tex3 + 10);
        }*/


        Scanner input = new Scanner(System.in);

        int vetor[] = new int[5];

        for (int i = 0 ; i < vetor.length ; i++) {
            System.out.println("Digite a nota " + (i + 1) + ":");
            vetor[i] = input.nextInt();
            if (i == 4) {
                System.out.println("----------------------");
                for (int j = 0 ; j < vetor.length ; j++) {
                    System.out.println("Nota " + (j + 1) + " = " + vetor[j]);
                }
            }
        }

    }
}
