package aula20200615;

import java.util.ArrayList;
import java.util.List;

public class Student extends Person {

	private int ra;
	private boolean status = false;

	public Student(int ra) {
		this.ra = ra;
	}

	private Contract contrato;
	private List<Class> classes = new ArrayList<>();

	public boolean statusStudent() {
		return status;
	}

	public List<Class> getClasses() {
		return classes;
	}

	public void addContrato(Contract contract) {
		if (!status) {
			contrato = contract;
			status = true;
		}
	}

	public void addClass(Class class) {
		classes.add(class);
	}

}
