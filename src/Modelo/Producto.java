/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author DELL 5590
 */
public class Producto {
    private int id_producto;
    private String nombre_producto;
    private int cantidad_disponible;
    private String presentacion;
    private float precio;

    public Producto(String nombre_producto, int cantidad_disponible, String presentacion, float precio) {
        this.nombre_producto = nombre_producto;
        this.cantidad_disponible = cantidad_disponible;
        this.presentacion = presentacion;
        this.precio = precio;
    }

    public Producto(int id_producto, String nombre_producto, int cantidad_disponible, String presentacion, float precio) {
        this.id_producto = id_producto;
        this.nombre_producto = nombre_producto;
        this.cantidad_disponible = cantidad_disponible;
        this.presentacion = presentacion;
        this.precio = precio;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public String getNombre_producto() {
        return nombre_producto;
    }

    public void setNombre_producto(String nombre_producto) {
        this.nombre_producto = nombre_producto;
    }

    public int getCantidad_disponible() {
        return cantidad_disponible;
    }

    public void setCantidad_disponible(int cantidad_disponible) {
        this.cantidad_disponible = cantidad_disponible;
    }

    public String getPresentacion() {
        return presentacion;
    }

    public void setPresentacion(String presentacion) {
        this.presentacion = presentacion;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

   
    
}
