/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.eloyvscifpaviles.logica;
import com.eloyvscifpaviles.dto.Aemet;
import java.util.List;
import javax.swing.table.AbstractTableModel;
/**
 *
 * @author eloyv
 */
public class ComprobarTemperaturasTableModel extends AbstractTableModel{
    private List<Aemet> data;
    
    public ComprobarTemperaturasTableModel(List<Aemet> data) {
        this.data = data;
    }
    @Override
    public int getRowCount() {
        return data.size(); 
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Aemet aemet = data.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return aemet.getFecha(); 
            case 1:
                return aemet.getTemperaturaMinima();
            case 2:
                return aemet.getTemperaturaMaxima(); 
            
            default:
                return null;
        }
    }
    
}
