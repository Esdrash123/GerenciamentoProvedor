/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.infraestrutura.repositorios.implementacao;

import br.edu.ifpe.infraestrutura.repositorios.comportamento.RepositorioGenerico;
import br.edu.ifpe.negocio.Funcionario;
import dao.PersistenceDao;
import java.util.List;
import javax.persistence.Persistence;

/**
 *
 * @author 20141D12GR0505
 */
public class RepositorioFuncionariosBD implements RepositorioGenerico<Funcionario, Integer>{

    @Override
    public void inserir(Funcionario t) {
        PersistenceDao.getInstance().persist(t);
    }

    @Override
    public void alterar(Funcionario t) {
        PersistenceDao.getInstance().update(t);
    }

    @Override
    public Funcionario recuperar(Integer codigo) {
        try{
            return (Funcionario)PersistenceDao.getInstance().read("select a from Funcionario a where a.codigo="+codigo).get(0);
        }catch(IndexOutOfBoundsException index){
            return null;
        }
    }

    @Override
    public void deletar(Funcionario t) {
        PersistenceDao.getInstance().delete(t);
    }

    @Override
    public List<Funcionario> recuperarTodos() {
        return PersistenceDao.getInstance().read("select a from Funcionario f");
    }
    
}
