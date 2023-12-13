/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eloyvscifpaviles.dto;

import java.util.Date;

/**
 *
 * @author eloyv
 */
public class Aemet {
       public Aemet (Date fecha, int temperaturaMinima, int temperaturaMaxima){
           this.fecha = fecha;
           this.temperaturaMinima = temperaturaMinima;
           this.temperaturaMaxima = temperaturaMaxima;
       }
       
       private Date fecha;
       private int temperaturaMinima;
       private int temperaturaMaxima;

    public Date getFecha() {
        return fecha;
    }

    public int getTemperaturaMinima() {
        return temperaturaMinima;
    }

    public int getTemperaturaMaxima() {
        return temperaturaMaxima;
    }
       
       
}
