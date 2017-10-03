/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.infraestrutura.repositorios.implementacao;

import br.edu.ifpe.infraestrutura.repositorios.comportamento.RepositorioGenerico;
import br.edu.ifpe.negocios.PlanoInternet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 20141D12GR0505
 */
public class RepositorioPlanoInternet implements RepositorioGenerico<PlanoInternet, Integer>{

    private List <PlanoInternet>PlanoInternet=null;
    
    public RepositorioPlanoInternet(){
        this.PlanoInternet = new ArrayList<>();
    }
    
    @Override
    public void inserir(PlanoInternet t) {
        this.PlanoInternet.add(t);
    }

    @Override
    public void alterar(PlanoInternet t) {
        for (PlanoInternet p : this.PlanoInternet) {
            if (p.getId()== p.getId()) {
                p.setNome(t.getNome());
                p.setDescrição(t.getDescrição());
                p.setValor(t.getValor());
            }
        }
    }

    @Override
    public PlanoInternet recuperar(Integer codigo) {
        for (PlanoInternet p : this.PlanoInternet) {
            if (p.getId() == (codigo)) {
                return p;
            }
        }
        return null;
    }

    @Override
    public void deletar(PlanoInternet t) {
        this.PlanoInternet.remove(t);
    }

    @Override
    public List<PlanoInternet> recuperarTodos() {
        return this.PlanoInternet;
    }

}
