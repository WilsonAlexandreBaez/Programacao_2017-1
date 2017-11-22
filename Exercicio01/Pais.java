/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Exercicio01;

/**
 *
 * @author BAEZ
 */

import java.util.Objects;

public class Pais {

    private String nomePais;
    private String nomeCapital;
    private double territorio;
    private Pais[] fronteiras = new Pais[100];
    private int cont_Fronteiras = 0;

    public Pais(String nome, String capital, double territorio) {
        this.nomePais = nome;
        this.nomeCapital = capital;
        this.territorio = territorio;
    }

    public String getNome() {
        return nomePais;
    }

    public String getCapital() {
        return nomeCapital;
    }

    public double getDimensao() {
        return territorio;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Pais other = (Pais) obj;
        if (!Objects.equals(this.nomePais, other.nomePais)) {
            return false;
        }
        if (!Objects.equals(this.nomeCapital, other.nomeCapital)) {
            return false;
        }
        return true;
    }

    public void addfronteira(Pais pais) {
        if (this.getNome() != pais.getNome()) {
            fronteiras[cont_Fronteiras] = pais;
            cont_Fronteiras++;
        }
    }

    public boolean verificaFronteira(Pais pais) {

        for (int i = 0; i < cont_Fronteiras; i++) {
            if (this.fronteiras[i].getNome() == pais.getNome()) {
                return true;
            }
        }

        return false;
    }

    public Pais[] getFronteiras() {
        return fronteiras;
    }

    public void setFronteiras(Pais[] fronteiras) {
        this.fronteiras = fronteiras;
    }

    public Pais[] vizinhosComuns(Pais pais) {
        Pais[] retorno = new Pais[100];
        int contadorDeRetorno = 0;
        for (int i = 0; i < cont_Fronteiras; i++) {
            for (int j = 0; j < pais.cont_Fronteiras; j++) {
                if (this.fronteiras[i].getNome() == pais.fronteiras[j].getNome()) {
                    retorno[contadorDeRetorno] = this.fronteiras[i];
                }
            }
        }
        return retorno;
    }

}
