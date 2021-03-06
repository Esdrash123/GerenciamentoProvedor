/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.infraestrutura.repositorios.implementacao;

import br.edu.ifpe.infraestrutura.repositorios.comportamento.RepositorioGenerico;
import br.edu.ifpe.negocio.Fatura;
import dao.PersistenceDao;
import java.util.List;

/**
 *
 * @author 20141D12GR0505
 */
public class RepositorioFaturaBD implements RepositorioGenerico<Fatura, Integer>{

    @Override
    public void inserir(Fatura t) {
        PersistenceDao.getInstance().persist(t);
    }

    @Override
    public void alterar(Fatura t) {
        PersistenceDao.getInstance().update(t);
    }

    @Override
    public Fatura recuperar(Integer codigo) {
        try{
            return (Fatura)PersistenceDao.getInstance().read("select a from Fatura a where a.codigo="+codigo).get(0);
        }catch(IndexOutOfBoundsException index){
            return null;
        }
    }

    @Override
    public void deletar(Fatura t) {
        PersistenceDao.getInstance().delete(t);
    }

    @Override
    public List<Fatura> recuperarTodos() {
        return PersistenceDao.getInstance().read("select a from Fatura f");
    }
    
}
