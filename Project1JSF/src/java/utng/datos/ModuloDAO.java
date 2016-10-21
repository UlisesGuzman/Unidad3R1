/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.datos;

/**
 *
 * @author Daniel Iván Hernández Portillo danny10hp12@gmail.com
 */
import org.hibernate.HibernateException;
import utng.modelo.Modulo;

public class ModuloDAO extends DAO<Modulo>{
    
    public ModuloDAO() {
            super(new Modulo());
    }
    
    public Modulo getOneById(Modulo modulo)
                    throws HibernateException{
            return super.getOneById(
                            modelo.getIdModulo());
    }
    
}
