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
public class TesteAlunos {
   
	public static void main(String[] args) {
		Pessoa Alunogr = new Aluno() {};
		Alunogr.setNome("Baez");
		Alunogr.setEndereco("Maria Stuart, 27");
                Alunogr.imprimeNome();
                Alunogr.imprimeEndereco();
                          
                
                Aluno alunoPos = new AlunoPos();
                alunoPos.setNome("Suelen");
                alunoPos.setEndereco("Helio Ioshiaky, 34");
                alunoPos.imprimeNome();
                alunoPos.imprimeEndereco();
                
                
	}
    
        
                
}