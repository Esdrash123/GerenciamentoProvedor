/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.infraestrutura.repositorios.implementacao;

import br.edu.ifpe.infraestrutura.repositorios.comportamento.RepositorioGenerico;
import br.edu.ifpe.negocio.Cliente;
import br.edu.ifpe.negocio.Fatura;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author 20141D12GR0505
 */
public class RepositorioFatura implements RepositorioGenerico<Fatura, Integer>{

    private List <Fatura>Fatura=null;
    
    public RepositorioFatura(){
        this.Fatura = new ArrayList<>();
    }
    
    @Override
    public void inserir(Fatura t) {
        this.Fatura.add(t);
    }

    @Override
   public void alterar(Fatura t) {
        for (Fatura f : this.Fatura) {
            if (f.getCPFDoCliente()== t.getCPFDoCliente()) {
                f.setNomeDoCliente(t.getNomeDoCliente());
                f.setNomeDoPlano(t.getNomeDoPlano());
                f.setValor(t.getValor());
                f.setVencimento(t.getVencimento());
                f.setDataPagamento(t.getDataPagamento());
                f.setStatus(t.getStatus());
                f.setValorMulta(f.getValorMulta());
            }
        }
    }

    @Override
    public Fatura recuperar(Integer codigo) {
        for (Fatura f : this.Fatura) {
            if (f.getCPFDoCliente()== (codigo)) {
                return f;
            }
        }
        return null;
    }

    @Override
    public void deletar(Fatura t) {
        this.Fatura.remove(t);
    }

    @Override
    public List<Fatura> recuperarTodos() {
        return this.Fatura;
    }
    
}