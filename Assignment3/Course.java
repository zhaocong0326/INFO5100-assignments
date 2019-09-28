import java.util.*;
/*Question1 - Question4*/
public class Course {
    private int courseId;
    private String courseName;
    private int maxCapacity;
    private int professorId;
    private int credits;
    int[] studentIds = new int[maxCapacity];
    private int index;

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        if (courseId <= 0) {
            System.out.println("courseId should not be negative or 0");
            return;
        }
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        if (courseName.length() < 10 || courseName.length() > 100) {
            System.out.println("courseName should not be less than 10 greater than 100");
            return;
        }
        this.courseName = courseName;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public int getProfessorId() {
        return professorId;
    }

    public void setProfessorId(int professorId) {
        if (String.valueOf(professorId).length() != 6) {
            System.out.println("ProfessorId should be a six digit integer");
            return;
        }
        this.professorId = professorId;

    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        if (credits < 1 || credits > 9) {
            System.out.println("should be a single digit but greater than 0");
            return;
        }
        this.credits = credits;
    }

    public int[] getStudentIds() {
        return studentIds;
    }

    public void setStudentIds(int[] studentIds) {
        this.studentIds = studentIds;
    }


    Course(int courseId) {
        this.courseId = courseId;

    }

    Course(int courseId, int professorId) {
        this(courseId);
        this.professorId = professorId;
    }

    Course (int courseId, int professorId, int credits) {
        this(courseId, professorId);
        this.credits = credits;
    }

    Course (int courseId, int professorId, int credits, int[] studentIds) {
        this(courseId, professorId, credits);
        this.studentIds = studentIds;
    }



    public void registerStudent(int studentId) {
        studentIds[index ++] = studentId;
    }

    public void display() {
        System.out.println("[courseId,courseName,maxCapacity,professorId,credits] = [" + courseId + "," + courseName + "," + maxCapacity + ","
                + professorId + "," + credits + "]");
    }


    public int[] removeDuplicates(int[] studentIds) {
        Set<Integer> set = new HashSet<>();
        for (int id : studentIds) {
            set.add(id);
        }
        int[] newStudentIds = new int[set.size()];
        int i = 0;
        for (int id : set) {
            newStudentIds[i++] = id;
        }
        return newStudentIds;
    }

    public int groupsOfStudents(int[] studentIds) {
        int count = 0;
        for (int i = 0; i < studentIds.length; i++) {
             for(int j = i+1; j < studentIds.length; j++) {
                 int sum = studentIds[i] + studentIds[j];
                 if (sum % 2 == 0) {
                    count ++;
                 }
             }
        }
        return count;
    }





}
