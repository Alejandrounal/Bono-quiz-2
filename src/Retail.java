
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
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
    
    
    public void ponerVenta(float precio,String nombreProducto, String codigoVenta) throws IOException{
        File arhivo = new File("catalogo.csv");
        PrintStream salida = new PrintStream(arhivo);
        for (int i = 0; i < productos.size(); i++) {
            if(nombre.equals(productos.get(i).nombre)){
               productosVenta.add(new ProductoVenta(precio,codigoVenta, productos.get(i).nombre,productos.get(i).getMaterias(),productos.get(i).numLote,productos.get(i).getnombreManufactura()));
               String direct = direccion.getLatitud()+"  "+direccion.getLongitud();
               String centros = null;
                for (int j = 0; j < centrosDistribucion.size() ; j++) {
                    String direcc = centrosDistribucion.get(j).direccion.getLatitud()+"  "+centrosDistribucion.get(j).direccion.getLongitud(); 
                    centros += centrosDistribucion.get(j).nombre+"  "+centrosDistribucion.get(j).descripcion+"  "+direcc;
                }
               String direcManufactura = null;
               direcManufactura = productos.get(i).getnombreManufactura().direccion.getLatitud()+"  "+productos.get(i).getnombreManufactura().direccion.getLongitud();
               String materias = null;
                for (int j = 0; j < productos.get(i).getMaterias().size(); j++) {
                    materias += productos.get(i).getMaterias().get(j).getNombre()+"    ";
                }
               salida.println(productos.get(i).nombre+","+productos.get(i).numLote+","+this.nombre+","+this.descripcion+","+direct+","+centros+","+productos.get(i).getnombreManufactura().nombre+","+direcManufactura+","+productos.get(i).getnombreManufactura().getDescripcion()+","+materias);
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
