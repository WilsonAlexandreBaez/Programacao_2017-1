/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio09;

/**
 *
 * @author BAEZ
 */
import java.util.Scanner;


  public class MaiorNumero {
    
    int numA; 
    int numB;
    
    public void maior(){
    
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe o primeiro numero: ");
        numA = sc.nextInt();
        System.out.println("Informe o segundo numero: ");
        numB = sc.nextInt();
        
        
        if(numA > numB)
    
              System.out.println("O Maior número digitado foi: "+numA);
        else
            System.out.println("O Maior número digitado foi: "+numB);
    
    }
    
}
