/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.telecor.virtualtraining.plataformadenegocio.model;

import java.util.Date;

/**
 *
 * @author javi
 */
public class Paquete {
    
    private String version;
    private String dir_origen;
    private Date fechaCreacion;
    
    public Paquete(){}

    /**
     * @return the version
     */
    public String getVersion() {
        return version;
    }

    /**
     * @param version the version to set
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * @return the dir_origen
     */
    public String getDir_origen() {
        return dir_origen;
    }

    /**
     * @param dir_origen the dir_origen to set
     */
    public void setDir_origen(String dir_origen) {
        this.dir_origen = dir_origen;
    }

    /**
     * @return the fechaCreacion
     */
    public Date getFechaCreacion() {
        return fechaCreacion;
    }

    /**
     * @param fechaCreacion the fechaCreacion to set
     */
    public void setFechaCreacion(Date fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }
    
}
