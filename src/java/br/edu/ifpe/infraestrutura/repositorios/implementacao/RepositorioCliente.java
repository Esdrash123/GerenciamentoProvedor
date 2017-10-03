/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.infraestrutura.repositorios.implementacao;
import br.edu.ifpe.infraestrutura.repositorios.comportamento.RepositorioGenerico;
import br.edu.ifpe.negocio.Cliente;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author esdra
 */
public class RepositorioCliente implements RepositorioGenerico<Cliente, Integer>{

    private List <Cliente>Cliente=null;
    
    public RepositorioCliente(){
        this.Cliente = new ArrayList<>();
    }
    
    @Override
    public void inserir(Cliente t) {
        this.Cliente.add(t);
    }

    @Override
    public void alterar(Cliente t) {
        for (Cliente c : this.Cliente) {
            if (c.getId() == t.getId()) {
                c.setNome(t.getNome());
                c.setCPFCNPJ(t.getCPFCNPJ());
                c.setLogin(t.getLogin());
                c.setSenha(t.getSenha());
                c.setVencimento(t.getVencimento());
            }
        }
    }

    @Override
    public Cliente recuperar(Integer codigo) {
        for (Cliente c : this.Cliente) {
            if (c.getId() == (codigo)) {
                return c;
            }
        }
        return null;
    }

    @Override
    public void deletar(Cliente t) {
        this.Cliente.remove(t);
    }

    @Override
    public List<Cliente> recuperarTodos() {
        return this.Cliente;
    }

}
