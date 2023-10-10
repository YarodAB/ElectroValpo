/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package domain;

/**
 *
 * @author Yarod
 */
public class Telefono extends Producto {
    private String marca;
    private String modelo;

    
    //Constructor telefono
    public Telefono(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    //Constructor vacio
    public Telefono() {
        super();
    }

    //Constructor producto
    public Telefono(String nombre, int precioSinIva, String marca, String modelo) {
        super(nombre, precioSinIva);
        this.marca = marca;
        this.modelo = modelo;
    }

    
    //Getters y Setters
    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Telefono{" + super.toString() + "marca=" + marca + ", modelo=" + modelo + '}';
    }
    
    
    //Metodos
    @Override
    public String descripcionDetallada() {
        return "Telefono: " + super.getNombre() + "\nPrecio sin IVA: " + "$" +super.getPrecio() + "\nMarca: " + marca + "\nModelo: " + modelo;
    }
    
}
