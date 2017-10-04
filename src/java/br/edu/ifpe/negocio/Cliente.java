/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.negocio;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Id;

/**
 *
 * @author esdra
 */
public class Cliente {

    @Id
    private int id;
    @Column (length = 40, nullable = false)
    private String nome;
    @Column (length = 16, nullable = false)
    private int CPFCNPJ;
    @Column (length = 25, nullable = false)
    private String login;
    @Column (length = 20, nullable = false)
    private String senha;
    @Column (length = 12, nullable = false)
    private Date vencimento;

    public Cliente(String nome, int CPFCNPJ, String login, String senha, Date vencimento, int id) {
        this.id = id;
        this.nome = nome;
        this.CPFCNPJ = CPFCNPJ;
        this.login = login;
        this.senha = senha;
        this.vencimento = vencimento;
    }

    public Cliente() {

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
