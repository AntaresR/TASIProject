package tasiproject.adapters;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import tasiproject.models.Assistance;

/**
 * @author paolo
 */
public class RegisterAssistanceTableModel implements TableModel {

    List<Assistance> employeesAssistance = new ArrayList<>();
    String[] columnNames = new String[]{"Name", "Begin Date", "End Date", "Balance"};

    public void loadData(List<Assistance> todaysEmployeesAssistance) {
        employeesAssistance = todaysEmployeesAssistance;
    }

    public void findAndReplace(Assistance assistance) {
        for (int i = 0; i < employeesAssistance.size(); i++) {
            if (employeesAssistance.get(i).getEmployee().getName().
                    equals(assistance.getEmployee().getName())) {
                setValueAt(assistance.getEmployee().getName(), i, 0);
                setValueAt(assistance.getSchedule().getBeginTime(), i, 1);
                setValueAt(assistance.getSchedule().getEndTime(), i, 2);
                setValueAt(assistance.getBalance(), i, 3);
                break;
            }
        }
    }

    public Assistance getData(int selectedRow) {
        return employeesAssistance.get(selectedRow);
    }

    public List<Assistance> getData() {
        return employeesAssistance;
    }

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
    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex) {
            case 0:
                return String.class;
            case 1:
                return String.class;
            case 2:
                return String.class;
            case 3:
                return Double.class;
            default:
                return null;
        }
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
                return employeesAssistance.get(rowIndex).getSchedule().getBeginTime() == null
                        ? "Not yet registered" : "" + employeesAssistance.get(rowIndex).getSchedule().getBeginTime();
            case 2:
                return employeesAssistance.get(rowIndex).getSchedule().getEndTime() == null
                        ? "Not yet registered" : "" + employeesAssistance.get(rowIndex).getSchedule().getEndTime();
            case 3:
                return employeesAssistance.get(rowIndex).getBalance();
            default:
                return null;
        }
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                employeesAssistance.get(rowIndex).getEmployee().setName((String) aValue);
                break;
            case 1:
                employeesAssistance.get(rowIndex).getSchedule().setBeginTime((Date) aValue);
                break;
            case 2:
                employeesAssistance.get(rowIndex).getSchedule().setEndTime((Date) aValue);
                break;
            case 3:
                employeesAssistance.get(rowIndex).setBalance((double) aValue);
                break;
        }
    }

    @Override
    public void addTableModelListener(TableModelListener l) {
    }

    @Override
    public void removeTableModelListener(TableModelListener l) {
    }
}
