/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.modelo;

import java.io.Serializable;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**g
 *
 * @author Ulises 
 */
@Entity @Table(name="region")
public class Region implements Serializable{
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY) 
    @Column(name="id_region")
    private Long idRegion;
    @Column(name = "nombre", length = 20)
    private String nombre;
    @Column(name = "clima", length = 20)
    private String clima;
    @Column(name = "municipio", length = 20)
    private String municipio;
    @ManyToOne(cascade = CascadeType.REMOVE)
    @JoinColumn(name="id_estado")
    private Estado estado;

    public Region(Long idRegion, String nombre, String clima, String municipio, Estado estado) {
        super();
        this.idRegion = idRegion;
        this.nombre = nombre;
        this.clima = clima;
        this.municipio = municipio;
        this.estado = estado;
    }

 public Region() {
                this.idRegion= 0L;
        }
  
    public Long getIdRegion() {
        return idRegion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getClima() {
        return clima;
    }

    public String getMunicipio() {
        return municipio;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setIdRegion(Long idRegion) {
        this.idRegion = idRegion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setClima(String clima) {
        this.clima = clima;
    }

    public void setMunicipio(String municipio) {
        this.municipio = municipio;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }

    
    
    

}
