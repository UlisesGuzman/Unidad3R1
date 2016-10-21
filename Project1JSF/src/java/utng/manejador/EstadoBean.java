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
import utng.modelo.Estado;

/**
 *
 * @author Ulises
 */
@ManagedBean
@SessionScoped
public class EstadoBean implements Serializable{
    private List<Estado> estados;
    private Estado estado;
    public EstadoBean() { }

    public List<Estado> getEstados() {
        return estados;
    }

    public void setEstados(List<Estado> estados) {
        this.estados = estados;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }
    
    public String listar(){
        EstadoDAO dao = new EstadoDAO();
            try {
                estados=dao.getAll();
            } catch (Exception e) {
                e.printStackTrace();
            }
            return "estados";            
    }
    public String eliminar(){
        EstadoDAO dao=new EstadoDAO();
        try {
            dao.delete(estado);
            estados = dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Eliminar";
    }
    public String iniciar(){
        estado=new Estado();
        return "Iniciar";
    }
    public String guardar(){
        EstadoDAO dao = new EstadoDAO();
        try {
            if (estado.getIdEstado()!= 0) {
                dao.update(estado);
            }else{
                dao.insert(estado);
            }
            estados = dao.getAll();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "Guardar";
    }
    public String cancelar(){
        return "Cancelar";
    }
    public String editar(Estado estado){
        this.estado = estado;
        return "Editar";
    }
    
}
