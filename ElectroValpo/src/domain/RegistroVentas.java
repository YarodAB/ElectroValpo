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
}
