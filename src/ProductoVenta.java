
import java.io.*;
import java.util.ArrayList;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Estudiante
 */
public class ProductoVenta extends Producto{
    private float precio;
    private String codigoVenta;
    
    
    public ProductoVenta(String nombre, ArrayList<Materia> materias, int numLote, float precio,String codigoventa) throws IOException {
        super(nombre, materias, numLote);
        this.precio = precio;
        this.codigoVenta = codigoventa;
        File archivo = new File(nombre);
        if(!archivo.exists())
            archivo.createNewFile();
        PrintStream escritura =  new PrintStream(archivo);
        for (int i = 0; i < 10; i++) {
            if(nombre.equals(producto.))
        }
        escritura.print(nombre+","+materias.get(numLote));
        
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public float getPrecio() {
        return precio;
    }
    
   
}
