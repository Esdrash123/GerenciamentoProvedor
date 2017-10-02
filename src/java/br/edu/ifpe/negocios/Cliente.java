/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.negocios;

import java.util.Date;

/**
 *
 * @author esdra
 */
public class Cliente {

    String nome;
    int CPFCNPJ;
    String login;
    String senha;
    Date vencimento;

    public Cliente(String nome, int CPFCNPJ, String login, String senha, Date vencimento) {
        this.nome = nome;
        this.CPFCNPJ = CPFCNPJ;
        this.login = login;
        this.senha = senha;
        this.vencimento = vencimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCPFCNPJ() {
        return CPFCNPJ;
    }

    public void setCPFCNPJ(int CPFCNPJ) {
        this.CPFCNPJ = CPFCNPJ;
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

    public Date getVencimento() {
        return vencimento;
    }

    public void setVencimento(Date vencimento) {
        this.vencimento = vencimento;
    }

}
