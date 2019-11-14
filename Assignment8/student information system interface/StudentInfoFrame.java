import javax.swing.*;
import java.awt.*;

public class StudentInfoFrame extends JFrame {
	private JLabel IdLabel, nameLabel, genderLable;
	private JTextField IdText, nameText;
	private JComboBox gender;
	private JButton add, delete;
	private JTable studentsInfoTable;
	private StudentInfoSystem  studentInfoSystem;
	private Admain manager;

	StudentInfoFrame() {
		create();
		Container con = getContentPane();
		add(con);
		visible();
		addListeners();

	}

	public static void main(String[] args) {
		new StudentInfoFrame();
	}

	public void create() {
		IdLabel = new JLabel("ID : ");
		nameLabel = new JLabel("Name : ");
		genderLable = new JLabel("Gender: ");

		add = new JButton("Add");
		delete = new JButton("Delete");

		IdText = new JTextField(10);
		nameText = new JTextField(10);
		gender = new JComboBox(new String[] { "Male", "Famale"});

		manager = new Admain();
		studentInfoSystem = new StudentInfoSystem(manager);

		studentsInfoTable = new JTable(studentInfoSystem);
	}

	public void add(Container con) {
		BorderLayout borderLayout = new BorderLayout();
		con.setLayout(borderLayout);
		con.add(new JScrollPane(studentsInfoTable), "South");
		addMainComponent(con);

	}
	
	public void addMainComponent(Container con) {
		JPanel panel = new JPanel();
		panel.add(IdLabel);
		panel.add(IdText);
		panel.add(nameLabel);
		panel.add(nameText);
		panel.add(genderLable);
		panel.add(gender);
		panel.add(add);
		panel.add(delete);
		con.add(panel);

	}
	
	public Student getTextContent(Student student) {
		student.setId(IdText.getText());
		student.setName(nameText.getText());
		student.setGender(gender.getSelectedItem().toString());
		return student;
	}
	
	public void add () {
		Student student = new Student();
		manager.add(getTextContent(student));
		studentsInfoTable.updateUI();
		JOptionPane.showMessageDialog(this,  student.getId() + "  " +  student.getName() +  "  " + student.getGender() + " add successfully!");
	}

	public void delete() {
		Student student = new Student();
		manager.delete(getTextContent(student).getId());
		studentsInfoTable.updateUI();
		JOptionPane.showMessageDialog(this, student.getId() + "  "  + student.getName() + "  " + " delete successfully!");
	}

	public void addListeners() {
		add.addActionListener((e) -> add ());
		delete.addActionListener((e) -> delete ());
	}

	public void visible() {
		setSize(800, 600);
		setVisible(true);
	}

	
}
