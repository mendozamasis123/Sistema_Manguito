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
public class DAOClientes {
    public Clientes Insertar(String nombre_cliente, String correo_electronico , 
            int edad ) {
    String transaccion = "INSERT INTO Clientes (nombre_cliente,correo_electronico,edad) VALUES ('"
        + nombre_cliente + "', '"
        + correo_electronico + "', '"
        + edad + "' ) ";  
        
    
    if (new DataBase().Actualizar(transaccion) > 0) {
        return new Clientes(nombre_cliente, correo_electronico, edad);
    }
    return null;
}
    public int Actualizar(int id_cliente, String nombre_cliente, String correo_electronico , 
            int edad) {
        String transaccion = "UPDATE Clientes SET nombre_cliente='" 
        + nombre_cliente + "', correo_electronico='" 
        + correo_electronico + "', edad='" 
        + edad + "' WHERE id_cliente=" 
        + id_cliente + ";";
                
    return new DataBase().Actualizar(transaccion);
}
    public List<Clientes> ObtenerDatos() {
    String transaccion = "SELECT * FROM Clientes";
   
    List<Map> registros = new DataBase().Listar(transaccion);
    List<Clientes> Clientes = new ArrayList<>(); 
    
    
    for (Map registro : registros) {
        Clientes  Cli= new Clientes((int) registro.get("id_cliente"),
            (String) registro.get("nombre_cliente"),
            (String) registro.get("correo_electronico"),
            (int) registro.get("edad"));
        Clientes.add(Cli);
    }
    
    return Clientes; 
}
    public int Eliminar(int id) {
    String transaccion = "DELETE FROM Clientes WHERE id_cliente=" + id + "";
    return new DataBase().Actualizar(transaccion);
}
}

