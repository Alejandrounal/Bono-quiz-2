
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
    

    public ProductoVenta(float precio, String codigoVenta, String nombre, ArrayList<Materia> materias, int numLote, Manufactura nombreManufactura) {
        super(nombre, materias, numLote, nombreManufactura);
        this.precio = precio;
        this.codigoVenta = codigoVenta;
    }

    
    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public float getPrecio() {
        return precio;
    }
    
   
}
