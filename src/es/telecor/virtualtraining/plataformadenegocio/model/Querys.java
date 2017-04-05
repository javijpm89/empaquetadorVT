/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.telecor.virtualtraining.plataformadenegocio.model;

import java.util.ArrayList;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author javi
 */
@XmlRootElement
public class Querys {
    
    private String autor;
    private String descripcion;
    private ArrayList<String> sql;    
    
    public Querys(){}

    /**
     * @return the autor
     */
    public String getAutor() {
        return autor;
    }

    /**
     * @param autor the autor to set
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * @return the descripcion
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * @param descripcion the descripcion to set
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    /**
     * @return the sql
     */
    public ArrayList<String> getSql() {
        return sql;
    }

    /**
     * @param sql the sql to set
     */
    public void setSql(ArrayList<String> sql) {
        this.sql = sql;
    }
    
}
