/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.negocio.builders;

/**
 *
 * @author esdra
 */
import br.edu.ifpe.negocio.Cliente;
import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

public class BuilderCliente {

    private int id;
    private String nome;
    private int CPFCNPJ;
    private String login;
    private String senha;
    private Date vencimento;

    public BuilderCliente() {
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

    public int getCPFCNPJ() {
        return CPFCNPJ;
    }

    public void setCPFCNPJ(int CPFCNPJ) {
        this.CPFCNPJ = CPFCNPJ;
    }

    public Date getVencimento() {
        return vencimento;
    }

    public void setVencimento(Date vencimento) {
        this.vencimento = vencimento;
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

    public Cliente builderCliente() {
        return new Cliente(id, nome, CPFCNPJ, login, senha, vencimento);
    }

}
