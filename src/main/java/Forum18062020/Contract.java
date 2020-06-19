package aula20200615;

import java.util.ArrayList;
import java.util.List;

public class Contract {
	private int idContract;

	private Student student;
	private List<Guarantor> guarantors = new ArrayList<>();

	public Contract(int idContract, Guarantor guarantor, Student student) {
		this.idContract = idContract;
		this.student = student;
		this.guarantors.add(guarantor);
	}

	public int getIdContract() {
		return idContract;
	}
	public Student getStudent() {
		return student;
	}
	public List<Guarantor> getAvalista() {
		return guarantors;
	}
	public void addAvalista(Guarantor guarantor) {
		guarantors.add(guarantor);
	}
}
