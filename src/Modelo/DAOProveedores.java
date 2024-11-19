/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author vily0
 */
public class DAOProveedores {
    public Proveedores Insertar( String cedula_proveedor, String nombre_proveedor , 
            String correo_electronico ) {
    String transaccion = "INSERT INTO Proveedores (cedula_proveedor,nombre_proveedor,correo_electronico) VALUES ('"
        + cedula_proveedor + "', '"
        + nombre_proveedor + "', '"
        + correo_electronico + "' ) ";  
        
    
    if (new DataBase().Actualizar(transaccion) > 0) {
        return new Proveedores(cedula_proveedor, nombre_proveedor, correo_electronico);
    }
    return null;
}
    public int Actualizar(int id_proveedor, String cedula_proveedor, String nombre_proveedor , 
            String correo_electronico) {
        String transaccion = "UPDATE Proveedores SET cedula_proveedor='" 
        + cedula_proveedor + "', nombre_proveedor='" 
        + nombre_proveedor + "', correo_electronico='" 
        + correo_electronico + "' WHERE id_proveedor=" 
        + id_proveedor + ";";
                
    return new DataBase().Actualizar(transaccion);
}
    
    public List<Proveedores> ObtenerDatos() {
    String transaccion = "SELECT * FROM Proveedores";
   
    List<Map> registros = new DataBase().Listar(transaccion);
    List<Proveedores> Proveedores = new ArrayList<>(); 
    
    
    for (Map registro : registros) {
        Proveedores  pro= new Proveedores((int) registro.get("id_proveedor"),
            (String) registro.get("cedula_proveedor"),
            (String) registro.get("nombre_proveedor"),
            (String) registro.get("correo_electronico"));
        Proveedores.add(pro);
    }
    
    return Proveedores; 
}
    public int Eliminar(int id) {
    String transaccion = "DELETE FROM Proveedores WHERE id_proveedor=" + id + "";
    return new DataBase().Actualizar(transaccion);
}
}
