/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.manejador;

import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import utng.datos.PaisDAO;
import utng.datos.PresidenteDAO;
import utng.modelo.Pais;
import utng.modelo.Presidente;
/**
 *
 * @author Ulises
 */
@ManagedBean (name = "presidenteBean") @SessionScoped
public class PresidenteBean implements Serializable{

    private List<Presidente>presidentes;
    private Presidente presidente;
    private List<Pais> presente;
    private List<Pais> paises;
    public PresidenteBean(){
        presidente = new Presidente();
        presidente.setPais(new Pais());
    }

    public List<Pais> getPresidente() {
        return presente;
    }

    public void setPresidente(List<Pais> presidentes) {
        this.presente = presente;
    }

    public Presidente getPresidentes() {
        return presidente;
    }

    public void setPresidente(Presidente presidente) {
        this.presidente = presidente;
    }

    public List<Presidente> getPresident() {
        return presidentes;
    }

    public void setPresident(List<Presidente> presidentes) {
        this.presidentes = presidentes;
    }
    public String listar(){
        PresidenteDAO dao = new PresidenteDAO();
        try{
            presidentes = dao.getAll();
        }catch(Exception e){
            e.printStackTrace();
        }
        return "Presidentes";
    }
    public String eliminar(){
         PresidenteDAO dao = new PresidenteDAO();
        try{
            dao.delete(presidente);
            presidentes = dao.getAll();
        }catch(Exception e){
            e.printStackTrace();
        }
        return "Eliminar";
    }
    public String iniciar(){
        presidente = new Presidente();
        presidente.setPais(new Pais());
        try{
            paises = new PaisDAO().getAll();
        }catch(Exception e){
            e.printStackTrace(); 
        } 
        return "Iniciar";
    }
    public String guardar(){
        PresidenteDAO dao = new PresidenteDAO();
        try{
            if(presidente.getIdDPresidente()!=0){
                dao.update(presidente);
            }else{
                dao.insert(presidente);
            }
            presidentes = dao.getAll();
        }catch(Exception e){
            e.printStackTrace();
        }
        return "Guardar";
    }
    public String cancelar(){
        return "Cancelar";
    }
    public String editar(Presidente presidente){
        this.presidente = presidente;
        try{
            paises = new PaisDAO().getAll();
        }catch(Exception e){
            e.printStackTrace();
        }
        return "Editar";
    }
    
}