/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.telecor.virtualtraining.plataformadenegocio.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

/**
 *
 * @author javi
 */
public class Zipper {

    public Zipper() {
    }

    public void generarZip(String originPath, String fileName, String destinationPath) throws FileNotFoundException {

        FileOutputStream fos = new FileOutputStream(new File(destinationPath + fileName));
        ZipOutputStream zos = new ZipOutputStream(fos);
        File origen = new File(originPath);
        File[] lista = origen.listFiles();

        try {
            for (File f : lista) {
                FileInputStream fis = new FileInputStream(f);
                ZipEntry entrada = new ZipEntry(f.getName());
                zos.putNextEntry(entrada);
            }
        } catch (IOException ex) {
            
        } finally {
            try {
                zos.close();
                fos.close();
            } catch (IOException ex) {
                Logger.getLogger(Zipper.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
