/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.severoochoa.SpringBootReto;

/**
 *
 * @author usuario
 */
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.zip.ZipEntry;
import java.util.zip.ZipOutputStream;

public class Zip {

    public static void main(String[] args) {
        // cadena que contiene la ruta donde están los archivos a comprimir
        String directorioZip = "D:\\Nomina\\";
        // cadena que contiene la ruta donde están los archivos comprimidos
        String directorioaZip = "D:\\";
        // ruta completa donde están los archivos a comprimir
        File carpetaComprimir = new File(directorioZip);

        // valida si existe el directorio
        if (carpetaComprimir.exists()) {
            // lista los archivos que hay dentro del directorio
            File[] ficheros = carpetaComprimir.listFiles();
            System.out.println("Número de ficheros encontrados: " + ficheros.length);

            // ciclo para recorrer todos los archivos a comprimir
            for (int i = 0; i < ficheros.length; i++) {
                System.out.println("Nombre del fichero: " + ficheros[i].getName());
                String extension = "";
                for (int j = 0; j < ficheros[i].getName().length(); j++) {
                    //obtiene la extensión del archivo
                    if (ficheros[i].getName().charAt(j) == '.') {
                        extension = ficheros[i].getName().substring(j, (int) ficheros[i].getName().length());
                        //System.out.println(extension);
                    }
                }
                try {
                    // crea un buffer temporal para ir poniendo los archivos a comprimir
                    ZipOutputStream zous = new ZipOutputStream(new FileOutputStream(directorioaZip + "Nomina.zip"));

                    //nombre con el que se va guardar el archivo dentro del zip
                    ZipEntry entrada = new ZipEntry(ficheros[i].getName());
                    zous.putNextEntry(entrada);

                    //System.out.println("Nombre del Archivo: " + entrada.getName());
                    System.out.println("Comprimiendo.....");
                    //obtiene el archivo para irlo comprimiendo
                    FileInputStream fis = new FileInputStream(directorioZip + entrada.getName());
                    int leer;
                    byte[] buffer = new byte[1024];
                    while (0 < (leer = fis.read(buffer))) {
                        zous.write(buffer, 0, leer);
                    }
                    fis.close();
                    zous.closeEntry();
                    zous.close();
                } catch (FileNotFoundException e) {
                    e.printStackTrace();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            System.out.println("Directorio de salida: " + directorioZip);
        } else {
            System.out.println("No se encontró el directorio..");
        }
    }
}
