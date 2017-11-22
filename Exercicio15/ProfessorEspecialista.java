
package Exercicio15;

/**
 *
 * @author BAEZ
 */
 class ProfessorEspecialista extends Professor{
      
   private String CursoEspecializacao; 

    public String getCursoEspecializacao() {
        return CursoEspecializacao;
    }

    public void setCursoEspecializacao(String CursoEspecializacao) {
        this.CursoEspecializacao = CursoEspecializacao;
    }
   
   @Override
	public void imprimirNome() {
		
                
		System.out.println("Nome: "+this.getNome());
			}
        
        public void imprimeMateria(){
            System.out.println("A Matéria que lecionada: "+getCursoEspecializacao());
            
        }
   }
