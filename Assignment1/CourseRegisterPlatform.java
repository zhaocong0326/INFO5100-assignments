public class CourseRegisterPlatform{
    /*
Student can
1. Login CourseWebsite
2. search courses
3. Register Courses
4. Review Courses Schedule
5. ReSchedule Courses
6. Drop Courses

----------------------------------------------------------------------------------------------------------------------
Class: Student
Data: StudentId, StudentName, major, List<Courses> registeredCourses, List<Time> availableTime
Behavior:

loginCourseWebsite() {
	// login the website
}

searchCourses() {
	List<Courses> courses = CourseRegisterService.search(courseName, major, keywords);
}

registerCourses() {
	CourseRegisterService.register(course, this);
}

DropCourses() {
	CourseRegisterService.Drop(course, this);
}

contactAdmin() {
	CourseRegisterService.sendEmail();
}

----------------------------------------------------------------------------------------------------------------------
Class: course
Data: CourseId, CourseName, courseTime, major, maxSeats, List<Students> registeredStudents
Behavior:

CheckMajorRelated(studentMajor) {
	// check if this course related to the student's major
	if (studentMajor.compareTo(course.major) == 1) {
		return true;
	} else {
		return false;
	}

}

CheckSeatsAvailable() {
	// check if there still seats available for this courses
	if (course.registeredStudents.size() < course.maxSeats) {
		return true;
	} else {
		return false;
	}
}



----------------------------------------------------------------------------------------------------------------------
Class: CourseRegisterService
Data:
Behavior:

search (CourseName courseName, Major major, Keywords keywords) {
	List<Courses> searchResult = new List<>();
	for (Courses c : courses) {
		if(c.courseName.contains(keyWords) || c.major.contains(keyWords)) {
			searchResult.add(c);
		}
	}
	return searchResult;
}

register (Course course, Student student) {

    //check if course is available for this student
    if(course.CheckMajorRelated(student.major) && course.CheckSeatsAvailable() && (course.time in student.availableTime) ) {
        student.registeredCourses.add(course);
        course.registeredStudents.add(student)
        studentAvailableTime.remove(course.time);
    }


}

drop(Course course, Student student) {
	if(currentDate < dropDeadLine) {
		student.registeredCourses.remove(course);
        course.registeredStudents.remove(student)
		studentAvailableTime.add(course.time);
	}
}

sendEmail() {
	emailSendApi(emailAddress);
}

----------------------------------------------------------------------------------------------------------------------
Class: CourseAdmin
Behavior:

addNewCourses() {
	// add new courses to the coursesCenter
}

deleteInvalidCourses() {
	//delete the invalid Courses
}

changeCoursesTime() {
	//reschedule Cources
}



    */
}
