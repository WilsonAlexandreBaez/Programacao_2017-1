/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio11;

/**
 *
 * @author BAEZ
 */
public class ImprimeParImpar {
      public static void main(String[] args) {
       int num = 30;
       long par = 1;
       int impar = 0;
       for (int i = 1; i <= num;i++){
          if (i %2==0){
          par += par * i;
          }else {
          impar += i;
          } 
          }         
         System.out.println("Soma dos Numeros Pares de 30: " + par);
         System.out.println("Soma dos Numeros Impar de 30: " + impar);
      };
}

  
