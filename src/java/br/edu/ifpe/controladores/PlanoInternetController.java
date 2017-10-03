/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.ifpe.controladores;

import br.edu.ifpe.infraestrutura.repositorios.comportamento.RepositorioGenerico;
import br.edu.ifpe.infraestrutura.repositorios.implementacao.RepositorioPlanoInternet;
import br.edu.ifpe.negocio.PlanoInternet;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;

/**
 *
 * @author 20141D12GR0505
 */
@ManagedBean
@SessionScoped
public class PlanoInternetController {
    PlanoInternet planoInternet = new PlanoInternet();
    private RepositorioGenerico<PlanoInternet,Integer> repositorioPlanoInternet = new RepositorioPlanoInternet();
    
    private PlanoInternet selectedPlanoInternet;
    
    
    public String inserir(PlanoInternet planoInternet){
        this.repositorioPlanoInternet.inserir(planoInternet);
        
        FacesContext.getCurrentInstance().addMessage(null,
                new FacesMessage("O planoInternet foi concluida com sucesso!"));
        
        return "index.xhtml";
    }
    
    public String alterar(PlanoInternet planoInternet){
        this.repositorioPlanoInternet.alterar(planoInternet);
        
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("planoInternet alterada com sucesso!"));
        
        return "apresentaPlanoInternet.xhtml";
    }
    
    public PlanoInternet recuperarPlanoInternet(int id){
        return this.repositorioPlanoInternet.recuperar(id);
    }
    
    public void deletar(PlanoInternet planoInternet){
        this.repositorioPlanoInternet.deletar(planoInternet);
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage("PlanoInternet deletada com sucesso!"));
 
    }
    
    public List<PlanoInternet> recuperarTodosPlanoInternet(){
        return this.repositorioPlanoInternet.recuperarTodos();
    }

    public PlanoInternet getSelectedPlanoInternet() {
        return selectedPlanoInternet;
    }

    public void setSelectedPlanoInternet(PlanoInternet selectedPlanoInternet) {
        this.selectedPlanoInternet = selectedPlanoInternet;
    }

    public PlanoInternet getPlanoInternet() {
        return planoInternet;
    }

    public void setPlanoInternet(PlanoInternet planoInternet) {
        this.planoInternet = planoInternet;
    }
}
