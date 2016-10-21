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
import utng.datos.EstadoDAO;
import utng.datos.RegionDAO;
import utng.modelo.Estado;
import utng.modelo.Region;

/**
 *
 * @author Ulises
 */
@ManagedBean(name = "regionBean") 
@SessionScoped
public class RegionBean implements Serializable{
    private List<Region> regiones;
    private Region region;
    private List<Estado> estados;

    public RegionBean() {
        region = new Region();
         region.setEstado(new Estado());
    }

    public List<Region> getRegiones() {
        return regiones;
    }

    public void setregiones(List<Region> regions) {
        this.regiones = regions;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

    public List<Estado> getEstados() {
        return estados;
    }

    public void setEstados(List<Estado> estados) {
        this.regiones = regiones;
    }
    
    
    
     public String listar(){
        RegionDAO dao = new RegionDAO();
            try {
                regiones=dao.getAll();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return "Regiones";            
    }
    public String eliminar(){
        RegionDAO dao=new RegionDAO();
        try {
            dao.delete(region);
            regiones = dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Eliminar";
    }
    public String iniciar(){
        region =new Region();
        region.setEstado(new Estado());
        try {
            estados = new EstadoDAO().getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Iniciar";
    }
    public String guardar(){
        RegionDAO dao = new RegionDAO();
        try {
            if (region.getIdRegion()!= 0) {
                dao.update(region);
            }else{
                dao.insert(region);
            }
            regiones = dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Guardar";
    }
    public String cancelar(){
        return "Cancelar";
    }
    public String editar(Region region){
        this.region = region;
        try{
            estados = new EstadoDAO().getAll();
        }catch (Exception e){
            e.printStackTrace();
        }
        return "Editar";
    }
}
