
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
public class Manufactura extends Eslabon{
    private ArrayList<Farmer> granjas;
    private ArrayList<Producto> productos;
    

    public Manufactura(String nombre, String descripcion, Direccion direccion) {
        super(nombre, descripcion, direccion);
       
    }

    public Manufactura(ArrayList<Farmer> granjas, String nombre, String descripcion, Direccion direccion) {
        super(nombre, descripcion, direccion);
        this.granjas = granjas;
        this.productos = new ArrayList<>();
    }
    
    public void crearProducto(String nombre, ArrayList<Materia> materias, int numerolote){
        productos.add(new Producto(nombre,materias,numerolote,this));
    }

    public ArrayList<Farmer> getGranjas() {
        return granjas;
    }

    public ArrayList<Producto> getProductos() {
        return productos;
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
