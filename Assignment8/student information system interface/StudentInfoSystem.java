import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

public class StudentInfoSystem implements TableModel{
	private Admain admain;

	public StudentInfoSystem(Admain manager) {
		this.admain = manager;
	}

	public int getRowCount() {
		return admain.getStudentNumber();
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
			return "Gender";
		}
	}

	public Class<?> getColumnClass(int columnIndex) {
		return String.class;
	}

	public boolean isCellEditable(int rowIndex, int columnIndex) {

		return false;
	}
	public void setValueAt(Object aValue, int rowIndex, int columnIndex) {

	}

	public void addTableModelListener(TableModelListener l) {
	}

	public void removeTableModelListener(TableModelListener l) {

	}

	public Object getValueAt(int rowIndex, int columnIndex) {
		Student student = admain.getStudents().get(rowIndex);
		if (columnIndex == 0) {
			return student.getId();
		} else if (columnIndex == 1){
			return student.getName();
		} else {
			return student.getGender();
		}
	}
	

}
