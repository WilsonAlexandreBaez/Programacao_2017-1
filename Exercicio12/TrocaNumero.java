/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio12;

import java.util.Scanner;

/**
 *
 * @author BAEZ
 */
public class TrocaNumero {
    int numA; 
    int numB;
    int aux;
    
    
    public void troca(){
    
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Informe o primeiro numero: ");
        numA = entrada.nextInt();
        System.out.println("Informe o segundo numero: ");
        numB = entrada.nextInt();
        
        aux = numA;
        numA = numB;
        numB = aux;
       System.out.println("O 2° número digitado foi: "+numA);
    
       System.out.println("O 1º número digitado foi: "+numB);
    
    }
    
}