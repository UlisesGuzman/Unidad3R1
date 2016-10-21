/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.datos;


import org.hibernate.HibernateException;
import utng.modelo.Estado;

/**
 *
 * @author Ulises
 */
public class EstadoDAO extends DAO<Estado>{
    
    public EstadoDAO() {
        super(new Estado());
    }
    
    protected Estado getOneById(Estado estado) 
            throws HibernateException {
        return super.getOneById(estado.getIdEstado());
    }
    
    
    
}
