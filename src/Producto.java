
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
public class Producto  {
    protected String nombre;
    protected int numLote;
    private ArrayList<Materia> materias;

    public Producto(String nombre, ArrayList<Materia> materias, int numLote) {
        this.nombre = nombre;
        this.materias = materias;
        this.numLote = numLote;
    }

    public String getNombre() {
        return nombre;
    }

    public ArrayList<Materia> getMaterias() {
        return materias;
    }
    
    
}
