/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.controladores;

import br.edu.ifpe.infraestrutura.repositorios.comportamento.RepositorioGenerico;
import br.edu.ifpe.infraestrutura.repositorios.implementacao.RepositorioFatura;
import br.edu.ifpe.negocios.Fatura;
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
public class FaturaController {
    Fatura fatura = new Fatura();
    private RepositorioGenerico<Fatura,Integer> repositorioFatura = new RepositorioFatura();
    
    private Fatura selectedCliente;
    
    
    public String inserir(Fatura fatura){
        this.repositorioFatura.inserir(fatura);
        
        FacesContext.getCurrentInstance().addMessage(null,
                new FacesMessage("O fatura foi concluida com sucesso!"));
        
        return "index.xhtml";
    }
    
    public String alterar(Fatura cliente){
        this.repositorioFatura.alterar(cliente);
        
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Fatura alterada com sucesso!"));
        
        return "apresentaFatura.xhtml";
    }
    
    public Fatura recuperarCliente(int id){
        return this.repositorioFatura.recuperar(id);
    }
    
    public void deletar(Fatura cliente){
        this.repositorioFatura.deletar(cliente);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Fatura deletada com sucesso!"));
 
    }
    
    public List<Fatura> recuperarTodosClientes(){
        return this.repositorioFatura.recuperarTodos();
    }

    public Fatura getSelectedCliente() {
        return selectedCliente;
    }

    public void setSelectedCliente(Fatura selectedCliente) {
        this.selectedCliente = selectedCliente;
    }

    public Fatura getCliente() {
        return fatura;
    }

    public void setCliente(Fatura cliente) {
        this.fatura = cliente;
    }
}
