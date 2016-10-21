/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.datos;

import org.hibernate.HibernateException;
import utng.modelo.Presidente;

/**
 *
 * @author Ulises
 */
public class PresidenteDAO extends DAO<Presidente>{
   
    public PresidenteDAO(){
        super(new Presidente());
    }
    public Presidente getOneById(Presidente presidente) 
            throws HibernateException{
        return super.getOneById(presidente.getIdDPresidente());        
    }
    
}
