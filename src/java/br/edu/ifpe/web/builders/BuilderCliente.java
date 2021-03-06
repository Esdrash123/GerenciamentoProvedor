/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.web.builders;

/**
 *
 * @author esdra
 */
import br.edu.ifpe.negocio.Cliente;
import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "bCliente")
@RequestScoped

public class BuilderCliente {

    private int id;
    private String nome;
    private int CPFCNPJ;
    private String login;
    private String senha;
    private Date vencimento;

    public BuilderCliente(int id, String nome, int CPFCNPJ, String login, String senha, Date vencimento) {
        this.id = id;
        this.nome = nome;
        this.CPFCNPJ = CPFCNPJ;
        this.login = login;
        this.senha = senha;
        this.vencimento = vencimento;
    }

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

    public Cliente builderCliente(){
        return new Cliente(nome, CPFCNPJ, login, senha, vencimento, id);
    }
    
}
