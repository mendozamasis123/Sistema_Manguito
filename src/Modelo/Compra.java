/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import java.sql.Date;

/**
 *
 * @author DELL 5590
 */
public class Compra {
    private int id_compra;
    private Date  fecha_compra;

    public Compra(int id_compra, Date fecha_compra) {
        this.id_compra = id_compra;
        this.fecha_compra = fecha_compra;
    }

    public Compra(Date fecha_compra) {
        this.fecha_compra = fecha_compra;
    }

    public int getId_compra() {
        return id_compra;
    }

    public void setId_compra(int id_compra) {
        this.id_compra = id_compra;
    }

    public Date getFecha_compra() {
        return fecha_compra;
    }

    public void setFecha_compra(Date fecha_compra) {
        this.fecha_compra = fecha_compra;
    }
  
  
}