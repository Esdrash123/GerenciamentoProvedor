/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.web.builders;

import br.edu.ifpe.negocio.Funcionario;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "bFuncionario")
@RequestScoped

/**
 *
 * @author esdra
 */
public class BuilderFuncionario {

    private int id;
    private String nome;
    private String login;
    private String senha;

    public BuilderFuncionario(String nome, String login, String senha, int id) {
        this.id = id;
        this.nome = nome;
        this.login = login;
        this.senha = senha;
    }

    public BuilderFuncionario() {
       
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

    public Funcionario builderFuncionario(){
    return new Funcionario(nome, login, senha, id);
}
}
