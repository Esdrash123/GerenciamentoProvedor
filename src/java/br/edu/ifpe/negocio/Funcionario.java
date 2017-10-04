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
public class Funcionario {

    @Id
    private int id;
    @Column (length = 40, nullable = false)
    private String nome;
    @Column (length = 20, nullable = false)
    private String login;
    @Column (length = 20, nullable = false)
    private String senha;

    public Funcionario(String nome, String login, String senha, int id) {
        this.id = id;
        this.nome = nome;
        this.login = login;
        this.senha = senha;
    }

    public Funcionario() {
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

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

}
