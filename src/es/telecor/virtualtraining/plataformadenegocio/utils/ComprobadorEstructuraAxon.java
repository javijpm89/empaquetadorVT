/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.telecor.virtualtraining.plataformadenegocio.utils;

import java.io.File;

/**
 *
 * @author javi
 */
public class ComprobadorEstructuraAxon {

    private final String dirComprobacion;
    private final String proyecto;

    public ComprobadorEstructuraAxon(String _dirComprobacion, String _proyecto) {
        dirComprobacion = _dirComprobacion;
        proyecto = _proyecto;
    }

    /**
     * Método que comprueba la integridad del directorio HTML, que ha de estar
     * compuesto solo de prv,mixto y web
     *
     * @return Resultado de la comprobacion
     */
    public boolean compruebaIntegridadHTML() {

        boolean resultado = false;
        File directorio = new File(this.dirComprobacion + "html");

        File[] listFiles = directorio.listFiles();
        if (listFiles.length > 3) {
            return resultado;
        }
        String fileName;

        for (File f : listFiles) {
            fileName = f.getName();
            if (fileName.equalsIgnoreCase("prv") || fileName.equalsIgnoreCase("mixto") || fileName.equalsIgnoreCase("web")) {
                resultado = true;
            } else {
                resultado = false;
            }
        }
        return resultado;
    }

    /**
     * Metodo que comprueba la integridad de los directorios de servicio
     *
     * @return Resultado de la comprobacion
     */
    public boolean compruebaIntegridadServicios() {
        boolean resultado = false;
        String directorioServicios = dirComprobacion + "engine/xmlopt";
        File dirServicios = new File(directorioServicios);
        File[] listFiles = dirServicios.listFiles();

        if (listFiles.length > 1) {
            return resultado;
        }
        String file = null;
        for (File f : listFiles) {
            file = f.getName();

            if (file.equalsIgnoreCase(proyecto)) {
                resultado = true;
            }
        }
        return resultado;
    }

    /**
     *
     * @param proyecto Proyecto al cual pertenece el paquete que se va a generar
     * @param cliente Entorno concreto del paquete
     * @return Resultado de la comprobacion
     */


    public boolean compruebaIntegridadJavauser(String proyecto, String cliente) {
        boolean resultado = false;


    }
}
