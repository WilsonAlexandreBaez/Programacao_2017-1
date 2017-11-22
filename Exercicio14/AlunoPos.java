/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio14;

/**
 *
 * @author BAEZ
 */

 public class AlunoPos extends Aluno{

     @Override
    public void imprimeNome() {
     
       System.out.println("Nome: "+this.getNome());
        
    }

    @Override
    public void imprimeEndereco() {
        System.out.println("Endereço: "+this.getEndereco());
    }
    
}   

