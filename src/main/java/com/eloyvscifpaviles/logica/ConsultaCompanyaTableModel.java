/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eloyvscifpaviles.logica;

import com.eloyvscifpaviles.dto.Companya;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author eloyv
 */
public class ConsultaCompanyaTableModel extends AbstractTableModel{
    private String[] columnas = {"Prefijo", "Código", "Nombre", "Dirección", "Municipio", "Teléfono de información de Pasajero", "Teléfono de información de aeropuerto"};
    private List<Companya> companyas;
    
    public ConsultaCompanyaTableModel(List<Companya> companyas){
        this.companyas = companyas;
    }
    
     @Override
    public int getRowCount() {
        return companyas.size();
    }

    @Override
    public int getColumnCount() {
        return columnas.length;
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return companyas.get(rowIndex).getPrefijo();
            case 1:
                return companyas.get(rowIndex).getCodigo();
            case 2:
                return companyas.get(rowIndex).getNombre();
            case 3:
                return companyas.get(rowIndex).getDireccion();
            case 4:
                return companyas.get(rowIndex).getMunicipio();
            case 5:
                return companyas.get(rowIndex).getTlfPasajero();
            case 6:
                return companyas.get(rowIndex).getTlfAeropuerto();
        }
    
        return null;
    }
    
     @Override
    public String getColumnName(int column) {
        return columnas[column];
    }
}   

