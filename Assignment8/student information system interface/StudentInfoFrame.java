import javax.swing.*;
import java.awt.*;

public class StudentInfoFrame extends JFrame {
	private JLabel IdLabel, nameLabel, genderLable;
	private JTextField IdText, nameText;
	private JComboBox genderText;
	private JButton add, delete;
	private JTable studentsInfoTable;
	private StudentInfoSystem  model;
	private StudentsManager studentManager;

	StudentInfoFrame() {
		create();
		Container con = getContentPane();
		add(con);
		addListeners();
		visible();
	}

	public void create() {
		IdLabel = new JLabel("ID : ");
		nameLabel = new JLabel("Name : ");
		genderLable = new JLabel("Gender: ");

		add = new JButton("Add");
		delete = new JButton("Delete");

		IdText = new JTextField(10);
		nameText = new JTextField(10);
		genderText = new JComboBox(new String[] { "Male", "Famale"});

		try {
			studentManager = new StudentsManager();
			model = new StudentInfoSystem(studentManager);
		} catch (Exception e) {
		}

		studentsInfoTable = new JTable(model);
	}

	public void add(Container con) {
		BorderLayout b = new BorderLayout();
		con.setLayout(b);
		con.add(new JScrollPane(studentsInfoTable), "South");
		addComponent(con);

	}
	
	public void addComponent(Container con) {
		JPanel p = new JPanel();
		p.add(IdLabel);
		p.add(IdText);
		p.add(nameLabel);
		p.add(nameText);
		p.add(genderLable);
		p.add(genderText);
		p.add(add);
		p.add(delete);
		con.add(p, BorderLayout.NORTH);

	}
	
	public Student getText(Student student) {
		student.setId(IdText.getText());
		student.setName(nameText.getText());
		student.setGender(genderText.getSelectedItem().toString());
		return student;
	}
	
	public void add () {
		Student student = new Student();
		student = getText(student);
		studentManager.add(student);
		studentsInfoTable.updateUI();
		JOptionPane.showMessageDialog(this,  student.getId()  + student.getName() + "add successfully!");
	}
	

	
	public void delete() {
		Student student = new Student();
		student = getText(student);
		studentManager.delete(student.getId());
		studentsInfoTable.updateUI();
		JOptionPane.showMessageDialog(this, student.getId()  + student.getName() + "delete successfully!");
	}

	public void addListeners() {
		add.addActionListener((e) -> add ());
		delete.addActionListener((e) -> delete ());
	}

	public void visible() {
		setSize(600, 600);
		setVisible(true);
	}

	
	public static void main(String[] args) {
		new StudentInfoFrame();
	}
	
	
}
