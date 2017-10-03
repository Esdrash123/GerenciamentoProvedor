/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.infraestrutura.repositorios.implementacao;

import br.edu.ifpe.infraestrutura.repositorios.comportamento.RepositorioGenerico;



/**
 *
 * @author 1860915
 */
public class FabricaRepositorios {
    
    public static final int CLIENTE = 1;
    public static final int FATURA = 2;
    public static final int FUNCIONARIOS = 3;
    public static final int PLANOINTERNET = 4;
    
    public static final int MEMORIA = 1;
    public static final int BANCODADOS = 2;
    public static final int ARQUIVO =3;
    
    public static RepositorioGenerico manufactor(int tipoNegocio, int tipoPersistencia){
        
        if(tipoPersistencia==MEMORIA){
            if(tipoNegocio==CLIENTE){
                return new RepositorioCliente();
            }
            
           if(tipoNegocio == FATURA){
               return new RepositorioFatura();
           }
           
             if(tipoNegocio == FUNCIONARIOS){
               return new RepositorioFuncionarios();
           
        }
               if(tipoNegocio == PLANOINTERNET){
               return new RepositorioPlanoInternet();
    
            }

        }
         return null;
    }
}