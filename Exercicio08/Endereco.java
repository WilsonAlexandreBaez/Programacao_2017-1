/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio08;


/**
 *
 * @author BAEZ
 */
public class Endereco {
    
    private String rua;
    private String cep;

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public String getCep() {
                String bloco1 = cep.substring(0,5);
		String bloco2 = cep.substring(5,8);
		cep = bloco1+"-"+bloco2;
		
        return cep;
    }

    public void setCep(String cep) {

        this.cep = cep;
    }
    
    public void validar(){
                 
      System.out.println("Seu CEP em formato Inteiro é:: "+getCep());
      
            
        
    }
    
}
