/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.fachada;

import br.edu.ifpe.infraestrutura.repositorios.comportamento.RepositorioGenerico;
import br.edu.ifpe.infraestrutura.repositorios.implementacao.FabricaRepositorios;
import br.edu.ifpe.negocio.Cliente;
import br.edu.ifpe.negocio.Fatura;
import br.edu.ifpe.negocio.Funcionario;
import br.edu.ifpe.negocio.PlanoInternet;
import java.util.List;

/**
 *
 * @author 20141D12GR0505
 */
public class Fachada {
    
    private static Fachada myself = null;
    
    private RepositorioGenerico<Cliente,Integer> repositorioCliente = null;
    private RepositorioGenerico<Fatura,Integer> repositorioFatura = null;
    private RepositorioGenerico<Funcionario,Integer> repositorioFuncionario = null;
    private RepositorioGenerico<PlanoInternet,Integer> repositorioPlanoInternet = null;
    
    private Fachada(){
        this.repositorioCliente = FabricaRepositorios.manufactor(FabricaRepositorios.CLIENTE, 
                FabricaRepositorios.MEMORIA);
        
        this.repositorioFatura = FabricaRepositorios.manufactor(FabricaRepositorios.FATURA, 
                FabricaRepositorios.MEMORIA);
        
        this.repositorioFuncionario = FabricaRepositorios.manufactor(FabricaRepositorios.FUNCIONARIOS, 
                FabricaRepositorios.MEMORIA);
        
        this.repositorioPlanoInternet = FabricaRepositorios.manufactor(FabricaRepositorios.PLANOINTERNET, 
                FabricaRepositorios.MEMORIA);
        
    }
    
    public static Fachada getInstance(){
        if(myself == null)
            myself = new Fachada();
        
        return myself;
    }
    
    public void inserir(Cliente cliente){
        this.repositorioCliente.inserir(cliente);
    }
    
    public void alterar(Cliente cliente){
        this.repositorioCliente.alterar(cliente);
    }
    
    public Cliente recuperarCliente(int id){
        return this.repositorioCliente.recuperar(id);
    }
    
    public void deletar(Cliente cliente){
        this.repositorioCliente.deletar(cliente);
    }
    
    public List<Cliente> recuperarTodosClientes(){
        return this.repositorioCliente.recuperarTodos();
    }
    
    public void inserir(Fatura fatura){
        this.repositorioFatura.inserir(fatura);
    }
    
    public void alterar(Fatura fatura){
        this.repositorioFatura.alterar(fatura);
    }
    
    public Fatura recuperarFatura(int id){
        return this.repositorioFatura.recuperar(id);
    }
    
    public void deletar(Fatura fatura){
        this.repositorioFatura.deletar(fatura);
    }
    
    public List<Fatura> recuperarTodosFatura(){
        return this.repositorioFatura.recuperarTodos();
    }
    
}
