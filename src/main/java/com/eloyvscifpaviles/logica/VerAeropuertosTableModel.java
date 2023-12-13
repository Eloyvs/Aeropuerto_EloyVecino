/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eloyvscifpaviles.logica;

import com.eloyvscifpaviles.dto.Aeropuerto;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author eloyv
 */
public class VerAeropuertosTableModel extends AbstractTableModel{
    private String[] columnas = {"Código", "Nombre", "Municipio"};
    private List<Aeropuerto> aeropuertos;
    
    public VerAeropuertosTableModel(List<Aeropuerto> aeropuertos){
        this.aeropuertos = aeropuertos;
    }
    
    @Override
    public int getRowCount() {
        return aeropuertos.size();
    }

    @Override
    public int getColumnCount() {
        return columnas.length;
    }
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {

        switch (columnIndex) {
            case 0:
                return aeropuertos.get(rowIndex).getCodigoIATA();
            case 1:
                return aeropuertos.get(rowIndex).getNombre();
            case 2:
                return aeropuertos.get(rowIndex).getCodigoMunicipio();
        }
        
        return null;
    }
    
    @Override
    public String getColumnName(int column) {
        return columnas[column];
    }
}
