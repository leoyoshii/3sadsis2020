package aula20200615;

import java.util.ArrayList;
import java.util.List;

public abstract class Person {
	private String firstName;
	private String lastName;
	private String birthDate;
	private List<Address> addresses = new ArrayList<>();


	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getBirthDate() {
		return birthDate;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public void setBirthDate(String birthDate) {
		this.birthDate = birthDate;
	}
	public void addAddress(Address e) {
		addresses.add(e);
	}

	@Override
	public String toString() {
		return "Person [firstName=" + firstName + ", lastName=" + lastName + ", birthDate=" + birthDate + ", addresses=" + addresses + "]";
	}











}
