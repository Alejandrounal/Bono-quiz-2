
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
public class CentroDistribucion extends Eslabon{
    private ArrayList<Manufactura> manufacturas;
    private ArrayList<Producto> productosManufactura;

    public CentroDistribucion(String nombre, String descripcion, Direccion direccion) {
        super(nombre, descripcion, direccion);
    }

    public ArrayList<Manufactura> getManufacturas() {
        return manufacturas;
    }

    public void setManufacturas(ArrayList<Manufactura> manufacturas) {
        this.manufacturas = manufacturas;
    }

    public ArrayList<Producto> getProductosManufactura() {
        return productosManufactura;
    }

    public void setProductosManufactura(ArrayList<Producto> productosManufactura) {
        this.productosManufactura = productosManufactura;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Direccion getDireccion() {
        return direccion;
    }
    
    
    
    
    
}
