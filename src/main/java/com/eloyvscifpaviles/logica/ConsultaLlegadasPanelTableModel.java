/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eloyvscifpaviles.logica;

import com.eloyvscifpaviles.dto.VueloDiario;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Eloyvs
 */
public class ConsultaLlegadasPanelTableModel extends AbstractTableModel{
    private String[] columnas = {"Código", "Fecha", "Hora Salida", "Hora Llegada", "Número Plazas", "Precio"};
    private List<VueloDiario> lstVuelos;

    public ConsultaLlegadasPanelTableModel(List<VueloDiario> lstVuelos) {
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
                return lstVuelos.get(rowIndex).getFechaVuelo();
            case 2:
                return lstVuelos.get(rowIndex).getHoraSalida();
            case 3:
                return lstVuelos.get(rowIndex).getHoraLlegada();
            case 4:
                return lstVuelos.get(rowIndex).getNumPlazas();
            case 5:
                return lstVuelos.get(rowIndex).getPrecioVuelo();
        }
        
        return null;
}
     @Override
    public String getColumnName(int column) {
        return columnas[column];
    }
}
