/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author vily0
 */
public class Proveedores {
   int id_proveedor;
   String cedula_proveedor;
   String nombre_proveedor;
   String correo_electronico;

    public Proveedores(int id_proveedor, String cedula_proveedor, String nombre_proveedor, String correo_electronico) {
        this.id_proveedor = id_proveedor;
        this.cedula_proveedor = cedula_proveedor;
        this.nombre_proveedor = nombre_proveedor;
        this.correo_electronico = correo_electronico;
    }

    public Proveedores(String cedula_proveedor, String nombre_proveedor, String correo_electronico) {
        this.cedula_proveedor = cedula_proveedor;
        this.nombre_proveedor = nombre_proveedor;
        this.correo_electronico = correo_electronico;
    }

    public int getId_proveedor() {
        return id_proveedor;
    }

    public void setId_proveedor(int id_proveedor) {
        this.id_proveedor = id_proveedor;
    }

    public String getCedula_proveedor() {
        return cedula_proveedor;
    }

    public void setCedula_proveedor(String cedula_proveedor) {
        this.cedula_proveedor = cedula_proveedor;
    }

    public String getNombre_proveedor() {
        return nombre_proveedor;
    }

    public void setNombre_proveedor(String nombre_proveedor) {
        this.nombre_proveedor = nombre_proveedor;
    }

    public String getCorreo_electronico() {
        return correo_electronico;
    }

    public void setCorreo_electronico(String correo_electronico) {
        this.correo_electronico = correo_electronico;
    }
   
}
