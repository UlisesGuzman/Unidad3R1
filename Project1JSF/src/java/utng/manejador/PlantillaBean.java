/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.manejador;

/**
 *
 * @author Daniel Iván Hernández Portillo danny10hp12@gmail.com
 */
import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;

import utng.modelo.Usuario;

@ManagedBean
@ViewScoped
public class PlantillaBean implements Serializable{
    
        public void checkLogin(){
            try {
                    FacesContext context =
                            FacesContext.getCurrentInstance();
                    Usuario usuario =
                                    (Usuario)context.getExternalContext()
                            .getSessionMap().get("usuario");
                    if(usuario == null){
                            context.getExternalContext()
                                    .redirect("login.xhtml");
                    }
                
            } catch (Exception e) {
            }
        }
    
}
