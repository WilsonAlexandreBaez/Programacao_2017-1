/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio13;

import java.util.Scanner;

/**
 *
 * @author BAEZ
 */
public class MediaAluno {
     int notas[];
     int qt_nt;
     float media;

    public int getQt_Notas() {
        return qt_nt;
    }

    public void setQt_Notas(int qt_Notas) {
        this.qt_nt = qt_Notas;
    }

    public int[] getNotas() {
        return notas;
    }

    public void setNotas(int[] notas) {
        this.notas = notas;
    }
     
    
       public void adicionarNotas(){
       
        System.out.println("Informe a quantidade de notas:");
        qt_nt = new Scanner(System.in).nextInt();
        
        notas = new int[qt_nt];
        
        for(int i=0 ; i < qt_nt ; i++){
            
            System.out.println("Informe a " +(i+1)+ "ª nota");
            notas[i] = new Scanner(System.in).nextInt();
            if (notas[i] > 100){ 
            System.out.println(" Digite uma nota entre 0 a 100.");
            break;}
      }
        }
     
            
       public void MediaNotas(){  
                  
        for(int i=0 ; i <qt_nt ; i++){
            media = media + notas[i];
        }
        media = media / qt_nt;
        System.out.println ("A média é : " +media);
        
       
        }
       
}

