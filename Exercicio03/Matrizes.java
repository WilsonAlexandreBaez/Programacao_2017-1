/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio03;

import java.util.Scanner;


/**
 *
 * @author BAEZ
 */


public class Matrizes {
    public static void main (String args[]){
    int ma[][] = new int [3][2];
    int mb[][] = new int [3][2];
    int mab[][] = new int [3][2];

    for (int i = 0; i < ma.length; i++) {
        for (int j = 0; j < ma[i].length; j++) {
            System.out.println("Digite o elemento da linha " + (i + 1) + " e coluna " + (j + 1) + " da matriz 1");
            ma[i][j] = new Scanner(System.in).nextInt();
        }
    }

    for (int i = 0; i < mb.length; i++) {
        for (int j = 0; j < mb[i].length; j++) {
            System.out.println("Digite o elemento da linha " + (i + 1) + " e coluna " + (j + 1) + " da matriz 2");
            mb[i][j] = new Scanner(System.in).nextInt();
        }
    }

            mab[1][1] = (ma[1][1] * mb[1][1]) + (ma[1][2] * mb[2][1]);
            mab[1][2] = (ma[1][1] * mb[1][2]) + (ma[1][2] * mb[2][2]);
            mab[2][1] = (ma[2][1] * mb[1][1]) + (ma[2][2] * mb[1][2]);
            mab[2][2] = (ma[2][1] * mb[1][2]) + (ma[2][2] * mb[2][2]);
            mab[3][1] = (ma[3][1] * mb[1][1]) + (ma[3][2] * mb[2][1]);
            mab[3][2] = (ma[3][1] * mb[1][2]) + (ma[3][2] * mb[2][2]);

            System.out.println("Multipliacação das matrizes:");

            for (int i = 0; i < mab.length; i++) {
                for (int j = 0; j < mab[i].length; j++) {
                    System.out.println(mab[i][j] + "\t");
            }
    }
    }
    }
    



