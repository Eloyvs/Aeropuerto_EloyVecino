/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eloyvscifpaviles.dto;

import com.opencsv.bean.CsvDate;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author eloyv
 */
public class VueloDiario {
    private String codigoVuelo;
    @CsvDate
    private Date fechaVuelo;
    @CsvDate
    private  Date horaSalida;
    @CsvDate
    private Date horaLlegada;
    int numPlazas;
    int precioVuelo;
    String codAeroOrigen;
    String codAeroDestino;
    

    public String getCodigoVuelo() {
        return codigoVuelo;
    }

    public void setCodigoVuelo(String codigoVuelo) {
        this.codigoVuelo = codigoVuelo;
    }

    public Date getFechaVuelo() {
        return fechaVuelo;
    }

    public void setFechaVuelo(Date fechaVuelo) {
        this.fechaVuelo = fechaVuelo;
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

    public int getNumPlazas() {
        return numPlazas;
    }

    public void setNumPlazas(int numPlazas) {
        this.numPlazas = numPlazas;
    }

    public int getPrecioVuelo() {
        return precioVuelo;
    }

    public void setPrecioVuelo(int precioVuelo) {
        this.precioVuelo = precioVuelo;
    }

    public String getCodAeroOrigen() {
        return codAeroOrigen;
    }

    public void setCodAeroOrigen(String codAeroOrigen) {
        this.codAeroOrigen = codAeroOrigen;
    }

    public String getCodAeroDestino() {
        return codAeroDestino;
    }

    public void setCodAeroDestino(String codAeroDestino) {
        this.codAeroDestino = codAeroDestino;
    }

    public VueloDiario(String codigoVuelo, Date fechaVuelo, Date horaSalida, Date horaLlegada, int numPlazas, int precioVuelo) {
        this.codigoVuelo = codigoVuelo;
        this.fechaVuelo = fechaVuelo;
        this.horaSalida = horaSalida;
        this.horaLlegada = horaLlegada;
        this.numPlazas = numPlazas;
        this.precioVuelo = precioVuelo;
    }
    
    public VueloDiario(){};
}
