/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eloyvscifpaviles.logica;

import com.eloyvscifpaviles.dto.VueloBase;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author eloyv
 */
public class ConsultaVueloBaseTableModel extends AbstractTableModel {

    private String[] columnas = {"Código", "Aeropuerto origen", "Aeropuerto destino", "Número plazas", "Hora alida", "Hora llegada", "Días que opera"};
    private List<VueloBase> lstVuelos;

    public ConsultaVueloBaseTableModel(List<VueloBase> lstVuelos) {
        this.lstVuelos = lstVuelos;
    }

    @Override
    public int getRowCount() {
        return lstVuelos.size();
    }

    @Override
    public int getColumnCount() {
        return columnas.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {

        switch (columnIndex) {
            case 0:
                return lstVuelos.get(rowIndex).getCodigoVuelo();
            case 1:
                return lstVuelos.get(rowIndex).getCodAeroOrigen();
            case 2:
                return lstVuelos.get(rowIndex).getCodAeroDestino();
            case 3:
                return lstVuelos.get(rowIndex).getNumPlazas();
            case 4:
                return lstVuelos.get(rowIndex).getHoraSalida();
            case 5:
                return lstVuelos.get(rowIndex).getHoraLlegada();
            case 6:
                return lstVuelos.get(rowIndex).getDias();

        }

        return null;
    }

    @Override
    public String getColumnName(int column) {
        return columnas[column];
    }
}
