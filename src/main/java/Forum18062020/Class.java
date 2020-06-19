package Forum18062020;

import java.util.ArrayList;
import java.util.List;

public class Class {
	private int idClass;
	private String description;

	private Course course;
	private List<Student> students = new ArrayList<>();

	public Class(String description, int idClass, Course course) {
		this.description = description;
		this.idClass = idClass;
		this.course = course;
	}

	public String getDescription() {
		return description;
	}
	public int getidClass() {
		return idClass;
	}
	public Course getCourse() {
		return course;
	}
	public List<Student> getStudent() {
		return students;
	}
	public void addStudent(Student student) {
		students.add(student);
	}
}
