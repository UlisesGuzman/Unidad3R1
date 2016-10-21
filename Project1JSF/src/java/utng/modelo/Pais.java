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
import javax.persistence.Table;

/**
 *
 * @author Ulises
 */
@Entity @Table(name="pais")
public class Pais implements Serializable{
        @Id
        @GeneratedValue(
                        strategy = GenerationType.IDENTITY)
        @Column(name="id_pais")
        private Long idPais;
        @Column(length = 30)
        private String nombre;
        @Column(length = 30)
        private String nacionalidad;
        @Column(length = 30)
        private String idioma;
        
        
        public Pais() {
                this.idPais = 0L;
        }

    public Long getIdPais() {
        return idPais;
    }

    public String getNombre() {
        return nombre;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public String getIdioma() {
        return idioma;
    }

    public void setIdPais(Long idPais) {
        this.idPais = idPais;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

   

    
        
}

