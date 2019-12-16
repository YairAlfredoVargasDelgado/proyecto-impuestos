package com.poo.impuestovehicular.datos;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Archivo {
    
    private File file;
    
    private String ruta;
    
    public boolean recrearArchivo() {
        if (!file.delete()) {
            return false;
        }
        
        try {
            return file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public Archivo(String ruta) {
        this.ruta = ruta;
        if (file == null) {
            file = new File(ruta);
            if (!file.exists()) {
                try {
                    file.createNewFile();
                } catch (IOException ex) {
                    Logger.getLogger(Archivo.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }
    
    public Scanner abrirParaLectura() {
        try {
            if (getFile() == null) {
                setFile(new File(ruta));
            }
            return new Scanner(getFile());
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }
    
    public BufferedWriter abrirParaEscritura(boolean append) {
        try {
            if (getFile() == null) {
                setFile(new File(ruta));
            }
            return new BufferedWriter(new FileWriter(getFile(), append));
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }
    
}
