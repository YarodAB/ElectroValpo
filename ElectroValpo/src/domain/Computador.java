/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author Yarod
 */
public class Computador extends Producto {

    private String procesador;
    private String tipo;

    
    //Constructores
    public Computador() {
        super();
    }

    public Computador(String procesador, String tipo) {
        this.procesador = procesador;
        this.tipo = tipo;
    }

    public Computador(String nombre, int precio, String procesador, String tipo) {
        super(nombre, precio);
        this.procesador = procesador;
        this.tipo = tipo;
    }

    
    //Getters y Setters
    public String getProcesador() {
        return procesador;
    }

    public void setProcesador(String procesador) {
        this.procesador = procesador;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Computador{" + "procesador=" + procesador + ", tipo=" + tipo + '}';
    }
    
    
    
    //Metodos
    @Override
    public String descripcionDetallada() {
        String descripcion = "Computador: " + super.getNombre() + "\nPrecio sin IVA: " + "$" +super.getPrecio() + "\nProcesador: " + procesador + "\nTipo: " + tipo;
        return descripcion;
    }
    
}
