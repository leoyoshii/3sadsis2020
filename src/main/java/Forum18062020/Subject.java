package aula20200615;

import java.util.ArrayList;
import java.util.List;

public class Subject {
	private int idSubject;
	private String name;

	private List<Teacher> teachers =  new ArrayList<>();

	public Subject(int idSubject, String name) {
		this.idSubject = idSubject;
		this.name = name;
	}

	public int getIdSubject() {
		return idSubject;
	}
	public String getName() {
		return name;
	}
	public List<Teacher> getTeachers() {
		return teachers;
	}
	public void addTeacher(Teacher teacher) {
		teachers.add(teacher);
	}
}
