/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio06;

/**
 *
 * @author BAEZ
 */
abstract class Gerente extends Funcionario{
    
    private Funcionario[] funcionario;
    private Double bonus;

    public Funcionario[] getFuncionario() {
        return funcionario;
    }

    public void setFuncionario(Funcionario[] funcionario) {
        this.funcionario = funcionario;
    }

    public Double getBonus() {
        return bonus;
    }

    public void setBonus(Double bonus) {
        this.bonus = bonus;
    }
    
    
}