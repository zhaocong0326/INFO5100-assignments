import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

public class StudentInfoSystem implements TableModel{
	private StudentsManager manager;

	public StudentInfoSystem(StudentsManager manager) {
		this.manager = manager;
	}

	public int getRowCount() {
		return manager.getStudentCount();
	}

	public int getColumnCount() {
		return 3;
	}

	public String getColumnName(int columnIndex) {
		if (columnIndex == 0) {
			return "Id";
		} else if (columnIndex == 1){
			return "Name";
		} else {
			return "gender";
		}
	}

	public Class<?> getColumnClass(int columnIndex) {
		return String.class;
	}

	public boolean isCellEditable(int rowIndex, int columnIndex) {

		return false;
	}

	public Object getValueAt(int rowIndex, int columnIndex) {
		Student s = manager.getStudents().get(rowIndex);
		if (columnIndex == 0) {
			return s.getId();
		} else if (columnIndex == 1){
			return s.getName();
		} else {
			return s.getGender();
		}

	}

	public void setValueAt(Object aValue, int rowIndex, int columnIndex) {

	}

	public void addTableModelListener(TableModelListener l) {
	}

	public void removeTableModelListener(TableModelListener l) {

	}

}
