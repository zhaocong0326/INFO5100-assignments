import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Admain {
	private Map<String, Student> map = new HashMap<String, Student>();

	public void add(Student student) throws RuntimeException {
		String id = student.getId();
		Student s = map.get(id);
		if (s == null) {
			map.put(student.getId(), student);
		}
	}

	public void delete (String id) {
		map.remove(id);
	}

	public List<Student> getStudents() {
		List<Student> students = new ArrayList<>(map.values());
		return students;
	}

	public int getStudentNumber() {
		int studentNumber = map.size();
		return studentNumber;
	}
}
