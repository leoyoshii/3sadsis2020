package aula20200615;

import java.util.ArrayList;
import java.util.List;

public class Course {
	private String description;
	private int idCourse;

	private Coordinator coordinator;
	private List<Class> classes = new ArrayList<>();
	private List<Subject> subjects = new ArrayList<>();

	public Course(String description, int idCourse, Coordinator coordinator) {
		this.description = description;
		this.idCourse = idCourse;
		this.coordinator = coordinator;
	}

	public String getDescription() {
		return description;
	}
	public int course() {
		return idCourse;
	}
	public Coordinator getCoordinator() {
		return coordinator;
	}
	public List<Class> getClasses() {
		return classes;
	}
	public List<Subject> getSubjects() {
		return subjects;
	}
	public void addClass(Class Class) {
		classes.add(Class);
	}
	public void addSubject(Subject subject) {
		subjects.add(subject);
	}
}
