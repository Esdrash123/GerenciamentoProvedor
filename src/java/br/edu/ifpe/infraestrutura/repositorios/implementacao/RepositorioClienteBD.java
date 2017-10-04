/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.infraestrutura.repositorios.implementacao;

import br.edu.ifpe.infraestrutura.repositorios.comportamento.RepositorioGenerico;
import br.edu.ifpe.negocio.Cliente;
import dao.PersistenceDao;
import java.util.List;

/**
 *
 * @author 20141D12GR0505
 */
public class RepositorioClienteBD implements RepositorioGenerico<Cliente, Integer>{

    @Override
    public void inserir(Cliente t) {
        PersistenceDao.getInstance().persist(t);
    }

    @Override
    public void alterar(Cliente t) {
        PersistenceDao.getInstance().update(t);
    }

    @Override
    public Cliente recuperar(Integer codigo) {
        try{
            return (Cliente)PersistenceDao.getInstance().read("select a from Cliente a where a.codigo="+codigo).get(0);
        }catch(IndexOutOfBoundsException index){
            return null;
        }
    }

    @Override
    public void deletar(Cliente t) {
        PersistenceDao.getInstance().delete(t);
    }

    @Override
    public List<Cliente> recuperarTodos() {
        return PersistenceDao.getInstance().read("select a from Cliente c");
    }
    
}
