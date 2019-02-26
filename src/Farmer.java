
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
public class Farmer extends Eslabon {
    private ArrayList<Materia> materias;

    public Farmer(String nombre, String descripcion, Direccion direccion) {
        super(nombre, descripcion, direccion);
        this.materias = new ArrayList<>();
    }

    public ArrayList<Materia> getProductos() {
        return materias;
    }

    public void setProductos(ArrayList<Materia> productos) {
        this.materias = productos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

   
    
    
}
