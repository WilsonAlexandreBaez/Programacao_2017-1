
package Exercicio15;

/**
 *
 * @author BAEZ
 */
public class TesteProfessores {
 
    public static void main(String[] args) {
        
        Professor profEspecialista = new ProfessorEspecialista(){}; 
           profEspecialista.setNome("Baez");
           profEspecialista.imprimirNome();
           
       ProfessorEspecialista prof = new ProfessorEspecialista() {};
           prof.setCursoEspecializacao("Engenharia de Software");
           prof.imprimeMateria();
           
       ProfessorMestre profMestre = new ProfessorMestre(){};
            profMestre.setNome("Wilson");
            profMestre.setCursoMestrado("Gerencia de Redes");
            profMestre.imprimirNome();
           
}  
}   

