package tasiproject.adapters;

import java.util.ArrayList;
import java.util.List;
import javax.swing.event.TableModelListener;
import javax.swing.table.DefaultTableModel;
import tasiproject.models.InconsistenceJustification;

/**
 * @author paolo
 */
public class JustifyInconsistenceTableModel extends DefaultTableModel {

    List<InconsistenceJustification> inconsistenceJustifications = new ArrayList<>();
    String[] columnNames = new String[]{"Name", "Begin Date", "End Date", "Balance"};

    public JustifyInconsistenceTableModel(int i) {
        inconsistenceJustifications.add(new InconsistenceJustification());
    }

    public void loadData(List<InconsistenceJustification> todaysInconsistenceJustifications) {
        inconsistenceJustifications = todaysInconsistenceJustifications;
        this.fireTableDataChanged();
    }

    public void findAndReplace(InconsistenceJustification inconsistenceJustification, int location) {
        inconsistenceJustifications.set(location, inconsistenceJustification);
        this.fireTableDataChanged();
    }

    public InconsistenceJustification getData(int selectedRow) {
        return inconsistenceJustifications.get(selectedRow);
    }

    public List<InconsistenceJustification> getData() {
        return inconsistenceJustifications;
    }

    @Override
    public int getRowCount() {
        return inconsistenceJustifications == null ? 0 : inconsistenceJustifications.size();
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
                return inconsistenceJustifications.get(rowIndex).getEmployee().getName();
            case 1:
                return inconsistenceJustifications.get(rowIndex).getMotive();
            case 2:
                return inconsistenceJustifications.get(rowIndex).getType();
            default:
                return null;
        }
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                inconsistenceJustifications.get(rowIndex).getEmployee().setName((String) aValue);
                break;
            case 1:
                inconsistenceJustifications.get(rowIndex).setMotive((String) aValue);
                break;
            case 2:
                inconsistenceJustifications.get(rowIndex).setType((int) aValue);
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
