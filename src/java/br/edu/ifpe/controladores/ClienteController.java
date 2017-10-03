/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.controladores;

import br.edu.ifpe.infraestrutura.repositorios.comportamento.RepositorioGenerico;
import br.edu.ifpe.infraestrutura.repositorios.implementacao.RepositorioCliente;
import br.edu.ifpe.negocios.Cliente;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author 20141D12GR0505
 */
@ManagedBean
@SessionScoped
public class ClienteController {
    Cliente cliente = new Cliente();
    private RepositorioGenerico<Cliente,Integer> repositorioCliente = new RepositorioCliente();
    
    private Cliente selectedCliente;
    
    
    public String inserir(Cliente cliente){
        this.repositorioCliente.inserir(cliente);
        
        FacesContext.getCurrentInstance().addMessage(null,
                new FacesMessage("O Cliente "+cliente.getNome()+" foi cadastrado com sucesso!"));
        
        return "index.xhtml";
    }
    
    public String alterar(Cliente cliente){
        this.repositorioCliente.alterar(cliente);
        
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Cliente alterado com sucesso!"));
        
        return "apresentaCliente.xhtml";
    }
    
    public Cliente recuperarCliente(int id){
        return this.repositorioCliente.recuperar(id);
    }
    
    public void deletar(Cliente cliente){
        this.repositorioCliente.deletar(cliente);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Cliente deletado com sucesso!"));
 
    }
    
    public List<Cliente> recuperarTodosClientes(){
        return this.repositorioCliente.recuperarTodos();
    }

    public Cliente getSelectedCliente() {
        return selectedCliente;
    }

    public void setSelectedCliente(Cliente selectedCliente) {
        this.selectedCliente = selectedCliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
}