
package Exercicio15;

/**
 *
 * @author BAEZ
 */
public class ProfessorMestre extends Professor{
    
    private String cursoMestrado;

    public String getCursoMestrado() {
        return cursoMestrado;
    }

    public void setCursoMestrado(String cursoMestrado) {
        this.cursoMestrado = cursoMestrado;
    }

    @Override
    public void imprimirNome() {
        System.out.println("Nome : "+this.getNome());
        System.out.println("Curso: "+this.getCursoMestrado());
    }
    
   
}