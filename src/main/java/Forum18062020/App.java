package aula20200615;

public class App {

	public static void main(String[] args) {
		Student student = new Student(1000);
		Address enderecoLeo1 =  new Address("Av. Londrina",934,"Apt","Zona 08","Maringa","Parana",true);
		Address enderecoLeo2 =  new Address("Av. Tancredo Neves",1000,"apt 500","Centro","Ivaiporã","Parana",false);
		student.setFirstName("Leonardo");
		student.setLastName("Yoshii");
		student.setBirthDate("11/04/1995");
		student.addAddress(enderecoLeo1);
		student.addAddress(enderecoLeo2);


		Guarantor guarantor =  new Guarantor(2000);
		Address enderecoGuarantor1 = new Address("R. Leal",944,"b","Zona 157","Maringa","Parana",true);
		Address enderecoGuarantor2 = new Address("R. Leal",945,"a","Zona 157","Maringa","Parana",false);
		guarantor.setFirstName("Gustavo");
		guarantor.setLastName("Djonga");
		guarantor.setBirthDate("13/10/1980");
		guarantor.addAddress(enderecoGuarantor1);
		guarantor.addAddress(enderecoGuarantor2);


		Contract contract1 = new Contract(1,guarantor,student);
		student.addContrato(contract1);
		System.out.println("Student matriculado? "+student.statusStudent());


		Coordinator coordinator = new Coordinator(3000);
		Address enderecoCoordinator =  new Address("Rua Verde",420,"pla","Zona 45","Maringa","Parana",true);
		coordinator.setFirstName("Snoop");
		coordinator.setLastName("Dog");
		coordinator.setBirthDate("01/01/1950");
		coordinator.addAddress(enderecoCoordinator);


		Teacher teacher = new Teacher(4000);
		Address enderecoTeacher =  new Address("Rua Munra",420,"Luta","Forma","Maringa","Parana",true);
		teacher.setFirstName("Sabotage");
		teacher.setLastName("Conteudo");
		teacher.setBirthDate("02/02/1977");
		teacher.addAddress(enderecoTeacher);


		Course rap = new Course("rap",5000,coordinator);
		Class turma = new Class("turma do rap",1,rap);
		Subject versos =  new Subject(6000,"versos");
		Subject prosas =  new Subject(6001,"prosas");

		rap.addClass(turma);
		rap.addSubject(versos);
		rap.addSubject(prosas);
	}

}
