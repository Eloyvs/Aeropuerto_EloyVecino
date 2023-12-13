/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eloyvscifpaviles.dto;

import com.eloyvscifpaviles.logica.LogicaNegocio;
import com.opencsv.bean.CsvDate;
import java.util.Date;

/**
 *
 * @author eloyv
 */
public class VueloBase {
    private String codigoVuelo;
    //private Aeropuerto aeropuertoOrigen;
   // private Aeropuerto aeropuertoDestino;
    private String codAeroOrigen;
    private String codAeroDestino;
    private int numPlazas;
    @CsvDate
    private Date horaSalida;
    @CsvDate
    private Date horaLlegada;
    private String dias;

    public String getCodigoVuelo() {
        return codigoVuelo;
    }

    public void setCodigoVuelo(String codigoVuelo) {
        this.codigoVuelo = codigoVuelo;
    }

    /*public Aeropuerto getAeropuertoOrigen() {
        return aeropuertoOrigen;
    }*/

    /*public void setAeropuertoOrigen(Aeropuerto aeropuertoOrigen) {
        this.aeropuertoOrigen = aeropuertoOrigen;
    }*/

    /*public Aeropuerto getAeropuertoDestino() {
        return aeropuertoDestino;
    }

    public void setAeropuertoDestino(Aeropuerto aeropuertoDestino) {
        this.aeropuertoDestino = aeropuertoDestino;
    }*/

    public int getNumPlazas() {
        return numPlazas;
    }

    public void setNumPlazas(int numPlazas) {
        this.numPlazas = numPlazas;
    }

    public Date getHoraSalida() {
        return horaSalida;
    }

    public void setHoraSalida(Date horaSalida) {
        this.horaSalida = horaSalida;
    }

    public Date getHoraLlegada() {
        return horaLlegada;
    }

    public void setHoraLlegada(Date horaLlegada) {
        this.horaLlegada = horaLlegada;
    }

    public String getDias() {
        return dias;
    }

    public void setDias(String dias) {
        this.dias = dias;
    }

    public String getCodAeroOrigen() {
        return codAeroOrigen;
    }

    public void setCodAeroOrigen(String codAeroOrigen) {
        this.codAeroOrigen = codAeroOrigen;
    }
    
    /*public void setCodAeroOrigen(String codAeroOrigen) {
        this.codAeroOrigen = codAeroOrigen;
        this.aeropuertoOrigen = LogicaNegocio.getAeropuertoByCodigoIATA(codAeroOrigen);
    }*/

    public String getCodAeroDestino() {
        return codAeroDestino;
    }

    public void setCodAeroDestino(String codAeroDestino) {
        this.codAeroDestino = codAeroDestino;
    }
    
    /*public void setCodAeroDestino(String codAeroDestino) {
        this.codAeroDestino = codAeroDestino;
        this.aeropuertoDestino = LogicaNegocio.getAeropuertoByCodigoIATA(codAeroDestino);
    }*/
    
    

   /* 
    Guardar objetos aeropuerto en el csv da problemas
    public VueloBase(String codigoVuelo, Aeropuerto aeropuertoOrigen, Aeropuerto aeropuertoDestino, int numPlazas, Date horaSalida, Date horalLlegada, String dias) {
        this.codigoVuelo = codigoVuelo;
        this.aeropuertoOrigen = aeropuertoOrigen;
        this.aeropuertoDestino = aeropuertoDestino;
        this.numPlazas = numPlazas;
        this.horaSalida = horaSalida;
        this.horaLlegada = horalLlegada;
        this.dias = dias;
    }*/
    
    /*
    Me fallaba el csv al guardar objetos aeropuertos así que intenté esta opción que me pareció guapísima
    pero al tener atributos que son objetos aeropuerto seguía con el mismo error y no fui capaz de repararlo
    
    public VueloBase(String codigoVuelo, String codAeroOrigen, String codAeroDestino, int numPlazas, Date horaSalida, Date horalLlegada, String dias) {
        this.codigoVuelo = codigoVuelo;
        this.codAeroOrigen = codAeroOrigen;
        this.codAeroDestino = codAeroDestino;
        this.numPlazas = numPlazas;
        this.horaSalida = horaSalida;
        this.horaLlegada = horalLlegada;
        this.dias = dias;
        
        this.aeropuertoDestino = LogicaNegocio.getAeropuertoByCodigoIATA(codAeroDestino);
        this.aeropuertoOrigen = LogicaNegocio.getAeropuertoByCodigoIATA(codAeroOrigen);
    }*/
    
    public VueloBase(){};

    public VueloBase(String codigoVuelo, String codAeroOrigen, String codAeroDestino, int numPlazas, Date horaSalida, Date horaLlegada, String dias) {
        this.codigoVuelo = codigoVuelo;
        this.codAeroOrigen = codAeroOrigen;
        this.codAeroDestino = codAeroDestino;
        this.numPlazas = numPlazas;
        this.horaSalida = horaSalida;
        this.horaLlegada = horaLlegada;
        this.dias = dias;
    }
    
    
    
}
