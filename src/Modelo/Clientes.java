/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author DELL 5590
 */
public class Clientes {
    int id_cliente;
    String nombre_cliente;
    String correo_electronico;
    int edad;

    public Clientes(int id_cliente, String nombre_cliente, String correo_electronico, int edad) {
        this.id_cliente = id_cliente;
        this.nombre_cliente = nombre_cliente;
        this.correo_electronico = correo_electronico;
        this.edad = edad;
    }

    public Clientes(String nombre_cliente, String correo_electronico, int edad) {
        this.nombre_cliente = nombre_cliente;
        this.correo_electronico = correo_electronico;
        this.edad = edad;
    }

    public int getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getNombre_cliente() {
        return nombre_cliente;
    }

    public void setNombre_cliente(String nombre_cliente) {
        this.nombre_cliente = nombre_cliente;
    }

    public String getCorreo_electronico() {
        return correo_electronico;
    }

    public void setCorreo_electronico(String correo_electronico) {
        this.correo_electronico = correo_electronico;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
}
