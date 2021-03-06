/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.negocio;

import javax.persistence.Column;
import javax.persistence.Id;

/**
 *
 * @author esdra
 */
public class PlanoInternet {

    @Id
    private int id;
    @Column (length = 40, nullable = false)
    private String nome;
    @Column (length = 40, nullable = false)
    private String descrição;
    @Column (length = 15, nullable = false)
    private double valor;

    public PlanoInternet(String nome, String descrição, double valor, int id) {
        this.id = id;
        this.nome = nome;
        this.descrição = descrição;
        this.valor = valor;
    }

    public PlanoInternet() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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

}
