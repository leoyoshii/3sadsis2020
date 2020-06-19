package Forum18062020;

import java.util.ArrayList;
import java.util.List;

public class Teacher extends Person{
	private int idTeacher;

	private List<Subject> subjects = new ArrayList<>();

	public Teacher(int idTeacher) {
		this.idTeacher = idTeacher;
	}

	public int getIdTeacher() {
		return idTeacher;
	}
	public List<Subject> getSubjects() {
		return subjects;
	}
	public void addSubject(Subject subject) {
		subjects.add(subject);
	}
}
