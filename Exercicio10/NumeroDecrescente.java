/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio10;

import java.util.Scanner;

/**
 *
 * @author BAEZ
 */
public class NumeroDecrescente {

    int num;

/*public class NumeroDecrescente {

    int num;

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public void Numero() {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Infome um nunmero: ");
        num = entrada.nextInt();

        for (int i = num; i >= 0; i--) {

            System.out.println("A ordem decrescente do numero digitado é: "+i+" ");

        }

    }

}*/
    public void Numero() {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Infome um nunmero: ");
        num = entrada.nextInt();

        for (int i = num; i >= 0; i--) {

            System.out.println("Na ordem decrescente: "+i+" ");

        }

    }

    

}