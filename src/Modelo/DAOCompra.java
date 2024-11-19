/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import java.util.*;
import java.sql.Date;
/**
 *
 * @author DELL 5590
 */
public class DAOCompra {

    
    public Compra Insertar (Date  fecha_compra) {
     String transaccion = "INSERT INTO Compra (fecha_compra) VALUES('"
      + fecha_compra +"',')";  
     
     if (new DataBase ().Actualizar(transaccion) > 0) {
     return new Compra(fecha_compra);
}
     return null;

}
     public int Actualizar(int id, java.sql.Date fechacompra){
      
      String transaccion = "UPDATE Compra SET fecha_compra ='"
         + fechacompra + "',WHERE id_compra='"
         +id;
        
       return new DataBase().Actualizar(transaccion);
 }             
    public List obtenerDatos() {
             String transaccion = "SELECT * FROM Compra";
             List<Map> registros = (List<Map>) new DataBase ().Listar(transaccion);
             List<Compra> Compras = new ArrayList(); 
             
             for (Map registro : registros) {
                Compra com = new Compra ((int) registro.get("id_compra"),
                 (Date)registro.get("fecha_compra"));
                 Compras.add(com);
             }
         return Compras;
    }
   
    public int Eliminar(int id){
             String transaccion = "DELETE FROM Compra WHERE id_compra='"+ id +"'";
             
             return new DataBase().Actualizar(transaccion);
         }

    
    }