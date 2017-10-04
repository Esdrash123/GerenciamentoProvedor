/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.infraestrutura.repositorios.implementacao;

import br.edu.ifpe.infraestrutura.repositorios.comportamento.RepositorioGenerico;
import br.edu.ifpe.negocio.PlanoInternet;
import dao.PersistenceDao;
import java.util.List;

/**
 *
 * @author 20141D12GR0505
 */
public class RepositorioPlanoInternetBD implements RepositorioGenerico<PlanoInternet, Integer>{

    @Override
    public void inserir(PlanoInternet t) {
        PersistenceDao.getInstance().persist(t);
    }

    @Override
    public void alterar(PlanoInternet t) {
        PersistenceDao.getInstance().update(t);
    }

    @Override
    public PlanoInternet recuperar(Integer codigo) {
        try{
            return (PlanoInternet)PersistenceDao.getInstance().read("select a from PlanoInternet a where a.codigo="+codigo).get(0);
        }catch(IndexOutOfBoundsException index){
            return null;
        }
    }

    @Override
    public void deletar(PlanoInternet t) {
        PersistenceDao.getInstance().delete(t);
    }

    @Override
    public List<PlanoInternet> recuperarTodos() {
        return PersistenceDao.getInstance().read("select a from PlanoInternet p");
    }
    
}
