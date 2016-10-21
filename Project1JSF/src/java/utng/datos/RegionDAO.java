/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.datos;


import org.hibernate.HibernateException;
import utng.modelo.Region;

/**
 *
 * @author Ricardo
 */
public class RegionDAO extends DAO<Region>{
    
    public RegionDAO() {
        super(new Region());
    }
    
    protected Region getOneById(Region region)
            throws HibernateException {
        return super.getOneById(region.getIdRegion());
    }
    
    
}
