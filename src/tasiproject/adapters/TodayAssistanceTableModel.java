/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tasiproject.adapters;

import java.util.ArrayList;
import java.util.List;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import tasiproject.models.Assistance;

/**
 * @author paolo
 */
public class TodayAssistanceTableModel implements TableModel {

    List<Assistance> employeesAssistance = new ArrayList<>();
    String[] columnNames = new String[]{"Name", "Begin Date", "End Date", "Balance"};

    @Override
    public int getRowCount() {
        return employeesAssistance.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public String getColumnName(int columnIndex) {
        return columnNames[columnIndex];
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return employeesAssistance.get(rowIndex).getEmployee().getName() + " "
                        + employeesAssistance.get(rowIndex).getEmployee().getLastname() + " "
                        + employeesAssistance.get(rowIndex).getEmployee().getMaternalLastName();
            case 1:
                return employeesAssistance.get(rowIndex).getSchedule().getBeginTime();
            case 2:
                return employeesAssistance.get(rowIndex).getSchedule().getEndTime();
            case 3:
                return employeesAssistance.get(rowIndex).getBalance();
            default:
                return null;
        }
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        //TODO no data is to be put because its a visualizer. Done.
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return String.class;
    }

    @Override
    public void addTableModelListener(TableModelListener l) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void removeTableModelListener(TableModelListener l) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}