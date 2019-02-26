
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

    public Manufactura(String nombre, String descripcion, Direccion direccion) {
        super(nombre, descripcion, direccion);
       
    }

    public Manufactura(ArrayList<Farmer> granjas, String nombre, String descripcion, Direccion direccion) {
        super(nombre, descripcion, direccion);
        this.granjas = granjas;
    }
    
    
}
