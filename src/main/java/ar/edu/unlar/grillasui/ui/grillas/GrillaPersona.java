/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ar.edu.unlar.grillasui.ui.grillas;

import ar.edu.unlar.grillasui.objects.Persona;
import java.util.ArrayList;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Administrador
 */

public class GrillaPersona extends AbstractTableModel{
    
    private ArrayList<Persona> listadoPersonas;

    public GrillaPersona(ArrayList<Persona> listadoPersonas) {
        this.listadoPersonas = listadoPersonas;
    }
    
            
    @Override
    public int getRowCount() {
        return listadoPersonas.size();
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        super.setValueAt(aValue, rowIndex, columnIndex); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getColumnName(int column) {
        switch(column){
            case 0: return "Name";
            case 1: return "Last Name";
            case 2: return "Tipo Documento";
            default: return "";
        } 
        
    }

    @Override
    public int getColumnCount() {
        return 3;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Persona p = listadoPersonas.get(rowIndex);
        
             switch(columnIndex){
              case 0: return p.getName();
              case 1: return p.getLastName();
              case 2: return p.getTipoDocumento();
              default: return "";
          }  //To change body of generated methods, choose Tools | Templates.
    }
    
}
