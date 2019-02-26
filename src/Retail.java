
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
public class Retail extends Eslabon {
    private ArrayList<Producto> productos;
    private ArrayList<ProductoVenta> productosVenta;
    private ArrayList<CentroDistribucion> centrosDistribucion;

    

    public Retail(ArrayList<Producto> productos, ArrayList<CentroDistribucion> centrosDistribucion, String nombre, String descripcion, Direccion direccion) {
        super(nombre, descripcion, direccion);
        this.productos = productos;
        this.centrosDistribucion = centrosDistribucion;
        this.productosVenta = new ArrayList<>();
    }
    
    
    public void ponerVenta(float precio,String nombreProducto, String codigoVenta){
        for (int i = 0; i < productos.size(); i++) {
            if(nombre.equals(productos.get(i).nombre)){
                productosVenta.add(new ProductoVenta(productos.get(i).nombre,productos.get(i).getMaterias(),productos.get(i).numLote,precio,codigoVenta));
            }
        }
    }
    
    
    
    public void cambiarPrecio(float precio,String nombreProducto){
        for (int i = 0; i < productosVenta.size(); i++) {
            if(productosVenta.get(i).equals(nombreProducto)){
                productosVenta.get(i).setPrecio(precio);
            }
        }
    }
}
