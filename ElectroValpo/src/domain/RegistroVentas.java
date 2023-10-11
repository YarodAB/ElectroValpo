/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

import java.util.ArrayList;

/**
 *
 * @author Yarod
 */
public class RegistroVentas {
    
    private ArrayList<Producto> productos = new ArrayList<>();

    public RegistroVentas() {
    }
    
    public boolean agregarProducto(Producto producto){
        return productos.add(producto);
    }
    
    public void listarProductos(){
        //Intentar que los productos se cuenten de manera automatica si se llaman igual
       int contador = 0;
        System.out.println("---LISTA DE PRODUCTOS---");
        for (Producto producto : productos) {
            System.out.println(contador++ +")" + producto.descripcionDetallada());
            System.out.println("--------------------------");
        }
    }
    
    public boolean buscarProducto(String nombreProducto){
        for (Producto producto : productos) {
            if(producto.getNombre().equalsIgnoreCase(nombreProducto)){
                producto.descripcionDetallada();
                return true;
            }
        }
        System.out.println("No encontrado");
        return false;
    }
}
