import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class StudentsManager {
	private Map<String, Student> map = new HashMap<String, Student>();

	public void add(Student student) throws RuntimeException {
		String studentId = student.getId();
		if (map.get(studentId) == null) {
			map.put(student.getId(), student);
		} 
	}


	public void delete (String id) {
		map.remove(id);
	}


	public int getStudentCount() {
		return map.size();
	}


	public List<Student> getStudents() {
		return new ArrayList<Student>(map.values());
	}
}
