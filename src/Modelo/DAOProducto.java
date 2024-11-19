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
 * @author DELL 5590
 */

public class DAOProducto {
    public Producto Insertar( String nombre_producto, int cantidad_disponible,
            String presentacion, float precio) {
        String transaccion = "INSERT INTO Productos (nombre_producto,cantidad_disponible,presentacion, precio) VALUES('"
                + nombre_producto + "', '"
                + cantidad_disponible + "', '"
                + presentacion + "', '"
                + precio + "' ) ";
        //Llama al método Actualizar ubicando en DataBase.java
        if (new DataBase().Actualizar(transaccion)> 0){
            return new Producto(nombre_producto, cantidad_disponible, 
                    presentacion, precio);
        }
        return null;
        
      
    }
    public int Actualizar(int id_producto, String nombre_producto, 
            int cantidad_disponible, String presentacion, float precio) {
        
        String transaccion = "UPDATE productos set nombre_producto='"              
                + nombre_producto + "', cantidad_disponible= '"
                + cantidad_disponible + "', presentacion= '"
                + presentacion + "', precio='"
                + precio + "' WHERE id_producto="
                +id_producto;
        
        return new DataBase().Actualizar(transaccion);
    }
    public List ObtenerDatos(){
        String transaccion = "SELECT * FROM Productos";
        //Llama a método listar de DataBase.java
        List<Map> registros = new DataBase().Listar(transaccion);
        List<Producto> producto = new ArrayList(); //Arreglo de productos
        //Ciclo que recorre cada registro y los agrega al arreglo preoductos
        for (Map registro : registros) {   
               Producto pro = new Producto ((int) registro.get("id_producto"),
                         (String) registro.get("nombre_producto"),
                         (int) registro.get("cantidad_disponible"),
                         (String) registro.get("presentacion"),
                         (float) registro.get("precio"));
                                
               producto.add(pro);
        }   
        return producto;
             //Retorna todo los productos ubicados en la tabla BD
    }
    public int Eliminar(int id) {
    String transaccion = "DELETE FROM Productos WHERE id_producto=" + id + "";
    return new DataBase().Actualizar(transaccion);
}
}
