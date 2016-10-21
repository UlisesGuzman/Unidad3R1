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
 * @author ulises
 */
@Entity @Table(name="estado")
public class Estado implements Serializable{
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @Column(name="id_estado")
    private Long idEstado;
    @Column(name="nombre",length = 30)
    private String nombre;
    @Column(name="localizacion",length = 30)
    private String localizacion;
    @Column(name="extencion", length=20)
    private String extencion;

    public Estado(Long idEstado, String nombre, String localizacion, String extencion) {
        super();
        this.idEstado = idEstado;
        this.nombre = nombre;
        this.localizacion = localizacion;
        this.extencion = extencion;
    }

    public Estado() {
        this(0L,"","","");
    } 

    public Long getIdEstado() {
        return idEstado;
    }

    public String getNombre() {
        return nombre;
    }

    public String getLocalizacion() {
        return localizacion;
    }

    public String getExtencion() {
        return extencion;
    }

    public void setIdEstado(Long idEstado) {
        this.idEstado = idEstado;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setLocalizacion(String localizacion) {
        this.localizacion = localizacion;
    }

    public void setExtencion(String extencion) {
        this.extencion = extencion;
    }

   
    
    
}
