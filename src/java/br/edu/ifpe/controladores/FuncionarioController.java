/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.controladores;

import br.edu.ifpe.infraestrutura.repositorios.comportamento.RepositorioGenerico;
import br.edu.ifpe.infraestrutura.repositorios.implementacao.RepositorioFuncionarios;
import br.edu.ifpe.negocios.Funcionario;
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
public class FuncionarioController {
    Funcionario funcionario = new Funcionario();
    private RepositorioGenerico<Funcionario,Integer> repositorioFuncionarios = new RepositorioFuncionarios();
    
    private Funcionario selectedFuncionario;
    
    
    public String inserir(Funcionario funcionario){
        this.repositorioFuncionarios.inserir(funcionario);
        
        FacesContext.getCurrentInstance().addMessage(null,
                new FacesMessage("O funcionario foi concluida com sucesso!"));
        
        return "index.xhtml";
    }
    
    public String alterar(Funcionario funcionario){
        this.repositorioFuncionarios.alterar(funcionario);
        
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("funcionario alterada com sucesso!"));
        
        return "apresentaFuncionario.xhtml";
    }
    
    public Funcionario recuperarFuncionario(int id){
        return this.repositorioFuncionarios.recuperar(id);
    }
    
    public void deletar(Funcionario funcionario){
        this.repositorioFuncionarios.deletar(funcionario);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("Funcionario deletada com sucesso!"));
 
    }
    
    public List<Funcionario> recuperarTodosFuncionarios(){
        return this.repositorioFuncionarios.recuperarTodos();
    }

    public Funcionario getSelectedFuncionario() {
        return selectedFuncionario;
    }

    public void setSelectedFuncionario(Funcionario selectedFuncionario) {
        this.selectedFuncionario = selectedFuncionario;
    }

    public Funcionario getCliente() {
        return funcionario;
    }

    public void setCliente(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
}
