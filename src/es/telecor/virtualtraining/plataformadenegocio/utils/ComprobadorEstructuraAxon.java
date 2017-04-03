/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.telecor.virtualtraining.plataformadenegocio.utils;

import java.io.File;

/**
 * @author javi
 */
public class ComprobadorEstructuraAxon {

    private final String dirComprobacion;
    private final String proyecto;
    private final String tipo;

    public ComprobadorEstructuraAxon(String _dirComprobacion, String _proyecto, String _tipo) {
        dirComprobacion = _dirComprobacion;
        proyecto = _proyecto;
        tipo = _tipo;
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
            if (fileName.equals("prv") || fileName.equals("mixto") || fileName.equals("web")) {
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

            if (file.equals(proyecto)) {
                resultado = true;
            }
        }
        return resultado;
    }

    /**
     * @return Resultado de la comprobacion
     */


    public boolean compruebaIntegridadJavauser() {
        boolean resultado = false;

        // Si el proyecto es de tipo cliente
        if (this.tipo.equalsIgnoreCase("general")) {
            File dirJavauser = new File(this.dirComprobacion + "/engine/javauser/");
            File[] files = dirJavauser.listFiles();

            for (File f : files) {
                String nameFile = f.getName();

                if (f.isFile() && f.getName().equals("javauser.jar"))
                    resultado = true;
                else if (f.isDirectory() && (nameFile.equalsIgnoreCase("userexit") || nameFile.equalsIgnoreCase("energias") || nameFile.equalsIgnoreCase("vt")))
                    resultado = true;
                else
                    resultado = false;
            }
        } else {
            resultado = false;
        }

        return resultado;
    }
}
