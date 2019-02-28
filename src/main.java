
import java.io.*;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Alejandro
 */
public class main {
    public static void main(String[] args) throws IOException {
        // Creacion de las granjas y los productos, y las manufacturas y los centros de distrubucion. 
        
    
        
        
}
        
  public static void venta(String nombre) throws FileNotFoundException, IOException{
           File archivo = new File("catalogo.cvs");
           BufferedReader bf = null; 
          bf = new BufferedReader(new FileReader(archivo));
          String linea = bf.readLine();
          while(linea!=null){
          String[] campos = linea.split(",");
            for (int i = 0; i < campos.length; i++) {
                 if(campos[0].equals(nombre)){
                     System.out.println("La cadena de produccion de su producto fue:   "+Arrays.toString(campos));
                 }
            }
        }  
    }       

}