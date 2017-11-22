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
abstract class Funcionario extends Pessoa{
   
    private int codEmpregado;
    private double salario;

    public int getcodEmpregado() {
        return codEmpregado;
    }

    public void setcodEmpregado(int codEmpregado) {
        this.codEmpregado = codEmpregado;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    
    
}