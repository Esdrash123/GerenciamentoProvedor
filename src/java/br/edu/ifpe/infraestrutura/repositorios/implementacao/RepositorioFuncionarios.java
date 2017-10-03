/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.infraestrutura.repositorios.implementacao;

import br.edu.ifpe.infraestrutura.repositorios.comportamento.RepositorioGenerico;
import br.edu.ifpe.negocio.Funcionario;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 20141D12GR0505
 */
public class RepositorioFuncionarios implements RepositorioGenerico<Funcionario, Integer>{

    private List <Funcionario>Funcionario=null;
    
    public RepositorioFuncionarios(){
        this.Funcionario = new ArrayList<>();
    }
    
    @Override
    public void inserir(Funcionario t) {
        this.Funcionario.add(t);
    }

    @Override
    public void alterar(Funcionario t) {
        for (Funcionario f : this.Funcionario) {
            if (f.getId() == t.getId()) {
                f.setLogin(t.getLogin());
                f.setNome(t.getNome());
                f.setSenha(t.getSenha());
            }
        }
    }

    @Override
    public Funcionario recuperar(Integer codigo) {
        for (Funcionario f : this.Funcionario) {
            if (f.getId() == (codigo)) {
                return f;
            }
        }
        return null;
    }

    @Override
    public void deletar(Funcionario t) {
        this.Funcionario.remove(t);
    }

    @Override
    public List<Funcionario> recuperarTodos() {
        return this.Funcionario;
    }

}
