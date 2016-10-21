/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utng.modelo;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Ulises
 */
@Entity @Table(name ="prsidente")
public class Presidente implements Serializable{
        @Id @GeneratedValue(strategy = GenerationType.IDENTITY) @Column(name ="id_presidente")
        private Long idDPresidente;
        @Column (name = "nombre_presidente", length = 20)
        private String nombrePresidente;
        @Column (name= "apellido_presidente", length = 40) 
        private String apellidoPresidente;
        @Column (name= "edad", length = 5) 
        private int edad;
        @ManyToOne()
        @JoinColumn(name = "id_pais")
        private Pais pais;
        public Presidente (Long idDPresidente,String nombrePresidente, String apellidoPresidente,int edad, Pais pais){
                super();
                this.idDPresidente= idDPresidente;
                this.nombrePresidente = nombrePresidente;
                this.apellidoPresidente = apellidoPresidente;
                this.edad = edad;
                this.pais = pais;
        }

    
    public Presidente() {
     this.idDPresidente=0L;
     
    }

    public Long getIdDPresidente() {
        return idDPresidente;
    }

    public String getNombrePresidente() {
        return nombrePresidente;
    }

    public String getApellidoPresidente() {
        return apellidoPresidente;
    }

    public int getEdad() {
        return edad;
    }

    public Pais getPais() {
        return pais;
    }

    public void setIdDPresidente(Long idDPresidente) {
        this.idDPresidente = idDPresidente;
    }

    public void setNombrePresidente(String nombrePresidente) {
        this.nombrePresidente = nombrePresidente;
    }

    public void setApellidoPresidente(String apellidoPresidente) {
        this.apellidoPresidente = apellidoPresidente;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

 
    
}

