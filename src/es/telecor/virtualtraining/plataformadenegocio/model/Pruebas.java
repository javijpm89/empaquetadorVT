/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.telecor.virtualtraining.plataformadenegocio.model;

/**
 *
 * @author javi
 */
public class Pruebas {
    
    private String autor;
    private String error;
    private String como_probar;
    private String afecta;
    private String dependencias;
    
    public Pruebas(){}

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
     * @return the error
     */
    public String getError() {
        return error;
    }

    /**
     * @param error the error to set
     */
    public void setError(String error) {
        this.error = error;
    }

    /**
     * @return the como_probar
     */
    public String getComo_probar() {
        return como_probar;
    }

    /**
     * @param como_probar the como_probar to set
     */
    public void setComo_probar(String como_probar) {
        this.como_probar = como_probar;
    }

    /**
     * @return the afecta
     */
    public String getAfecta() {
        return afecta;
    }

    /**
     * @param afecta the afecta to set
     */
    public void setAfecta(String afecta) {
        this.afecta = afecta;
    }

    /**
     * @return the dependencias
     */
    public String getDependencias() {
        return dependencias;
    }

    /**
     * @param dependencias the dependencias to set
     */
    public void setDependencias(String dependencias) {
        this.dependencias = dependencias;
    }
    
}
