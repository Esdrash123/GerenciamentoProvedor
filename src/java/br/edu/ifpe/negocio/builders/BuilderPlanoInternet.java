/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.negocio.builders;

import br.edu.ifpe.negocio.PlanoInternet;

/**
 *
 * @author esdra
 */
public class BuilderPlanoInternet {

    private int id;
    private String nome;
    private String descrição;
    private double valor;

    public BuilderPlanoInternet(int id, String nome, String descrição, double valor) {
        this.id = id;
        this.nome = nome;
        this.descrição = descrição;
        this.valor = valor;
    }

    public BuilderPlanoInternet() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescrição() {
        return descrição;
    }

    public void setDescrição(String descrição) {
        this.descrição = descrição;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public PlanoInternet builderPlanoInternet(){
        return new PlanoInternet(nome, descrição, valor, id);
    }
            
    
}
