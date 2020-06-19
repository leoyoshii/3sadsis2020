package aula20200615;

import java.util.ArrayList;
import java.util.List;

public class Coordinator extends Person {
	private int idCoordinator;

	private List<Course> courses = new ArrayList<>();

	public Coordinator(int idCoordinator) {
		this.idCoordinator = idCoordinator;
	}

	public int getIdCoordinator() {
		return idCoordinator;
	}
	public List<Course> getCourse() {
		return courses;
	}
	public void addCourse(Course course) {
		courses.add(course);
	}
}
